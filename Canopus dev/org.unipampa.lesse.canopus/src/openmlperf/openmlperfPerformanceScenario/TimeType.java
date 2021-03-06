/**
 */
package openmlperf.openmlperfPerformanceScenario;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getTimeType()
 * @model
 * @generated
 */
public enum TimeType implements Enumerator {
	/**
	 * The '<em><b>SECONDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDS_VALUE
	 * @generated
	 * @ordered
	 */
	SECONDS(0, "SECONDS", "SECONDS"),

	/**
	 * The '<em><b>MINUTES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUTES_VALUE
	 * @generated
	 * @ordered
	 */
	MINUTES(1, "MINUTES", "MINUTES"),

	/**
	 * The '<em><b>HOURS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOURS_VALUE
	 * @generated
	 * @ordered
	 */
	HOURS(2, "HOURS", "HOURS");

	/**
	 * The '<em><b>SECONDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECONDS_VALUE = 0;

	/**
	 * The '<em><b>MINUTES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUTES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINUTES_VALUE = 1;

	/**
	 * The '<em><b>HOURS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOURS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOURS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Time Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeType[] VALUES_ARRAY =
		new TimeType[] {
			SECONDS,
			MINUTES,
			HOURS,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeType get(int value) {
		switch (value) {
			case SECONDS_VALUE: return SECONDS;
			case MINUTES_VALUE: return MINUTES;
			case HOURS_VALUE: return HOURS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TimeType
