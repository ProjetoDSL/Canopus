/**
 */
package openmlperf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link openmlperf.Diagram#getProjectLabel <em>Project Label</em>}</li>
 *   <li>{@link openmlperf.Diagram#getProjectAuthor <em>Project Author</em>}</li>
 *   <li>{@link openmlperf.Diagram#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see openmlperf.OpenmlperfPackage#getDiagram()
 * @model abstract="true"
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see openmlperf.OpenmlperfPackage#getDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link openmlperf.Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Project Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Label</em>' attribute.
	 * @see #setProjectLabel(String)
	 * @see openmlperf.OpenmlperfPackage#getDiagram_ProjectLabel()
	 * @model
	 * @generated
	 */
	String getProjectLabel();

	/**
	 * Sets the value of the '{@link openmlperf.Diagram#getProjectLabel <em>Project Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Label</em>' attribute.
	 * @see #getProjectLabel()
	 * @generated
	 */
	void setProjectLabel(String value);

	/**
	 * Returns the value of the '<em><b>Project Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Author</em>' attribute.
	 * @see #setProjectAuthor(String)
	 * @see openmlperf.OpenmlperfPackage#getDiagram_ProjectAuthor()
	 * @model
	 * @generated
	 */
	String getProjectAuthor();

	/**
	 * Sets the value of the '{@link openmlperf.Diagram#getProjectAuthor <em>Project Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Author</em>' attribute.
	 * @see #getProjectAuthor()
	 * @generated
	 */
	void setProjectAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see openmlperf.OpenmlperfPackage#getDiagram_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link openmlperf.Diagram#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Diagram
