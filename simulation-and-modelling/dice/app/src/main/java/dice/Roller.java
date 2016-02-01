/**
 * Roller: a roller handles rolling the dice a number of
 * times and returning useful stats on the outcomes of rolls
 */
package dice;


public class Roller {
    private dice.Dice dice;
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
            int result = this.dice.roll();
            int current = this.results[result];
            this.results[result] = current + 1;
        }

        int stats[] = {0, 0, 0, 0, 0, 0, 0};

        // analyse the results
        for (index = 0; index < this.results.length; index++) {
            int percent = this.percent(this.results[index]);
            stats[index] = percent;
        }

        return stats;
    }

    private int percent(int current) {
        return current * 100 / this.rounds;
    }
}