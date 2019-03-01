/**
 */
package canopus;

import canopus.canopusPerformanceScenario.Scripting;
import canopus.canopusPerformanceScenario.Teste1;
import canopus.canopusPerformanceScenario.Teste1E2;
import canopus.canopusPerformanceScenario.Teste2;
import canopus.canopusPerformanceScenario.UserProfile;
import canopus.canopusPerformanceScenario.UserProfileToScript;
import canopus.canopusPerformanceScenario.Workload;

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
 *   <li>{@link canopus.Scenario#getUsers <em>Users</em>}</li>
 *   <li>{@link canopus.Scenario#getWorkloads <em>Workloads</em>}</li>
 *   <li>{@link canopus.Scenario#getScripting <em>Scripting</em>}</li>
 *   <li>{@link canopus.Scenario#getTeste1 <em>Teste1</em>}</li>
 *   <li>{@link canopus.Scenario#getTeste2 <em>Teste2</em>}</li>
 *   <li>{@link canopus.Scenario#getTeste1e2 <em>Teste1e2</em>}</li>
 *   <li>{@link canopus.Scenario#getUserProfileToScript <em>User Profile To Script</em>}</li>
 * </ul>
 *
 * @see canopus.CanopusPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends Diagram {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.UserProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScenario_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserProfile> getUsers();

	/**
	 * Returns the value of the '<em><b>Workloads</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.Workload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workloads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workloads</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScenario_Workloads()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<Workload> getWorkloads();

	/**
	 * Returns the value of the '<em><b>Scripting</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.Scripting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripting</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripting</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScenario_Scripting()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scripting> getScripting();

	/**
	 * Returns the value of the '<em><b>Teste1</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.Teste1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teste1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teste1</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScenario_Teste1()
	 * @model containment="true"
	 * @generated
	 */
	EList<Teste1> getTeste1();

	/**
	 * Returns the value of the '<em><b>Teste2</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.Teste2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teste2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teste2</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScenario_Teste2()
	 * @model containment="true"
	 * @generated
	 */
	EList<Teste2> getTeste2();

	/**
	 * Returns the value of the '<em><b>Teste1e2</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.Teste1E2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teste1e2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teste1e2</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScenario_Teste1e2()
	 * @model containment="true"
	 * @generated
	 */
	EList<Teste1E2> getTeste1e2();

	/**
	 * Returns the value of the '<em><b>User Profile To Script</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.UserProfileToScript}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Profile To Script</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Profile To Script</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScenario_UserProfileToScript()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserProfileToScript> getUserProfileToScript();

} // Scenario
