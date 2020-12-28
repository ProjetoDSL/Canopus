/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ramp Up Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpTimer#getTime <em>Time</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpTimer#getTimeType <em>Time Type</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadPackage#getRampUpTimer()
 * @model
 * @generated
 */
public interface RampUpTimer extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadPackage#getRampUpTimer_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpTimer#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Time Type</b></em>' attribute.
	 * The literals are from the enumeration {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.TimeTypeRamps}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Type</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.TimeTypeRamps
	 * @see #setTimeType(TimeTypeRamps)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadPackage#getRampUpTimer_TimeType()
	 * @model
	 * @generated
	 */
	TimeTypeRamps getTimeType();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpTimer#getTimeType <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Type</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.TimeTypeRamps
	 * @see #getTimeType()
	 * @generated
	 */
	void setTimeType(TimeTypeRamps value);

} // RampUpTimer
