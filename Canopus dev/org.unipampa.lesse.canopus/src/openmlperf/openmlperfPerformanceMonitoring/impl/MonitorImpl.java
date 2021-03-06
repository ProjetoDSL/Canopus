/**
 */
package openmlperf.openmlperfPerformanceMonitoring.impl;

import java.util.Collection;

import openmlperf.openmlperfPerformanceMonitoring.HARDWARE;
import openmlperf.openmlperfPerformanceMonitoring.Monitor;
import openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage;
import openmlperf.openmlperfPerformanceMonitoring.SUT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MonitorImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MonitorImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MonitorImpl#getSut <em>Sut</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MonitorImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MonitorImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitorImpl extends MinimalEObjectImpl.Container implements Monitor {
	/**
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSut() <em>Sut</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSut()
	 * @generated
	 * @ordered
	 */
	protected EList<SUT> sut;

	/**
	 * The default value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected static final HARDWARE HARDWARE_EDEFAULT = HARDWARE.PHYSICAL_MACHINE;

	/**
	 * The cached value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected HARDWARE hardware = HARDWARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "Machine responsible for monitoring the performance metrics of the SUT. This object is optional, since the Load Generator object, besides generating workload for virtual users, can also play the role of monitoring.";

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenmlperfPerformanceMonitoringPackage.Literals.MONITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceMonitoringPackage.MONITOR__HOSTNAME, oldHostname, hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceMonitoringPackage.MONITOR__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SUT> getSut() {
		if (sut == null) {
			sut = new EObjectResolvingEList<SUT>(SUT.class, this, OpenmlperfPerformanceMonitoringPackage.MONITOR__SUT);
		}
		return sut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HARDWARE getHardware() {
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardware(HARDWARE newHardware) {
		HARDWARE oldHardware = hardware;
		hardware = newHardware == null ? HARDWARE_EDEFAULT : newHardware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceMonitoringPackage.MONITOR__HARDWARE, oldHardware, hardware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__HOSTNAME:
				return getHostname();
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__IP:
				return getIp();
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__SUT:
				return getSut();
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__HARDWARE:
				return getHardware();
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__DESCRIPTION:
				return getDescription();
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
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__HOSTNAME:
				setHostname((String)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__IP:
				setIp((String)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__SUT:
				getSut().clear();
				getSut().addAll((Collection<? extends SUT>)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__HARDWARE:
				setHardware((HARDWARE)newValue);
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
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__IP:
				setIp(IP_EDEFAULT);
				return;
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__SUT:
				getSut().clear();
				return;
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__HARDWARE:
				setHardware(HARDWARE_EDEFAULT);
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
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__SUT:
				return sut != null && !sut.isEmpty();
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__HARDWARE:
				return hardware != HARDWARE_EDEFAULT;
			case OpenmlperfPerformanceMonitoringPackage.MONITOR__DESCRIPTION:
				return isSetDescription();
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
		result.append(" (hostname: ");
		result.append(hostname);
		result.append(", ip: ");
		result.append(ip);
		result.append(", hardware: ");
		result.append(hardware);
		result.append(", description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MonitorImpl
