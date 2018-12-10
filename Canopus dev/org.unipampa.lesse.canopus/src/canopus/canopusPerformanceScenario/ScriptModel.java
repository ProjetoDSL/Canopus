/**
 */
package canopus.canopusPerformanceScenario;

import canopus.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScripting.DataTable;
import canopus.canopusPerformanceScripting.Final;
import canopus.canopusPerformanceScripting.Initial;
import canopus.canopusPerformanceScripting.ThinkTime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.ScriptModel#getActivities <em>Activities</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.ScriptModel#getInitial <em>Initial</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.ScriptModel#getFinal <em>Final</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.ScriptModel#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.ScriptModel#getSaveParameters <em>Save Parameters</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.ScriptModel#getDataTables <em>Data Tables</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.ScriptModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScriptModel()
 * @model
 * @generated
 */
public interface ScriptModel extends EObject {
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
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScriptModel_Activities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activity> getActivities();

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
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScriptModel_Initial()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Initial getInitial();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.ScriptModel#getInitial <em>Initial</em>}' containment reference.
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
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScriptModel_Final()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Final getFinal();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.ScriptModel#getFinal <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' containment reference.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(Final value);

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
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScriptModel_ThinkTime()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThinkTime> getThinkTime();

	/**
	 * Returns the value of the '<em><b>Save Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Save Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Parameters</em>' containment reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScriptModel_SaveParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getSaveParameters();

	/**
	 * Returns the value of the '<em><b>Data Tables</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.DataTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Tables</em>' containment reference list.
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScriptModel_DataTables()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTable> getDataTables();

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
	 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage#getScriptModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.ScriptModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ScriptModel
