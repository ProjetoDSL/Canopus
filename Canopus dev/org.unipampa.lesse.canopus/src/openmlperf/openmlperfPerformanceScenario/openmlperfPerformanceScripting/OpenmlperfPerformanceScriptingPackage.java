/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting;

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
 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingFactory
 * @model kind="package"
 * @generated
 */
public interface OpenmlperfPerformanceScriptingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openmlperfPerformanceScripting";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unipampa.lesse.org/openmlperfPerformanceScripting";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openmlperfPerformanceScripting";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenmlperfPerformanceScriptingPackage eINSTANCE = openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl.init();

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.InitialImpl <em>Initial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.InitialImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getInitial()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.FinalImpl <em>Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.FinalImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getFinal()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getActivity()
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
	 * The feature id for the '<em><b>Datatable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DATATABLE = 12;

	/**
	 * The feature id for the '<em><b>Columnshiddenobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__COLUMNSHIDDENOBJECT = 13;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ThinkTimeImpl <em>Think Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ThinkTimeImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getThinkTime()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.SaveParametersImpl <em>Save Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.SaveParametersImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getSaveParameters()
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
	 * The feature id for the '<em><b>Parameterbject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_PARAMETERS__PARAMETERBJECT = 1;

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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.DataTableImpl <em>Data Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.DataTableImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getDataTable()
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
	 * The number of structural features of the '<em>Data Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ParameterObjectImpl <em>Parameter Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ParameterObjectImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getParameterObject()
	 * @generated
	 */
	int PARAMETER_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Type Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OBJECT__TYPE_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OBJECT__PARAMETER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Static Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OBJECT__STATIC_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Columnsobject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OBJECT__COLUMNSOBJECT = 3;

	/**
	 * The number of structural features of the '<em>Parameter Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ColumnsObjectImpl <em>Columns Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ColumnsObjectImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getColumnsObject()
	 * @generated
	 */
	int COLUMNS_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Referended Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_OBJECT__REFERENDED_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Selectnextrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_OBJECT__SELECTNEXTROW = 1;

	/**
	 * The feature id for the '<em><b>Updatedvalueon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_OBJECT__UPDATEDVALUEON = 2;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_OBJECT__PARAMETER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Datatable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_OBJECT__DATATABLE = 4;

	/**
	 * The number of structural features of the '<em>Columns Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_OBJECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Columns Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityToActivityImpl <em>Activity To Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityToActivityImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getActivityToActivity()
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
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.TYPEACTION <em>TYPEACTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.TYPEACTION
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getTYPEACTION()
	 * @generated
	 */
	int TYPEACTION = 9;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.UPDATED_VALUE_ON <em>UPDATED VALUE ON</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.UPDATED_VALUE_ON
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getUPDATED_VALUE_ON()
	 * @generated
	 */
	int UPDATED_VALUE_ON = 10;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SELECT_NEXT_ROW <em>SELECT NEXT ROW</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SELECT_NEXT_ROW
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getSELECT_NEXT_ROW()
	 * @generated
	 */
	int SELECT_NEXT_ROW = 11;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.METHOD <em>METHOD</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.METHOD
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getMETHOD()
	 * @generated
	 */
	int METHOD = 12;


	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Initial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Initial
	 * @generated
	 */
	EClass getInitial();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Initial#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Initial#getName()
	 * @see #getInitial()
	 * @generated
	 */
	EAttribute getInitial_Name();

	/**
	 * Returns the meta object for the reference '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Initial#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Initial#getActivity()
	 * @see #getInitial()
	 * @generated
	 */
	EReference getInitial_Activity();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Final
	 * @generated
	 */
	EClass getFinal();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Final#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Final#getName()
	 * @see #getFinal()
	 * @generated
	 */
	EAttribute getFinal_Name();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getAction()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Action();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getMethod()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Method();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getTypeAction <em>Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Action</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getTypeAction()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_TypeAction();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getLoopInstances <em>Loop Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Instances</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getLoopInstances()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_LoopInstances();

	/**
	 * Returns the meta object for the reference list '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getParameterhiddenobject <em>Parameterhiddenobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameterhiddenobject</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getParameterhiddenobject()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Parameterhiddenobject();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#isTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#isTransaction()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Transaction();

	/**
	 * Returns the meta object for the reference '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Final</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getFinal()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Final();

	/**
	 * Returns the meta object for the reference '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getThinktime <em>Thinktime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thinktime</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getThinktime()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Thinktime();

	/**
	 * Returns the meta object for the reference '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getScripting <em>Scripting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scripting</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getScripting()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Scripting();

	/**
	 * Returns the meta object for the reference list '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getActivitytoactivity <em>Activitytoactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitytoactivity</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getActivitytoactivity()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Activitytoactivity();

	/**
	 * Returns the meta object for the reference '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getSaveparameters <em>Saveparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Saveparameters</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getSaveparameters()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Saveparameters();

	/**
	 * Returns the meta object for the reference '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getDatatable <em>Datatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatable</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getDatatable()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Datatable();

	/**
	 * Returns the meta object for the containment reference list '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getColumnshiddenobject <em>Columnshiddenobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columnshiddenobject</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity#getColumnshiddenobject()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Columnshiddenobject();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime <em>Think Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Think Time</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime
	 * @generated
	 */
	EClass getThinkTime();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime#getName()
	 * @see #getThinkTime()
	 * @generated
	 */
	EAttribute getThinkTime_Name();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime#getTime()
	 * @see #getThinkTime()
	 * @generated
	 */
	EAttribute getThinkTime_Time();

	/**
	 * Returns the meta object for the reference '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime#getActivity()
	 * @see #getThinkTime()
	 * @generated
	 */
	EReference getThinkTime_Activity();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SaveParameters <em>Save Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Save Parameters</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SaveParameters
	 * @generated
	 */
	EClass getSaveParameters();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SaveParameters#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SaveParameters#getName()
	 * @see #getSaveParameters()
	 * @generated
	 */
	EAttribute getSaveParameters_Name();

	/**
	 * Returns the meta object for the containment reference '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SaveParameters#getParameterbject <em>Parameterbject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameterbject</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SaveParameters#getParameterbject()
	 * @see #getSaveParameters()
	 * @generated
	 */
	EReference getSaveParameters_Parameterbject();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable <em>Data Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Table</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable
	 * @generated
	 */
	EClass getDataTable();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable#getAttachedFile <em>Attached File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached File</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable#getAttachedFile()
	 * @see #getDataTable()
	 * @generated
	 */
	EAttribute getDataTable_AttachedFile();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable#getDelimeter <em>Delimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimeter</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable#getDelimeter()
	 * @see #getDataTable()
	 * @generated
	 */
	EAttribute getDataTable_Delimeter();

	/**
	 * Returns the meta object for the reference list '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable#getActivity()
	 * @see #getDataTable()
	 * @generated
	 */
	EReference getDataTable_Activity();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject <em>Parameter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Object</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject
	 * @generated
	 */
	EClass getParameterObject();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getTypeAction <em>Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Action</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getTypeAction()
	 * @see #getParameterObject()
	 * @generated
	 */
	EAttribute getParameterObject_TypeAction();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getParameterName()
	 * @see #getParameterObject()
	 * @generated
	 */
	EAttribute getParameterObject_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getStaticValue <em>Static Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Value</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getStaticValue()
	 * @see #getParameterObject()
	 * @generated
	 */
	EAttribute getParameterObject_StaticValue();

	/**
	 * Returns the meta object for the reference list '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getColumnsobject <em>Columnsobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columnsobject</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject#getColumnsobject()
	 * @see #getParameterObject()
	 * @generated
	 */
	EReference getParameterObject_Columnsobject();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject <em>Columns Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columns Object</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject
	 * @generated
	 */
	EClass getColumnsObject();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getReferendedParameter <em>Referended Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referended Parameter</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getReferendedParameter()
	 * @see #getColumnsObject()
	 * @generated
	 */
	EAttribute getColumnsObject_ReferendedParameter();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getSelectnextrow <em>Selectnextrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selectnextrow</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getSelectnextrow()
	 * @see #getColumnsObject()
	 * @generated
	 */
	EAttribute getColumnsObject_Selectnextrow();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getUpdatedvalueon <em>Updatedvalueon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatedvalueon</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getUpdatedvalueon()
	 * @see #getColumnsObject()
	 * @generated
	 */
	EAttribute getColumnsObject_Updatedvalueon();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getParameterName()
	 * @see #getColumnsObject()
	 * @generated
	 */
	EAttribute getColumnsObject_ParameterName();

	/**
	 * Returns the meta object for the containment reference list '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getDatatable <em>Datatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatable</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject#getDatatable()
	 * @see #getColumnsObject()
	 * @generated
	 */
	EReference getColumnsObject_Datatable();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity <em>Activity To Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity To Activity</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity
	 * @generated
	 */
	EClass getActivityToActivity();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity#getTimePercentage <em>Time Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Percentage</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity#getTimePercentage()
	 * @see #getActivityToActivity()
	 * @generated
	 */
	EAttribute getActivityToActivity_TimePercentage();

	/**
	 * Returns the meta object for the reference '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity#getActivity()
	 * @see #getActivityToActivity()
	 * @generated
	 */
	EReference getActivityToActivity_Activity();

	/**
	 * Returns the meta object for the reference '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity#getActivies <em>Activies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activies</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity#getActivies()
	 * @see #getActivityToActivity()
	 * @generated
	 */
	EReference getActivityToActivity_Activies();

	/**
	 * Returns the meta object for enum '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.TYPEACTION <em>TYPEACTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TYPEACTION</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.TYPEACTION
	 * @generated
	 */
	EEnum getTYPEACTION();

	/**
	 * Returns the meta object for enum '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.UPDATED_VALUE_ON <em>UPDATED VALUE ON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>UPDATED VALUE ON</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.UPDATED_VALUE_ON
	 * @generated
	 */
	EEnum getUPDATED_VALUE_ON();

	/**
	 * Returns the meta object for enum '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SELECT_NEXT_ROW <em>SELECT NEXT ROW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SELECT NEXT ROW</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SELECT_NEXT_ROW
	 * @generated
	 */
	EEnum getSELECT_NEXT_ROW();

	/**
	 * Returns the meta object for enum '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.METHOD <em>METHOD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>METHOD</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.METHOD
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
	OpenmlperfPerformanceScriptingFactory getOpenmlperfPerformanceScriptingFactory();

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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.InitialImpl <em>Initial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.InitialImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getInitial()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.FinalImpl <em>Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.FinalImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getFinal()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getActivity()
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
		 * The meta object literal for the '<em><b>Datatable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__DATATABLE = eINSTANCE.getActivity_Datatable();

		/**
		 * The meta object literal for the '<em><b>Columnshiddenobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__COLUMNSHIDDENOBJECT = eINSTANCE.getActivity_Columnshiddenobject();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ThinkTimeImpl <em>Think Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ThinkTimeImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getThinkTime()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.SaveParametersImpl <em>Save Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.SaveParametersImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getSaveParameters()
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
		 * The meta object literal for the '<em><b>Parameterbject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAVE_PARAMETERS__PARAMETERBJECT = eINSTANCE.getSaveParameters_Parameterbject();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.DataTableImpl <em>Data Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.DataTableImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getDataTable()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ParameterObjectImpl <em>Parameter Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ParameterObjectImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getParameterObject()
		 * @generated
		 */
		EClass PARAMETER_OBJECT = eINSTANCE.getParameterObject();

		/**
		 * The meta object literal for the '<em><b>Type Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_OBJECT__TYPE_ACTION = eINSTANCE.getParameterObject_TypeAction();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_OBJECT__PARAMETER_NAME = eINSTANCE.getParameterObject_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Static Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_OBJECT__STATIC_VALUE = eINSTANCE.getParameterObject_StaticValue();

		/**
		 * The meta object literal for the '<em><b>Columnsobject</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_OBJECT__COLUMNSOBJECT = eINSTANCE.getParameterObject_Columnsobject();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ColumnsObjectImpl <em>Columns Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ColumnsObjectImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getColumnsObject()
		 * @generated
		 */
		EClass COLUMNS_OBJECT = eINSTANCE.getColumnsObject();

		/**
		 * The meta object literal for the '<em><b>Referended Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNS_OBJECT__REFERENDED_PARAMETER = eINSTANCE.getColumnsObject_ReferendedParameter();

		/**
		 * The meta object literal for the '<em><b>Selectnextrow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNS_OBJECT__SELECTNEXTROW = eINSTANCE.getColumnsObject_Selectnextrow();

		/**
		 * The meta object literal for the '<em><b>Updatedvalueon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNS_OBJECT__UPDATEDVALUEON = eINSTANCE.getColumnsObject_Updatedvalueon();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNS_OBJECT__PARAMETER_NAME = eINSTANCE.getColumnsObject_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Datatable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNS_OBJECT__DATATABLE = eINSTANCE.getColumnsObject_Datatable();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityToActivityImpl <em>Activity To Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityToActivityImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getActivityToActivity()
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
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.TYPEACTION <em>TYPEACTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.TYPEACTION
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getTYPEACTION()
		 * @generated
		 */
		EEnum TYPEACTION = eINSTANCE.getTYPEACTION();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.UPDATED_VALUE_ON <em>UPDATED VALUE ON</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.UPDATED_VALUE_ON
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getUPDATED_VALUE_ON()
		 * @generated
		 */
		EEnum UPDATED_VALUE_ON = eINSTANCE.getUPDATED_VALUE_ON();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SELECT_NEXT_ROW <em>SELECT NEXT ROW</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SELECT_NEXT_ROW
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getSELECT_NEXT_ROW()
		 * @generated
		 */
		EEnum SELECT_NEXT_ROW = eINSTANCE.getSELECT_NEXT_ROW();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.METHOD <em>METHOD</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.METHOD
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingPackageImpl#getMETHOD()
		 * @generated
		 */
		EEnum METHOD = eINSTANCE.getMETHOD();

	}

} //OpenmlperfPerformanceScriptingPackage
