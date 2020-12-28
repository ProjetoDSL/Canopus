/**
 */
package openmlperf;

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
 * @see openmlperf.OpenmlperfFactory
 * @model kind="package"
 * @generated
 */
public interface OpenmlperfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openmlperf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unipampa.lesse.org/openmlperf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openmlperf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenmlperfPackage eINSTANCE = openmlperf.impl.OpenmlperfPackageImpl.init();

	/**
	 * The meta object id for the '{@link openmlperf.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.impl.DiagramImpl
	 * @see openmlperf.impl.OpenmlperfPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 2;

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
	 * The meta object id for the '{@link openmlperf.impl.MonitoringImpl <em>Monitoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.impl.MonitoringImpl
	 * @see openmlperf.impl.OpenmlperfPackageImpl#getMonitoring()
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
	 * The feature id for the '<em><b>Load Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__LOAD_GENERATORS = DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' containment reference list.
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
	 * The meta object id for the '{@link openmlperf.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.impl.ScenarioImpl
	 * @see openmlperf.impl.OpenmlperfPackageImpl#getScenario()
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
	 * The feature id for the '<em><b>Scripting</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCRIPTING = DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Profile To Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__USER_PROFILE_TO_SCRIPT = DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__BASE_URL = DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = DIAGRAM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link openmlperf.Monitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring</em>'.
	 * @see openmlperf.Monitoring
	 * @generated
	 */
	EClass getMonitoring();

	/**
	 * Returns the meta object for the containment reference list '{@link openmlperf.Monitoring#getSuts <em>Suts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Suts</em>'.
	 * @see openmlperf.Monitoring#getSuts()
	 * @see #getMonitoring()
	 * @generated
	 */
	EReference getMonitoring_Suts();

	/**
	 * Returns the meta object for the containment reference list '{@link openmlperf.Monitoring#getLoadGenerators <em>Load Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load Generators</em>'.
	 * @see openmlperf.Monitoring#getLoadGenerators()
	 * @see #getMonitoring()
	 * @generated
	 */
	EReference getMonitoring_LoadGenerators();

	/**
	 * Returns the meta object for the containment reference list '{@link openmlperf.Monitoring#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monitors</em>'.
	 * @see openmlperf.Monitoring#getMonitors()
	 * @see #getMonitoring()
	 * @generated
	 */
	EReference getMonitoring_Monitors();

	/**
	 * Returns the meta object for the containment reference list '{@link openmlperf.Monitoring#getMetricModel <em>Metric Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Model</em>'.
	 * @see openmlperf.Monitoring#getMetricModel()
	 * @see #getMonitoring()
	 * @generated
	 */
	EReference getMonitoring_MetricModel();

	/**
	 * Returns the meta object for class '{@link openmlperf.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see openmlperf.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link openmlperf.Scenario#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see openmlperf.Scenario#getUsers()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link openmlperf.Scenario#getWorkloads <em>Workloads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workloads</em>'.
	 * @see openmlperf.Scenario#getWorkloads()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Workloads();

	/**
	 * Returns the meta object for the containment reference list '{@link openmlperf.Scenario#getScripting <em>Scripting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scripting</em>'.
	 * @see openmlperf.Scenario#getScripting()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Scripting();

	/**
	 * Returns the meta object for the containment reference list '{@link openmlperf.Scenario#getUserProfileToScript <em>User Profile To Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Profile To Script</em>'.
	 * @see openmlperf.Scenario#getUserProfileToScript()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_UserProfileToScript();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.Scenario#getBaseURL <em>Base URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base URL</em>'.
	 * @see openmlperf.Scenario#getBaseURL()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_BaseURL();

	/**
	 * Returns the meta object for class '{@link openmlperf.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see openmlperf.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see openmlperf.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.Diagram#getProjectLabel <em>Project Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Label</em>'.
	 * @see openmlperf.Diagram#getProjectLabel()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ProjectLabel();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.Diagram#getProjectAuthor <em>Project Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Author</em>'.
	 * @see openmlperf.Diagram#getProjectAuthor()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ProjectAuthor();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.Diagram#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see openmlperf.Diagram#getDescription()
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
	OpenmlperfFactory getOpenmlperfFactory();

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
		 * The meta object literal for the '{@link openmlperf.impl.MonitoringImpl <em>Monitoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.impl.MonitoringImpl
		 * @see openmlperf.impl.OpenmlperfPackageImpl#getMonitoring()
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
		 * The meta object literal for the '<em><b>Load Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING__LOAD_GENERATORS = eINSTANCE.getMonitoring_LoadGenerators();

		/**
		 * The meta object literal for the '<em><b>Monitors</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link openmlperf.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.impl.ScenarioImpl
		 * @see openmlperf.impl.OpenmlperfPackageImpl#getScenario()
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
		 * The meta object literal for the '<em><b>Scripting</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SCRIPTING = eINSTANCE.getScenario_Scripting();

		/**
		 * The meta object literal for the '<em><b>User Profile To Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__USER_PROFILE_TO_SCRIPT = eINSTANCE.getScenario_UserProfileToScript();

		/**
		 * The meta object literal for the '<em><b>Base URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__BASE_URL = eINSTANCE.getScenario_BaseURL();

		/**
		 * The meta object literal for the '{@link openmlperf.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.impl.DiagramImpl
		 * @see openmlperf.impl.OpenmlperfPackageImpl#getDiagram()
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

} //OpenmlperfPackage
