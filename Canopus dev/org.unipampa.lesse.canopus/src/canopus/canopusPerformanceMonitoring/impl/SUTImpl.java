/**
 */
package canopus.canopusPerformanceMonitoring.impl;

import canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage;
import canopus.canopusPerformanceMonitoring.HARDWARE;
import canopus.canopusPerformanceMonitoring.MetricModel;
import canopus.canopusPerformanceMonitoring.SUT;
import canopus.canopusPerformanceMonitoring.SUT_TYPE;

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
 * An implementation of the model object '<em><b>SUT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.impl.SUTImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.impl.SUTImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.impl.SUTImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.impl.SUTImpl#getSut <em>Sut</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.impl.SUTImpl#getMetricmodel <em>Metricmodel</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.impl.SUTImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SUTImpl extends MinimalEObjectImpl.Container implements SUT {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SUT_TYPE TYPE_EDEFAULT = SUT_TYPE.DESKTOPAPP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SUT_TYPE type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SUTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceMonitoringPackage.Literals.SUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMonitoringPackage.SUT__HOSTNAME, oldHostname, hostname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMonitoringPackage.SUT__IP, oldIp, ip));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMonitoringPackage.SUT__HARDWARE, oldHardware, hardware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SUT> getSut() {
		if (sut == null) {
			sut = new EObjectResolvingEList<SUT>(SUT.class, this, CanopusPerformanceMonitoringPackage.SUT__SUT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceMonitoringPackage.SUT__METRICMODEL, oldMetricmodel, newMetricmodel);
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
				msgs = ((InternalEObject)metricmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceMonitoringPackage.SUT__METRICMODEL, null, msgs);
			if (newMetricmodel != null)
				msgs = ((InternalEObject)newMetricmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceMonitoringPackage.SUT__METRICMODEL, null, msgs);
			msgs = basicSetMetricmodel(newMetricmodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMonitoringPackage.SUT__METRICMODEL, newMetricmodel, newMetricmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SUT_TYPE getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(SUT_TYPE newType) {
		SUT_TYPE oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMonitoringPackage.SUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceMonitoringPackage.SUT__METRICMODEL:
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
			case CanopusPerformanceMonitoringPackage.SUT__HOSTNAME:
				return getHostname();
			case CanopusPerformanceMonitoringPackage.SUT__IP:
				return getIp();
			case CanopusPerformanceMonitoringPackage.SUT__HARDWARE:
				return getHardware();
			case CanopusPerformanceMonitoringPackage.SUT__SUT:
				return getSut();
			case CanopusPerformanceMonitoringPackage.SUT__METRICMODEL:
				return getMetricmodel();
			case CanopusPerformanceMonitoringPackage.SUT__TYPE:
				return getType();
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
			case CanopusPerformanceMonitoringPackage.SUT__HOSTNAME:
				setHostname((String)newValue);
				return;
			case CanopusPerformanceMonitoringPackage.SUT__IP:
				setIp((String)newValue);
				return;
			case CanopusPerformanceMonitoringPackage.SUT__HARDWARE:
				setHardware((HARDWARE)newValue);
				return;
			case CanopusPerformanceMonitoringPackage.SUT__SUT:
				getSut().clear();
				getSut().addAll((Collection<? extends SUT>)newValue);
				return;
			case CanopusPerformanceMonitoringPackage.SUT__METRICMODEL:
				setMetricmodel((MetricModel)newValue);
				return;
			case CanopusPerformanceMonitoringPackage.SUT__TYPE:
				setType((SUT_TYPE)newValue);
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
			case CanopusPerformanceMonitoringPackage.SUT__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case CanopusPerformanceMonitoringPackage.SUT__IP:
				setIp(IP_EDEFAULT);
				return;
			case CanopusPerformanceMonitoringPackage.SUT__HARDWARE:
				setHardware(HARDWARE_EDEFAULT);
				return;
			case CanopusPerformanceMonitoringPackage.SUT__SUT:
				getSut().clear();
				return;
			case CanopusPerformanceMonitoringPackage.SUT__METRICMODEL:
				setMetricmodel((MetricModel)null);
				return;
			case CanopusPerformanceMonitoringPackage.SUT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case CanopusPerformanceMonitoringPackage.SUT__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case CanopusPerformanceMonitoringPackage.SUT__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case CanopusPerformanceMonitoringPackage.SUT__HARDWARE:
				return hardware != HARDWARE_EDEFAULT;
			case CanopusPerformanceMonitoringPackage.SUT__SUT:
				return sut != null && !sut.isEmpty();
			case CanopusPerformanceMonitoringPackage.SUT__METRICMODEL:
				return metricmodel != null;
			case CanopusPerformanceMonitoringPackage.SUT__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SUTImpl
