/**
 */
package openmlperf;

import openmlperf.openmlperfPerformanceScenario.Scripting;
import openmlperf.openmlperfPerformanceScenario.UserProfile;
import openmlperf.openmlperfPerformanceScenario.UserProfileToScript;
import openmlperf.openmlperfPerformanceScenario.Workload;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.Scenario#getUsers <em>Users</em>}</li>
 *   <li>{@link openmlperf.Scenario#getWorkloads <em>Workloads</em>}</li>
 *   <li>{@link openmlperf.Scenario#getScripting <em>Scripting</em>}</li>
 *   <li>{@link openmlperf.Scenario#getUserProfileToScript <em>User Profile To Script</em>}</li>
 *   <li>{@link openmlperf.Scenario#getBaseURL <em>Base URL</em>}</li>
 * </ul>
 *
 * @see openmlperf.OpenmlperfPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends Diagram {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.UserProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see openmlperf.OpenmlperfPackage#getScenario_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserProfile> getUsers();

	/**
	 * Returns the value of the '<em><b>Workloads</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.Workload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workloads</em>' containment reference list.
	 * @see openmlperf.OpenmlperfPackage#getScenario_Workloads()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<Workload> getWorkloads();

	/**
	 * Returns the value of the '<em><b>Scripting</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.Scripting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripting</em>' containment reference list.
	 * @see openmlperf.OpenmlperfPackage#getScenario_Scripting()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scripting> getScripting();

	/**
	 * Returns the value of the '<em><b>User Profile To Script</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.UserProfileToScript}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Profile To Script</em>' containment reference list.
	 * @see openmlperf.OpenmlperfPackage#getScenario_UserProfileToScript()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserProfileToScript> getUserProfileToScript();

	/**
	 * Returns the value of the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URL</em>' attribute.
	 * @see #setBaseURL(String)
	 * @see openmlperf.OpenmlperfPackage#getScenario_BaseURL()
	 * @model
	 * @generated
	 */
	String getBaseURL();

	/**
	 * Sets the value of the '{@link openmlperf.Scenario#getBaseURL <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URL</em>' attribute.
	 * @see #getBaseURL()
	 * @generated
	 */
	void setBaseURL(String value);

} // Scenario
