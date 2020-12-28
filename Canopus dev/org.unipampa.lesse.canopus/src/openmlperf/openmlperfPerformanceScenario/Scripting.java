/**
 */
package openmlperf.openmlperfPerformanceScenario;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Final;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Initial;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SaveParameters;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime;

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
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Scripting#getName <em>Name</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Scripting#getInitial <em>Initial</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Scripting#getFinal <em>Final</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Scripting#getActivities <em>Activities</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Scripting#getSaveparameters <em>Saveparameters</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Scripting#getDatatables <em>Datatables</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Scripting#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Scripting#getScripts <em>Scripts</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Scripting#getUserprofiletoscript <em>Userprofiletoscript</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Scripting#getParamenters <em>Paramenters</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Scripting#getActivityToActivity <em>Activity To Activity</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Scripting#getColumns <em>Columns</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.Scripting#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting()
 * @model
 * @generated
 */
public interface Scripting extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.Scripting#getName <em>Name</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference.
	 * @see #setInitial(Initial)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting_Initial()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Initial getInitial();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.Scripting#getInitial <em>Initial</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' containment reference.
	 * @see #setFinal(Final)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting_Final()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Final getFinal();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.Scripting#getFinal <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' containment reference.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(Final value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting_Activities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Saveparameters</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SaveParameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saveparameters</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting_Saveparameters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SaveParameters> getSaveparameters();

	/**
	 * Returns the value of the '<em><b>Datatables</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatables</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting_Datatables()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTable> getDatatables();

	/**
	 * Returns the value of the '<em><b>Think Time</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Think Time</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting_ThinkTime()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThinkTime> getThinkTime();

	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.Scripting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripts</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting_Scripts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scripting> getScripts();

	/**
	 * Returns the value of the '<em><b>Userprofiletoscript</b></em>' reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.UserProfileToScript}.
	 * It is bidirectional and its opposite is '{@link openmlperf.openmlperfPerformanceScenario.UserProfileToScript#getScripting <em>Scripting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userprofiletoscript</em>' reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting_Userprofiletoscript()
	 * @see openmlperf.openmlperfPerformanceScenario.UserProfileToScript#getScripting
	 * @model opposite="scripting"
	 * @generated
	 */
	EList<UserProfileToScript> getUserprofiletoscript();

	/**
	 * Returns the value of the '<em><b>Paramenters</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paramenters</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting_Paramenters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterObject> getParamenters();

	/**
	 * Returns the value of the '<em><b>Activity To Activity</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity To Activity</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting_ActivityToActivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityToActivity> getActivityToActivity();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnsObject> getColumns();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#getScripting_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.Scripting#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Scripting
