/**
 */
package canopus.canopusPerformanceScenario.util;

import canopus.canopusPerformanceScenario.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage
 * @generated
 */
public class CanopusPerformanceScenarioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CanopusPerformanceScenarioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceScenarioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CanopusPerformanceScenarioPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanopusPerformanceScenarioSwitch<Adapter> modelSwitch =
		new CanopusPerformanceScenarioSwitch<Adapter>() {
			@Override
			public Adapter caseUserProfile(UserProfile object) {
				return createUserProfileAdapter();
			}
			@Override
			public Adapter caseWorkload(Workload object) {
				return createWorkloadAdapter();
			}
			@Override
			public Adapter caseScripting(Scripting object) {
				return createScriptingAdapter();
			}
			@Override
			public Adapter caseUserProfileToScript(UserProfileToScript object) {
				return createUserProfileToScriptAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.UserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.UserProfile
	 * @generated
	 */
	public Adapter createUserProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.Workload
	 * @generated
	 */
	public Adapter createWorkloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.Scripting <em>Scripting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.Scripting
	 * @generated
	 */
	public Adapter createScriptingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.UserProfileToScript <em>User Profile To Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.UserProfileToScript
	 * @generated
	 */
	public Adapter createUserProfileToScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CanopusPerformanceScenarioAdapterFactory
