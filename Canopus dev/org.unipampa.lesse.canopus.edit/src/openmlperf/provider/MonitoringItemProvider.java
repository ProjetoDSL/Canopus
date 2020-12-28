/**
 */
package openmlperf.provider;


import java.util.Collection;
import java.util.List;

import openmlperf.Monitoring;
import openmlperf.OpenmlperfPackage;

import openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link openmlperf.Monitoring} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MonitoringItemProvider extends DiagramItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(OpenmlperfPackage.Literals.MONITORING__SUTS);
			childrenFeatures.add(OpenmlperfPackage.Literals.MONITORING__LOAD_GENERATORS);
			childrenFeatures.add(OpenmlperfPackage.Literals.MONITORING__MONITORS);
			childrenFeatures.add(OpenmlperfPackage.Literals.MONITORING__METRIC_MODEL);
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
	 * This returns Monitoring.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Monitoring"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Monitoring)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Monitoring_type") :
			getString("_UI_Monitoring_type") + " " + label;
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

		switch (notification.getFeatureID(Monitoring.class)) {
			case OpenmlperfPackage.MONITORING__SUTS:
			case OpenmlperfPackage.MONITORING__LOAD_GENERATORS:
			case OpenmlperfPackage.MONITORING__MONITORS:
			case OpenmlperfPackage.MONITORING__METRIC_MODEL:
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
				(OpenmlperfPackage.Literals.MONITORING__SUTS,
				 OpenmlperfPerformanceMonitoringFactory.eINSTANCE.createSUT()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPackage.Literals.MONITORING__LOAD_GENERATORS,
				 OpenmlperfPerformanceMonitoringFactory.eINSTANCE.createLoadGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPackage.Literals.MONITORING__MONITORS,
				 OpenmlperfPerformanceMonitoringFactory.eINSTANCE.createMonitor()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPackage.Literals.MONITORING__METRIC_MODEL,
				 OpenmlperfPerformanceMonitoringFactory.eINSTANCE.createMetricModel()));
	}

}
