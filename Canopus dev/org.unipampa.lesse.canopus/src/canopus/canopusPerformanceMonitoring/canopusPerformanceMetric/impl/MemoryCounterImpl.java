/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter;

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
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MemoryCounterImpl#getCounterMemory <em>Counter Memory</em>}</li>
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
		return CanopusPerformanceMetricPackage.Literals.MEMORY_COUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public COUNTER_MEMORY getCounterMemory() {
		return counterMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounterMemory(COUNTER_MEMORY newCounterMemory) {
		COUNTER_MEMORY oldCounterMemory = counterMemory;
		counterMemory = newCounterMemory == null ? COUNTER_MEMORY_EDEFAULT : newCounterMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY, oldCounterMemory, counterMemory));
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CanopusPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY:
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
			case CanopusPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY:
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
			case CanopusPerformanceMetricPackage.MEMORY_COUNTER__COUNTER_MEMORY:
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
