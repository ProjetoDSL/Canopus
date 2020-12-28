/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl;

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

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.OpenmlperfPerformanceExternalFilePackage;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.impl.OpenmlperfPerformanceExternalFilePackageImpl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadFactory;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadPackage;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownTimer;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownUsers;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpTimer;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpUsers;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.TimeTypeRamps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenmlperfPerformanceWorkloadPackageImpl extends EPackageImpl implements OpenmlperfPerformanceWorkloadPackage {
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
	private EEnum timeTypeRampsEEnum = null;

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
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenmlperfPerformanceWorkloadPackageImpl() {
		super(eNS_URI, OpenmlperfPerformanceWorkloadFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OpenmlperfPerformanceWorkloadPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenmlperfPerformanceWorkloadPackage init() {
		if (isInited) return (OpenmlperfPerformanceWorkloadPackage)EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceWorkloadPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenmlperfPerformanceWorkloadPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenmlperfPerformanceWorkloadPackageImpl theOpenmlperfPerformanceWorkloadPackage = registeredOpenmlperfPerformanceWorkloadPackage instanceof OpenmlperfPerformanceWorkloadPackageImpl ? (OpenmlperfPerformanceWorkloadPackageImpl)registeredOpenmlperfPerformanceWorkloadPackage : new OpenmlperfPerformanceWorkloadPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPackage.eNS_URI);
		OpenmlperfPackageImpl theOpenmlperfPackage = (OpenmlperfPackageImpl)(registeredPackage instanceof OpenmlperfPackageImpl ? registeredPackage : OpenmlperfPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceMonitoringPackage.eNS_URI);
		OpenmlperfPerformanceMonitoringPackageImpl theOpenmlperfPerformanceMonitoringPackage = (OpenmlperfPerformanceMonitoringPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceMonitoringPackageImpl ? registeredPackage : OpenmlperfPerformanceMonitoringPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceMetricPackage.eNS_URI);
		OpenmlperfPerformanceMetricPackageImpl theOpenmlperfPerformanceMetricPackage = (OpenmlperfPerformanceMetricPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceMetricPackageImpl ? registeredPackage : OpenmlperfPerformanceMetricPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceScenarioPackage.eNS_URI);
		OpenmlperfPerformanceScenarioPackageImpl theOpenmlperfPerformanceScenarioPackage = (OpenmlperfPerformanceScenarioPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceScenarioPackageImpl ? registeredPackage : OpenmlperfPerformanceScenarioPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceScriptingPackage.eNS_URI);
		OpenmlperfPerformanceScriptingPackageImpl theOpenmlperfPerformanceScriptingPackage = (OpenmlperfPerformanceScriptingPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceScriptingPackageImpl ? registeredPackage : OpenmlperfPerformanceScriptingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceExternalFilePackage.eNS_URI);
		OpenmlperfPerformanceExternalFilePackageImpl theOpenmlperfPerformanceExternalFilePackage = (OpenmlperfPerformanceExternalFilePackageImpl)(registeredPackage instanceof OpenmlperfPerformanceExternalFilePackageImpl ? registeredPackage : OpenmlperfPerformanceExternalFilePackage.eINSTANCE);

		// Create package meta-data objects
		theOpenmlperfPerformanceWorkloadPackage.createPackageContents();
		theOpenmlperfPackage.createPackageContents();
		theOpenmlperfPerformanceMonitoringPackage.createPackageContents();
		theOpenmlperfPerformanceMetricPackage.createPackageContents();
		theOpenmlperfPerformanceScenarioPackage.createPackageContents();
		theOpenmlperfPerformanceScriptingPackage.createPackageContents();
		theOpenmlperfPerformanceExternalFilePackage.createPackageContents();

		// Initialize created meta-data
		theOpenmlperfPerformanceWorkloadPackage.initializePackageContents();
		theOpenmlperfPackage.initializePackageContents();
		theOpenmlperfPerformanceMonitoringPackage.initializePackageContents();
		theOpenmlperfPerformanceMetricPackage.initializePackageContents();
		theOpenmlperfPerformanceScenarioPackage.initializePackageContents();
		theOpenmlperfPerformanceScriptingPackage.initializePackageContents();
		theOpenmlperfPerformanceExternalFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenmlperfPerformanceWorkloadPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenmlperfPerformanceWorkloadPackage.eNS_URI, theOpenmlperfPerformanceWorkloadPackage);
		return theOpenmlperfPerformanceWorkloadPackage;
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
	public EAttribute getRampUpTimer_TimeType() {
		return (EAttribute)rampUpTimerEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getRampDownTimer_TimeType() {
		return (EAttribute)rampDownTimerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeTypeRamps() {
		return timeTypeRampsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceWorkloadFactory getOpenmlperfPerformanceWorkloadFactory() {
		return (OpenmlperfPerformanceWorkloadFactory)getEFactoryInstance();
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
		rampUpUsersEClass = createEClass(RAMP_UP_USERS);
		createEAttribute(rampUpUsersEClass, RAMP_UP_USERS__VIRTUAL_USERS);

		rampDownUsersEClass = createEClass(RAMP_DOWN_USERS);
		createEAttribute(rampDownUsersEClass, RAMP_DOWN_USERS__VIRTUAL_USERS);

		rampUpTimerEClass = createEClass(RAMP_UP_TIMER);
		createEAttribute(rampUpTimerEClass, RAMP_UP_TIMER__TIME);
		createEAttribute(rampUpTimerEClass, RAMP_UP_TIMER__TIME_TYPE);

		rampDownTimerEClass = createEClass(RAMP_DOWN_TIMER);
		createEAttribute(rampDownTimerEClass, RAMP_DOWN_TIMER__TIME);
		createEAttribute(rampDownTimerEClass, RAMP_DOWN_TIMER__TIME_TYPE);

		// Create enums
		timeTypeRampsEEnum = createEEnum(TIME_TYPE_RAMPS);
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

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rampUpUsersEClass, RampUpUsers.class, "RampUpUsers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRampUpUsers_VirtualUsers(), ecorePackage.getEInt(), "virtualUsers", null, 0, 1, RampUpUsers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampDownUsersEClass, RampDownUsers.class, "RampDownUsers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRampDownUsers_VirtualUsers(), ecorePackage.getEInt(), "virtualUsers", null, 0, 1, RampDownUsers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampUpTimerEClass, RampUpTimer.class, "RampUpTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRampUpTimer_Time(), theXMLTypePackage.getInt(), "time", null, 0, 1, RampUpTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRampUpTimer_TimeType(), this.getTimeTypeRamps(), "timeType", null, 0, 1, RampUpTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampDownTimerEClass, RampDownTimer.class, "RampDownTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRampDownTimer_Time(), theXMLTypePackage.getInt(), "time", null, 0, 1, RampDownTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRampDownTimer_TimeType(), this.getTimeTypeRamps(), "timeType", null, 0, 1, RampDownTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timeTypeRampsEEnum, TimeTypeRamps.class, "TimeTypeRamps");
		addEEnumLiteral(timeTypeRampsEEnum, TimeTypeRamps.SECONDS);
		addEEnumLiteral(timeTypeRampsEEnum, TimeTypeRamps.MINUTES);
		addEEnumLiteral(timeTypeRampsEEnum, TimeTypeRamps.HOURS);
	}

} //OpenmlperfPerformanceWorkloadPackageImpl
