/**
 */
package canopus.canopusPerformanceScripting;

import canopus.canopusPerformanceScripting.canopusPerformanceExternalFile.ExternalFile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScripting.DataTable#getDelimeter <em>Delimeter</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.DataTable#getParameterhiddenobject <em>Parameterhiddenobject</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.DataTable#getAttachedfile <em>Attachedfile</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.DataTable#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getDataTable()
 * @model
 * @generated
 */
public interface DataTable extends EObject {
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
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getDataTable_Delimeter()
	 * @model
	 * @generated
	 */
	String getDelimeter();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.DataTable#getDelimeter <em>Delimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimeter</em>' attribute.
	 * @see #getDelimeter()
	 * @generated
	 */
	void setDelimeter(String value);

	/**
	 * Returns the value of the '<em><b>Parameterhiddenobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameterhiddenobject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameterhiddenobject</em>' reference.
	 * @see #setParameterhiddenobject(ParameterHiddenObject)
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getDataTable_Parameterhiddenobject()
	 * @model
	 * @generated
	 */
	ParameterHiddenObject getParameterhiddenobject();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.DataTable#getParameterhiddenobject <em>Parameterhiddenobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameterhiddenobject</em>' reference.
	 * @see #getParameterhiddenobject()
	 * @generated
	 */
	void setParameterhiddenobject(ParameterHiddenObject value);

	/**
	 * Returns the value of the '<em><b>Attachedfile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachedfile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachedfile</em>' containment reference.
	 * @see #setAttachedfile(ExternalFile)
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getDataTable_Attachedfile()
	 * @model containment="true"
	 * @generated
	 */
	ExternalFile getAttachedfile();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.DataTable#getAttachedfile <em>Attachedfile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachedfile</em>' containment reference.
	 * @see #getAttachedfile()
	 * @generated
	 */
	void setAttachedfile(ExternalFile value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#getDataTable_Activity()
	 * @model
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScripting.DataTable#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // DataTable
