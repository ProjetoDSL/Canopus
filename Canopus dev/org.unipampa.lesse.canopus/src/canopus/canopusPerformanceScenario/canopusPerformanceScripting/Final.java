/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the end of the interaction of a virtual user within a test script. Every script must have only one Final object. The graphical notation for the Initial object is shown as a thick single circle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Final#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getFinal()
 * @model
 * @generated
 */
public interface Final extends EObject {
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
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getFinal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Final#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Final
