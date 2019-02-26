/**
 */
package canopus.canopusPerformanceMonitoring.provider;


import canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage;
import canopus.canopusPerformanceMonitoring.MetricModel;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricFactory;

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
 * This is the item provider adapter for a {@link canopus.canopusPerformanceMonitoring.MetricModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricModelItemProvider 
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
	public MetricModelItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_MetricModel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MetricModel_name_feature", "_UI_MetricModel_type"),
				 CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__NAME,
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
			childrenFeatures.add(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__MEMORY);
			childrenFeatures.add(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__TRANSACTION);
			childrenFeatures.add(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__DISK);
			childrenFeatures.add(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__CRITERIA);
			childrenFeatures.add(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__THRESHOLD);
			childrenFeatures.add(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD);
			childrenFeatures.add(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__DISK_COUNTER);
			childrenFeatures.add(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__TRANSACTION_COUNTER);
			childrenFeatures.add(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__MEMORY_COUNTER);
			childrenFeatures.add(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__COUNTER);
			childrenFeatures.add(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__METRIC);
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
	 * This returns MetricModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MetricModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MetricModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MetricModel_type") :
			getString("_UI_MetricModel_type") + " " + label;
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

		switch (notification.getFeatureID(MetricModel.class)) {
			case CanopusPerformanceMonitoringPackage.METRIC_MODEL__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CanopusPerformanceMonitoringPackage.METRIC_MODEL__MEMORY:
			case CanopusPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION:
			case CanopusPerformanceMonitoringPackage.METRIC_MODEL__DISK:
			case CanopusPerformanceMonitoringPackage.METRIC_MODEL__CRITERIA:
			case CanopusPerformanceMonitoringPackage.METRIC_MODEL__THRESHOLD:
			case CanopusPerformanceMonitoringPackage.METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD:
			case CanopusPerformanceMonitoringPackage.METRIC_MODEL__DISK_COUNTER:
			case CanopusPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION_COUNTER:
			case CanopusPerformanceMonitoringPackage.METRIC_MODEL__MEMORY_COUNTER:
			case CanopusPerformanceMonitoringPackage.METRIC_MODEL__COUNTER:
			case CanopusPerformanceMonitoringPackage.METRIC_MODEL__METRIC:
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
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__MEMORY,
				 CanopusPerformanceMetricFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__TRANSACTION,
				 CanopusPerformanceMetricFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__DISK,
				 CanopusPerformanceMetricFactory.eINSTANCE.createDisk()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__CRITERIA,
				 CanopusPerformanceMetricFactory.eINSTANCE.createCriteria()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__THRESHOLD,
				 CanopusPerformanceMetricFactory.eINSTANCE.createThreshold()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD,
				 CanopusPerformanceMetricFactory.eINSTANCE.createAssociationCounterCriteriaThreshold()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__DISK_COUNTER,
				 CanopusPerformanceMetricFactory.eINSTANCE.createDisk_IO_Counter()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__TRANSACTION_COUNTER,
				 CanopusPerformanceMetricFactory.eINSTANCE.createTransactionCounter()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__MEMORY_COUNTER,
				 CanopusPerformanceMetricFactory.eINSTANCE.createMemoryCounter()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__COUNTER,
				 CanopusPerformanceMetricFactory.eINSTANCE.createDisk_IO_Counter()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__COUNTER,
				 CanopusPerformanceMetricFactory.eINSTANCE.createMemoryCounter()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__COUNTER,
				 CanopusPerformanceMetricFactory.eINSTANCE.createTransactionCounter()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__METRIC,
				 CanopusPerformanceMetricFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__METRIC,
				 CanopusPerformanceMetricFactory.eINSTANCE.createDisk()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__METRIC,
				 CanopusPerformanceMetricFactory.eINSTANCE.createTransaction()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__MEMORY ||
			childFeature == CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__METRIC ||
			childFeature == CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__TRANSACTION ||
			childFeature == CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__DISK ||
			childFeature == CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__DISK_COUNTER ||
			childFeature == CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__COUNTER ||
			childFeature == CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__TRANSACTION_COUNTER ||
			childFeature == CanopusPerformanceMonitoringPackage.Literals.METRIC_MODEL__MEMORY_COUNTER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
