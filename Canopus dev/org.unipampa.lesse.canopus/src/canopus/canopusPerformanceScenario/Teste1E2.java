/**
 */
package canopus.canopusPerformanceScenario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teste1 E2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.Teste1E2#getPorcentagem <em>Porcentagem</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Teste1E2#getTeste1 <em>Teste1</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Teste1E2#getTeste2 <em>Teste2</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getTeste1E2()
 * @model
 * @generated
 */
public interface Teste1E2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Porcentagem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porcentagem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porcentagem</em>' attribute.
	 * @see #setPorcentagem(int)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getTeste1E2_Porcentagem()
	 * @model
	 * @generated
	 */
	int getPorcentagem();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Teste1E2#getPorcentagem <em>Porcentagem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porcentagem</em>' attribute.
	 * @see #getPorcentagem()
	 * @generated
	 */
	void setPorcentagem(int value);

	/**
	 * Returns the value of the '<em><b>Teste1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link canopus.canopusPerformanceScenario.Teste1#getTeste1e2 <em>Teste1e2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teste1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teste1</em>' reference.
	 * @see #setTeste1(Teste1)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getTeste1E2_Teste1()
	 * @see canopus.canopusPerformanceScenario.Teste1#getTeste1e2
	 * @model opposite="teste1e2" required="true"
	 * @generated
	 */
	Teste1 getTeste1();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Teste1E2#getTeste1 <em>Teste1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teste1</em>' reference.
	 * @see #getTeste1()
	 * @generated
	 */
	void setTeste1(Teste1 value);

	/**
	 * Returns the value of the '<em><b>Teste2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link canopus.canopusPerformanceScenario.Teste2#getTeste1e2 <em>Teste1e2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teste2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teste2</em>' reference.
	 * @see #setTeste2(Teste2)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getTeste1E2_Teste2()
	 * @see canopus.canopusPerformanceScenario.Teste2#getTeste1e2
	 * @model opposite="teste1e2" required="true"
	 * @generated
	 */
	Teste2 getTeste2();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Teste1E2#getTeste2 <em>Teste2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teste2</em>' reference.
	 * @see #getTeste2()
	 * @generated
	 */
	void setTeste2(Teste2 value);

} // Teste1E2
