/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.provider;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.util.CanopusPerformanceMetricAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CanopusPerformanceMetricItemProviderAdapterFactory extends CanopusPerformanceMetricAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceMetricItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Memory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryItemProvider memoryItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Memory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemoryAdapter() {
		if (memoryItemProvider == null) {
			memoryItemProvider = new MemoryItemProvider(this);
		}

		return memoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiskItemProvider diskItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiskAdapter() {
		if (diskItemProvider == null) {
			diskItemProvider = new DiskItemProvider(this);
		}

		return diskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationCounterCriteriaThresholdItemProvider associationCounterCriteriaThresholdItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationCounterCriteriaThresholdAdapter() {
		if (associationCounterCriteriaThresholdItemProvider == null) {
			associationCounterCriteriaThresholdItemProvider = new AssociationCounterCriteriaThresholdItemProvider(this);
		}

		return associationCounterCriteriaThresholdItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk_IO_Counter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Disk_IO_CounterItemProvider disk_IO_CounterItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk_IO_Counter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDisk_IO_CounterAdapter() {
		if (disk_IO_CounterItemProvider == null) {
			disk_IO_CounterItemProvider = new Disk_IO_CounterItemProvider(this);
		}

		return disk_IO_CounterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Criteria} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriteriaItemProvider criteriaItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Criteria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCriteriaAdapter() {
		if (criteriaItemProvider == null) {
			criteriaItemProvider = new CriteriaItemProvider(this);
		}

		return criteriaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Threshold} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThresholdItemProvider thresholdItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Threshold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThresholdAdapter() {
		if (thresholdItemProvider == null) {
			thresholdItemProvider = new ThresholdItemProvider(this);
		}

		return thresholdItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryCounterItemProvider memoryCounterItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemoryCounterAdapter() {
		if (memoryCounterItemProvider == null) {
			memoryCounterItemProvider = new MemoryCounterItemProvider(this);
		}

		return memoryCounterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Transaction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionItemProvider transactionItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Transaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransactionAdapter() {
		if (transactionItemProvider == null) {
			transactionItemProvider = new TransactionItemProvider(this);
		}

		return transactionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionCounterItemProvider transactionCounterItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransactionCounterAdapter() {
		if (transactionCounterItemProvider == null) {
			transactionCounterItemProvider = new TransactionCounterItemProvider(this);
		}

		return transactionCounterItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (memoryItemProvider != null) memoryItemProvider.dispose();
		if (diskItemProvider != null) diskItemProvider.dispose();
		if (associationCounterCriteriaThresholdItemProvider != null) associationCounterCriteriaThresholdItemProvider.dispose();
		if (disk_IO_CounterItemProvider != null) disk_IO_CounterItemProvider.dispose();
		if (criteriaItemProvider != null) criteriaItemProvider.dispose();
		if (thresholdItemProvider != null) thresholdItemProvider.dispose();
		if (memoryCounterItemProvider != null) memoryCounterItemProvider.dispose();
		if (transactionItemProvider != null) transactionItemProvider.dispose();
		if (transactionCounterItemProvider != null) transactionCounterItemProvider.dispose();
	}

}