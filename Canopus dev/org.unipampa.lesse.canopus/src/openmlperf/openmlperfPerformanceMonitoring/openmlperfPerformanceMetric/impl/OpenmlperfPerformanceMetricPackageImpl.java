/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl;

import openmlperf.OpenmlperfPackage;

import openmlperf.impl.OpenmlperfPackageImpl;

import openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage;

import openmlperf.openmlperfPerformanceMonitoring.impl.OpenmlperfPerformanceMonitoringPackageImpl;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Counter;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Criteria;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk_IO_Counter;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Memory;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.MemoryCounter;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Metric;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricFactory;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Threshold;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Transaction;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.TransactionCounter;

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
public class OpenmlperfPerformanceMetricPackageImpl extends EPackageImpl implements OpenmlperfPerformanceMetricPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationCounterCriteriaThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disk_IO_CounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryCounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionCounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum associatioN_CRITERIAEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum counteR_DISKEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum counteR_MEMORYEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum counteR_TRANSACTIONEEnum = null;

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
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenmlperfPerformanceMetricPackageImpl() {
		super(eNS_URI, OpenmlperfPerformanceMetricFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OpenmlperfPerformanceMetricPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenmlperfPerformanceMetricPackage init() {
		if (isInited) return (OpenmlperfPerformanceMetricPackage)EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceMetricPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenmlperfPerformanceMetricPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenmlperfPerformanceMetricPackageImpl theOpenmlperfPerformanceMetricPackage = registeredOpenmlperfPerformanceMetricPackage instanceof OpenmlperfPerformanceMetricPackageImpl ? (OpenmlperfPerformanceMetricPackageImpl)registeredOpenmlperfPerformanceMetricPackage : new OpenmlperfPerformanceMetricPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPackage.eNS_URI);
		OpenmlperfPackageImpl theOpenmlperfPackage = (OpenmlperfPackageImpl)(registeredPackage instanceof OpenmlperfPackageImpl ? registeredPackage : OpenmlperfPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceMonitoringPackage.eNS_URI);
		OpenmlperfPerformanceMonitoringPackageImpl theOpenmlperfPerformanceMonitoringPackage = (OpenmlperfPerformanceMonitoringPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceMonitoringPackageImpl ? registeredPackage : OpenmlperfPerformanceMonitoringPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceScenarioPackage.eNS_URI);
		OpenmlperfPerformanceScenarioPackageImpl theOpenmlperfPerformanceScenarioPackage = (OpenmlperfPerformanceScenarioPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceScenarioPackageImpl ? registeredPackage : OpenmlperfPerformanceScenarioPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceWorkloadPackage.eNS_URI);
		OpenmlperfPerformanceWorkloadPackageImpl theOpenmlperfPerformanceWorkloadPackage = (OpenmlperfPerformanceWorkloadPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceWorkloadPackageImpl ? registeredPackage : OpenmlperfPerformanceWorkloadPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceScriptingPackage.eNS_URI);
		OpenmlperfPerformanceScriptingPackageImpl theOpenmlperfPerformanceScriptingPackage = (OpenmlperfPerformanceScriptingPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceScriptingPackageImpl ? registeredPackage : OpenmlperfPerformanceScriptingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceExternalFilePackage.eNS_URI);
		OpenmlperfPerformanceExternalFilePackageImpl theOpenmlperfPerformanceExternalFilePackage = (OpenmlperfPerformanceExternalFilePackageImpl)(registeredPackage instanceof OpenmlperfPerformanceExternalFilePackageImpl ? registeredPackage : OpenmlperfPerformanceExternalFilePackage.eINSTANCE);

		// Create package meta-data objects
		theOpenmlperfPerformanceMetricPackage.createPackageContents();
		theOpenmlperfPackage.createPackageContents();
		theOpenmlperfPerformanceMonitoringPackage.createPackageContents();
		theOpenmlperfPerformanceScenarioPackage.createPackageContents();
		theOpenmlperfPerformanceWorkloadPackage.createPackageContents();
		theOpenmlperfPerformanceScriptingPackage.createPackageContents();
		theOpenmlperfPerformanceExternalFilePackage.createPackageContents();

		// Initialize created meta-data
		theOpenmlperfPerformanceMetricPackage.initializePackageContents();
		theOpenmlperfPackage.initializePackageContents();
		theOpenmlperfPerformanceMonitoringPackage.initializePackageContents();
		theOpenmlperfPerformanceScenarioPackage.initializePackageContents();
		theOpenmlperfPerformanceWorkloadPackage.initializePackageContents();
		theOpenmlperfPerformanceScriptingPackage.initializePackageContents();
		theOpenmlperfPerformanceExternalFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenmlperfPerformanceMetricPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenmlperfPerformanceMetricPackage.eNS_URI, theOpenmlperfPerformanceMetricPackage);
		return theOpenmlperfPerformanceMetricPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemory_MemoryCounter() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisk() {
		return diskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisk_Disk_io_counter() {
		return (EReference)diskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationCounterCriteriaThreshold() {
		return associationCounterCriteriaThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationCounterCriteriaThreshold_AssociationCriteria() {
		return (EAttribute)associationCounterCriteriaThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationCounterCriteriaThreshold_Threshold() {
		return (EReference)associationCounterCriteriaThresholdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationCounterCriteriaThreshold_Criteria() {
		return (EReference)associationCounterCriteriaThresholdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCounter() {
		return counterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounter_Name() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCounter_Associationcountercriteriathreshold() {
		return (EReference)counterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisk_IO_Counter() {
		return disk_IO_CounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_IO_Counter_CounterDisk() {
		return (EAttribute)disk_IO_CounterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriteria() {
		return criteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCriteria_Value() {
		return (EAttribute)criteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreshold() {
		return thresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreshold_Value() {
		return (EAttribute)thresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryCounter() {
		return memoryCounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryCounter_CounterMemory() {
		return (EAttribute)memoryCounterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_TransactionCounter() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionCounter() {
		return transactionCounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionCounter_CounterTransaction() {
		return (EAttribute)transactionCounterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Name() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getASSOCIATION_CRITERIA() {
		return associatioN_CRITERIAEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCOUNTER_DISK() {
		return counteR_DISKEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCOUNTER_MEMORY() {
		return counteR_MEMORYEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCOUNTER_TRANSACTION() {
		return counteR_TRANSACTIONEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceMetricFactory getOpenmlperfPerformanceMetricFactory() {
		return (OpenmlperfPerformanceMetricFactory)getEFactoryInstance();
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
		memoryEClass = createEClass(MEMORY);
		createEReference(memoryEClass, MEMORY__MEMORY_COUNTER);

		diskEClass = createEClass(DISK);
		createEReference(diskEClass, DISK__DISK_IO_COUNTER);

		associationCounterCriteriaThresholdEClass = createEClass(ASSOCIATION_COUNTER_CRITERIA_THRESHOLD);
		createEAttribute(associationCounterCriteriaThresholdEClass, ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__ASSOCIATION_CRITERIA);
		createEReference(associationCounterCriteriaThresholdEClass, ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__THRESHOLD);
		createEReference(associationCounterCriteriaThresholdEClass, ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__CRITERIA);

		counterEClass = createEClass(COUNTER);
		createEAttribute(counterEClass, COUNTER__NAME);
		createEReference(counterEClass, COUNTER__ASSOCIATIONCOUNTERCRITERIATHRESHOLD);

		disk_IO_CounterEClass = createEClass(DISK_IO_COUNTER);
		createEAttribute(disk_IO_CounterEClass, DISK_IO_COUNTER__COUNTER_DISK);

		criteriaEClass = createEClass(CRITERIA);
		createEAttribute(criteriaEClass, CRITERIA__VALUE);

		thresholdEClass = createEClass(THRESHOLD);
		createEAttribute(thresholdEClass, THRESHOLD__VALUE);

		memoryCounterEClass = createEClass(MEMORY_COUNTER);
		createEAttribute(memoryCounterEClass, MEMORY_COUNTER__COUNTER_MEMORY);

		transactionEClass = createEClass(TRANSACTION);
		createEReference(transactionEClass, TRANSACTION__TRANSACTION_COUNTER);

		transactionCounterEClass = createEClass(TRANSACTION_COUNTER);
		createEAttribute(transactionCounterEClass, TRANSACTION_COUNTER__COUNTER_TRANSACTION);

		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__NAME);

		// Create enums
		associatioN_CRITERIAEEnum = createEEnum(ASSOCIATION_CRITERIA);
		counteR_DISKEEnum = createEEnum(COUNTER_DISK);
		counteR_MEMORYEEnum = createEEnum(COUNTER_MEMORY);
		counteR_TRANSACTIONEEnum = createEEnum(COUNTER_TRANSACTION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		memoryEClass.getESuperTypes().add(this.getMetric());
		diskEClass.getESuperTypes().add(this.getMetric());
		disk_IO_CounterEClass.getESuperTypes().add(this.getCounter());
		memoryCounterEClass.getESuperTypes().add(this.getCounter());
		transactionEClass.getESuperTypes().add(this.getMetric());
		transactionCounterEClass.getESuperTypes().add(this.getCounter());

		// Initialize classes, features, and operations; add parameters
		initEClass(memoryEClass, Memory.class, "Memory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemory_MemoryCounter(), this.getMemoryCounter(), null, "memoryCounter", null, 0, -1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diskEClass, Disk.class, "Disk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisk_Disk_io_counter(), this.getDisk_IO_Counter(), null, "disk_io_counter", null, 0, -1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationCounterCriteriaThresholdEClass, AssociationCounterCriteriaThreshold.class, "AssociationCounterCriteriaThreshold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationCounterCriteriaThreshold_AssociationCriteria(), this.getASSOCIATION_CRITERIA(), "associationCriteria", null, 0, 1, AssociationCounterCriteriaThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationCounterCriteriaThreshold_Threshold(), this.getThreshold(), null, "threshold", null, 0, -1, AssociationCounterCriteriaThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationCounterCriteriaThreshold_Criteria(), this.getCriteria(), null, "criteria", null, 0, -1, AssociationCounterCriteriaThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(counterEClass, Counter.class, "Counter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCounter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCounter_Associationcountercriteriathreshold(), this.getAssociationCounterCriteriaThreshold(), null, "associationcountercriteriathreshold", null, 0, -1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disk_IO_CounterEClass, Disk_IO_Counter.class, "Disk_IO_Counter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisk_IO_Counter_CounterDisk(), this.getCOUNTER_DISK(), "counterDisk", null, 1, 1, Disk_IO_Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(criteriaEClass, Criteria.class, "Criteria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCriteria_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Criteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thresholdEClass, Threshold.class, "Threshold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreshold_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Threshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryCounterEClass, MemoryCounter.class, "MemoryCounter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryCounter_CounterMemory(), this.getCOUNTER_MEMORY(), "counterMemory", null, 1, 1, MemoryCounter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransaction_TransactionCounter(), this.getTransactionCounter(), null, "transactionCounter", null, 0, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionCounterEClass, TransactionCounter.class, "TransactionCounter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransactionCounter_CounterTransaction(), this.getCOUNTER_TRANSACTION(), "counterTransaction", null, 1, 1, TransactionCounter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(associatioN_CRITERIAEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.ASSOCIATION_CRITERIA.class, "ASSOCIATION_CRITERIA");
		addEEnumLiteral(associatioN_CRITERIAEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.ASSOCIATION_CRITERIA.BETWEEN);
		addEEnumLiteral(associatioN_CRITERIAEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.ASSOCIATION_CRITERIA.GREATER_THAN_OR_EQUAL_TO);
		addEEnumLiteral(associatioN_CRITERIAEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.ASSOCIATION_CRITERIA.LESS_THAN);

		initEEnum(counteR_DISKEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK.class, "COUNTER_DISK");
		addEEnumLiteral(counteR_DISKEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK.AVG_DISK_SECS_TRANSFER_COUNTER);
		addEEnumLiteral(counteR_DISKEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK.PERCENTAGE_IDLE_TIME_COUNTER);
		addEEnumLiteral(counteR_DISKEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK.DISK_TRANSFERS_SEC_COUNTER);
		addEEnumLiteral(counteR_DISKEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK.AVG_DISK_QUEUE_LENGTH_COUNTER);
		addEEnumLiteral(counteR_DISKEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK.SPLIT_IO_SEC_COUNTER);
		addEEnumLiteral(counteR_DISKEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK.FREE_MEGABYTES_COUNTER);

		initEEnum(counteR_MEMORYEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY.class, "COUNTER_MEMORY");
		addEEnumLiteral(counteR_MEMORYEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY.AVALIABLE_MBYTES_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY.PAGES_SEC_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY.PAGE_READS_SEC_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY.WORKING_SET_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY.POOL_NONPAGE_BYTES_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY.PAGED_POOL_BYTES_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY.PAGED_POOL_FAILURES_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY.CACHE_BYTES_COUNTER);

		initEEnum(counteR_TRANSACTIONEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_TRANSACTION.class, "COUNTER_TRANSACTION");
		addEEnumLiteral(counteR_TRANSACTIONEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_TRANSACTION.TRANSACTION_RESPONSE_TIME);
		addEEnumLiteral(counteR_TRANSACTIONEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_TRANSACTION.TRANSACTION_PER_SECOND_TPS);
		addEEnumLiteral(counteR_TRANSACTIONEEnum, openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_TRANSACTION.TRANSACTION_SUCCESS_RATE);
	}

} //OpenmlperfPerformanceMetricPackageImpl
