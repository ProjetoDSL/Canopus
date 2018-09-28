/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.util;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage
 * @generated
 */
public class CanopusPerformanceWorkloadAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CanopusPerformanceWorkloadPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceWorkloadAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CanopusPerformanceWorkloadPackage.eINSTANCE;
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
	protected CanopusPerformanceWorkloadSwitch<Adapter> modelSwitch =
		new CanopusPerformanceWorkloadSwitch<Adapter>() {
			@Override
			public Adapter caseVirtualUsers(VirtualUsers object) {
				return createVirtualUsersAdapter();
			}
			@Override
			public Adapter caseTestDuration(TestDuration object) {
				return createTestDurationAdapter();
			}
			@Override
			public Adapter caseRampUpUsers(RampUpUsers object) {
				return createRampUpUsersAdapter();
			}
			@Override
			public Adapter caseRampDownUsers(RampDownUsers object) {
				return createRampDownUsersAdapter();
			}
			@Override
			public Adapter caseRampUpTimer(RampUpTimer object) {
				return createRampUpTimerAdapter();
			}
			@Override
			public Adapter caseRampDownTime(RampDownTime object) {
				return createRampDownTimeAdapter();
			}
			@Override
			public Adapter caseWorkloadModel(WorkloadModel object) {
				return createWorkloadModelAdapter();
			}
			@Override
			public Adapter caseWorkloadGroup(WorkloadGroup object) {
				return createWorkloadGroupAdapter();
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
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers <em>Virtual Users</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers
	 * @generated
	 */
	public Adapter createVirtualUsersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.TestDuration <em>Test Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.TestDuration
	 * @generated
	 */
	public Adapter createTestDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers <em>Ramp Up Users</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers
	 * @generated
	 */
	public Adapter createRampUpUsersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers <em>Ramp Down Users</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers
	 * @generated
	 */
	public Adapter createRampDownUsersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer <em>Ramp Up Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer
	 * @generated
	 */
	public Adapter createRampUpTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTime <em>Ramp Down Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTime
	 * @generated
	 */
	public Adapter createRampDownTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel <em>Workload Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel
	 * @generated
	 */
	public Adapter createWorkloadModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup <em>Workload Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup
	 * @generated
	 */
	public Adapter createWorkloadGroupAdapter() {
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

} //CanopusPerformanceWorkloadAdapterFactory