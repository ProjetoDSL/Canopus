/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk#getDisk_io_counter <em>Disk io counter</em>}</li>
 * </ul>
 *
 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getDisk()
 * @model
 * @generated
 */
public interface Disk extends Metric {
	/**
	 * Returns the value of the '<em><b>Disk io counter</b></em>' reference list.
	 * The list contents are of type {@link openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk_IO_Counter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk io counter</em>' reference list.
	 * @see openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage#getDisk_Disk_io_counter()
	 * @model
	 * @generated
	 */
	EList<Disk_IO_Counter> getDisk_io_counter();

} // Disk
