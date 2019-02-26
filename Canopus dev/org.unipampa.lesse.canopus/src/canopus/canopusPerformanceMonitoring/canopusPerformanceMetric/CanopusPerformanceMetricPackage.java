/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricFactory
 * @model kind="package"
 * @generated
 */
public interface CanopusPerformanceMetricPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "canopusPerformanceMetric";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unipampa.lesse.org/canopusPerformanceMetric";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "canopusPerformanceMetric";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanopusPerformanceMetricPackage eINSTANCE = canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl.init();

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MetricImpl
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = 0;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MemoryImpl
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Memory Counter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MEMORY_COUNTER = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.DiskImpl <em>Disk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.DiskImpl
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getDisk()
	 * @generated
	 */
	int DISK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Disk io counter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__DISK_IO_COUNTER = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.AssociationCounterCriteriaThresholdImpl <em>Association Counter Criteria Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.AssociationCounterCriteriaThresholdImpl
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getAssociationCounterCriteriaThreshold()
	 * @generated
	 */
	int ASSOCIATION_COUNTER_CRITERIA_THRESHOLD = 2;

	/**
	 * The feature id for the '<em><b>Association Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__ASSOCIATION_CRITERIA = 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__THRESHOLD = 1;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__CRITERIA = 2;

	/**
	 * The number of structural features of the '<em>Association Counter Criteria Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COUNTER_CRITERIA_THRESHOLD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Association Counter Criteria Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COUNTER_CRITERIA_THRESHOLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CounterImpl
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getCounter()
	 * @generated
	 */
	int COUNTER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Associationcountercriteriathreshold</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__ASSOCIATIONCOUNTERCRITERIATHRESHOLD = 1;

	/**
	 * The number of structural features of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.Disk_IO_CounterImpl <em>Disk IO Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.Disk_IO_CounterImpl
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getDisk_IO_Counter()
	 * @generated
	 */
	int DISK_IO_COUNTER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_IO_COUNTER__NAME = COUNTER__NAME;

	/**
	 * The feature id for the '<em><b>Associationcountercriteriathreshold</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_IO_COUNTER__ASSOCIATIONCOUNTERCRITERIATHRESHOLD = COUNTER__ASSOCIATIONCOUNTERCRITERIATHRESHOLD;

	/**
	 * The feature id for the '<em><b>Counter Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_IO_COUNTER__COUNTER_DISK = COUNTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disk IO Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_IO_COUNTER_FEATURE_COUNT = COUNTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disk IO Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_IO_COUNTER_OPERATION_COUNT = COUNTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CriteriaImpl <em>Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CriteriaImpl
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getCriteria()
	 * @generated
	 */
	int CRITERIA = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.ThresholdImpl <em>Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.ThresholdImpl
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getThreshold()
	 * @generated
	 */
	int THRESHOLD = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MemoryCounterImpl <em>Memory Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MemoryCounterImpl
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getMemoryCounter()
	 * @generated
	 */
	int MEMORY_COUNTER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_COUNTER__NAME = COUNTER__NAME;

	/**
	 * The feature id for the '<em><b>Associationcountercriteriathreshold</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_COUNTER__ASSOCIATIONCOUNTERCRITERIATHRESHOLD = COUNTER__ASSOCIATIONCOUNTERCRITERIATHRESHOLD;

	/**
	 * The feature id for the '<em><b>Counter Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_COUNTER__COUNTER_MEMORY = COUNTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_COUNTER_FEATURE_COUNT = COUNTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Memory Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_COUNTER_OPERATION_COUNT = COUNTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.TransactionImpl
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Transaction Counter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TRANSACTION_COUNTER = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.TransactionCounterImpl <em>Transaction Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.TransactionCounterImpl
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getTransactionCounter()
	 * @generated
	 */
	int TRANSACTION_COUNTER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COUNTER__NAME = COUNTER__NAME;

	/**
	 * The feature id for the '<em><b>Associationcountercriteriathreshold</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COUNTER__ASSOCIATIONCOUNTERCRITERIATHRESHOLD = COUNTER__ASSOCIATIONCOUNTERCRITERIATHRESHOLD;

	/**
	 * The feature id for the '<em><b>Counter Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COUNTER__COUNTER_TRANSACTION = COUNTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transaction Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COUNTER_FEATURE_COUNT = COUNTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transaction Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COUNTER_OPERATION_COUNT = COUNTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA <em>ASSOCIATION CRITERIA</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getASSOCIATION_CRITERIA()
	 * @generated
	 */
	int ASSOCIATION_CRITERIA = 11;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK <em>COUNTER DISK</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getCOUNTER_DISK()
	 * @generated
	 */
	int COUNTER_DISK = 12;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY <em>COUNTER MEMORY</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getCOUNTER_MEMORY()
	 * @generated
	 */
	int COUNTER_MEMORY = 13;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION <em>COUNTER TRANSACTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getCOUNTER_TRANSACTION()
	 * @generated
	 */
	int COUNTER_TRANSACTION = 14;


	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Memory#getMemoryCounter <em>Memory Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Memory Counter</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Memory#getMemoryCounter()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_MemoryCounter();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disk</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk
	 * @generated
	 */
	EClass getDisk();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk#getDisk_io_counter <em>Disk io counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disk io counter</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk#getDisk_io_counter()
	 * @see #getDisk()
	 * @generated
	 */
	EReference getDisk_Disk_io_counter();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold <em>Association Counter Criteria Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Counter Criteria Threshold</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold
	 * @generated
	 */
	EClass getAssociationCounterCriteriaThreshold();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold#getAssociationCriteria <em>Association Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Criteria</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold#getAssociationCriteria()
	 * @see #getAssociationCounterCriteriaThreshold()
	 * @generated
	 */
	EAttribute getAssociationCounterCriteriaThreshold_AssociationCriteria();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Threshold</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold#getThreshold()
	 * @see #getAssociationCounterCriteriaThreshold()
	 * @generated
	 */
	EReference getAssociationCounterCriteriaThreshold_Threshold();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Criteria</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold#getCriteria()
	 * @see #getAssociationCounterCriteriaThreshold()
	 * @generated
	 */
	EReference getAssociationCounterCriteriaThreshold_Criteria();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Counter
	 * @generated
	 */
	EClass getCounter();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Counter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Counter#getName()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_Name();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Counter#getAssociationcountercriteriathreshold <em>Associationcountercriteriathreshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associationcountercriteriathreshold</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Counter#getAssociationcountercriteriathreshold()
	 * @see #getCounter()
	 * @generated
	 */
	EReference getCounter_Associationcountercriteriathreshold();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk_IO_Counter <em>Disk IO Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disk IO Counter</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk_IO_Counter
	 * @generated
	 */
	EClass getDisk_IO_Counter();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk_IO_Counter#getCounterDisk <em>Counter Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Disk</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk_IO_Counter#getCounterDisk()
	 * @see #getDisk_IO_Counter()
	 * @generated
	 */
	EAttribute getDisk_IO_Counter_CounterDisk();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Criteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criteria</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Criteria
	 * @generated
	 */
	EClass getCriteria();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Criteria#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Criteria#getValue()
	 * @see #getCriteria()
	 * @generated
	 */
	EAttribute getCriteria_Value();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Threshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threshold</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Threshold
	 * @generated
	 */
	EClass getThreshold();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Threshold#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Threshold#getValue()
	 * @see #getThreshold()
	 * @generated
	 */
	EAttribute getThreshold_Value();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter <em>Memory Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Counter</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter
	 * @generated
	 */
	EClass getMemoryCounter();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter#getCounterMemory <em>Counter Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Memory</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter#getCounterMemory()
	 * @see #getMemoryCounter()
	 * @generated
	 */
	EAttribute getMemoryCounter_CounterMemory();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Transaction#getTransactionCounter <em>Transaction Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transaction Counter</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Transaction#getTransactionCounter()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_TransactionCounter();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter <em>Transaction Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Counter</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter
	 * @generated
	 */
	EClass getTransactionCounter();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter#getCounterTransaction <em>Counter Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Transaction</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter#getCounterTransaction()
	 * @see #getTransactionCounter()
	 * @generated
	 */
	EAttribute getTransactionCounter_CounterTransaction();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for enum '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA <em>ASSOCIATION CRITERIA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ASSOCIATION CRITERIA</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA
	 * @generated
	 */
	EEnum getASSOCIATION_CRITERIA();

	/**
	 * Returns the meta object for enum '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK <em>COUNTER DISK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COUNTER DISK</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK
	 * @generated
	 */
	EEnum getCOUNTER_DISK();

	/**
	 * Returns the meta object for enum '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY <em>COUNTER MEMORY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COUNTER MEMORY</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY
	 * @generated
	 */
	EEnum getCOUNTER_MEMORY();

	/**
	 * Returns the meta object for enum '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION <em>COUNTER TRANSACTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COUNTER TRANSACTION</em>'.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION
	 * @generated
	 */
	EEnum getCOUNTER_TRANSACTION();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CanopusPerformanceMetricFactory getCanopusPerformanceMetricFactory();

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
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MemoryImpl
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '<em><b>Memory Counter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__MEMORY_COUNTER = eINSTANCE.getMemory_MemoryCounter();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.DiskImpl <em>Disk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.DiskImpl
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getDisk()
		 * @generated
		 */
		EClass DISK = eINSTANCE.getDisk();

		/**
		 * The meta object literal for the '<em><b>Disk io counter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISK__DISK_IO_COUNTER = eINSTANCE.getDisk_Disk_io_counter();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.AssociationCounterCriteriaThresholdImpl <em>Association Counter Criteria Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.AssociationCounterCriteriaThresholdImpl
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getAssociationCounterCriteriaThreshold()
		 * @generated
		 */
		EClass ASSOCIATION_COUNTER_CRITERIA_THRESHOLD = eINSTANCE.getAssociationCounterCriteriaThreshold();

		/**
		 * The meta object literal for the '<em><b>Association Criteria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__ASSOCIATION_CRITERIA = eINSTANCE.getAssociationCounterCriteriaThreshold_AssociationCriteria();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__THRESHOLD = eINSTANCE.getAssociationCounterCriteriaThreshold_Threshold();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__CRITERIA = eINSTANCE.getAssociationCounterCriteriaThreshold_Criteria();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CounterImpl <em>Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CounterImpl
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getCounter()
		 * @generated
		 */
		EClass COUNTER = eINSTANCE.getCounter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__NAME = eINSTANCE.getCounter_Name();

		/**
		 * The meta object literal for the '<em><b>Associationcountercriteriathreshold</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTER__ASSOCIATIONCOUNTERCRITERIATHRESHOLD = eINSTANCE.getCounter_Associationcountercriteriathreshold();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.Disk_IO_CounterImpl <em>Disk IO Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.Disk_IO_CounterImpl
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getDisk_IO_Counter()
		 * @generated
		 */
		EClass DISK_IO_COUNTER = eINSTANCE.getDisk_IO_Counter();

		/**
		 * The meta object literal for the '<em><b>Counter Disk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK_IO_COUNTER__COUNTER_DISK = eINSTANCE.getDisk_IO_Counter_CounterDisk();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CriteriaImpl <em>Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CriteriaImpl
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getCriteria()
		 * @generated
		 */
		EClass CRITERIA = eINSTANCE.getCriteria();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIA__VALUE = eINSTANCE.getCriteria_Value();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.ThresholdImpl <em>Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.ThresholdImpl
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getThreshold()
		 * @generated
		 */
		EClass THRESHOLD = eINSTANCE.getThreshold();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD__VALUE = eINSTANCE.getThreshold_Value();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MemoryCounterImpl <em>Memory Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MemoryCounterImpl
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getMemoryCounter()
		 * @generated
		 */
		EClass MEMORY_COUNTER = eINSTANCE.getMemoryCounter();

		/**
		 * The meta object literal for the '<em><b>Counter Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_COUNTER__COUNTER_MEMORY = eINSTANCE.getMemoryCounter_CounterMemory();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.TransactionImpl
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Transaction Counter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__TRANSACTION_COUNTER = eINSTANCE.getTransaction_TransactionCounter();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.TransactionCounterImpl <em>Transaction Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.TransactionCounterImpl
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getTransactionCounter()
		 * @generated
		 */
		EClass TRANSACTION_COUNTER = eINSTANCE.getTransactionCounter();

		/**
		 * The meta object literal for the '<em><b>Counter Transaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_COUNTER__COUNTER_TRANSACTION = eINSTANCE.getTransactionCounter_CounterTransaction();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.MetricImpl
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NAME = eINSTANCE.getMetric_Name();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA <em>ASSOCIATION CRITERIA</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getASSOCIATION_CRITERIA()
		 * @generated
		 */
		EEnum ASSOCIATION_CRITERIA = eINSTANCE.getASSOCIATION_CRITERIA();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK <em>COUNTER DISK</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_DISK
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getCOUNTER_DISK()
		 * @generated
		 */
		EEnum COUNTER_DISK = eINSTANCE.getCOUNTER_DISK();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY <em>COUNTER MEMORY</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_MEMORY
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getCOUNTER_MEMORY()
		 * @generated
		 */
		EEnum COUNTER_MEMORY = eINSTANCE.getCOUNTER_MEMORY();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION <em>COUNTER TRANSACTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.COUNTER_TRANSACTION
		 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl#getCOUNTER_TRANSACTION()
		 * @generated
		 */
		EEnum COUNTER_TRANSACTION = eINSTANCE.getCOUNTER_TRANSACTION();

	}

} //CanopusPerformanceMetricPackage
