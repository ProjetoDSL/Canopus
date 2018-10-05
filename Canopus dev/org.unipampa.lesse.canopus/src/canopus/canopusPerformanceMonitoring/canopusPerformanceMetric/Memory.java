/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Memory#getMemoryCounter <em>Memory Counter</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends Metric {
	/**
	 * Returns the value of the '<em><b>Memory Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Counter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Counter</em>' reference.
	 * @see #setMemoryCounter(MemoryCounter)
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getMemory_MemoryCounter()
	 * @model
	 * @generated
	 */
	MemoryCounter getMemoryCounter();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Memory#getMemoryCounter <em>Memory Counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Counter</em>' reference.
	 * @see #getMemoryCounter()
	 * @generated
	 */
	void setMemoryCounter(MemoryCounter value);

} // Memory
