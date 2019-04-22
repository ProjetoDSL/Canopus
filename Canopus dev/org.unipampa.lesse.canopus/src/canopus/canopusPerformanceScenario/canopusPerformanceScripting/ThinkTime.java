/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Think Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the time between the moment the activity becomes available to the user and the moment the user decides to execute it, for example, the time of filling in form before its submission.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime#getTime <em>Time</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getThinkTime()
 * @model
 * @generated
 */
public interface ThinkTime extends EObject {
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
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getThinkTime_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getThinkTime_Time()
	 * @model
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getThinkTime_Activity()
	 * @model
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // ThinkTime
