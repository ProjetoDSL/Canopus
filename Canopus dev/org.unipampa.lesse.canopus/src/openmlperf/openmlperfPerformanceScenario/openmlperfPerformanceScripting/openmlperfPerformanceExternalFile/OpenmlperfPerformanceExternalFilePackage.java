/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile;

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
 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.OpenmlperfPerformanceExternalFileFactory
 * @model kind="package"
 * @generated
 */
public interface OpenmlperfPerformanceExternalFilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openmlperfPerformanceExternalFile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unipampa.lesse.org/openmlperfPerfoamnceExternalFile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openmlperfPerformanceExternalFile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenmlperfPerformanceExternalFilePackage eINSTANCE = openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.impl.OpenmlperfPerformanceExternalFilePackageImpl.init();

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.impl.ExternalFileImpl <em>External File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.impl.ExternalFileImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.impl.OpenmlperfPerformanceExternalFilePackageImpl#getExternalFile()
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
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.ExternalFile <em>External File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External File</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.ExternalFile
	 * @generated
	 */
	EClass getExternalFile();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.ExternalFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.ExternalFile#getName()
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
	OpenmlperfPerformanceExternalFileFactory getOpenmlperfPerformanceExternalFileFactory();

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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.impl.ExternalFileImpl <em>External File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.impl.ExternalFileImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.impl.OpenmlperfPerformanceExternalFilePackageImpl#getExternalFile()
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

} //OpenmlperfPerformanceExternalFilePackage
