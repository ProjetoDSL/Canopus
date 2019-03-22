/**
 */
package canopus.canopusPerformanceMonitoring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.Monitor#getHostname <em>Hostname</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.Monitor#getIp <em>Ip</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.Monitor#getSut <em>Sut</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.Monitor#getHardware <em>Hardware</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.Monitor#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMonitor()
 * @model
 * @generated
 */
public interface Monitor extends EObject {
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
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMonitor_Hostname()
	 * @model
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.Monitor#getHostname <em>Hostname</em>}' attribute.
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
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMonitor_Ip()
	 * @model
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.Monitor#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

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
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMonitor_Sut()
	 * @model
	 * @generated
	 */
	EList<SUT> getSut();

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
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMonitor_Hardware()
	 * @model
	 * @generated
	 */
	HARDWARE getHardware();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.Monitor#getHardware <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' attribute.
	 * @see canopus.canopusPerformanceMonitoring.HARDWARE
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(HARDWARE value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"Machine responsible for monitoring the performance metrics of the SUT. This object is optional, since the Load Generator object, besides generating workload for virtual users, can also play the role of monitoring."</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage#getMonitor_Description()
	 * @model default="Machine responsible for monitoring the performance metrics of the SUT. This object is optional, since the Load Generator object, besides generating workload for virtual users, can also play the role of monitoring." unsettable="true" changeable="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns whether the value of the '{@link canopus.canopusPerformanceMonitoring.Monitor#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #getDescription()
	 * @generated
	 */
	boolean isSetDescription();

} // Monitor
