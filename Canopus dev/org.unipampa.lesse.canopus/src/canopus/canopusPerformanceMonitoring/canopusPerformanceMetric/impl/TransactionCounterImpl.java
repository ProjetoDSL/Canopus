/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
	 * The cached value of the '{@link #getCounterTransaction() <em>Counter Transaction</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<COUNTER_TRANSACTION> counterTransaction;

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
	public EList<COUNTER_TRANSACTION> getCounterTransaction() {
		if (counterTransaction == null) {
			counterTransaction = new EDataTypeUniqueEList<COUNTER_TRANSACTION>(COUNTER_TRANSACTION.class, this, CanopusPerformanceMetricPackage.TRANSACTION_COUNTER__COUNTER_TRANSACTION);
		}
		return counterTransaction;
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CanopusPerformanceMetricPackage.TRANSACTION_COUNTER__COUNTER_TRANSACTION:
				getCounterTransaction().clear();
				getCounterTransaction().addAll((Collection<? extends COUNTER_TRANSACTION>)newValue);
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
				getCounterTransaction().clear();
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
				return counterTransaction != null && !counterTransaction.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (counterTransaction: ");
		result.append(counterTransaction);
		result.append(')');
		return result.toString();
	}

} //TransactionCounterImpl
