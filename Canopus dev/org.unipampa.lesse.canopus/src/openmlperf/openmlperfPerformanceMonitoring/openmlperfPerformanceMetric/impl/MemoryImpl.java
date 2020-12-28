/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl;

import java.util.Collection;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Memory;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.MemoryCounter;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MemoryImpl#getMemoryCounter <em>Memory Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryImpl extends MetricImpl implements Memory {
	/**
	 * The cached value of the '{@link #getMemoryCounter() <em>Memory Counter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryCounter()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryCounter> memoryCounter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenmlperfPerformanceMetricPackage.Literals.MEMORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryCounter> getMemoryCounter() {
		if (memoryCounter == null) {
			memoryCounter = new EObjectResolvingEList<MemoryCounter>(MemoryCounter.class, this, OpenmlperfPerformanceMetricPackage.MEMORY__MEMORY_COUNTER);
		}
		return memoryCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenmlperfPerformanceMetricPackage.MEMORY__MEMORY_COUNTER:
				return getMemoryCounter();
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
			case OpenmlperfPerformanceMetricPackage.MEMORY__MEMORY_COUNTER:
				getMemoryCounter().clear();
				getMemoryCounter().addAll((Collection<? extends MemoryCounter>)newValue);
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
			case OpenmlperfPerformanceMetricPackage.MEMORY__MEMORY_COUNTER:
				getMemoryCounter().clear();
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
			case OpenmlperfPerformanceMetricPackage.MEMORY__MEMORY_COUNTER:
				return memoryCounter != null && !memoryCounter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MemoryImpl
