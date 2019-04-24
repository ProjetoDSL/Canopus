/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Transaction;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter;

import java.util.Collection;

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
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.TransactionImpl#getTransactionCounter <em>Transaction Counter</em>}</li>
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
		return CanopusPerformanceMetricPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransactionCounter> getTransactionCounter() {
		if (transactionCounter == null) {
			transactionCounter = new EObjectResolvingEList<TransactionCounter>(TransactionCounter.class, this, CanopusPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER);
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
			case CanopusPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER:
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
			case CanopusPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER:
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
			case CanopusPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER:
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
			case CanopusPerformanceMetricPackage.TRANSACTION__TRANSACTION_COUNTER:
				return transactionCounter != null && !transactionCounter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransactionImpl
