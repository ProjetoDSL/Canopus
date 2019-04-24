/**
 */
package canopus.canopusPerformanceMonitoring.impl;

import canopus.CanopusPackage;

import canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringFactory;
import canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage;
import canopus.canopusPerformanceMonitoring.LoadGenerator;
import canopus.canopusPerformanceMonitoring.MetricModel;
import canopus.canopusPerformanceMonitoring.Monitor;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl;

import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.CanopusPerformanceExternalFilePackage;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.impl.CanopusPerformanceExternalFilePackageImpl;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl;

import canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl;

import canopus.impl.CanopusPackageImpl;

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
public class CanopusPerformanceMonitoringPackageImpl extends EPackageImpl implements CanopusPerformanceMonitoringPackage {
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
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CanopusPerformanceMonitoringPackageImpl() {
		super(eNS_URI, CanopusPerformanceMonitoringFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CanopusPerformanceMonitoringPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CanopusPerformanceMonitoringPackage init() {
		if (isInited) return (CanopusPerformanceMonitoringPackage)EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceMonitoringPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCanopusPerformanceMonitoringPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CanopusPerformanceMonitoringPackageImpl theCanopusPerformanceMonitoringPackage = registeredCanopusPerformanceMonitoringPackage instanceof CanopusPerformanceMonitoringPackageImpl ? (CanopusPerformanceMonitoringPackageImpl)registeredCanopusPerformanceMonitoringPackage : new CanopusPerformanceMonitoringPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPackage.eNS_URI);
		CanopusPackageImpl theCanopusPackage = (CanopusPackageImpl)(registeredPackage instanceof CanopusPackageImpl ? registeredPackage : CanopusPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceMetricPackage.eNS_URI);
		CanopusPerformanceMetricPackageImpl theCanopusPerformanceMetricPackage = (CanopusPerformanceMetricPackageImpl)(registeredPackage instanceof CanopusPerformanceMetricPackageImpl ? registeredPackage : CanopusPerformanceMetricPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceScenarioPackage.eNS_URI);
		CanopusPerformanceScenarioPackageImpl theCanopusPerformanceScenarioPackage = (CanopusPerformanceScenarioPackageImpl)(registeredPackage instanceof CanopusPerformanceScenarioPackageImpl ? registeredPackage : CanopusPerformanceScenarioPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceWorkloadPackage.eNS_URI);
		CanopusPerformanceWorkloadPackageImpl theCanopusPerformanceWorkloadPackage = (CanopusPerformanceWorkloadPackageImpl)(registeredPackage instanceof CanopusPerformanceWorkloadPackageImpl ? registeredPackage : CanopusPerformanceWorkloadPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceScriptingPackage.eNS_URI);
		CanopusPerformanceScriptingPackageImpl theCanopusPerformanceScriptingPackage = (CanopusPerformanceScriptingPackageImpl)(registeredPackage instanceof CanopusPerformanceScriptingPackageImpl ? registeredPackage : CanopusPerformanceScriptingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceExternalFilePackage.eNS_URI);
		CanopusPerformanceExternalFilePackageImpl theCanopusPerformanceExternalFilePackage = (CanopusPerformanceExternalFilePackageImpl)(registeredPackage instanceof CanopusPerformanceExternalFilePackageImpl ? registeredPackage : CanopusPerformanceExternalFilePackage.eINSTANCE);

		// Create package meta-data objects
		theCanopusPerformanceMonitoringPackage.createPackageContents();
		theCanopusPackage.createPackageContents();
		theCanopusPerformanceMetricPackage.createPackageContents();
		theCanopusPerformanceScenarioPackage.createPackageContents();
		theCanopusPerformanceWorkloadPackage.createPackageContents();
		theCanopusPerformanceScriptingPackage.createPackageContents();
		theCanopusPerformanceExternalFilePackage.createPackageContents();

		// Initialize created meta-data
		theCanopusPerformanceMonitoringPackage.initializePackageContents();
		theCanopusPackage.initializePackageContents();
		theCanopusPerformanceMetricPackage.initializePackageContents();
		theCanopusPerformanceScenarioPackage.initializePackageContents();
		theCanopusPerformanceWorkloadPackage.initializePackageContents();
		theCanopusPerformanceScriptingPackage.initializePackageContents();
		theCanopusPerformanceExternalFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCanopusPerformanceMonitoringPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CanopusPerformanceMonitoringPackage.eNS_URI, theCanopusPerformanceMonitoringPackage);
		return theCanopusPerformanceMonitoringPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSUT() {
		return sutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSUT_Hostname() {
		return (EAttribute)sutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSUT_Ip() {
		return (EAttribute)sutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSUT_Hardware() {
		return (EAttribute)sutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSUT_Sut() {
		return (EReference)sutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSUT_Metricmodel() {
		return (EReference)sutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSUT_Type() {
		return (EAttribute)sutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoadGenerator() {
		return loadGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoadGenerator_Hostname() {
		return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoadGenerator_Ip() {
		return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoadGenerator_IsMonitor() {
		return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoadGenerator_Sut() {
		return (EReference)loadGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoadGenerator_Metricmodel() {
		return (EReference)loadGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoadGenerator_Hardware() {
		return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoadGenerator_Monitor() {
		return (EReference)loadGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMonitor() {
		return monitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitor_Hostname() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitor_Ip() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMonitor_Sut() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitor_Hardware() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitor_Description() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetricModel() {
		return metricModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetricModel_Name() {
		return (EAttribute)metricModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetricModel_Memory() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetricModel_Transaction() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetricModel_Disk() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetricModel_Criteria() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetricModel_Threshold() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetricModel_Associationcountercriteriathreshold() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetricModel_DiskCounter() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetricModel_TransactionCounter() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetricModel_MemoryCounter() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetricModel_Counter() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetricModel_Metric() {
		return (EReference)metricModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSUT_TYPE() {
		return suT_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHARDWARE() {
		return hardwareEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CanopusPerformanceMonitoringFactory getCanopusPerformanceMonitoringFactory() {
		return (CanopusPerformanceMonitoringFactory)getEFactoryInstance();
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
		CanopusPerformanceMetricPackage theCanopusPerformanceMetricPackage = (CanopusPerformanceMetricPackage)EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceMetricPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCanopusPerformanceMetricPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(sutEClass, canopus.canopusPerformanceMonitoring.SUT.class, "SUT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSUT_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, canopus.canopusPerformanceMonitoring.SUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSUT_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, canopus.canopusPerformanceMonitoring.SUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSUT_Hardware(), this.getHARDWARE(), "hardware", null, 0, 1, canopus.canopusPerformanceMonitoring.SUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSUT_Sut(), this.getSUT(), null, "sut", null, 0, -1, canopus.canopusPerformanceMonitoring.SUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSUT_Metricmodel(), this.getMetricModel(), null, "metricmodel", null, 0, 1, canopus.canopusPerformanceMonitoring.SUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSUT_Type(), this.getSUT_TYPE(), "type", null, 0, 1, canopus.canopusPerformanceMonitoring.SUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getMetricModel_Memory(), theCanopusPerformanceMetricPackage.getMemory(), null, "memory", null, 0, 1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Transaction(), theCanopusPerformanceMetricPackage.getTransaction(), null, "transaction", null, 0, 1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Disk(), theCanopusPerformanceMetricPackage.getDisk(), null, "disk", null, 0, 1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Criteria(), theCanopusPerformanceMetricPackage.getCriteria(), null, "criteria", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Threshold(), theCanopusPerformanceMetricPackage.getThreshold(), null, "threshold", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Associationcountercriteriathreshold(), theCanopusPerformanceMetricPackage.getAssociationCounterCriteriaThreshold(), null, "associationcountercriteriathreshold", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_DiskCounter(), theCanopusPerformanceMetricPackage.getDisk_IO_Counter(), null, "diskCounter", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_TransactionCounter(), theCanopusPerformanceMetricPackage.getTransactionCounter(), null, "transactionCounter", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_MemoryCounter(), theCanopusPerformanceMetricPackage.getMemoryCounter(), null, "memoryCounter", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Counter(), theCanopusPerformanceMetricPackage.getCounter(), null, "counter", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricModel_Metric(), theCanopusPerformanceMetricPackage.getMetric(), null, "metric", null, 0, -1, MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(suT_TYPEEEnum, canopus.canopusPerformanceMonitoring.SUT_TYPE.class, "SUT_TYPE");
		addEEnumLiteral(suT_TYPEEEnum, canopus.canopusPerformanceMonitoring.SUT_TYPE.DESKTOPAPP);
		addEEnumLiteral(suT_TYPEEEnum, canopus.canopusPerformanceMonitoring.SUT_TYPE.DATABASE);
		addEEnumLiteral(suT_TYPEEEnum, canopus.canopusPerformanceMonitoring.SUT_TYPE.WEBAPP);
		addEEnumLiteral(suT_TYPEEEnum, canopus.canopusPerformanceMonitoring.SUT_TYPE.WEBSERVICE);

		initEEnum(hardwareEEnum, canopus.canopusPerformanceMonitoring.HARDWARE.class, "HARDWARE");
		addEEnumLiteral(hardwareEEnum, canopus.canopusPerformanceMonitoring.HARDWARE.PHYSICAL_MACHINE);
		addEEnumLiteral(hardwareEEnum, canopus.canopusPerformanceMonitoring.HARDWARE.VIRTUAL_MACHINE);
		addEEnumLiteral(hardwareEEnum, canopus.canopusPerformanceMonitoring.HARDWARE.CLOUD_SERVICE);
	}

} //CanopusPerformanceMonitoringPackageImpl
