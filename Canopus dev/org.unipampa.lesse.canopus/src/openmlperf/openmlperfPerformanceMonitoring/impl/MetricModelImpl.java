/**
 */
package openmlperf.openmlperfPerformanceMonitoring.impl;

import java.util.Collection;

import openmlperf.openmlperfPerformanceMonitoring.MetricModel;
import openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage;

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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MetricModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MetricModelImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MetricModelImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MetricModelImpl#getDisk <em>Disk</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MetricModelImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MetricModelImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MetricModelImpl#getAssociationcountercriteriathreshold <em>Associationcountercriteriathreshold</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MetricModelImpl#getDiskCounter <em>Disk Counter</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MetricModelImpl#getTransactionCounter <em>Transaction Counter</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MetricModelImpl#getMemoryCounter <em>Memory Counter</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MetricModelImpl#getCounter <em>Counter</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.impl.MetricModelImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricModelImpl extends MinimalEObjectImpl.Container implements MetricModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected Memory memory;

	/**
	 * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected Transaction transaction;

	/**
	 * The cached value of the '{@link #getDisk() <em>Disk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk()
	 * @generated
	 * @ordered
	 */
	protected Disk disk;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<Criteria> criteria;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected EList<Threshold> threshold;

	/**
	 * The cached value of the '{@link #getAssociationcountercriteriathreshold() <em>Associationcountercriteriathreshold</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationcountercriteriathreshold()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationCounterCriteriaThreshold> associationcountercriteriathreshold;

	/**
	 * The cached value of the '{@link #getDiskCounter() <em>Disk Counter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskCounter()
	 * @generated
	 * @ordered
	 */
	protected EList<Disk_IO_Counter> diskCounter;

	/**
	 * The cached value of the '{@link #getTransactionCounter() <em>Transaction Counter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionCounter()
	 * @generated
	 * @ordered
	 */
	protected EList<TransactionCounter> transactionCounter;

	/**
	 * The cached value of the '{@link #getMemoryCounter() <em>Memory Counter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryCounter()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryCounter> memoryCounter;

	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected EList<Counter> counter;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected EList<Metric> metric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemory(Memory newMemory, NotificationChain msgs) {
		Memory oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY, oldMemory, newMemory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(Memory newMemory) {
		if (newMemory != memory) {
			NotificationChain msgs = null;
			if (memory != null)
				msgs = ((InternalEObject)memory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY, null, msgs);
			if (newMemory != null)
				msgs = ((InternalEObject)newMemory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY, null, msgs);
			msgs = basicSetMemory(newMemory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY, newMemory, newMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction getTransaction() {
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransaction(Transaction newTransaction, NotificationChain msgs) {
		Transaction oldTransaction = transaction;
		transaction = newTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION, oldTransaction, newTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransaction(Transaction newTransaction) {
		if (newTransaction != transaction) {
			NotificationChain msgs = null;
			if (transaction != null)
				msgs = ((InternalEObject)transaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION, null, msgs);
			if (newTransaction != null)
				msgs = ((InternalEObject)newTransaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION, null, msgs);
			msgs = basicSetTransaction(newTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION, newTransaction, newTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disk getDisk() {
		return disk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisk(Disk newDisk, NotificationChain msgs) {
		Disk oldDisk = disk;
		disk = newDisk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK, oldDisk, newDisk);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk(Disk newDisk) {
		if (newDisk != disk) {
			NotificationChain msgs = null;
			if (disk != null)
				msgs = ((InternalEObject)disk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK, null, msgs);
			if (newDisk != null)
				msgs = ((InternalEObject)newDisk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK, null, msgs);
			msgs = basicSetDisk(newDisk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK, newDisk, newDisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Criteria> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectContainmentEList<Criteria>(Criteria.class, this, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__CRITERIA);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Threshold> getThreshold() {
		if (threshold == null) {
			threshold = new EObjectContainmentEList<Threshold>(Threshold.class, this, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__THRESHOLD);
		}
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationCounterCriteriaThreshold> getAssociationcountercriteriathreshold() {
		if (associationcountercriteriathreshold == null) {
			associationcountercriteriathreshold = new EObjectContainmentEList<AssociationCounterCriteriaThreshold>(AssociationCounterCriteriaThreshold.class, this, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD);
		}
		return associationcountercriteriathreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Disk_IO_Counter> getDiskCounter() {
		if (diskCounter == null) {
			diskCounter = new EObjectContainmentEList<Disk_IO_Counter>(Disk_IO_Counter.class, this, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK_COUNTER);
		}
		return diskCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransactionCounter> getTransactionCounter() {
		if (transactionCounter == null) {
			transactionCounter = new EObjectContainmentEList<TransactionCounter>(TransactionCounter.class, this, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION_COUNTER);
		}
		return transactionCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryCounter> getMemoryCounter() {
		if (memoryCounter == null) {
			memoryCounter = new EObjectContainmentEList<MemoryCounter>(MemoryCounter.class, this, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY_COUNTER);
		}
		return memoryCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Counter> getCounter() {
		if (counter == null) {
			counter = new EObjectContainmentEList<Counter>(Counter.class, this, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__COUNTER);
		}
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metric> getMetric() {
		if (metric == null) {
			metric = new EObjectContainmentEList<Metric>(Metric.class, this, OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__METRIC);
		}
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY:
				return basicSetMemory(null, msgs);
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION:
				return basicSetTransaction(null, msgs);
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK:
				return basicSetDisk(null, msgs);
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__CRITERIA:
				return ((InternalEList<?>)getCriteria()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__THRESHOLD:
				return ((InternalEList<?>)getThreshold()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD:
				return ((InternalEList<?>)getAssociationcountercriteriathreshold()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK_COUNTER:
				return ((InternalEList<?>)getDiskCounter()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION_COUNTER:
				return ((InternalEList<?>)getTransactionCounter()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY_COUNTER:
				return ((InternalEList<?>)getMemoryCounter()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__COUNTER:
				return ((InternalEList<?>)getCounter()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__METRIC:
				return ((InternalEList<?>)getMetric()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__NAME:
				return getName();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY:
				return getMemory();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION:
				return getTransaction();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK:
				return getDisk();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__CRITERIA:
				return getCriteria();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__THRESHOLD:
				return getThreshold();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD:
				return getAssociationcountercriteriathreshold();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK_COUNTER:
				return getDiskCounter();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION_COUNTER:
				return getTransactionCounter();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY_COUNTER:
				return getMemoryCounter();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__COUNTER:
				return getCounter();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__METRIC:
				return getMetric();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__NAME:
				setName((String)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY:
				setMemory((Memory)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION:
				setTransaction((Transaction)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK:
				setDisk((Disk)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends Criteria>)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__THRESHOLD:
				getThreshold().clear();
				getThreshold().addAll((Collection<? extends Threshold>)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD:
				getAssociationcountercriteriathreshold().clear();
				getAssociationcountercriteriathreshold().addAll((Collection<? extends AssociationCounterCriteriaThreshold>)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK_COUNTER:
				getDiskCounter().clear();
				getDiskCounter().addAll((Collection<? extends Disk_IO_Counter>)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION_COUNTER:
				getTransactionCounter().clear();
				getTransactionCounter().addAll((Collection<? extends TransactionCounter>)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY_COUNTER:
				getMemoryCounter().clear();
				getMemoryCounter().addAll((Collection<? extends MemoryCounter>)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__COUNTER:
				getCounter().clear();
				getCounter().addAll((Collection<? extends Counter>)newValue);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__METRIC:
				getMetric().clear();
				getMetric().addAll((Collection<? extends Metric>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY:
				setMemory((Memory)null);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION:
				setTransaction((Transaction)null);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK:
				setDisk((Disk)null);
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__CRITERIA:
				getCriteria().clear();
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__THRESHOLD:
				getThreshold().clear();
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD:
				getAssociationcountercriteriathreshold().clear();
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK_COUNTER:
				getDiskCounter().clear();
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION_COUNTER:
				getTransactionCounter().clear();
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY_COUNTER:
				getMemoryCounter().clear();
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__COUNTER:
				getCounter().clear();
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__METRIC:
				getMetric().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY:
				return memory != null;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION:
				return transaction != null;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK:
				return disk != null;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__CRITERIA:
				return criteria != null && !criteria.isEmpty();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__THRESHOLD:
				return threshold != null && !threshold.isEmpty();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD:
				return associationcountercriteriathreshold != null && !associationcountercriteriathreshold.isEmpty();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK_COUNTER:
				return diskCounter != null && !diskCounter.isEmpty();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION_COUNTER:
				return transactionCounter != null && !transactionCounter.isEmpty();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY_COUNTER:
				return memoryCounter != null && !memoryCounter.isEmpty();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__COUNTER:
				return counter != null && !counter.isEmpty();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__METRIC:
				return metric != null && !metric.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MetricModelImpl
