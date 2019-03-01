/**
 */
package canopus.canopusPerformanceScenario;

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
 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioFactory
 * @model kind="package"
 * @generated
 */
public interface CanopusPerformanceScenarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "canopusPerformanceScenario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unipampa.lesse.org/canopusPerformanceScenario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "canopusPerformanceScenario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanopusPerformanceScenarioPackage eINSTANCE = canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.impl.UserProfileImpl <em>User Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.impl.UserProfileImpl
	 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getUserProfile()
	 * @generated
	 */
	int USER_PROFILE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Userprofiletoscript</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__USERPROFILETOSCRIPT = 2;

	/**
	 * The number of structural features of the '<em>User Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl <em>Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.impl.WorkloadImpl
	 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getWorkload()
	 * @generated
	 */
	int WORKLOAD = 1;

	/**
	 * The feature id for the '<em><b>Ramp Up Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__RAMP_UP_TIMER = 0;

	/**
	 * The feature id for the '<em><b>Ramp Down Users</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__RAMP_DOWN_USERS = 1;

	/**
	 * The feature id for the '<em><b>Ramp Up Users</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__RAMP_UP_USERS = 2;

	/**
	 * The feature id for the '<em><b>Ramp Down Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__RAMP_DOWN_TIMER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__NAME = 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__TIME = 5;

	/**
	 * The feature id for the '<em><b>Virtual Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__VIRTUAL_USERS = 6;

	/**
	 * The number of structural features of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.impl.ScriptingImpl <em>Scripting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.impl.ScriptingImpl
	 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getScripting()
	 * @generated
	 */
	int SCRIPTING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__INITIAL = 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__FINAL = 2;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__ACTIVITIES = 3;

	/**
	 * The feature id for the '<em><b>Saveparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__SAVEPARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Datatables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__DATATABLES = 5;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__THINK_TIME = 6;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__SCRIPTS = 7;

	/**
	 * The feature id for the '<em><b>Userprofiletoscript</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__USERPROFILETOSCRIPT = 8;

	/**
	 * The number of structural features of the '<em>Scripting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Scripting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.impl.Teste1Impl <em>Teste1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.impl.Teste1Impl
	 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getTeste1()
	 * @generated
	 */
	int TESTE1 = 3;

	/**
	 * The feature id for the '<em><b>Teste1e2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTE1__TESTE1E2 = 0;

	/**
	 * The number of structural features of the '<em>Teste1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Teste1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.impl.Teste2Impl <em>Teste2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.impl.Teste2Impl
	 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getTeste2()
	 * @generated
	 */
	int TESTE2 = 4;

	/**
	 * The feature id for the '<em><b>Teste1e2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTE2__TESTE1E2 = 0;

	/**
	 * The number of structural features of the '<em>Teste2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTE2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Teste2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.impl.Teste1E2Impl <em>Teste1 E2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.impl.Teste1E2Impl
	 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getTeste1E2()
	 * @generated
	 */
	int TESTE1_E2 = 5;

	/**
	 * The feature id for the '<em><b>Porcentagem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTE1_E2__PORCENTAGEM = 0;

	/**
	 * The feature id for the '<em><b>Teste1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTE1_E2__TESTE1 = 1;

	/**
	 * The feature id for the '<em><b>Teste2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTE1_E2__TESTE2 = 2;

	/**
	 * The number of structural features of the '<em>Teste1 E2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTE1_E2_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Teste1 E2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTE1_E2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.impl.UserProfileToScriptImpl <em>User Profile To Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.impl.UserProfileToScriptImpl
	 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getUserProfileToScript()
	 * @generated
	 */
	int USER_PROFILE_TO_SCRIPT = 6;

	/**
	 * The feature id for the '<em><b>Time Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_TO_SCRIPT__TIME_PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Userprofile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_TO_SCRIPT__USERPROFILE = 1;

	/**
	 * The feature id for the '<em><b>Scripting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_TO_SCRIPT__SCRIPTING = 2;

	/**
	 * The number of structural features of the '<em>User Profile To Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_TO_SCRIPT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User Profile To Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_TO_SCRIPT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.UserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Profile</em>'.
	 * @see canopus.canopusPerformanceScenario.UserProfile
	 * @generated
	 */
	EClass getUserProfile();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.UserProfile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScenario.UserProfile#getName()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_Name();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.UserProfile#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see canopus.canopusPerformanceScenario.UserProfile#getDescription()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_Description();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceScenario.UserProfile#getUserprofiletoscript <em>Userprofiletoscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Userprofiletoscript</em>'.
	 * @see canopus.canopusPerformanceScenario.UserProfile#getUserprofiletoscript()
	 * @see #getUserProfile()
	 * @generated
	 */
	EReference getUserProfile_Userprofiletoscript();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload</em>'.
	 * @see canopus.canopusPerformanceScenario.Workload
	 * @generated
	 */
	EClass getWorkload();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.Workload#getRampUpTimer <em>Ramp Up Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ramp Up Timer</em>'.
	 * @see canopus.canopusPerformanceScenario.Workload#getRampUpTimer()
	 * @see #getWorkload()
	 * @generated
	 */
	EReference getWorkload_RampUpTimer();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.Workload#getRampDownUsers <em>Ramp Down Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ramp Down Users</em>'.
	 * @see canopus.canopusPerformanceScenario.Workload#getRampDownUsers()
	 * @see #getWorkload()
	 * @generated
	 */
	EReference getWorkload_RampDownUsers();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.Workload#getRampUpUsers <em>Ramp Up Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ramp Up Users</em>'.
	 * @see canopus.canopusPerformanceScenario.Workload#getRampUpUsers()
	 * @see #getWorkload()
	 * @generated
	 */
	EReference getWorkload_RampUpUsers();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.Workload#getRampDownTimer <em>Ramp Down Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ramp Down Timer</em>'.
	 * @see canopus.canopusPerformanceScenario.Workload#getRampDownTimer()
	 * @see #getWorkload()
	 * @generated
	 */
	EReference getWorkload_RampDownTimer();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.Workload#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScenario.Workload#getName()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_Name();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.Workload#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see canopus.canopusPerformanceScenario.Workload#getTime()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_Time();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.Workload#getVirtualUsers <em>Virtual Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Users</em>'.
	 * @see canopus.canopusPerformanceScenario.Workload#getVirtualUsers()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_VirtualUsers();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.Scripting <em>Scripting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripting</em>'.
	 * @see canopus.canopusPerformanceScenario.Scripting
	 * @generated
	 */
	EClass getScripting();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.Scripting#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScenario.Scripting#getName()
	 * @see #getScripting()
	 * @generated
	 */
	EAttribute getScripting_Name();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.Scripting#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial</em>'.
	 * @see canopus.canopusPerformanceScenario.Scripting#getInitial()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Initial();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.Scripting#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final</em>'.
	 * @see canopus.canopusPerformanceScenario.Scripting#getFinal()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Final();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScenario.Scripting#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see canopus.canopusPerformanceScenario.Scripting#getActivities()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScenario.Scripting#getSaveparameters <em>Saveparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Saveparameters</em>'.
	 * @see canopus.canopusPerformanceScenario.Scripting#getSaveparameters()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Saveparameters();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScenario.Scripting#getDatatables <em>Datatables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatables</em>'.
	 * @see canopus.canopusPerformanceScenario.Scripting#getDatatables()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Datatables();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScenario.Scripting#getThinkTime <em>Think Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Think Time</em>'.
	 * @see canopus.canopusPerformanceScenario.Scripting#getThinkTime()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_ThinkTime();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScenario.Scripting#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scripts</em>'.
	 * @see canopus.canopusPerformanceScenario.Scripting#getScripts()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Scripts();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.Scripting#getUserprofiletoscript <em>Userprofiletoscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Userprofiletoscript</em>'.
	 * @see canopus.canopusPerformanceScenario.Scripting#getUserprofiletoscript()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Userprofiletoscript();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.Teste1 <em>Teste1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teste1</em>'.
	 * @see canopus.canopusPerformanceScenario.Teste1
	 * @generated
	 */
	EClass getTeste1();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceScenario.Teste1#getTeste1e2 <em>Teste1e2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Teste1e2</em>'.
	 * @see canopus.canopusPerformanceScenario.Teste1#getTeste1e2()
	 * @see #getTeste1()
	 * @generated
	 */
	EReference getTeste1_Teste1e2();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.Teste2 <em>Teste2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teste2</em>'.
	 * @see canopus.canopusPerformanceScenario.Teste2
	 * @generated
	 */
	EClass getTeste2();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.Teste2#getTeste1e2 <em>Teste1e2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Teste1e2</em>'.
	 * @see canopus.canopusPerformanceScenario.Teste2#getTeste1e2()
	 * @see #getTeste2()
	 * @generated
	 */
	EReference getTeste2_Teste1e2();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.Teste1E2 <em>Teste1 E2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teste1 E2</em>'.
	 * @see canopus.canopusPerformanceScenario.Teste1E2
	 * @generated
	 */
	EClass getTeste1E2();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.Teste1E2#getPorcentagem <em>Porcentagem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Porcentagem</em>'.
	 * @see canopus.canopusPerformanceScenario.Teste1E2#getPorcentagem()
	 * @see #getTeste1E2()
	 * @generated
	 */
	EAttribute getTeste1E2_Porcentagem();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.Teste1E2#getTeste1 <em>Teste1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Teste1</em>'.
	 * @see canopus.canopusPerformanceScenario.Teste1E2#getTeste1()
	 * @see #getTeste1E2()
	 * @generated
	 */
	EReference getTeste1E2_Teste1();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.Teste1E2#getTeste2 <em>Teste2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Teste2</em>'.
	 * @see canopus.canopusPerformanceScenario.Teste1E2#getTeste2()
	 * @see #getTeste1E2()
	 * @generated
	 */
	EReference getTeste1E2_Teste2();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.UserProfileToScript <em>User Profile To Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Profile To Script</em>'.
	 * @see canopus.canopusPerformanceScenario.UserProfileToScript
	 * @generated
	 */
	EClass getUserProfileToScript();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.UserProfileToScript#getTimePercentage <em>Time Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Percentage</em>'.
	 * @see canopus.canopusPerformanceScenario.UserProfileToScript#getTimePercentage()
	 * @see #getUserProfileToScript()
	 * @generated
	 */
	EAttribute getUserProfileToScript_TimePercentage();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.UserProfileToScript#getUserprofile <em>Userprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Userprofile</em>'.
	 * @see canopus.canopusPerformanceScenario.UserProfileToScript#getUserprofile()
	 * @see #getUserProfileToScript()
	 * @generated
	 */
	EReference getUserProfileToScript_Userprofile();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.UserProfileToScript#getScripting <em>Scripting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scripting</em>'.
	 * @see canopus.canopusPerformanceScenario.UserProfileToScript#getScripting()
	 * @see #getUserProfileToScript()
	 * @generated
	 */
	EReference getUserProfileToScript_Scripting();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CanopusPerformanceScenarioFactory getCanopusPerformanceScenarioFactory();

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
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.impl.UserProfileImpl <em>User Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.impl.UserProfileImpl
		 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getUserProfile()
		 * @generated
		 */
		EClass USER_PROFILE = eINSTANCE.getUserProfile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__NAME = eINSTANCE.getUserProfile_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__DESCRIPTION = eINSTANCE.getUserProfile_Description();

		/**
		 * The meta object literal for the '<em><b>Userprofiletoscript</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE__USERPROFILETOSCRIPT = eINSTANCE.getUserProfile_Userprofiletoscript();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.impl.WorkloadImpl <em>Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.impl.WorkloadImpl
		 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getWorkload()
		 * @generated
		 */
		EClass WORKLOAD = eINSTANCE.getWorkload();

		/**
		 * The meta object literal for the '<em><b>Ramp Up Timer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD__RAMP_UP_TIMER = eINSTANCE.getWorkload_RampUpTimer();

		/**
		 * The meta object literal for the '<em><b>Ramp Down Users</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD__RAMP_DOWN_USERS = eINSTANCE.getWorkload_RampDownUsers();

		/**
		 * The meta object literal for the '<em><b>Ramp Up Users</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD__RAMP_UP_USERS = eINSTANCE.getWorkload_RampUpUsers();

		/**
		 * The meta object literal for the '<em><b>Ramp Down Timer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD__RAMP_DOWN_TIMER = eINSTANCE.getWorkload_RampDownTimer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__NAME = eINSTANCE.getWorkload_Name();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__TIME = eINSTANCE.getWorkload_Time();

		/**
		 * The meta object literal for the '<em><b>Virtual Users</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__VIRTUAL_USERS = eINSTANCE.getWorkload_VirtualUsers();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.impl.ScriptingImpl <em>Scripting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.impl.ScriptingImpl
		 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getScripting()
		 * @generated
		 */
		EClass SCRIPTING = eINSTANCE.getScripting();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPTING__NAME = eINSTANCE.getScripting_Name();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING__INITIAL = eINSTANCE.getScripting_Initial();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING__FINAL = eINSTANCE.getScripting_Final();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING__ACTIVITIES = eINSTANCE.getScripting_Activities();

		/**
		 * The meta object literal for the '<em><b>Saveparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING__SAVEPARAMETERS = eINSTANCE.getScripting_Saveparameters();

		/**
		 * The meta object literal for the '<em><b>Datatables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING__DATATABLES = eINSTANCE.getScripting_Datatables();

		/**
		 * The meta object literal for the '<em><b>Think Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING__THINK_TIME = eINSTANCE.getScripting_ThinkTime();

		/**
		 * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING__SCRIPTS = eINSTANCE.getScripting_Scripts();

		/**
		 * The meta object literal for the '<em><b>Userprofiletoscript</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING__USERPROFILETOSCRIPT = eINSTANCE.getScripting_Userprofiletoscript();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.impl.Teste1Impl <em>Teste1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.impl.Teste1Impl
		 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getTeste1()
		 * @generated
		 */
		EClass TESTE1 = eINSTANCE.getTeste1();

		/**
		 * The meta object literal for the '<em><b>Teste1e2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTE1__TESTE1E2 = eINSTANCE.getTeste1_Teste1e2();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.impl.Teste2Impl <em>Teste2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.impl.Teste2Impl
		 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getTeste2()
		 * @generated
		 */
		EClass TESTE2 = eINSTANCE.getTeste2();

		/**
		 * The meta object literal for the '<em><b>Teste1e2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTE2__TESTE1E2 = eINSTANCE.getTeste2_Teste1e2();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.impl.Teste1E2Impl <em>Teste1 E2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.impl.Teste1E2Impl
		 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getTeste1E2()
		 * @generated
		 */
		EClass TESTE1_E2 = eINSTANCE.getTeste1E2();

		/**
		 * The meta object literal for the '<em><b>Porcentagem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTE1_E2__PORCENTAGEM = eINSTANCE.getTeste1E2_Porcentagem();

		/**
		 * The meta object literal for the '<em><b>Teste1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTE1_E2__TESTE1 = eINSTANCE.getTeste1E2_Teste1();

		/**
		 * The meta object literal for the '<em><b>Teste2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTE1_E2__TESTE2 = eINSTANCE.getTeste1E2_Teste2();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.impl.UserProfileToScriptImpl <em>User Profile To Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.impl.UserProfileToScriptImpl
		 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getUserProfileToScript()
		 * @generated
		 */
		EClass USER_PROFILE_TO_SCRIPT = eINSTANCE.getUserProfileToScript();

		/**
		 * The meta object literal for the '<em><b>Time Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE_TO_SCRIPT__TIME_PERCENTAGE = eINSTANCE.getUserProfileToScript_TimePercentage();

		/**
		 * The meta object literal for the '<em><b>Userprofile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE_TO_SCRIPT__USERPROFILE = eINSTANCE.getUserProfileToScript_Userprofile();

		/**
		 * The meta object literal for the '<em><b>Scripting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE_TO_SCRIPT__SCRIPTING = eINSTANCE.getUserProfileToScript_Scripting();

	}

} //CanopusPerformanceScenarioPackage
