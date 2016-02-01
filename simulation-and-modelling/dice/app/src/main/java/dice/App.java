/**
 * The application: main entry point
 */
package dice;

public class App {
    public static void main(String[] args) {
        dice.Roller roller;
        int rounds = 0;
        int results[];

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
        System.out.println("\nOutcome:\n\tSide\t%\n\t----\t-\n");
        for (int index = 1; index < results.length; index++) {
            System.out.println("\t" + index + "\t" + results[index]);
        }
    }
}