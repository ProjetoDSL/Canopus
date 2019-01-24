/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl;

import canopus.CanopusPackage;

import canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl;

import canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl;

import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.CanopusPerformanceExternalFilePackage;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.impl.CanopusPerformanceExternalFilePackageImpl;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadFactory;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTimer;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.TestDuration;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers;

import canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl;

import canopus.impl.CanopusPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CanopusPerformanceWorkloadPackageImpl extends EPackageImpl implements CanopusPerformanceWorkloadPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualUsersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rampUpUsersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rampDownUsersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rampUpTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rampDownTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rampUpTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rampDownTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

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
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CanopusPerformanceWorkloadPackageImpl() {
		super(eNS_URI, CanopusPerformanceWorkloadFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CanopusPerformanceWorkloadPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CanopusPerformanceWorkloadPackage init() {
		if (isInited) return (CanopusPerformanceWorkloadPackage)EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceWorkloadPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCanopusPerformanceWorkloadPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CanopusPerformanceWorkloadPackageImpl theCanopusPerformanceWorkloadPackage = registeredCanopusPerformanceWorkloadPackage instanceof CanopusPerformanceWorkloadPackageImpl ? (CanopusPerformanceWorkloadPackageImpl)registeredCanopusPerformanceWorkloadPackage : new CanopusPerformanceWorkloadPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPackage.eNS_URI);
		CanopusPackageImpl theCanopusPackage = (CanopusPackageImpl)(registeredPackage instanceof CanopusPackageImpl ? registeredPackage : CanopusPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceMonitoringPackage.eNS_URI);
		CanopusPerformanceMonitoringPackageImpl theCanopusPerformanceMonitoringPackage = (CanopusPerformanceMonitoringPackageImpl)(registeredPackage instanceof CanopusPerformanceMonitoringPackageImpl ? registeredPackage : CanopusPerformanceMonitoringPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceMetricPackage.eNS_URI);
		CanopusPerformanceMetricPackageImpl theCanopusPerformanceMetricPackage = (CanopusPerformanceMetricPackageImpl)(registeredPackage instanceof CanopusPerformanceMetricPackageImpl ? registeredPackage : CanopusPerformanceMetricPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceScenarioPackage.eNS_URI);
		CanopusPerformanceScenarioPackageImpl theCanopusPerformanceScenarioPackage = (CanopusPerformanceScenarioPackageImpl)(registeredPackage instanceof CanopusPerformanceScenarioPackageImpl ? registeredPackage : CanopusPerformanceScenarioPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceScriptingPackage.eNS_URI);
		CanopusPerformanceScriptingPackageImpl theCanopusPerformanceScriptingPackage = (CanopusPerformanceScriptingPackageImpl)(registeredPackage instanceof CanopusPerformanceScriptingPackageImpl ? registeredPackage : CanopusPerformanceScriptingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceExternalFilePackage.eNS_URI);
		CanopusPerformanceExternalFilePackageImpl theCanopusPerformanceExternalFilePackage = (CanopusPerformanceExternalFilePackageImpl)(registeredPackage instanceof CanopusPerformanceExternalFilePackageImpl ? registeredPackage : CanopusPerformanceExternalFilePackage.eINSTANCE);

		// Create package meta-data objects
		theCanopusPerformanceWorkloadPackage.createPackageContents();
		theCanopusPackage.createPackageContents();
		theCanopusPerformanceMonitoringPackage.createPackageContents();
		theCanopusPerformanceMetricPackage.createPackageContents();
		theCanopusPerformanceScenarioPackage.createPackageContents();
		theCanopusPerformanceScriptingPackage.createPackageContents();
		theCanopusPerformanceExternalFilePackage.createPackageContents();

		// Initialize created meta-data
		theCanopusPerformanceWorkloadPackage.initializePackageContents();
		theCanopusPackage.initializePackageContents();
		theCanopusPerformanceMonitoringPackage.initializePackageContents();
		theCanopusPerformanceMetricPackage.initializePackageContents();
		theCanopusPerformanceScenarioPackage.initializePackageContents();
		theCanopusPerformanceScriptingPackage.initializePackageContents();
		theCanopusPerformanceExternalFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCanopusPerformanceWorkloadPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CanopusPerformanceWorkloadPackage.eNS_URI, theCanopusPerformanceWorkloadPackage);
		return theCanopusPerformanceWorkloadPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualUsers() {
		return virtualUsersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualUsers_VirtualUsers() {
		return (EAttribute)virtualUsersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestDuration() {
		return testDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestDuration_Time() {
		return (EAttribute)testDurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRampUpUsers() {
		return rampUpUsersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRampUpUsers_VirtualUsers() {
		return (EAttribute)rampUpUsersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRampDownUsers() {
		return rampDownUsersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRampDownUsers_VirtualUsers() {
		return (EAttribute)rampDownUsersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRampUpTimer() {
		return rampUpTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRampUpTimer_Time() {
		return (EAttribute)rampUpTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRampDownTimer() {
		return rampDownTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRampDownTimer_Time() {
		return (EAttribute)rampDownTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRampUpTest() {
		return rampUpTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRampUpTest_Rampuptimer() {
		return (EReference)rampUpTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRampUpTest_Rampupusers() {
		return (EReference)rampUpTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRampDownTest() {
		return rampDownTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRampDownTest_Rampdowntimer() {
		return (EReference)rampDownTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRampDownTest_Rampdownusers() {
		return (EReference)rampDownTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Testduration() {
		return (EReference)testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Virtualusers() {
		return (EReference)testEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceWorkloadFactory getCanopusPerformanceWorkloadFactory() {
		return (CanopusPerformanceWorkloadFactory)getEFactoryInstance();
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
		virtualUsersEClass = createEClass(VIRTUAL_USERS);
		createEAttribute(virtualUsersEClass, VIRTUAL_USERS__VIRTUAL_USERS);

		testDurationEClass = createEClass(TEST_DURATION);
		createEAttribute(testDurationEClass, TEST_DURATION__TIME);

		rampUpUsersEClass = createEClass(RAMP_UP_USERS);
		createEAttribute(rampUpUsersEClass, RAMP_UP_USERS__VIRTUAL_USERS);

		rampDownUsersEClass = createEClass(RAMP_DOWN_USERS);
		createEAttribute(rampDownUsersEClass, RAMP_DOWN_USERS__VIRTUAL_USERS);

		rampUpTimerEClass = createEClass(RAMP_UP_TIMER);
		createEAttribute(rampUpTimerEClass, RAMP_UP_TIMER__TIME);

		rampDownTimerEClass = createEClass(RAMP_DOWN_TIMER);
		createEAttribute(rampDownTimerEClass, RAMP_DOWN_TIMER__TIME);

		rampUpTestEClass = createEClass(RAMP_UP_TEST);
		createEReference(rampUpTestEClass, RAMP_UP_TEST__RAMPUPTIMER);
		createEReference(rampUpTestEClass, RAMP_UP_TEST__RAMPUPUSERS);

		rampDownTestEClass = createEClass(RAMP_DOWN_TEST);
		createEReference(rampDownTestEClass, RAMP_DOWN_TEST__RAMPDOWNTIMER);
		createEReference(rampDownTestEClass, RAMP_DOWN_TEST__RAMPDOWNUSERS);

		testEClass = createEClass(TEST);
		createEReference(testEClass, TEST__TESTDURATION);
		createEReference(testEClass, TEST__VIRTUALUSERS);
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
		initEClass(virtualUsersEClass, VirtualUsers.class, "VirtualUsers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualUsers_VirtualUsers(), ecorePackage.getEInt(), "virtualUsers", null, 0, 1, VirtualUsers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testDurationEClass, TestDuration.class, "TestDuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestDuration_Time(), ecorePackage.getEString(), "time", null, 0, 1, TestDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampUpUsersEClass, RampUpUsers.class, "RampUpUsers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRampUpUsers_VirtualUsers(), ecorePackage.getEInt(), "virtualUsers", null, 0, 1, RampUpUsers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampDownUsersEClass, RampDownUsers.class, "RampDownUsers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRampDownUsers_VirtualUsers(), ecorePackage.getEInt(), "virtualUsers", null, 0, 1, RampDownUsers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampUpTimerEClass, RampUpTimer.class, "RampUpTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRampUpTimer_Time(), ecorePackage.getEInt(), "time", null, 0, 1, RampUpTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampDownTimerEClass, RampDownTimer.class, "RampDownTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRampDownTimer_Time(), ecorePackage.getEInt(), "time", null, 0, 1, RampDownTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampUpTestEClass, RampUpTest.class, "RampUpTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRampUpTest_Rampuptimer(), this.getRampUpTimer(), null, "rampuptimer", null, 0, 1, RampUpTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRampUpTest_Rampupusers(), this.getRampUpUsers(), null, "rampupusers", null, 0, 1, RampUpTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampDownTestEClass, RampDownTest.class, "RampDownTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRampDownTest_Rampdowntimer(), this.getRampDownTimer(), null, "rampdowntimer", null, 0, 1, RampDownTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRampDownTest_Rampdownusers(), this.getRampDownUsers(), null, "rampdownusers", null, 0, 1, RampDownTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEClass, Test.class, "Test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTest_Testduration(), this.getTestDuration(), null, "testduration", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_Virtualusers(), this.getVirtualUsers(), null, "virtualusers", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CanopusPerformanceWorkloadPackageImpl
