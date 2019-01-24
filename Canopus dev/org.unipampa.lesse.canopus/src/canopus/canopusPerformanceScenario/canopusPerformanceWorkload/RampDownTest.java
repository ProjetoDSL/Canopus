/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ramp Down Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest#getRampdowntimer <em>Rampdowntimer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest#getRampdownusers <em>Rampdownusers</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getRampDownTest()
 * @model
 * @generated
 */
public interface RampDownTest extends EObject {
	/**
	 * Returns the value of the '<em><b>Rampdowntimer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rampdowntimer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rampdowntimer</em>' reference.
	 * @see #setRampdowntimer(RampDownTimer)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getRampDownTest_Rampdowntimer()
	 * @model
	 * @generated
	 */
	RampDownTimer getRampdowntimer();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest#getRampdowntimer <em>Rampdowntimer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rampdowntimer</em>' reference.
	 * @see #getRampdowntimer()
	 * @generated
	 */
	void setRampdowntimer(RampDownTimer value);

	/**
	 * Returns the value of the '<em><b>Rampdownusers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rampdownusers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rampdownusers</em>' reference.
	 * @see #setRampdownusers(RampDownUsers)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getRampDownTest_Rampdownusers()
	 * @model
	 * @generated
	 */
	RampDownUsers getRampdownusers();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest#getRampdownusers <em>Rampdownusers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rampdownusers</em>' reference.
	 * @see #getRampdownusers()
	 * @generated
	 */
	void setRampdownusers(RampDownUsers value);

} // RampDownTest
