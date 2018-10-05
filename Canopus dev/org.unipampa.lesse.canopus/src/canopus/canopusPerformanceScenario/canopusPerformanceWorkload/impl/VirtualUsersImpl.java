/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Users</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.VirtualUsersImpl#getVirtualUsers <em>Virtual Users</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualUsersImpl extends MinimalEObjectImpl.Container implements VirtualUsers {
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
	protected VirtualUsersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceWorkloadPackage.Literals.VIRTUAL_USERS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.VIRTUAL_USERS__VIRTUAL_USERS, oldVirtualUsers, virtualUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceWorkloadPackage.VIRTUAL_USERS__VIRTUAL_USERS:
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
			case CanopusPerformanceWorkloadPackage.VIRTUAL_USERS__VIRTUAL_USERS:
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
			case CanopusPerformanceWorkloadPackage.VIRTUAL_USERS__VIRTUAL_USERS:
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
			case CanopusPerformanceWorkloadPackage.VIRTUAL_USERS__VIRTUAL_USERS:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (virtualUsers: ");
		result.append(virtualUsers);
		result.append(')');
		return result.toString();
	}

} //VirtualUsersImpl
