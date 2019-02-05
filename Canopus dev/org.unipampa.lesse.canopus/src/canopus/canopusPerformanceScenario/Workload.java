/**
 */
package canopus.canopusPerformanceScenario;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTimer;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.TestDuration;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getVirtualUsers <em>Virtual Users</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getRampUpTimer <em>Ramp Up Timer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getRampDownUsers <em>Ramp Down Users</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getRampUpUsers <em>Ramp Up Users</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getTestDuration <em>Test Duration</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getRampDownTimer <em>Ramp Down Timer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getRampDownTest <em>Ramp Down Test</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getRampUpTest <em>Ramp Up Test</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getTest <em>Test</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getWorkloadGroup <em>Workload Group</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload()
 * @model
 * @generated
 */
public interface Workload extends EObject {
	/**
	 * Returns the value of the '<em><b>Virtual Users</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Users</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Users</em>' containment reference.
	 * @see #setVirtualUsers(VirtualUsers)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_VirtualUsers()
	 * @model containment="true"
	 * @generated
	 */
	VirtualUsers getVirtualUsers();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Workload#getVirtualUsers <em>Virtual Users</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Users</em>' containment reference.
	 * @see #getVirtualUsers()
	 * @generated
	 */
	void setVirtualUsers(VirtualUsers value);

	/**
	 * Returns the value of the '<em><b>Ramp Up Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp Up Timer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Up Timer</em>' containment reference.
	 * @see #setRampUpTimer(RampUpTimer)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_RampUpTimer()
	 * @model containment="true"
	 * @generated
	 */
	RampUpTimer getRampUpTimer();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Workload#getRampUpTimer <em>Ramp Up Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp Up Timer</em>' containment reference.
	 * @see #getRampUpTimer()
	 * @generated
	 */
	void setRampUpTimer(RampUpTimer value);

	/**
	 * Returns the value of the '<em><b>Ramp Down Users</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp Down Users</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Down Users</em>' containment reference.
	 * @see #setRampDownUsers(RampDownUsers)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_RampDownUsers()
	 * @model containment="true"
	 * @generated
	 */
	RampDownUsers getRampDownUsers();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Workload#getRampDownUsers <em>Ramp Down Users</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp Down Users</em>' containment reference.
	 * @see #getRampDownUsers()
	 * @generated
	 */
	void setRampDownUsers(RampDownUsers value);

	/**
	 * Returns the value of the '<em><b>Ramp Up Users</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp Up Users</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Up Users</em>' containment reference.
	 * @see #setRampUpUsers(RampUpUsers)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_RampUpUsers()
	 * @model containment="true"
	 * @generated
	 */
	RampUpUsers getRampUpUsers();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Workload#getRampUpUsers <em>Ramp Up Users</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp Up Users</em>' containment reference.
	 * @see #getRampUpUsers()
	 * @generated
	 */
	void setRampUpUsers(RampUpUsers value);

	/**
	 * Returns the value of the '<em><b>Test Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Duration</em>' containment reference.
	 * @see #setTestDuration(TestDuration)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_TestDuration()
	 * @model containment="true"
	 * @generated
	 */
	TestDuration getTestDuration();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Workload#getTestDuration <em>Test Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Duration</em>' containment reference.
	 * @see #getTestDuration()
	 * @generated
	 */
	void setTestDuration(TestDuration value);

	/**
	 * Returns the value of the '<em><b>Ramp Down Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp Down Timer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Down Timer</em>' containment reference.
	 * @see #setRampDownTimer(RampDownTimer)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_RampDownTimer()
	 * @model containment="true"
	 * @generated
	 */
	RampDownTimer getRampDownTimer();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Workload#getRampDownTimer <em>Ramp Down Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp Down Timer</em>' containment reference.
	 * @see #getRampDownTimer()
	 * @generated
	 */
	void setRampDownTimer(RampDownTimer value);

	/**
	 * Returns the value of the '<em><b>Ramp Down Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp Down Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Down Test</em>' containment reference.
	 * @see #setRampDownTest(RampDownTest)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_RampDownTest()
	 * @model containment="true"
	 * @generated
	 */
	RampDownTest getRampDownTest();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Workload#getRampDownTest <em>Ramp Down Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp Down Test</em>' containment reference.
	 * @see #getRampDownTest()
	 * @generated
	 */
	void setRampDownTest(RampDownTest value);

	/**
	 * Returns the value of the '<em><b>Ramp Up Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp Up Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Up Test</em>' containment reference.
	 * @see #setRampUpTest(RampUpTest)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_RampUpTest()
	 * @model containment="true"
	 * @generated
	 */
	RampUpTest getRampUpTest();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Workload#getRampUpTest <em>Ramp Up Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp Up Test</em>' containment reference.
	 * @see #getRampUpTest()
	 * @generated
	 */
	void setRampUpTest(RampUpTest value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference.
	 * @see #setTest(Test)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_Test()
	 * @model containment="true"
	 * @generated
	 */
	Test getTest();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Workload#getTest <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' containment reference.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(Test value);

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
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Workload#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Workload Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload Group</em>' containment reference.
	 * @see #setWorkloadGroup(WorkloadGroup)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_WorkloadGroup()
	 * @model containment="true"
	 * @generated
	 */
	WorkloadGroup getWorkloadGroup();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Workload#getWorkloadGroup <em>Workload Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workload Group</em>' containment reference.
	 * @see #getWorkloadGroup()
	 * @generated
	 */
	void setWorkloadGroup(WorkloadGroup value);

} // Workload
