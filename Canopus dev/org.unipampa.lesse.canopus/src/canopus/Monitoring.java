/**
 */
package canopus;

import canopus.canopusPerformanceMonitoring.LoadGenerator;
import canopus.canopusPerformanceMonitoring.MetricModel;
import canopus.canopusPerformanceMonitoring.Monitor;
import canopus.canopusPerformanceMonitoring.SUT;

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
 *   <li>{@link canopus.Monitoring#getSuts <em>Suts</em>}</li>
 *   <li>{@link canopus.Monitoring#getLoadGenerators <em>Load Generators</em>}</li>
 *   <li>{@link canopus.Monitoring#getMonitors <em>Monitors</em>}</li>
 *   <li>{@link canopus.Monitoring#getMetricModel <em>Metric Model</em>}</li>
 * </ul>
 *
 * @see canopus.CanopusPackage#getMonitoring()
 * @model
 * @generated
 */
public interface Monitoring extends Diagram {
	/**
	 * Returns the value of the '<em><b>Suts</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.SUT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suts</em>' containment reference list.
	 * @see canopus.CanopusPackage#getMonitoring_Suts()
	 * @model containment="true"
	 * @generated
	 */
	EList<SUT> getSuts();

	/**
	 * Returns the value of the '<em><b>Load Generators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Generators</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Generators</em>' containment reference.
	 * @see #setLoadGenerators(LoadGenerator)
	 * @see canopus.CanopusPackage#getMonitoring_LoadGenerators()
	 * @model containment="true"
	 * @generated
	 */
	LoadGenerator getLoadGenerators();

	/**
	 * Sets the value of the '{@link canopus.Monitoring#getLoadGenerators <em>Load Generators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Generators</em>' containment reference.
	 * @see #getLoadGenerators()
	 * @generated
	 */
	void setLoadGenerators(LoadGenerator value);

	/**
	 * Returns the value of the '<em><b>Monitors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors</em>' containment reference.
	 * @see #setMonitors(Monitor)
	 * @see canopus.CanopusPackage#getMonitoring_Monitors()
	 * @model containment="true"
	 * @generated
	 */
	Monitor getMonitors();

	/**
	 * Sets the value of the '{@link canopus.Monitoring#getMonitors <em>Monitors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitors</em>' containment reference.
	 * @see #getMonitors()
	 * @generated
	 */
	void setMonitors(Monitor value);

	/**
	 * Returns the value of the '<em><b>Metric Model</b></em>' containment reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.MetricModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Model</em>' containment reference list.
	 * @see canopus.CanopusPackage#getMonitoring_MetricModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricModel> getMetricModel();

} // Monitoring
