/**
 */
package openmlperf.openmlperfPerformanceScenario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage
 * @generated
 */
public interface OpenmlperfPerformanceScenarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenmlperfPerformanceScenarioFactory eINSTANCE = openmlperf.openmlperfPerformanceScenario.impl.OpenmlperfPerformanceScenarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Profile</em>'.
	 * @generated
	 */
	UserProfile createUserProfile();

	/**
	 * Returns a new object of class '<em>Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workload</em>'.
	 * @generated
	 */
	Workload createWorkload();

	/**
	 * Returns a new object of class '<em>Scripting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scripting</em>'.
	 * @generated
	 */
	Scripting createScripting();

	/**
	 * Returns a new object of class '<em>User Profile To Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Profile To Script</em>'.
	 * @generated
	 */
	UserProfileToScript createUserProfileToScript();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OpenmlperfPerformanceScenarioPackage getOpenmlperfPerformanceScenarioPackage();

} //OpenmlperfPerformanceScenarioFactory
