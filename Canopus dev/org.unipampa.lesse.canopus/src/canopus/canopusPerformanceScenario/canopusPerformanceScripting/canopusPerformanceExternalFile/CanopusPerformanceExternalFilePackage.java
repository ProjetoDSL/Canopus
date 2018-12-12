/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.CanopusPerformanceExternalFileFactory
 * @model kind="package"
 * @generated
 */
public interface CanopusPerformanceExternalFilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "canopusPerformanceExternalFile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unipampa.lesse.org/canopusPerfoamnceExternalFile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "canopusPerformanceExternalFile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanopusPerformanceExternalFilePackage eINSTANCE = canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.impl.CanopusPerformanceExternalFilePackageImpl.init();

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.impl.ExternalFileImpl <em>External File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.impl.ExternalFileImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.impl.CanopusPerformanceExternalFilePackageImpl#getExternalFile()
	 * @generated
	 */
	int EXTERNAL_FILE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FILE__NAME = 0;

	/**
	 * The number of structural features of the '<em>External File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>External File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FILE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.ExternalFile <em>External File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External File</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.ExternalFile
	 * @generated
	 */
	EClass getExternalFile();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.ExternalFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.ExternalFile#getName()
	 * @see #getExternalFile()
	 * @generated
	 */
	EAttribute getExternalFile_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CanopusPerformanceExternalFileFactory getCanopusPerformanceExternalFileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.impl.ExternalFileImpl <em>External File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.impl.ExternalFileImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.impl.CanopusPerformanceExternalFilePackageImpl#getExternalFile()
		 * @generated
		 */
		EClass EXTERNAL_FILE = eINSTANCE.getExternalFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FILE__NAME = eINSTANCE.getExternalFile_Name();

	}

} //CanopusPerformanceExternalFilePackage
