/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup#getRampdowntest <em>Rampdowntest</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup#getRampuptest <em>Rampuptest</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getWorkloadGroup()
 * @model
 * @generated
 */
public interface WorkloadGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Rampdowntest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rampdowntest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rampdowntest</em>' reference.
	 * @see #setRampdowntest(RampDownTest)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getWorkloadGroup_Rampdowntest()
	 * @model
	 * @generated
	 */
	RampDownTest getRampdowntest();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup#getRampdowntest <em>Rampdowntest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rampdowntest</em>' reference.
	 * @see #getRampdowntest()
	 * @generated
	 */
	void setRampdowntest(RampDownTest value);

	/**
	 * Returns the value of the '<em><b>Rampuptest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rampuptest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rampuptest</em>' reference.
	 * @see #setRampuptest(RampUpTest)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getWorkloadGroup_Rampuptest()
	 * @model
	 * @generated
	 */
	RampUpTest getRampuptest();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup#getRampuptest <em>Rampuptest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rampuptest</em>' reference.
	 * @see #getRampuptest()
	 * @generated
	 */
	void setRampuptest(RampUpTest value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' reference.
	 * @see #setTest(Test)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getWorkloadGroup_Test()
	 * @model
	 * @generated
	 */
	Test getTest();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup#getTest <em>Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' reference.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(Test value);

} // WorkloadGroup
