
# Reentrancy

## test design:

**Signals** are used to simulate interrupts, as their handlers are executed
immediately without waiting for the current subroutine to completed.


## results:

Demonstrating a non-reentrant subroutine:

```bash
$ ./app/non-reentrant.c
invoking non_reentrant function in main()
1:[before interrupt] external = 1
invoking non_reentrant() in interrupt
2:[before interrupt] external = 2
2:[after interrupt] external = 2
1:[after interrupt] external = 2
```

As shown above the `non_reentrant` function is interrupted during the
first execution. It's output is prefixed with `1`. It is interrupted by
a second invocation, whose output is prefixed with `2`. If the function
was reentrant, the `external` variable would have equaled `1` after
the first execution was resumed.

A reentrant version of the program above:

```bash
$ ./app/reentrant.c
invoking non_reentrant function in main()
1:[before interrupt] external = 1
invoking non_reentrant() in interrupt
2:[before interrupt] external = 2
2:[after interrupt] external = 2
1:[after interrupt] external = 1
```

This version has the `non_reentrant` function read the `external` variable's
value into a local variable. Any interruption that causes a change in
the value of the external variable does **not** affect the interrupted execution
as it has its own private copy in its scope.

