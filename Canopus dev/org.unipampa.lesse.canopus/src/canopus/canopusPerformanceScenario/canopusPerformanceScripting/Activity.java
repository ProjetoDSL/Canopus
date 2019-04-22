/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting;

import canopus.canopusPerformanceScenario.Scripting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Characterizes the interactions of virtual user behavior from the point of view of the SUT. Every script must have at least one Activity object. This object allows to repeat not only one but a set of activities, it is possible to associate a subgraph model (another Canopus Performance Scripting) into an Activity object. This feature is represented by “+” (plus symbol) on the bottom of the Activity object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getAction <em>Action</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getMethod <em>Method</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getLoopInstances <em>Loop Instances</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getParameterhiddenobject <em>Parameterhiddenobject</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#isTransaction <em>Transaction</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getFinal <em>Final</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getThinktime <em>Thinktime</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getScripting <em>Scripting</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getActivitytoactivity <em>Activitytoactivity</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getSaveparameters <em>Saveparameters</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity()
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
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getName <em>Name</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTTP address of the SUT request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.METHOD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.METHOD
	 * @see #setMethod(METHOD)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Method()
	 * @model dataType="canopus.canopusPerformanceScenario.canopusPerformanceScripting.METHOD"
	 * @generated
	 */
	METHOD getMethod();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.METHOD
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(METHOD value);

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
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_TypeAction()
	 * @model
	 * @generated
	 */
	TYPEACTION getTypeAction();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getTypeAction <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Action</em>' attribute.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.TYPEACTION
	 * @see #getTypeAction()
	 * @generated
	 */
	void setTypeAction(TYPEACTION value);

	/**
	 * Returns the value of the '<em><b>Loop Instances</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Instances</em>' attribute.
	 * @see #setLoopInstances(int)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_LoopInstances()
	 * @model default="1"
	 * @generated
	 */
	int getLoopInstances();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getLoopInstances <em>Loop Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Instances</em>' attribute.
	 * @see #getLoopInstances()
	 * @generated
	 */
	void setLoopInstances(int value);

	/**
	 * Returns the value of the '<em><b>Parameterhiddenobject</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameterhiddenobject</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameterhiddenobject</em>' reference list.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Parameterhiddenobject()
	 * @model upper="3"
	 * @generated
	 */
	EList<ParameterHiddenObject> getParameterhiddenobject();

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
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Transaction()
	 * @model
	 * @generated
	 */
	boolean isTransaction();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#isTransaction <em>Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' attribute.
	 * @see #isTransaction()
	 * @generated
	 */
	void setTransaction(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' reference.
	 * @see #setFinal(Final)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Final()
	 * @model
	 * @generated
	 */
	Final getFinal();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getFinal <em>Final</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' reference.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(Final value);

	/**
	 * Returns the value of the '<em><b>Thinktime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thinktime</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thinktime</em>' reference.
	 * @see #setThinktime(ThinkTime)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Thinktime()
	 * @model
	 * @generated
	 */
	ThinkTime getThinktime();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getThinktime <em>Thinktime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thinktime</em>' reference.
	 * @see #getThinktime()
	 * @generated
	 */
	void setThinktime(ThinkTime value);

	/**
	 * Returns the value of the '<em><b>Scripting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripting</em>' reference.
	 * @see #setScripting(Scripting)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Scripting()
	 * @model
	 * @generated
	 */
	Scripting getScripting();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getScripting <em>Scripting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scripting</em>' reference.
	 * @see #getScripting()
	 * @generated
	 */
	void setScripting(Scripting value);

	/**
	 * Returns the value of the '<em><b>Activitytoactivity</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity}.
	 * It is bidirectional and its opposite is '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitytoactivity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitytoactivity</em>' reference list.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Activitytoactivity()
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity#getActivity
	 * @model opposite="activity"
	 * @generated
	 */
	EList<ActivityToActivity> getActivitytoactivity();

	/**
	 * Returns the value of the '<em><b>Saveparameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saveparameters</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saveparameters</em>' reference.
	 * @see #setSaveparameters(SaveParameters)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getActivity_Saveparameters()
	 * @model
	 * @generated
	 */
	SaveParameters getSaveparameters();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getSaveparameters <em>Saveparameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saveparameters</em>' reference.
	 * @see #getSaveparameters()
	 * @generated
	 */
	void setSaveparameters(SaveParameters value);

} // Activity
