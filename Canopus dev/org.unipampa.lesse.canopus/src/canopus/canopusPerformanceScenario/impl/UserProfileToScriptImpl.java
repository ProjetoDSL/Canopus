/**
 */
package canopus.canopusPerformanceScenario.impl;

import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;
import canopus.canopusPerformanceScenario.Scripting;
import canopus.canopusPerformanceScenario.UserProfile;
import canopus.canopusPerformanceScenario.UserProfileToScript;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Profile To Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.UserProfileToScriptImpl#getTimePercentage <em>Time Percentage</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.UserProfileToScriptImpl#getUserprofile <em>Userprofile</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.UserProfileToScriptImpl#getScripting <em>Scripting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserProfileToScriptImpl extends MinimalEObjectImpl.Container implements UserProfileToScript {
	/**
	 * The default value of the '{@link #getTimePercentage() <em>Time Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePercentage()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_PERCENTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimePercentage() <em>Time Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePercentage()
	 * @generated
	 * @ordered
	 */
	protected int timePercentage = TIME_PERCENTAGE_EDEFAULT;

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
	 * The cached value of the '{@link #getScripting() <em>Scripting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScripting()
	 * @generated
	 * @ordered
	 */
	protected Scripting scripting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserProfileToScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScenarioPackage.Literals.USER_PROFILE_TO_SCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimePercentage() {
		return timePercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePercentage(int newTimePercentage) {
		int oldTimePercentage = timePercentage;
		timePercentage = newTimePercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__TIME_PERCENTAGE, oldTimePercentage, timePercentage));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE, oldUserprofile, userprofile));
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
	public NotificationChain basicSetUserprofile(UserProfile newUserprofile, NotificationChain msgs) {
		UserProfile oldUserprofile = userprofile;
		userprofile = newUserprofile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE, oldUserprofile, newUserprofile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserprofile(UserProfile newUserprofile) {
		if (newUserprofile != userprofile) {
			NotificationChain msgs = null;
			if (userprofile != null)
				msgs = ((InternalEObject)userprofile).eInverseRemove(this, CanopusPerformanceScenarioPackage.USER_PROFILE__USERPROFILETOSCRIPT, UserProfile.class, msgs);
			if (newUserprofile != null)
				msgs = ((InternalEObject)newUserprofile).eInverseAdd(this, CanopusPerformanceScenarioPackage.USER_PROFILE__USERPROFILETOSCRIPT, UserProfile.class, msgs);
			msgs = basicSetUserprofile(newUserprofile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE, newUserprofile, newUserprofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scripting getScripting() {
		if (scripting != null && scripting.eIsProxy()) {
			InternalEObject oldScripting = (InternalEObject)scripting;
			scripting = (Scripting)eResolveProxy(oldScripting);
			if (scripting != oldScripting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING, oldScripting, scripting));
			}
		}
		return scripting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scripting basicGetScripting() {
		return scripting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScripting(Scripting newScripting, NotificationChain msgs) {
		Scripting oldScripting = scripting;
		scripting = newScripting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING, oldScripting, newScripting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScripting(Scripting newScripting) {
		if (newScripting != scripting) {
			NotificationChain msgs = null;
			if (scripting != null)
				msgs = ((InternalEObject)scripting).eInverseRemove(this, CanopusPerformanceScenarioPackage.SCRIPTING__USERPROFILETOSCRIPT, Scripting.class, msgs);
			if (newScripting != null)
				msgs = ((InternalEObject)newScripting).eInverseAdd(this, CanopusPerformanceScenarioPackage.SCRIPTING__USERPROFILETOSCRIPT, Scripting.class, msgs);
			msgs = basicSetScripting(newScripting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING, newScripting, newScripting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE:
				if (userprofile != null)
					msgs = ((InternalEObject)userprofile).eInverseRemove(this, CanopusPerformanceScenarioPackage.USER_PROFILE__USERPROFILETOSCRIPT, UserProfile.class, msgs);
				return basicSetUserprofile((UserProfile)otherEnd, msgs);
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING:
				if (scripting != null)
					msgs = ((InternalEObject)scripting).eInverseRemove(this, CanopusPerformanceScenarioPackage.SCRIPTING__USERPROFILETOSCRIPT, Scripting.class, msgs);
				return basicSetScripting((Scripting)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE:
				return basicSetUserprofile(null, msgs);
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING:
				return basicSetScripting(null, msgs);
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
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__TIME_PERCENTAGE:
				return getTimePercentage();
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE:
				if (resolve) return getUserprofile();
				return basicGetUserprofile();
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING:
				if (resolve) return getScripting();
				return basicGetScripting();
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
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__TIME_PERCENTAGE:
				setTimePercentage((Integer)newValue);
				return;
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE:
				setUserprofile((UserProfile)newValue);
				return;
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING:
				setScripting((Scripting)newValue);
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
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__TIME_PERCENTAGE:
				setTimePercentage(TIME_PERCENTAGE_EDEFAULT);
				return;
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE:
				setUserprofile((UserProfile)null);
				return;
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING:
				setScripting((Scripting)null);
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
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__TIME_PERCENTAGE:
				return timePercentage != TIME_PERCENTAGE_EDEFAULT;
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE:
				return userprofile != null;
			case CanopusPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING:
				return scripting != null;
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
		result.append(" (timePercentage: ");
		result.append(timePercentage);
		result.append(')');
		return result.toString();
	}

} //UserProfileToScriptImpl
