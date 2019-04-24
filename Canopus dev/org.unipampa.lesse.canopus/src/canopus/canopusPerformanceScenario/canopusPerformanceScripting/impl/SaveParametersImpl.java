/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.SaveParameters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Save Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.SaveParametersImpl#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.SaveParametersImpl#getParameterhiddenobject <em>Parameterhiddenobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaveParametersImpl extends MinimalEObjectImpl.Container implements SaveParameters {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterhiddenobject() <em>Parameterhiddenobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterhiddenobject()
	 * @generated
	 * @ordered
	 */
	protected ParameterHiddenObject parameterhiddenobject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaveParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScriptingPackage.Literals.SAVE_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterHiddenObject getParameterhiddenobject() {
		return parameterhiddenobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterhiddenobject(ParameterHiddenObject newParameterhiddenobject, NotificationChain msgs) {
		ParameterHiddenObject oldParameterhiddenobject = parameterhiddenobject;
		parameterhiddenobject = newParameterhiddenobject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERHIDDENOBJECT, oldParameterhiddenobject, newParameterhiddenobject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterhiddenobject(ParameterHiddenObject newParameterhiddenobject) {
		if (newParameterhiddenobject != parameterhiddenobject) {
			NotificationChain msgs = null;
			if (parameterhiddenobject != null)
				msgs = ((InternalEObject)parameterhiddenobject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERHIDDENOBJECT, null, msgs);
			if (newParameterhiddenobject != null)
				msgs = ((InternalEObject)newParameterhiddenobject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERHIDDENOBJECT, null, msgs);
			msgs = basicSetParameterhiddenobject(newParameterhiddenobject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERHIDDENOBJECT, newParameterhiddenobject, newParameterhiddenobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERHIDDENOBJECT:
				return basicSetParameterhiddenobject(null, msgs);
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
			case CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__NAME:
				return getName();
			case CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERHIDDENOBJECT:
				return getParameterhiddenobject();
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
			case CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__NAME:
				setName((String)newValue);
				return;
			case CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERHIDDENOBJECT:
				setParameterhiddenobject((ParameterHiddenObject)newValue);
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
			case CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERHIDDENOBJECT:
				setParameterhiddenobject((ParameterHiddenObject)null);
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
			case CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CanopusPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERHIDDENOBJECT:
				return parameterhiddenobject != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SaveParametersImpl
