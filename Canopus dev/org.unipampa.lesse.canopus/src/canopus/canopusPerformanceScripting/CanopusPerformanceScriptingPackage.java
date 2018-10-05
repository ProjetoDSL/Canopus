/**
 */
package canopus.canopusPerformanceScripting;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceScripting.CanopusPerformanceScriptingFactory
 * @model kind="package"
 * @generated
 */
public interface CanopusPerformanceScriptingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "canopusPerformanceScripting";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unipampa.lesse.org/canopusPerformanceScripting";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "canopusPerformanceScripting";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanopusPerformanceScriptingPackage eINSTANCE = canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl.init();

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScripting.impl.InitialImpl <em>Initial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScripting.impl.InitialImpl
	 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getInitial()
	 * @generated
	 */
	int INITIAL = 0;

	/**
	 * The number of structural features of the '<em>Initial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Initial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScripting.impl.FinalImpl <em>Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScripting.impl.FinalImpl
	 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getFinal()
	 * @generated
	 */
	int FINAL = 1;

	/**
	 * The number of structural features of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScripting.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScripting.impl.ActivityImpl
	 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__METHOD = 2;

	/**
	 * The feature id for the '<em><b>Type Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TYPE_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Loop Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LOOP_INSTANCES = 4;

	/**
	 * The feature id for the '<em><b>Parameterhiddenobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PARAMETERHIDDENOBJECT = 5;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TRANSACTION = 6;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Scriptingmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SCRIPTINGMODEL = 8;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScripting.impl.ThinkTimeImpl <em>Think Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScripting.impl.ThinkTimeImpl
	 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getThinkTime()
	 * @generated
	 */
	int THINK_TIME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_TIME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_TIME__TIME = 1;

	/**
	 * The number of structural features of the '<em>Think Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Think Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScripting.impl.SaveParametersImpl <em>Save Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScripting.impl.SaveParametersImpl
	 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getSaveParameters()
	 * @generated
	 */
	int SAVE_PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_PARAMETERS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameterhiddenobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_PARAMETERS__PARAMETERHIDDENOBJECT = 1;

	/**
	 * The number of structural features of the '<em>Save Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_PARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Save Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScripting.impl.DataTableImpl <em>Data Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScripting.impl.DataTableImpl
	 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getDataTable()
	 * @generated
	 */
	int DATA_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Delimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE__DELIMETER = 0;

	/**
	 * The feature id for the '<em><b>Parameterhiddenobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE__PARAMETERHIDDENOBJECT = 1;

	/**
	 * The feature id for the '<em><b>Attachedfile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE__ATTACHEDFILE = 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE__ACTIVITY = 3;

	/**
	 * The number of structural features of the '<em>Data Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl <em>Parameter Hidden Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl
	 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getParameterHiddenObject()
	 * @generated
	 */
	int PARAMETER_HIDDEN_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Type Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_HIDDEN_OBJECT__TYPE_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_HIDDEN_OBJECT__PARAMETER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Static Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_HIDDEN_OBJECT__STATIC_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Dynamicvalues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_HIDDEN_OBJECT__DYNAMICVALUES = 3;

	/**
	 * The number of structural features of the '<em>Parameter Hidden Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_HIDDEN_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter Hidden Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_HIDDEN_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScripting.impl.ColumnsHiddenObjectImpl <em>Columns Hidden Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScripting.impl.ColumnsHiddenObjectImpl
	 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getColumnsHiddenObject()
	 * @generated
	 */
	int COLUMNS_HIDDEN_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Referended Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_HIDDEN_OBJECT__REFERENDED_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Selectnextrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_HIDDEN_OBJECT__SELECTNEXTROW = 1;

	/**
	 * The feature id for the '<em><b>Updatedvalueon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_HIDDEN_OBJECT__UPDATEDVALUEON = 2;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_HIDDEN_OBJECT__PARAMETER_NAME = 3;

	/**
	 * The number of structural features of the '<em>Columns Hidden Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_HIDDEN_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Columns Hidden Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_HIDDEN_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScripting.impl.ScriptingModelImpl <em>Scripting Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScripting.impl.ScriptingModelImpl
	 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getScriptingModel()
	 * @generated
	 */
	int SCRIPTING_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING_MODEL__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Saveparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING_MODEL__SAVEPARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Datatable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING_MODEL__DATATABLE = 2;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING_MODEL__FINAL = 3;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING_MODEL__INITIAL = 4;

	/**
	 * The feature id for the '<em><b>Thinktime</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING_MODEL__THINKTIME = 5;

	/**
	 * The number of structural features of the '<em>Scripting Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Scripting Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScripting.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScripting.impl.TransitionImpl
	 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 9;

	/**
	 * The feature id for the '<em><b>Porcentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PORCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Thinktime</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__THINKTIME = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScripting.TYPEACTION <em>TYPEACTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScripting.TYPEACTION
	 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getTYPEACTION()
	 * @generated
	 */
	int TYPEACTION = 10;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScripting.UPDATED_VALUE_ON <em>UPDATED VALUE ON</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScripting.UPDATED_VALUE_ON
	 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getUPDATED_VALUE_ON()
	 * @generated
	 */
	int UPDATED_VALUE_ON = 11;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScripting.SELECT_NEXT_ROW <em>SELECT NEXT ROW</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScripting.SELECT_NEXT_ROW
	 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getSELECT_NEXT_ROW()
	 * @generated
	 */
	int SELECT_NEXT_ROW = 12;


	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScripting.Initial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial</em>'.
	 * @see canopus.canopusPerformanceScripting.Initial
	 * @generated
	 */
	EClass getInitial();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScripting.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final</em>'.
	 * @see canopus.canopusPerformanceScripting.Final
	 * @generated
	 */
	EClass getFinal();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScripting.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see canopus.canopusPerformanceScripting.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScripting.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.Activity#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see canopus.canopusPerformanceScripting.Activity#getAction()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Action();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.Activity#isMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see canopus.canopusPerformanceScripting.Activity#isMethod()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Method();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.Activity#getTypeAction <em>Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Action</em>'.
	 * @see canopus.canopusPerformanceScripting.Activity#getTypeAction()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_TypeAction();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.Activity#getLoopInstances <em>Loop Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Instances</em>'.
	 * @see canopus.canopusPerformanceScripting.Activity#getLoopInstances()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_LoopInstances();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScripting.Activity#getParameterhiddenobject <em>Parameterhiddenobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameterhiddenobject</em>'.
	 * @see canopus.canopusPerformanceScripting.Activity#getParameterhiddenobject()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Parameterhiddenobject();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.Activity#isTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction</em>'.
	 * @see canopus.canopusPerformanceScripting.Activity#isTransaction()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Transaction();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceScripting.Activity#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see canopus.canopusPerformanceScripting.Activity#getActivity()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScripting.Activity#getScriptingmodel <em>Scriptingmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scriptingmodel</em>'.
	 * @see canopus.canopusPerformanceScripting.Activity#getScriptingmodel()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Scriptingmodel();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScripting.ThinkTime <em>Think Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Think Time</em>'.
	 * @see canopus.canopusPerformanceScripting.ThinkTime
	 * @generated
	 */
	EClass getThinkTime();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.ThinkTime#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScripting.ThinkTime#getName()
	 * @see #getThinkTime()
	 * @generated
	 */
	EAttribute getThinkTime_Name();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.ThinkTime#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see canopus.canopusPerformanceScripting.ThinkTime#getTime()
	 * @see #getThinkTime()
	 * @generated
	 */
	EAttribute getThinkTime_Time();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScripting.SaveParameters <em>Save Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Save Parameters</em>'.
	 * @see canopus.canopusPerformanceScripting.SaveParameters
	 * @generated
	 */
	EClass getSaveParameters();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.SaveParameters#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScripting.SaveParameters#getName()
	 * @see #getSaveParameters()
	 * @generated
	 */
	EAttribute getSaveParameters_Name();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScripting.SaveParameters#getParameterhiddenobject <em>Parameterhiddenobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameterhiddenobject</em>'.
	 * @see canopus.canopusPerformanceScripting.SaveParameters#getParameterhiddenobject()
	 * @see #getSaveParameters()
	 * @generated
	 */
	EReference getSaveParameters_Parameterhiddenobject();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScripting.DataTable <em>Data Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Table</em>'.
	 * @see canopus.canopusPerformanceScripting.DataTable
	 * @generated
	 */
	EClass getDataTable();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.DataTable#getDelimeter <em>Delimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimeter</em>'.
	 * @see canopus.canopusPerformanceScripting.DataTable#getDelimeter()
	 * @see #getDataTable()
	 * @generated
	 */
	EAttribute getDataTable_Delimeter();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScripting.DataTable#getParameterhiddenobject <em>Parameterhiddenobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameterhiddenobject</em>'.
	 * @see canopus.canopusPerformanceScripting.DataTable#getParameterhiddenobject()
	 * @see #getDataTable()
	 * @generated
	 */
	EReference getDataTable_Parameterhiddenobject();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScripting.DataTable#getAttachedfile <em>Attachedfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachedfile</em>'.
	 * @see canopus.canopusPerformanceScripting.DataTable#getAttachedfile()
	 * @see #getDataTable()
	 * @generated
	 */
	EReference getDataTable_Attachedfile();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScripting.DataTable#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see canopus.canopusPerformanceScripting.DataTable#getActivity()
	 * @see #getDataTable()
	 * @generated
	 */
	EReference getDataTable_Activity();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScripting.ParameterHiddenObject <em>Parameter Hidden Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Hidden Object</em>'.
	 * @see canopus.canopusPerformanceScripting.ParameterHiddenObject
	 * @generated
	 */
	EClass getParameterHiddenObject();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.ParameterHiddenObject#getTypeAction <em>Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Action</em>'.
	 * @see canopus.canopusPerformanceScripting.ParameterHiddenObject#getTypeAction()
	 * @see #getParameterHiddenObject()
	 * @generated
	 */
	EAttribute getParameterHiddenObject_TypeAction();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.ParameterHiddenObject#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see canopus.canopusPerformanceScripting.ParameterHiddenObject#getParameterName()
	 * @see #getParameterHiddenObject()
	 * @generated
	 */
	EAttribute getParameterHiddenObject_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.ParameterHiddenObject#getStaticValue <em>Static Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Value</em>'.
	 * @see canopus.canopusPerformanceScripting.ParameterHiddenObject#getStaticValue()
	 * @see #getParameterHiddenObject()
	 * @generated
	 */
	EAttribute getParameterHiddenObject_StaticValue();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScripting.ParameterHiddenObject#getDynamicvalues <em>Dynamicvalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamicvalues</em>'.
	 * @see canopus.canopusPerformanceScripting.ParameterHiddenObject#getDynamicvalues()
	 * @see #getParameterHiddenObject()
	 * @generated
	 */
	EReference getParameterHiddenObject_Dynamicvalues();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScripting.ColumnsHiddenObject <em>Columns Hidden Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columns Hidden Object</em>'.
	 * @see canopus.canopusPerformanceScripting.ColumnsHiddenObject
	 * @generated
	 */
	EClass getColumnsHiddenObject();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.ColumnsHiddenObject#getReferendedParameter <em>Referended Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referended Parameter</em>'.
	 * @see canopus.canopusPerformanceScripting.ColumnsHiddenObject#getReferendedParameter()
	 * @see #getColumnsHiddenObject()
	 * @generated
	 */
	EAttribute getColumnsHiddenObject_ReferendedParameter();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.ColumnsHiddenObject#getSelectnextrow <em>Selectnextrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selectnextrow</em>'.
	 * @see canopus.canopusPerformanceScripting.ColumnsHiddenObject#getSelectnextrow()
	 * @see #getColumnsHiddenObject()
	 * @generated
	 */
	EAttribute getColumnsHiddenObject_Selectnextrow();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.ColumnsHiddenObject#getUpdatedvalueon <em>Updatedvalueon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatedvalueon</em>'.
	 * @see canopus.canopusPerformanceScripting.ColumnsHiddenObject#getUpdatedvalueon()
	 * @see #getColumnsHiddenObject()
	 * @generated
	 */
	EAttribute getColumnsHiddenObject_Updatedvalueon();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.ColumnsHiddenObject#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see canopus.canopusPerformanceScripting.ColumnsHiddenObject#getParameterName()
	 * @see #getColumnsHiddenObject()
	 * @generated
	 */
	EAttribute getColumnsHiddenObject_ParameterName();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScripting.ScriptingModel <em>Scripting Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripting Model</em>'.
	 * @see canopus.canopusPerformanceScripting.ScriptingModel
	 * @generated
	 */
	EClass getScriptingModel();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScripting.ScriptingModel#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see canopus.canopusPerformanceScripting.ScriptingModel#getActivity()
	 * @see #getScriptingModel()
	 * @generated
	 */
	EReference getScriptingModel_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScripting.ScriptingModel#getSaveparameters <em>Saveparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Saveparameters</em>'.
	 * @see canopus.canopusPerformanceScripting.ScriptingModel#getSaveparameters()
	 * @see #getScriptingModel()
	 * @generated
	 */
	EReference getScriptingModel_Saveparameters();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScripting.ScriptingModel#getDatatable <em>Datatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatable</em>'.
	 * @see canopus.canopusPerformanceScripting.ScriptingModel#getDatatable()
	 * @see #getScriptingModel()
	 * @generated
	 */
	EReference getScriptingModel_Datatable();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScripting.ScriptingModel#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final</em>'.
	 * @see canopus.canopusPerformanceScripting.ScriptingModel#getFinal()
	 * @see #getScriptingModel()
	 * @generated
	 */
	EReference getScriptingModel_Final();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScripting.ScriptingModel#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial</em>'.
	 * @see canopus.canopusPerformanceScripting.ScriptingModel#getInitial()
	 * @see #getScriptingModel()
	 * @generated
	 */
	EReference getScriptingModel_Initial();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScripting.ScriptingModel#getThinktime <em>Thinktime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thinktime</em>'.
	 * @see canopus.canopusPerformanceScripting.ScriptingModel#getThinktime()
	 * @see #getScriptingModel()
	 * @generated
	 */
	EReference getScriptingModel_Thinktime();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScripting.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see canopus.canopusPerformanceScripting.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScripting.Transition#getPorcentage <em>Porcentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Porcentage</em>'.
	 * @see canopus.canopusPerformanceScripting.Transition#getPorcentage()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Porcentage();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceScripting.Transition#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see canopus.canopusPerformanceScripting.Transition#getActivity()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Activity();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceScripting.Transition#getThinktime <em>Thinktime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thinktime</em>'.
	 * @see canopus.canopusPerformanceScripting.Transition#getThinktime()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Thinktime();

	/**
	 * Returns the meta object for enum '{@link canopus.canopusPerformanceScripting.TYPEACTION <em>TYPEACTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TYPEACTION</em>'.
	 * @see canopus.canopusPerformanceScripting.TYPEACTION
	 * @generated
	 */
	EEnum getTYPEACTION();

	/**
	 * Returns the meta object for enum '{@link canopus.canopusPerformanceScripting.UPDATED_VALUE_ON <em>UPDATED VALUE ON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>UPDATED VALUE ON</em>'.
	 * @see canopus.canopusPerformanceScripting.UPDATED_VALUE_ON
	 * @generated
	 */
	EEnum getUPDATED_VALUE_ON();

	/**
	 * Returns the meta object for enum '{@link canopus.canopusPerformanceScripting.SELECT_NEXT_ROW <em>SELECT NEXT ROW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SELECT NEXT ROW</em>'.
	 * @see canopus.canopusPerformanceScripting.SELECT_NEXT_ROW
	 * @generated
	 */
	EEnum getSELECT_NEXT_ROW();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CanopusPerformanceScriptingFactory getCanopusPerformanceScriptingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScripting.impl.InitialImpl <em>Initial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScripting.impl.InitialImpl
		 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getInitial()
		 * @generated
		 */
		EClass INITIAL = eINSTANCE.getInitial();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScripting.impl.FinalImpl <em>Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScripting.impl.FinalImpl
		 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getFinal()
		 * @generated
		 */
		EClass FINAL = eINSTANCE.getFinal();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScripting.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScripting.impl.ActivityImpl
		 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ACTION = eINSTANCE.getActivity_Action();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__METHOD = eINSTANCE.getActivity_Method();

		/**
		 * The meta object literal for the '<em><b>Type Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TYPE_ACTION = eINSTANCE.getActivity_TypeAction();

		/**
		 * The meta object literal for the '<em><b>Loop Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__LOOP_INSTANCES = eINSTANCE.getActivity_LoopInstances();

		/**
		 * The meta object literal for the '<em><b>Parameterhiddenobject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PARAMETERHIDDENOBJECT = eINSTANCE.getActivity_Parameterhiddenobject();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TRANSACTION = eINSTANCE.getActivity_Transaction();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ACTIVITY = eINSTANCE.getActivity_Activity();

		/**
		 * The meta object literal for the '<em><b>Scriptingmodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SCRIPTINGMODEL = eINSTANCE.getActivity_Scriptingmodel();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScripting.impl.ThinkTimeImpl <em>Think Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScripting.impl.ThinkTimeImpl
		 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getThinkTime()
		 * @generated
		 */
		EClass THINK_TIME = eINSTANCE.getThinkTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THINK_TIME__NAME = eINSTANCE.getThinkTime_Name();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THINK_TIME__TIME = eINSTANCE.getThinkTime_Time();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScripting.impl.SaveParametersImpl <em>Save Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScripting.impl.SaveParametersImpl
		 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getSaveParameters()
		 * @generated
		 */
		EClass SAVE_PARAMETERS = eINSTANCE.getSaveParameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVE_PARAMETERS__NAME = eINSTANCE.getSaveParameters_Name();

		/**
		 * The meta object literal for the '<em><b>Parameterhiddenobject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAVE_PARAMETERS__PARAMETERHIDDENOBJECT = eINSTANCE.getSaveParameters_Parameterhiddenobject();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScripting.impl.DataTableImpl <em>Data Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScripting.impl.DataTableImpl
		 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getDataTable()
		 * @generated
		 */
		EClass DATA_TABLE = eINSTANCE.getDataTable();

		/**
		 * The meta object literal for the '<em><b>Delimeter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TABLE__DELIMETER = eINSTANCE.getDataTable_Delimeter();

		/**
		 * The meta object literal for the '<em><b>Parameterhiddenobject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TABLE__PARAMETERHIDDENOBJECT = eINSTANCE.getDataTable_Parameterhiddenobject();

		/**
		 * The meta object literal for the '<em><b>Attachedfile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TABLE__ATTACHEDFILE = eINSTANCE.getDataTable_Attachedfile();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TABLE__ACTIVITY = eINSTANCE.getDataTable_Activity();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl <em>Parameter Hidden Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl
		 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getParameterHiddenObject()
		 * @generated
		 */
		EClass PARAMETER_HIDDEN_OBJECT = eINSTANCE.getParameterHiddenObject();

		/**
		 * The meta object literal for the '<em><b>Type Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_HIDDEN_OBJECT__TYPE_ACTION = eINSTANCE.getParameterHiddenObject_TypeAction();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_HIDDEN_OBJECT__PARAMETER_NAME = eINSTANCE.getParameterHiddenObject_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Static Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_HIDDEN_OBJECT__STATIC_VALUE = eINSTANCE.getParameterHiddenObject_StaticValue();

		/**
		 * The meta object literal for the '<em><b>Dynamicvalues</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_HIDDEN_OBJECT__DYNAMICVALUES = eINSTANCE.getParameterHiddenObject_Dynamicvalues();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScripting.impl.ColumnsHiddenObjectImpl <em>Columns Hidden Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScripting.impl.ColumnsHiddenObjectImpl
		 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getColumnsHiddenObject()
		 * @generated
		 */
		EClass COLUMNS_HIDDEN_OBJECT = eINSTANCE.getColumnsHiddenObject();

		/**
		 * The meta object literal for the '<em><b>Referended Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNS_HIDDEN_OBJECT__REFERENDED_PARAMETER = eINSTANCE.getColumnsHiddenObject_ReferendedParameter();

		/**
		 * The meta object literal for the '<em><b>Selectnextrow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNS_HIDDEN_OBJECT__SELECTNEXTROW = eINSTANCE.getColumnsHiddenObject_Selectnextrow();

		/**
		 * The meta object literal for the '<em><b>Updatedvalueon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNS_HIDDEN_OBJECT__UPDATEDVALUEON = eINSTANCE.getColumnsHiddenObject_Updatedvalueon();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNS_HIDDEN_OBJECT__PARAMETER_NAME = eINSTANCE.getColumnsHiddenObject_ParameterName();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScripting.impl.ScriptingModelImpl <em>Scripting Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScripting.impl.ScriptingModelImpl
		 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getScriptingModel()
		 * @generated
		 */
		EClass SCRIPTING_MODEL = eINSTANCE.getScriptingModel();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING_MODEL__ACTIVITY = eINSTANCE.getScriptingModel_Activity();

		/**
		 * The meta object literal for the '<em><b>Saveparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING_MODEL__SAVEPARAMETERS = eINSTANCE.getScriptingModel_Saveparameters();

		/**
		 * The meta object literal for the '<em><b>Datatable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING_MODEL__DATATABLE = eINSTANCE.getScriptingModel_Datatable();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING_MODEL__FINAL = eINSTANCE.getScriptingModel_Final();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING_MODEL__INITIAL = eINSTANCE.getScriptingModel_Initial();

		/**
		 * The meta object literal for the '<em><b>Thinktime</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTING_MODEL__THINKTIME = eINSTANCE.getScriptingModel_Thinktime();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScripting.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScripting.impl.TransitionImpl
		 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Porcentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__PORCENTAGE = eINSTANCE.getTransition_Porcentage();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ACTIVITY = eINSTANCE.getTransition_Activity();

		/**
		 * The meta object literal for the '<em><b>Thinktime</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__THINKTIME = eINSTANCE.getTransition_Thinktime();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScripting.TYPEACTION <em>TYPEACTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScripting.TYPEACTION
		 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getTYPEACTION()
		 * @generated
		 */
		EEnum TYPEACTION = eINSTANCE.getTYPEACTION();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScripting.UPDATED_VALUE_ON <em>UPDATED VALUE ON</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScripting.UPDATED_VALUE_ON
		 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getUPDATED_VALUE_ON()
		 * @generated
		 */
		EEnum UPDATED_VALUE_ON = eINSTANCE.getUPDATED_VALUE_ON();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScripting.SELECT_NEXT_ROW <em>SELECT NEXT ROW</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScripting.SELECT_NEXT_ROW
		 * @see canopus.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getSELECT_NEXT_ROW()
		 * @generated
		 */
		EEnum SELECT_NEXT_ROW = eINSTANCE.getSELECT_NEXT_ROW();

	}

} //CanopusPerformanceScriptingPackage
