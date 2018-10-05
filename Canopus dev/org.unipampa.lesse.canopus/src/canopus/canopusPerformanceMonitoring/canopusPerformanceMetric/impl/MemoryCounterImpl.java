/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MemoryCounterImpl#getCounterMemory <em>Counter Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryCounterImpl extends CounterImpl implements MemoryCounter {
	/**
	 * The cached value of the '{@link #getCounterMemory() <em>Counter Memory</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterMemory()
	 * @generated
	 * @ordered
	 */
	protected EList<COUNTER_MEMORY> counterMemory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryCounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceMetricPackage.Literals.MEMORY_COUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COUNTER_MEMORY> getCounterMemory() {
		if (counterMemory == null) {
			counterMemory = new EDataTypeUniqueEList<COUNTER_MEMORY>(COUNTER_MEMORY.class, this, CanopusPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY);
		}
		return counterMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY:
				return getCounterMemory();
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
			case CanopusPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY:
				getCounterMemory().clear();
				getCounterMemory().addAll((Collection<? extends COUNTER_MEMORY>)newValue);
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
			case CanopusPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY:
				getCounterMemory().clear();
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
			case CanopusPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY:
				return counterMemory != null && !counterMemory.isEmpty();
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
		result.append(" (counterMemory: ");
		result.append(counterMemory);
		result.append(')');
		return result.toString();
	}

} //MemoryCounterImpl
