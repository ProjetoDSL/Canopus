/**
 */
package canopus.canopusPerformanceScenario.impl;

import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;
import canopus.canopusPerformanceScenario.Script;

import canopus.canopusPerformanceScripting.ScriptingModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptImpl#getScriptingmodel <em>Scriptingmodel</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptImpl#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script {
	/**
	 * The cached value of the '{@link #getScriptingmodel() <em>Scriptingmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptingmodel()
	 * @generated
	 * @ordered
	 */
	protected ScriptingModel scriptingmodel;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScenarioPackage.Literals.SCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptingModel getScriptingmodel() {
		if (scriptingmodel != null && scriptingmodel.eIsProxy()) {
			InternalEObject oldScriptingmodel = (InternalEObject)scriptingmodel;
			scriptingmodel = (ScriptingModel)eResolveProxy(oldScriptingmodel);
			if (scriptingmodel != oldScriptingmodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScenarioPackage.SCRIPT__SCRIPTINGMODEL, oldScriptingmodel, scriptingmodel));
			}
		}
		return scriptingmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptingModel basicGetScriptingmodel() {
		return scriptingmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptingmodel(ScriptingModel newScriptingmodel) {
		ScriptingModel oldScriptingmodel = scriptingmodel;
		scriptingmodel = newScriptingmodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPT__SCRIPTINGMODEL, oldScriptingmodel, scriptingmodel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceScenarioPackage.SCRIPT__SCRIPTINGMODEL:
				if (resolve) return getScriptingmodel();
				return basicGetScriptingmodel();
			case CanopusPerformanceScenarioPackage.SCRIPT__NAME:
				return getName();
			case CanopusPerformanceScenarioPackage.SCRIPT__DESCRIPTION:
				return getDescription();
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
			case CanopusPerformanceScenarioPackage.SCRIPT__SCRIPTINGMODEL:
				setScriptingmodel((ScriptingModel)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT__NAME:
				setName((String)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT__DESCRIPTION:
				setDescription((String)newValue);
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
			case CanopusPerformanceScenarioPackage.SCRIPT__SCRIPTINGMODEL:
				setScriptingmodel((ScriptingModel)null);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case CanopusPerformanceScenarioPackage.SCRIPT__SCRIPTINGMODEL:
				return scriptingmodel != null;
			case CanopusPerformanceScenarioPackage.SCRIPT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CanopusPerformanceScenarioPackage.SCRIPT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ScriptImpl
