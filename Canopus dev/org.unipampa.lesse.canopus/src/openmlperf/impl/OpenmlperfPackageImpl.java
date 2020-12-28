/**
 */
package openmlperf.impl;

import openmlperf.Diagram;
import openmlperf.Monitoring;
import openmlperf.OpenmlperfFactory;
import openmlperf.OpenmlperfPackage;
import openmlperf.Scenario;

import openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage;

import openmlperf.openmlperfPerformanceMonitoring.impl.OpenmlperfPerformanceMonitoringPackageImpl;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl;

import openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage;

import openmlperf.openmlperfPerformanceScenario.impl.OpenmlperfPerformanceScenarioPackageImpl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.OpenmlperfPerformanceExternalFilePackage;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.impl.OpenmlperfPerformanceExternalFilePackageImpl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadPackage;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenmlperfPackageImpl extends EPackageImpl implements OpenmlperfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see openmlperf.OpenmlperfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenmlperfPackageImpl() {
		super(eNS_URI, OpenmlperfFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OpenmlperfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenmlperfPackage init() {
		if (isInited) return (OpenmlperfPackage)EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenmlperfPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenmlperfPackageImpl theOpenmlperfPackage = registeredOpenmlperfPackage instanceof OpenmlperfPackageImpl ? (OpenmlperfPackageImpl)registeredOpenmlperfPackage : new OpenmlperfPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceMonitoringPackage.eNS_URI);
		OpenmlperfPerformanceMonitoringPackageImpl theOpenmlperfPerformanceMonitoringPackage = (OpenmlperfPerformanceMonitoringPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceMonitoringPackageImpl ? registeredPackage : OpenmlperfPerformanceMonitoringPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceMetricPackage.eNS_URI);
		OpenmlperfPerformanceMetricPackageImpl theOpenmlperfPerformanceMetricPackage = (OpenmlperfPerformanceMetricPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceMetricPackageImpl ? registeredPackage : OpenmlperfPerformanceMetricPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceScenarioPackage.eNS_URI);
		OpenmlperfPerformanceScenarioPackageImpl theOpenmlperfPerformanceScenarioPackage = (OpenmlperfPerformanceScenarioPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceScenarioPackageImpl ? registeredPackage : OpenmlperfPerformanceScenarioPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceWorkloadPackage.eNS_URI);
		OpenmlperfPerformanceWorkloadPackageImpl theOpenmlperfPerformanceWorkloadPackage = (OpenmlperfPerformanceWorkloadPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceWorkloadPackageImpl ? registeredPackage : OpenmlperfPerformanceWorkloadPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceScriptingPackage.eNS_URI);
		OpenmlperfPerformanceScriptingPackageImpl theOpenmlperfPerformanceScriptingPackage = (OpenmlperfPerformanceScriptingPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceScriptingPackageImpl ? registeredPackage : OpenmlperfPerformanceScriptingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceExternalFilePackage.eNS_URI);
		OpenmlperfPerformanceExternalFilePackageImpl theOpenmlperfPerformanceExternalFilePackage = (OpenmlperfPerformanceExternalFilePackageImpl)(registeredPackage instanceof OpenmlperfPerformanceExternalFilePackageImpl ? registeredPackage : OpenmlperfPerformanceExternalFilePackage.eINSTANCE);

		// Create package meta-data objects
		theOpenmlperfPackage.createPackageContents();
		theOpenmlperfPerformanceMonitoringPackage.createPackageContents();
		theOpenmlperfPerformanceMetricPackage.createPackageContents();
		theOpenmlperfPerformanceScenarioPackage.createPackageContents();
		theOpenmlperfPerformanceWorkloadPackage.createPackageContents();
		theOpenmlperfPerformanceScriptingPackage.createPackageContents();
		theOpenmlperfPerformanceExternalFilePackage.createPackageContents();

		// Initialize created meta-data
		theOpenmlperfPackage.initializePackageContents();
		theOpenmlperfPerformanceMonitoringPackage.initializePackageContents();
		theOpenmlperfPerformanceMetricPackage.initializePackageContents();
		theOpenmlperfPerformanceScenarioPackage.initializePackageContents();
		theOpenmlperfPerformanceWorkloadPackage.initializePackageContents();
		theOpenmlperfPerformanceScriptingPackage.initializePackageContents();
		theOpenmlperfPerformanceExternalFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenmlperfPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenmlperfPackage.eNS_URI, theOpenmlperfPackage);
		return theOpenmlperfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoring() {
		return monitoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoring_Suts() {
		return (EReference)monitoringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoring_LoadGenerators() {
		return (EReference)monitoringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoring_Monitors() {
		return (EReference)monitoringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoring_MetricModel() {
		return (EReference)monitoringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Users() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Workloads() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Scripting() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_UserProfileToScript() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_BaseURL() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Name() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_ProjectLabel() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_ProjectAuthor() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Description() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfFactory getOpenmlperfFactory() {
		return (OpenmlperfFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		monitoringEClass = createEClass(MONITORING);
		createEReference(monitoringEClass, MONITORING__SUTS);
		createEReference(monitoringEClass, MONITORING__LOAD_GENERATORS);
		createEReference(monitoringEClass, MONITORING__MONITORS);
		createEReference(monitoringEClass, MONITORING__METRIC_MODEL);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__USERS);
		createEReference(scenarioEClass, SCENARIO__WORKLOADS);
		createEReference(scenarioEClass, SCENARIO__SCRIPTING);
		createEReference(scenarioEClass, SCENARIO__USER_PROFILE_TO_SCRIPT);
		createEAttribute(scenarioEClass, SCENARIO__BASE_URL);

		diagramEClass = createEClass(DIAGRAM);
		createEAttribute(diagramEClass, DIAGRAM__NAME);
		createEAttribute(diagramEClass, DIAGRAM__PROJECT_LABEL);
		createEAttribute(diagramEClass, DIAGRAM__PROJECT_AUTHOR);
		createEAttribute(diagramEClass, DIAGRAM__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OpenmlperfPerformanceMonitoringPackage theOpenmlperfPerformanceMonitoringPackage = (OpenmlperfPerformanceMonitoringPackage)EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceMonitoringPackage.eNS_URI);
		OpenmlperfPerformanceScenarioPackage theOpenmlperfPerformanceScenarioPackage = (OpenmlperfPerformanceScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceScenarioPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theOpenmlperfPerformanceMonitoringPackage);
		getESubpackages().add(theOpenmlperfPerformanceScenarioPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		monitoringEClass.getESuperTypes().add(this.getDiagram());
		scenarioEClass.getESuperTypes().add(this.getDiagram());

		// Initialize classes, features, and operations; add parameters
		initEClass(monitoringEClass, Monitoring.class, "Monitoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonitoring_Suts(), theOpenmlperfPerformanceMonitoringPackage.getSUT(), null, "suts", null, 1, -1, Monitoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitoring_LoadGenerators(), theOpenmlperfPerformanceMonitoringPackage.getLoadGenerator(), null, "loadGenerators", null, 1, -1, Monitoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitoring_Monitors(), theOpenmlperfPerformanceMonitoringPackage.getMonitor(), null, "monitors", null, 0, -1, Monitoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitoring_MetricModel(), theOpenmlperfPerformanceMonitoringPackage.getMetricModel(), null, "metricModel", null, 0, -1, Monitoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_Users(), theOpenmlperfPerformanceScenarioPackage.getUserProfile(), null, "users", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Workloads(), theOpenmlperfPerformanceScenarioPackage.getWorkload(), null, "workloads", null, 0, 3, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Scripting(), theOpenmlperfPerformanceScenarioPackage.getScripting(), null, "scripting", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_UserProfileToScript(), theOpenmlperfPerformanceScenarioPackage.getUserProfileToScript(), null, "userProfileToScript", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_BaseURL(), ecorePackage.getEString(), "baseURL", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramEClass, Diagram.class, "Diagram", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_ProjectLabel(), ecorePackage.getEString(), "projectLabel", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_ProjectAuthor(), ecorePackage.getEString(), "projectAuthor", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Description(), ecorePackage.getEString(), "description", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OpenmlperfPackageImpl
