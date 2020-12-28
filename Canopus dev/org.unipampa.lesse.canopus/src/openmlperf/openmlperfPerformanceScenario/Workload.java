/**
 */
package openmlperf.openmlperfPerformanceScenario;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownTimer;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownUsers;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpTimer;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpUsers;

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
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Workload#getRampUpTimer <em>Ramp Up Timer</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Workload#getRampDownUsers <em>Ramp Down Users</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Workload#getRampUpUsers <em>Ramp Up Users</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Workload#getRampDownTimer <em>Ramp Down Timer</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Workload#getName <em>Name</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Workload#getTime <em>Time</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Workload#getVirtualUsers <em>Virtual Users</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Workload#getTimeType <em>Time Type</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getWorkload()
 * @model
 * @generated
 */
public interface Workload extends EObject {
	/**
	 * Returns the value of the '<em><b>Ramp Up Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Up Timer</em>' containment reference.
	 * @see #setRampUpTimer(RampUpTimer)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getWorkload_RampUpTimer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RampUpTimer getRampUpTimer();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.Workload#getRampUpTimer <em>Ramp Up Timer</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Down Users</em>' containment reference.
	 * @see #setRampDownUsers(RampDownUsers)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getWorkload_RampDownUsers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RampDownUsers getRampDownUsers();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.Workload#getRampDownUsers <em>Ramp Down Users</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Up Users</em>' containment reference.
	 * @see #setRampUpUsers(RampUpUsers)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getWorkload_RampUpUsers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RampUpUsers getRampUpUsers();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.Workload#getRampUpUsers <em>Ramp Up Users</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Down Timer</em>' containment reference.
	 * @see #setRampDownTimer(RampDownTimer)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getWorkload_RampDownTimer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RampDownTimer getRampDownTimer();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.Workload#getRampDownTimer <em>Ramp Down Timer</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getWorkload_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.Workload#getName <em>Name</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getWorkload_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.Workload#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Virtual Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Users</em>' attribute.
	 * @see #setVirtualUsers(int)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getWorkload_VirtualUsers()
	 * @model
	 * @generated
	 */
	int getVirtualUsers();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.Workload#getVirtualUsers <em>Virtual Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Users</em>' attribute.
	 * @see #getVirtualUsers()
	 * @generated
	 */
	void setVirtualUsers(int value);

	/**
	 * Returns the value of the '<em><b>Time Type</b></em>' attribute.
	 * The literals are from the enumeration {@link openmlperf.openmlperfPerformanceScenario.TimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Type</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceScenario.TimeType
	 * @see #setTimeType(TimeType)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getWorkload_TimeType()
	 * @model
	 * @generated
	 */
	TimeType getTimeType();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.Workload#getTimeType <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Type</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceScenario.TimeType
	 * @see #getTimeType()
	 * @generated
	 */
	void setTimeType(TimeType value);

} // Workload
