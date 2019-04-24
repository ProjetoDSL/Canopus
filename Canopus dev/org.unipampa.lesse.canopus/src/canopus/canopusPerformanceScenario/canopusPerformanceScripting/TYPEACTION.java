/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TYPEACTION</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getTYPEACTION()
 * @model
 * @generated
 */
public enum TYPEACTION implements Enumerator {
	/**
	 * The '<em><b>BODY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BODY_VALUE
	 * @generated
	 * @ordered
	 */
	BODY(0, "BODY", "Body"),

	/**
	 * The '<em><b>BUTTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON(1, "BUTTON", "Button"),

	/**
	 * The '<em><b>CHECKBOX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKBOX(2, "CHECKBOX", "Checkbox"),

	/**
	 * The '<em><b>DROPDOWNLIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROPDOWNLIST_VALUE
	 * @generated
	 * @ordered
	 */
	DROPDOWNLIST(3, "DROPDOWNLIST", "Drop-down list"),

	/**
	 * The '<em><b>INPUTFIELD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUTFIELD_VALUE
	 * @generated
	 * @ordered
	 */
	INPUTFIELD(4, "INPUTFIELD", "Input field"),

	/**
	 * The '<em><b>IMAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE(5, "IMAGE", "image"),

	/**
	 * The '<em><b>LINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINK_VALUE
	 * @generated
	 * @ordered
	 */
	LINK(6, "LINK", "Link"),

	/**
	 * The '<em><b>RADIOBUTTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIOBUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	RADIOBUTTON(7, "RADIOBUTTON", "Radio button"),

	/**
	 * The '<em><b>SAVEPARAMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAVEPARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	SAVEPARAMETER(8, "SAVEPARAMETER", "Save Parameter"),

	/**
	 * The '<em><b>SUBMITBUTTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMITBUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMITBUTTON(9, "SUBMITBUTTON", "Submit button"),

	/**
	 * The '<em><b>TEXTAREA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTAREA_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTAREA(10, "TEXTAREA", "Textarea");

	/**
	 * The '<em><b>BODY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BODY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BODY
	 * @model literal="Body"
	 * @generated
	 * @ordered
	 */
	public static final int BODY_VALUE = 0;

	/**
	 * The '<em><b>BUTTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON
	 * @model literal="Button"
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_VALUE = 1;

	/**
	 * The '<em><b>CHECKBOX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHECKBOX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX
	 * @model literal="Checkbox"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKBOX_VALUE = 2;

	/**
	 * The '<em><b>DROPDOWNLIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DROPDOWNLIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DROPDOWNLIST
	 * @model literal="Drop-down list"
	 * @generated
	 * @ordered
	 */
	public static final int DROPDOWNLIST_VALUE = 3;

	/**
	 * The '<em><b>INPUTFIELD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INPUTFIELD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INPUTFIELD
	 * @model literal="Input field"
	 * @generated
	 * @ordered
	 */
	public static final int INPUTFIELD_VALUE = 4;

	/**
	 * The '<em><b>IMAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE
	 * @model literal="image"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_VALUE = 5;

	/**
	 * The '<em><b>LINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINK
	 * @model literal="Link"
	 * @generated
	 * @ordered
	 */
	public static final int LINK_VALUE = 6;

	/**
	 * The '<em><b>RADIOBUTTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RADIOBUTTON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIOBUTTON
	 * @model literal="Radio button"
	 * @generated
	 * @ordered
	 */
	public static final int RADIOBUTTON_VALUE = 7;

	/**
	 * The '<em><b>SAVEPARAMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAVEPARAMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAVEPARAMETER
	 * @model literal="Save Parameter"
	 * @generated
	 * @ordered
	 */
	public static final int SAVEPARAMETER_VALUE = 8;

	/**
	 * The '<em><b>SUBMITBUTTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBMITBUTTON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBMITBUTTON
	 * @model literal="Submit button"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMITBUTTON_VALUE = 9;

	/**
	 * The '<em><b>TEXTAREA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXTAREA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXTAREA
	 * @model literal="Textarea"
	 * @generated
	 * @ordered
	 */
	public static final int TEXTAREA_VALUE = 10;

	/**
	 * An array of all the '<em><b>TYPEACTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TYPEACTION[] VALUES_ARRAY =
		new TYPEACTION[] {
			BODY,
			BUTTON,
			CHECKBOX,
			DROPDOWNLIST,
			INPUTFIELD,
			IMAGE,
			LINK,
			RADIOBUTTON,
			SAVEPARAMETER,
			SUBMITBUTTON,
			TEXTAREA,
		};

	/**
	 * A public read-only list of all the '<em><b>TYPEACTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TYPEACTION> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TYPEACTION</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TYPEACTION get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TYPEACTION result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TYPEACTION</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TYPEACTION getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TYPEACTION result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TYPEACTION</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TYPEACTION get(int value) {
		switch (value) {
			case BODY_VALUE: return BODY;
			case BUTTON_VALUE: return BUTTON;
			case CHECKBOX_VALUE: return CHECKBOX;
			case DROPDOWNLIST_VALUE: return DROPDOWNLIST;
			case INPUTFIELD_VALUE: return INPUTFIELD;
			case IMAGE_VALUE: return IMAGE;
			case LINK_VALUE: return LINK;
			case RADIOBUTTON_VALUE: return RADIOBUTTON;
			case SAVEPARAMETER_VALUE: return SAVEPARAMETER;
			case SUBMITBUTTON_VALUE: return SUBMITBUTTON;
			case TEXTAREA_VALUE: return TEXTAREA;
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
	private TYPEACTION(int value, String name, String literal) {
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
	
} //TYPEACTION
