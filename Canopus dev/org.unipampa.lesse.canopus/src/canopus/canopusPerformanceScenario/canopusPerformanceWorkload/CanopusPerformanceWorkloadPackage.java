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
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTimerImpl <em>Ramp Down Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTimerImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampDownTimer()
	 * @generated
	 */
	int RAMP_DOWN_TIMER = 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TIMER__TIME = 0;

	/**
	 * The number of structural features of the '<em>Ramp Down Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TIMER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ramp Down Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TIMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpTestImpl <em>Ramp Up Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpTestImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampUpTest()
	 * @generated
	 */
	int RAMP_UP_TEST = 6;

	/**
	 * The feature id for the '<em><b>Rampuptimer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_TEST__RAMPUPTIMER = 0;

	/**
	 * The feature id for the '<em><b>Rampupusers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_TEST__RAMPUPUSERS = 1;

	/**
	 * The number of structural features of the '<em>Ramp Up Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_TEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ramp Up Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTestImpl <em>Ramp Down Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTestImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampDownTest()
	 * @generated
	 */
	int RAMP_DOWN_TEST = 7;

	/**
	 * The feature id for the '<em><b>Rampdowntimer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TEST__RAMPDOWNTIMER = 0;

	/**
	 * The feature id for the '<em><b>Rampdownusers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TEST__RAMPDOWNUSERS = 1;

	/**
	 * The number of structural features of the '<em>Ramp Down Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ramp Down Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.TestImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 8;

	/**
	 * The feature id for the '<em><b>Testduration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__TESTDURATION = 0;

	/**
	 * The feature id for the '<em><b>Virtualusers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__VIRTUALUSERS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = 2;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadGroupImpl <em>Workload Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadGroupImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getWorkloadGroup()
	 * @generated
	 */
	int WORKLOAD_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Rampdowntest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_GROUP__RAMPDOWNTEST = 0;

	/**
	 * The feature id for the '<em><b>Rampuptest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_GROUP__RAMPUPTEST = 1;

	/**
	 * The feature id for the '<em><b>Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_GROUP__TEST = 2;

	/**
	 * The number of structural features of the '<em>Workload Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Workload Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_GROUP_OPERATION_COUNT = 0;


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
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTimer <em>Ramp Down Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Down Timer</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTimer
	 * @generated
	 */
	EClass getRampDownTimer();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTimer#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTimer#getTime()
	 * @see #getRampDownTimer()
	 * @generated
	 */
	EAttribute getRampDownTimer_Time();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest <em>Ramp Up Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Up Test</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest
	 * @generated
	 */
	EClass getRampUpTest();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest#getRampuptimer <em>Rampuptimer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rampuptimer</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest#getRampuptimer()
	 * @see #getRampUpTest()
	 * @generated
	 */
	EReference getRampUpTest_Rampuptimer();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest#getRampupusers <em>Rampupusers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rampupusers</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest#getRampupusers()
	 * @see #getRampUpTest()
	 * @generated
	 */
	EReference getRampUpTest_Rampupusers();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest <em>Ramp Down Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Down Test</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest
	 * @generated
	 */
	EClass getRampDownTest();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest#getRampdowntimer <em>Rampdowntimer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rampdowntimer</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest#getRampdowntimer()
	 * @see #getRampDownTest()
	 * @generated
	 */
	EReference getRampDownTest_Rampdowntimer();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest#getRampdownusers <em>Rampdownusers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rampdownusers</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest#getRampdownusers()
	 * @see #getRampDownTest()
	 * @generated
	 */
	EReference getRampDownTest_Rampdownusers();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test#getTestduration <em>Testduration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Testduration</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test#getTestduration()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Testduration();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test#getVirtualusers <em>Virtualusers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Virtualusers</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test#getVirtualusers()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Virtualusers();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test#getName()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Name();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup <em>Workload Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload Group</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup
	 * @generated
	 */
	EClass getWorkloadGroup();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup#getRampdowntest <em>Rampdowntest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rampdowntest</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup#getRampdowntest()
	 * @see #getWorkloadGroup()
	 * @generated
	 */
	EReference getWorkloadGroup_Rampdowntest();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup#getRampuptest <em>Rampuptest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rampuptest</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup#getRampuptest()
	 * @see #getWorkloadGroup()
	 * @generated
	 */
	EReference getWorkloadGroup_Rampuptest();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup#getTest()
	 * @see #getWorkloadGroup()
	 * @generated
	 */
	EReference getWorkloadGroup_Test();

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
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTimerImpl <em>Ramp Down Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTimerImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampDownTimer()
		 * @generated
		 */
		EClass RAMP_DOWN_TIMER = eINSTANCE.getRampDownTimer();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAMP_DOWN_TIMER__TIME = eINSTANCE.getRampDownTimer_Time();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpTestImpl <em>Ramp Up Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpTestImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampUpTest()
		 * @generated
		 */
		EClass RAMP_UP_TEST = eINSTANCE.getRampUpTest();

		/**
		 * The meta object literal for the '<em><b>Rampuptimer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP_UP_TEST__RAMPUPTIMER = eINSTANCE.getRampUpTest_Rampuptimer();

		/**
		 * The meta object literal for the '<em><b>Rampupusers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP_UP_TEST__RAMPUPUSERS = eINSTANCE.getRampUpTest_Rampupusers();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTestImpl <em>Ramp Down Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTestImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getRampDownTest()
		 * @generated
		 */
		EClass RAMP_DOWN_TEST = eINSTANCE.getRampDownTest();

		/**
		 * The meta object literal for the '<em><b>Rampdowntimer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP_DOWN_TEST__RAMPDOWNTIMER = eINSTANCE.getRampDownTest_Rampdowntimer();

		/**
		 * The meta object literal for the '<em><b>Rampdownusers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP_DOWN_TEST__RAMPDOWNUSERS = eINSTANCE.getRampDownTest_Rampdownusers();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.TestImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Testduration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__TESTDURATION = eINSTANCE.getTest_Testduration();

		/**
		 * The meta object literal for the '<em><b>Virtualusers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__VIRTUALUSERS = eINSTANCE.getTest_Virtualusers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__NAME = eINSTANCE.getTest_Name();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadGroupImpl <em>Workload Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadGroupImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl#getWorkloadGroup()
		 * @generated
		 */
		EClass WORKLOAD_GROUP = eINSTANCE.getWorkloadGroup();

		/**
		 * The meta object literal for the '<em><b>Rampdowntest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_GROUP__RAMPDOWNTEST = eINSTANCE.getWorkloadGroup_Rampdowntest();

		/**
		 * The meta object literal for the '<em><b>Rampuptest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_GROUP__RAMPUPTEST = eINSTANCE.getWorkloadGroup_Rampuptest();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_GROUP__TEST = eINSTANCE.getWorkloadGroup_Test();

	}

} //CanopusPerformanceWorkloadPackage
