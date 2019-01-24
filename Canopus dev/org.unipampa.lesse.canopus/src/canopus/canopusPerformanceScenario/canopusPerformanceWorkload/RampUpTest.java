/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ramp Up Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest#getRampuptimer <em>Rampuptimer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest#getRampupusers <em>Rampupusers</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getRampUpTest()
 * @model
 * @generated
 */
public interface RampUpTest extends EObject {
	/**
	 * Returns the value of the '<em><b>Rampuptimer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rampuptimer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rampuptimer</em>' reference.
	 * @see #setRampuptimer(RampUpTimer)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getRampUpTest_Rampuptimer()
	 * @model
	 * @generated
	 */
	RampUpTimer getRampuptimer();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest#getRampuptimer <em>Rampuptimer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rampuptimer</em>' reference.
	 * @see #getRampuptimer()
	 * @generated
	 */
	void setRampuptimer(RampUpTimer value);

	/**
	 * Returns the value of the '<em><b>Rampupusers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rampupusers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rampupusers</em>' reference.
	 * @see #setRampupusers(RampUpUsers)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getRampUpTest_Rampupusers()
	 * @model
	 * @generated
	 */
	RampUpUsers getRampupusers();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest#getRampupusers <em>Rampupusers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rampupusers</em>' reference.
	 * @see #getRampupusers()
	 * @generated
	 */
	void setRampupusers(RampUpUsers value);

} // RampUpTest
