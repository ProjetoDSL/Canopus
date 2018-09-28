/**
 */
package canopus.canopusPerformanceScripting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Hidden Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScripting.ParameterHiddenObject#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.ParameterHiddenObject#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.ParameterHiddenObject#getStaticValue <em>Static Value</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.ParameterHiddenObject#getDynamicvalues <em>Dynamicvalues</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getParameterHiddenObject()
 * @model
 * @generated
 */
public interface ParameterHiddenObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Action</b></em>' attribute.
	 * The literals are from the enumeration {@link canopus.canopusPerformanceScripting.TYPEACTION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Action</em>' attribute.
	 * @see canopus.canopusPerformanceScripting.TYPEACTION
	 * @see #setTypeAction(TYPEACTION)
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getParameterHiddenObject_TypeAction()
	 * @model
	 * @generated
	 */
	TYPEACTION getTypeAction();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.ParameterHiddenObject#getTypeAction <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Action</em>' attribute.
	 * @see canopus.canopusPerformanceScripting.TYPEACTION
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
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getParameterHiddenObject_ParameterName()
	 * @model
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.ParameterHiddenObject#getParameterName <em>Parameter Name</em>}' attribute.
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
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getParameterHiddenObject_StaticValue()
	 * @model
	 * @generated
	 */
	String getStaticValue();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.ParameterHiddenObject#getStaticValue <em>Static Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Value</em>' attribute.
	 * @see #getStaticValue()
	 * @generated
	 */
	void setStaticValue(String value);

	/**
	 * Returns the value of the '<em><b>Dynamicvalues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamicvalues</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamicvalues</em>' containment reference.
	 * @see #setDynamicvalues(ColumnsHiddenObject)
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getParameterHiddenObject_Dynamicvalues()
	 * @model containment="true"
	 * @generated
	 */
	ColumnsHiddenObject getDynamicvalues();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.ParameterHiddenObject#getDynamicvalues <em>Dynamicvalues</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamicvalues</em>' containment reference.
	 * @see #getDynamicvalues()
	 * @generated
	 */
	void setDynamicvalues(ColumnsHiddenObject value);

} // ParameterHiddenObject
