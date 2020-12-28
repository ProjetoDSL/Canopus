/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting;

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
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable#getAttachedFile <em>Attached File</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable#getDelimeter <em>Delimeter</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getDataTable()
 * @model
 * @generated
 */
public interface DataTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Attached File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached File</em>' attribute.
	 * @see #setAttachedFile(String)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getDataTable_AttachedFile()
	 * @model
	 * @generated
	 */
	String getAttachedFile();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable#getAttachedFile <em>Attached File</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimeter</em>' attribute.
	 * @see #setDelimeter(String)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getDataTable_Delimeter()
	 * @model
	 * @generated
	 */
	String getDelimeter();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable#getDelimeter <em>Delimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimeter</em>' attribute.
	 * @see #getDelimeter()
	 * @generated
	 */
	void setDelimeter(String value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity}.
	 * It is bidirectional and its opposite is '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getDatatable <em>Datatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getDataTable_Activity()
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getDatatable
	 * @model opposite="datatable"
	 * @generated
	 */
	EList<Activity> getActivity();

} // DataTable
