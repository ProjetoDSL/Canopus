/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.TYPEACTION;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Hidden Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl#getStaticValue <em>Static Value</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl#getColumnshiddenobject <em>Columnshiddenobject</em>}</li>
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
	 * The cached value of the '{@link #getColumnshiddenobject() <em>Columnshiddenobject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnshiddenobject()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnsHiddenObject> columnshiddenobject;

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
	@Override
	public TYPEACTION getTypeAction() {
		return typeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getStaticValue() {
		return staticValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public EList<ColumnsHiddenObject> getColumnshiddenobject() {
		if (columnshiddenobject == null) {
			columnshiddenobject = new EObjectResolvingEList<ColumnsHiddenObject>(ColumnsHiddenObject.class, this, CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__COLUMNSHIDDENOBJECT);
		}
		return columnshiddenobject;
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
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__COLUMNSHIDDENOBJECT:
				return getColumnshiddenobject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
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
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__COLUMNSHIDDENOBJECT:
				getColumnshiddenobject().clear();
				getColumnshiddenobject().addAll((Collection<? extends ColumnsHiddenObject>)newValue);
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
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__COLUMNSHIDDENOBJECT:
				getColumnshiddenobject().clear();
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
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT__COLUMNSHIDDENOBJECT:
				return columnshiddenobject != null && !columnshiddenobject.isEmpty();
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
