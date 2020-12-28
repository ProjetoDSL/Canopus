/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.MemoryCounter;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MemoryCounterImpl#getCounterMemory <em>Counter Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryCounterImpl extends CounterImpl implements MemoryCounter {
	/**
	 * The default value of the '{@link #getCounterMemory() <em>Counter Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterMemory()
	 * @generated
	 * @ordered
	 */
	protected static final COUNTER_MEMORY COUNTER_MEMORY_EDEFAULT = COUNTER_MEMORY.AVALIABLE_MBYTES_COUNTER;

	/**
	 * The cached value of the '{@link #getCounterMemory() <em>Counter Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterMemory()
	 * @generated
	 * @ordered
	 */
	protected COUNTER_MEMORY counterMemory = COUNTER_MEMORY_EDEFAULT;

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
		return OpenmlperfPerformanceMetricPackage.Literals.MEMORY_COUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COUNTER_MEMORY getCounterMemory() {
		return counterMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterMemory(COUNTER_MEMORY newCounterMemory) {
		COUNTER_MEMORY oldCounterMemory = counterMemory;
		counterMemory = newCounterMemory == null ? COUNTER_MEMORY_EDEFAULT : newCounterMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY, oldCounterMemory, counterMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenmlperfPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY:
				return getCounterMemory();
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
			case OpenmlperfPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY:
				setCounterMemory((COUNTER_MEMORY)newValue);
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
			case OpenmlperfPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY:
				setCounterMemory(COUNTER_MEMORY_EDEFAULT);
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
			case OpenmlperfPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY:
				return counterMemory != COUNTER_MEMORY_EDEFAULT;
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
		result.append(" (counterMemory: ");
		result.append(counterMemory);
		result.append(')');
		return result.toString();
	}

} //MemoryCounterImpl
