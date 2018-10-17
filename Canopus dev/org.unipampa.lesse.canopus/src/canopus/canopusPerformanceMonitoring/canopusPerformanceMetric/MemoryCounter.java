/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Counter Memory</b></em>' attribute list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY}.
	 * The literals are from the enumeration {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Memory</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Memory</em>' attribute list.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getMemoryCounter_CounterMemory()
	 * @model
	 * @generated
	 */
	EList<COUNTER_MEMORY> getCounterMemory();

} // MemoryCounter
