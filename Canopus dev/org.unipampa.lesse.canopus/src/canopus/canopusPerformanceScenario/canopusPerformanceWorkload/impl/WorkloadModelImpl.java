/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTime;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.TestDuration;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadModelImpl#getTestduration <em>Testduration</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadModelImpl#getRampdownusers <em>Rampdownusers</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadModelImpl#getRampdowntime <em>Rampdowntime</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadModelImpl#getRampuptimer <em>Rampuptimer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadModelImpl#getRampupusers <em>Rampupusers</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadModelImpl#getVirtualusers <em>Virtualusers</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkloadModelImpl extends MinimalEObjectImpl.Container implements WorkloadModel {
	/**
	 * The cached value of the '{@link #getTestduration() <em>Testduration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestduration()
	 * @generated
	 * @ordered
	 */
	protected TestDuration testduration;

	/**
	 * The cached value of the '{@link #getRampdownusers() <em>Rampdownusers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampdownusers()
	 * @generated
	 * @ordered
	 */
	protected RampDownUsers rampdownusers;

	/**
	 * The cached value of the '{@link #getRampdowntime() <em>Rampdowntime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampdowntime()
	 * @generated
	 * @ordered
	 */
	protected RampDownTime rampdowntime;

	/**
	 * The cached value of the '{@link #getRampuptimer() <em>Rampuptimer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampuptimer()
	 * @generated
	 * @ordered
	 */
	protected RampUpTimer rampuptimer;

	/**
	 * The cached value of the '{@link #getRampupusers() <em>Rampupusers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampupusers()
	 * @generated
	 * @ordered
	 */
	protected RampUpUsers rampupusers;

	/**
	 * The cached value of the '{@link #getVirtualusers() <em>Virtualusers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualusers()
	 * @generated
	 * @ordered
	 */
	protected VirtualUsers virtualusers;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestDuration getTestduration() {
		return testduration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestduration(TestDuration newTestduration, NotificationChain msgs) {
		TestDuration oldTestduration = testduration;
		testduration = newTestduration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__TESTDURATION, oldTestduration, newTestduration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestduration(TestDuration newTestduration) {
		if (newTestduration != testduration) {
			NotificationChain msgs = null;
			if (testduration != null)
				msgs = ((InternalEObject)testduration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__TESTDURATION, null, msgs);
			if (newTestduration != null)
				msgs = ((InternalEObject)newTestduration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__TESTDURATION, null, msgs);
			msgs = basicSetTestduration(newTestduration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__TESTDURATION, newTestduration, newTestduration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampDownUsers getRampdownusers() {
		return rampdownusers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRampdownusers(RampDownUsers newRampdownusers, NotificationChain msgs) {
		RampDownUsers oldRampdownusers = rampdownusers;
		rampdownusers = newRampdownusers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNUSERS, oldRampdownusers, newRampdownusers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampdownusers(RampDownUsers newRampdownusers) {
		if (newRampdownusers != rampdownusers) {
			NotificationChain msgs = null;
			if (rampdownusers != null)
				msgs = ((InternalEObject)rampdownusers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNUSERS, null, msgs);
			if (newRampdownusers != null)
				msgs = ((InternalEObject)newRampdownusers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNUSERS, null, msgs);
			msgs = basicSetRampdownusers(newRampdownusers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNUSERS, newRampdownusers, newRampdownusers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampDownTime getRampdowntime() {
		return rampdowntime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRampdowntime(RampDownTime newRampdowntime, NotificationChain msgs) {
		RampDownTime oldRampdowntime = rampdowntime;
		rampdowntime = newRampdowntime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNTIME, oldRampdowntime, newRampdowntime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampdowntime(RampDownTime newRampdowntime) {
		if (newRampdowntime != rampdowntime) {
			NotificationChain msgs = null;
			if (rampdowntime != null)
				msgs = ((InternalEObject)rampdowntime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNTIME, null, msgs);
			if (newRampdowntime != null)
				msgs = ((InternalEObject)newRampdowntime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNTIME, null, msgs);
			msgs = basicSetRampdowntime(newRampdowntime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNTIME, newRampdowntime, newRampdowntime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpTimer getRampuptimer() {
		return rampuptimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRampuptimer(RampUpTimer newRampuptimer, NotificationChain msgs) {
		RampUpTimer oldRampuptimer = rampuptimer;
		rampuptimer = newRampuptimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPTIMER, oldRampuptimer, newRampuptimer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampuptimer(RampUpTimer newRampuptimer) {
		if (newRampuptimer != rampuptimer) {
			NotificationChain msgs = null;
			if (rampuptimer != null)
				msgs = ((InternalEObject)rampuptimer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPTIMER, null, msgs);
			if (newRampuptimer != null)
				msgs = ((InternalEObject)newRampuptimer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPTIMER, null, msgs);
			msgs = basicSetRampuptimer(newRampuptimer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPTIMER, newRampuptimer, newRampuptimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpUsers getRampupusers() {
		return rampupusers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRampupusers(RampUpUsers newRampupusers, NotificationChain msgs) {
		RampUpUsers oldRampupusers = rampupusers;
		rampupusers = newRampupusers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPUSERS, oldRampupusers, newRampupusers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampupusers(RampUpUsers newRampupusers) {
		if (newRampupusers != rampupusers) {
			NotificationChain msgs = null;
			if (rampupusers != null)
				msgs = ((InternalEObject)rampupusers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPUSERS, null, msgs);
			if (newRampupusers != null)
				msgs = ((InternalEObject)newRampupusers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPUSERS, null, msgs);
			msgs = basicSetRampupusers(newRampupusers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPUSERS, newRampupusers, newRampupusers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualUsers getVirtualusers() {
		return virtualusers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtualusers(VirtualUsers newVirtualusers, NotificationChain msgs) {
		VirtualUsers oldVirtualusers = virtualusers;
		virtualusers = newVirtualusers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__VIRTUALUSERS, oldVirtualusers, newVirtualusers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualusers(VirtualUsers newVirtualusers) {
		if (newVirtualusers != virtualusers) {
			NotificationChain msgs = null;
			if (virtualusers != null)
				msgs = ((InternalEObject)virtualusers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__VIRTUALUSERS, null, msgs);
			if (newVirtualusers != null)
				msgs = ((InternalEObject)newVirtualusers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__VIRTUALUSERS, null, msgs);
			msgs = basicSetVirtualusers(newVirtualusers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__VIRTUALUSERS, newVirtualusers, newVirtualusers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__TESTDURATION:
				return basicSetTestduration(null, msgs);
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNUSERS:
				return basicSetRampdownusers(null, msgs);
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNTIME:
				return basicSetRampdowntime(null, msgs);
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPTIMER:
				return basicSetRampuptimer(null, msgs);
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPUSERS:
				return basicSetRampupusers(null, msgs);
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__VIRTUALUSERS:
				return basicSetVirtualusers(null, msgs);
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
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__TESTDURATION:
				return getTestduration();
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNUSERS:
				return getRampdownusers();
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNTIME:
				return getRampdowntime();
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPTIMER:
				return getRampuptimer();
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPUSERS:
				return getRampupusers();
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__VIRTUALUSERS:
				return getVirtualusers();
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__NAME:
				return getName();
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
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__TESTDURATION:
				setTestduration((TestDuration)newValue);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNUSERS:
				setRampdownusers((RampDownUsers)newValue);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNTIME:
				setRampdowntime((RampDownTime)newValue);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPTIMER:
				setRampuptimer((RampUpTimer)newValue);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPUSERS:
				setRampupusers((RampUpUsers)newValue);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__VIRTUALUSERS:
				setVirtualusers((VirtualUsers)newValue);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__NAME:
				setName((String)newValue);
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
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__TESTDURATION:
				setTestduration((TestDuration)null);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNUSERS:
				setRampdownusers((RampDownUsers)null);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNTIME:
				setRampdowntime((RampDownTime)null);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPTIMER:
				setRampuptimer((RampUpTimer)null);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPUSERS:
				setRampupusers((RampUpUsers)null);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__VIRTUALUSERS:
				setVirtualusers((VirtualUsers)null);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__NAME:
				setName(NAME_EDEFAULT);
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
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__TESTDURATION:
				return testduration != null;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNUSERS:
				return rampdownusers != null;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNTIME:
				return rampdowntime != null;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPTIMER:
				return rampuptimer != null;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPUSERS:
				return rampupusers != null;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__VIRTUALUSERS:
				return virtualusers != null;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WorkloadModelImpl
