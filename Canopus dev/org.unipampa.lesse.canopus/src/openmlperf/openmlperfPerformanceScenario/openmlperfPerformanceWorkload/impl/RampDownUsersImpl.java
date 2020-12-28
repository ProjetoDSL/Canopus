/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadPackage;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownUsers;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ramp Down Users</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampDownUsersImpl#getVirtualUsers <em>Virtual Users</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RampDownUsersImpl extends MinimalEObjectImpl.Container implements RampDownUsers {
	/**
	 * The default value of the '{@link #getVirtualUsers() <em>Virtual Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualUsers()
	 * @generated
	 * @ordered
	 */
	protected static final int VIRTUAL_USERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVirtualUsers() <em>Virtual Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualUsers()
	 * @generated
	 * @ordered
	 */
	protected int virtualUsers = VIRTUAL_USERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampDownUsersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenmlperfPerformanceWorkloadPackage.Literals.RAMP_DOWN_USERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVirtualUsers() {
		return virtualUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualUsers(int newVirtualUsers) {
		int oldVirtualUsers = virtualUsers;
		virtualUsers = newVirtualUsers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceWorkloadPackage.RAMP_DOWN_USERS__VIRTUAL_USERS, oldVirtualUsers, virtualUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenmlperfPerformanceWorkloadPackage.RAMP_DOWN_USERS__VIRTUAL_USERS:
				return getVirtualUsers();
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
			case OpenmlperfPerformanceWorkloadPackage.RAMP_DOWN_USERS__VIRTUAL_USERS:
				setVirtualUsers((Integer)newValue);
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
			case OpenmlperfPerformanceWorkloadPackage.RAMP_DOWN_USERS__VIRTUAL_USERS:
				setVirtualUsers(VIRTUAL_USERS_EDEFAULT);
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
			case OpenmlperfPerformanceWorkloadPackage.RAMP_DOWN_USERS__VIRTUAL_USERS:
				return virtualUsers != VIRTUAL_USERS_EDEFAULT;
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
		result.append(" (virtualUsers: ");
		result.append(virtualUsers);
		result.append(')');
		return result.toString();
	}

} //RampDownUsersImpl
