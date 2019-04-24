/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>UPDATED VALUE ON</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getUPDATED_VALUE_ON()
 * @model
 * @generated
 */
public enum UPDATED_VALUE_ON implements Enumerator {
	/**
	 * The '<em><b>EACH INTERACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EACH_INTERACTION_VALUE
	 * @generated
	 * @ordered
	 */
	EACH_INTERACTION(0, "EACH_INTERACTION", "EACH_INTERACTION"),

	/**
	 * The '<em><b>EACH OCCURENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EACH_OCCURENCE_VALUE
	 * @generated
	 * @ordered
	 */
	EACH_OCCURENCE(1, "EACH_OCCURENCE", "EACH_OCCURENCE"),

	/**
	 * The '<em><b>ONCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONCE_VALUE
	 * @generated
	 * @ordered
	 */
	ONCE(2, "ONCE", "ONCE");

	/**
	 * The '<em><b>EACH INTERACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EACH INTERACTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EACH_INTERACTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EACH_INTERACTION_VALUE = 0;

	/**
	 * The '<em><b>EACH OCCURENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EACH OCCURENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EACH_OCCURENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EACH_OCCURENCE_VALUE = 1;

	/**
	 * The '<em><b>ONCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONCE_VALUE = 2;

	/**
	 * An array of all the '<em><b>UPDATED VALUE ON</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UPDATED_VALUE_ON[] VALUES_ARRAY =
		new UPDATED_VALUE_ON[] {
			EACH_INTERACTION,
			EACH_OCCURENCE,
			ONCE,
		};

	/**
	 * A public read-only list of all the '<em><b>UPDATED VALUE ON</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UPDATED_VALUE_ON> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>UPDATED VALUE ON</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UPDATED_VALUE_ON get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UPDATED_VALUE_ON result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>UPDATED VALUE ON</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UPDATED_VALUE_ON getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UPDATED_VALUE_ON result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>UPDATED VALUE ON</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UPDATED_VALUE_ON get(int value) {
		switch (value) {
			case EACH_INTERACTION_VALUE: return EACH_INTERACTION;
			case EACH_OCCURENCE_VALUE: return EACH_OCCURENCE;
			case ONCE_VALUE: return ONCE;
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
	private UPDATED_VALUE_ON(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //UPDATED_VALUE_ON
