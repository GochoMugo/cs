/**
 * Interface for Input.
 *
 * All input classes (that implement this interface) should generate
 * random numbers to used in the simulation.
 */
package montecarlo;

public interface RandomInput {
    public double get();
}
