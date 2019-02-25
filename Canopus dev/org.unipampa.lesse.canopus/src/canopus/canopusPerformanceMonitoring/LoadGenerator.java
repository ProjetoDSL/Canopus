/**
 */
package canopus.canopusPerformanceMonitoring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getHostname <em>Hostname</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getIp <em>Ip</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.LoadGenerator#isIsMonitor <em>Is Monitor</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getSut <em>Sut</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getMetricmodel <em>Metricmodel</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getHardware <em>Hardware</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getMonitor <em>Monitor</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getLoadGenerator()
 * @model
 * @generated
 */
public interface LoadGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getLoadGenerator_Hostname()
	 * @model
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getLoadGenerator_Ip()
	 * @model
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Is Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Monitor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Monitor</em>' attribute.
	 * @see #setIsMonitor(boolean)
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getLoadGenerator_IsMonitor()
	 * @model
	 * @generated
	 */
	boolean isIsMonitor();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.LoadGenerator#isIsMonitor <em>Is Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Monitor</em>' attribute.
	 * @see #isIsMonitor()
	 * @generated
	 */
	void setIsMonitor(boolean value);

	/**
	 * Returns the value of the '<em><b>Sut</b></em>' reference list.
	 * The list contents are of type {@link canopus.canopusPerformanceMonitoring.SUT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sut</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sut</em>' reference list.
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getLoadGenerator_Sut()
	 * @model
	 * @generated
	 */
	EList<SUT> getSut();

	/**
	 * Returns the value of the '<em><b>Metricmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metricmodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metricmodel</em>' containment reference.
	 * @see #setMetricmodel(MetricModel)
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getLoadGenerator_Metricmodel()
	 * @model containment="true"
	 * @generated
	 */
	MetricModel getMetricmodel();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getMetricmodel <em>Metricmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metricmodel</em>' containment reference.
	 * @see #getMetricmodel()
	 * @generated
	 */
	void setMetricmodel(MetricModel value);

	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' attribute.
	 * The literals are from the enumeration {@link canopus.canopusPerformanceMonitoring.HARDWARE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' attribute.
	 * @see canopus.canopusPerformanceMonitoring.HARDWARE
	 * @see #setHardware(HARDWARE)
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getLoadGenerator_Hardware()
	 * @model
	 * @generated
	 */
	HARDWARE getHardware();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getHardware <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' attribute.
	 * @see canopus.canopusPerformanceMonitoring.HARDWARE
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(HARDWARE value);

	/**
	 * Returns the value of the '<em><b>Monitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor</em>' reference.
	 * @see #setMonitor(Monitor)
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getLoadGenerator_Monitor()
	 * @model
	 * @generated
	 */
	Monitor getMonitor();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.LoadGenerator#getMonitor <em>Monitor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor</em>' reference.
	 * @see #getMonitor()
	 * @generated
	 */
	void setMonitor(Monitor value);

} // LoadGenerator
