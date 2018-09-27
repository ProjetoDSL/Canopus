/**
 */
package canopus.provider;


import canopus.CanopusPackage;
import canopus.Scripting;

import canopus.canopusPerformanceScripting.CanopusPerformanceScriptingFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link canopus.Scripting} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptingItemProvider extends DiagramItemProvider {
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

			addScriptsPropertyDescriptor(object);
			addScriptingPropertyDescriptor(object);
			addScriptingeOppositePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Scripts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScriptsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scripting_scripts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scripting_scripts_feature", "_UI_Scripting_type"),
				 CanopusPackage.Literals.SCRIPTING__SCRIPTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scripting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScriptingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scripting_scripting_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scripting_scripting_feature", "_UI_Scripting_type"),
				 CanopusPackage.Literals.SCRIPTING__SCRIPTING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scriptinge Opposite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScriptingeOppositePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scripting_scriptingeOpposite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scripting_scriptingeOpposite_feature", "_UI_Scripting_type"),
				 CanopusPackage.Literals.SCRIPTING__SCRIPTINGE_OPPOSITE,
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
			childrenFeatures.add(CanopusPackage.Literals.SCRIPTING__INITIAL);
			childrenFeatures.add(CanopusPackage.Literals.SCRIPTING__FINAL);
			childrenFeatures.add(CanopusPackage.Literals.SCRIPTING__ACTIVITIES);
			childrenFeatures.add(CanopusPackage.Literals.SCRIPTING__SAVEPARAMETERS);
			childrenFeatures.add(CanopusPackage.Literals.SCRIPTING__DATATABLES);
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
			case CanopusPackage.SCRIPTING__INITIAL:
			case CanopusPackage.SCRIPTING__FINAL:
			case CanopusPackage.SCRIPTING__ACTIVITIES:
			case CanopusPackage.SCRIPTING__SAVEPARAMETERS:
			case CanopusPackage.SCRIPTING__DATATABLES:
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
				(CanopusPackage.Literals.SCRIPTING__INITIAL,
				 CanopusPerformanceScriptingFactory.eINSTANCE.createInitial()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPackage.Literals.SCRIPTING__FINAL,
				 CanopusPerformanceScriptingFactory.eINSTANCE.createFinal()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPackage.Literals.SCRIPTING__ACTIVITIES,
				 CanopusPerformanceScriptingFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPackage.Literals.SCRIPTING__SAVEPARAMETERS,
				 CanopusPerformanceScriptingFactory.eINSTANCE.createSaveParameters()));

		newChildDescriptors.add
			(createChildParameter
				(CanopusPackage.Literals.SCRIPTING__DATATABLES,
				 CanopusPerformanceScriptingFactory.eINSTANCE.createDataTable()));
	}

}
