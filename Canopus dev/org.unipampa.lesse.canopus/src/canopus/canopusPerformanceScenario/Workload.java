/**
 */
package canopus.canopusPerformanceScenario;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.Workload#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload()
 * @model
 * @generated
 */
public interface Workload extends EObject {
	/**
	 * Returns the value of the '<em><b>Workload</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload</em>' containment reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getWorkload_Workload()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WorkloadModel> getWorkload();

} // Workload
