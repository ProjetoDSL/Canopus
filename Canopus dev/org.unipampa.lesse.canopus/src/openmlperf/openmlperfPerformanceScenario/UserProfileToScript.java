/**
 */
package openmlperf.openmlperfPerformanceScenario;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.UserProfileToScript#getTimePercentage <em>Time Percentage</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.UserProfileToScript#getUserprofile <em>Userprofile</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.UserProfileToScript#getScripting <em>Scripting</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getUserProfileToScript()
 * @model
 * @generated
 */
public interface UserProfileToScript extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Percentage</em>' attribute.
	 * @see #setTimePercentage(int)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getUserProfileToScript_TimePercentage()
	 * @model
	 * @generated
	 */
	int getTimePercentage();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.UserProfileToScript#getTimePercentage <em>Time Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Percentage</em>' attribute.
	 * @see #getTimePercentage()
	 * @generated
	 */
	void setTimePercentage(int value);

	/**
	 * Returns the value of the '<em><b>Userprofile</b></em>' reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.UserProfile}.
	 * It is bidirectional and its opposite is '{@link openmlperf.openmlperfPerformanceScenario.UserProfile#getUserprofiletoscript <em>Userprofiletoscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userprofile</em>' reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getUserProfileToScript_Userprofile()
	 * @see openmlperf.openmlperfPerformanceScenario.UserProfile#getUserprofiletoscript
	 * @model opposite="userprofiletoscript"
	 * @generated
	 */
	EList<UserProfile> getUserprofile();

	/**
	 * Returns the value of the '<em><b>Scripting</b></em>' reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.Scripting}.
	 * It is bidirectional and its opposite is '{@link openmlperf.openmlperfPerformanceScenario.Scripting#getUserprofiletoscript <em>Userprofiletoscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripting</em>' reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getUserProfileToScript_Scripting()
	 * @see openmlperf.openmlperfPerformanceScenario.Scripting#getUserprofiletoscript
	 * @model opposite="userprofiletoscript" required="true"
	 * @generated
	 */
	EList<Scripting> getScripting();

} // UserProfileToScript
