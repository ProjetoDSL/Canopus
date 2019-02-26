/**
 */
package canopus.canopusPerformanceMonitoring;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold;
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
 *   <li>{@link canopus.canopusPerformanceMonitoring.MetricModel#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.MetricModel#getMemory <em>Memory</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.MetricModel#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.MetricModel#getDisk <em>Disk</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.MetricModel#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.MetricModel#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.MetricModel#getAssociationcountercriteriathreshold <em>Associationcountercriteriathreshold</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.MetricModel#getDiskCounter <em>Disk Counter</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.MetricModel#getTransactionCounter <em>Transaction Counter</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.MetricModel#getMemoryCounter <em>Memory Counter</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.MetricModel#getCounter <em>Counter</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.MetricModel#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMetricModel()
 * @model
 * @generated
 */
public interface MetricModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMetricModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.MetricModel#getName <em>Name</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Memory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' containment reference.
	 * @see #setMemory(Memory)
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMetricModel_Memory()
	 * @model containment="true"
	 * @generated
	 */
	Memory getMemory();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.MetricModel#getMemory <em>Memory</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' containment reference.
	 * @see #setTransaction(Transaction)
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMetricModel_Transaction()
	 * @model containment="true"
	 * @generated
	 */
	Transaction getTransaction();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.MetricModel#getTransaction <em>Transaction</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Disk</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk</em>' containment reference.
	 * @see #setDisk(Disk)
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMetricModel_Disk()
	 * @model containment="true"
	 * @generated
	 */
	Disk getDisk();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.MetricModel#getDisk <em>Disk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk</em>' containment reference.
	 * @see #getDisk()
	 * @generated
	 */
	void setDisk(Disk value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Criteria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMetricModel_Criteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<Criteria> getCriteria();

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Threshold}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' containment reference list.
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMetricModel_Threshold()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threshold> getThreshold();

	/**
	 * Returns the value of the '<em><b>Associationcountercriteriathreshold</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associationcountercriteriathreshold</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associationcountercriteriathreshold</em>' containment reference list.
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMetricModel_Associationcountercriteriathreshold()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssociationCounterCriteriaThreshold> getAssociationcountercriteriathreshold();

	/**
	 * Returns the value of the '<em><b>Disk Counter</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk_IO_Counter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk Counter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk Counter</em>' containment reference list.
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMetricModel_DiskCounter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Disk_IO_Counter> getDiskCounter();

	/**
	 * Returns the value of the '<em><b>Transaction Counter</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Counter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Counter</em>' containment reference list.
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMetricModel_TransactionCounter()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransactionCounter> getTransactionCounter();

	/**
	 * Returns the value of the '<em><b>Memory Counter</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Counter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Counter</em>' containment reference list.
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMetricModel_MemoryCounter()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemoryCounter> getMemoryCounter();

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Counter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' containment reference list.
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMetricModel_Counter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Counter> getCounter();

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Metric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' containment reference list.
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMetricModel_Metric()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metric> getMetric();

} // MetricModel
