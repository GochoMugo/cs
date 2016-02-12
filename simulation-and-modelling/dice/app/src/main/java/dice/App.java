/**
 * The application: main entry point
 */
package dice;

public class App {
    public static void main(String[] args) {
        dice.Roller roller;
        int rounds = 0;
        int results[];
        int totalFrequency = 0;

        // process command-line args
        if (args.length == 0) {
            rounds = 1000;
        } else if (args.length == 1) {
            rounds = new Integer(args[0]);
        } else {
            System.out.println("usage: [rounds]");
            System.out.println("  example: 1000");
            System.exit(1);
        }

        roller = new dice.Roller(rounds);
        results = roller.run();

        System.out.println(" # after " + rounds + " rounds");
        System.out.println("\nOutcome:\n\tSide\tfreq\t%\n\t----\t----\t-\n");
        for (int index = 1; index < results.length; index++) {
            int result = results[index];
            totalFrequency += result;
            System.out.println("\t" + index + "\t" + result + "\t" + roller.percent(result));
        }
        System.out.println("\t\t---\t---\n\t\t" + totalFrequency + "\t" + roller.percent(totalFrequency));
    }
}
