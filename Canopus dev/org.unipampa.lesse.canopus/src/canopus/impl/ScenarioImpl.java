/**
 */
package canopus.impl;

import canopus.CanopusPackage;
import canopus.Scenario;

import canopus.canopusPerformanceScenario.Scripting;
import canopus.canopusPerformanceScenario.UserProfile;
import canopus.canopusPerformanceScenario.UserProfileToScript;
import canopus.canopusPerformanceScenario.Workload;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link canopus.impl.ScenarioImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link canopus.impl.ScenarioImpl#getWorkloads <em>Workloads</em>}</li>
 *   <li>{@link canopus.impl.ScenarioImpl#getScripting <em>Scripting</em>}</li>
 *   <li>{@link canopus.impl.ScenarioImpl#getUserProfileToScript <em>User Profile To Script</em>}</li>
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
		return CanopusPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserProfile> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<UserProfile>(UserProfile.class, this, CanopusPackage.SCENARIO__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Workload> getWorkloads() {
		if (workloads == null) {
			workloads = new EObjectContainmentEList<Workload>(Workload.class, this, CanopusPackage.SCENARIO__WORKLOADS);
		}
		return workloads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scripting> getScripting() {
		if (scripting == null) {
			scripting = new EObjectContainmentEList<Scripting>(Scripting.class, this, CanopusPackage.SCENARIO__SCRIPTING);
		}
		return scripting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserProfileToScript> getUserProfileToScript() {
		if (userProfileToScript == null) {
			userProfileToScript = new EObjectContainmentEList<UserProfileToScript>(UserProfileToScript.class, this, CanopusPackage.SCENARIO__USER_PROFILE_TO_SCRIPT);
		}
		return userProfileToScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPackage.SCENARIO__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case CanopusPackage.SCENARIO__WORKLOADS:
				return ((InternalEList<?>)getWorkloads()).basicRemove(otherEnd, msgs);
			case CanopusPackage.SCENARIO__SCRIPTING:
				return ((InternalEList<?>)getScripting()).basicRemove(otherEnd, msgs);
			case CanopusPackage.SCENARIO__USER_PROFILE_TO_SCRIPT:
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
			case CanopusPackage.SCENARIO__USERS:
				return getUsers();
			case CanopusPackage.SCENARIO__WORKLOADS:
				return getWorkloads();
			case CanopusPackage.SCENARIO__SCRIPTING:
				return getScripting();
			case CanopusPackage.SCENARIO__USER_PROFILE_TO_SCRIPT:
				return getUserProfileToScript();
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
			case CanopusPackage.SCENARIO__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends UserProfile>)newValue);
				return;
			case CanopusPackage.SCENARIO__WORKLOADS:
				getWorkloads().clear();
				getWorkloads().addAll((Collection<? extends Workload>)newValue);
				return;
			case CanopusPackage.SCENARIO__SCRIPTING:
				getScripting().clear();
				getScripting().addAll((Collection<? extends Scripting>)newValue);
				return;
			case CanopusPackage.SCENARIO__USER_PROFILE_TO_SCRIPT:
				getUserProfileToScript().clear();
				getUserProfileToScript().addAll((Collection<? extends UserProfileToScript>)newValue);
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
			case CanopusPackage.SCENARIO__USERS:
				getUsers().clear();
				return;
			case CanopusPackage.SCENARIO__WORKLOADS:
				getWorkloads().clear();
				return;
			case CanopusPackage.SCENARIO__SCRIPTING:
				getScripting().clear();
				return;
			case CanopusPackage.SCENARIO__USER_PROFILE_TO_SCRIPT:
				getUserProfileToScript().clear();
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
			case CanopusPackage.SCENARIO__USERS:
				return users != null && !users.isEmpty();
			case CanopusPackage.SCENARIO__WORKLOADS:
				return workloads != null && !workloads.isEmpty();
			case CanopusPackage.SCENARIO__SCRIPTING:
				return scripting != null && !scripting.isEmpty();
			case CanopusPackage.SCENARIO__USER_PROFILE_TO_SCRIPT:
				return userProfileToScript != null && !userProfileToScript.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScenarioImpl
