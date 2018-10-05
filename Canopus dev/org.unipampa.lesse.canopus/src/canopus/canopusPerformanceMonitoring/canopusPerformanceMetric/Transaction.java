/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;


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
	 * Returns the value of the '<em><b>Transaction Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Counter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Counter</em>' reference.
	 * @see #setTransactionCounter(TransactionCounter)
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getTransaction_TransactionCounter()
	 * @model
	 * @generated
	 */
	TransactionCounter getTransactionCounter();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Transaction#getTransactionCounter <em>Transaction Counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Counter</em>' reference.
	 * @see #getTransactionCounter()
	 * @generated
	 */
	void setTransactionCounter(TransactionCounter value);

} // Transaction
