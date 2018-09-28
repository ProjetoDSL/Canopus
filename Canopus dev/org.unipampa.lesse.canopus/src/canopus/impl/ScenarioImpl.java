/**
 */
package canopus.impl;

import canopus.CanopusPackage;
import canopus.Scenario;

import canopus.canopusPerformanceScenario.Association;
import canopus.canopusPerformanceScenario.Script;
import canopus.canopusPerformanceScenario.UserProfile;
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
 *   <li>{@link canopus.impl.ScenarioImpl#getAssociations <em>Associations</em>}</li>
 *   <li>{@link canopus.impl.ScenarioImpl#getScripts <em>Scripts</em>}</li>
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
	 * The cached value of the '{@link #getAssociations() <em>Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> associations;

	/**
	 * The cached value of the '{@link #getScripts() <em>Scripts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScripts()
	 * @generated
	 * @ordered
	 */
	protected EList<Script> scripts;

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
	public EList<Association> getAssociations() {
		if (associations == null) {
			associations = new EObjectContainmentEList<Association>(Association.class, this, CanopusPackage.SCENARIO__ASSOCIATIONS);
		}
		return associations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Script> getScripts() {
		if (scripts == null) {
			scripts = new EObjectContainmentEList<Script>(Script.class, this, CanopusPackage.SCENARIO__SCRIPTS);
		}
		return scripts;
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
			case CanopusPackage.SCENARIO__ASSOCIATIONS:
				return ((InternalEList<?>)getAssociations()).basicRemove(otherEnd, msgs);
			case CanopusPackage.SCENARIO__SCRIPTS:
				return ((InternalEList<?>)getScripts()).basicRemove(otherEnd, msgs);
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
			case CanopusPackage.SCENARIO__ASSOCIATIONS:
				return getAssociations();
			case CanopusPackage.SCENARIO__SCRIPTS:
				return getScripts();
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
			case CanopusPackage.SCENARIO__ASSOCIATIONS:
				getAssociations().clear();
				getAssociations().addAll((Collection<? extends Association>)newValue);
				return;
			case CanopusPackage.SCENARIO__SCRIPTS:
				getScripts().clear();
				getScripts().addAll((Collection<? extends Script>)newValue);
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
			case CanopusPackage.SCENARIO__ASSOCIATIONS:
				getAssociations().clear();
				return;
			case CanopusPackage.SCENARIO__SCRIPTS:
				getScripts().clear();
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
			case CanopusPackage.SCENARIO__ASSOCIATIONS:
				return associations != null && !associations.isEmpty();
			case CanopusPackage.SCENARIO__SCRIPTS:
				return scripts != null && !scripts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScenarioImpl
