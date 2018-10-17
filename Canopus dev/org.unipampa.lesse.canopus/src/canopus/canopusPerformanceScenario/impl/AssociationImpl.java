/**
 */
package canopus.canopusPerformanceScenario.impl;

import canopus.canopusPerformanceScenario.Association;
import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;
import canopus.canopusPerformanceScenario.Script;
import canopus.canopusPerformanceScenario.UserProfile;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.AssociationImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.AssociationImpl#getUserprofile <em>Userprofile</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.AssociationImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends MinimalEObjectImpl.Container implements Association {
	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final int PERCENTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected int percentage = PERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserprofile() <em>Userprofile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserprofile()
	 * @generated
	 * @ordered
	 */
	protected UserProfile userprofile;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected Script script;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScenarioPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentage(int newPercentage) {
		int oldPercentage = percentage;
		percentage = newPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.ASSOCIATION__PERCENTAGE, oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfile getUserprofile() {
		if (userprofile != null && userprofile.eIsProxy()) {
			InternalEObject oldUserprofile = (InternalEObject)userprofile;
			userprofile = (UserProfile)eResolveProxy(oldUserprofile);
			if (userprofile != oldUserprofile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScenarioPackage.ASSOCIATION__USERPROFILE, oldUserprofile, userprofile));
			}
		}
		return userprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfile basicGetUserprofile() {
		return userprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserprofile(UserProfile newUserprofile) {
		UserProfile oldUserprofile = userprofile;
		userprofile = newUserprofile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.ASSOCIATION__USERPROFILE, oldUserprofile, userprofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script getScript() {
		if (script != null && script.eIsProxy()) {
			InternalEObject oldScript = (InternalEObject)script;
			script = (Script)eResolveProxy(oldScript);
			if (script != oldScript) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScenarioPackage.ASSOCIATION__SCRIPT, oldScript, script));
			}
		}
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script basicGetScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(Script newScript) {
		Script oldScript = script;
		script = newScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.ASSOCIATION__SCRIPT, oldScript, script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceScenarioPackage.ASSOCIATION__PERCENTAGE:
				return getPercentage();
			case CanopusPerformanceScenarioPackage.ASSOCIATION__USERPROFILE:
				if (resolve) return getUserprofile();
				return basicGetUserprofile();
			case CanopusPerformanceScenarioPackage.ASSOCIATION__SCRIPT:
				if (resolve) return getScript();
				return basicGetScript();
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
			case CanopusPerformanceScenarioPackage.ASSOCIATION__PERCENTAGE:
				setPercentage((Integer)newValue);
				return;
			case CanopusPerformanceScenarioPackage.ASSOCIATION__USERPROFILE:
				setUserprofile((UserProfile)newValue);
				return;
			case CanopusPerformanceScenarioPackage.ASSOCIATION__SCRIPT:
				setScript((Script)newValue);
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
			case CanopusPerformanceScenarioPackage.ASSOCIATION__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
				return;
			case CanopusPerformanceScenarioPackage.ASSOCIATION__USERPROFILE:
				setUserprofile((UserProfile)null);
				return;
			case CanopusPerformanceScenarioPackage.ASSOCIATION__SCRIPT:
				setScript((Script)null);
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
			case CanopusPerformanceScenarioPackage.ASSOCIATION__PERCENTAGE:
				return percentage != PERCENTAGE_EDEFAULT;
			case CanopusPerformanceScenarioPackage.ASSOCIATION__USERPROFILE:
				return userprofile != null;
			case CanopusPerformanceScenarioPackage.ASSOCIATION__SCRIPT:
				return script != null;
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
		result.append(" (percentage: ");
		result.append(percentage);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
