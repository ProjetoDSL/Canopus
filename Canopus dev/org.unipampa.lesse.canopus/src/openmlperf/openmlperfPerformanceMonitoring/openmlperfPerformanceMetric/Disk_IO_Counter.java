/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disk IO Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk_IO_Counter#getCounterDisk <em>Counter Disk</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getDisk_IO_Counter()
 * @model
 * @generated
 */
public interface Disk_IO_Counter extends Counter {
	/**
	 * Returns the value of the '<em><b>Counter Disk</b></em>' attribute.
	 * The literals are from the enumeration {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Disk</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK
	 * @see #setCounterDisk(COUNTER_DISK)
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getDisk_IO_Counter_CounterDisk()
	 * @model required="true"
	 * @generated
	 */
	COUNTER_DISK getCounterDisk();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk_IO_Counter#getCounterDisk <em>Counter Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Disk</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK
	 * @see #getCounterDisk()
	 * @generated
	 */
	void setCounterDisk(COUNTER_DISK value);

} // Disk_IO_Counter
