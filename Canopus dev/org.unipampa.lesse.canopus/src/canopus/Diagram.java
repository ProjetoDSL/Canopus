/**
 */
package canopus;

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
 *   <li>{@link canopus.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link canopus.Diagram#getProjectLabel <em>Project Label</em>}</li>
 *   <li>{@link canopus.Diagram#getProjectAuthor <em>Project Author</em>}</li>
 *   <li>{@link canopus.Diagram#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see canopus.CanopusPackage#getDiagram()
 * @model abstract="true"
 * @generated
 */
public interface Diagram extends EObject {
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
	 * @see canopus.CanopusPackage#getDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canopus.Diagram#getName <em>Name</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Project Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Label</em>' attribute.
	 * @see #setProjectLabel(String)
	 * @see canopus.CanopusPackage#getDiagram_ProjectLabel()
	 * @model
	 * @generated
	 */
	String getProjectLabel();

	/**
	 * Sets the value of the '{@link canopus.Diagram#getProjectLabel <em>Project Label</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Project Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Author</em>' attribute.
	 * @see #setProjectAuthor(String)
	 * @see canopus.CanopusPackage#getDiagram_ProjectAuthor()
	 * @model
	 * @generated
	 */
	String getProjectAuthor();

	/**
	 * Sets the value of the '{@link canopus.Diagram#getProjectAuthor <em>Project Author</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see canopus.CanopusPackage#getDiagram_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link canopus.Diagram#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Diagram
