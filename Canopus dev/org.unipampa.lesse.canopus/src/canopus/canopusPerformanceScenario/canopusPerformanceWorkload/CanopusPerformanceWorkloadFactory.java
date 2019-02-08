/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage
 * @generated
 */
public interface CanopusPerformanceWorkloadFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanopusPerformanceWorkloadFactory eINSTANCE = canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ramp Up Users</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ramp Up Users</em>'.
	 * @generated
	 */
	RampUpUsers createRampUpUsers();

	/**
	 * Returns a new object of class '<em>Ramp Down Users</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ramp Down Users</em>'.
	 * @generated
	 */
	RampDownUsers createRampDownUsers();

	/**
	 * Returns a new object of class '<em>Ramp Up Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ramp Up Timer</em>'.
	 * @generated
	 */
	RampUpTimer createRampUpTimer();

	/**
	 * Returns a new object of class '<em>Ramp Down Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ramp Down Timer</em>'.
	 * @generated
	 */
	RampDownTimer createRampDownTimer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CanopusPerformanceWorkloadPackage getCanopusPerformanceWorkloadPackage();

} //CanopusPerformanceWorkloadFactory
