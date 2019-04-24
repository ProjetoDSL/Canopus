/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.TransactionCounterImpl#getCounterTransaction <em>Counter Transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionCounterImpl extends CounterImpl implements TransactionCounter {
	/**
	 * The default value of the '{@link #getCounterTransaction() <em>Counter Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterTransaction()
	 * @generated
	 * @ordered
	 */
	protected static final COUNTER_TRANSACTION COUNTER_TRANSACTION_EDEFAULT = COUNTER_TRANSACTION.TRANSACTION_RESPONSE_TIME;

	/**
	 * The cached value of the '{@link #getCounterTransaction() <em>Counter Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterTransaction()
	 * @generated
	 * @ordered
	 */
	protected COUNTER_TRANSACTION counterTransaction = COUNTER_TRANSACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionCounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceMetricPackage.Literals.TRANSACTION_COUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public COUNTER_TRANSACTION getCounterTransaction() {
		return counterTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounterTransaction(COUNTER_TRANSACTION newCounterTransaction) {
		COUNTER_TRANSACTION oldCounterTransaction = counterTransaction;
		counterTransaction = newCounterTransaction == null ? COUNTER_TRANSACTION_EDEFAULT : newCounterTransaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMetricPackage.TRANSACTION_COUNTER__COUNTER_TRANSACTION, oldCounterTransaction, counterTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceMetricPackage.TRANSACTION_COUNTER__COUNTER_TRANSACTION:
				return getCounterTransaction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CanopusPerformanceMetricPackage.TRANSACTION_COUNTER__COUNTER_TRANSACTION:
				setCounterTransaction((COUNTER_TRANSACTION)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CanopusPerformanceMetricPackage.TRANSACTION_COUNTER__COUNTER_TRANSACTION:
				setCounterTransaction(COUNTER_TRANSACTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CanopusPerformanceMetricPackage.TRANSACTION_COUNTER__COUNTER_TRANSACTION:
				return counterTransaction != COUNTER_TRANSACTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (counterTransaction: ");
		result.append(counterTransaction);
		result.append(')');
		return result.toString();
	}

} //TransactionCounterImpl
