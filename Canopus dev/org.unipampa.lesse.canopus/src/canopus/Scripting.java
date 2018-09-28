/**
 */
package canopus;

import canopus.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScripting.DataTable;
import canopus.canopusPerformanceScripting.Final;
import canopus.canopusPerformanceScripting.Initial;
import canopus.canopusPerformanceScripting.SaveParameters;
import canopus.canopusPerformanceScripting.ScriptingModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.Scripting#getInitial <em>Initial</em>}</li>
 *   <li>{@link canopus.Scripting#getFinal <em>Final</em>}</li>
 *   <li>{@link canopus.Scripting#getActivities <em>Activities</em>}</li>
 *   <li>{@link canopus.Scripting#getSaveparameters <em>Saveparameters</em>}</li>
 *   <li>{@link canopus.Scripting#getDatatables <em>Datatables</em>}</li>
 *   <li>{@link canopus.Scripting#getScripts <em>Scripts</em>}</li>
 *   <li>{@link canopus.Scripting#getScripting <em>Scripting</em>}</li>
 *   <li>{@link canopus.Scripting#getScriptingeOpposite <em>Scriptinge Opposite</em>}</li>
 * </ul>
 *
 * @see canopus.CanopusPackage#getScripting()
 * @model
 * @generated
 */
public interface Scripting extends Diagram {
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
	 * @see canopus.CanopusPackage#getScripting_Initial()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Initial getInitial();

	/**
	 * Sets the value of the '{@link canopus.Scripting#getInitial <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' containment reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(Initial value);

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
	 * @see canopus.CanopusPackage#getScripting_Final()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Final getFinal();

	/**
	 * Sets the value of the '{@link canopus.Scripting#getFinal <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' containment reference.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(Final value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScripting_Activities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activity> getActivities();

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
	 * @see canopus.CanopusPackage#getScripting_Saveparameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<SaveParameters> getSaveparameters();

	/**
	 * Returns the value of the '<em><b>Datatables</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.DataTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatables</em>' containment reference list.
	 * @see canopus.CanopusPackage#getScripting_Datatables()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTable> getDatatables();

	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceScripting.ScriptingModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripts</em>' reference list.
	 * @see canopus.CanopusPackage#getScripting_Scripts()
	 * @model
	 * @generated
	 */
	EList<ScriptingModel> getScripts();

	/**
	 * Returns the value of the '<em><b>Scripting</b></em>' reference list.
	 * The list contents are of type {@link canopus.Scripting}.
	 * It is bidirectional and its opposite is '{@link canopus.Scripting#getScriptingeOpposite <em>Scriptinge Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripting</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripting</em>' reference list.
	 * @see canopus.CanopusPackage#getScripting_Scripting()
	 * @see canopus.Scripting#getScriptingeOpposite
	 * @model opposite="scriptingeOpposite"
	 * @generated
	 */
	EList<Scripting> getScripting();

	/**
	 * Returns the value of the '<em><b>Scriptinge Opposite</b></em>' reference list.
	 * The list contents are of type {@link canopus.Scripting}.
	 * It is bidirectional and its opposite is '{@link canopus.Scripting#getScripting <em>Scripting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scriptinge Opposite</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scriptinge Opposite</em>' reference list.
	 * @see canopus.CanopusPackage#getScripting_ScriptingeOpposite()
	 * @see canopus.Scripting#getScripting
	 * @model opposite="scripting"
	 * @generated
	 */
	EList<Scripting> getScriptingeOpposite();

} // Scripting
