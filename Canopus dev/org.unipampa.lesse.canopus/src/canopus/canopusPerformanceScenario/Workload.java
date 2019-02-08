/**
 */
package canopus.canopusPerformanceScenario;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTimer;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers;

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
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getRampUpTimer <em>Ramp Up Timer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getRampDownUsers <em>Ramp Down Users</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getRampUpUsers <em>Ramp Up Users</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getRampDownTimer <em>Ramp Down Timer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getTime <em>Time</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getVirtualUsers <em>Virtual Users</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload()
 * @model
 * @generated
 */
public interface Workload extends EObject {
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
	 * @model containment="true" required="true"
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
	 * @model containment="true" required="true"
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
	 * @model containment="true" required="true"
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
	 * @model containment="true" required="true"
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
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_Time()
	 * @model
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Workload#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Virtual Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Users</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Users</em>' attribute.
	 * @see #setVirtualUsers(int)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_VirtualUsers()
	 * @model
	 * @generated
	 */
	int getVirtualUsers();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Workload#getVirtualUsers <em>Virtual Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Users</em>' attribute.
	 * @see #getVirtualUsers()
	 * @generated
	 */
	void setVirtualUsers(int value);

} // Workload
