/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter#getCounterMemory <em>Counter Memory</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getMemoryCounter()
 * @model
 * @generated
 */
public interface MemoryCounter extends Counter {
	/**
	 * Returns the value of the '<em><b>Counter Memory</b></em>' attribute.
	 * The literals are from the enumeration {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Memory</em>' attribute.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY
	 * @see #setCounterMemory(COUNTER_MEMORY)
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getMemoryCounter_CounterMemory()
	 * @model required="true"
	 * @generated
	 */
	COUNTER_MEMORY getCounterMemory();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter#getCounterMemory <em>Counter Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Memory</em>' attribute.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY
	 * @see #getCounterMemory()
	 * @generated
	 */
	void setCounterMemory(COUNTER_MEMORY value);

} // MemoryCounter
