/**
 * Class Dice; Defining the structure and behavior of a dice
 */
package dice;

public class Dice {
    public static Integer roll() {
        Double result = Math.floor(6 * Math.random()) + 1;
        return result.intValue();
    }
}