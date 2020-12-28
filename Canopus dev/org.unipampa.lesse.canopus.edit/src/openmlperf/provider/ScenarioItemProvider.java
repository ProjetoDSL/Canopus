/**
 */
package openmlperf.provider;


import java.util.Collection;
import java.util.List;

import openmlperf.OpenmlperfPackage;
import openmlperf.Scenario;

import openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link openmlperf.Scenario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioItemProvider extends DiagramItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioItemProvider(AdapterFactory adapterFactory) {
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

			addBaseURLPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_baseURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_baseURL_feature", "_UI_Scenario_type"),
				 OpenmlperfPackage.Literals.SCENARIO__BASE_URL,
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
			childrenFeatures.add(OpenmlperfPackage.Literals.SCENARIO__USERS);
			childrenFeatures.add(OpenmlperfPackage.Literals.SCENARIO__WORKLOADS);
			childrenFeatures.add(OpenmlperfPackage.Literals.SCENARIO__SCRIPTING);
			childrenFeatures.add(OpenmlperfPackage.Literals.SCENARIO__USER_PROFILE_TO_SCRIPT);
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
	 * This returns Scenario.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Scenario"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Scenario)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Scenario_type") :
			getString("_UI_Scenario_type") + " " + label;
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

		switch (notification.getFeatureID(Scenario.class)) {
			case OpenmlperfPackage.SCENARIO__BASE_URL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OpenmlperfPackage.SCENARIO__USERS:
			case OpenmlperfPackage.SCENARIO__WORKLOADS:
			case OpenmlperfPackage.SCENARIO__SCRIPTING:
			case OpenmlperfPackage.SCENARIO__USER_PROFILE_TO_SCRIPT:
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
				(OpenmlperfPackage.Literals.SCENARIO__USERS,
				 OpenmlperfPerformanceScenarioFactory.eINSTANCE.createUserProfile()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPackage.Literals.SCENARIO__WORKLOADS,
				 OpenmlperfPerformanceScenarioFactory.eINSTANCE.createWorkload()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPackage.Literals.SCENARIO__SCRIPTING,
				 OpenmlperfPerformanceScenarioFactory.eINSTANCE.createScripting()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPackage.Literals.SCENARIO__USER_PROFILE_TO_SCRIPT,
				 OpenmlperfPerformanceScenarioFactory.eINSTANCE.createUserProfileToScript()));
	}

}
