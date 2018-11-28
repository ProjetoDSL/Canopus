/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadFactory
 * @model kind="package"
 * @generated
 */
public interface CanopusPerformanceWorkloadPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "canopusPerformanceWorkload";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unipampa.lesse.org/canopusPerformanceWorkload";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "canopusPerformanceWorkload";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanopusPerformanceWorkloadPackage eINSTANCE = canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl.init();

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.VirtualUsersImpl <em>Virtual Users</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.VirtualUsersImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getVirtualUsers()
	 * @generated
	 */
	int VIRTUAL_USERS = 0;

	/**
	 * The feature id for the '<em><b>Virtual Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_USERS__VIRTUAL_USERS = 0;

	/**
	 * The number of structural features of the '<em>Virtual Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_USERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Virtual Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_USERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.TestDurationImpl <em>Test Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.TestDurationImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getTestDuration()
	 * @generated
	 */
	int TEST_DURATION = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DURATION__TIME = 0;

	/**
	 * The number of structural features of the '<em>Test Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Test Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpUsersImpl <em>Ramp Up Users</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpUsersImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampUpUsers()
	 * @generated
	 */
	int RAMP_UP_USERS = 2;

	/**
	 * The feature id for the '<em><b>Virtual Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_USERS__VIRTUAL_USERS = 0;

	/**
	 * The number of structural features of the '<em>Ramp Up Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_USERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ramp Up Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_USERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownUsersImpl <em>Ramp Down Users</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownUsersImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampDownUsers()
	 * @generated
	 */
	int RAMP_DOWN_USERS = 3;

	/**
	 * The feature id for the '<em><b>Virtual Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_USERS__VIRTUAL_USERS = 0;

	/**
	 * The number of structural features of the '<em>Ramp Down Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_USERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ramp Down Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_USERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpTimerImpl <em>Ramp Up Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpTimerImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampUpTimer()
	 * @generated
	 */
	int RAMP_UP_TIMER = 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_TIMER__TIME = 0;

	/**
	 * The number of structural features of the '<em>Ramp Up Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_TIMER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ramp Up Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_TIMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTimeImpl <em>Ramp Down Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTimeImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampDownTime()
	 * @generated
	 */
	int RAMP_DOWN_TIME = 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TIME__TIME = 0;

	/**
	 * The number of structural features of the '<em>Ramp Down Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TIME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ramp Down Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadModelImpl <em>Workload Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadModelImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getWorkloadModel()
	 * @generated
	 */
	int WORKLOAD_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Testduration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_MODEL__TESTDURATION = 0;

	/**
	 * The feature id for the '<em><b>Rampdownusers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_MODEL__RAMPDOWNUSERS = 1;

	/**
	 * The feature id for the '<em><b>Rampdowntime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_MODEL__RAMPDOWNTIME = 2;

	/**
	 * The feature id for the '<em><b>Rampuptimer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_MODEL__RAMPUPTIMER = 3;

	/**
	 * The feature id for the '<em><b>Rampupusers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_MODEL__RAMPUPUSERS = 4;

	/**
	 * The feature id for the '<em><b>Virtualusers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_MODEL__VIRTUALUSERS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_MODEL__NAME = 6;

	/**
	 * The number of structural features of the '<em>Workload Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Workload Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_MODEL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers <em>Virtual Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Users</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers
	 * @generated
	 */
	EClass getVirtualUsers();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers#getVirtualUsers <em>Virtual Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Users</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers#getVirtualUsers()
	 * @see #getVirtualUsers()
	 * @generated
	 */
	EAttribute getVirtualUsers_VirtualUsers();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.TestDuration <em>Test Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Duration</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.TestDuration
	 * @generated
	 */
	EClass getTestDuration();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.TestDuration#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.TestDuration#getTime()
	 * @see #getTestDuration()
	 * @generated
	 */
	EAttribute getTestDuration_Time();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers <em>Ramp Up Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Up Users</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers
	 * @generated
	 */
	EClass getRampUpUsers();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers#getVirtualUsers <em>Virtual Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Users</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers#getVirtualUsers()
	 * @see #getRampUpUsers()
	 * @generated
	 */
	EAttribute getRampUpUsers_VirtualUsers();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers <em>Ramp Down Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Down Users</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers
	 * @generated
	 */
	EClass getRampDownUsers();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers#getVirtualUsers <em>Virtual Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Users</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers#getVirtualUsers()
	 * @see #getRampDownUsers()
	 * @generated
	 */
	EAttribute getRampDownUsers_VirtualUsers();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer <em>Ramp Up Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Up Timer</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer
	 * @generated
	 */
	EClass getRampUpTimer();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer#getTime()
	 * @see #getRampUpTimer()
	 * @generated
	 */
	EAttribute getRampUpTimer_Time();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTime <em>Ramp Down Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Down Time</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTime
	 * @generated
	 */
	EClass getRampDownTime();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTime#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTime#getTime()
	 * @see #getRampDownTime()
	 * @generated
	 */
	EAttribute getRampDownTime_Time();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel <em>Workload Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload Model</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel
	 * @generated
	 */
	EClass getWorkloadModel();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getTestduration <em>Testduration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Testduration</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getTestduration()
	 * @see #getWorkloadModel()
	 * @generated
	 */
	EReference getWorkloadModel_Testduration();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampdownusers <em>Rampdownusers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rampdownusers</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampdownusers()
	 * @see #getWorkloadModel()
	 * @generated
	 */
	EReference getWorkloadModel_Rampdownusers();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampdowntime <em>Rampdowntime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rampdowntime</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampdowntime()
	 * @see #getWorkloadModel()
	 * @generated
	 */
	EReference getWorkloadModel_Rampdowntime();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampuptimer <em>Rampuptimer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rampuptimer</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampuptimer()
	 * @see #getWorkloadModel()
	 * @generated
	 */
	EReference getWorkloadModel_Rampuptimer();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampupusers <em>Rampupusers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rampupusers</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampupusers()
	 * @see #getWorkloadModel()
	 * @generated
	 */
	EReference getWorkloadModel_Rampupusers();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getVirtualusers <em>Virtualusers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Virtualusers</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getVirtualusers()
	 * @see #getWorkloadModel()
	 * @generated
	 */
	EReference getWorkloadModel_Virtualusers();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getName()
	 * @see #getWorkloadModel()
	 * @generated
	 */
	EAttribute getWorkloadModel_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CanopusPerformanceWorkloadFactory getCanopusPerformanceWorkloadFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.VirtualUsersImpl <em>Virtual Users</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.VirtualUsersImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getVirtualUsers()
		 * @generated
		 */
		EClass VIRTUAL_USERS = eINSTANCE.getVirtualUsers();

		/**
		 * The meta object literal for the '<em><b>Virtual Users</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_USERS__VIRTUAL_USERS = eINSTANCE.getVirtualUsers_VirtualUsers();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.TestDurationImpl <em>Test Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.TestDurationImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getTestDuration()
		 * @generated
		 */
		EClass TEST_DURATION = eINSTANCE.getTestDuration();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_DURATION__TIME = eINSTANCE.getTestDuration_Time();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpUsersImpl <em>Ramp Up Users</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpUsersImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampUpUsers()
		 * @generated
		 */
		EClass RAMP_UP_USERS = eINSTANCE.getRampUpUsers();

		/**
		 * The meta object literal for the '<em><b>Virtual Users</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAMP_UP_USERS__VIRTUAL_USERS = eINSTANCE.getRampUpUsers_VirtualUsers();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownUsersImpl <em>Ramp Down Users</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownUsersImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampDownUsers()
		 * @generated
		 */
		EClass RAMP_DOWN_USERS = eINSTANCE.getRampDownUsers();

		/**
		 * The meta object literal for the '<em><b>Virtual Users</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAMP_DOWN_USERS__VIRTUAL_USERS = eINSTANCE.getRampDownUsers_VirtualUsers();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpTimerImpl <em>Ramp Up Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpTimerImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampUpTimer()
		 * @generated
		 */
		EClass RAMP_UP_TIMER = eINSTANCE.getRampUpTimer();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAMP_UP_TIMER__TIME = eINSTANCE.getRampUpTimer_Time();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTimeImpl <em>Ramp Down Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTimeImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampDownTime()
		 * @generated
		 */
		EClass RAMP_DOWN_TIME = eINSTANCE.getRampDownTime();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAMP_DOWN_TIME__TIME = eINSTANCE.getRampDownTime_Time();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadModelImpl <em>Workload Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadModelImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getWorkloadModel()
		 * @generated
		 */
		EClass WORKLOAD_MODEL = eINSTANCE.getWorkloadModel();

		/**
		 * The meta object literal for the '<em><b>Testduration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_MODEL__TESTDURATION = eINSTANCE.getWorkloadModel_Testduration();

		/**
		 * The meta object literal for the '<em><b>Rampdownusers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_MODEL__RAMPDOWNUSERS = eINSTANCE.getWorkloadModel_Rampdownusers();

		/**
		 * The meta object literal for the '<em><b>Rampdowntime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_MODEL__RAMPDOWNTIME = eINSTANCE.getWorkloadModel_Rampdowntime();

		/**
		 * The meta object literal for the '<em><b>Rampuptimer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_MODEL__RAMPUPTIMER = eINSTANCE.getWorkloadModel_Rampuptimer();

		/**
		 * The meta object literal for the '<em><b>Rampupusers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_MODEL__RAMPUPUSERS = eINSTANCE.getWorkloadModel_Rampupusers();

		/**
		 * The meta object literal for the '<em><b>Virtualusers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_MODEL__VIRTUALUSERS = eINSTANCE.getWorkloadModel_Virtualusers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD_MODEL__NAME = eINSTANCE.getWorkloadModel_Name();

	}

} //CanopusPerformanceWorkloadPackage
