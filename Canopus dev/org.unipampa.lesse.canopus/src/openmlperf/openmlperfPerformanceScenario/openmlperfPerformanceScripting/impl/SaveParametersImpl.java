/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SaveParameters;

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
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.SaveParametersImpl#getName <em>Name</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.SaveParametersImpl#getParameterbject <em>Parameterbject</em>}</li>
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
	 * The cached value of the '{@link #getParameterbject() <em>Parameterbject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterbject()
	 * @generated
	 * @ordered
	 */
	protected ParameterObject parameterbject;

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
		return OpenmlperfPerformanceScriptingPackage.Literals.SAVE_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterObject getParameterbject() {
		return parameterbject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterbject(ParameterObject newParameterbject, NotificationChain msgs) {
		ParameterObject oldParameterbject = parameterbject;
		parameterbject = newParameterbject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERBJECT, oldParameterbject, newParameterbject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterbject(ParameterObject newParameterbject) {
		if (newParameterbject != parameterbject) {
			NotificationChain msgs = null;
			if (parameterbject != null)
				msgs = ((InternalEObject)parameterbject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERBJECT, null, msgs);
			if (newParameterbject != null)
				msgs = ((InternalEObject)newParameterbject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERBJECT, null, msgs);
			msgs = basicSetParameterbject(newParameterbject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERBJECT, newParameterbject, newParameterbject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERBJECT:
				return basicSetParameterbject(null, msgs);
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
			case OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__NAME:
				return getName();
			case OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERBJECT:
				return getParameterbject();
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
			case OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__NAME:
				setName((String)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERBJECT:
				setParameterbject((ParameterObject)newValue);
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
			case OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERBJECT:
				setParameterbject((ParameterObject)null);
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
			case OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS__PARAMETERBJECT:
				return parameterbject != null;
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
