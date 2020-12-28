/**
 */
package openmlperf.openmlperfPerformanceScenario.impl;

import java.util.Collection;

import openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage;
import openmlperf.openmlperfPerformanceScenario.Scripting;
import openmlperf.openmlperfPerformanceScenario.UserProfile;
import openmlperf.openmlperfPerformanceScenario.UserProfileToScript;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Profile To Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.UserProfileToScriptImpl#getTimePercentage <em>Time Percentage</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.UserProfileToScriptImpl#getUserprofile <em>Userprofile</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.UserProfileToScriptImpl#getScripting <em>Scripting</em>}</li>
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
	 * The cached value of the '{@link #getUserprofile() <em>Userprofile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserprofile()
	 * @generated
	 * @ordered
	 */
	protected EList<UserProfile> userprofile;

	/**
	 * The cached value of the '{@link #getScripting() <em>Scripting</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScripting()
	 * @generated
	 * @ordered
	 */
	protected EList<Scripting> scripting;

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
		return OpenmlperfPerformanceScenarioPackage.Literals.USER_PROFILE_TO_SCRIPT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__TIME_PERCENTAGE, oldTimePercentage, timePercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfile> getUserprofile() {
		if (userprofile == null) {
			userprofile = new EObjectWithInverseResolvingEList.ManyInverse<UserProfile>(UserProfile.class, this, OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE, OpenmlperfPerformanceScenarioPackage.USER_PROFILE__USERPROFILETOSCRIPT);
		}
		return userprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scripting> getScripting() {
		if (scripting == null) {
			scripting = new EObjectWithInverseResolvingEList.ManyInverse<Scripting>(Scripting.class, this, OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING, OpenmlperfPerformanceScenarioPackage.SCRIPTING__USERPROFILETOSCRIPT);
		}
		return scripting;
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
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserprofile()).basicAdd(otherEnd, msgs);
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScripting()).basicAdd(otherEnd, msgs);
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
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE:
				return ((InternalEList<?>)getUserprofile()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING:
				return ((InternalEList<?>)getScripting()).basicRemove(otherEnd, msgs);
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
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__TIME_PERCENTAGE:
				return getTimePercentage();
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE:
				return getUserprofile();
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING:
				return getScripting();
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
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__TIME_PERCENTAGE:
				setTimePercentage((Integer)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE:
				getUserprofile().clear();
				getUserprofile().addAll((Collection<? extends UserProfile>)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING:
				getScripting().clear();
				getScripting().addAll((Collection<? extends Scripting>)newValue);
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
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__TIME_PERCENTAGE:
				setTimePercentage(TIME_PERCENTAGE_EDEFAULT);
				return;
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE:
				getUserprofile().clear();
				return;
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING:
				getScripting().clear();
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
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__TIME_PERCENTAGE:
				return timePercentage != TIME_PERCENTAGE_EDEFAULT;
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE:
				return userprofile != null && !userprofile.isEmpty();
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING:
				return scripting != null && !scripting.isEmpty();
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
