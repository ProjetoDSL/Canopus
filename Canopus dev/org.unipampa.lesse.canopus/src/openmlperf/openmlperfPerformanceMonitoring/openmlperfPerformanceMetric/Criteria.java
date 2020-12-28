/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Criteria#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getCriteria()
 * @model
 * @generated
 */
public interface Criteria extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getCriteria_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Criteria#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Criteria
