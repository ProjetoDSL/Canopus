/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columns Hidden Object</b></em>'.
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
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getReferendedParameter <em>Referended Parameter</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getSelectnextrow <em>Selectnextrow</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getUpdatedvalueon <em>Updatedvalueon</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getParameterName <em>Parameter Name</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getColumnsHiddenObject()
 * @model
 * @generated
 */
public interface ColumnsHiddenObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Referended Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referended Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referended Parameter</em>' attribute.
	 * @see #setReferendedParameter(String)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getColumnsHiddenObject_ReferendedParameter()
	 * @model
	 * @generated
	 */
	String getReferendedParameter();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getReferendedParameter <em>Referended Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referended Parameter</em>' attribute.
	 * @see #getReferendedParameter()
	 * @generated
	 */
	void setReferendedParameter(String value);

	/**
	 * Returns the value of the '<em><b>Selectnextrow</b></em>' attribute.
	 * The literals are from the enumeration {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.SELECT_NEXT_ROW}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectnextrow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectnextrow</em>' attribute.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.SELECT_NEXT_ROW
	 * @see #setSelectnextrow(SELECT_NEXT_ROW)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getColumnsHiddenObject_Selectnextrow()
	 * @model
	 * @generated
	 */
	SELECT_NEXT_ROW getSelectnextrow();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getSelectnextrow <em>Selectnextrow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectnextrow</em>' attribute.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.SELECT_NEXT_ROW
	 * @see #getSelectnextrow()
	 * @generated
	 */
	void setSelectnextrow(SELECT_NEXT_ROW value);

	/**
	 * Returns the value of the '<em><b>Updatedvalueon</b></em>' attribute.
	 * The literals are from the enumeration {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.UPDATED_VALUE_ON}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updatedvalueon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updatedvalueon</em>' attribute.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.UPDATED_VALUE_ON
	 * @see #setUpdatedvalueon(UPDATED_VALUE_ON)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getColumnsHiddenObject_Updatedvalueon()
	 * @model
	 * @generated
	 */
	UPDATED_VALUE_ON getUpdatedvalueon();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getUpdatedvalueon <em>Updatedvalueon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updatedvalueon</em>' attribute.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.UPDATED_VALUE_ON
	 * @see #getUpdatedvalueon()
	 * @generated
	 */
	void setUpdatedvalueon(UPDATED_VALUE_ON value);

	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getColumnsHiddenObject_ParameterName()
	 * @model
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

} // ColumnsHiddenObject
