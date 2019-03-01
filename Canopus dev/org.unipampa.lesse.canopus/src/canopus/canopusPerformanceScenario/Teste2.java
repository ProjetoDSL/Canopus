/**
 */
package canopus.canopusPerformanceScenario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teste2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.Teste2#getTeste1e2 <em>Teste1e2</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getTeste2()
 * @model
 * @generated
 */
public interface Teste2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Teste1e2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link canopus.canopusPerformanceScenario.Teste1E2#getTeste2 <em>Teste2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teste1e2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teste1e2</em>' reference.
	 * @see #setTeste1e2(Teste1E2)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getTeste2_Teste1e2()
	 * @see canopus.canopusPerformanceScenario.Teste1E2#getTeste2
	 * @model opposite="teste2" required="true"
	 * @generated
	 */
	Teste1E2 getTeste1e2();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Teste2#getTeste1e2 <em>Teste1e2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teste1e2</em>' reference.
	 * @see #getTeste1e2()
	 * @generated
	 */
	void setTeste1e2(Teste1E2 value);

} // Teste2
