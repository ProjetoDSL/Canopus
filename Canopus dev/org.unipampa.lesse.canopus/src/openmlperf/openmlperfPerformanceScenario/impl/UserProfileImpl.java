/**
 */
package openmlperf.openmlperfPerformanceScenario.impl;

import java.util.Collection;

import openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage;
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
 * An implementation of the model object '<em><b>User Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.UserProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.UserProfileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.UserProfileImpl#getUserprofiletoscript <em>Userprofiletoscript</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.UserProfileImpl#getPercentage <em>Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserProfileImpl extends MinimalEObjectImpl.Container implements UserProfile {
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
	 * The cached value of the '{@link #getUserprofiletoscript() <em>Userprofiletoscript</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserprofiletoscript()
	 * @generated
	 * @ordered
	 */
	protected EList<UserProfileToScript> userprofiletoscript;

	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final String PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected String percentage = PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenmlperfPerformanceScenarioPackage.Literals.USER_PROFILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScenarioPackage.USER_PROFILE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScenarioPackage.USER_PROFILE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfileToScript> getUserprofiletoscript() {
		if (userprofiletoscript == null) {
			userprofiletoscript = new EObjectWithInverseResolvingEList.ManyInverse<UserProfileToScript>(UserProfileToScript.class, this, OpenmlperfPerformanceScenarioPackage.USER_PROFILE__USERPROFILETOSCRIPT, OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__USERPROFILE);
		}
		return userprofiletoscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentage(String newPercentage) {
		String oldPercentage = percentage;
		percentage = newPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScenarioPackage.USER_PROFILE__PERCENTAGE, oldPercentage, percentage));
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
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__USERPROFILETOSCRIPT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserprofiletoscript()).basicAdd(otherEnd, msgs);
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
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__USERPROFILETOSCRIPT:
				return ((InternalEList<?>)getUserprofiletoscript()).basicRemove(otherEnd, msgs);
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
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__NAME:
				return getName();
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__DESCRIPTION:
				return getDescription();
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__USERPROFILETOSCRIPT:
				return getUserprofiletoscript();
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__PERCENTAGE:
				return getPercentage();
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
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__NAME:
				setName((String)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__USERPROFILETOSCRIPT:
				getUserprofiletoscript().clear();
				getUserprofiletoscript().addAll((Collection<? extends UserProfileToScript>)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__PERCENTAGE:
				setPercentage((String)newValue);
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
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__USERPROFILETOSCRIPT:
				getUserprofiletoscript().clear();
				return;
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
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
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__USERPROFILETOSCRIPT:
				return userprofiletoscript != null && !userprofiletoscript.isEmpty();
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE__PERCENTAGE:
				return PERCENTAGE_EDEFAULT == null ? percentage != null : !PERCENTAGE_EDEFAULT.equals(percentage);
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
		result.append(", percentage: ");
		result.append(percentage);
		result.append(')');
		return result.toString();
	}

} //UserProfileImpl
