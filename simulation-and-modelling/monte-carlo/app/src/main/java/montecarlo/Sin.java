/**
 * This is the model for our Monte Carlo simulation.
 *
 * It's main responsibility is to map an input to an output.
 */
package montecarlo;

public class Sin implements Model {
    public String getName() {
        return "Sin";
    }

    public double function(double input) {
        return Math.sin(input);
    }
}
