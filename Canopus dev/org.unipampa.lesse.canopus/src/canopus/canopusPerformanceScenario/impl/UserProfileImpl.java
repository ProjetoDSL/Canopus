/**
 */
package canopus.canopusPerformanceScenario.impl;

import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;
import canopus.canopusPerformanceScenario.Scripting;
import canopus.canopusPerformanceScenario.UserProfile;

import java.util.Collection;

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
 *   <li>{@link canopus.canopusPerformanceScenario.impl.UserProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.UserProfileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.UserProfileImpl#getPercentageTotal <em>Percentage Total</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.UserProfileImpl#getPercentageScript <em>Percentage Script</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.UserProfileImpl#getScripting <em>Scripting</em>}</li>
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
	 * The default value of the '{@link #getPercentageTotal() <em>Percentage Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageTotal()
	 * @generated
	 * @ordered
	 */
	protected static final int PERCENTAGE_TOTAL_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getPercentageTotal() <em>Percentage Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageTotal()
	 * @generated
	 * @ordered
	 */
	protected int percentageTotal = PERCENTAGE_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentageScript() <em>Percentage Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageScript()
	 * @generated
	 * @ordered
	 */
	protected static final int PERCENTAGE_SCRIPT_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getPercentageScript() <em>Percentage Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageScript()
	 * @generated
	 * @ordered
	 */
	protected int percentageScript = PERCENTAGE_SCRIPT_EDEFAULT;

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
		return CanopusPerformanceScenarioPackage.Literals.USER_PROFILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.USER_PROFILE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.USER_PROFILE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPercentageTotal() {
		return percentageTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPercentageScript() {
		return percentageScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scripting> getScripting() {
		if (scripting == null) {
			scripting = new EObjectWithInverseResolvingEList<Scripting>(Scripting.class, this, CanopusPerformanceScenarioPackage.USER_PROFILE__SCRIPTING, CanopusPerformanceScenarioPackage.SCRIPTING__USERPROFILE);
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
			case CanopusPerformanceScenarioPackage.USER_PROFILE__SCRIPTING:
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
			case CanopusPerformanceScenarioPackage.USER_PROFILE__SCRIPTING:
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
			case CanopusPerformanceScenarioPackage.USER_PROFILE__NAME:
				return getName();
			case CanopusPerformanceScenarioPackage.USER_PROFILE__DESCRIPTION:
				return getDescription();
			case CanopusPerformanceScenarioPackage.USER_PROFILE__PERCENTAGE_TOTAL:
				return getPercentageTotal();
			case CanopusPerformanceScenarioPackage.USER_PROFILE__PERCENTAGE_SCRIPT:
				return getPercentageScript();
			case CanopusPerformanceScenarioPackage.USER_PROFILE__SCRIPTING:
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
			case CanopusPerformanceScenarioPackage.USER_PROFILE__NAME:
				setName((String)newValue);
				return;
			case CanopusPerformanceScenarioPackage.USER_PROFILE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CanopusPerformanceScenarioPackage.USER_PROFILE__SCRIPTING:
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
			case CanopusPerformanceScenarioPackage.USER_PROFILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CanopusPerformanceScenarioPackage.USER_PROFILE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CanopusPerformanceScenarioPackage.USER_PROFILE__SCRIPTING:
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
			case CanopusPerformanceScenarioPackage.USER_PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CanopusPerformanceScenarioPackage.USER_PROFILE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CanopusPerformanceScenarioPackage.USER_PROFILE__PERCENTAGE_TOTAL:
				return percentageTotal != PERCENTAGE_TOTAL_EDEFAULT;
			case CanopusPerformanceScenarioPackage.USER_PROFILE__PERCENTAGE_SCRIPT:
				return percentageScript != PERCENTAGE_SCRIPT_EDEFAULT;
			case CanopusPerformanceScenarioPackage.USER_PROFILE__SCRIPTING:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", percentageTotal: ");
		result.append(percentageTotal);
		result.append(", percentageScript: ");
		result.append(percentageScript);
		result.append(')');
		return result.toString();
	}

} //UserProfileImpl
