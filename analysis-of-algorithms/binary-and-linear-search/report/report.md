
# Binary Search Algorithm -vs- Linear Search Algorithm

> An analysis of the complexities of binary and linear search algorithms.

## test design:

**Sorting:** Before the tests are run, we are ordering the list used. This
helps ensure the cost of sorting the list is **not** added in tests against
binary search algorithm.

**Rounds:** The tests are run repeatedly for more time-measurement accuracy.
If, say, the rounds are set to 10, the tests are run 10 times for each
algorithm using the same list items in the same order and same function
parameters.


## test results:

In one case, where we looked for a non-existent element:

```bash
⇒ java -jar target/application-0.0.0.jar john
 # load application settings
 # load data from database
 # running binary search
 # running linear search

 >>> Binary:  183744 ns (10 rounds)
 >>> Linear:  1016220 ns (10 rounds)
 >>> Binary search is faster than Linear search

User not found!
```

In another case, where the target item is in the very first positions
of the list:

```bash
⇒ java -jar target/application-0.0.0.jar aimee
 # load application settings
 # load data from database
 # running binary search
 # running linear search

 >>> Binary:  79957 ns (10 rounds)
 >>> Linear:  33576 ns (10 rounds)
 >>> Binary search is slower than Linear search


User found:
  First Name:    Aimee
  Last Name:     Bianca
  Phone Number:  1-209-636-7216
  Email Address: feugiat@nisi.co.uk
  Home Address:  7939 Aliquet Ave
```

In another case, where the target item is in middle positions of the list:

```bash
⇒ java -jar target/application-0.0.0.jar levi
 # load application settings
 # load data from database
 # running binary search
 # running linear search

 >>> Binary:  71610 ns (10 rounds)
 >>> Linear:  670691 ns (10 rounds)
 >>> Binary search is faster than Linear search

User found:
  First Name:    Levi
  Last Name:     Savannah
  Phone Number:  1-161-191-5934
  Email Address: mollis.dui.in@aliquameros.co.uk
  Home Address:  Ap #412-2215 Nisi Ave
```

In another case, where the target item is in the very last positions of
the list:

```bash
⇒ java -jar target/application-0.0.0.jar sheila
 # load application settings
 # load data from database
 # running binary search
 # running linear search

 >>> Binary:  85760 ns (10 rounds)
 >>> Linear:  766316 ns (10 rounds)
 >>> Binary search is faster than Linear search

User found:
  First Name:    Sheila
  Last Name:     Byron
  Phone Number:  1-544-711-7589
  Email Address: vulputate@Morbinon.org
  Home Address:  260-6637 Enim Av.
```


## conclusion:

<table>
    <thead>
        <tr>
            <td></td>
            <td><strong>Best-case scenario</strong></td>
            <td><strong>Worst-case scenario</strong></td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Linear search</td>
            <td>O(1)</td>
            <td>O(n)</td>
        </tr>
        <tr>
            <td>Binary search</td>
            <td>O(1)</td>
            <td>O(log n)</td>
        </tr>
    </tbody>
</table>

For the **linear search** algorithm, the best-case scenario happens when the target
item happens to be in the first position of the list. The worst-case scenario
happens when the target item is at the last position of the list. *We are
assuming the list is traversed starting from the beginning of the list.*

For the **binary search** algorithm, the Best-case scenario happens when the target
item happens to be in the exact middle position of the list. The worst-case scenario
happens when the target item is at either the first or last position of the list. *We
are assuming that any integer division involved in finding the middle index results to
the position of the target item*

In reality, items tend to be sparse, therefore the requirement to find a list item in
random positions is rather important. In this aspect, we would rather choose binary
search over linear search.

However, we need to sort the lists before executing a binary search. This cost must be
accounted for one way or the other. But this cost might be worth it in cases where
several searches need to be executed on the list. Therefore, the need to execute
many searches justifies the cost of sorting the list.

In summary, *with the assumption that the cost of execution of either algorithm is equal, say, k*:

  * Linear search, where the target item occurs in the very first positions, is faster than binary search.
  * Binary search, where the target item occurs in the middle of the list, is faster than linear search.
  * Binary search, where the target element is at the very last positions of the list, is faster than linear search.
  * Cost of linear search grows faster than that of binary search, with regard to problem size.
