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
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__PERCENTAGE = 2;

	/**
	 * The feature id for the '<em><b>Scriptmodel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__SCRIPTMODEL = 3;

	/**
	 * The feature id for the '<em><b>Scripting</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__SCRIPTING = 4;

	/**
	 * The number of structural features of the '<em>User Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Virtual Users</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__VIRTUAL_USERS = 0;

	/**
	 * The feature id for the '<em><b>Ramp Up Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__RAMP_UP_TIMER = 1;

	/**
	 * The feature id for the '<em><b>Ramp Down Users</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__RAMP_DOWN_USERS = 2;

	/**
	 * The feature id for the '<em><b>Ramp Up Users</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__RAMP_UP_USERS = 3;

	/**
	 * The feature id for the '<em><b>Test Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__TEST_DURATION = 4;

	/**
	 * The feature id for the '<em><b>Ramp Down Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__RAMP_DOWN_TIMER = 5;

	/**
	 * The number of structural features of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.impl.AssociationImpl
	 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 2;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__USER_PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Scriptmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SCRIPTMODEL = 2;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.impl.ScriptModelImpl <em>Script Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.impl.ScriptModelImpl
	 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getScriptModel()
	 * @generated
	 */
	int SCRIPT_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MODEL__ACTIVITIES = 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MODEL__INITIAL = 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MODEL__FINAL = 2;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MODEL__THINK_TIME = 3;

	/**
	 * The feature id for the '<em><b>Save Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MODEL__SAVE_PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Data Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MODEL__DATA_TABLES = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MODEL__NAME = 6;

	/**
	 * The number of structural features of the '<em>Script Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Script Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MODEL_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.UserProfile#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see canopus.canopusPerformanceScenario.UserProfile#getPercentage()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_Percentage();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceScenario.UserProfile#getScriptmodel <em>Scriptmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scriptmodel</em>'.
	 * @see canopus.canopusPerformanceScenario.UserProfile#getScriptmodel()
	 * @see #getUserProfile()
	 * @generated
	 */
	EReference getUserProfile_Scriptmodel();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceScenario.UserProfile#getScripting <em>Scripting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scripting</em>'.
	 * @see canopus.canopusPerformanceScenario.UserProfile#getScripting()
	 * @see #getUserProfile()
	 * @generated
	 */
	EReference getUserProfile_Scripting();

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
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.Workload#getVirtualUsers <em>Virtual Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Virtual Users</em>'.
	 * @see canopus.canopusPerformanceScenario.Workload#getVirtualUsers()
	 * @see #getWorkload()
	 * @generated
	 */
	EReference getWorkload_VirtualUsers();

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
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.Workload#getTestDuration <em>Test Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Duration</em>'.
	 * @see canopus.canopusPerformanceScenario.Workload#getTestDuration()
	 * @see #getWorkload()
	 * @generated
	 */
	EReference getWorkload_TestDuration();

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
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see canopus.canopusPerformanceScenario.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.Association#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see canopus.canopusPerformanceScenario.Association#getPercentage()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Percentage();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.Association#getUserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Profile</em>'.
	 * @see canopus.canopusPerformanceScenario.Association#getUserProfile()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_UserProfile();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.Association#getScriptmodel <em>Scriptmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scriptmodel</em>'.
	 * @see canopus.canopusPerformanceScenario.Association#getScriptmodel()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Scriptmodel();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.ScriptModel <em>Script Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Model</em>'.
	 * @see canopus.canopusPerformanceScenario.ScriptModel
	 * @generated
	 */
	EClass getScriptModel();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScenario.ScriptModel#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see canopus.canopusPerformanceScenario.ScriptModel#getActivities()
	 * @see #getScriptModel()
	 * @generated
	 */
	EReference getScriptModel_Activities();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.ScriptModel#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial</em>'.
	 * @see canopus.canopusPerformanceScenario.ScriptModel#getInitial()
	 * @see #getScriptModel()
	 * @generated
	 */
	EReference getScriptModel_Initial();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.ScriptModel#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final</em>'.
	 * @see canopus.canopusPerformanceScenario.ScriptModel#getFinal()
	 * @see #getScriptModel()
	 * @generated
	 */
	EReference getScriptModel_Final();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScenario.ScriptModel#getThinkTime <em>Think Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Think Time</em>'.
	 * @see canopus.canopusPerformanceScenario.ScriptModel#getThinkTime()
	 * @see #getScriptModel()
	 * @generated
	 */
	EReference getScriptModel_ThinkTime();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScenario.ScriptModel#getSaveParameters <em>Save Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Save Parameters</em>'.
	 * @see canopus.canopusPerformanceScenario.ScriptModel#getSaveParameters()
	 * @see #getScriptModel()
	 * @generated
	 */
	EReference getScriptModel_SaveParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScenario.ScriptModel#getDataTables <em>Data Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Tables</em>'.
	 * @see canopus.canopusPerformanceScenario.ScriptModel#getDataTables()
	 * @see #getScriptModel()
	 * @generated
	 */
	EReference getScriptModel_DataTables();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.ScriptModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScenario.ScriptModel#getName()
	 * @see #getScriptModel()
	 * @generated
	 */
	EAttribute getScriptModel_Name();

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
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__PERCENTAGE = eINSTANCE.getUserProfile_Percentage();

		/**
		 * The meta object literal for the '<em><b>Scriptmodel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE__SCRIPTMODEL = eINSTANCE.getUserProfile_Scriptmodel();

		/**
		 * The meta object literal for the '<em><b>Scripting</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE__SCRIPTING = eINSTANCE.getUserProfile_Scripting();

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
		 * The meta object literal for the '<em><b>Virtual Users</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD__VIRTUAL_USERS = eINSTANCE.getWorkload_VirtualUsers();

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
		 * The meta object literal for the '<em><b>Test Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD__TEST_DURATION = eINSTANCE.getWorkload_TestDuration();

		/**
		 * The meta object literal for the '<em><b>Ramp Down Timer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD__RAMP_DOWN_TIMER = eINSTANCE.getWorkload_RampDownTimer();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.impl.AssociationImpl
		 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__PERCENTAGE = eINSTANCE.getAssociation_Percentage();

		/**
		 * The meta object literal for the '<em><b>User Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__USER_PROFILE = eINSTANCE.getAssociation_UserProfile();

		/**
		 * The meta object literal for the '<em><b>Scriptmodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SCRIPTMODEL = eINSTANCE.getAssociation_Scriptmodel();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.impl.ScriptModelImpl <em>Script Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.impl.ScriptModelImpl
		 * @see canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl#getScriptModel()
		 * @generated
		 */
		EClass SCRIPT_MODEL = eINSTANCE.getScriptModel();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_MODEL__ACTIVITIES = eINSTANCE.getScriptModel_Activities();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_MODEL__INITIAL = eINSTANCE.getScriptModel_Initial();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_MODEL__FINAL = eINSTANCE.getScriptModel_Final();

		/**
		 * The meta object literal for the '<em><b>Think Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_MODEL__THINK_TIME = eINSTANCE.getScriptModel_ThinkTime();

		/**
		 * The meta object literal for the '<em><b>Save Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_MODEL__SAVE_PARAMETERS = eINSTANCE.getScriptModel_SaveParameters();

		/**
		 * The meta object literal for the '<em><b>Data Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_MODEL__DATA_TABLES = eINSTANCE.getScriptModel_DataTables();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_MODEL__NAME = eINSTANCE.getScriptModel_Name();

	}

} //CanopusPerformanceScenarioPackage
