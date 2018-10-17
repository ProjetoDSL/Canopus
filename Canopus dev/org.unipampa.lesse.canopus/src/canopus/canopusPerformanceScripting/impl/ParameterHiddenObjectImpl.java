/**
 */
package canopus.canopusPerformanceScripting.impl;

import canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;
import canopus.canopusPerformanceScripting.ColumnsHiddenObject;
import canopus.canopusPerformanceScripting.ParameterHiddenObject;
import canopus.canopusPerformanceScripting.TYPEACTION;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Hidden Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl#getStaticValue <em>Static Value</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl#getDynamicvalues <em>Dynamicvalues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterHiddenObjectImpl extends MinimalEObjectImpl.Container implements ParameterHiddenObject {
	/**
	 * The default value of the '{@link #getTypeAction() <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAction()
	 * @generated
	 * @ordered
	 */
	protected static final TYPEACTION TYPE_ACTION_EDEFAULT = TYPEACTION.BODY;

	/**
	 * The cached value of the '{@link #getTypeAction() <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAction()
	 * @generated
	 * @ordered
	 */
	protected TYPEACTION typeAction = TYPE_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected String parameterName = PARAMETER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaticValue() <em>Static Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STATIC_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaticValue() <em>Static Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticValue()
	 * @generated
	 * @ordered
	 */
	protected String staticValue = STATIC_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDynamicvalues() <em>Dynamicvalues</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicvalues()
	 * @generated
	 * @ordered
	 */
	protected ColumnsHiddenObject dynamicvalues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterHiddenObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScriptingPackage.Literals.PARAMETER_HIDDEN_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEACTION getTypeAction() {
		return typeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAction(TYPEACTION newTypeAction) {
		TYPEACTION oldTypeAction = typeAction;
		typeAction = newTypeAction == null ? TYPE_ACTION_EDEFAULT : newTypeAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__TYPE_ACTION, oldTypeAction, typeAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterName(String newParameterName) {
		String oldParameterName = parameterName;
		parameterName = newParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__PARAMETER_NAME, oldParameterName, parameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaticValue() {
		return staticValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticValue(String newStaticValue) {
		String oldStaticValue = staticValue;
		staticValue = newStaticValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__STATIC_VALUE, oldStaticValue, staticValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsHiddenObject getDynamicvalues() {
		return dynamicvalues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicvalues(ColumnsHiddenObject newDynamicvalues, NotificationChain msgs) {
		ColumnsHiddenObject oldDynamicvalues = dynamicvalues;
		dynamicvalues = newDynamicvalues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__DYNAMICVALUES, oldDynamicvalues, newDynamicvalues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicvalues(ColumnsHiddenObject newDynamicvalues) {
		if (newDynamicvalues != dynamicvalues) {
			NotificationChain msgs = null;
			if (dynamicvalues != null)
				msgs = ((InternalEObject)dynamicvalues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__DYNAMICVALUES, null, msgs);
			if (newDynamicvalues != null)
				msgs = ((InternalEObject)newDynamicvalues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__DYNAMICVALUES, null, msgs);
			msgs = basicSetDynamicvalues(newDynamicvalues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__DYNAMICVALUES, newDynamicvalues, newDynamicvalues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__DYNAMICVALUES:
				return basicSetDynamicvalues(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__TYPE_ACTION:
				return getTypeAction();
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__PARAMETER_NAME:
				return getParameterName();
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__STATIC_VALUE:
				return getStaticValue();
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__DYNAMICVALUES:
				return getDynamicvalues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__TYPE_ACTION:
				setTypeAction((TYPEACTION)newValue);
				return;
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__PARAMETER_NAME:
				setParameterName((String)newValue);
				return;
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__STATIC_VALUE:
				setStaticValue((String)newValue);
				return;
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__DYNAMICVALUES:
				setDynamicvalues((ColumnsHiddenObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__TYPE_ACTION:
				setTypeAction(TYPE_ACTION_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__PARAMETER_NAME:
				setParameterName(PARAMETER_NAME_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__STATIC_VALUE:
				setStaticValue(STATIC_VALUE_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__DYNAMICVALUES:
				setDynamicvalues((ColumnsHiddenObject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__TYPE_ACTION:
				return typeAction != TYPE_ACTION_EDEFAULT;
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__PARAMETER_NAME:
				return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__STATIC_VALUE:
				return STATIC_VALUE_EDEFAULT == null ? staticValue != null : !STATIC_VALUE_EDEFAULT.equals(staticValue);
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__DYNAMICVALUES:
				return dynamicvalues != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (typeAction: ");
		result.append(typeAction);
		result.append(", parameterName: ");
		result.append(parameterName);
		result.append(", staticValue: ");
		result.append(staticValue);
		result.append(')');
		return result.toString();
	}

} //ParameterHiddenObjectImpl
