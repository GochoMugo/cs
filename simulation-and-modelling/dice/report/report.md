
# dice simulation

> Simulate a 6-sided dice


## design:

### randomness:

In each roll, a random number is generated using `Math.Random()`.
While this produces pseudo-random doubles, we are using it because it
is basic and readily-available. Better generators such as
[RANDOM.ORG][random], would provide 'more random' (true) numbers.

[random]:https://www.random.org/

### precision:

We are using the random number, without casting it to an integer,
through methods such as `Math.floor(randomNumber * 6) + 1`. This allows us
to preserve precision right until we determine the face that is up.

As the random number, `x`, is tied to probability, it conforms to the
property `0 <= x < 1`. Therefore, if `x` lies in the following segments
(of the probability space), the corresponding face is implied to be up:

1. `0/6 <=  x  <  1/6`: face 1
1. `1/6 <=  x  <  2/6`: face 2
1. `2/6 <=  x  <  3/6`: face 3
1. `3/6 <=  x  <  4/6`: face 4
1. `4/6 <=  x  <  5/6`: face 5
1. `5/6 <=  x  <  6/6`: face 6

### segment intervals:

The random variable generated always lies between 0 (inclusive) and
1 (exclusive). All of the segments, as shown above, must have equal
intervals for the dice to be fair.

Therefore, partitioning the space like shown below would be **wrong**.

1. `0/6 <= x <= 1/6`
1. `1/6 <  x <= 2/6`
1 `...`
1. `5/6 < x <= 6/6`

The intervals are **not** equal, making such a dice **unfair**.

### percent:

The percent is simply calculated by:

```
percent = (frequency / total-number-of-rounds) * 100
```

### rounds:

The number of rounds defaults to `1000` if **not** passed while running the
simulation, as a command-line argument. It is possible to run more
rounds:

```bash
$ java -jar target/application-x.x.x.jar NUMBER_OF_ROUNDS
```


## results:

**Sample results:**

```bash
⇒ java -jar target/application-0.0.0.jar
 # after 1000 rounds

 Outcome:
         Side    freq    %
         ----    ----    -

         1       175     17.5
         2       196     19.6
         3       140     14.0
         4       179     17.9
         5       147     14.7
         6       163     16.3
                 ---     ----
                 1000    100.0

```

