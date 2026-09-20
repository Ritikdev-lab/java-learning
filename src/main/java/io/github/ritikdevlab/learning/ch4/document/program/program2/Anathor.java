package io.github.ritikdevlab.learning.ch4.document.program.program2;

/**
 * <h2 id="vehicle-description-heading">Vehicle Description</h2>
 *
 * Extends the {@link Gear} class and determines
 * the vehicle's {@index "energy source"} based on speed.
 *
 * <p>
 * Example using Main:
 *
 * {@snippet class = program.program2.Main region = main-example}
 *
 * <p>
 * Example loaded from an external file:
 *
 * {@snippet file = "AnathorExample.java" region = "vehicleExample"}
 *
 * <p>
 * <img src="doc-files/ChatGPTImageJun5202608381AM.png"
 * alt="Vehicle energy source determination based on speed"
 * width="300">
 *
 * <p>
 * <strong>Rule:</strong>
 * <ul>
 * <li>If speed is less then {@code 250},
 * the vehicle is considered petrol-powered.</li>
 * <li>Otherwise,it is considered electric.</li>
 * </ul>
 *
 * <p>
 * <em>Inheritance:</em> This class inherits from {@link Gear}
 *
 * <p>
 * See also the {@linkplain Gear parent class} for speed classification.
 *
 * <p>
 * The class performs {@index "vehicle classification"} based on speed
 * thresholds
 *
 * @author Ritikdev-lab
 * @version 1.0
 * @since 1.0
 *
 * @see Gear
 * @see Gear#Speed(int)
 * @see <a href=
 *      "https://docs.oracle.com/en/java/javase/25/docs/api/index.html">Java
 *      Documentation(Java 25)</a>
 * @see "Vehicle Power System"
 * @see Gear##gear-system-heading Speed Evaluation Rules
 * @see ##vehicle-description-heading Vehicle Description
 *
 */
public class Anathor extends Gear {
    /**
     * Default constructor for Anathor.
     */
    public Anathor() {
        super();
    }

    /**
     * Maximum speed for petrol-powered classification.
     *
     * <p>
     * Current value: {@value #PETROL_LIMIT}
     *
     */
    public static final int PETROL_LIMIT = 250;

    /**
     * {@literal Determine the vehicle type according to its speed.}
     *
     * {@snippet file = "AnathorExample.java" region = "vehicleExample"}
     *
     * <p>
     * Example:
     *
     * {@snippet :
     * Anathor car = new Anathor();
     * car.Name(300);
     * }
     *
     * <p>
     * For basic speed evaluation,see {@link Gear#Speed(int)}.
     *
     * <P>
     * This method determines the {@index "petrol vehicle"}
     * and {@index "electric vehicle"} clssification of a vehicle
     *
     * @param speed the vehicle speed
     * @return the supplied speed value
     * @throws IllegalArgumentException if speed is negative
     * @since 1.0
     * @see Gear#Speed(int)
     */
    public int Name(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("speed cannot be negetive");
        } else if (speed < PETROL_LIMIT) {
            IO.println("This car is used by petrol");
        } else {
            IO.println("This car is used by electricity");
        }
        return speed;
    }
}