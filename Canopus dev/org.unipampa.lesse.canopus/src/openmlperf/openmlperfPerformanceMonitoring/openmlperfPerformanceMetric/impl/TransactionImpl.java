/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl;

import java.util.Collection;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Transaction;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.TransactionCounter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.TransactionImpl#getTransactionCounter <em>Transaction Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends MetricImpl implements Transaction {
	/**
	 * The cached value of the '{@link #getTransactionCounter() <em>Transaction Counter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionCounter()
	 * @generated
	 * @ordered
	 */
	protected EList<TransactionCounter> transactionCounter;

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
		return OpenmlperfPerformanceMetricPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransactionCounter> getTransactionCounter() {
		if (transactionCounter == null) {
			transactionCounter = new EObjectResolvingEList<TransactionCounter>(TransactionCounter.class, this, OpenmlperfPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER);
		}
		return transactionCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenmlperfPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER:
				return getTransactionCounter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenmlperfPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER:
				getTransactionCounter().clear();
				getTransactionCounter().addAll((Collection<? extends TransactionCounter>)newValue);
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
			case OpenmlperfPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER:
				getTransactionCounter().clear();
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
			case OpenmlperfPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER:
				return transactionCounter != null && !transactionCounter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransactionImpl
