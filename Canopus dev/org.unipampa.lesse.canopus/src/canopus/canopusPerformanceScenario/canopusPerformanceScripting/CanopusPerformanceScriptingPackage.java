/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting;

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
 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingFactory
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
	CanopusPerformanceScriptingPackage eINSTANCE = canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl.init();

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.InitialImpl <em>Initial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.InitialImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getInitial()
	 * @generated
	 */
	int INITIAL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Initial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Initial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.FinalImpl <em>Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.FinalImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getFinal()
	 * @generated
	 */
	int FINAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getActivity()
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
	 * The feature id for the '<em><b>Parameterhiddenobject</b></em>' reference list.
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
	 * The feature id for the '<em><b>Final</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FINAL = 7;

	/**
	 * The feature id for the '<em><b>Thinktime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__THINKTIME = 8;

	/**
	 * The feature id for the '<em><b>Scripting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SCRIPTING = 9;

	/**
	 * The feature id for the '<em><b>Activitytoactivity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTIVITYTOACTIVITY = 10;

	/**
	 * The feature id for the '<em><b>Saveparameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SAVEPARAMETERS = 11;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ThinkTimeImpl <em>Think Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ThinkTimeImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getThinkTime()
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
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_TIME__ACTIVITY = 2;

	/**
	 * The number of structural features of the '<em>Think Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_TIME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Think Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THINK_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.SaveParametersImpl <em>Save Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.SaveParametersImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getSaveParameters()
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
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.DataTableImpl <em>Data Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.DataTableImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getDataTable()
	 * @generated
	 */
	int DATA_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Attached File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE__ATTACHED_FILE = 0;

	/**
	 * The feature id for the '<em><b>Delimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE__DELIMETER = 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE__ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Columnshiddenobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE__COLUMNSHIDDENOBJECT = 3;

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
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl <em>Parameter Hidden Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getParameterHiddenObject()
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
	 * The feature id for the '<em><b>Columnshiddenobject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_HIDDEN_OBJECT__COLUMNSHIDDENOBJECT = 3;

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
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ColumnsHiddenObjectImpl <em>Columns Hidden Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ColumnsHiddenObjectImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getColumnsHiddenObject()
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
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityToActivityImpl <em>Activity To Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityToActivityImpl
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getActivityToActivity()
	 * @generated
	 */
	int ACTIVITY_TO_ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Time Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TO_ACTIVITY__TIME_PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TO_ACTIVITY__ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Activies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TO_ACTIVITY__ACTIVIES = 2;

	/**
	 * The number of structural features of the '<em>Activity To Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TO_ACTIVITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity To Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TO_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.TYPEACTION <em>TYPEACTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.TYPEACTION
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getTYPEACTION()
	 * @generated
	 */
	int TYPEACTION = 9;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.UPDATED_VALUE_ON <em>UPDATED VALUE ON</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.UPDATED_VALUE_ON
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getUPDATED_VALUE_ON()
	 * @generated
	 */
	int UPDATED_VALUE_ON = 10;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.SELECT_NEXT_ROW <em>SELECT NEXT ROW</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.SELECT_NEXT_ROW
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getSELECT_NEXT_ROW()
	 * @generated
	 */
	int SELECT_NEXT_ROW = 11;

	/**
	 * The meta object id for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.METHOD <em>METHOD</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.METHOD
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getMETHOD()
	 * @generated
	 */
	int METHOD = 12;


	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial
	 * @generated
	 */
	EClass getInitial();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial#getName()
	 * @see #getInitial()
	 * @generated
	 */
	EAttribute getInitial_Name();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial#getActivity()
	 * @see #getInitial()
	 * @generated
	 */
	EReference getInitial_Activity();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Final
	 * @generated
	 */
	EClass getFinal();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Final#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Final#getName()
	 * @see #getFinal()
	 * @generated
	 */
	EAttribute getFinal_Name();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getAction()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Action();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getMethod()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Method();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getTypeAction <em>Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Action</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getTypeAction()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_TypeAction();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getLoopInstances <em>Loop Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Instances</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getLoopInstances()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_LoopInstances();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getParameterhiddenobject <em>Parameterhiddenobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameterhiddenobject</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getParameterhiddenobject()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Parameterhiddenobject();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#isTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#isTransaction()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Transaction();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Final</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getFinal()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Final();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getThinktime <em>Thinktime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thinktime</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getThinktime()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Thinktime();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getScripting <em>Scripting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scripting</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getScripting()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Scripting();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getActivitytoactivity <em>Activitytoactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitytoactivity</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getActivitytoactivity()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Activitytoactivity();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getSaveparameters <em>Saveparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Saveparameters</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity#getSaveparameters()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Saveparameters();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime <em>Think Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Think Time</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime
	 * @generated
	 */
	EClass getThinkTime();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime#getName()
	 * @see #getThinkTime()
	 * @generated
	 */
	EAttribute getThinkTime_Name();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime#getTime()
	 * @see #getThinkTime()
	 * @generated
	 */
	EAttribute getThinkTime_Time();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime#getActivity()
	 * @see #getThinkTime()
	 * @generated
	 */
	EReference getThinkTime_Activity();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.SaveParameters <em>Save Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Save Parameters</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.SaveParameters
	 * @generated
	 */
	EClass getSaveParameters();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.SaveParameters#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.SaveParameters#getName()
	 * @see #getSaveParameters()
	 * @generated
	 */
	EAttribute getSaveParameters_Name();

	/**
	 * Returns the meta object for the containment reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.SaveParameters#getParameterhiddenobject <em>Parameterhiddenobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameterhiddenobject</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.SaveParameters#getParameterhiddenobject()
	 * @see #getSaveParameters()
	 * @generated
	 */
	EReference getSaveParameters_Parameterhiddenobject();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable <em>Data Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Table</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable
	 * @generated
	 */
	EClass getDataTable();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getAttachedFile <em>Attached File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached File</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getAttachedFile()
	 * @see #getDataTable()
	 * @generated
	 */
	EAttribute getDataTable_AttachedFile();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getDelimeter <em>Delimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimeter</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getDelimeter()
	 * @see #getDataTable()
	 * @generated
	 */
	EAttribute getDataTable_Delimeter();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getActivity()
	 * @see #getDataTable()
	 * @generated
	 */
	EReference getDataTable_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getColumnshiddenobject <em>Columnshiddenobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columnshiddenobject</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable#getColumnshiddenobject()
	 * @see #getDataTable()
	 * @generated
	 */
	EReference getDataTable_Columnshiddenobject();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject <em>Parameter Hidden Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Hidden Object</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject
	 * @generated
	 */
	EClass getParameterHiddenObject();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getTypeAction <em>Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Action</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getTypeAction()
	 * @see #getParameterHiddenObject()
	 * @generated
	 */
	EAttribute getParameterHiddenObject_TypeAction();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getParameterName()
	 * @see #getParameterHiddenObject()
	 * @generated
	 */
	EAttribute getParameterHiddenObject_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getStaticValue <em>Static Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Value</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getStaticValue()
	 * @see #getParameterHiddenObject()
	 * @generated
	 */
	EAttribute getParameterHiddenObject_StaticValue();

	/**
	 * Returns the meta object for the reference list '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getColumnshiddenobject <em>Columnshiddenobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columnshiddenobject</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject#getColumnshiddenobject()
	 * @see #getParameterHiddenObject()
	 * @generated
	 */
	EReference getParameterHiddenObject_Columnshiddenobject();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject <em>Columns Hidden Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columns Hidden Object</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject
	 * @generated
	 */
	EClass getColumnsHiddenObject();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getReferendedParameter <em>Referended Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referended Parameter</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getReferendedParameter()
	 * @see #getColumnsHiddenObject()
	 * @generated
	 */
	EAttribute getColumnsHiddenObject_ReferendedParameter();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getSelectnextrow <em>Selectnextrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selectnextrow</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getSelectnextrow()
	 * @see #getColumnsHiddenObject()
	 * @generated
	 */
	EAttribute getColumnsHiddenObject_Selectnextrow();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getUpdatedvalueon <em>Updatedvalueon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatedvalueon</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getUpdatedvalueon()
	 * @see #getColumnsHiddenObject()
	 * @generated
	 */
	EAttribute getColumnsHiddenObject_Updatedvalueon();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject#getParameterName()
	 * @see #getColumnsHiddenObject()
	 * @generated
	 */
	EAttribute getColumnsHiddenObject_ParameterName();

	/**
	 * Returns the meta object for class '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity <em>Activity To Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity To Activity</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity
	 * @generated
	 */
	EClass getActivityToActivity();

	/**
	 * Returns the meta object for the attribute '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity#getTimePercentage <em>Time Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Percentage</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity#getTimePercentage()
	 * @see #getActivityToActivity()
	 * @generated
	 */
	EAttribute getActivityToActivity_TimePercentage();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity#getActivity()
	 * @see #getActivityToActivity()
	 * @generated
	 */
	EReference getActivityToActivity_Activity();

	/**
	 * Returns the meta object for the reference '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity#getActivies <em>Activies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activies</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity#getActivies()
	 * @see #getActivityToActivity()
	 * @generated
	 */
	EReference getActivityToActivity_Activies();

	/**
	 * Returns the meta object for enum '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.TYPEACTION <em>TYPEACTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TYPEACTION</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.TYPEACTION
	 * @generated
	 */
	EEnum getTYPEACTION();

	/**
	 * Returns the meta object for enum '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.UPDATED_VALUE_ON <em>UPDATED VALUE ON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>UPDATED VALUE ON</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.UPDATED_VALUE_ON
	 * @generated
	 */
	EEnum getUPDATED_VALUE_ON();

	/**
	 * Returns the meta object for enum '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.SELECT_NEXT_ROW <em>SELECT NEXT ROW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SELECT NEXT ROW</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.SELECT_NEXT_ROW
	 * @generated
	 */
	EEnum getSELECT_NEXT_ROW();

	/**
	 * Returns the meta object for enum '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.METHOD <em>METHOD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>METHOD</em>'.
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.METHOD
	 * @generated
	 */
	EEnum getMETHOD();

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
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.InitialImpl <em>Initial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.InitialImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getInitial()
		 * @generated
		 */
		EClass INITIAL = eINSTANCE.getInitial();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL__NAME = eINSTANCE.getInitial_Name();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL__ACTIVITY = eINSTANCE.getInitial_Activity();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.FinalImpl <em>Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.FinalImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getFinal()
		 * @generated
		 */
		EClass FINAL = eINSTANCE.getFinal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINAL__NAME = eINSTANCE.getFinal_Name();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getActivity()
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
		 * The meta object literal for the '<em><b>Parameterhiddenobject</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Final</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__FINAL = eINSTANCE.getActivity_Final();

		/**
		 * The meta object literal for the '<em><b>Thinktime</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__THINKTIME = eINSTANCE.getActivity_Thinktime();

		/**
		 * The meta object literal for the '<em><b>Scripting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SCRIPTING = eINSTANCE.getActivity_Scripting();

		/**
		 * The meta object literal for the '<em><b>Activitytoactivity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ACTIVITYTOACTIVITY = eINSTANCE.getActivity_Activitytoactivity();

		/**
		 * The meta object literal for the '<em><b>Saveparameters</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SAVEPARAMETERS = eINSTANCE.getActivity_Saveparameters();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ThinkTimeImpl <em>Think Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ThinkTimeImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getThinkTime()
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
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THINK_TIME__ACTIVITY = eINSTANCE.getThinkTime_Activity();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.SaveParametersImpl <em>Save Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.SaveParametersImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getSaveParameters()
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
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.DataTableImpl <em>Data Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.DataTableImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getDataTable()
		 * @generated
		 */
		EClass DATA_TABLE = eINSTANCE.getDataTable();

		/**
		 * The meta object literal for the '<em><b>Attached File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TABLE__ATTACHED_FILE = eINSTANCE.getDataTable_AttachedFile();

		/**
		 * The meta object literal for the '<em><b>Delimeter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TABLE__DELIMETER = eINSTANCE.getDataTable_Delimeter();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TABLE__ACTIVITY = eINSTANCE.getDataTable_Activity();

		/**
		 * The meta object literal for the '<em><b>Columnshiddenobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TABLE__COLUMNSHIDDENOBJECT = eINSTANCE.getDataTable_Columnshiddenobject();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl <em>Parameter Hidden Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ParameterHiddenObjectImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getParameterHiddenObject()
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
		 * The meta object literal for the '<em><b>Columnshiddenobject</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_HIDDEN_OBJECT__COLUMNSHIDDENOBJECT = eINSTANCE.getParameterHiddenObject_Columnshiddenobject();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ColumnsHiddenObjectImpl <em>Columns Hidden Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ColumnsHiddenObjectImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getColumnsHiddenObject()
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
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityToActivityImpl <em>Activity To Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityToActivityImpl
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getActivityToActivity()
		 * @generated
		 */
		EClass ACTIVITY_TO_ACTIVITY = eINSTANCE.getActivityToActivity();

		/**
		 * The meta object literal for the '<em><b>Time Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_TO_ACTIVITY__TIME_PERCENTAGE = eINSTANCE.getActivityToActivity_TimePercentage();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TO_ACTIVITY__ACTIVITY = eINSTANCE.getActivityToActivity_Activity();

		/**
		 * The meta object literal for the '<em><b>Activies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TO_ACTIVITY__ACTIVIES = eINSTANCE.getActivityToActivity_Activies();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.TYPEACTION <em>TYPEACTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.TYPEACTION
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getTYPEACTION()
		 * @generated
		 */
		EEnum TYPEACTION = eINSTANCE.getTYPEACTION();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.UPDATED_VALUE_ON <em>UPDATED VALUE ON</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.UPDATED_VALUE_ON
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getUPDATED_VALUE_ON()
		 * @generated
		 */
		EEnum UPDATED_VALUE_ON = eINSTANCE.getUPDATED_VALUE_ON();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.SELECT_NEXT_ROW <em>SELECT NEXT ROW</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.SELECT_NEXT_ROW
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getSELECT_NEXT_ROW()
		 * @generated
		 */
		EEnum SELECT_NEXT_ROW = eINSTANCE.getSELECT_NEXT_ROW();

		/**
		 * The meta object literal for the '{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.METHOD <em>METHOD</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.METHOD
		 * @see canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.CanopusPerformanceScriptingPackageImpl#getMETHOD()
		 * @generated
		 */
		EEnum METHOD = eINSTANCE.getMETHOD();

	}

} //CanopusPerformanceScriptingPackage
