/**
 */
package canopus.canopusPerformanceScenario.impl;

import canopus.canopusPerformanceScenario.Association;
import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;
import canopus.canopusPerformanceScenario.ScriptModel;
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
 *   <li>{@link canopus.canopusPerformanceScenario.impl.AssociationImpl#getUserProfile <em>User Profile</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.AssociationImpl#getScriptmodel <em>Scriptmodel</em>}</li>
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
	 * The cached value of the '{@link #getUserProfile() <em>User Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserProfile()
	 * @generated
	 * @ordered
	 */
	protected UserProfile userProfile;

	/**
	 * The cached value of the '{@link #getScriptmodel() <em>Scriptmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptmodel()
	 * @generated
	 * @ordered
	 */
	protected ScriptModel scriptmodel;

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
	public UserProfile getUserProfile() {
		if (userProfile != null && userProfile.eIsProxy()) {
			InternalEObject oldUserProfile = (InternalEObject)userProfile;
			userProfile = (UserProfile)eResolveProxy(oldUserProfile);
			if (userProfile != oldUserProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScenarioPackage.ASSOCIATION__USER_PROFILE, oldUserProfile, userProfile));
			}
		}
		return userProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfile basicGetUserProfile() {
		return userProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserProfile(UserProfile newUserProfile) {
		UserProfile oldUserProfile = userProfile;
		userProfile = newUserProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.ASSOCIATION__USER_PROFILE, oldUserProfile, userProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptModel getScriptmodel() {
		if (scriptmodel != null && scriptmodel.eIsProxy()) {
			InternalEObject oldScriptmodel = (InternalEObject)scriptmodel;
			scriptmodel = (ScriptModel)eResolveProxy(oldScriptmodel);
			if (scriptmodel != oldScriptmodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScenarioPackage.ASSOCIATION__SCRIPTMODEL, oldScriptmodel, scriptmodel));
			}
		}
		return scriptmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptModel basicGetScriptmodel() {
		return scriptmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptmodel(ScriptModel newScriptmodel) {
		ScriptModel oldScriptmodel = scriptmodel;
		scriptmodel = newScriptmodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.ASSOCIATION__SCRIPTMODEL, oldScriptmodel, scriptmodel));
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
			case CanopusPerformanceScenarioPackage.ASSOCIATION__USER_PROFILE:
				if (resolve) return getUserProfile();
				return basicGetUserProfile();
			case CanopusPerformanceScenarioPackage.ASSOCIATION__SCRIPTMODEL:
				if (resolve) return getScriptmodel();
				return basicGetScriptmodel();
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
			case CanopusPerformanceScenarioPackage.ASSOCIATION__USER_PROFILE:
				setUserProfile((UserProfile)newValue);
				return;
			case CanopusPerformanceScenarioPackage.ASSOCIATION__SCRIPTMODEL:
				setScriptmodel((ScriptModel)newValue);
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
			case CanopusPerformanceScenarioPackage.ASSOCIATION__USER_PROFILE:
				setUserProfile((UserProfile)null);
				return;
			case CanopusPerformanceScenarioPackage.ASSOCIATION__SCRIPTMODEL:
				setScriptmodel((ScriptModel)null);
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
			case CanopusPerformanceScenarioPackage.ASSOCIATION__USER_PROFILE:
				return userProfile != null;
			case CanopusPerformanceScenarioPackage.ASSOCIATION__SCRIPTMODEL:
				return scriptmodel != null;
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
