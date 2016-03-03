/**
 * Input provider.
 *
 * Provides input for the model.
 */
package montecarlo;

public class MathRandom implements RandomInput {
    public double get() {
        return Math.random();
    }
}
