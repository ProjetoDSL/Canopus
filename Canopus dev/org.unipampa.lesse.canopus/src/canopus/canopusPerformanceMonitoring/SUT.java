/**
 */
package canopus.canopusPerformanceMonitoring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SUT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * sdsfhdfgdkfgdjgfdjkfgjkd
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.SUT#getHostname <em>Hostname</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.SUT#getIp <em>Ip</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.SUT#getHardware <em>Hardware</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.SUT#getSut <em>Sut</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.SUT#getMetricmodel <em>Metricmodel</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.SUT#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getSUT()
 * @model
 * @generated
 */
public interface SUT extends EObject {
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
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getSUT_Hostname()
	 * @model
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.SUT#getHostname <em>Hostname</em>}' attribute.
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
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getSUT_Ip()
	 * @model
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.SUT#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

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
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getSUT_Hardware()
	 * @model
	 * @generated
	 */
	HARDWARE getHardware();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.SUT#getHardware <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' attribute.
	 * @see canopus.canopusPerformanceMonitoring.HARDWARE
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(HARDWARE value);

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
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getSUT_Sut()
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
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getSUT_Metricmodel()
	 * @model containment="true"
	 * @generated
	 */
	MetricModel getMetricmodel();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.SUT#getMetricmodel <em>Metricmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metricmodel</em>' containment reference.
	 * @see #getMetricmodel()
	 * @generated
	 */
	void setMetricmodel(MetricModel value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link canopus.canopusPerformanceMonitoring.SUT_TYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see canopus.canopusPerformanceMonitoring.SUT_TYPE
	 * @see #setType(SUT_TYPE)
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getSUT_Type()
	 * @model
	 * @generated
	 */
	SUT_TYPE getType();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.SUT#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see canopus.canopusPerformanceMonitoring.SUT_TYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(SUT_TYPE value);

} // SUT
