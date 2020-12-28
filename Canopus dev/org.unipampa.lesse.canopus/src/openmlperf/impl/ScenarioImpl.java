/**
 */
package openmlperf.impl;

import java.util.Collection;

import openmlperf.OpenmlperfPackage;
import openmlperf.Scenario;

import openmlperf.openmlperfPerformanceScenario.Scripting;
import openmlperf.openmlperfPerformanceScenario.UserProfile;
import openmlperf.openmlperfPerformanceScenario.UserProfileToScript;
import openmlperf.openmlperfPerformanceScenario.Workload;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.impl.ScenarioImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link openmlperf.impl.ScenarioImpl#getWorkloads <em>Workloads</em>}</li>
 *   <li>{@link openmlperf.impl.ScenarioImpl#getScripting <em>Scripting</em>}</li>
 *   <li>{@link openmlperf.impl.ScenarioImpl#getUserProfileToScript <em>User Profile To Script</em>}</li>
 *   <li>{@link openmlperf.impl.ScenarioImpl#getBaseURL <em>Base URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends DiagramImpl implements Scenario {
	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<UserProfile> users;

	/**
	 * The cached value of the '{@link #getWorkloads() <em>Workloads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkloads()
	 * @generated
	 * @ordered
	 */
	protected EList<Workload> workloads;

	/**
	 * The cached value of the '{@link #getScripting() <em>Scripting</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScripting()
	 * @generated
	 * @ordered
	 */
	protected EList<Scripting> scripting;

	/**
	 * The cached value of the '{@link #getUserProfileToScript() <em>User Profile To Script</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserProfileToScript()
	 * @generated
	 * @ordered
	 */
	protected EList<UserProfileToScript> userProfileToScript;

	/**
	 * The default value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected String baseURL = BASE_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenmlperfPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfile> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<UserProfile>(UserProfile.class, this, OpenmlperfPackage.SCENARIO__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workload> getWorkloads() {
		if (workloads == null) {
			workloads = new EObjectContainmentEList<Workload>(Workload.class, this, OpenmlperfPackage.SCENARIO__WORKLOADS);
		}
		return workloads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scripting> getScripting() {
		if (scripting == null) {
			scripting = new EObjectContainmentEList<Scripting>(Scripting.class, this, OpenmlperfPackage.SCENARIO__SCRIPTING);
		}
		return scripting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfileToScript> getUserProfileToScript() {
		if (userProfileToScript == null) {
			userProfileToScript = new EObjectContainmentEList<UserProfileToScript>(UserProfileToScript.class, this, OpenmlperfPackage.SCENARIO__USER_PROFILE_TO_SCRIPT);
		}
		return userProfileToScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseURL() {
		return baseURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseURL(String newBaseURL) {
		String oldBaseURL = baseURL;
		baseURL = newBaseURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPackage.SCENARIO__BASE_URL, oldBaseURL, baseURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenmlperfPackage.SCENARIO__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case OpenmlperfPackage.SCENARIO__WORKLOADS:
				return ((InternalEList<?>)getWorkloads()).basicRemove(otherEnd, msgs);
			case OpenmlperfPackage.SCENARIO__SCRIPTING:
				return ((InternalEList<?>)getScripting()).basicRemove(otherEnd, msgs);
			case OpenmlperfPackage.SCENARIO__USER_PROFILE_TO_SCRIPT:
				return ((InternalEList<?>)getUserProfileToScript()).basicRemove(otherEnd, msgs);
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
			case OpenmlperfPackage.SCENARIO__USERS:
				return getUsers();
			case OpenmlperfPackage.SCENARIO__WORKLOADS:
				return getWorkloads();
			case OpenmlperfPackage.SCENARIO__SCRIPTING:
				return getScripting();
			case OpenmlperfPackage.SCENARIO__USER_PROFILE_TO_SCRIPT:
				return getUserProfileToScript();
			case OpenmlperfPackage.SCENARIO__BASE_URL:
				return getBaseURL();
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
			case OpenmlperfPackage.SCENARIO__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends UserProfile>)newValue);
				return;
			case OpenmlperfPackage.SCENARIO__WORKLOADS:
				getWorkloads().clear();
				getWorkloads().addAll((Collection<? extends Workload>)newValue);
				return;
			case OpenmlperfPackage.SCENARIO__SCRIPTING:
				getScripting().clear();
				getScripting().addAll((Collection<? extends Scripting>)newValue);
				return;
			case OpenmlperfPackage.SCENARIO__USER_PROFILE_TO_SCRIPT:
				getUserProfileToScript().clear();
				getUserProfileToScript().addAll((Collection<? extends UserProfileToScript>)newValue);
				return;
			case OpenmlperfPackage.SCENARIO__BASE_URL:
				setBaseURL((String)newValue);
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
			case OpenmlperfPackage.SCENARIO__USERS:
				getUsers().clear();
				return;
			case OpenmlperfPackage.SCENARIO__WORKLOADS:
				getWorkloads().clear();
				return;
			case OpenmlperfPackage.SCENARIO__SCRIPTING:
				getScripting().clear();
				return;
			case OpenmlperfPackage.SCENARIO__USER_PROFILE_TO_SCRIPT:
				getUserProfileToScript().clear();
				return;
			case OpenmlperfPackage.SCENARIO__BASE_URL:
				setBaseURL(BASE_URL_EDEFAULT);
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
			case OpenmlperfPackage.SCENARIO__USERS:
				return users != null && !users.isEmpty();
			case OpenmlperfPackage.SCENARIO__WORKLOADS:
				return workloads != null && !workloads.isEmpty();
			case OpenmlperfPackage.SCENARIO__SCRIPTING:
				return scripting != null && !scripting.isEmpty();
			case OpenmlperfPackage.SCENARIO__USER_PROFILE_TO_SCRIPT:
				return userProfileToScript != null && !userProfileToScript.isEmpty();
			case OpenmlperfPackage.SCENARIO__BASE_URL:
				return BASE_URL_EDEFAULT == null ? baseURL != null : !BASE_URL_EDEFAULT.equals(baseURL);
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
		result.append(" (baseURL: ");
		result.append(baseURL);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
