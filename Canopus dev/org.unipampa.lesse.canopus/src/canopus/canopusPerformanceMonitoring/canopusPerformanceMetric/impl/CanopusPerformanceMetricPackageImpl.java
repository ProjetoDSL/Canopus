/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl;

import canopus.CanopusPackage;

import canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricFactory;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Counter;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Criteria;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk_IO_Counter;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Memory;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Metric;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Threshold;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Transaction;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter;

import canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl;

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
public class CanopusPerformanceMetricPackageImpl extends EPackageImpl implements CanopusPerformanceMetricPackage {
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
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CanopusPerformanceMetricPackageImpl() {
		super(eNS_URI, CanopusPerformanceMetricFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CanopusPerformanceMetricPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CanopusPerformanceMetricPackage init() {
		if (isInited) return (CanopusPerformanceMetricPackage)EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceMetricPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCanopusPerformanceMetricPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CanopusPerformanceMetricPackageImpl theCanopusPerformanceMetricPackage = registeredCanopusPerformanceMetricPackage instanceof CanopusPerformanceMetricPackageImpl ? (CanopusPerformanceMetricPackageImpl)registeredCanopusPerformanceMetricPackage : new CanopusPerformanceMetricPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPackage.eNS_URI);
		CanopusPackageImpl theCanopusPackage = (CanopusPackageImpl)(registeredPackage instanceof CanopusPackageImpl ? registeredPackage : CanopusPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceMonitoringPackage.eNS_URI);
		CanopusPerformanceMonitoringPackageImpl theCanopusPerformanceMonitoringPackage = (CanopusPerformanceMonitoringPackageImpl)(registeredPackage instanceof CanopusPerformanceMonitoringPackageImpl ? registeredPackage : CanopusPerformanceMonitoringPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceScenarioPackage.eNS_URI);
		CanopusPerformanceScenarioPackageImpl theCanopusPerformanceScenarioPackage = (CanopusPerformanceScenarioPackageImpl)(registeredPackage instanceof CanopusPerformanceScenarioPackageImpl ? registeredPackage : CanopusPerformanceScenarioPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceWorkloadPackage.eNS_URI);
		CanopusPerformanceWorkloadPackageImpl theCanopusPerformanceWorkloadPackage = (CanopusPerformanceWorkloadPackageImpl)(registeredPackage instanceof CanopusPerformanceWorkloadPackageImpl ? registeredPackage : CanopusPerformanceWorkloadPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceScriptingPackage.eNS_URI);
		CanopusPerformanceScriptingPackageImpl theCanopusPerformanceScriptingPackage = (CanopusPerformanceScriptingPackageImpl)(registeredPackage instanceof CanopusPerformanceScriptingPackageImpl ? registeredPackage : CanopusPerformanceScriptingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceExternalFilePackage.eNS_URI);
		CanopusPerformanceExternalFilePackageImpl theCanopusPerformanceExternalFilePackage = (CanopusPerformanceExternalFilePackageImpl)(registeredPackage instanceof CanopusPerformanceExternalFilePackageImpl ? registeredPackage : CanopusPerformanceExternalFilePackage.eINSTANCE);

		// Create package meta-data objects
		theCanopusPerformanceMetricPackage.createPackageContents();
		theCanopusPackage.createPackageContents();
		theCanopusPerformanceMonitoringPackage.createPackageContents();
		theCanopusPerformanceScenarioPackage.createPackageContents();
		theCanopusPerformanceWorkloadPackage.createPackageContents();
		theCanopusPerformanceScriptingPackage.createPackageContents();
		theCanopusPerformanceExternalFilePackage.createPackageContents();

		// Initialize created meta-data
		theCanopusPerformanceMetricPackage.initializePackageContents();
		theCanopusPackage.initializePackageContents();
		theCanopusPerformanceMonitoringPackage.initializePackageContents();
		theCanopusPerformanceScenarioPackage.initializePackageContents();
		theCanopusPerformanceWorkloadPackage.initializePackageContents();
		theCanopusPerformanceScriptingPackage.initializePackageContents();
		theCanopusPerformanceExternalFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCanopusPerformanceMetricPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CanopusPerformanceMetricPackage.eNS_URI, theCanopusPerformanceMetricPackage);
		return theCanopusPerformanceMetricPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemory_MemoryCounter() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisk() {
		return diskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisk_Disk_io_counter() {
		return (EReference)diskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociationCounterCriteriaThreshold() {
		return associationCounterCriteriaThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociationCounterCriteriaThreshold_AssociationCriteria() {
		return (EAttribute)associationCounterCriteriaThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationCounterCriteriaThreshold_Threshold() {
		return (EReference)associationCounterCriteriaThresholdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationCounterCriteriaThreshold_Criteria() {
		return (EReference)associationCounterCriteriaThresholdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCounter() {
		return counterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCounter_Name() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCounter_Associationcountercriteriathreshold() {
		return (EReference)counterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisk_IO_Counter() {
		return disk_IO_CounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisk_IO_Counter_CounterDisk() {
		return (EAttribute)disk_IO_CounterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCriteria() {
		return criteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriteria_Value() {
		return (EAttribute)criteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreshold() {
		return thresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreshold_Value() {
		return (EAttribute)thresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemoryCounter() {
		return memoryCounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemoryCounter_CounterMemory() {
		return (EAttribute)memoryCounterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransaction_TransactionCounter() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransactionCounter() {
		return transactionCounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionCounter_CounterTransaction() {
		return (EAttribute)transactionCounterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetric_Name() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getASSOCIATION_CRITERIA() {
		return associatioN_CRITERIAEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCOUNTER_DISK() {
		return counteR_DISKEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCOUNTER_MEMORY() {
		return counteR_MEMORYEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCOUNTER_TRANSACTION() {
		return counteR_TRANSACTIONEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CanopusPerformanceMetricFactory getCanopusPerformanceMetricFactory() {
		return (CanopusPerformanceMetricFactory)getEFactoryInstance();
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
		initEReference(getAssociationCounterCriteriaThreshold_Threshold(), this.getThreshold(), null, "threshold", null, 0, 1, AssociationCounterCriteriaThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEEnum(associatioN_CRITERIAEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA.class, "ASSOCIATION_CRITERIA");
		addEEnumLiteral(associatioN_CRITERIAEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA.BETWEEN);
		addEEnumLiteral(associatioN_CRITERIAEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA.GREATER_THAN_OR_EQUAL_TO);
		addEEnumLiteral(associatioN_CRITERIAEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA.LESS_THAN);

		initEEnum(counteR_DISKEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK.class, "COUNTER_DISK");
		addEEnumLiteral(counteR_DISKEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK.AVG_DISK_SECS_TRANSFER_COUNTER);
		addEEnumLiteral(counteR_DISKEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK.PERCENTAGE_IDLE_TIME_COUNTER);
		addEEnumLiteral(counteR_DISKEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK.DISK_TRANSFERS_SEC_COUNTER);
		addEEnumLiteral(counteR_DISKEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK.AVG_DISK_QUEUE_LENGTH_COUNTER);
		addEEnumLiteral(counteR_DISKEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK.SPLIT_IO_SEC_COUNTER);
		addEEnumLiteral(counteR_DISKEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK.FREE_MEGABYTES_COUNTER);

		initEEnum(counteR_MEMORYEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY.class, "COUNTER_MEMORY");
		addEEnumLiteral(counteR_MEMORYEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY.AVALIABLE_MBYTES_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY.PAGES_SEC_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY.PAGE_READS_SEC_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY.WORKING_SET_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY.POOL_NONPAGE_BYTES_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY.PAGED_POOL_BYTES_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY.PAGED_POOL_FAILURES_COUNTER);
		addEEnumLiteral(counteR_MEMORYEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY.CACHE_BYTES_COUNTER);

		initEEnum(counteR_TRANSACTIONEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION.class, "COUNTER_TRANSACTION");
		addEEnumLiteral(counteR_TRANSACTIONEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION.TRANSACTION_RESPONSE_TIME);
		addEEnumLiteral(counteR_TRANSACTIONEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION.TRANSACTION_PER_SECOND_TPS);
		addEEnumLiteral(counteR_TRANSACTIONEEnum, canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION.TRANSACTION_SUCCESS_RATE);
	}

} //CanopusPerformanceMetricPackageImpl
