/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter#getCounterTransaction <em>Counter Transaction</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getTransactionCounter()
 * @model
 * @generated
 */
public interface TransactionCounter extends Counter {
	/**
	 * Returns the value of the '<em><b>Counter Transaction</b></em>' attribute list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION}.
	 * The literals are from the enumeration {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Transaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Transaction</em>' attribute list.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getTransactionCounter_CounterTransaction()
	 * @model
	 * @generated
	 */
	EList<COUNTER_TRANSACTION> getCounterTransaction();

} // TransactionCounter
