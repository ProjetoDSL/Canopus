/**
 */
package openmlperf.openmlperfPerformanceScenario.impl;

import openmlperf.openmlperfPerformanceScenario.*;

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
public class OpenmlperfPerformanceScenarioFactoryImpl extends EFactoryImpl implements OpenmlperfPerformanceScenarioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenmlperfPerformanceScenarioFactory init() {
		try {
			OpenmlperfPerformanceScenarioFactory theOpenmlperfPerformanceScenarioFactory = (OpenmlperfPerformanceScenarioFactory)EPackage.Registry.INSTANCE.getEFactory(OpenmlperfPerformanceScenarioPackage.eNS_URI);
			if (theOpenmlperfPerformanceScenarioFactory != null) {
				return theOpenmlperfPerformanceScenarioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenmlperfPerformanceScenarioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceScenarioFactoryImpl() {
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
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE: return createUserProfile();
			case OpenmlperfPerformanceScenarioPackage.WORKLOAD: return createWorkload();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING: return createScripting();
			case OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT: return createUserProfileToScript();
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
			case OpenmlperfPerformanceScenarioPackage.TIME_TYPE:
				return createTimeTypeFromString(eDataType, initialValue);
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
			case OpenmlperfPerformanceScenarioPackage.TIME_TYPE:
				return convertTimeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfile createUserProfile() {
		UserProfileImpl userProfile = new UserProfileImpl();
		return userProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workload createWorkload() {
		WorkloadImpl workload = new WorkloadImpl();
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scripting createScripting() {
		ScriptingImpl scripting = new ScriptingImpl();
		return scripting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfileToScript createUserProfileToScript() {
		UserProfileToScriptImpl userProfileToScript = new UserProfileToScriptImpl();
		return userProfileToScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType createTimeTypeFromString(EDataType eDataType, String initialValue) {
		TimeType result = TimeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceScenarioPackage getOpenmlperfPerformanceScenarioPackage() {
		return (OpenmlperfPerformanceScenarioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenmlperfPerformanceScenarioPackage getPackage() {
		return OpenmlperfPerformanceScenarioPackage.eINSTANCE;
	}

} //OpenmlperfPerformanceScenarioFactoryImpl
