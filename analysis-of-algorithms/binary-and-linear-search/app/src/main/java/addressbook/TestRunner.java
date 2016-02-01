/**
 * Test runner: executes the timed searches
 */

package addressbook;

import java.util.ArrayList;

public class TestRunner {
    private long startTime;
    private long stopTime;
    private int rounds;
    private ArrayList<Contact> contactlist;
    private Algorithm algorithm;

    public TestRunner(ArrayList<Contact> contactlist) {
        this.contactlist = contactlist;
        this.rounds = 10;
    }

    public TestRunner(ArrayList<Contact> contactlist, int rounds) {
        this.contactlist = contactlist;
        this.rounds = rounds;
    }

    /**
     * Set number of rounds used in test run
     *
     * @param rounds - number of rounds
     * @return this - useful for chaining
     */
    public TestRunner setRounds(int rounds) {
        this.rounds = rounds;
        return this;
    }

    /**
     * Return number of rounds used
     *
     * @return number of rounds used
     */
    public int getRounds() {
        return this.rounds;
    }

    /**
     * Run tests using the algorithm specified
     *
     * @param algorithm - algorithm used. e.g. BinarySearch, LinearSearch
     */
    public int run(Algorithm algorithm, Compare<Contact> compare) {
        // save algorithm, for future use
        this.algorithm = algorithm;

        int index = -1;

        // set start time
        this.startTime = System.nanoTime();

        for (int num = 1; num <= rounds; num++) {
            try {
                index = this.algorithm.exec(this.contactlist, compare);
            } catch(Exception e) {
                // do nothing
            }
        }

        // set stop time
        this.stopTime = System.nanoTime();

        // return the result of the executed algorithm
        return index;
    }

    public long getTime() {
        return this.stopTime - this.startTime;
    }
}
