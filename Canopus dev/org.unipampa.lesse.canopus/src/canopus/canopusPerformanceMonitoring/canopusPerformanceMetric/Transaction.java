/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Transaction#getTransactionCounter <em>Transaction Counter</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends Metric {
	/**
	 * Returns the value of the '<em><b>Transaction Counter</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Counter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Counter</em>' reference list.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getTransaction_TransactionCounter()
	 * @model
	 * @generated
	 */
	EList<TransactionCounter> getTransactionCounter();

} // Transaction
