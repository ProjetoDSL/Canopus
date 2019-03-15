/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting.util;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage
 * @generated
 */
public class CanopusPerformanceScriptingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CanopusPerformanceScriptingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceScriptingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CanopusPerformanceScriptingPackage.eINSTANCE;
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
	protected CanopusPerformanceScriptingSwitch<Adapter> modelSwitch =
		new CanopusPerformanceScriptingSwitch<Adapter>() {
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
			public Adapter caseParameterHiddenObject(ParameterHiddenObject object) {
				return createParameterHiddenObjectAdapter();
			}
			@Override
			public Adapter caseColumnsHiddenObject(ColumnsHiddenObject object) {
				return createColumnsHiddenObjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial
	 * @generated
	 */
	public Adapter createInitialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Final
	 * @generated
	 */
	public Adapter createFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime <em>Think Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime
	 * @generated
	 */
	public Adapter createThinkTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.SaveParameters <em>Save Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.SaveParameters
	 * @generated
	 */
	public Adapter createSaveParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable <em>Data Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable
	 * @generated
	 */
	public Adapter createDataTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject <em>Parameter Hidden Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject
	 * @generated
	 */
	public Adapter createParameterHiddenObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject <em>Columns Hidden Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject
	 * @generated
	 */
	public Adapter createColumnsHiddenObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity <em>Activity To Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity
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

} //CanopusPerformanceScriptingAdapterFactory
