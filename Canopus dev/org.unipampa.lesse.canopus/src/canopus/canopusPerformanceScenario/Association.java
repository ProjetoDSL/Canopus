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
 *   <li>{@link canopus.canopusPerformanceScenario.Association#getUserProfile <em>User Profile</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Association#getScriptmodel <em>Scriptmodel</em>}</li>
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
	 * Returns the value of the '<em><b>User Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Profile</em>' reference.
	 * @see #setUserProfile(UserProfile)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getAssociation_UserProfile()
	 * @model required="true"
	 * @generated
	 */
	UserProfile getUserProfile();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Association#getUserProfile <em>User Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Profile</em>' reference.
	 * @see #getUserProfile()
	 * @generated
	 */
	void setUserProfile(UserProfile value);

	/**
	 * Returns the value of the '<em><b>Scriptmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scriptmodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scriptmodel</em>' reference.
	 * @see #setScriptmodel(ScriptModel)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getAssociation_Scriptmodel()
	 * @model required="true"
	 * @generated
	 */
	ScriptModel getScriptmodel();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Association#getScriptmodel <em>Scriptmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scriptmodel</em>' reference.
	 * @see #getScriptmodel()
	 * @generated
	 */
	void setScriptmodel(ScriptModel value);

} // Association
