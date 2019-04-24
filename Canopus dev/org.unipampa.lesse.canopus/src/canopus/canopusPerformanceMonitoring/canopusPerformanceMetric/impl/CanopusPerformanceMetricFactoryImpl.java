/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CanopusPerformanceMetricFactoryImpl extends EFactoryImpl implements CanopusPerformanceMetricFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CanopusPerformanceMetricFactory init() {
		try {
			CanopusPerformanceMetricFactory theCanopusPerformanceMetricFactory = (CanopusPerformanceMetricFactory)EPackage.Registry.INSTANCE.getEFactory(CanopusPerformanceMetricPackage.eNS_URI);
			if (theCanopusPerformanceMetricFactory != null) {
				return theCanopusPerformanceMetricFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CanopusPerformanceMetricFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceMetricFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CanopusPerformanceMetricPackage.MEMORY: return createMemory();
			case CanopusPerformanceMetricPackage.DISK: return createDisk();
			case CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD: return createAssociationCounterCriteriaThreshold();
			case CanopusPerformanceMetricPackage.DISK_IO_COUNTER: return createDisk_IO_Counter();
			case CanopusPerformanceMetricPackage.CRITERIA: return createCriteria();
			case CanopusPerformanceMetricPackage.THRESHOLD: return createThreshold();
			case CanopusPerformanceMetricPackage.MEMORY_COUNTER: return createMemoryCounter();
			case CanopusPerformanceMetricPackage.TRANSACTION: return createTransaction();
			case CanopusPerformanceMetricPackage.TRANSACTION_COUNTER: return createTransactionCounter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CanopusPerformanceMetricPackage.ASSOCIATION_CRITERIA:
				return createASSOCIATION_CRITERIAFromString(eDataType, initialValue);
			case CanopusPerformanceMetricPackage.COUNTER_DISK:
				return createCOUNTER_DISKFromString(eDataType, initialValue);
			case CanopusPerformanceMetricPackage.COUNTER_MEMORY:
				return createCOUNTER_MEMORYFromString(eDataType, initialValue);
			case CanopusPerformanceMetricPackage.COUNTER_TRANSACTION:
				return createCOUNTER_TRANSACTIONFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CanopusPerformanceMetricPackage.ASSOCIATION_CRITERIA:
				return convertASSOCIATION_CRITERIAToString(eDataType, instanceValue);
			case CanopusPerformanceMetricPackage.COUNTER_DISK:
				return convertCOUNTER_DISKToString(eDataType, instanceValue);
			case CanopusPerformanceMetricPackage.COUNTER_MEMORY:
				return convertCOUNTER_MEMORYToString(eDataType, instanceValue);
			case CanopusPerformanceMetricPackage.COUNTER_TRANSACTION:
				return convertCOUNTER_TRANSACTIONToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Disk createDisk() {
		DiskImpl disk = new DiskImpl();
		return disk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationCounterCriteriaThreshold createAssociationCounterCriteriaThreshold() {
		AssociationCounterCriteriaThresholdImpl associationCounterCriteriaThreshold = new AssociationCounterCriteriaThresholdImpl();
		return associationCounterCriteriaThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Disk_IO_Counter createDisk_IO_Counter() {
		Disk_IO_CounterImpl disk_IO_Counter = new Disk_IO_CounterImpl();
		return disk_IO_Counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Criteria createCriteria() {
		CriteriaImpl criteria = new CriteriaImpl();
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threshold createThreshold() {
		ThresholdImpl threshold = new ThresholdImpl();
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemoryCounter createMemoryCounter() {
		MemoryCounterImpl memoryCounter = new MemoryCounterImpl();
		return memoryCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transaction createTransaction() {
		TransactionImpl transaction = new TransactionImpl();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionCounter createTransactionCounter() {
		TransactionCounterImpl transactionCounter = new TransactionCounterImpl();
		return transactionCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASSOCIATION_CRITERIA createASSOCIATION_CRITERIAFromString(EDataType eDataType, String initialValue) {
		ASSOCIATION_CRITERIA result = ASSOCIATION_CRITERIA.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertASSOCIATION_CRITERIAToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COUNTER_DISK createCOUNTER_DISKFromString(EDataType eDataType, String initialValue) {
		COUNTER_DISK result = COUNTER_DISK.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCOUNTER_DISKToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COUNTER_MEMORY createCOUNTER_MEMORYFromString(EDataType eDataType, String initialValue) {
		COUNTER_MEMORY result = COUNTER_MEMORY.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCOUNTER_MEMORYToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COUNTER_TRANSACTION createCOUNTER_TRANSACTIONFromString(EDataType eDataType, String initialValue) {
		COUNTER_TRANSACTION result = COUNTER_TRANSACTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCOUNTER_TRANSACTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CanopusPerformanceMetricPackage getCanopusPerformanceMetricPackage() {
		return (CanopusPerformanceMetricPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CanopusPerformanceMetricPackage getPackage() {
		return CanopusPerformanceMetricPackage.eINSTANCE;
	}

} //CanopusPerformanceMetricFactoryImpl
