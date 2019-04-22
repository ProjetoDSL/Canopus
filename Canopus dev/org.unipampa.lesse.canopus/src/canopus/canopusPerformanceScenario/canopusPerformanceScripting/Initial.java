/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Determines the start of the interaction of a virtual user within a test script. Every script must have only one Initial object. The graphical notation for the Initial object is shown as a double circles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getInitial()
 * @model
 * @generated
 */
public interface Initial extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getInitial_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getInitial_Activity()
	 * @model required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // Initial
