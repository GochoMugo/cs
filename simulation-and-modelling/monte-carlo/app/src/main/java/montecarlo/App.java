/**
 * This provides the entry point into the application
 */
package montecarlo;

import java.util.ArrayList;
import java.util.List;

import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.impl.Arguments;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;

public class App {
    public static void main(String[] args) {
        double lowerBound = 0.0;
        double upperBound = 22.0 / 7.0;

        ArgumentParser parser = ArgumentParsers.newArgumentParser("monte-carlo")
            .defaultHelp(true)
            .description("Run a monte-carlo simulation");
        parser.addArgument("iterations")
            .dest("iterations")
            .nargs("*")
            .type(Integer.class)
            .help("Number of iterations");
        parser.addArgument("--sin")
            .dest("model_sin")
            .action(Arguments.storeTrue())
            .help("Use the Sin model");
        parser.addArgument("-l", "--lower-bound")
            .dest("lower")
            .type(Double.class)
            .setDefault(lowerBound)
            .help("Lower bound");
        parser.addArgument("-u", "--upper-bound")
            .dest("upper")
            .type(Double.class)
            .setDefault(upperBound)
            .help("Upper bound");

        List<Integer> iterations = null;
        Runner runner;
        Namespace res = null;

        try {
            res = parser.parseArgs(args);
        } catch (ArgumentParserException e) {
            parser.handleError(e);
            System.exit(1);
        }

        lowerBound = res.getDouble("lower");
        upperBound = res.getDouble("upper");
        iterations = (ArrayList<Integer>) res.get("iterations");

        if (iterations.size() == 0) {
            iterations.add(10);
            iterations.add(20);
            iterations.add(40);
            iterations.add(80);
            iterations.add(160);
        }

        MathRandom mathRandom = new MathRandom();
        Sin sin = new Sin();

        runModel(res.getBoolean("model_sin"), iterations, lowerBound, upperBound, sin, mathRandom);
    }

    private static void runModel(boolean enabled, List<Integer> iterations, double lowerBound, double upperBound, Model model, RandomInput random) {
        if (enabled == false) {
            return;
        }

        Runner runner;

        System.out.printf("\n  # lower bound: %f\n  # upper bound: %f\n\n\n", lowerBound, upperBound);
        System.out.printf("\tn\t\t%s(n)\n\t-\t\t----\n", model.getName());

        for (int index = 0, len = iterations.size();  index < len; index++) {
            runner = new Runner(iterations.get(index), lowerBound, upperBound);
            double output = runner.run(model, random);
            System.out.printf("\t%d\t\t%.2f\n", iterations.get(index), output);
        }

        System.out.println("\n");
    }
}
