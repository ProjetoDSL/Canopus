/**
 */
package canopus.canopusPerformanceScenario.impl;

import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;
import canopus.canopusPerformanceScenario.Workload;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTimer;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getRampUpTimer <em>Ramp Up Timer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getRampDownUsers <em>Ramp Down Users</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getRampUpUsers <em>Ramp Up Users</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getRampDownTimer <em>Ramp Down Timer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getTime <em>Time</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getVirtualUsers <em>Virtual Users</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkloadImpl extends MinimalEObjectImpl.Container implements Workload {
	/**
	 * The cached value of the '{@link #getRampUpTimer() <em>Ramp Up Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampUpTimer()
	 * @generated
	 * @ordered
	 */
	protected RampUpTimer rampUpTimer;

	/**
	 * The cached value of the '{@link #getRampDownUsers() <em>Ramp Down Users</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampDownUsers()
	 * @generated
	 * @ordered
	 */
	protected RampDownUsers rampDownUsers;

	/**
	 * The cached value of the '{@link #getRampUpUsers() <em>Ramp Up Users</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampUpUsers()
	 * @generated
	 * @ordered
	 */
	protected RampUpUsers rampUpUsers;

	/**
	 * The cached value of the '{@link #getRampDownTimer() <em>Ramp Down Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampDownTimer()
	 * @generated
	 * @ordered
	 */
	protected RampDownTimer rampDownTimer;

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
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualUsers() <em>Virtual Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualUsers()
	 * @generated
	 * @ordered
	 */
	protected static final int VIRTUAL_USERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVirtualUsers() <em>Virtual Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualUsers()
	 * @generated
	 * @ordered
	 */
	protected int virtualUsers = VIRTUAL_USERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScenarioPackage.Literals.WORKLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RampUpTimer getRampUpTimer() {
		return rampUpTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRampUpTimer(RampUpTimer newRampUpTimer, NotificationChain msgs) {
		RampUpTimer oldRampUpTimer = rampUpTimer;
		rampUpTimer = newRampUpTimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER, oldRampUpTimer, newRampUpTimer);
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
	public void setRampUpTimer(RampUpTimer newRampUpTimer) {
		if (newRampUpTimer != rampUpTimer) {
			NotificationChain msgs = null;
			if (rampUpTimer != null)
				msgs = ((InternalEObject)rampUpTimer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER, null, msgs);
			if (newRampUpTimer != null)
				msgs = ((InternalEObject)newRampUpTimer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER, null, msgs);
			msgs = basicSetRampUpTimer(newRampUpTimer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER, newRampUpTimer, newRampUpTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RampDownUsers getRampDownUsers() {
		return rampDownUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRampDownUsers(RampDownUsers newRampDownUsers, NotificationChain msgs) {
		RampDownUsers oldRampDownUsers = rampDownUsers;
		rampDownUsers = newRampDownUsers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS, oldRampDownUsers, newRampDownUsers);
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
	public void setRampDownUsers(RampDownUsers newRampDownUsers) {
		if (newRampDownUsers != rampDownUsers) {
			NotificationChain msgs = null;
			if (rampDownUsers != null)
				msgs = ((InternalEObject)rampDownUsers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS, null, msgs);
			if (newRampDownUsers != null)
				msgs = ((InternalEObject)newRampDownUsers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS, null, msgs);
			msgs = basicSetRampDownUsers(newRampDownUsers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS, newRampDownUsers, newRampDownUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RampUpUsers getRampUpUsers() {
		return rampUpUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRampUpUsers(RampUpUsers newRampUpUsers, NotificationChain msgs) {
		RampUpUsers oldRampUpUsers = rampUpUsers;
		rampUpUsers = newRampUpUsers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS, oldRampUpUsers, newRampUpUsers);
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
	public void setRampUpUsers(RampUpUsers newRampUpUsers) {
		if (newRampUpUsers != rampUpUsers) {
			NotificationChain msgs = null;
			if (rampUpUsers != null)
				msgs = ((InternalEObject)rampUpUsers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS, null, msgs);
			if (newRampUpUsers != null)
				msgs = ((InternalEObject)newRampUpUsers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS, null, msgs);
			msgs = basicSetRampUpUsers(newRampUpUsers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS, newRampUpUsers, newRampUpUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RampDownTimer getRampDownTimer() {
		return rampDownTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRampDownTimer(RampDownTimer newRampDownTimer, NotificationChain msgs) {
		RampDownTimer oldRampDownTimer = rampDownTimer;
		rampDownTimer = newRampDownTimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER, oldRampDownTimer, newRampDownTimer);
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
	public void setRampDownTimer(RampDownTimer newRampDownTimer) {
		if (newRampDownTimer != rampDownTimer) {
			NotificationChain msgs = null;
			if (rampDownTimer != null)
				msgs = ((InternalEObject)rampDownTimer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER, null, msgs);
			if (newRampDownTimer != null)
				msgs = ((InternalEObject)newRampDownTimer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER, null, msgs);
			msgs = basicSetRampDownTimer(newRampDownTimer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER, newRampDownTimer, newRampDownTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVirtualUsers() {
		return virtualUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualUsers(int newVirtualUsers) {
		int oldVirtualUsers = virtualUsers;
		virtualUsers = newVirtualUsers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS, oldVirtualUsers, virtualUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER:
				return basicSetRampUpTimer(null, msgs);
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS:
				return basicSetRampDownUsers(null, msgs);
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS:
				return basicSetRampUpUsers(null, msgs);
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER:
				return basicSetRampDownTimer(null, msgs);
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
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER:
				return getRampUpTimer();
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS:
				return getRampDownUsers();
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS:
				return getRampUpUsers();
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER:
				return getRampDownTimer();
			case CanopusPerformanceScenarioPackage.WORKLOAD__NAME:
				return getName();
			case CanopusPerformanceScenarioPackage.WORKLOAD__TIME:
				return getTime();
			case CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS:
				return getVirtualUsers();
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
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER:
				setRampUpTimer((RampUpTimer)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS:
				setRampDownUsers((RampDownUsers)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS:
				setRampUpUsers((RampUpUsers)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER:
				setRampDownTimer((RampDownTimer)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__NAME:
				setName((String)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__TIME:
				setTime((String)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS:
				setVirtualUsers((Integer)newValue);
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
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER:
				setRampUpTimer((RampUpTimer)null);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS:
				setRampDownUsers((RampDownUsers)null);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS:
				setRampUpUsers((RampUpUsers)null);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER:
				setRampDownTimer((RampDownTimer)null);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS:
				setVirtualUsers(VIRTUAL_USERS_EDEFAULT);
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
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER:
				return rampUpTimer != null;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS:
				return rampDownUsers != null;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS:
				return rampUpUsers != null;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER:
				return rampDownTimer != null;
			case CanopusPerformanceScenarioPackage.WORKLOAD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CanopusPerformanceScenarioPackage.WORKLOAD__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS:
				return virtualUsers != VIRTUAL_USERS_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", time: ");
		result.append(time);
		result.append(", virtualUsers: ");
		result.append(virtualUsers);
		result.append(')');
		return result.toString();
	}

} //WorkloadImpl
