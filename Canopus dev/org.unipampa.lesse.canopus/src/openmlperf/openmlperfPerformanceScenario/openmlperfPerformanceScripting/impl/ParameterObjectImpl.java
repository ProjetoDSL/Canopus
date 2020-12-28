/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl;

import java.util.Collection;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.TYPEACTION;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ParameterObjectImpl#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ParameterObjectImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ParameterObjectImpl#getStaticValue <em>Static Value</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ParameterObjectImpl#getColumnsobject <em>Columnsobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterObjectImpl extends MinimalEObjectImpl.Container implements ParameterObject {
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
	 * The cached value of the '{@link #getColumnsobject() <em>Columnsobject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnsobject()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnsObject> columnsobject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenmlperfPerformanceScriptingPackage.Literals.PARAMETER_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__TYPE_ACTION, oldTypeAction, typeAction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__PARAMETER_NAME, oldParameterName, parameterName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__STATIC_VALUE, oldStaticValue, staticValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnsObject> getColumnsobject() {
		if (columnsobject == null) {
			columnsobject = new EObjectResolvingEList<ColumnsObject>(ColumnsObject.class, this, OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__COLUMNSOBJECT);
		}
		return columnsobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__TYPE_ACTION:
				return getTypeAction();
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__PARAMETER_NAME:
				return getParameterName();
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__STATIC_VALUE:
				return getStaticValue();
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__COLUMNSOBJECT:
				return getColumnsobject();
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
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__TYPE_ACTION:
				setTypeAction((TYPEACTION)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__PARAMETER_NAME:
				setParameterName((String)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__STATIC_VALUE:
				setStaticValue((String)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__COLUMNSOBJECT:
				getColumnsobject().clear();
				getColumnsobject().addAll((Collection<? extends ColumnsObject>)newValue);
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
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__TYPE_ACTION:
				setTypeAction(TYPE_ACTION_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__PARAMETER_NAME:
				setParameterName(PARAMETER_NAME_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__STATIC_VALUE:
				setStaticValue(STATIC_VALUE_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__COLUMNSOBJECT:
				getColumnsobject().clear();
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
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__TYPE_ACTION:
				return typeAction != TYPE_ACTION_EDEFAULT;
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__PARAMETER_NAME:
				return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__STATIC_VALUE:
				return STATIC_VALUE_EDEFAULT == null ? staticValue != null : !STATIC_VALUE_EDEFAULT.equals(staticValue);
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT__COLUMNSOBJECT:
				return columnsobject != null && !columnsobject.isEmpty();
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

} //ParameterObjectImpl
