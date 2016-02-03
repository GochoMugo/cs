
# dice simulation

> Simulate a 6-sided dice


## design:

### randomness:

In each roll, a random number is generated using `Math.Random()`.
While this produces pseudo-random doubles, we are using it because it
is basic and readily-available.

### precision:

We are using the random number, without casting it to an integer,
through methods such as `Math.floor(randomNumber * 6) + 1`. This allows us
to preserve precision right until we determine the face that is up.

As the random number, `x`, is tied to probability, it conforms to the
property `0 <= x < 1`. Therefore, if `x` lies in the following segments
(of the probability space), the corresponding face is implied to be up:

1. `0   <= x  <=  1/6`: face 1
1. `1/6 <  x  <=  2/6`: face 2
1. `2/6 <  x  <=  3/6`: face 3
1. `3/6 <  x  <=  4/6`: face 4
1. `4/6 <  x  <=  5/6`: face 5
1. `5/6 <  x  <   1`: face 6

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


