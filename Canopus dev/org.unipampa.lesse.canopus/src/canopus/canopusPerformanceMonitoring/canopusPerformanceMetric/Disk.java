/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk#getDisk_io_counter <em>Disk io counter</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getDisk()
 * @model
 * @generated
 */
public interface Disk extends Metric {
	/**
	 * Returns the value of the '<em><b>Disk io counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk io counter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk io counter</em>' reference.
	 * @see #setDisk_io_counter(Disk_IO_Counter)
	 * @see canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage#getDisk_Disk_io_counter()
	 * @model
	 * @generated
	 */
	Disk_IO_Counter getDisk_io_counter();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk#getDisk_io_counter <em>Disk io counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk io counter</em>' reference.
	 * @see #getDisk_io_counter()
	 * @generated
	 */
	void setDisk_io_counter(Disk_IO_Counter value);

} // Disk
