/**
 */
package canopus.canopusPerformanceScenario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Profile To Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.UserProfileToScript#getTimePercentage <em>Time Percentage</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.UserProfileToScript#getUserprofile <em>Userprofile</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.UserProfileToScript#getScripting <em>Scripting</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getUserProfileToScript()
 * @model
 * @generated
 */
public interface UserProfileToScript extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Percentage</em>' attribute.
	 * @see #setTimePercentage(int)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getUserProfileToScript_TimePercentage()
	 * @model
	 * @generated
	 */
	int getTimePercentage();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.UserProfileToScript#getTimePercentage <em>Time Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Percentage</em>' attribute.
	 * @see #getTimePercentage()
	 * @generated
	 */
	void setTimePercentage(int value);

	/**
	 * Returns the value of the '<em><b>Userprofile</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link canopus.canopusPerformanceScenario.UserProfile#getUserprofiletoscript <em>Userprofiletoscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userprofile</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userprofile</em>' reference.
	 * @see #setUserprofile(UserProfile)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getUserProfileToScript_Userprofile()
	 * @see canopus.canopusPerformanceScenario.UserProfile#getUserprofiletoscript
	 * @model opposite="userprofiletoscript"
	 * @generated
	 */
	UserProfile getUserprofile();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.UserProfileToScript#getUserprofile <em>Userprofile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userprofile</em>' reference.
	 * @see #getUserprofile()
	 * @generated
	 */
	void setUserprofile(UserProfile value);

	/**
	 * Returns the value of the '<em><b>Scripting</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link canopus.canopusPerformanceScenario.Scripting#getUserprofiletoscript <em>Userprofiletoscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripting</em>' reference.
	 * @see #setScripting(Scripting)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getUserProfileToScript_Scripting()
	 * @see canopus.canopusPerformanceScenario.Scripting#getUserprofiletoscript
	 * @model opposite="userprofiletoscript" required="true"
	 * @generated
	 */
	Scripting getScripting();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.UserProfileToScript#getScripting <em>Scripting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scripting</em>' reference.
	 * @see #getScripting()
	 * @generated
	 */
	void setScripting(Scripting value);

} // UserProfileToScript
