/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl;

import java.util.Collection;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk_IO_Counter;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.DiskImpl#getDisk_io_counter <em>Disk io counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiskImpl extends MetricImpl implements Disk {
	/**
	 * The cached value of the '{@link #getDisk_io_counter() <em>Disk io counter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_io_counter()
	 * @generated
	 * @ordered
	 */
	protected EList<Disk_IO_Counter> disk_io_counter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenmlperfPerformanceMetricPackage.Literals.DISK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Disk_IO_Counter> getDisk_io_counter() {
		if (disk_io_counter == null) {
			disk_io_counter = new EObjectResolvingEList<Disk_IO_Counter>(Disk_IO_Counter.class, this, OpenmlperfPerformanceMetricPackage.DISK__DISK_IO_COUNTER);
		}
		return disk_io_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenmlperfPerformanceMetricPackage.DISK__DISK_IO_COUNTER:
				return getDisk_io_counter();
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
			case OpenmlperfPerformanceMetricPackage.DISK__DISK_IO_COUNTER:
				getDisk_io_counter().clear();
				getDisk_io_counter().addAll((Collection<? extends Disk_IO_Counter>)newValue);
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
			case OpenmlperfPerformanceMetricPackage.DISK__DISK_IO_COUNTER:
				getDisk_io_counter().clear();
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
			case OpenmlperfPerformanceMetricPackage.DISK__DISK_IO_COUNTER:
				return disk_io_counter != null && !disk_io_counter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiskImpl
