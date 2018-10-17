/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Counter#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Counter#getAssociationcountercriteriathreshold <em>Associationcountercriteriathreshold</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getCounter()
 * @model abstract="true"
 * @generated
 */
public interface Counter extends EObject {
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
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getCounter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Counter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Associationcountercriteriathreshold</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associationcountercriteriathreshold</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associationcountercriteriathreshold</em>' reference list.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getCounter_Associationcountercriteriathreshold()
	 * @model
	 * @generated
	 */
	EList<AssociationCounterCriteriaThreshold> getAssociationcountercriteriathreshold();

} // Counter
