/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columns Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the strategy that each column from the test data will be randomized.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getReferendedParameter <em>Referended Parameter</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getSelectnextrow <em>Selectnextrow</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getUpdatedvalueon <em>Updatedvalueon</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getDatatable <em>Datatable</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getColumnsObject()
 * @model
 * @generated
 */
public interface ColumnsObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Referended Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referended Parameter</em>' attribute.
	 * @see #setReferendedParameter(String)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getColumnsObject_ReferendedParameter()
	 * @model
	 * @generated
	 */
	String getReferendedParameter();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getReferendedParameter <em>Referended Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referended Parameter</em>' attribute.
	 * @see #getReferendedParameter()
	 * @generated
	 */
	void setReferendedParameter(String value);

	/**
	 * Returns the value of the '<em><b>Selectnextrow</b></em>' attribute.
	 * The literals are from the enumeration {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SELECT_NEXT_ROW}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectnextrow</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SELECT_NEXT_ROW
	 * @see #setSelectnextrow(SELECT_NEXT_ROW)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getColumnsObject_Selectnextrow()
	 * @model
	 * @generated
	 */
	SELECT_NEXT_ROW getSelectnextrow();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getSelectnextrow <em>Selectnextrow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectnextrow</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SELECT_NEXT_ROW
	 * @see #getSelectnextrow()
	 * @generated
	 */
	void setSelectnextrow(SELECT_NEXT_ROW value);

	/**
	 * Returns the value of the '<em><b>Updatedvalueon</b></em>' attribute.
	 * The literals are from the enumeration {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.UPDATED_VALUE_ON}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updatedvalueon</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.UPDATED_VALUE_ON
	 * @see #setUpdatedvalueon(UPDATED_VALUE_ON)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getColumnsObject_Updatedvalueon()
	 * @model
	 * @generated
	 */
	UPDATED_VALUE_ON getUpdatedvalueon();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getUpdatedvalueon <em>Updatedvalueon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updatedvalueon</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.UPDATED_VALUE_ON
	 * @see #getUpdatedvalueon()
	 * @generated
	 */
	void setUpdatedvalueon(UPDATED_VALUE_ON value);

	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getColumnsObject_ParameterName()
	 * @model
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

	/**
	 * Returns the value of the '<em><b>Datatable</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatable</em>' containment reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getColumnsObject_Datatable()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTable> getDatatable();

} // ColumnsObject
