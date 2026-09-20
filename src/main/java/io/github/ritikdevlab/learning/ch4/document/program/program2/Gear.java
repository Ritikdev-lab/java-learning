package io.github.ritikdevlab.learning.ch4.document.program.program2;

/**
 * <h2 id="gear-system-heading">Gear System</h2>
 *
 * {@literal Represents a vehicle gear system that evaluates speed.}
 *
 * <p>
 * Example using Main:
 *
 * {@snippet class = "program.program2.Main" region = "main-example"}
 *
 * <p>
 * The method {@link #Speed(int)} determines whether
 * a vehicle is moving slowly or quickly.
 *
 * <img src="doc-files/ChatGPTImageJun5202608381AM.png"
 * alt="Gear system Diagram"
 * width="300">
 *
 * <p>
 * Example loaded from an external file:
 *
 * {@snippet file = "GearExample.java" region = "speed-example"}
 *
 * <p>
 * <strong>Note:</strong> A speed less than {@code 40}
 * is considered slow.
 *
 * <p>
 * <em>Example:</em>
 *
 * <pre>{@code
 * Gear gear = new Gear();
 * gear.Speed(25);
 * }
 * </pre>
 *
 * <p>
 * Extended functionality is available in {@linkplain Anathor the Anathor
 * subclass}.
 *
 * @author Ritikdev-lab
 * @version 1.0
 * @since 1.0
 *
 * @see Anathor
 * @see Anathor#Name(int)
 * @see "The javadoc "
 * @see <a href=
 *      "https://docs.oracle.com/en/java/javase/25/docs/api/index.html">Java
 *      Documentation(Java 25)</a>
 * @see ##gear-system-heading Gear system
 * @see Anathor##vehicle-description-heading Vehicle Description
 */
public class Gear {

    /**
     * Default constructor for Gear.
     */
    public Gear() {
        super();
    }

    /**
     * {@literal Determines whether the supplied speed is slow or fast.}
     *
     * <p>
     * Example using an imported region:
     *
     * {@snippet file = "GearExample.java" region = "speed-example"}
     *
     * <p>
     * The imported snippet demonstrates:
     * <ul>
     * <li>Region extraction</li>
     * <li>Highlighting</li>
     * <li>Replacement</li>
     * </ul>
     *
     * <p>
     * Possible outcomes:
     * <ul>
     * <li>{@code "Its speed is slow"}</li>
     * <li>{@code "Its speed is fast"}</li>
     * </ul>
     *
     * <p>
     * Example:
     * {@snippet :
     * Gear gear = new Gear();
     * gear.Speed(25);
     * }
     *
     * <p>
     * For power-source classification, see {@link Anathor#Name(int)}.
     *
     * @param speed the speed of the vehicle
     * @return the supplied speed value
     * @throws IllegalArgumentException if speed is negative
     * @since 1.0
     * @see Anathor#Name(int)
     *      Default constructor.
     */
    public int Speed(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("Speed cannot be negative");
        } else if (speed < 40) {
            IO.println("Its speed is slow");
        } else {
            IO.println("Its speed is fast");
        }
        return speed;
    }
}
