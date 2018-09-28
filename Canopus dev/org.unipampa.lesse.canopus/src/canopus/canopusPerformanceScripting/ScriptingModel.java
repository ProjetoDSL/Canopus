/**
 */
package canopus.canopusPerformanceScripting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripting Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScripting.ScriptingModel#getActivity <em>Activity</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.ScriptingModel#getSaveparameters <em>Saveparameters</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.ScriptingModel#getDatatable <em>Datatable</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.ScriptingModel#getFinal <em>Final</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.ScriptingModel#getInitial <em>Initial</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.ScriptingModel#getThinktime <em>Thinktime</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getScriptingModel()
 * @model
 * @generated
 */
public interface ScriptingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getScriptingModel_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activity> getActivity();

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
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getScriptingModel_Saveparameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<SaveParameters> getSaveparameters();

	/**
	 * Returns the value of the '<em><b>Datatable</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.DataTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatable</em>' containment reference list.
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getScriptingModel_Datatable()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTable> getDatatable();

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
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getScriptingModel_Final()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Final getFinal();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.ScriptingModel#getFinal <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' containment reference.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(Final value);

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
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getScriptingModel_Initial()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Initial getInitial();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.ScriptingModel#getInitial <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' containment reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(Initial value);

	/**
	 * Returns the value of the '<em><b>Thinktime</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.ThinkTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thinktime</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thinktime</em>' containment reference list.
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getScriptingModel_Thinktime()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThinkTime> getThinktime();

} // ScriptingModel
