/**
 */
package canopus.canopusPerformanceScenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.UserProfile#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.UserProfile#getDescription <em>Description</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.UserProfile#getUserprofiletoscript <em>Userprofiletoscript</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.UserProfile#getPercentage <em>Percentage</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getUserProfile()
 * @model
 * @generated
 */
public interface UserProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getUserProfile_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.UserProfile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getUserProfile_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.UserProfile#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Userprofiletoscript</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.UserProfileToScript}.
	 * It is bidirectional and its opposite is '{@link canopus.canopusPerformanceScenario.UserProfileToScript#getUserprofile <em>Userprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userprofiletoscript</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userprofiletoscript</em>' reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getUserProfile_Userprofiletoscript()
	 * @see canopus.canopusPerformanceScenario.UserProfileToScript#getUserprofile
	 * @model opposite="userprofile"
	 * @generated
	 */
	EList<UserProfileToScript> getUserprofiletoscript();

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(String)
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getUserProfile_Percentage()
	 * @model
	 * @generated
	 */
	String getPercentage();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.UserProfile#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(String value);

} // UserProfile
