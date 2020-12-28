/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ramp Up Users</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpUsers#getVirtualUsers <em>Virtual Users</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadPackage#getRampUpUsers()
 * @model
 * @generated
 */
public interface RampUpUsers extends EObject {
	/**
	 * Returns the value of the '<em><b>Virtual Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Users</em>' attribute.
	 * @see #setVirtualUsers(int)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadPackage#getRampUpUsers_VirtualUsers()
	 * @model
	 * @generated
	 */
	int getVirtualUsers();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpUsers#getVirtualUsers <em>Virtual Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Users</em>' attribute.
	 * @see #getVirtualUsers()
	 * @generated
	 */
	void setVirtualUsers(int value);

} // RampUpUsers
