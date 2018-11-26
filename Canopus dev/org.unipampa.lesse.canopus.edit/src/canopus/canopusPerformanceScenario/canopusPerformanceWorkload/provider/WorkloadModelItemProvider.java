/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.provider;


import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadFactory;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel;

import canopus.provider.CanopusEditPlugin;

import java.util.Collection;
import java.util.List;

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
 * This is the item provider adapter for a {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkloadModelItemProvider 
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
	public WorkloadModelItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_WorkloadModel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkloadModel_name_feature", "_UI_WorkloadModel_type"),
				 CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL__NAME,
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
			childrenFeatures.add(CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL__TESTDURATION);
			childrenFeatures.add(CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL__RAMPDOWNUSERS);
			childrenFeatures.add(CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL__RAMPDOWNTIME);
			childrenFeatures.add(CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL__RAMPUPTIMER);
			childrenFeatures.add(CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL__RAMPUPUSERS);
			childrenFeatures.add(CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL__VIRTUALUSERS);
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
	 * This returns WorkloadModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WorkloadModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WorkloadModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WorkloadModel_type") :
			getString("_UI_WorkloadModel_type") + " " + label;
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

		switch (notification.getFeatureID(WorkloadModel.class)) {
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__TESTDURATION:
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNUSERS:
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPDOWNTIME:
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPTIMER:
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__RAMPUPUSERS:
			case CanopusPerformanceWorkloadPackage.WORKLOAD_MODEL__VIRTUALUSERS:
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
				(CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL__TESTDURATION,
				 CanopusPerformanceWorkloadFactory.eINSTANCE.createTestDuration()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL__RAMPDOWNUSERS,
				 CanopusPerformanceWorkloadFactory.eINSTANCE.createRampDownUsers()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL__RAMPDOWNTIME,
				 CanopusPerformanceWorkloadFactory.eINSTANCE.createRampDownTime()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL__RAMPUPTIMER,
				 CanopusPerformanceWorkloadFactory.eINSTANCE.createRampUpTimer()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL__RAMPUPUSERS,
				 CanopusPerformanceWorkloadFactory.eINSTANCE.createRampUpUsers()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_MODEL__VIRTUALUSERS,
				 CanopusPerformanceWorkloadFactory.eINSTANCE.createVirtualUsers()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CanopusEditPlugin.INSTANCE;
	}

}
