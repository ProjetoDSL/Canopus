/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Determines the data that is consumed by the activities. Specified by filename that must contain a data table, e.g. a .CSV file.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getAttachedFile <em>Attached File</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getDelimeter <em>Delimeter</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getActivity <em>Activity</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getColumnshiddenobject <em>Columnshiddenobject</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getDataTable()
 * @model
 * @generated
 */
public interface DataTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Attached File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached File</em>' attribute.
	 * @see #setAttachedFile(String)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getDataTable_AttachedFile()
	 * @model
	 * @generated
	 */
	String getAttachedFile();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getAttachedFile <em>Attached File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached File</em>' attribute.
	 * @see #getAttachedFile()
	 * @generated
	 */
	void setAttachedFile(String value);

	/**
	 * Returns the value of the '<em><b>Delimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimeter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimeter</em>' attribute.
	 * @see #setDelimeter(String)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getDataTable_Delimeter()
	 * @model
	 * @generated
	 */
	String getDelimeter();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getDelimeter <em>Delimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimeter</em>' attribute.
	 * @see #getDelimeter()
	 * @generated
	 */
	void setDelimeter(String value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getDataTable_Activity()
	 * @model required="true"
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Columnshiddenobject</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnshiddenobject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnshiddenobject</em>' containment reference list.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getDataTable_Columnshiddenobject()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnsHiddenObject> getColumnshiddenobject();

} // DataTable
