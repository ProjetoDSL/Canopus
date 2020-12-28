/**
 */
package openmlperf.openmlperfPerformanceScenario.impl;

import openmlperf.OpenmlperfPackage;

import openmlperf.impl.OpenmlperfPackageImpl;

import openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringPackage;

import openmlperf.openmlperfPerformanceMonitoring.impl.OpenmlperfPerformanceMonitoringPackageImpl;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricPackage;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.impl.OpenmlperfPerformanceMetricPackageImpl;

import openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioFactory;
import openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage;
import openmlperf.openmlperfPerformanceScenario.Scripting;
import openmlperf.openmlperfPerformanceScenario.TimeType;
import openmlperf.openmlperfPerformanceScenario.UserProfile;
import openmlperf.openmlperfPerformanceScenario.UserProfileToScript;
import openmlperf.openmlperfPerformanceScenario.Workload;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.OpenmlperfPerformanceExternalFilePackage;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.impl.OpenmlperfPerformanceExternalFilePackageImpl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadPackage;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenmlperfPerformanceScenarioPackageImpl extends EPackageImpl implements OpenmlperfPerformanceScenarioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userProfileToScriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeTypeEEnum = null;

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
	 * @see openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenmlperfPerformanceScenarioPackageImpl() {
		super(eNS_URI, OpenmlperfPerformanceScenarioFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OpenmlperfPerformanceScenarioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenmlperfPerformanceScenarioPackage init() {
		if (isInited) return (OpenmlperfPerformanceScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceScenarioPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenmlperfPerformanceScenarioPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenmlperfPerformanceScenarioPackageImpl theOpenmlperfPerformanceScenarioPackage = registeredOpenmlperfPerformanceScenarioPackage instanceof OpenmlperfPerformanceScenarioPackageImpl ? (OpenmlperfPerformanceScenarioPackageImpl)registeredOpenmlperfPerformanceScenarioPackage : new OpenmlperfPerformanceScenarioPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceWorkloadPackage.eNS_URI);
		OpenmlperfPerformanceWorkloadPackageImpl theOpenmlperfPerformanceWorkloadPackage = (OpenmlperfPerformanceWorkloadPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceWorkloadPackageImpl ? registeredPackage : OpenmlperfPerformanceWorkloadPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceScriptingPackage.eNS_URI);
		OpenmlperfPerformanceScriptingPackageImpl theOpenmlperfPerformanceScriptingPackage = (OpenmlperfPerformanceScriptingPackageImpl)(registeredPackage instanceof OpenmlperfPerformanceScriptingPackageImpl ? registeredPackage : OpenmlperfPerformanceScriptingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceExternalFilePackage.eNS_URI);
		OpenmlperfPerformanceExternalFilePackageImpl theOpenmlperfPerformanceExternalFilePackage = (OpenmlperfPerformanceExternalFilePackageImpl)(registeredPackage instanceof OpenmlperfPerformanceExternalFilePackageImpl ? registeredPackage : OpenmlperfPerformanceExternalFilePackage.eINSTANCE);

		// Create package meta-data objects
		theOpenmlperfPerformanceScenarioPackage.createPackageContents();
		theOpenmlperfPackage.createPackageContents();
		theOpenmlperfPerformanceMonitoringPackage.createPackageContents();
		theOpenmlperfPerformanceMetricPackage.createPackageContents();
		theOpenmlperfPerformanceWorkloadPackage.createPackageContents();
		theOpenmlperfPerformanceScriptingPackage.createPackageContents();
		theOpenmlperfPerformanceExternalFilePackage.createPackageContents();

		// Initialize created meta-data
		theOpenmlperfPerformanceScenarioPackage.initializePackageContents();
		theOpenmlperfPackage.initializePackageContents();
		theOpenmlperfPerformanceMonitoringPackage.initializePackageContents();
		theOpenmlperfPerformanceMetricPackage.initializePackageContents();
		theOpenmlperfPerformanceWorkloadPackage.initializePackageContents();
		theOpenmlperfPerformanceScriptingPackage.initializePackageContents();
		theOpenmlperfPerformanceExternalFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenmlperfPerformanceScenarioPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenmlperfPerformanceScenarioPackage.eNS_URI, theOpenmlperfPerformanceScenarioPackage);
		return theOpenmlperfPerformanceScenarioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserProfile() {
		return userProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProfile_Name() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProfile_Description() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProfile_Userprofiletoscript() {
		return (EReference)userProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProfile_Percentage() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkload() {
		return workloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkload_RampUpTimer() {
		return (EReference)workloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkload_RampDownUsers() {
		return (EReference)workloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkload_RampUpUsers() {
		return (EReference)workloadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkload_RampDownTimer() {
		return (EReference)workloadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkload_Name() {
		return (EAttribute)workloadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkload_Time() {
		return (EAttribute)workloadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkload_VirtualUsers() {
		return (EAttribute)workloadEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkload_TimeType() {
		return (EAttribute)workloadEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScripting() {
		return scriptingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScripting_Name() {
		return (EAttribute)scriptingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScripting_Initial() {
		return (EReference)scriptingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScripting_Final() {
		return (EReference)scriptingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScripting_Activities() {
		return (EReference)scriptingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScripting_Saveparameters() {
		return (EReference)scriptingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScripting_Datatables() {
		return (EReference)scriptingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScripting_ThinkTime() {
		return (EReference)scriptingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScripting_Scripts() {
		return (EReference)scriptingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScripting_Userprofiletoscript() {
		return (EReference)scriptingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScripting_Paramenters() {
		return (EReference)scriptingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScripting_ActivityToActivity() {
		return (EReference)scriptingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScripting_Columns() {
		return (EReference)scriptingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScripting_Description() {
		return (EAttribute)scriptingEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserProfileToScript() {
		return userProfileToScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProfileToScript_TimePercentage() {
		return (EAttribute)userProfileToScriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProfileToScript_Userprofile() {
		return (EReference)userProfileToScriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProfileToScript_Scripting() {
		return (EReference)userProfileToScriptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeType() {
		return timeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceScenarioFactory getOpenmlperfPerformanceScenarioFactory() {
		return (OpenmlperfPerformanceScenarioFactory)getEFactoryInstance();
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
		userProfileEClass = createEClass(USER_PROFILE);
		createEAttribute(userProfileEClass, USER_PROFILE__NAME);
		createEAttribute(userProfileEClass, USER_PROFILE__DESCRIPTION);
		createEReference(userProfileEClass, USER_PROFILE__USERPROFILETOSCRIPT);
		createEAttribute(userProfileEClass, USER_PROFILE__PERCENTAGE);

		workloadEClass = createEClass(WORKLOAD);
		createEReference(workloadEClass, WORKLOAD__RAMP_UP_TIMER);
		createEReference(workloadEClass, WORKLOAD__RAMP_DOWN_USERS);
		createEReference(workloadEClass, WORKLOAD__RAMP_UP_USERS);
		createEReference(workloadEClass, WORKLOAD__RAMP_DOWN_TIMER);
		createEAttribute(workloadEClass, WORKLOAD__NAME);
		createEAttribute(workloadEClass, WORKLOAD__TIME);
		createEAttribute(workloadEClass, WORKLOAD__VIRTUAL_USERS);
		createEAttribute(workloadEClass, WORKLOAD__TIME_TYPE);

		scriptingEClass = createEClass(SCRIPTING);
		createEAttribute(scriptingEClass, SCRIPTING__NAME);
		createEReference(scriptingEClass, SCRIPTING__INITIAL);
		createEReference(scriptingEClass, SCRIPTING__FINAL);
		createEReference(scriptingEClass, SCRIPTING__ACTIVITIES);
		createEReference(scriptingEClass, SCRIPTING__SAVEPARAMETERS);
		createEReference(scriptingEClass, SCRIPTING__DATATABLES);
		createEReference(scriptingEClass, SCRIPTING__THINK_TIME);
		createEReference(scriptingEClass, SCRIPTING__SCRIPTS);
		createEReference(scriptingEClass, SCRIPTING__USERPROFILETOSCRIPT);
		createEReference(scriptingEClass, SCRIPTING__PARAMENTERS);
		createEReference(scriptingEClass, SCRIPTING__ACTIVITY_TO_ACTIVITY);
		createEReference(scriptingEClass, SCRIPTING__COLUMNS);
		createEAttribute(scriptingEClass, SCRIPTING__DESCRIPTION);

		userProfileToScriptEClass = createEClass(USER_PROFILE_TO_SCRIPT);
		createEAttribute(userProfileToScriptEClass, USER_PROFILE_TO_SCRIPT__TIME_PERCENTAGE);
		createEReference(userProfileToScriptEClass, USER_PROFILE_TO_SCRIPT__USERPROFILE);
		createEReference(userProfileToScriptEClass, USER_PROFILE_TO_SCRIPT__SCRIPTING);

		// Create enums
		timeTypeEEnum = createEEnum(TIME_TYPE);
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
		OpenmlperfPerformanceWorkloadPackage theOpenmlperfPerformanceWorkloadPackage = (OpenmlperfPerformanceWorkloadPackage)EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceWorkloadPackage.eNS_URI);
		OpenmlperfPerformanceScriptingPackage theOpenmlperfPerformanceScriptingPackage = (OpenmlperfPerformanceScriptingPackage)EPackage.Registry.INSTANCE.getEPackage(OpenmlperfPerformanceScriptingPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theOpenmlperfPerformanceWorkloadPackage);
		getESubpackages().add(theOpenmlperfPerformanceScriptingPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(userProfileEClass, UserProfile.class, "UserProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserProfile_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProfile_Description(), ecorePackage.getEString(), "description", null, 0, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserProfile_Userprofiletoscript(), this.getUserProfileToScript(), this.getUserProfileToScript_Userprofile(), "userprofiletoscript", null, 0, -1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProfile_Percentage(), ecorePackage.getEString(), "percentage", null, 0, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workloadEClass, Workload.class, "Workload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkload_RampUpTimer(), theOpenmlperfPerformanceWorkloadPackage.getRampUpTimer(), null, "rampUpTimer", null, 1, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkload_RampDownUsers(), theOpenmlperfPerformanceWorkloadPackage.getRampDownUsers(), null, "rampDownUsers", null, 1, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkload_RampUpUsers(), theOpenmlperfPerformanceWorkloadPackage.getRampUpUsers(), null, "rampUpUsers", null, 1, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkload_RampDownTimer(), theOpenmlperfPerformanceWorkloadPackage.getRampDownTimer(), null, "rampDownTimer", null, 1, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkload_Name(), ecorePackage.getEString(), "name", null, 0, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkload_Time(), theXMLTypePackage.getInt(), "time", null, 0, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkload_VirtualUsers(), ecorePackage.getEInt(), "virtualUsers", null, 0, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkload_TimeType(), this.getTimeType(), "timeType", null, 0, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptingEClass, Scripting.class, "Scripting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScripting_Name(), ecorePackage.getEString(), "name", null, 0, 1, Scripting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScripting_Initial(), theOpenmlperfPerformanceScriptingPackage.getInitial(), null, "initial", null, 1, 1, Scripting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScripting_Final(), theOpenmlperfPerformanceScriptingPackage.getFinal(), null, "final", null, 1, 1, Scripting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScripting_Activities(), theOpenmlperfPerformanceScriptingPackage.getActivity(), null, "activities", null, 1, -1, Scripting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScripting_Saveparameters(), theOpenmlperfPerformanceScriptingPackage.getSaveParameters(), null, "saveparameters", null, 1, -1, Scripting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScripting_Datatables(), theOpenmlperfPerformanceScriptingPackage.getDataTable(), null, "datatables", null, 0, -1, Scripting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScripting_ThinkTime(), theOpenmlperfPerformanceScriptingPackage.getThinkTime(), null, "thinkTime", null, 0, -1, Scripting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScripting_Scripts(), this.getScripting(), null, "scripts", null, 0, -1, Scripting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScripting_Userprofiletoscript(), this.getUserProfileToScript(), this.getUserProfileToScript_Scripting(), "userprofiletoscript", null, 0, -1, Scripting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScripting_Paramenters(), theOpenmlperfPerformanceScriptingPackage.getParameterObject(), null, "paramenters", null, 0, -1, Scripting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScripting_ActivityToActivity(), theOpenmlperfPerformanceScriptingPackage.getActivityToActivity(), null, "activityToActivity", null, 0, -1, Scripting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScripting_Columns(), theOpenmlperfPerformanceScriptingPackage.getColumnsObject(), null, "columns", null, 0, -1, Scripting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScripting_Description(), ecorePackage.getEString(), "description", null, 0, 1, Scripting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userProfileToScriptEClass, UserProfileToScript.class, "UserProfileToScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserProfileToScript_TimePercentage(), ecorePackage.getEInt(), "timePercentage", null, 0, 1, UserProfileToScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserProfileToScript_Userprofile(), this.getUserProfile(), this.getUserProfile_Userprofiletoscript(), "userprofile", null, 0, -1, UserProfileToScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserProfileToScript_Scripting(), this.getScripting(), this.getScripting_Userprofiletoscript(), "scripting", null, 1, -1, UserProfileToScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timeTypeEEnum, TimeType.class, "TimeType");
		addEEnumLiteral(timeTypeEEnum, TimeType.SECONDS);
		addEEnumLiteral(timeTypeEEnum, TimeType.MINUTES);
		addEEnumLiteral(timeTypeEEnum, TimeType.HOURS);
	}

} //OpenmlperfPerformanceScenarioPackageImpl
