/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Memory Counter</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Counter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Counter</em>' reference list.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getMemory_MemoryCounter()
	 * @model
	 * @generated
	 */
	EList<MemoryCounter> getMemoryCounter();

} // Memory
