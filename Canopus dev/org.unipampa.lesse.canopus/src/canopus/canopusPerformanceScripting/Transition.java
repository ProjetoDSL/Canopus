/**
 */
package canopus.canopusPerformanceScripting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScripting.Transition#getPorcentage <em>Porcentage</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.Transition#getActivity <em>Activity</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.Transition#getThinktime <em>Thinktime</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Porcentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porcentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porcentage</em>' attribute.
	 * @see #setPorcentage(int)
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getTransition_Porcentage()
	 * @model
	 * @generated
	 */
	int getPorcentage();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.Transition#getPorcentage <em>Porcentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porcentage</em>' attribute.
	 * @see #getPorcentage()
	 * @generated
	 */
	void setPorcentage(int value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getTransition_Activity()
	 * @model required="true"
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Thinktime</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.ThinkTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thinktime</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thinktime</em>' reference list.
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getTransition_Thinktime()
	 * @model
	 * @generated
	 */
	EList<ThinkTime> getThinktime();

} // Transition
