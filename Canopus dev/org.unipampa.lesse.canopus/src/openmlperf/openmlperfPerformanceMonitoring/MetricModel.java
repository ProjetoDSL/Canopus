/**
 */
package openmlperf.openmlperfPerformanceMonitoring;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Counter;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Criteria;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk_IO_Counter;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Memory;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.MemoryCounter;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Metric;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Threshold;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Transaction;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.TransactionCounter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getName <em>Name</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getMemory <em>Memory</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getDisk <em>Disk</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getAssociationcountercriteriathreshold <em>Associationcountercriteriathreshold</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getDiskCounter <em>Disk Counter</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getTransactionCounter <em>Transaction Counter</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getMemoryCounter <em>Memory Counter</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getCounter <em>Counter</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#getMetricModel()
 * @model
 * @generated
 */
public interface MetricModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#getMetricModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' containment reference.
	 * @see #setMemory(Memory)
	 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#getMetricModel_Memory()
	 * @model containment="true"
	 * @generated
	 */
	Memory getMemory();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getMemory <em>Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' containment reference.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(Memory value);

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' containment reference.
	 * @see #setTransaction(Transaction)
	 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#getMetricModel_Transaction()
	 * @model containment="true"
	 * @generated
	 */
	Transaction getTransaction();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getTransaction <em>Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' containment reference.
	 * @see #getTransaction()
	 * @generated
	 */
	void setTransaction(Transaction value);

	/**
	 * Returns the value of the '<em><b>Disk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk</em>' containment reference.
	 * @see #setDisk(Disk)
	 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#getMetricModel_Disk()
	 * @model containment="true"
	 * @generated
	 */
	Disk getDisk();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceMonitoring.MetricModel#getDisk <em>Disk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk</em>' containment reference.
	 * @see #getDisk()
	 * @generated
	 */
	void setDisk(Disk value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Criteria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#getMetricModel_Criteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<Criteria> getCriteria();

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Threshold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#getMetricModel_Threshold()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threshold> getThreshold();

	/**
	 * Returns the value of the '<em><b>Associationcountercriteriathreshold</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associationcountercriteriathreshold</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#getMetricModel_Associationcountercriteriathreshold()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssociationCounterCriteriaThreshold> getAssociationcountercriteriathreshold();

	/**
	 * Returns the value of the '<em><b>Disk Counter</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk_IO_Counter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk Counter</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#getMetricModel_DiskCounter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Disk_IO_Counter> getDiskCounter();

	/**
	 * Returns the value of the '<em><b>Transaction Counter</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.TransactionCounter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Counter</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#getMetricModel_TransactionCounter()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransactionCounter> getTransactionCounter();

	/**
	 * Returns the value of the '<em><b>Memory Counter</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.MemoryCounter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Counter</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#getMetricModel_MemoryCounter()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemoryCounter> getMemoryCounter();

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Counter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#getMetricModel_Counter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Counter> getCounter();

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage#getMetricModel_Metric()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metric> getMetric();

} // MetricModel
