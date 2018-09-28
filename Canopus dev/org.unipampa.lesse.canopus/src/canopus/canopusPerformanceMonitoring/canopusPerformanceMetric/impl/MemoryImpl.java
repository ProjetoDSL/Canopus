/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Memory;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MemoryImpl#getMemoryCounter <em>Memory Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryImpl extends MetricImpl implements Memory {
	/**
	 * The cached value of the '{@link #getMemoryCounter() <em>Memory Counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryCounter()
	 * @generated
	 * @ordered
	 */
	protected MemoryCounter memoryCounter;

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
		return CanopusPerformanceMetricPackage.Literals.MEMORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryCounter getMemoryCounter() {
		if (memoryCounter != null && memoryCounter.eIsProxy()) {
			InternalEObject oldMemoryCounter = (InternalEObject)memoryCounter;
			memoryCounter = (MemoryCounter)eResolveProxy(oldMemoryCounter);
			if (memoryCounter != oldMemoryCounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceMetricPackage.MEMORY__MEMORY_COUNTER, oldMemoryCounter, memoryCounter));
			}
		}
		return memoryCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryCounter basicGetMemoryCounter() {
		return memoryCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryCounter(MemoryCounter newMemoryCounter) {
		MemoryCounter oldMemoryCounter = memoryCounter;
		memoryCounter = newMemoryCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMetricPackage.MEMORY__MEMORY_COUNTER, oldMemoryCounter, memoryCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceMetricPackage.MEMORY__MEMORY_COUNTER:
				if (resolve) return getMemoryCounter();
				return basicGetMemoryCounter();
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
			case CanopusPerformanceMetricPackage.MEMORY__MEMORY_COUNTER:
				setMemoryCounter((MemoryCounter)newValue);
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
			case CanopusPerformanceMetricPackage.MEMORY__MEMORY_COUNTER:
				setMemoryCounter((MemoryCounter)null);
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
			case CanopusPerformanceMetricPackage.MEMORY__MEMORY_COUNTER:
				return memoryCounter != null;
		}
		return super.eIsSet(featureID);
	}

} //MemoryImpl