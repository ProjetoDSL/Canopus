/**
 */
package canopus;

import canopus.canopusPerformanceScenario.Association;
import canopus.canopusPerformanceScenario.ScriptModel;
import canopus.canopusPerformanceScenario.UserProfile;
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
 *   <li>{@link canopus.Scenario#getAssociations <em>Associations</em>}</li>
 *   <li>{@link canopus.Scenario#getScriptmodel <em>Scriptmodel</em>}</li>
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
	 * @model containment="true"
	 * @generated
	 */
	EList<Workload> getWorkloads();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScenario_Associations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociations();

	/**
	 * Returns the value of the '<em><b>Scriptmodel</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.ScriptModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scriptmodel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scriptmodel</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScenario_Scriptmodel()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScriptModel> getScriptmodel();

} // Scenario
