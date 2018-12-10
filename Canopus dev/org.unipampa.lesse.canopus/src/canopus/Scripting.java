/**
 */
package canopus;

import canopus.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScripting.DataTable;
import canopus.canopusPerformanceScripting.Final;
import canopus.canopusPerformanceScripting.Initial;
import canopus.canopusPerformanceScripting.SaveParameters;
import canopus.canopusPerformanceScripting.ThinkTime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.Scripting#getInitial <em>Initial</em>}</li>
 *   <li>{@link canopus.Scripting#getFinal <em>Final</em>}</li>
 *   <li>{@link canopus.Scripting#getActivities <em>Activities</em>}</li>
 *   <li>{@link canopus.Scripting#getSaveparameters <em>Saveparameters</em>}</li>
 *   <li>{@link canopus.Scripting#getDatatables <em>Datatables</em>}</li>
 *   <li>{@link canopus.Scripting#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link canopus.Scripting#getScripts <em>Scripts</em>}</li>
 * </ul>
 *
 * @see canopus.CanopusPackage#getScripting()
 * @model
 * @generated
 */
public interface Scripting extends Diagram {
	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference.
	 * @see #setInitial(Initial)
	 * @see canopus.CanopusPackage#getScripting_Initial()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Initial getInitial();

	/**
	 * Sets the value of the '{@link canopus.Scripting#getInitial <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' containment reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(Initial value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' containment reference.
	 * @see #setFinal(Final)
	 * @see canopus.CanopusPackage#getScripting_Final()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Final getFinal();

	/**
	 * Sets the value of the '{@link canopus.Scripting#getFinal <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' containment reference.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(Final value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScripting_Activities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Saveparameters</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.SaveParameters}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saveparameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saveparameters</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScripting_Saveparameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<SaveParameters> getSaveparameters();

	/**
	 * Returns the value of the '<em><b>Datatables</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.DataTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatables</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScripting_Datatables()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTable> getDatatables();

	/**
	 * Returns the value of the '<em><b>Think Time</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.ThinkTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Think Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Think Time</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScripting_ThinkTime()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThinkTime> getThinkTime();

	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.Scripting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripts</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScripting_Scripts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scripting> getScripts();

} // Scripting
