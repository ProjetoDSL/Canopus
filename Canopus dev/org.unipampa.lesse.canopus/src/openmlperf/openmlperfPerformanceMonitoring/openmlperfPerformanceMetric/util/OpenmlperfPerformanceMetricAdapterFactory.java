/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.util;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage
 * @generated
 */
public class OpenmlperfPerformanceMetricAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenmlperfPerformanceMetricPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceMetricAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OpenmlperfPerformanceMetricPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenmlperfPerformanceMetricSwitch<Adapter> modelSwitch =
		new OpenmlperfPerformanceMetricSwitch<Adapter>() {
			@Override
			public Adapter caseMemory(Memory object) {
				return createMemoryAdapter();
			}
			@Override
			public Adapter caseDisk(Disk object) {
				return createDiskAdapter();
			}
			@Override
			public Adapter caseAssociationCounterCriteriaThreshold(AssociationCounterCriteriaThreshold object) {
				return createAssociationCounterCriteriaThresholdAdapter();
			}
			@Override
			public Adapter caseCounter(Counter object) {
				return createCounterAdapter();
			}
			@Override
			public Adapter caseDisk_IO_Counter(Disk_IO_Counter object) {
				return createDisk_IO_CounterAdapter();
			}
			@Override
			public Adapter caseCriteria(Criteria object) {
				return createCriteriaAdapter();
			}
			@Override
			public Adapter caseThreshold(Threshold object) {
				return createThresholdAdapter();
			}
			@Override
			public Adapter caseMemoryCounter(MemoryCounter object) {
				return createMemoryCounterAdapter();
			}
			@Override
			public Adapter caseTransaction(Transaction object) {
				return createTransactionAdapter();
			}
			@Override
			public Adapter caseTransactionCounter(TransactionCounter object) {
				return createTransactionCounterAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Memory
	 * @generated
	 */
	public Adapter createMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk
	 * @generated
	 */
	public Adapter createDiskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold <em>Association Counter Criteria Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold
	 * @generated
	 */
	public Adapter createAssociationCounterCriteriaThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Counter
	 * @generated
	 */
	public Adapter createCounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk_IO_Counter <em>Disk IO Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk_IO_Counter
	 * @generated
	 */
	public Adapter createDisk_IO_CounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Criteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Criteria
	 * @generated
	 */
	public Adapter createCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Threshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Threshold
	 * @generated
	 */
	public Adapter createThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.MemoryCounter <em>Memory Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.MemoryCounter
	 * @generated
	 */
	public Adapter createMemoryCounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Transaction
	 * @generated
	 */
	public Adapter createTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.TransactionCounter <em>Transaction Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.TransactionCounter
	 * @generated
	 */
	public Adapter createTransactionCounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OpenmlperfPerformanceMetricAdapterFactory
