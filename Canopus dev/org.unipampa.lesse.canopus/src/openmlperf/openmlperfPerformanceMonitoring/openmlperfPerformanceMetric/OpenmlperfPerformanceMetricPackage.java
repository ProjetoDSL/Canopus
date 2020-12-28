/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric;

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
 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricFactory
 * @model kind="package"
 * @generated
 */
public interface OpenmlperfPerformanceMetricPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openmlperfPerformanceMetric";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unipampa.lesse.org/openmlperfPerformanceMetric";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openmlperfPerformanceMetric";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenmlperfPerformanceMetricPackage eINSTANCE = openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl.init();

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MetricImpl
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getMetric()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MemoryImpl
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getMemory()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.DiskImpl <em>Disk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.DiskImpl
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getDisk()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.AssociationCounterCriteriaThresholdImpl <em>Association Counter Criteria Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.AssociationCounterCriteriaThresholdImpl
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getAssociationCounterCriteriaThreshold()
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
	 * The feature id for the '<em><b>Threshold</b></em>' reference list.
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.CounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.CounterImpl
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getCounter()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.Disk_IO_CounterImpl <em>Disk IO Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.Disk_IO_CounterImpl
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getDisk_IO_Counter()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.CriteriaImpl <em>Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.CriteriaImpl
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getCriteria()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.ThresholdImpl <em>Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.ThresholdImpl
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getThreshold()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MemoryCounterImpl <em>Memory Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MemoryCounterImpl
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getMemoryCounter()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.TransactionImpl
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getTransaction()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.TransactionCounterImpl <em>Transaction Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.TransactionCounterImpl
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getTransactionCounter()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.ASSOCIATION_CRITERIA <em>ASSOCIATION CRITERIA</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.ASSOCIATION_CRITERIA
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getASSOCIATION_CRITERIA()
	 * @generated
	 */
	int ASSOCIATION_CRITERIA = 11;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK <em>COUNTER DISK</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getCOUNTER_DISK()
	 * @generated
	 */
	int COUNTER_DISK = 12;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY <em>COUNTER MEMORY</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getCOUNTER_MEMORY()
	 * @generated
	 */
	int COUNTER_MEMORY = 13;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_TRANSACTION <em>COUNTER TRANSACTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_TRANSACTION
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getCOUNTER_TRANSACTION()
	 * @generated
	 */
	int COUNTER_TRANSACTION = 14;


	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the reference list '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Memory#getMemoryCounter <em>Memory Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Memory Counter</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Memory#getMemoryCounter()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_MemoryCounter();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disk</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk
	 * @generated
	 */
	EClass getDisk();

	/**
	 * Returns the meta object for the reference list '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk#getDisk_io_counter <em>Disk io counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disk io counter</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk#getDisk_io_counter()
	 * @see #getDisk()
	 * @generated
	 */
	EReference getDisk_Disk_io_counter();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold <em>Association Counter Criteria Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Counter Criteria Threshold</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold
	 * @generated
	 */
	EClass getAssociationCounterCriteriaThreshold();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold#getAssociationCriteria <em>Association Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Criteria</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold#getAssociationCriteria()
	 * @see #getAssociationCounterCriteriaThreshold()
	 * @generated
	 */
	EAttribute getAssociationCounterCriteriaThreshold_AssociationCriteria();

	/**
	 * Returns the meta object for the reference list '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Threshold</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold#getThreshold()
	 * @see #getAssociationCounterCriteriaThreshold()
	 * @generated
	 */
	EReference getAssociationCounterCriteriaThreshold_Threshold();

	/**
	 * Returns the meta object for the reference list '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Criteria</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold#getCriteria()
	 * @see #getAssociationCounterCriteriaThreshold()
	 * @generated
	 */
	EReference getAssociationCounterCriteriaThreshold_Criteria();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Counter
	 * @generated
	 */
	EClass getCounter();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Counter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Counter#getName()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_Name();

	/**
	 * Returns the meta object for the reference list '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Counter#getAssociationcountercriteriathreshold <em>Associationcountercriteriathreshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associationcountercriteriathreshold</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Counter#getAssociationcountercriteriathreshold()
	 * @see #getCounter()
	 * @generated
	 */
	EReference getCounter_Associationcountercriteriathreshold();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk_IO_Counter <em>Disk IO Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disk IO Counter</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk_IO_Counter
	 * @generated
	 */
	EClass getDisk_IO_Counter();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk_IO_Counter#getCounterDisk <em>Counter Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Disk</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk_IO_Counter#getCounterDisk()
	 * @see #getDisk_IO_Counter()
	 * @generated
	 */
	EAttribute getDisk_IO_Counter_CounterDisk();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Criteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criteria</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Criteria
	 * @generated
	 */
	EClass getCriteria();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Criteria#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Criteria#getValue()
	 * @see #getCriteria()
	 * @generated
	 */
	EAttribute getCriteria_Value();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Threshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threshold</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Threshold
	 * @generated
	 */
	EClass getThreshold();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Threshold#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Threshold#getValue()
	 * @see #getThreshold()
	 * @generated
	 */
	EAttribute getThreshold_Value();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.MemoryCounter <em>Memory Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Counter</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.MemoryCounter
	 * @generated
	 */
	EClass getMemoryCounter();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.MemoryCounter#getCounterMemory <em>Counter Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Memory</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.MemoryCounter#getCounterMemory()
	 * @see #getMemoryCounter()
	 * @generated
	 */
	EAttribute getMemoryCounter_CounterMemory();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the reference list '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Transaction#getTransactionCounter <em>Transaction Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transaction Counter</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Transaction#getTransactionCounter()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_TransactionCounter();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.TransactionCounter <em>Transaction Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Counter</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.TransactionCounter
	 * @generated
	 */
	EClass getTransactionCounter();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.TransactionCounter#getCounterTransaction <em>Counter Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Transaction</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.TransactionCounter#getCounterTransaction()
	 * @see #getTransactionCounter()
	 * @generated
	 */
	EAttribute getTransactionCounter_CounterTransaction();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for enum '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.ASSOCIATION_CRITERIA <em>ASSOCIATION CRITERIA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ASSOCIATION CRITERIA</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.ASSOCIATION_CRITERIA
	 * @generated
	 */
	EEnum getASSOCIATION_CRITERIA();

	/**
	 * Returns the meta object for enum '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK <em>COUNTER DISK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COUNTER DISK</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK
	 * @generated
	 */
	EEnum getCOUNTER_DISK();

	/**
	 * Returns the meta object for enum '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY <em>COUNTER MEMORY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COUNTER MEMORY</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY
	 * @generated
	 */
	EEnum getCOUNTER_MEMORY();

	/**
	 * Returns the meta object for enum '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_TRANSACTION <em>COUNTER TRANSACTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COUNTER TRANSACTION</em>'.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_TRANSACTION
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
	OpenmlperfPerformanceMetricFactory getOpenmlperfPerformanceMetricFactory();

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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MemoryImpl
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getMemory()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.DiskImpl <em>Disk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.DiskImpl
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getDisk()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.AssociationCounterCriteriaThresholdImpl <em>Association Counter Criteria Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.AssociationCounterCriteriaThresholdImpl
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getAssociationCounterCriteriaThreshold()
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
		 * The meta object literal for the '<em><b>Threshold</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.CounterImpl <em>Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.CounterImpl
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getCounter()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.Disk_IO_CounterImpl <em>Disk IO Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.Disk_IO_CounterImpl
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getDisk_IO_Counter()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.CriteriaImpl <em>Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.CriteriaImpl
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getCriteria()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.ThresholdImpl <em>Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.ThresholdImpl
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getThreshold()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MemoryCounterImpl <em>Memory Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MemoryCounterImpl
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getMemoryCounter()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.TransactionImpl
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getTransaction()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.TransactionCounterImpl <em>Transaction Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.TransactionCounterImpl
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getTransactionCounter()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.MetricImpl
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getMetric()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.ASSOCIATION_CRITERIA <em>ASSOCIATION CRITERIA</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.ASSOCIATION_CRITERIA
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getASSOCIATION_CRITERIA()
		 * @generated
		 */
		EEnum ASSOCIATION_CRITERIA = eINSTANCE.getASSOCIATION_CRITERIA();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK <em>COUNTER DISK</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_DISK
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getCOUNTER_DISK()
		 * @generated
		 */
		EEnum COUNTER_DISK = eINSTANCE.getCOUNTER_DISK();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY <em>COUNTER MEMORY</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_MEMORY
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getCOUNTER_MEMORY()
		 * @generated
		 */
		EEnum COUNTER_MEMORY = eINSTANCE.getCOUNTER_MEMORY();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_TRANSACTION <em>COUNTER TRANSACTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.COUNTER_TRANSACTION
		 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl#getCOUNTER_TRANSACTION()
		 * @generated
		 */
		EEnum COUNTER_TRANSACTION = eINSTANCE.getCOUNTER_TRANSACTION();

	}

} //OpenmlperfPerformanceMetricPackage
