/**
 */
package openmlperf;

import openmlperf.openmlperfPerformanceMonitoring.LoadGenerator;
import openmlperf.openmlperfPerformanceMonitoring.MetricModel;
import openmlperf.openmlperfPerformanceMonitoring.Monitor;
import openmlperf.openmlperfPerformanceMonitoring.SUT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitoring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.Monitoring#getSuts <em>Suts</em>}</li>
 *   <li>{@link openmlperf.Monitoring#getLoadGenerators <em>Load Generators</em>}</li>
 *   <li>{@link openmlperf.Monitoring#getMonitors <em>Monitors</em>}</li>
 *   <li>{@link openmlperf.Monitoring#getMetricModel <em>Metric Model</em>}</li>
 * </ul>
 *
 * @see openmlperf.OpenmlperfPackage#getMonitoring()
 * @model
 * @generated
 */
public interface Monitoring extends Diagram {
	/**
	 * Returns the value of the '<em><b>Suts</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.SUT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suts</em>' containment reference list.
	 * @see openmlperf.OpenmlperfPackage#getMonitoring_Suts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SUT> getSuts();

	/**
	 * Returns the value of the '<em><b>Load Generators</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.LoadGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Generators</em>' containment reference list.
	 * @see openmlperf.OpenmlperfPackage#getMonitoring_LoadGenerators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LoadGenerator> getLoadGenerators();

	/**
	 * Returns the value of the '<em><b>Monitors</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.Monitor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors</em>' containment reference list.
	 * @see openmlperf.OpenmlperfPackage#getMonitoring_Monitors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Monitor> getMonitors();

	/**
	 * Returns the value of the '<em><b>Metric Model</b></em>' containment reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.MetricModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Model</em>' containment reference list.
	 * @see openmlperf.OpenmlperfPackage#getMonitoring_MetricModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricModel> getMetricModel();

} // Monitoring
