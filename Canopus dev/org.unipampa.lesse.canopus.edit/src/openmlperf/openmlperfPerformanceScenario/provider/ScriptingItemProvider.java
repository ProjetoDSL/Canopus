/**
 */
package openmlperf.openmlperfPerformanceScenario.provider;


import java.util.Collection;
import java.util.List;

import openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioFactory;
import openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage;
import openmlperf.openmlperfPerformanceScenario.Scripting;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingFactory;

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
 * This is the item provider adapter for a {@link openmlperf.openmlperfPerformanceScenario.Scripting} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptingItemProvider 
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
	public ScriptingItemProvider(AdapterFactory adapterFactory) {
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
			addUserprofiletoscriptPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
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
				 getString("_UI_Scripting_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scripting_name_feature", "_UI_Scripting_type"),
				 OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Userprofiletoscript feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserprofiletoscriptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scripting_userprofiletoscript_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scripting_userprofiletoscript_feature", "_UI_Scripting_type"),
				 OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__USERPROFILETOSCRIPT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scripting_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scripting_description_feature", "_UI_Scripting_type"),
				 OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__DESCRIPTION,
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
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__INITIAL);
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__FINAL);
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__ACTIVITIES);
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__SAVEPARAMETERS);
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__DATATABLES);
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__THINK_TIME);
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__SCRIPTS);
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__PARAMENTERS);
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__ACTIVITY_TO_ACTIVITY);
			childrenFeatures.add(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__COLUMNS);
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
	 * This returns Scripting.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Scripting"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Scripting)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Scripting_type") :
			getString("_UI_Scripting_type") + " " + label;
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

		switch (notification.getFeatureID(Scripting.class)) {
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__NAME:
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__INITIAL:
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__FINAL:
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITIES:
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS:
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__DATATABLES:
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__THINK_TIME:
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__SCRIPTS:
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__PARAMENTERS:
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITY_TO_ACTIVITY:
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__COLUMNS:
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
				(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__INITIAL,
				 OpenmlperfPerformanceScriptingFactory.eINSTANCE.createInitial()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__FINAL,
				 OpenmlperfPerformanceScriptingFactory.eINSTANCE.createFinal()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__ACTIVITIES,
				 OpenmlperfPerformanceScriptingFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__SAVEPARAMETERS,
				 OpenmlperfPerformanceScriptingFactory.eINSTANCE.createSaveParameters()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__DATATABLES,
				 OpenmlperfPerformanceScriptingFactory.eINSTANCE.createDataTable()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__THINK_TIME,
				 OpenmlperfPerformanceScriptingFactory.eINSTANCE.createThinkTime()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__SCRIPTS,
				 OpenmlperfPerformanceScenarioFactory.eINSTANCE.createScripting()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__PARAMENTERS,
				 OpenmlperfPerformanceScriptingFactory.eINSTANCE.createParameterObject()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__ACTIVITY_TO_ACTIVITY,
				 OpenmlperfPerformanceScriptingFactory.eINSTANCE.createActivityToActivity()));

		newChildDescriptors.add
			(createChildParameter
				(OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING__COLUMNS,
				 OpenmlperfPerformanceScriptingFactory.eINSTANCE.createColumnsObject()));
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
