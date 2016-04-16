
# Reentrancy

## test design:

**Signals** are used to simulate interrupts, as their handlers are executed
immediately without waiting for the current subroutine to completed.

The test comprises of a subroutine that increments a static variable, hereby
referred to as `external` and returns its value. In a more practical
demonstration, the subroutine would do some more involving computation
using this variable.

This subroutine is invoked **first** by `main()` and interrupted midway by an
interrupt, which invokes the **same** subroutine a **second** time.

The first invocation should return a result of `1` in `main()` and
`2` in the interrupt, for the subroutine to be deemed to have yielded
correct values.


## results:

Demonstrating a non-reentrant subroutine:

```
$ ./app/non-reentrant.c
main: invoking non_reentrant()
1: incremented external to 1
1: [interrupt] pausing execution

interrupt: invoking non_reentrant()
2: incremented external to 2
interrupt: result = 2

1: [interrupt] resuming execution
main: result = 2
```

Output from `main()` is prefixed with `main: `, that from the interrupt
handler with `interrupt: `, that from the first invocation with `1: ` and
that from the second invocation with `2: `.

The function is non-reentrant as its view of the external variable
changed during the interrupt, which would lead to an incorrect value.
Execution of the first invocation resumes only to find the value changed.
The result from the first invocation, in main(), was expected to be `1`
but instead is `2`.

A reentrant version of the program above:

```
$ ./app/reentrant.c
main: invoking reentrant()
1: incremented external to 1
1: saved external's value to a local variable
1: [interrupt] pausing execution

interrupt: invoking reentrant()
2: incremented external to 2
2: saved external's value to a local variable
2: exiting while local variable = '2' and external variable = '2'
interrupt: result = 2

1: [interrupt] resuming execution
1: exiting while local variable = '1' and external variable = '2'
main: result = 1
```

This version has the `reentrant` function read the `external` variable's
value into a local variable. Any interruption that causes a change in
the value of the external variable does **not** affect the interrupted execution
as it has its own private copy in its scope. **Note**: we need to use the
type `sig_atomic_t` for our external variable to ensure any assignment is
atomic; can not be interrupted.

