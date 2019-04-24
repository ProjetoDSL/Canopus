/**
 */
package canopus.canopusPerformanceMonitoring.impl;

import canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage;
import canopus.canopusPerformanceMonitoring.HARDWARE;
import canopus.canopusPerformanceMonitoring.LoadGenerator;
import canopus.canopusPerformanceMonitoring.MetricModel;
import canopus.canopusPerformanceMonitoring.Monitor;
import canopus.canopusPerformanceMonitoring.SUT;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.impl.LoadGeneratorImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.impl.LoadGeneratorImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.impl.LoadGeneratorImpl#isIsMonitor <em>Is Monitor</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.impl.LoadGeneratorImpl#getSut <em>Sut</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.impl.LoadGeneratorImpl#getMetricmodel <em>Metricmodel</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.impl.LoadGeneratorImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.impl.LoadGeneratorImpl#getMonitor <em>Monitor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadGeneratorImpl extends MinimalEObjectImpl.Container implements LoadGenerator {
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
	 * The default value of the '{@link #isIsMonitor() <em>Is Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMonitor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MONITOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMonitor() <em>Is Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMonitor()
	 * @generated
	 * @ordered
	 */
	protected boolean isMonitor = IS_MONITOR_EDEFAULT;

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
	 * The cached value of the '{@link #getMetricmodel() <em>Metricmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricmodel()
	 * @generated
	 * @ordered
	 */
	protected MetricModel metricmodel;

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
	 * The cached value of the '{@link #getMonitor() <em>Monitor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitor()
	 * @generated
	 * @ordered
	 */
	protected Monitor monitor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceMonitoringPackage.Literals.LOAD_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__HOSTNAME, oldHostname, hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsMonitor() {
		return isMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMonitor(boolean newIsMonitor) {
		boolean oldIsMonitor = isMonitor;
		isMonitor = newIsMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__IS_MONITOR, oldIsMonitor, isMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SUT> getSut() {
		if (sut == null) {
			sut = new EObjectResolvingEList<SUT>(SUT.class, this, CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__SUT);
		}
		return sut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetricModel getMetricmodel() {
		return metricmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetricmodel(MetricModel newMetricmodel, NotificationChain msgs) {
		MetricModel oldMetricmodel = metricmodel;
		metricmodel = newMetricmodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__METRICMODEL, oldMetricmodel, newMetricmodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetricmodel(MetricModel newMetricmodel) {
		if (newMetricmodel != metricmodel) {
			NotificationChain msgs = null;
			if (metricmodel != null)
				msgs = ((InternalEObject)metricmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__METRICMODEL, null, msgs);
			if (newMetricmodel != null)
				msgs = ((InternalEObject)newMetricmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__METRICMODEL, null, msgs);
			msgs = basicSetMetricmodel(newMetricmodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__METRICMODEL, newMetricmodel, newMetricmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HARDWARE getHardware() {
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardware(HARDWARE newHardware) {
		HARDWARE oldHardware = hardware;
		hardware = newHardware == null ? HARDWARE_EDEFAULT : newHardware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__HARDWARE, oldHardware, hardware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Monitor getMonitor() {
		if (monitor != null && monitor.eIsProxy()) {
			InternalEObject oldMonitor = (InternalEObject)monitor;
			monitor = (Monitor)eResolveProxy(oldMonitor);
			if (monitor != oldMonitor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__MONITOR, oldMonitor, monitor));
			}
		}
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor basicGetMonitor() {
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitor(Monitor newMonitor) {
		Monitor oldMonitor = monitor;
		monitor = newMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__MONITOR, oldMonitor, monitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__METRICMODEL:
				return basicSetMetricmodel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__HOSTNAME:
				return getHostname();
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__IP:
				return getIp();
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__IS_MONITOR:
				return isIsMonitor();
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__SUT:
				return getSut();
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__METRICMODEL:
				return getMetricmodel();
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__HARDWARE:
				return getHardware();
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__MONITOR:
				if (resolve) return getMonitor();
				return basicGetMonitor();
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
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__HOSTNAME:
				setHostname((String)newValue);
				return;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__IP:
				setIp((String)newValue);
				return;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__IS_MONITOR:
				setIsMonitor((Boolean)newValue);
				return;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__SUT:
				getSut().clear();
				getSut().addAll((Collection<? extends SUT>)newValue);
				return;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__METRICMODEL:
				setMetricmodel((MetricModel)newValue);
				return;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__HARDWARE:
				setHardware((HARDWARE)newValue);
				return;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__MONITOR:
				setMonitor((Monitor)newValue);
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
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__IP:
				setIp(IP_EDEFAULT);
				return;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__IS_MONITOR:
				setIsMonitor(IS_MONITOR_EDEFAULT);
				return;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__SUT:
				getSut().clear();
				return;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__METRICMODEL:
				setMetricmodel((MetricModel)null);
				return;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__HARDWARE:
				setHardware(HARDWARE_EDEFAULT);
				return;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__MONITOR:
				setMonitor((Monitor)null);
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
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__IS_MONITOR:
				return isMonitor != IS_MONITOR_EDEFAULT;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__SUT:
				return sut != null && !sut.isEmpty();
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__METRICMODEL:
				return metricmodel != null;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__HARDWARE:
				return hardware != HARDWARE_EDEFAULT;
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR__MONITOR:
				return monitor != null;
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
		result.append(", isMonitor: ");
		result.append(isMonitor);
		result.append(", hardware: ");
		result.append(hardware);
		result.append(')');
		return result.toString();
	}

} //LoadGeneratorImpl
