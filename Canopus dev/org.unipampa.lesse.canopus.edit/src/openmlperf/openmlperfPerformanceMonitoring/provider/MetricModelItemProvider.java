/**
 */
package openmlperf.openmlperfPerformanceMonitoring.provider;


import java.util.Collection;
import java.util.List;

import openmlperf.openmlperfPerformanceMonitoring.MetricModel;
import openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricFactory;

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
 * This is the item provider adapter for a {@link openmlperf.openmlperfPerformanceMonitoring.MetricModel} object.
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
				 OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__NAME,
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
			childrenFeatures.add(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__MEMORY);
			childrenFeatures.add(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__TRANSACTION);
			childrenFeatures.add(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__DISK);
			childrenFeatures.add(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__CRITERIA);
			childrenFeatures.add(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__THRESHOLD);
			childrenFeatures.add(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD);
			childrenFeatures.add(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__DISK_COUNTER);
			childrenFeatures.add(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__TRANSACTION_COUNTER);
			childrenFeatures.add(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__MEMORY_COUNTER);
			childrenFeatures.add(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__COUNTER);
			childrenFeatures.add(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__METRIC);
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
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY:
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION:
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK:
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__CRITERIA:
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__THRESHOLD:
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD:
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__DISK_COUNTER:
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__TRANSACTION_COUNTER:
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__MEMORY_COUNTER:
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__COUNTER:
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL__METRIC:
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
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__MEMORY,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__TRANSACTION,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__DISK,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createDisk()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__CRITERIA,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createCriteria()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__THRESHOLD,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createThreshold()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__ASSOCIATIONCOUNTERCRITERIATHRESHOLD,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createAssociationCounterCriteriaThreshold()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__DISK_COUNTER,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createDisk_IO_Counter()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__TRANSACTION_COUNTER,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createTransactionCounter()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__MEMORY_COUNTER,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createMemoryCounter()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__COUNTER,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createDisk_IO_Counter()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__COUNTER,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createMemoryCounter()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__COUNTER,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createTransactionCounter()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__METRIC,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__METRIC,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createDisk()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__METRIC,
				 OpenmlperfPerformanceMetricFactory.eINSTANCE.createTransaction()));
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
			childFeature == OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__MEMORY ||
			childFeature == OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__METRIC ||
			childFeature == OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__TRANSACTION ||
			childFeature == OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__DISK ||
			childFeature == OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__DISK_COUNTER ||
			childFeature == OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__COUNTER ||
			childFeature == OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__TRANSACTION_COUNTER ||
			childFeature == OpenmlperfPerformanceMonitoringPackage.Literals.METRIC_MODEL__MEMORY_COUNTER;

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
		return OpenmlperfEditPlugin.INSTANCE;
	}

}
