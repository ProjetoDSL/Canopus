/**
 */
package canopus.canopusPerformanceScripting.impl;

import canopus.CanopusPackage;

import canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringPackage;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.CanopusPerformanceMetricPackageImpl;

import canopus.canopusPerformanceMonitoring.impl.CanopusPerformanceMonitoringPackageImpl;

import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.CanopusPerformanceWorkloadPackageImpl;

import canopus.canopusPerformanceScenario.impl.CanopusPerformanceScenarioPackageImpl;

import canopus.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScripting.CanopusPerformanceScriptingFactory;
import canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;
import canopus.canopusPerformanceScripting.ColumnsHiddenObject;
import canopus.canopusPerformanceScripting.DataTable;
import canopus.canopusPerformanceScripting.Final;
import canopus.canopusPerformanceScripting.Initial;
import canopus.canopusPerformanceScripting.ParameterHiddenObject;
import canopus.canopusPerformanceScripting.SaveParameters;
import canopus.canopusPerformanceScripting.ScriptingModel;
import canopus.canopusPerformanceScripting.ThinkTime;
import canopus.canopusPerformanceScripting.canopusPerformanceExternalFile.CanopusPerformanceExternalFilePackage;

import canopus.canopusPerformanceScripting.canopusPerformanceExternalFile.impl.CanopusPerformanceExternalFilePackageImpl;

