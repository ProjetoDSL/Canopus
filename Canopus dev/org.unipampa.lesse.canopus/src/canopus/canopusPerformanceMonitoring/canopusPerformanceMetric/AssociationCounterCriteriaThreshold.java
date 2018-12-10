/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Counter Criteria Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold#getAssociationCriteria <em>Association Criteria</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getAssociationCounterCriteriaThreshold()
 * @model
 * @generated
 */
public interface AssociationCounterCriteriaThreshold extends EObject {
	/**
	 * Returns the value of the '<em><b>Association Criteria</b></em>' attribute.
	 * The literals are from the enumeration {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Criteria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Criteria</em>' attribute.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA
	 * @see #setAssociationCriteria(ASSOCIATION_CRITERIA)
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getAssociationCounterCriteriaThreshold_AssociationCriteria()
	 * @model
	 * @generated
	 */
	ASSOCIATION_CRITERIA getAssociationCriteria();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold#getAssociationCriteria <em>Association Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Criteria</em>' attribute.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA
	 * @see #getAssociationCriteria()
	 * @generated
	 */
	void setAssociationCriteria(ASSOCIATION_CRITERIA value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' reference.
	 * @see #setThreshold(Threshold)
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getAssociationCounterCriteriaThreshold_Threshold()
	 * @model
	 * @generated
	 */
	Threshold getThreshold();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold#getThreshold <em>Threshold</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' reference.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(Threshold value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Criteria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' reference list.
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getAssociationCounterCriteriaThreshold_Criteria()
	 * @model
	 * @generated
	 */
	EList<Criteria> getCriteria();

} // AssociationCounterCriteriaThreshold
