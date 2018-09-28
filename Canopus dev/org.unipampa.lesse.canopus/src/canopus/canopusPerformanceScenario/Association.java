/**
 */
package canopus.canopusPerformanceScenario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.Association#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Association#getUserprofile <em>Userprofile</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Association#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(int)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getAssociation_Percentage()
	 * @model
	 * @generated
	 */
	int getPercentage();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Association#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(int value);

	/**
	 * Returns the value of the '<em><b>Userprofile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userprofile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userprofile</em>' reference.
	 * @see #setUserprofile(UserProfile)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getAssociation_Userprofile()
	 * @model
	 * @generated
	 */
	UserProfile getUserprofile();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Association#getUserprofile <em>Userprofile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userprofile</em>' reference.
	 * @see #getUserprofile()
	 * @generated
	 */
	void setUserprofile(UserProfile value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' reference.
	 * @see #setScript(Script)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getAssociation_Script()
	 * @model
	 * @generated
	 */
	Script getScript();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Association#getScript <em>Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Script value);

} // Association
