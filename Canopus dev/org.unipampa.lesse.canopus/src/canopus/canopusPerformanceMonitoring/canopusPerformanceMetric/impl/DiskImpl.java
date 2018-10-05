/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk_IO_Counter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.DiskImpl#getDisk_io_counter <em>Disk io counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiskImpl extends MetricImpl implements Disk {
	/**
	 * The cached value of the '{@link #getDisk_io_counter() <em>Disk io counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_io_counter()
	 * @generated
	 * @ordered
	 */
	protected Disk_IO_Counter disk_io_counter;

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
		return CanopusPerformanceMetricPackage.Literals.DISK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disk_IO_Counter getDisk_io_counter() {
		if (disk_io_counter != null && disk_io_counter.eIsProxy()) {
			InternalEObject oldDisk_io_counter = (InternalEObject)disk_io_counter;
			disk_io_counter = (Disk_IO_Counter)eResolveProxy(oldDisk_io_counter);
			if (disk_io_counter != oldDisk_io_counter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceMetricPackage.DISK__DISK_IO_COUNTER, oldDisk_io_counter, disk_io_counter));
			}
		}
		return disk_io_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disk_IO_Counter basicGetDisk_io_counter() {
		return disk_io_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_io_counter(Disk_IO_Counter newDisk_io_counter) {
		Disk_IO_Counter oldDisk_io_counter = disk_io_counter;
		disk_io_counter = newDisk_io_counter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMetricPackage.DISK__DISK_IO_COUNTER, oldDisk_io_counter, disk_io_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceMetricPackage.DISK__DISK_IO_COUNTER:
				if (resolve) return getDisk_io_counter();
				return basicGetDisk_io_counter();
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
			case CanopusPerformanceMetricPackage.DISK__DISK_IO_COUNTER:
				setDisk_io_counter((Disk_IO_Counter)newValue);
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
			case CanopusPerformanceMetricPackage.DISK__DISK_IO_COUNTER:
				setDisk_io_counter((Disk_IO_Counter)null);
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
			case CanopusPerformanceMetricPackage.DISK__DISK_IO_COUNTER:
				return disk_io_counter != null;
		}
		return super.eIsSet(featureID);
	}

} //DiskImpl
