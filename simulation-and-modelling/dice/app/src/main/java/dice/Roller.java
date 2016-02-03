/**
 * Roller: a roller handles rolling the dice a number of
 * times and returning useful stats on the outcomes of rolls
 */
package dice;


public class Roller {
    private dice.Dice dice = new Dice();
    private int results[] = {0, 0, 0, 0, 0, 0, 0};
    private int rounds;

    public Roller(int rounds) {
        this.rounds = rounds;
    }

    public Roller() {
        // defaults to 1000 rounds
        this.rounds = 1000;
    }

    public int[] run() {
        int index;

        for (index = 0; index < this.rounds; index++) {
            double result = this.dice.roll();
            int face = 6;
            double interval = 1.0 / 6.0;

            if (result <= interval * 5) { face = 5; }
            if (result <= interval * 4) { face = 4; }
            if (result <= interval * 3) { face = 3; }
            if (result <= interval * 2) { face = 2; }
            if (result <= interval) { face = 1; }

            int current = this.results[face];
            this.results[face] = current + 1;
        }

        return results;
    }

    public double percent(int current) {
        return current * 100.0 / this.rounds;
    }
}
