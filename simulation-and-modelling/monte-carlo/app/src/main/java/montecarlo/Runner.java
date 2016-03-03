/**
 * Simulation Runner.
 *
 * Runs the simulation by invoking the model function with appropriate
 * input and storing the output for a specified number of times. It
 * eventually averages the outputs and determines the average's position
 * in the specified range
 */
package montecarlo;

public class Runner {
    private double lowerBound;
    private double upperBound;
    private int repetitions;

    public Runner(int repetitions, double lowerBound, double upperBound) {
        this.repetitions = repetitions;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public double run(Model model, RandomInput randomInput) {
        int index;
        double summation = 0.0;
        double input = 0.0;

        for (index = 1; index <= this.repetitions; index++) {
            input = (this.lowerBound + (this.upperBound - this.lowerBound) * randomInput.get());
            summation += model.function(input);
        }

        return (summation / (double) this.repetitions) * (this.upperBound - this.lowerBound);
    }
}
