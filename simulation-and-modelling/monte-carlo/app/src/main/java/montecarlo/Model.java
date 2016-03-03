/**
 * Interface for our Model.
 *
 * The model used depends on the problem being solved, using the Monte
 * Carlo method.
 */
package montecarlo;

public interface Model {
    public String getName();
    public double function(double input);
}
