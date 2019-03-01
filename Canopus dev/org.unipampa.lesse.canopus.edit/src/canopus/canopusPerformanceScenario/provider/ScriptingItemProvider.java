/**
 */
package canopus.canopusPerformanceScenario.provider;


import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioFactory;
import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;
import canopus.canopusPerformanceScenario.Scripting;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingFactory;

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
 * This is the item provider adapter for a {@link canopus.canopusPerformanceScenario.Scripting} object.
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
				 CanopusPerformanceScenarioPackage.Literals.SCRIPTING__NAME,
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
				 CanopusPerformanceScenarioPackage.Literals.SCRIPTING__USERPROFILETOSCRIPT,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__INITIAL);
			childrenFeatures.add(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__FINAL);
			childrenFeatures.add(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__ACTIVITIES);
			childrenFeatures.add(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__SAVEPARAMETERS);
			childrenFeatures.add(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__DATATABLES);
			childrenFeatures.add(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__THINK_TIME);
			childrenFeatures.add(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__SCRIPTS);
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
			case CanopusPerformanceScenarioPackage.SCRIPTING__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__INITIAL:
			case CanopusPerformanceScenarioPackage.SCRIPTING__FINAL:
			case CanopusPerformanceScenarioPackage.SCRIPTING__ACTIVITIES:
			case CanopusPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS:
			case CanopusPerformanceScenarioPackage.SCRIPTING__DATATABLES:
			case CanopusPerformanceScenarioPackage.SCRIPTING__THINK_TIME:
			case CanopusPerformanceScenarioPackage.SCRIPTING__SCRIPTS:
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
				(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__INITIAL,
				 CanopusPerformanceScriptingFactory.eINSTANCE.createInitial()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__FINAL,
				 CanopusPerformanceScriptingFactory.eINSTANCE.createFinal()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__ACTIVITIES,
				 CanopusPerformanceScriptingFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__SAVEPARAMETERS,
				 CanopusPerformanceScriptingFactory.eINSTANCE.createSaveParameters()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__DATATABLES,
				 CanopusPerformanceScriptingFactory.eINSTANCE.createDataTable()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__THINK_TIME,
				 CanopusPerformanceScriptingFactory.eINSTANCE.createThinkTime()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPerformanceScenarioPackage.Literals.SCRIPTING__SCRIPTS,
				 CanopusPerformanceScenarioFactory.eINSTANCE.createScripting()));
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
