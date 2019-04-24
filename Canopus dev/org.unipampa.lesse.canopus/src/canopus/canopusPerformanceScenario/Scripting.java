/**
 */
package canopus.canopusPerformanceScenario;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.Final;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.SaveParameters;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.Scripting#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Scripting#getInitial <em>Initial</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Scripting#getFinal <em>Final</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Scripting#getActivities <em>Activities</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Scripting#getSaveparameters <em>Saveparameters</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Scripting#getDatatables <em>Datatables</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Scripting#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Scripting#getScripts <em>Scripts</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Scripting#getUserprofiletoscript <em>Userprofiletoscript</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Scripting#getParamenters <em>Paramenters</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Scripting#getActivityToActivity <em>Activity To Activity</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Scripting#getColumns <em>Columns</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.Scripting#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting()
 * @model
 * @generated
 */
public interface Scripting extends EObject {
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
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Scripting#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting_Initial()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Initial getInitial();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Scripting#getInitial <em>Initial</em>}' containment reference.
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
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting_Final()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Final getFinal();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Scripting#getFinal <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' containment reference.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(Final value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting_Activities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Saveparameters</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.SaveParameters}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saveparameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saveparameters</em>' containment reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting_Saveparameters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SaveParameters> getSaveparameters();

	/**
	 * Returns the value of the '<em><b>Datatables</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatables</em>' containment reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting_Datatables()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTable> getDatatables();

	/**
	 * Returns the value of the '<em><b>Think Time</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Think Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Think Time</em>' containment reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting_ThinkTime()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThinkTime> getThinkTime();

	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.Scripting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripts</em>' containment reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting_Scripts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scripting> getScripts();

	/**
	 * Returns the value of the '<em><b>Userprofiletoscript</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.UserProfileToScript}.
	 * It is bidirectional and its opposite is '{@link canopus.canopusPerformanceScenario.UserProfileToScript#getScripting <em>Scripting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userprofiletoscript</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userprofiletoscript</em>' reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting_Userprofiletoscript()
	 * @see canopus.canopusPerformanceScenario.UserProfileToScript#getScripting
	 * @model opposite="scripting"
	 * @generated
	 */
	EList<UserProfileToScript> getUserprofiletoscript();

	/**
	 * Returns the value of the '<em><b>Paramenters</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paramenters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paramenters</em>' containment reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting_Paramenters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterHiddenObject> getParamenters();

	/**
	 * Returns the value of the '<em><b>Activity To Activity</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity To Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity To Activity</em>' containment reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting_ActivityToActivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityToActivity> getActivityToActivity();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnsHiddenObject> getColumns();

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
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScripting_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.Scripting#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Scripting
