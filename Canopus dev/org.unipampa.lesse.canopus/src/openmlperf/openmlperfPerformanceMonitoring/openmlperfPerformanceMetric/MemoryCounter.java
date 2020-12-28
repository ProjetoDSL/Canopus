/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.MemoryCounter#getCounterMemory <em>Counter Memory</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getMemoryCounter()
 * @model
 * @generated
 */
public interface MemoryCounter extends Counter {
	/**
	 * Returns the value of the '<em><b>Counter Memory</b></em>' attribute.
	 * The literals are from the enumeration {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Memory</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY
	 * @see #setCounterMemory(COUNTER_MEMORY)
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getMemoryCounter_CounterMemory()
	 * @model required="true"
	 * @generated
	 */
	COUNTER_MEMORY getCounterMemory();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.MemoryCounter#getCounterMemory <em>Counter Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Memory</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY
	 * @see #getCounterMemory()
	 * @generated
	 */
	void setCounterMemory(COUNTER_MEMORY value);

} // MemoryCounter
