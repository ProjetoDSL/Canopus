/**
 */
package canopus.canopusPerformanceScenario.impl;

import canopus.canopusPerformanceScenario.*;

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
public class CanopusPerformanceScenarioFactoryImpl extends EFactoryImpl implements CanopusPerformanceScenarioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CanopusPerformanceScenarioFactory init() {
		try {
			CanopusPerformanceScenarioFactory theCanopusPerformanceScenarioFactory = (CanopusPerformanceScenarioFactory)EPackage.Registry.INSTANCE.getEFactory(CanopusPerformanceScenarioPackage.eNS_URI);
			if (theCanopusPerformanceScenarioFactory != null) {
				return theCanopusPerformanceScenarioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CanopusPerformanceScenarioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceScenarioFactoryImpl() {
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
			case CanopusPerformanceScenarioPackage.USER_PROFILE: return createUserProfile();
			case CanopusPerformanceScenarioPackage.WORKLOAD: return createWorkload();
			case CanopusPerformanceScenarioPackage.SCRIPTING: return createScripting();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public CanopusPerformanceScenarioPackage getCanopusPerformanceScenarioPackage() {
		return (CanopusPerformanceScenarioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CanopusPerformanceScenarioPackage getPackage() {
		return CanopusPerformanceScenarioPackage.eINSTANCE;
	}

} //CanopusPerformanceScenarioFactoryImpl
