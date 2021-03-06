/**
 */
package openmlperf.openmlperfPerformanceScenario.provider;


import java.util.Collection;
import java.util.List;

import openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage;
import openmlperf.openmlperfPerformanceScenario.Workload;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadFactory;

import openmlperf.provider.OpenmlperfEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link openmlperf.openmlperfPerformanceScenario.Workload} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkloadItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addTimePropertyDescriptor(object);
			addVirtualUsersPropertyDescriptor(object);
			addTimeTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Workload_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Workload_name_feature", "_UI_Workload_type"),
				 OpenmlperfPerformanceScenarioPackage.Literals.WORKLOAD__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Workload_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Workload_time_feature", "_UI_Workload_type"),
				 OpenmlperfPerformanceScenarioPackage.Literals.WORKLOAD__TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Virtual Users feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVirtualUsersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Workload_virtualUsers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Workload_virtualUsers_feature", "_UI_Workload_type"),
				 OpenmlperfPerformanceScenarioPackage.Literals.WORKLOAD__VIRTUAL_USERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Workload_timeType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Workload_timeType_feature", "_UI_Workload_type"),
				 OpenmlperfPerformanceScenarioPackage.Literals.WORKLOAD__TIME_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.WORKLOAD__RAMP_UP_TIMER);
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.WORKLOAD__RAMP_DOWN_USERS);
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.WORKLOAD__RAMP_UP_USERS);
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.WORKLOAD__RAMP_DOWN_TIMER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Workload.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Workload"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Workload)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Workload_type") :
			getString("_UI_Workload_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Workload.class)) {
			case OpenmlperfPerformanceScenarioPackage.WORKLOAD__NAME:
			case OpenmlperfPerformanceScenarioPackage.WORKLOAD__TIME:
			case OpenmlperfPerformanceScenarioPackage.WORKLOAD__VIRTUAL_USERS:
			case OpenmlperfPerformanceScenarioPackage.WORKLOAD__TIME_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OpenmlperfPerformanceScenarioPackage.WORKLOAD__RAMP_UP_TIMER:
			case OpenmlperfPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_USERS:
			case OpenmlperfPerformanceScenarioPackage.WORKLOAD__RAMP_UP_USERS:
			case OpenmlperfPerformanceScenarioPackage.WORKLOAD__RAMP_DOWN_TIMER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceScenarioPackage.Literals.WORKLOAD__RAMP_UP_TIMER,
				 OpenmlperfPerformanceWorkloadFactory.eINSTANCE.createRampUpTimer()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceScenarioPackage.Literals.WORKLOAD__RAMP_DOWN_USERS,
				 OpenmlperfPerformanceWorkloadFactory.eINSTANCE.createRampDownUsers()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceScenarioPackage.Literals.WORKLOAD__RAMP_UP_USERS,
				 OpenmlperfPerformanceWorkloadFactory.eINSTANCE.createRampUpUsers()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceScenarioPackage.Literals.WORKLOAD__RAMP_DOWN_TIMER,
				 OpenmlperfPerformanceWorkloadFactory.eINSTANCE.createRampDownTimer()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OpenmlperfEditPlugin.INSTANCE;
	}

}
