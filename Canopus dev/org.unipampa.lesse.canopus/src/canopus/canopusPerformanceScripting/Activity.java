/**
 */
package canopus.canopusPerformanceScripting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScripting.Activity#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.Activity#getAction <em>Action</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.Activity#isMethod <em>Method</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.Activity#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.Activity#getLoopInstances <em>Loop Instances</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.Activity#getParameterhiddenobject <em>Parameterhiddenobject</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.Activity#isTransaction <em>Transaction</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.Activity#getActivity <em>Activity</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.Activity#getScriptingmodel <em>Scriptingmodel</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
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
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.Activity#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(boolean)
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Method()
	 * @model
	 * @generated
	 */
	boolean isMethod();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.Activity#isMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #isMethod()
	 * @generated
	 */
	void setMethod(boolean value);

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
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_TypeAction()
	 * @model
	 * @generated
	 */
	TYPEACTION getTypeAction();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.Activity#getTypeAction <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Action</em>' attribute.
	 * @see canopus.canopusPerformanceScripting.TYPEACTION
	 * @see #getTypeAction()
	 * @generated
	 */
	void setTypeAction(TYPEACTION value);

	/**
	 * Returns the value of the '<em><b>Loop Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Instances</em>' attribute.
	 * @see #setLoopInstances(int)
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_LoopInstances()
	 * @model
	 * @generated
	 */
	int getLoopInstances();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.Activity#getLoopInstances <em>Loop Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Instances</em>' attribute.
	 * @see #getLoopInstances()
	 * @generated
	 */
	void setLoopInstances(int value);

	/**
	 * Returns the value of the '<em><b>Parameterhiddenobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameterhiddenobject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameterhiddenobject</em>' containment reference.
	 * @see #setParameterhiddenobject(ParameterHiddenObject)
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Parameterhiddenobject()
	 * @model containment="true"
	 * @generated
	 */
	ParameterHiddenObject getParameterhiddenobject();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.Activity#getParameterhiddenobject <em>Parameterhiddenobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameterhiddenobject</em>' containment reference.
	 * @see #getParameterhiddenobject()
	 * @generated
	 */
	void setParameterhiddenobject(ParameterHiddenObject value);

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' attribute.
	 * @see #setTransaction(boolean)
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Transaction()
	 * @model
	 * @generated
	 */
	boolean isTransaction();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.Activity#isTransaction <em>Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' attribute.
	 * @see #isTransaction()
	 * @generated
	 */
	void setTransaction(boolean value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Activity()
	 * @model
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Scriptingmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scriptingmodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scriptingmodel</em>' containment reference.
	 * @see #setScriptingmodel(ScriptingModel)
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Scriptingmodel()
	 * @model containment="true"
	 * @generated
	 */
	ScriptingModel getScriptingmodel();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.Activity#getScriptingmodel <em>Scriptingmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scriptingmodel</em>' containment reference.
	 * @see #getScriptingmodel()
	 * @generated
	 */
	void setScriptingmodel(ScriptingModel value);

} // Activity
