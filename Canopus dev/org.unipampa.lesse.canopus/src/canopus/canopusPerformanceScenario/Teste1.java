/**
 */
package canopus.canopusPerformanceScenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teste1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.Teste1#getTeste1e2 <em>Teste1e2</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getTeste1()
 * @model
 * @generated
 */
public interface Teste1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Teste1e2</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.Teste1E2}.
	 * It is bidirectional and its opposite is '{@link canopus.canopusPerformanceScenario.Teste1E2#getTeste1 <em>Teste1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teste1e2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teste1e2</em>' reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getTeste1_Teste1e2()
	 * @see canopus.canopusPerformanceScenario.Teste1E2#getTeste1
	 * @model opposite="teste1" required="true"
	 * @generated
	 */
	EList<Teste1E2> getTeste1e2();

} // Teste1
