/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class OpenmlperfPerformanceWorkloadFactoryImpl extends EFactoryImpl implements OpenmlperfPerformanceWorkloadFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenmlperfPerformanceWorkloadFactory init() {
		try {
			OpenmlperfPerformanceWorkloadFactory theOpenmlperfPerformanceWorkloadFactory = (OpenmlperfPerformanceWorkloadFactory)EPackage.Registry.INSTANCE.getEFactory(OpenmlperfPerformanceWorkloadPackage.eNS_URI);
			if (theOpenmlperfPerformanceWorkloadFactory != null) {
				return theOpenmlperfPerformanceWorkloadFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenmlperfPerformanceWorkloadFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceWorkloadFactoryImpl() {
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
			case OpenmlperfPerformanceWorkloadPackage.RAMP_UP_USERS: return createRampUpUsers();
			case OpenmlperfPerformanceWorkloadPackage.RAMP_DOWN_USERS: return createRampDownUsers();
			case OpenmlperfPerformanceWorkloadPackage.RAMP_UP_TIMER: return createRampUpTimer();
			case OpenmlperfPerformanceWorkloadPackage.RAMP_DOWN_TIMER: return createRampDownTimer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OpenmlperfPerformanceWorkloadPackage.TIME_TYPE_RAMPS:
				return createTimeTypeRampsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OpenmlperfPerformanceWorkloadPackage.TIME_TYPE_RAMPS:
				return convertTimeTypeRampsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public TimeTypeRamps createTimeTypeRampsFromString(EDataType eDataType, String initialValue) {
		TimeTypeRamps result = TimeTypeRamps.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeTypeRampsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceWorkloadPackage getOpenmlperfPerformanceWorkloadPackage() {
		return (OpenmlperfPerformanceWorkloadPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenmlperfPerformanceWorkloadPackage getPackage() {
		return OpenmlperfPerformanceWorkloadPackage.eINSTANCE;
	}

} //OpenmlperfPerformanceWorkloadFactoryImpl
