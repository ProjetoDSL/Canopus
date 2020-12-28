/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.TransactionCounter#getCounterTransaction <em>Counter Transaction</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getTransactionCounter()
 * @model
 * @generated
 */
public interface TransactionCounter extends Counter {
	/**
	 * Returns the value of the '<em><b>Counter Transaction</b></em>' attribute.
	 * The literals are from the enumeration {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_TRANSACTION}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Transaction</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_TRANSACTION
	 * @see #setCounterTransaction(COUNTER_TRANSACTION)
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getTransactionCounter_CounterTransaction()
	 * @model required="true"
	 * @generated
	 */
	COUNTER_TRANSACTION getCounterTransaction();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.TransactionCounter#getCounterTransaction <em>Counter Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Transaction</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_TRANSACTION
	 * @see #getCounterTransaction()
	 * @generated
	 */
	void setCounterTransaction(COUNTER_TRANSACTION value);

} // TransactionCounter
