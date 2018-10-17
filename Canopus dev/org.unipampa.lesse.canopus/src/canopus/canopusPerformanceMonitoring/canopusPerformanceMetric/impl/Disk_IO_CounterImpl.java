/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk_IO_Counter;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disk IO Counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.Disk_IO_CounterImpl#getCounterDisk <em>Counter Disk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Disk_IO_CounterImpl extends CounterImpl implements Disk_IO_Counter {
	/**
	 * The cached value of the '{@link #getCounterDisk() <em>Counter Disk</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterDisk()
	 * @generated
	 * @ordered
	 */
	protected EList<COUNTER_DISK> counterDisk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Disk_IO_CounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceMetricPackage.Literals.DISK_IO_COUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COUNTER_DISK> getCounterDisk() {
		if (counterDisk == null) {
			counterDisk = new EDataTypeUniqueEList<COUNTER_DISK>(COUNTER_DISK.class, this, CanopusPerformanceMetricPackage.DISK_IO_COUNTER__COUNTER_DISK);
		}
		return counterDisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceMetricPackage.DISK_IO_COUNTER__COUNTER_DISK:
				return getCounterDisk();
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
			case CanopusPerformanceMetricPackage.DISK_IO_COUNTER__COUNTER_DISK:
				getCounterDisk().clear();
				getCounterDisk().addAll((Collection<? extends COUNTER_DISK>)newValue);
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
			case CanopusPerformanceMetricPackage.DISK_IO_COUNTER__COUNTER_DISK:
				getCounterDisk().clear();
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
			case CanopusPerformanceMetricPackage.DISK_IO_COUNTER__COUNTER_DISK:
				return counterDisk != null && !counterDisk.isEmpty();
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
		result.append(" (counterDisk: ");
		result.append(counterDisk);
		result.append(')');
		return result.toString();
	}

} //Disk_IO_CounterImpl
