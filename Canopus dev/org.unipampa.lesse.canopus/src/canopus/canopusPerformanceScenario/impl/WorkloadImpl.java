/**
 */
package canopus.canopusPerformanceScenario.impl;

import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;
import canopus.canopusPerformanceScenario.Workload;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTimer;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.TestDuration;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers;

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
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getVirtualUsers <em>Virtual Users</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getRampUpTimer <em>Ramp Up Timer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getRampDownUsers <em>Ramp Down Users</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getRampUpUsers <em>Ramp Up Users</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getTestDuration <em>Test Duration</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getRampDownTimer <em>Ramp Down Timer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getRampDownTest <em>Ramp Down Test</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getRampUpTest <em>Ramp Up Test</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getTest <em>Test</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkloadImpl extends MinimalEObjectImpl.Container implements Workload {
	/**
	 * The cached value of the '{@link #getVirtualUsers() <em>Virtual Users</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualUsers()
	 * @generated
	 * @ordered
	 */
	protected VirtualUsers virtualUsers;

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
	 * The cached value of the '{@link #getTestDuration() <em>Test Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestDuration()
	 * @generated
	 * @ordered
	 */
	protected TestDuration testDuration;

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
	 * The cached value of the '{@link #getRampDownTest() <em>Ramp Down Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampDownTest()
	 * @generated
	 * @ordered
	 */
	protected RampDownTest rampDownTest;

	/**
	 * The cached value of the '{@link #getRampUpTest() <em>Ramp Up Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampUpTest()
	 * @generated
	 * @ordered
	 */
	protected RampUpTest rampUpTest;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected Test test;

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
	public VirtualUsers getVirtualUsers() {
		return virtualUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtualUsers(VirtualUsers newVirtualUsers, NotificationChain msgs) {
		VirtualUsers oldVirtualUsers = virtualUsers;
		virtualUsers = newVirtualUsers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS, oldVirtualUsers, newVirtualUsers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualUsers(VirtualUsers newVirtualUsers) {
		if (newVirtualUsers != virtualUsers) {
			NotificationChain msgs = null;
			if (virtualUsers != null)
				msgs = ((InternalEObject)virtualUsers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS, null, msgs);
			if (newVirtualUsers != null)
				msgs = ((InternalEObject)newVirtualUsers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS, null, msgs);
			msgs = basicSetVirtualUsers(newVirtualUsers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS, newVirtualUsers, newVirtualUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public TestDuration getTestDuration() {
		return testDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestDuration(TestDuration newTestDuration, NotificationChain msgs) {
		TestDuration oldTestDuration = testDuration;
		testDuration = newTestDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__TEST_DURATION, oldTestDuration, newTestDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestDuration(TestDuration newTestDuration) {
		if (newTestDuration != testDuration) {
			NotificationChain msgs = null;
			if (testDuration != null)
				msgs = ((InternalEObject)testDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__TEST_DURATION, null, msgs);
			if (newTestDuration != null)
				msgs = ((InternalEObject)newTestDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__TEST_DURATION, null, msgs);
			msgs = basicSetTestDuration(newTestDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__TEST_DURATION, newTestDuration, newTestDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public RampDownTest getRampDownTest() {
		return rampDownTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRampDownTest(RampDownTest newRampDownTest, NotificationChain msgs) {
		RampDownTest oldRampDownTest = rampDownTest;
		rampDownTest = newRampDownTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TEST, oldRampDownTest, newRampDownTest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampDownTest(RampDownTest newRampDownTest) {
		if (newRampDownTest != rampDownTest) {
			NotificationChain msgs = null;
			if (rampDownTest != null)
				msgs = ((InternalEObject)rampDownTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TEST, null, msgs);
			if (newRampDownTest != null)
				msgs = ((InternalEObject)newRampDownTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TEST, null, msgs);
			msgs = basicSetRampDownTest(newRampDownTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TEST, newRampDownTest, newRampDownTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpTest getRampUpTest() {
		return rampUpTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRampUpTest(RampUpTest newRampUpTest, NotificationChain msgs) {
		RampUpTest oldRampUpTest = rampUpTest;
		rampUpTest = newRampUpTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TEST, oldRampUpTest, newRampUpTest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampUpTest(RampUpTest newRampUpTest) {
		if (newRampUpTest != rampUpTest) {
			NotificationChain msgs = null;
			if (rampUpTest != null)
				msgs = ((InternalEObject)rampUpTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TEST, null, msgs);
			if (newRampUpTest != null)
				msgs = ((InternalEObject)newRampUpTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TEST, null, msgs);
			msgs = basicSetRampUpTest(newRampUpTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TEST, newRampUpTest, newRampUpTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test getTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTest(Test newTest, NotificationChain msgs) {
		Test oldTest = test;
		test = newTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__TEST, oldTest, newTest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest(Test newTest) {
		if (newTest != test) {
			NotificationChain msgs = null;
			if (test != null)
				msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__TEST, null, msgs);
			if (newTest != null)
				msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.WORKLOAD__TEST, null, msgs);
			msgs = basicSetTest(newTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__TEST, newTest, newTest));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.WORKLOAD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS:
				return basicSetVirtualUsers(null, msgs);
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER:
				return basicSetRampUpTimer(null, msgs);
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS:
				return basicSetRampDownUsers(null, msgs);
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS:
				return basicSetRampUpUsers(null, msgs);
			case CanopusPerformanceScenarioPackage.WORKLOAD__TEST_DURATION:
				return basicSetTestDuration(null, msgs);
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER:
				return basicSetRampDownTimer(null, msgs);
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TEST:
				return basicSetRampDownTest(null, msgs);
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TEST:
				return basicSetRampUpTest(null, msgs);
			case CanopusPerformanceScenarioPackage.WORKLOAD__TEST:
				return basicSetTest(null, msgs);
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
			case CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS:
				return getVirtualUsers();
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER:
				return getRampUpTimer();
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS:
				return getRampDownUsers();
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS:
				return getRampUpUsers();
			case CanopusPerformanceScenarioPackage.WORKLOAD__TEST_DURATION:
				return getTestDuration();
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER:
				return getRampDownTimer();
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TEST:
				return getRampDownTest();
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TEST:
				return getRampUpTest();
			case CanopusPerformanceScenarioPackage.WORKLOAD__TEST:
				return getTest();
			case CanopusPerformanceScenarioPackage.WORKLOAD__NAME:
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
			case CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS:
				setVirtualUsers((VirtualUsers)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER:
				setRampUpTimer((RampUpTimer)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS:
				setRampDownUsers((RampDownUsers)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS:
				setRampUpUsers((RampUpUsers)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__TEST_DURATION:
				setTestDuration((TestDuration)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER:
				setRampDownTimer((RampDownTimer)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TEST:
				setRampDownTest((RampDownTest)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TEST:
				setRampUpTest((RampUpTest)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__TEST:
				setTest((Test)newValue);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__NAME:
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
			case CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS:
				setVirtualUsers((VirtualUsers)null);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER:
				setRampUpTimer((RampUpTimer)null);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS:
				setRampDownUsers((RampDownUsers)null);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS:
				setRampUpUsers((RampUpUsers)null);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__TEST_DURATION:
				setTestDuration((TestDuration)null);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER:
				setRampDownTimer((RampDownTimer)null);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TEST:
				setRampDownTest((RampDownTest)null);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TEST:
				setRampUpTest((RampUpTest)null);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__TEST:
				setTest((Test)null);
				return;
			case CanopusPerformanceScenarioPackage.WORKLOAD__NAME:
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
			case CanopusPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS:
				return virtualUsers != null;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER:
				return rampUpTimer != null;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS:
				return rampDownUsers != null;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS:
				return rampUpUsers != null;
			case CanopusPerformanceScenarioPackage.WORKLOAD__TEST_DURATION:
				return testDuration != null;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER:
				return rampDownTimer != null;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TEST:
				return rampDownTest != null;
			case CanopusPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TEST:
				return rampUpTest != null;
			case CanopusPerformanceScenarioPackage.WORKLOAD__TEST:
				return test != null;
			case CanopusPerformanceScenarioPackage.WORKLOAD__NAME:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WorkloadImpl
