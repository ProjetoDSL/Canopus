/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity To Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity#getTimePercentage <em>Time Percentage</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity#getActivity <em>Activity</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity#getActivies <em>Activies</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getActivityToActivity()
 * @model
 * @generated
 */
public interface ActivityToActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Percentage</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Percentage</em>' attribute.
	 * @see #setTimePercentage(int)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getActivityToActivity_TimePercentage()
	 * @model default="1"
	 * @generated
	 */
	int getTimePercentage();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity#getTimePercentage <em>Time Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Percentage</em>' attribute.
	 * @see #getTimePercentage()
	 * @generated
	 */
	void setTimePercentage(int value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getActivitytoactivity <em>Activitytoactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getActivityToActivity_Activity()
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getActivitytoactivity
	 * @model opposite="activitytoactivity" required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Activies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activies</em>' reference.
	 * @see #setActivies(Activity)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getActivityToActivity_Activies()
	 * @model
	 * @generated
	 */
	Activity getActivies();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity#getActivies <em>Activies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activies</em>' reference.
	 * @see #getActivies()
	 * @generated
	 */
	void setActivies(Activity value);

} // ActivityToActivity
