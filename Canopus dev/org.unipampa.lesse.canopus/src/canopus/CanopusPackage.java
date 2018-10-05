/**
 */
package canopus;

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
 * @see canopus.CanopusFactory
 * @model kind="package"
 * @generated
 */
public interface CanopusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "canopus";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unipampa.lesse.org/canopus";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "canopus";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanopusPackage eINSTANCE = canopus.impl.CanopusPackageImpl.init();

	/**
	 * The meta object id for the '{@link canopus.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.impl.DiagramImpl
	 * @see canopus.impl.CanopusPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Project Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PROJECT_LABEL = 1;

	/**
	 * The feature id for the '<em><b>Project Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PROJECT_AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.impl.MonitoringImpl <em>Monitoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.impl.MonitoringImpl
	 * @see canopus.impl.CanopusPackageImpl#getMonitoring()
	 * @generated
	 */
	int MONITORING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__NAME = DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Project Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__PROJECT_LABEL = DIAGRAM__PROJECT_LABEL;

	/**
	 * The feature id for the '<em><b>Project Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__PROJECT_AUTHOR = DIAGRAM__PROJECT_AUTHOR;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__DESCRIPTION = DIAGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Suts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__SUTS = DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load Generators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__LOAD_GENERATORS = DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__MONITORS = DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Metric Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__METRIC_MODEL = DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_OPERATION_COUNT = DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link canopus.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.impl.ScenarioImpl
	 * @see canopus.impl.CanopusPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Project Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PROJECT_LABEL = DIAGRAM__PROJECT_LABEL;

	/**
	 * The feature id for the '<em><b>Project Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PROJECT_AUTHOR = DIAGRAM__PROJECT_AUTHOR;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DESCRIPTION = DIAGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__USERS = DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workloads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__WORKLOADS = DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ASSOCIATIONS = DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCRIPTS = DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link canopus.impl.ScriptingImpl <em>Scripting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.impl.ScriptingImpl
	 * @see canopus.impl.CanopusPackageImpl#getScripting()
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
	int SCRIPTING__NAME = DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Project Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__PROJECT_LABEL = DIAGRAM__PROJECT_LABEL;

	/**
	 * The feature id for the '<em><b>Project Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__PROJECT_AUTHOR = DIAGRAM__PROJECT_AUTHOR;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__DESCRIPTION = DIAGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__INITIAL = DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__FINAL = DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__ACTIVITIES = DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Saveparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__SAVEPARAMETERS = DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datatables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__DATATABLES = DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__SCRIPTS = DIAGRAM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scripting</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__SCRIPTING = DIAGRAM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scriptinge Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING__SCRIPTINGE_OPPOSITE = DIAGRAM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Scripting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Scripting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING_OPERATION_COUNT = DIAGRAM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link canopus.Monitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring</em>'.
	 * @see canopus.Monitoring
	 * @generated
	 */
	EClass getMonitoring();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.Monitoring#getSuts <em>Suts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Suts</em>'.
	 * @see canopus.Monitoring#getSuts()
	 * @see #getMonitoring()
	 * @generated
	 */
	EReference getMonitoring_Suts();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.Monitoring#getLoadGenerators <em>Load Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Load Generators</em>'.
	 * @see canopus.Monitoring#getLoadGenerators()
	 * @see #getMonitoring()
	 * @generated
	 */
	EReference getMonitoring_LoadGenerators();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.Monitoring#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitors</em>'.
	 * @see canopus.Monitoring#getMonitors()
	 * @see #getMonitoring()
	 * @generated
	 */
	EReference getMonitoring_Monitors();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.Monitoring#getMetricModel <em>Metric Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Model</em>'.
	 * @see canopus.Monitoring#getMetricModel()
	 * @see #getMonitoring()
	 * @generated
	 */
	EReference getMonitoring_MetricModel();

	/**
	 * Returns the meta object for class '{@link canopus.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see canopus.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.Scenario#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see canopus.Scenario#getUsers()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.Scenario#getWorkloads <em>Workloads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workloads</em>'.
	 * @see canopus.Scenario#getWorkloads()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Workloads();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.Scenario#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associations</em>'.
	 * @see canopus.Scenario#getAssociations()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Associations();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.Scenario#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scripts</em>'.
	 * @see canopus.Scenario#getScripts()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Scripts();

	/**
	 * Returns the meta object for class '{@link canopus.Scripting <em>Scripting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripting</em>'.
	 * @see canopus.Scripting
	 * @generated
	 */
	EClass getScripting();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.Scripting#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial</em>'.
	 * @see canopus.Scripting#getInitial()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Initial();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.Scripting#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final</em>'.
	 * @see canopus.Scripting#getFinal()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Final();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.Scripting#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see canopus.Scripting#getActivities()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.Scripting#getSaveparameters <em>Saveparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Saveparameters</em>'.
	 * @see canopus.Scripting#getSaveparameters()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Saveparameters();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.Scripting#getDatatables <em>Datatables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatables</em>'.
	 * @see canopus.Scripting#getDatatables()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Datatables();

	/**
	 * Returns the meta object for the reference list '{@link canopus.Scripting#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scripts</em>'.
	 * @see canopus.Scripting#getScripts()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Scripts();

	/**
	 * Returns the meta object for the reference list '{@link canopus.Scripting#getScripting <em>Scripting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scripting</em>'.
	 * @see canopus.Scripting#getScripting()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_Scripting();

	/**
	 * Returns the meta object for the reference list '{@link canopus.Scripting#getScriptingeOpposite <em>Scriptinge Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scriptinge Opposite</em>'.
	 * @see canopus.Scripting#getScriptingeOpposite()
	 * @see #getScripting()
	 * @generated
	 */
	EReference getScripting_ScriptingeOpposite();

	/**
	 * Returns the meta object for class '{@link canopus.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see canopus.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link canopus.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link canopus.Diagram#getProjectLabel <em>Project Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Label</em>'.
	 * @see canopus.Diagram#getProjectLabel()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ProjectLabel();

	/**
	 * Returns the meta object for the attribute '{@link canopus.Diagram#getProjectAuthor <em>Project Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Author</em>'.
	 * @see canopus.Diagram#getProjectAuthor()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ProjectAuthor();

	/**
	 * Returns the meta object for the attribute '{@link canopus.Diagram#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see canopus.Diagram#getDescription()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CanopusFactory getCanopusFactory();

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
		 * The meta object literal for the '{@link canopus.impl.MonitoringImpl <em>Monitoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.impl.MonitoringImpl
		 * @see canopus.impl.CanopusPackageImpl#getMonitoring()
		 * @generated
		 */
		EClass MONITORING = eINSTANCE.getMonitoring();

		/**
		 * The meta object literal for the '<em><b>Suts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING__SUTS = eINSTANCE.getMonitoring_Suts();

		/**
		 * The meta object literal for the '<em><b>Load Generators</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING__LOAD_GENERATORS = eINSTANCE.getMonitoring_LoadGenerators();

		/**
		 * The meta object literal for the '<em><b>Monitors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING__MONITORS = eINSTANCE.getMonitoring_Monitors();

		/**
		 * The meta object literal for the '<em><b>Metric Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING__METRIC_MODEL = eINSTANCE.getMonitoring_MetricModel();

		/**
		 * The meta object literal for the '{@link canopus.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.impl.ScenarioImpl
		 * @see canopus.impl.CanopusPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__USERS = eINSTANCE.getScenario_Users();

		/**
		 * The meta object literal for the '<em><b>Workloads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__WORKLOADS = eINSTANCE.getScenario_Workloads();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__ASSOCIATIONS = eINSTANCE.getScenario_Associations();

		/**
		 * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SCRIPTS = eINSTANCE.getScenario_Scripts();

		/**
		 * The meta object literal for the '{@link canopus.impl.ScriptingImpl <em>Scripting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.impl.ScriptingImpl
		 * @see canopus.impl.CanopusPackageImpl#getScripting()
		 * @generated
		 */
		EClass SCRIPTING = eINSTANCE.getScripting();

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
		 * The meta object literal for the '<em><b>Scripts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING__SCRIPTS = eINSTANCE.getScripting_Scripts();

		/**
		 * The meta object literal for the '<em><b>Scripting</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING__SCRIPTING = eINSTANCE.getScripting_Scripting();

		/**
		 * The meta object literal for the '<em><b>Scriptinge Opposite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING__SCRIPTINGE_OPPOSITE = eINSTANCE.getScripting_ScriptingeOpposite();

		/**
		 * The meta object literal for the '{@link canopus.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.impl.DiagramImpl
		 * @see canopus.impl.CanopusPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Project Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__PROJECT_LABEL = eINSTANCE.getDiagram_ProjectLabel();

		/**
		 * The meta object literal for the '<em><b>Project Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__PROJECT_AUTHOR = eINSTANCE.getDiagram_ProjectAuthor();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__DESCRIPTION = eINSTANCE.getDiagram_Description();

	}

} //CanopusPackage
