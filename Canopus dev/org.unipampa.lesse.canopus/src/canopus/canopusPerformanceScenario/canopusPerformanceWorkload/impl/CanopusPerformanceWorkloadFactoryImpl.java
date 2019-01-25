/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CanopusPerformanceWorkloadFactoryImpl extends EFactoryImpl implements CanopusPerformanceWorkloadFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CanopusPerformanceWorkloadFactory init() {
		try {
			CanopusPerformanceWorkloadFactory theCanopusPerformanceWorkloadFactory = (CanopusPerformanceWorkloadFactory)EPackage.Registry.INSTANCE.getEFactory(CanopusPerformanceWorkloadPackage.eNS_URI);
			if (theCanopusPerformanceWorkloadFactory != null) {
				return theCanopusPerformanceWorkloadFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CanopusPerformanceWorkloadFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceWorkloadFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CanopusPerformanceWorkloadPackage.VIRTUAL_USERS: return createVirtualUsers();
			case CanopusPerformanceWorkloadPackage.TEST_DURATION: return createTestDuration();
			case CanopusPerformanceWorkloadPackage.RAMP_UP_USERS: return createRampUpUsers();
			case CanopusPerformanceWorkloadPackage.RAMP_DOWN_USERS: return createRampDownUsers();
			case CanopusPerformanceWorkloadPackage.RAMP_UP_TIMER: return createRampUpTimer();
			case CanopusPerformanceWorkloadPackage.RAMP_DOWN_TIMER: return createRampDownTimer();
			case CanopusPerformanceWorkloadPackage.RAMP_UP_TEST: return createRampUpTest();
			case CanopusPerformanceWorkloadPackage.RAMP_DOWN_TEST: return createRampDownTest();
			case CanopusPerformanceWorkloadPackage.TEST: return createTest();
			case CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP: return createWorkloadGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualUsers createVirtualUsers() {
		VirtualUsersImpl virtualUsers = new VirtualUsersImpl();
		return virtualUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestDuration createTestDuration() {
		TestDurationImpl testDuration = new TestDurationImpl();
		return testDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpUsers createRampUpUsers() {
		RampUpUsersImpl rampUpUsers = new RampUpUsersImpl();
		return rampUpUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampDownUsers createRampDownUsers() {
		RampDownUsersImpl rampDownUsers = new RampDownUsersImpl();
		return rampDownUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpTimer createRampUpTimer() {
		RampUpTimerImpl rampUpTimer = new RampUpTimerImpl();
		return rampUpTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampDownTimer createRampDownTimer() {
		RampDownTimerImpl rampDownTimer = new RampDownTimerImpl();
		return rampDownTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpTest createRampUpTest() {
		RampUpTestImpl rampUpTest = new RampUpTestImpl();
		return rampUpTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampDownTest createRampDownTest() {
		RampDownTestImpl rampDownTest = new RampDownTestImpl();
		return rampDownTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadGroup createWorkloadGroup() {
		WorkloadGroupImpl workloadGroup = new WorkloadGroupImpl();
		return workloadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceWorkloadPackage getCanopusPerformanceWorkloadPackage() {
		return (CanopusPerformanceWorkloadPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CanopusPerformanceWorkloadPackage getPackage() {
		return CanopusPerformanceWorkloadPackage.eINSTANCE;
	}

} //CanopusPerformanceWorkloadFactoryImpl
