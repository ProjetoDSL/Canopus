/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Hidden Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Determines the data that is consumed by the activities. Specified by a filename that must contain a data table, e.g. a .CSV file.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getStaticValue <em>Static Value</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getColumnshiddenobject <em>Columnshiddenobject</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getParameterHiddenObject()
 * @model
 * @generated
 */
public interface ParameterHiddenObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Action</b></em>' attribute.
	 * The literals are from the enumeration {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.TYPEACTION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Action</em>' attribute.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.TYPEACTION
	 * @see #setTypeAction(TYPEACTION)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getParameterHiddenObject_TypeAction()
	 * @model
	 * @generated
	 */
	TYPEACTION getTypeAction();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getTypeAction <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Action</em>' attribute.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.TYPEACTION
	 * @see #getTypeAction()
	 * @generated
	 */
	void setTypeAction(TYPEACTION value);

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
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getParameterHiddenObject_ParameterName()
	 * @model
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

	/**
	 * Returns the value of the '<em><b>Static Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Value</em>' attribute.
	 * @see #setStaticValue(String)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getParameterHiddenObject_StaticValue()
	 * @model
	 * @generated
	 */
	String getStaticValue();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getStaticValue <em>Static Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Value</em>' attribute.
	 * @see #getStaticValue()
	 * @generated
	 */
	void setStaticValue(String value);

	/**
	 * Returns the value of the '<em><b>Columnshiddenobject</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnshiddenobject</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnshiddenobject</em>' reference list.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getParameterHiddenObject_Columnshiddenobject()
	 * @model
	 * @generated
	 */
	EList<ColumnsHiddenObject> getColumnshiddenobject();

} // ParameterHiddenObject
