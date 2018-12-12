/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.CanopusPerformanceExternalFilePackage
 * @generated
 */
public interface CanopusPerformanceExternalFileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanopusPerformanceExternalFileFactory eINSTANCE = canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.impl.CanopusPerformanceExternalFileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>External File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External File</em>'.
	 * @generated
	 */
	ExternalFile createExternalFile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CanopusPerformanceExternalFilePackage getCanopusPerformanceExternalFilePackage();

} //CanopusPerformanceExternalFileFactory
