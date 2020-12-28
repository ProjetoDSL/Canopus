/**
 */
package openmlperf.openmlperfPerformanceScenario;

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
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.UserProfile#getName <em>Name</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.UserProfile#getDescription <em>Description</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.UserProfile#getUserprofiletoscript <em>Userprofiletoscript</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.UserProfile#getPercentage <em>Percentage</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getUserProfile()
 * @model
 * @generated
 */
public interface UserProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getUserProfile_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.UserProfile#getName <em>Name</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getUserProfile_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.UserProfile#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Userprofiletoscript</b></em>' reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.UserProfileToScript}.
	 * It is bidirectional and its opposite is '{@link openmlperf.openmlperfPerformanceScenario.UserProfileToScript#getUserprofile <em>Userprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userprofiletoscript</em>' reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getUserProfile_Userprofiletoscript()
	 * @see openmlperf.openmlperfPerformanceScenario.UserProfileToScript#getUserprofile
	 * @model opposite="userprofile"
	 * @generated
	 */
	EList<UserProfileToScript> getUserprofiletoscript();

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(String)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getUserProfile_Percentage()
	 * @model
	 * @generated
	 */
	String getPercentage();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.UserProfile#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(String value);

} // UserProfile
