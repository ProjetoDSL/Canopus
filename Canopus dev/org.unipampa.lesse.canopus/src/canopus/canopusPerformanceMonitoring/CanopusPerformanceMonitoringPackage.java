/**
 */
package canopus.canopusPerformanceMonitoring;

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
 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringFactory
 * @model kind="package"
 * @generated
 */
public interface CanopusPerformanceMonitoringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "canopusPerformanceMonitoring";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unipampa.lesse.org/canopusPerformanceMonitoring";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "canopusPerformanceMonitoring";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanopusPerformanceMonitoringPackage eINSTANCE = canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl.init();

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.impl.SUTImpl <em>SUT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.impl.SUTImpl
	 * @see canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl#getSUT()
	 * @generated
	 */
	int SUT = 0;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUT__HOSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUT__IP = 1;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUT__HARDWARE = 2;

	/**
	 * The feature id for the '<em><b>Sut</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUT__SUT = 3;

	/**
	 * The feature id for the '<em><b>Metricmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUT__METRICMODEL = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUT__TYPE = 5;

	/**
	 * The number of structural features of the '<em>SUT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>SUT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.impl.LoadGeneratorImpl <em>Load Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.impl.LoadGeneratorImpl
	 * @see canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl#getLoadGenerator()
	 * @generated
	 */
	int LOAD_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GENERATOR__HOSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GENERATOR__IP = 1;

	/**
	 * The feature id for the '<em><b>Is Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GENERATOR__IS_MONITOR = 2;

	/**
	 * The feature id for the '<em><b>Sut</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GENERATOR__SUT = 3;

	/**
	 * The feature id for the '<em><b>Metricmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GENERATOR__METRICMODEL = 4;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GENERATOR__HARDWARE = 5;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GENERATOR__MONITOR = 6;

	/**
	 * The number of structural features of the '<em>Load Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GENERATOR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Load Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GENERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.impl.MonitorImpl <em>Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.impl.MonitorImpl
	 * @see canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl#getMonitor()
	 * @generated
	 */
	int MONITOR = 2;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__HOSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__IP = 1;

	/**
	 * The feature id for the '<em><b>Sut</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__SUT = 2;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__HARDWARE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.impl.MetricModelImpl <em>Metric Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.impl.MetricModelImpl
	 * @see canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl#getMetricModel()
	 * @generated
	 */
	int METRIC_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__MEMORY = 1;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__TRANSACTION = 2;

	/**
	 * The feature id for the '<em><b>Disk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__DISK = 3;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__CRITERIA = 4;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__THRESHOLD = 5;

	/**
	 * The feature id for the '<em><b>Associationcountercriteriathreshold</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD = 6;

	/**
	 * The feature id for the '<em><b>Disk Counter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__DISK_COUNTER = 7;

	/**
	 * The feature id for the '<em><b>Transaction Counter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__TRANSACTION_COUNTER = 8;

	/**
	 * The feature id for the '<em><b>Memory Counter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__MEMORY_COUNTER = 9;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__COUNTER = 10;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__METRIC = 11;

	/**
	 * The number of structural features of the '<em>Metric Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Metric Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.SUT_TYPE <em>SUT TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.SUT_TYPE
	 * @see canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl#getSUT_TYPE()
	 * @generated
	 */
	int SUT_TYPE = 4;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceMonitoring.HARDWARE <em>HARDWARE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceMonitoring.HARDWARE
	 * @see canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl#getHARDWARE()
	 * @generated
	 */
	int HARDWARE = 5;


	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.SUT <em>SUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SUT</em>'.
	 * @see canopus.canopusPerformanceMonitoring.SUT
	 * @generated
	 */
	EClass getSUT();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.SUT#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see canopus.canopusPerformanceMonitoring.SUT#getHostname()
	 * @see #getSUT()
	 * @generated
	 */
	EAttribute getSUT_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.SUT#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see canopus.canopusPerformanceMonitoring.SUT#getIp()
	 * @see #getSUT()
	 * @generated
	 */
	EAttribute getSUT_Ip();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.SUT#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware</em>'.
	 * @see canopus.canopusPerformanceMonitoring.SUT#getHardware()
	 * @see #getSUT()
	 * @generated
	 */
	EAttribute getSUT_Hardware();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceMonitoring.SUT#getSut <em>Sut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sut</em>'.
	 * @see canopus.canopusPerformanceMonitoring.SUT#getSut()
	 * @see #getSUT()
	 * @generated
	 */
	EReference getSUT_Sut();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceMonitoring.SUT#getMetricmodel <em>Metricmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metricmodel</em>'.
	 * @see canopus.canopusPerformanceMonitoring.SUT#getMetricmodel()
	 * @see #getSUT()
	 * @generated
	 */
	EReference getSUT_Metricmodel();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.SUT#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see canopus.canopusPerformanceMonitoring.SUT#getType()
	 * @see #getSUT()
	 * @generated
	 */
	EAttribute getSUT_Type();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.LoadGenerator <em>Load Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Generator</em>'.
	 * @see canopus.canopusPerformanceMonitoring.LoadGenerator
	 * @generated
	 */
	EClass getLoadGenerator();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see canopus.canopusPerformanceMonitoring.LoadGenerator#getHostname()
	 * @see #getLoadGenerator()
	 * @generated
	 */
	EAttribute getLoadGenerator_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see canopus.canopusPerformanceMonitoring.LoadGenerator#getIp()
	 * @see #getLoadGenerator()
	 * @generated
	 */
	EAttribute getLoadGenerator_Ip();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.LoadGenerator#isIsMonitor <em>Is Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Monitor</em>'.
	 * @see canopus.canopusPerformanceMonitoring.LoadGenerator#isIsMonitor()
	 * @see #getLoadGenerator()
	 * @generated
	 */
	EAttribute getLoadGenerator_IsMonitor();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getSut <em>Sut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sut</em>'.
	 * @see canopus.canopusPerformanceMonitoring.LoadGenerator#getSut()
	 * @see #getLoadGenerator()
	 * @generated
	 */
	EReference getLoadGenerator_Sut();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getMetricmodel <em>Metricmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metricmodel</em>'.
	 * @see canopus.canopusPerformanceMonitoring.LoadGenerator#getMetricmodel()
	 * @see #getLoadGenerator()
	 * @generated
	 */
	EReference getLoadGenerator_Metricmodel();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware</em>'.
	 * @see canopus.canopusPerformanceMonitoring.LoadGenerator#getHardware()
	 * @see #getLoadGenerator()
	 * @generated
	 */
	EAttribute getLoadGenerator_Hardware();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getMonitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Monitor</em>'.
	 * @see canopus.canopusPerformanceMonitoring.LoadGenerator#getMonitor()
	 * @see #getLoadGenerator()
	 * @generated
	 */
	EReference getLoadGenerator_Monitor();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.Monitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor</em>'.
	 * @see canopus.canopusPerformanceMonitoring.Monitor
	 * @generated
	 */
	EClass getMonitor();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.Monitor#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see canopus.canopusPerformanceMonitoring.Monitor#getHostname()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.Monitor#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see canopus.canopusPerformanceMonitoring.Monitor#getIp()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_Ip();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceMonitoring.Monitor#getSut <em>Sut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sut</em>'.
	 * @see canopus.canopusPerformanceMonitoring.Monitor#getSut()
	 * @see #getMonitor()
	 * @generated
	 */
	EReference getMonitor_Sut();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.Monitor#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware</em>'.
	 * @see canopus.canopusPerformanceMonitoring.Monitor#getHardware()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_Hardware();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.Monitor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see canopus.canopusPerformanceMonitoring.Monitor#getDescription()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_Description();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceMonitoring.MetricModel <em>Metric Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Model</em>'.
	 * @see canopus.canopusPerformanceMonitoring.MetricModel
	 * @generated
	 */
	EClass getMetricModel();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceMonitoring.MetricModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceMonitoring.MetricModel#getName()
	 * @see #getMetricModel()
	 * @generated
	 */
	EAttribute getMetricModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceMonitoring.MetricModel#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory</em>'.
	 * @see canopus.canopusPerformanceMonitoring.MetricModel#getMemory()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Memory();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceMonitoring.MetricModel#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction</em>'.
	 * @see canopus.canopusPerformanceMonitoring.MetricModel#getTransaction()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Transaction();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceMonitoring.MetricModel#getDisk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disk</em>'.
	 * @see canopus.canopusPerformanceMonitoring.MetricModel#getDisk()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Disk();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceMonitoring.MetricModel#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see canopus.canopusPerformanceMonitoring.MetricModel#getCriteria()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Criteria();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceMonitoring.MetricModel#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threshold</em>'.
	 * @see canopus.canopusPerformanceMonitoring.MetricModel#getThreshold()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Threshold();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceMonitoring.MetricModel#getAssociationcountercriteriathreshold <em>Associationcountercriteriathreshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associationcountercriteriathreshold</em>'.
	 * @see canopus.canopusPerformanceMonitoring.MetricModel#getAssociationcountercriteriathreshold()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Associationcountercriteriathreshold();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceMonitoring.MetricModel#getDiskCounter <em>Disk Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disk Counter</em>'.
	 * @see canopus.canopusPerformanceMonitoring.MetricModel#getDiskCounter()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_DiskCounter();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceMonitoring.MetricModel#getTransactionCounter <em>Transaction Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transaction Counter</em>'.
	 * @see canopus.canopusPerformanceMonitoring.MetricModel#getTransactionCounter()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_TransactionCounter();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceMonitoring.MetricModel#getMemoryCounter <em>Memory Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Counter</em>'.
	 * @see canopus.canopusPerformanceMonitoring.MetricModel#getMemoryCounter()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_MemoryCounter();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceMonitoring.MetricModel#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Counter</em>'.
	 * @see canopus.canopusPerformanceMonitoring.MetricModel#getCounter()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Counter();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceMonitoring.MetricModel#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric</em>'.
	 * @see canopus.canopusPerformanceMonitoring.MetricModel#getMetric()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Metric();

	/**
	 * Returns the meta object for enum '{@link canopus.canopusPerformanceMonitoring.SUT_TYPE <em>SUT TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SUT TYPE</em>'.
	 * @see canopus.canopusPerformanceMonitoring.SUT_TYPE
	 * @generated
	 */
	EEnum getSUT_TYPE();

	/**
	 * Returns the meta object for enum '{@link canopus.canopusPerformanceMonitoring.HARDWARE <em>HARDWARE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HARDWARE</em>'.
	 * @see canopus.canopusPerformanceMonitoring.HARDWARE
	 * @generated
	 */
	EEnum getHARDWARE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CanopusPerformanceMonitoringFactory getCanopusPerformanceMonitoringFactory();

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
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.impl.SUTImpl <em>SUT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.impl.SUTImpl
		 * @see canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl#getSUT()
		 * @generated
		 */
		EClass SUT = eINSTANCE.getSUT();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUT__HOSTNAME = eINSTANCE.getSUT_Hostname();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUT__IP = eINSTANCE.getSUT_Ip();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUT__HARDWARE = eINSTANCE.getSUT_Hardware();

		/**
		 * The meta object literal for the '<em><b>Sut</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUT__SUT = eINSTANCE.getSUT_Sut();

		/**
		 * The meta object literal for the '<em><b>Metricmodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUT__METRICMODEL = eINSTANCE.getSUT_Metricmodel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUT__TYPE = eINSTANCE.getSUT_Type();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.impl.LoadGeneratorImpl <em>Load Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.impl.LoadGeneratorImpl
		 * @see canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl#getLoadGenerator()
		 * @generated
		 */
		EClass LOAD_GENERATOR = eINSTANCE.getLoadGenerator();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_GENERATOR__HOSTNAME = eINSTANCE.getLoadGenerator_Hostname();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_GENERATOR__IP = eINSTANCE.getLoadGenerator_Ip();

		/**
		 * The meta object literal for the '<em><b>Is Monitor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_GENERATOR__IS_MONITOR = eINSTANCE.getLoadGenerator_IsMonitor();

		/**
		 * The meta object literal for the '<em><b>Sut</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_GENERATOR__SUT = eINSTANCE.getLoadGenerator_Sut();

		/**
		 * The meta object literal for the '<em><b>Metricmodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_GENERATOR__METRICMODEL = eINSTANCE.getLoadGenerator_Metricmodel();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_GENERATOR__HARDWARE = eINSTANCE.getLoadGenerator_Hardware();

		/**
		 * The meta object literal for the '<em><b>Monitor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_GENERATOR__MONITOR = eINSTANCE.getLoadGenerator_Monitor();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.impl.MonitorImpl <em>Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.impl.MonitorImpl
		 * @see canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl#getMonitor()
		 * @generated
		 */
		EClass MONITOR = eINSTANCE.getMonitor();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR__HOSTNAME = eINSTANCE.getMonitor_Hostname();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR__IP = eINSTANCE.getMonitor_Ip();

		/**
		 * The meta object literal for the '<em><b>Sut</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR__SUT = eINSTANCE.getMonitor_Sut();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR__HARDWARE = eINSTANCE.getMonitor_Hardware();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR__DESCRIPTION = eINSTANCE.getMonitor_Description();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.impl.MetricModelImpl <em>Metric Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.impl.MetricModelImpl
		 * @see canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl#getMetricModel()
		 * @generated
		 */
		EClass METRIC_MODEL = eINSTANCE.getMetricModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_MODEL__NAME = eINSTANCE.getMetricModel_Name();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__MEMORY = eINSTANCE.getMetricModel_Memory();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__TRANSACTION = eINSTANCE.getMetricModel_Transaction();

		/**
		 * The meta object literal for the '<em><b>Disk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__DISK = eINSTANCE.getMetricModel_Disk();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__CRITERIA = eINSTANCE.getMetricModel_Criteria();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__THRESHOLD = eINSTANCE.getMetricModel_Threshold();

		/**
		 * The meta object literal for the '<em><b>Associationcountercriteriathreshold</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD = eINSTANCE.getMetricModel_Associationcountercriteriathreshold();

		/**
		 * The meta object literal for the '<em><b>Disk Counter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__DISK_COUNTER = eINSTANCE.getMetricModel_DiskCounter();

		/**
		 * The meta object literal for the '<em><b>Transaction Counter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__TRANSACTION_COUNTER = eINSTANCE.getMetricModel_TransactionCounter();

		/**
		 * The meta object literal for the '<em><b>Memory Counter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__MEMORY_COUNTER = eINSTANCE.getMetricModel_MemoryCounter();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__COUNTER = eINSTANCE.getMetricModel_Counter();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__METRIC = eINSTANCE.getMetricModel_Metric();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.SUT_TYPE <em>SUT TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.SUT_TYPE
		 * @see canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl#getSUT_TYPE()
		 * @generated
		 */
		EEnum SUT_TYPE = eINSTANCE.getSUT_TYPE();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceMonitoring.HARDWARE <em>HARDWARE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceMonitoring.HARDWARE
		 * @see canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl#getHARDWARE()
		 * @generated
		 */
		EEnum HARDWARE = eINSTANCE.getHARDWARE();

	}

} //CanopusPerformanceMonitoringPackage
