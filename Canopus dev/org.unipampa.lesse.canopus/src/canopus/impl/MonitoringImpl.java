/**
 */
package canopus.impl;

import canopus.CanopusPackage;
import canopus.Monitoring;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.impl.MonitoringImpl#getSuts <em>Suts</em>}</li>
 *   <li>{@link canopus.impl.MonitoringImpl#getLoadGenerators <em>Load Generators</em>}</li>
 *   <li>{@link canopus.impl.MonitoringImpl#getMonitors <em>Monitors</em>}</li>
 *   <li>{@link canopus.impl.MonitoringImpl#getMetricModel <em>Metric Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoringImpl extends DiagramImpl implements Monitoring {
	/**
	 * The cached value of the '{@link #getSuts() <em>Suts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuts()
	 * @generated
	 * @ordered
	 */
	protected EList<SUT> suts;

	/**
	 * The cached value of the '{@link #getLoadGenerators() <em>Load Generators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadGenerators()
	 * @generated
	 * @ordered
	 */
	protected LoadGenerator loadGenerators;

	/**
	 * The cached value of the '{@link #getMonitors() <em>Monitors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitors()
	 * @generated
	 * @ordered
	 */
	protected Monitor monitors;

	/**
	 * The cached value of the '{@link #getMetricModel() <em>Metric Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricModel()
	 * @generated
	 * @ordered
	 */
	protected EList<MetricModel> metricModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPackage.Literals.MONITORING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SUT> getSuts() {
		if (suts == null) {
			suts = new EObjectContainmentEList<SUT>(SUT.class, this, CanopusPackage.MONITORING__SUTS);
		}
		return suts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadGenerator getLoadGenerators() {
		return loadGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadGenerators(LoadGenerator newLoadGenerators, NotificationChain msgs) {
		LoadGenerator oldLoadGenerators = loadGenerators;
		loadGenerators = newLoadGenerators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPackage.MONITORING__LOAD_GENERATORS, oldLoadGenerators, newLoadGenerators);
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
	public void setLoadGenerators(LoadGenerator newLoadGenerators) {
		if (newLoadGenerators != loadGenerators) {
			NotificationChain msgs = null;
			if (loadGenerators != null)
				msgs = ((InternalEObject)loadGenerators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPackage.MONITORING__LOAD_GENERATORS, null, msgs);
			if (newLoadGenerators != null)
				msgs = ((InternalEObject)newLoadGenerators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPackage.MONITORING__LOAD_GENERATORS, null, msgs);
			msgs = basicSetLoadGenerators(newLoadGenerators, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPackage.MONITORING__LOAD_GENERATORS, newLoadGenerators, newLoadGenerators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Monitor getMonitors() {
		return monitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitors(Monitor newMonitors, NotificationChain msgs) {
		Monitor oldMonitors = monitors;
		monitors = newMonitors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPackage.MONITORING__MONITORS, oldMonitors, newMonitors);
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
	public void setMonitors(Monitor newMonitors) {
		if (newMonitors != monitors) {
			NotificationChain msgs = null;
			if (monitors != null)
				msgs = ((InternalEObject)monitors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPackage.MONITORING__MONITORS, null, msgs);
			if (newMonitors != null)
				msgs = ((InternalEObject)newMonitors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPackage.MONITORING__MONITORS, null, msgs);
			msgs = basicSetMonitors(newMonitors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPackage.MONITORING__MONITORS, newMonitors, newMonitors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetricModel> getMetricModel() {
		if (metricModel == null) {
			metricModel = new EObjectContainmentEList<MetricModel>(MetricModel.class, this, CanopusPackage.MONITORING__METRIC_MODEL);
		}
		return metricModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPackage.MONITORING__SUTS:
				return ((InternalEList<?>)getSuts()).basicRemove(otherEnd, msgs);
			case CanopusPackage.MONITORING__LOAD_GENERATORS:
				return basicSetLoadGenerators(null, msgs);
			case CanopusPackage.MONITORING__MONITORS:
				return basicSetMonitors(null, msgs);
			case CanopusPackage.MONITORING__METRIC_MODEL:
				return ((InternalEList<?>)getMetricModel()).basicRemove(otherEnd, msgs);
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
			case CanopusPackage.MONITORING__SUTS:
				return getSuts();
			case CanopusPackage.MONITORING__LOAD_GENERATORS:
				return getLoadGenerators();
			case CanopusPackage.MONITORING__MONITORS:
				return getMonitors();
			case CanopusPackage.MONITORING__METRIC_MODEL:
				return getMetricModel();
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
			case CanopusPackage.MONITORING__SUTS:
				getSuts().clear();
				getSuts().addAll((Collection<? extends SUT>)newValue);
				return;
			case CanopusPackage.MONITORING__LOAD_GENERATORS:
				setLoadGenerators((LoadGenerator)newValue);
				return;
			case CanopusPackage.MONITORING__MONITORS:
				setMonitors((Monitor)newValue);
				return;
			case CanopusPackage.MONITORING__METRIC_MODEL:
				getMetricModel().clear();
				getMetricModel().addAll((Collection<? extends MetricModel>)newValue);
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
			case CanopusPackage.MONITORING__SUTS:
				getSuts().clear();
				return;
			case CanopusPackage.MONITORING__LOAD_GENERATORS:
				setLoadGenerators((LoadGenerator)null);
				return;
			case CanopusPackage.MONITORING__MONITORS:
				setMonitors((Monitor)null);
				return;
			case CanopusPackage.MONITORING__METRIC_MODEL:
				getMetricModel().clear();
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
			case CanopusPackage.MONITORING__SUTS:
				return suts != null && !suts.isEmpty();
			case CanopusPackage.MONITORING__LOAD_GENERATORS:
				return loadGenerators != null;
			case CanopusPackage.MONITORING__MONITORS:
				return monitors != null;
			case CanopusPackage.MONITORING__METRIC_MODEL:
				return metricModel != null && !metricModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MonitoringImpl
