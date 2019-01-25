/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.provider;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.util.CanopusPerformanceWorkloadAdapterFactory;

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
public class CanopusPerformanceWorkloadItemProviderAdapterFactory extends CanopusPerformanceWorkloadAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public CanopusPerformanceWorkloadItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualUsersItemProvider virtualUsersItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVirtualUsersAdapter() {
		if (virtualUsersItemProvider == null) {
			virtualUsersItemProvider = new VirtualUsersItemProvider(this);
		}

		return virtualUsersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.TestDuration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestDurationItemProvider testDurationItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.TestDuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestDurationAdapter() {
		if (testDurationItemProvider == null) {
			testDurationItemProvider = new TestDurationItemProvider(this);
		}

		return testDurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampUpUsersItemProvider rampUpUsersItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRampUpUsersAdapter() {
		if (rampUpUsersItemProvider == null) {
			rampUpUsersItemProvider = new RampUpUsersItemProvider(this);
		}

		return rampUpUsersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampDownUsersItemProvider rampDownUsersItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRampDownUsersAdapter() {
		if (rampDownUsersItemProvider == null) {
			rampDownUsersItemProvider = new RampDownUsersItemProvider(this);
		}

		return rampDownUsersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampUpTimerItemProvider rampUpTimerItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRampUpTimerAdapter() {
		if (rampUpTimerItemProvider == null) {
			rampUpTimerItemProvider = new RampUpTimerItemProvider(this);
		}

		return rampUpTimerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTimer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampDownTimerItemProvider rampDownTimerItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTimer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRampDownTimerAdapter() {
		if (rampDownTimerItemProvider == null) {
			rampDownTimerItemProvider = new RampDownTimerItemProvider(this);
		}

		return rampDownTimerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampUpTestItemProvider rampUpTestItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRampUpTestAdapter() {
		if (rampUpTestItemProvider == null) {
			rampUpTestItemProvider = new RampUpTestItemProvider(this);
		}

		return rampUpTestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampDownTestItemProvider rampDownTestItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRampDownTestAdapter() {
		if (rampDownTestItemProvider == null) {
			rampDownTestItemProvider = new RampDownTestItemProvider(this);
		}

		return rampDownTestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestItemProvider testItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestAdapter() {
		if (testItemProvider == null) {
			testItemProvider = new TestItemProvider(this);
		}

		return testItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadGroupItemProvider workloadGroupItemProvider;

	/**
	 * This creates an adapter for a {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkloadGroupAdapter() {
		if (workloadGroupItemProvider == null) {
			workloadGroupItemProvider = new WorkloadGroupItemProvider(this);
		}

		return workloadGroupItemProvider;
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
		if (virtualUsersItemProvider != null) virtualUsersItemProvider.dispose();
		if (testDurationItemProvider != null) testDurationItemProvider.dispose();
		if (rampUpUsersItemProvider != null) rampUpUsersItemProvider.dispose();
		if (rampDownUsersItemProvider != null) rampDownUsersItemProvider.dispose();
		if (rampUpTimerItemProvider != null) rampUpTimerItemProvider.dispose();
		if (rampDownTimerItemProvider != null) rampDownTimerItemProvider.dispose();
		if (rampUpTestItemProvider != null) rampUpTestItemProvider.dispose();
		if (rampDownTestItemProvider != null) rampDownTestItemProvider.dispose();
		if (testItemProvider != null) testItemProvider.dispose();
		if (workloadGroupItemProvider != null) workloadGroupItemProvider.dispose();
	}

}
