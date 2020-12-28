/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.util;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage
 * @generated
 */
public class OpenmlperfPerformanceScriptingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenmlperfPerformanceScriptingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceScriptingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OpenmlperfPerformanceScriptingPackage.eINSTANCE;
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
	protected OpenmlperfPerformanceScriptingSwitch<Adapter> modelSwitch =
		new OpenmlperfPerformanceScriptingSwitch<Adapter>() {
			@Override
			public Adapter caseInitial(Initial object) {
				return createInitialAdapter();
			}
			@Override
			public Adapter caseFinal(Final object) {
				return createFinalAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseThinkTime(ThinkTime object) {
				return createThinkTimeAdapter();
			}
			@Override
			public Adapter caseSaveParameters(SaveParameters object) {
				return createSaveParametersAdapter();
			}
			@Override
			public Adapter caseDataTable(DataTable object) {
				return createDataTableAdapter();
			}
			@Override
			public Adapter caseParameterObject(ParameterObject object) {
				return createParameterObjectAdapter();
			}
			@Override
			public Adapter caseColumnsObject(ColumnsObject object) {
				return createColumnsObjectAdapter();
			}
			@Override
			public Adapter caseActivityToActivity(ActivityToActivity object) {
				return createActivityToActivityAdapter();
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
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Initial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Initial
	 * @generated
	 */
	public Adapter createInitialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Final
	 * @generated
	 */
	public Adapter createFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime <em>Think Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime
	 * @generated
	 */
	public Adapter createThinkTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SaveParameters <em>Save Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SaveParameters
	 * @generated
	 */
	public Adapter createSaveParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable <em>Data Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable
	 * @generated
	 */
	public Adapter createDataTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject <em>Parameter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject
	 * @generated
	 */
	public Adapter createParameterObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject <em>Columns Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject
	 * @generated
	 */
	public Adapter createColumnsObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity <em>Activity To Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity
	 * @generated
	 */
	public Adapter createActivityToActivityAdapter() {
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

} //OpenmlperfPerformanceScriptingAdapterFactory