import canopus.impl.CanopusPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CanopusPerformanceScriptingPackageImpl extends EPackageImpl implements CanopusPerformanceScriptingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thinkTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saveParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterHiddenObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnsHiddenObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptingModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeactionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateD_VALUE_ONEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum selecT_NEXT_ROWEEnum = null;

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
	 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CanopusPerformanceScriptingPackageImpl() {
		super(eNS_URI, CanopusPerformanceScriptingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CanopusPerformanceScriptingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CanopusPerformanceScriptingPackage init() {
		if (isInited) return (CanopusPerformanceScriptingPackage)EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceScriptingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCanopusPerformanceScriptingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CanopusPerformanceScriptingPackageImpl theCanopusPerformanceScriptingPackage = registeredCanopusPerformanceScriptingPackage instanceof CanopusPerformanceScriptingPackageImpl ? (CanopusPerformanceScriptingPackageImpl)registeredCanopusPerformanceScriptingPackage : new CanopusPerformanceScriptingPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPackage.eNS_URI);
		CanopusPackageImpl theCanopusPackage = (CanopusPackageImpl)(registeredPackage instanceof CanopusPackageImpl ? registeredPackage : CanopusPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceMonitoringPackage.eNS_URI);
		CanopusPerformanceMonitoringPackageImpl theCanopusPerformanceMonitoringPackage = (CanopusPerformanceMonitoringPackageImpl)(registeredPackage instanceof CanopusPerformanceMonitoringPackageImpl ? registeredPackage : CanopusPerformanceMonitoringPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceMetricPackage.eNS_URI);
		CanopusPerformanceMetricPackageImpl theCanopusPerformanceMetricPackage = (CanopusPerformanceMetricPackageImpl)(registeredPackage instanceof CanopusPerformanceMetricPackageImpl ? registeredPackage : CanopusPerformanceMetricPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceScenarioPackage.eNS_URI);
		CanopusPerformanceScenarioPackageImpl theCanopusPerformanceScenarioPackage = (CanopusPerformanceScenarioPackageImpl)(registeredPackage instanceof CanopusPerformanceScenarioPackageImpl ? registeredPackage : CanopusPerformanceScenarioPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceWorkloadPackage.eNS_URI);
		CanopusPerformanceWorkloadPackageImpl theCanopusPerformanceWorkloadPackage = (CanopusPerformanceWorkloadPackageImpl)(registeredPackage instanceof CanopusPerformanceWorkloadPackageImpl ? registeredPackage : CanopusPerformanceWorkloadPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceExternalFilePackage.eNS_URI);
		CanopusPerformanceExternalFilePackageImpl theCanopusPerformanceExternalFilePackage = (CanopusPerformanceExternalFilePackageImpl)(registeredPackage instanceof CanopusPerformanceExternalFilePackageImpl ? registeredPackage : CanopusPerformanceExternalFilePackage.eINSTANCE);

		// Create package meta-data objects
		theCanopusPerformanceScriptingPackage.createPackageContents();
		theCanopusPackage.createPackageContents();
		theCanopusPerformanceMonitoringPackage.createPackageContents();
		theCanopusPerformanceMetricPackage.createPackageContents();
		theCanopusPerformanceScenarioPackage.createPackageContents();
		theCanopusPerformanceWorkloadPackage.createPackageContents();
		theCanopusPerformanceExternalFilePackage.createPackageContents();

		// Initialize created meta-data
		theCanopusPerformanceScriptingPackage.initializePackageContents();
		theCanopusPackage.initializePackageContents();
		theCanopusPerformanceMonitoringPackage.initializePackageContents();
		theCanopusPerformanceMetricPackage.initializePackageContents();
		theCanopusPerformanceScenarioPackage.initializePackageContents();
		theCanopusPerformanceWorkloadPackage.initializePackageContents();
		theCanopusPerformanceExternalFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCanopusPerformanceScriptingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CanopusPerformanceScriptingPackage.eNS_URI, theCanopusPerformanceScriptingPackage);
		return theCanopusPerformanceScriptingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitial() {
		return initialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitial_Name() {
		return (EAttribute)initialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitial_Activity() {
		return (EReference)initialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinal() {
		return finalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinal_Name() {
		return (EAttribute)finalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Name() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Action() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Method() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_TypeAction() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_LoopInstances() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Parameterhiddenobject() {
		return (EReference)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Transaction() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Activity() {
		return (EReference)activityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Scriptingmodel() {
		return (EReference)activityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Final() {
		return (EReference)activityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Thinktime() {
		return (EReference)activityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThinkTime() {
		return thinkTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThinkTime_Name() {
		return (EAttribute)thinkTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThinkTime_Time() {
		return (EAttribute)thinkTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThinkTime_Activity() {
		return (EReference)thinkTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSaveParameters() {
		return saveParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSaveParameters_Name() {
		return (EAttribute)saveParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaveParameters_Parameterhiddenobject() {
		return (EReference)saveParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTable() {
		return dataTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTable_Delimeter() {
		return (EAttribute)dataTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTable_Parameterhiddenobject() {
		return (EReference)dataTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTable_Attachedfile() {
		return (EReference)dataTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTable_Activity() {
		return (EReference)dataTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterHiddenObject() {
		return parameterHiddenObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterHiddenObject_TypeAction() {
		return (EAttribute)parameterHiddenObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterHiddenObject_ParameterName() {
		return (EAttribute)parameterHiddenObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterHiddenObject_StaticValue() {
		return (EAttribute)parameterHiddenObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterHiddenObject_Dynamicvalues() {
		return (EReference)parameterHiddenObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnsHiddenObject() {
		return columnsHiddenObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnsHiddenObject_ReferendedParameter() {
		return (EAttribute)columnsHiddenObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnsHiddenObject_Selectnextrow() {
		return (EAttribute)columnsHiddenObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnsHiddenObject_Updatedvalueon() {
		return (EAttribute)columnsHiddenObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnsHiddenObject_ParameterName() {
		return (EAttribute)columnsHiddenObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptingModel() {
		return scriptingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptingModel_Activity() {
		return (EReference)scriptingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptingModel_Saveparameters() {
		return (EReference)scriptingModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptingModel_Datatable() {
		return (EReference)scriptingModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptingModel_Final() {
		return (EReference)scriptingModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptingModel_Initial() {
		return (EReference)scriptingModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptingModel_Thinktime() {
		return (EReference)scriptingModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTYPEACTION() {
		return typeactionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUPDATED_VALUE_ON() {
		return updateD_VALUE_ONEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSELECT_NEXT_ROW() {
		return selecT_NEXT_ROWEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceScriptingFactory getCanopusPerformanceScriptingFactory() {
		return (CanopusPerformanceScriptingFactory)getEFactoryInstance();
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
		initialEClass = createEClass(INITIAL);
		createEAttribute(initialEClass, INITIAL__NAME);
		createEReference(initialEClass, INITIAL__ACTIVITY);

		finalEClass = createEClass(FINAL);
		createEAttribute(finalEClass, FINAL__NAME);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__NAME);
		createEAttribute(activityEClass, ACTIVITY__ACTION);
		createEAttribute(activityEClass, ACTIVITY__METHOD);
		createEAttribute(activityEClass, ACTIVITY__TYPE_ACTION);
		createEAttribute(activityEClass, ACTIVITY__LOOP_INSTANCES);
		createEReference(activityEClass, ACTIVITY__PARAMETERHIDDENOBJECT);
		createEAttribute(activityEClass, ACTIVITY__TRANSACTION);
		createEReference(activityEClass, ACTIVITY__ACTIVITY);
		createEReference(activityEClass, ACTIVITY__SCRIPTINGMODEL);
		createEReference(activityEClass, ACTIVITY__FINAL);
		createEReference(activityEClass, ACTIVITY__THINKTIME);

		thinkTimeEClass = createEClass(THINK_TIME);
		createEAttribute(thinkTimeEClass, THINK_TIME__NAME);
		createEAttribute(thinkTimeEClass, THINK_TIME__TIME);
		createEReference(thinkTimeEClass, THINK_TIME__ACTIVITY);

		saveParametersEClass = createEClass(SAVE_PARAMETERS);
		createEAttribute(saveParametersEClass, SAVE_PARAMETERS__NAME);
		createEReference(saveParametersEClass, SAVE_PARAMETERS__PARAMETERHIDDENOBJECT);

		dataTableEClass = createEClass(DATA_TABLE);
		createEAttribute(dataTableEClass, DATA_TABLE__DELIMETER);
		createEReference(dataTableEClass, DATA_TABLE__PARAMETERHIDDENOBJECT);
		createEReference(dataTableEClass, DATA_TABLE__ATTACHEDFILE);
		createEReference(dataTableEClass, DATA_TABLE__ACTIVITY);

		parameterHiddenObjectEClass = createEClass(PARAMETER_HIDDEN_OBJECT);
		createEAttribute(parameterHiddenObjectEClass, PARAMETER_HIDDEN_OBJECT__TYPE_ACTION);
		createEAttribute(parameterHiddenObjectEClass, PARAMETER_HIDDEN_OBJECT__PARAMETER_NAME);
		createEAttribute(parameterHiddenObjectEClass, PARAMETER_HIDDEN_OBJECT__STATIC_VALUE);
		createEReference(parameterHiddenObjectEClass, PARAMETER_HIDDEN_OBJECT__DYNAMICVALUES);

		columnsHiddenObjectEClass = createEClass(COLUMNS_HIDDEN_OBJECT);
		createEAttribute(columnsHiddenObjectEClass, COLUMNS_HIDDEN_OBJECT__REFERENDED_PARAMETER);
		createEAttribute(columnsHiddenObjectEClass, COLUMNS_HIDDEN_OBJECT__SELECTNEXTROW);
		createEAttribute(columnsHiddenObjectEClass, COLUMNS_HIDDEN_OBJECT__UPDATEDVALUEON);
		createEAttribute(columnsHiddenObjectEClass, COLUMNS_HIDDEN_OBJECT__PARAMETER_NAME);

		scriptingModelEClass = createEClass(SCRIPTING_MODEL);
		createEReference(scriptingModelEClass, SCRIPTING_MODEL__ACTIVITY);
		createEReference(scriptingModelEClass, SCRIPTING_MODEL__SAVEPARAMETERS);
		createEReference(scriptingModelEClass, SCRIPTING_MODEL__DATATABLE);
		createEReference(scriptingModelEClass, SCRIPTING_MODEL__FINAL);
		createEReference(scriptingModelEClass, SCRIPTING_MODEL__INITIAL);
		createEReference(scriptingModelEClass, SCRIPTING_MODEL__THINKTIME);

		// Create enums
		typeactionEEnum = createEEnum(TYPEACTION);
		updateD_VALUE_ONEEnum = createEEnum(UPDATED_VALUE_ON);
		selecT_NEXT_ROWEEnum = createEEnum(SELECT_NEXT_ROW);
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
		CanopusPerformanceExternalFilePackage theCanopusPerformanceExternalFilePackage = (CanopusPerformanceExternalFilePackage)EPackage.Registry.INSTANCE.getEPackage(CanopusPerformanceExternalFilePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCanopusPerformanceExternalFilePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(initialEClass, Initial.class, "Initial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitial_Name(), ecorePackage.getEString(), "name", null, 0, 1, Initial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitial_Activity(), this.getActivity(), null, "activity", null, 1, 1, Initial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalEClass, Final.class, "Final", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Final.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Action(), ecorePackage.getEString(), "action", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Method(), ecorePackage.getEBoolean(), "method", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_TypeAction(), this.getTYPEACTION(), "typeAction", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_LoopInstances(), ecorePackage.getEInt(), "loopInstances", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Parameterhiddenobject(), this.getParameterHiddenObject(), null, "parameterhiddenobject", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Transaction(), ecorePackage.getEBoolean(), "transaction", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Activity(), this.getActivity(), null, "activity", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Scriptingmodel(), this.getScriptingModel(), null, "scriptingmodel", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Final(), this.getFinal(), null, "final", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Thinktime(), this.getThinkTime(), null, "thinktime", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thinkTimeEClass, ThinkTime.class, "ThinkTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThinkTime_Name(), ecorePackage.getEString(), "name", null, 0, 1, ThinkTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThinkTime_Time(), ecorePackage.getEString(), "time", null, 0, 1, ThinkTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThinkTime_Activity(), this.getActivity(), null, "activity", null, 0, 1, ThinkTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(saveParametersEClass, SaveParameters.class, "SaveParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSaveParameters_Name(), ecorePackage.getEString(), "name", null, 0, 1, SaveParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSaveParameters_Parameterhiddenobject(), this.getParameterHiddenObject(), null, "parameterhiddenobject", null, 0, 1, SaveParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTableEClass, DataTable.class, "DataTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTable_Delimeter(), ecorePackage.getEString(), "delimeter", null, 0, 1, DataTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTable_Parameterhiddenobject(), this.getParameterHiddenObject(), null, "parameterhiddenobject", null, 0, 1, DataTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTable_Attachedfile(), theCanopusPerformanceExternalFilePackage.getExternalFile(), null, "attachedfile", null, 0, 1, DataTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTable_Activity(), this.getActivity(), null, "activity", null, 0, 1, DataTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterHiddenObjectEClass, ParameterHiddenObject.class, "ParameterHiddenObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterHiddenObject_TypeAction(), this.getTYPEACTION(), "typeAction", null, 0, 1, ParameterHiddenObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterHiddenObject_ParameterName(), ecorePackage.getEString(), "parameterName", null, 0, 1, ParameterHiddenObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterHiddenObject_StaticValue(), ecorePackage.getEString(), "staticValue", null, 0, 1, ParameterHiddenObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterHiddenObject_Dynamicvalues(), this.getColumnsHiddenObject(), null, "dynamicvalues", null, 0, 1, ParameterHiddenObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnsHiddenObjectEClass, ColumnsHiddenObject.class, "ColumnsHiddenObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnsHiddenObject_ReferendedParameter(), ecorePackage.getEString(), "referendedParameter", null, 0, 1, ColumnsHiddenObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnsHiddenObject_Selectnextrow(), this.getSELECT_NEXT_ROW(), "selectnextrow", null, 0, 1, ColumnsHiddenObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnsHiddenObject_Updatedvalueon(), this.getUPDATED_VALUE_ON(), "updatedvalueon", null, 0, 1, ColumnsHiddenObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnsHiddenObject_ParameterName(), ecorePackage.getEString(), "parameterName", null, 0, 1, ColumnsHiddenObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptingModelEClass, ScriptingModel.class, "ScriptingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScriptingModel_Activity(), this.getActivity(), null, "activity", null, 1, -1, ScriptingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScriptingModel_Saveparameters(), this.getSaveParameters(), null, "saveparameters", null, 0, -1, ScriptingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScriptingModel_Datatable(), this.getDataTable(), null, "datatable", null, 0, -1, ScriptingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScriptingModel_Final(), this.getFinal(), null, "final", null, 1, 1, ScriptingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScriptingModel_Initial(), this.getInitial(), null, "initial", null, 1, 1, ScriptingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScriptingModel_Thinktime(), this.getThinkTime(), null, "thinktime", null, 0, -1, ScriptingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeactionEEnum, canopus.canopusPerformanceScripting.TYPEACTION.class, "TYPEACTION");
		addEEnumLiteral(typeactionEEnum, canopus.canopusPerformanceScripting.TYPEACTION.BODY);
		addEEnumLiteral(typeactionEEnum, canopus.canopusPerformanceScripting.TYPEACTION.BUTTON);
		addEEnumLiteral(typeactionEEnum, canopus.canopusPerformanceScripting.TYPEACTION.CHECKBOX);

		initEEnum(updateD_VALUE_ONEEnum, canopus.canopusPerformanceScripting.UPDATED_VALUE_ON.class, "UPDATED_VALUE_ON");
		addEEnumLiteral(updateD_VALUE_ONEEnum, canopus.canopusPerformanceScripting.UPDATED_VALUE_ON.EACH_INTERACTION);
		addEEnumLiteral(updateD_VALUE_ONEEnum, canopus.canopusPerformanceScripting.UPDATED_VALUE_ON.EACH_OCCURENCE);
		addEEnumLiteral(updateD_VALUE_ONEEnum, canopus.canopusPerformanceScripting.UPDATED_VALUE_ON.ONCE);

		initEEnum(selecT_NEXT_ROWEEnum, canopus.canopusPerformanceScripting.SELECT_NEXT_ROW.class, "SELECT_NEXT_ROW");
		addEEnumLiteral(selecT_NEXT_ROWEEnum, canopus.canopusPerformanceScripting.SELECT_NEXT_ROW.SEQUENTIAL);
		addEEnumLiteral(selecT_NEXT_ROWEEnum, canopus.canopusPerformanceScripting.SELECT_NEXT_ROW.RANDOM);
		addEEnumLiteral(selecT_NEXT_ROWEEnum, canopus.canopusPerformanceScripting.SELECT_NEXT_ROW.UNIQUE);
		addEEnumLiteral(selecT_NEXT_ROWEEnum, canopus.canopusPerformanceScripting.SELECT_NEXT_ROW.SAME_AS_OTHER_PARAM);
	}

} //CanopusPerformanceScriptingPackageImpl
