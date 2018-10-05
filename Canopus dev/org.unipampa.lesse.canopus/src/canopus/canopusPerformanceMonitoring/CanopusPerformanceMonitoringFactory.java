/**
 */
package canopus.canopusPerformanceMonitoring;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage
 * @generated
 */
public interface CanopusPerformanceMonitoringFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanopusPerformanceMonitoringFactory eINSTANCE = canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SUT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SUT</em>'.
	 * @generated
	 */
	SUT createSUT();

	/**
	 * Returns a new object of class '<em>Load Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Generator</em>'.
	 * @generated
	 */
	LoadGenerator createLoadGenerator();

	/**
	 * Returns a new object of class '<em>Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitor</em>'.
	 * @generated
	 */
	Monitor createMonitor();

	/**
	 * Returns a new object of class '<em>Metric Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric Model</em>'.
	 * @generated
	 */
	MetricModel createMetricModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CanopusPerformanceMonitoringPackage getCanopusPerformanceMonitoringPackage();

} //CanopusPerformanceMonitoringFactory
