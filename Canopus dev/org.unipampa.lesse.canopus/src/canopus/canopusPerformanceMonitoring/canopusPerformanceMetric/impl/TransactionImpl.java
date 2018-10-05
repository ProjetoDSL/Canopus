/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Transaction;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.TransactionImpl#getTransactionCounter <em>Transaction Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends MetricImpl implements Transaction {
	/**
	 * The cached value of the '{@link #getTransactionCounter() <em>Transaction Counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionCounter()
	 * @generated
	 * @ordered
	 */
	protected TransactionCounter transactionCounter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceMetricPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionCounter getTransactionCounter() {
		if (transactionCounter != null && transactionCounter.eIsProxy()) {
			InternalEObject oldTransactionCounter = (InternalEObject)transactionCounter;
			transactionCounter = (TransactionCounter)eResolveProxy(oldTransactionCounter);
			if (transactionCounter != oldTransactionCounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER, oldTransactionCounter, transactionCounter));
			}
		}
		return transactionCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionCounter basicGetTransactionCounter() {
		return transactionCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionCounter(TransactionCounter newTransactionCounter) {
		TransactionCounter oldTransactionCounter = transactionCounter;
		transactionCounter = newTransactionCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER, oldTransactionCounter, transactionCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER:
				if (resolve) return getTransactionCounter();
				return basicGetTransactionCounter();
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
			case CanopusPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER:
				setTransactionCounter((TransactionCounter)newValue);
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
			case CanopusPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER:
				setTransactionCounter((TransactionCounter)null);
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
			case CanopusPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER:
				return transactionCounter != null;
		}
		return super.eIsSet(featureID);
	}

} //TransactionImpl
