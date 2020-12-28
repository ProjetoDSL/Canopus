/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric;

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
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold#getAssociationCriteria <em>Association Criteria</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getAssociationCounterCriteriaThreshold()
 * @model
 * @generated
 */
public interface AssociationCounterCriteriaThreshold extends EObject {
	/**
	 * Returns the value of the '<em><b>Association Criteria</b></em>' attribute.
	 * The literals are from the enumeration {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.ASSOCIATION_CRITERIA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Criteria</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.ASSOCIATION_CRITERIA
	 * @see #setAssociationCriteria(ASSOCIATION_CRITERIA)
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getAssociationCounterCriteriaThreshold_AssociationCriteria()
	 * @model
	 * @generated
	 */
	ASSOCIATION_CRITERIA getAssociationCriteria();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold#getAssociationCriteria <em>Association Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Criteria</em>' attribute.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.ASSOCIATION_CRITERIA
	 * @see #getAssociationCriteria()
	 * @generated
	 */
	void setAssociationCriteria(ASSOCIATION_CRITERIA value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Threshold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' reference list.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getAssociationCounterCriteriaThreshold_Threshold()
	 * @model
	 * @generated
	 */
	EList<Threshold> getThreshold();

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Criteria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' reference list.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getAssociationCounterCriteriaThreshold_Criteria()
	 * @model
	 * @generated
	 */
	EList<Criteria> getCriteria();

} // AssociationCounterCriteriaThreshold
