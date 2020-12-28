/**
 */
package openmlperf.impl;

import java.util.Collection;

import openmlperf.Monitoring;
import openmlperf.OpenmlperfPackage;

import openmlperf.openmlperfPerformanceMonitoring.LoadGenerator;
import openmlperf.openmlperfPerformanceMonitoring.MetricModel;
import openmlperf.openmlperfPerformanceMonitoring.Monitor;
import openmlperf.openmlperfPerformanceMonitoring.SUT;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link openmlperf.impl.MonitoringImpl#getSuts <em>Suts</em>}</li>
 *   <li>{@link openmlperf.impl.MonitoringImpl#getLoadGenerators <em>Load Generators</em>}</li>
 *   <li>{@link openmlperf.impl.MonitoringImpl#getMonitors <em>Monitors</em>}</li>
 *   <li>{@link openmlperf.impl.MonitoringImpl#getMetricModel <em>Metric Model</em>}</li>
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
	 * The cached value of the '{@link #getLoadGenerators() <em>Load Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadGenerator> loadGenerators;

	/**
	 * The cached value of the '{@link #getMonitors() <em>Monitors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitors()
	 * @generated
	 * @ordered
	 */
	protected EList<Monitor> monitors;

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
		return OpenmlperfPackage.Literals.MONITORING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SUT> getSuts() {
		if (suts == null) {
			suts = new EObjectContainmentEList<SUT>(SUT.class, this, OpenmlperfPackage.MONITORING__SUTS);
		}
		return suts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadGenerator> getLoadGenerators() {
		if (loadGenerators == null) {
			loadGenerators = new EObjectContainmentEList<LoadGenerator>(LoadGenerator.class, this, OpenmlperfPackage.MONITORING__LOAD_GENERATORS);
		}
		return loadGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Monitor> getMonitors() {
		if (monitors == null) {
			monitors = new EObjectContainmentEList<Monitor>(Monitor.class, this, OpenmlperfPackage.MONITORING__MONITORS);
		}
		return monitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetricModel> getMetricModel() {
		if (metricModel == null) {
			metricModel = new EObjectContainmentEList<MetricModel>(MetricModel.class, this, OpenmlperfPackage.MONITORING__METRIC_MODEL);
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
			case OpenmlperfPackage.MONITORING__SUTS:
				return ((InternalEList<?>)getSuts()).basicRemove(otherEnd, msgs);
			case OpenmlperfPackage.MONITORING__LOAD_GENERATORS:
				return ((InternalEList<?>)getLoadGenerators()).basicRemove(otherEnd, msgs);
			case OpenmlperfPackage.MONITORING__MONITORS:
				return ((InternalEList<?>)getMonitors()).basicRemove(otherEnd, msgs);
			case OpenmlperfPackage.MONITORING__METRIC_MODEL:
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
			case OpenmlperfPackage.MONITORING__SUTS:
				return getSuts();
			case OpenmlperfPackage.MONITORING__LOAD_GENERATORS:
				return getLoadGenerators();
			case OpenmlperfPackage.MONITORING__MONITORS:
				return getMonitors();
			case OpenmlperfPackage.MONITORING__METRIC_MODEL:
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
			case OpenmlperfPackage.MONITORING__SUTS:
				getSuts().clear();
				getSuts().addAll((Collection<? extends SUT>)newValue);
				return;
			case OpenmlperfPackage.MONITORING__LOAD_GENERATORS:
				getLoadGenerators().clear();
				getLoadGenerators().addAll((Collection<? extends LoadGenerator>)newValue);
				return;
			case OpenmlperfPackage.MONITORING__MONITORS:
				getMonitors().clear();
				getMonitors().addAll((Collection<? extends Monitor>)newValue);
				return;
			case OpenmlperfPackage.MONITORING__METRIC_MODEL:
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
			case OpenmlperfPackage.MONITORING__SUTS:
				getSuts().clear();
				return;
			case OpenmlperfPackage.MONITORING__LOAD_GENERATORS:
				getLoadGenerators().clear();
				return;
			case OpenmlperfPackage.MONITORING__MONITORS:
				getMonitors().clear();
				return;
			case OpenmlperfPackage.MONITORING__METRIC_MODEL:
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
			case OpenmlperfPackage.MONITORING__SUTS:
				return suts != null && !suts.isEmpty();
			case OpenmlperfPackage.MONITORING__LOAD_GENERATORS:
				return loadGenerators != null && !loadGenerators.isEmpty();
			case OpenmlperfPackage.MONITORING__MONITORS:
				return monitors != null && !monitors.isEmpty();
			case OpenmlperfPackage.MONITORING__METRIC_MODEL:
				return metricModel != null && !metricModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MonitoringImpl
