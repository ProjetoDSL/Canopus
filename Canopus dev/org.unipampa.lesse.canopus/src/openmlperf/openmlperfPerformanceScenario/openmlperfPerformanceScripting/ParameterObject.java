/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Object</b></em>'.
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
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getStaticValue <em>Static Value</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getColumnsobject <em>Columnsobject</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getParameterObject()
 * @model
 * @generated
 */
public interface ParameterObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Action</b></em>' attribute.
	 * The literals are from the enumeration {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.TYPEACTION}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Action</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.TYPEACTION
	 * @see #setTypeAction(TYPEACTION)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getParameterObject_TypeAction()
	 * @model
	 * @generated
	 */
	TYPEACTION getTypeAction();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getTypeAction <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Action</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.TYPEACTION
	 * @see #getTypeAction()
	 * @generated
	 */
	void setTypeAction(TYPEACTION value);

	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getParameterObject_ParameterName()
	 * @model
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getParameterName <em>Parameter Name</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Value</em>' attribute.
	 * @see #setStaticValue(String)
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getParameterObject_StaticValue()
	 * @model
	 * @generated
	 */
	String getStaticValue();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getStaticValue <em>Static Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Value</em>' attribute.
	 * @see #getStaticValue()
	 * @generated
	 */
	void setStaticValue(String value);

	/**
	 * Returns the value of the '<em><b>Columnsobject</b></em>' reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnsobject</em>' reference list.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage#getParameterObject_Columnsobject()
	 * @model
	 * @generated
	 */
	EList<ColumnsObject> getColumnsobject();

} // ParameterObject
