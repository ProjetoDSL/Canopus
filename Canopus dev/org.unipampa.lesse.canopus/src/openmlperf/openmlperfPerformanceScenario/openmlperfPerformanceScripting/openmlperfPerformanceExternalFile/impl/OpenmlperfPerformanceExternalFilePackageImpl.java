/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.impl;

import openmlperf.OpenmlperfPackage;

import openmlperf.impl.OpenmlperfPackageImpl;

import openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage;

import openmlperf.openmlperfPerformanceMonitoring.impl.OpenmlperfPerformanceMonitoringPackageImpl;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl;

import openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage;

import openmlperf.openmlperfPerformanceScenario.impl.OpenmlperfPerformanceScenarioPackageImpl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.ExternalFile;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.OpenmlperfPerformanceExternalFileFactory;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.OpenmlperfPerformanceExternalFilePackage;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadPackage;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenmlperfPerformanceExternalFilePackageImpl extends EPackageImpl implements OpenmlperfPerformanceExternalFilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalFileEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.OpenmlperfPerformanceExternalFilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenmlperfPerformanceExternalFilePackageImpl() {
		super(eNS_URI, OpenmlperfPerformanceExternalFileFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OpenmlperfPerformanceExternalFilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenmlperfPerformanceExternalFilePackage init() {
		if (isInited) return (OpenmlperfPerformanceExternalFilePackage)EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceExternalFilePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenmlperfPerformanceExternalFilePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenmlperfPerformanceExternalFilePackageImpl theOpenmlperfPerformanceExternalFilePackage = registeredOpenmlperfPerformanceExternalFilePackage instanceof OpenmlperfPerformanceExternalFilePackageImpl ? (OpenmlperfPerformanceExternalFilePackageImpl)registeredOpenmlperfPerformanceExternalFilePackage : new OpenmlperfPerformanceExternalFilePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPackage.eNS_URI);
		OpenmlperfPackageImpl theOpenmlperfPackage = (OpenmlperfPackageImpl)(registeredPackage instanceof OpenmlperfPackageImpl ? registeredPackage : OpenmlperfPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceMonitoringPackage.eNS_URI);
		OpenmlperfPerformanceMonitoringPackageImpl theOpenmlperfPerformanceMonitoringPackage = (OpenmlperfPerformanceMonitoringPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceMonitoringPackageImpl ? registeredPackage : OpenmlperfPerformanceMonitoringPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceMetricPackage.eNS_URI);
		OpenmlperfPerformanceMetricPackageImpl theOpenmlperfPerformanceMetricPackage = (OpenmlperfPerformanceMetricPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceMetricPackageImpl ? registeredPackage : OpenmlperfPerformanceMetricPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceScenarioPackage.eNS_URI);
		OpenmlperfPerformanceScenarioPackageImpl theOpenmlperfPerformanceScenarioPackage = (OpenmlperfPerformanceScenarioPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceScenarioPackageImpl ? registeredPackage : OpenmlperfPerformanceScenarioPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceWorkloadPackage.eNS_URI);
		OpenmlperfPerformanceWorkloadPackageImpl theOpenmlperfPerformanceWorkloadPackage = (OpenmlperfPerformanceWorkloadPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceWorkloadPackageImpl ? registeredPackage : OpenmlperfPerformanceWorkloadPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceScriptingPackage.eNS_URI);
		OpenmlperfPerformanceScriptingPackageImpl theOpenmlperfPerformanceScriptingPackage = (OpenmlperfPerformanceScriptingPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceScriptingPackageImpl ? registeredPackage : OpenmlperfPerformanceScriptingPackage.eINSTANCE);

		// Create package meta-data objects
		theOpenmlperfPerformanceExternalFilePackage.createPackageContents();
		theOpenmlperfPackage.createPackageContents();
		theOpenmlperfPerformanceMonitoringPackage.createPackageContents();
		theOpenmlperfPerformanceMetricPackage.createPackageContents();
		theOpenmlperfPerformanceScenarioPackage.createPackageContents();
		theOpenmlperfPerformanceWorkloadPackage.createPackageContents();
		theOpenmlperfPerformanceScriptingPackage.createPackageContents();

		// Initialize created meta-data
		theOpenmlperfPerformanceExternalFilePackage.initializePackageContents();
		theOpenmlperfPackage.initializePackageContents();
		theOpenmlperfPerformanceMonitoringPackage.initializePackageContents();
		theOpenmlperfPerformanceMetricPackage.initializePackageContents();
		theOpenmlperfPerformanceScenarioPackage.initializePackageContents();
		theOpenmlperfPerformanceWorkloadPackage.initializePackageContents();
		theOpenmlperfPerformanceScriptingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenmlperfPerformanceExternalFilePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenmlperfPerformanceExternalFilePackage.eNS_URI, theOpenmlperfPerformanceExternalFilePackage);
		return theOpenmlperfPerformanceExternalFilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalFile() {
		return externalFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFile_Name() {
		return (EAttribute)externalFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceExternalFileFactory getOpenmlperfPerformanceExternalFileFactory() {
		return (OpenmlperfPerformanceExternalFileFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		externalFileEClass = createEClass(EXTERNAL_FILE);
		createEAttribute(externalFileEClass, EXTERNAL_FILE__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(externalFileEClass, ExternalFile.class, "ExternalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExternalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //OpenmlperfPerformanceExternalFilePackageImpl
