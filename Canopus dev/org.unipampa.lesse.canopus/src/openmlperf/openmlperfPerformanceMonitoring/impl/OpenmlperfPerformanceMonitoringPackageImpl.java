/**
 */
package openmlperf.openmlperfPerformanceMonitoring.impl;

import openmlperf.OpenmlperfPackage;

import openmlperf.impl.OpenmlperfPackageImpl;

import openmlperf.openmlperfPerformanceMonitoring.LoadGenerator;
import openmlperf.openmlperfPerformanceMonitoring.MetricModel;
import openmlperf.openmlperfPerformanceMonitoring.Monitor;
import openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringFactory;
import openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage;

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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenmlperfPerformanceMonitoringPackageImpl extends EPackageImpl implements OpenmlperfPerformanceMonitoringPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum suT_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hardwareEEnum = null;

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
	 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenmlperfPerformanceMonitoringPackageImpl() {
		super(eNS_URI, OpenmlperfPerformanceMonitoringFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OpenmlperfPerformanceMonitoringPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenmlperfPerformanceMonitoringPackage init() {
		if (isInited) return (OpenmlperfPerformanceMonitoringPackage)EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceMonitoringPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenmlperfPerformanceMonitoringPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenmlperfPerformanceMonitoringPackageImpl theOpenmlperfPerformanceMonitoringPackage = registeredOpenmlperfPerformanceMonitoringPackage instanceof OpenmlperfPerformanceMonitoringPackageImpl ? (OpenmlperfPerformanceMonitoringPackageImpl)registeredOpenmlperfPerformanceMonitoringPackage : new OpenmlperfPerformanceMonitoringPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPackage.eNS_URI);
		OpenmlperfPackageImpl theOpenmlperfPackage = (OpenmlperfPackageImpl)(registeredPackage instanceof OpenmlperfPackageImpl ? registeredPackage : OpenmlperfPackage.eINSTANCE);
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
		theOpenmlperfPerformanceMonitoringPackage.createPackageContents();
		theOpenmlperfPackage.createPackageContents();
		theOpenmlperfPerformanceMetricPackage.createPackageContents();
		theOpenmlperfPerformanceScenarioPackage.createPackageContents();
		theOpenmlperfPerformanceWorkloadPackage.createPackageContents();
		theOpenmlperfPerformanceScriptingPackage.createPackageContents();
		theOpenmlperfPerformanceExternalFilePackage.createPackageContents();

		// Initialize created meta-data
		theOpenmlperfPerformanceMonitoringPackage.initializePackageContents();
		theOpenmlperfPackage.initializePackageContents();
		theOpenmlperfPerformanceMetricPackage.initializePackageContents();
		theOpenmlperfPerformanceScenarioPackage.initializePackageContents();
		theOpenmlperfPerformanceWorkloadPackage.initializePackageContents();
		theOpenmlperfPerformanceScriptingPackage.initializePackageContents();
		theOpenmlperfPerformanceExternalFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenmlperfPerformanceMonitoringPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenmlperfPerformanceMonitoringPackage.eNS_URI, theOpenmlperfPerformanceMonitoringPackage);
		return theOpenmlperfPerformanceMonitoringPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSUT() {
		return sutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUT_Hostname() {
		return (EAttribute)sutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUT_Ip() {
		return (EAttribute)sutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUT_Hardware() {
		return (EAttribute)sutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUT_Sut() {
		return (EReference)sutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUT_Metricmodel() {
		return (EReference)sutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUT_Type() {
		return (EAttribute)sutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadGenerator() {
		return loadGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadGenerator_Hostname() {
		return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadGenerator_Ip() {
		return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadGenerator_IsMonitor() {
		return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadGenerator_Sut() {
		return (EReference)loadGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadGenerator_Metricmodel() {
		return (EReference)loadGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadGenerator_Hardware() {
		return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadGenerator_Monitor() {
		return (EReference)loadGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitor() {
		return monitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitor_Hostname() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitor_Ip() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_Sut() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitor_Hardware() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitor_Description() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricModel() {
		return metricModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricModel_Name() {
		return (EAttribute)metricModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Memory() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Transaction() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Disk() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Criteria() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Threshold() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Associationcountercriteriathreshold() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_DiskCounter() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_TransactionCounter() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_MemoryCounter() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Counter() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricModel_Metric() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSUT_TYPE() {
		return suT_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHARDWARE() {
		return hardwareEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceMonitoringFactory getOpenmlperfPerformanceMonitoringFactory() {
		return (OpenmlperfPerformanceMonitoringFactory)getEFactoryInstance();
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
		sutEClass = createEClass(SUT);
		createEAttribute(sutEClass, SUT__HOSTNAME);
		createEAttribute(sutEClass, SUT__IP);
		createEAttribute(sutEClass, SUT__HARDWARE);
		createEReference(sutEClass, SUT__SUT);
		createEReference(sutEClass, SUT__METRICMODEL);
		createEAttribute(sutEClass, SUT__TYPE);

		loadGeneratorEClass = createEClass(LOAD_GENERATOR);
		createEAttribute(loadGeneratorEClass, LOAD_GENERATOR__HOSTNAME);
		createEAttribute(loadGeneratorEClass, LOAD_GENERATOR__IP);
		createEAttribute(loadGeneratorEClass, LOAD_GENERATOR__IS_MONITOR);
		createEReference(loadGeneratorEClass, LOAD_GENERATOR__SUT);
		createEReference(loadGeneratorEClass, LOAD_GENERATOR__METRICMODEL);
		createEAttribute(loadGeneratorEClass, LOAD_GENERATOR__HARDWARE);
		createEReference(loadGeneratorEClass, LOAD_GENERATOR__MONITOR);

		monitorEClass = createEClass(MONITOR);
		createEAttribute(monitorEClass, MONITOR__HOSTNAME);
		createEAttribute(monitorEClass, MONITOR__IP);
		createEReference(monitorEClass, MONITOR__SUT);
		createEAttribute(monitorEClass, MONITOR__HARDWARE);
		createEAttribute(monitorEClass, MONITOR__DESCRIPTION);

		metricModelEClass = createEClass(METRIC_MODEL);
		createEAttribute(metricModelEClass, METRIC_MODEL__NAME);
		createEReference(metricModelEClass, METRIC_MODEL__MEMORY);
		createEReference(metricModelEClass, METRIC_MODEL__TRANSACTION);
		createEReference(metricModelEClass, METRIC_MODEL__DISK);
		createEReference(metricModelEClass, METRIC_MODEL__CRITERIA);
		createEReference(metricModelEClass, METRIC_MODEL__THRESHOLD);
		createEReference(metricModelEClass, METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD);
		createEReference(metricModelEClass, METRIC_MODEL__DISK_COUNTER);
		createEReference(metricModelEClass, METRIC_MODEL__TRANSACTION_COUNTER);
		createEReference(metricModelEClass, METRIC_MODEL__MEMORY_COUNTER);
		createEReference(metricModelEClass, METRIC_MODEL__COUNTER);
		createEReference(metricModelEClass, METRIC_MODEL__METRIC);

		// Create enums
		suT_TYPEEEnum = createEEnum(SUT_TYPE);
		hardwareEEnum = createEEnum(HARDWARE);
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
		OpenmlperfPerformanceMetricPackage theOpenmlperfPerformanceMetricPackage = (OpenmlperfPerformanceMetricPackage)EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceMetricPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theOpenmlperfPerformanceMetricPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(sutEClass, openmlperf.openmlperfPerformanceMonitoring.SUT.class, "SUT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSUT_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, openmlperf.openmlperfPerformanceMonitoring.SUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSUT_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, openmlperf.openmlperfPerformanceMonitoring.SUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSUT_Hardware(), this.getHARDWARE(), "hardware", null, 0, 1, openmlperf.openmlperfPerformanceMonitoring.SUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSUT_Sut(), this.getSUT(), null, "sut", null, 0, -1, openmlperf.openmlperfPerformanceMonitoring.SUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSUT_Metricmodel(), this.getMetricModel(), null, "metricmodel", null, 0, 1, openmlperf.openmlperfPerformanceMonitoring.SUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSUT_Type(), this.getSUT_TYPE(), "type", null, 0, 1, openmlperf.openmlperfPerformanceMonitoring.SUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadGeneratorEClass, LoadGenerator.class, "LoadGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadGenerator_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, LoadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadGenerator_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, LoadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadGenerator_IsMonitor(), ecorePackage.getEBoolean(), "isMonitor", null, 0, 1, LoadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadGenerator_Sut(), this.getSUT(), null, "sut", null, 0, -1, LoadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadGenerator_Metricmodel(), this.getMetricModel(), null, "metricmodel", null, 0, 1, LoadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadGenerator_Hardware(), this.getHARDWARE(), "hardware", null, 0, 1, LoadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadGenerator_Monitor(), this.getMonitor(), null, "monitor", null, 0, 1, LoadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monitorEClass, Monitor.class, "Monitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitor_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitor_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitor_Sut(), this.getSUT(), null, "sut", null, 0, -1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitor_Hardware(), this.getHARDWARE(), "hardware", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitor_Description(), ecorePackage.getEString(), "description", "Machine responsible for monitoring the performance metrics of the SUT. This object is optional, since the Load Generator object, besides generating workload for virtual users, can also play the role of monitoring.", 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricModelEClass, MetricModel.class, "MetricModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Memory(), theOpenmlperfPerformanceMetricPackage.getMemory(), null, "memory", null, 0, 1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Transaction(), theOpenmlperfPerformanceMetricPackage.getTransaction(), null, "transaction", null, 0, 1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Disk(), theOpenmlperfPerformanceMetricPackage.getDisk(), null, "disk", null, 0, 1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Criteria(), theOpenmlperfPerformanceMetricPackage.getCriteria(), null, "criteria", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Threshold(), theOpenmlperfPerformanceMetricPackage.getThreshold(), null, "threshold", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Associationcountercriteriathreshold(), theOpenmlperfPerformanceMetricPackage.getAssociationCounterCriteriaThreshold(), null, "associationcountercriteriathreshold", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_DiskCounter(), theOpenmlperfPerformanceMetricPackage.getDisk_IO_Counter(), null, "diskCounter", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_TransactionCounter(), theOpenmlperfPerformanceMetricPackage.getTransactionCounter(), null, "transactionCounter", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_MemoryCounter(), theOpenmlperfPerformanceMetricPackage.getMemoryCounter(), null, "memoryCounter", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Counter(), theOpenmlperfPerformanceMetricPackage.getCounter(), null, "counter", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Metric(), theOpenmlperfPerformanceMetricPackage.getMetric(), null, "metric", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(suT_TYPEEEnum, openmlperf.openmlperfPerformanceMonitoring.SUT_TYPE.class, "SUT_TYPE");
		addEEnumLiteral(suT_TYPEEEnum, openmlperf.openmlperfPerformanceMonitoring.SUT_TYPE.DESKTOPAPP);
		addEEnumLiteral(suT_TYPEEEnum, openmlperf.openmlperfPerformanceMonitoring.SUT_TYPE.DATABASE);
		addEEnumLiteral(suT_TYPEEEnum, openmlperf.openmlperfPerformanceMonitoring.SUT_TYPE.WEBAPP);
		addEEnumLiteral(suT_TYPEEEnum, openmlperf.openmlperfPerformanceMonitoring.SUT_TYPE.WEBSERVICE);

		initEEnum(hardwareEEnum, openmlperf.openmlperfPerformanceMonitoring.HARDWARE.class, "HARDWARE");
		addEEnumLiteral(hardwareEEnum, openmlperf.openmlperfPerformanceMonitoring.HARDWARE.PHYSICAL_MACHINE);
		addEEnumLiteral(hardwareEEnum, openmlperf.openmlperfPerformanceMonitoring.HARDWARE.VIRTUAL_MACHINE);
		addEEnumLiteral(hardwareEEnum, openmlperf.openmlperfPerformanceMonitoring.HARDWARE.CLOUD_SERVICE);
	}

} //OpenmlperfPerformanceMonitoringPackageImpl
