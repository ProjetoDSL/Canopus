/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.*;

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
public class OpenmlperfPerformanceScriptingFactoryImpl extends EFactoryImpl implements OpenmlperfPerformanceScriptingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenmlperfPerformanceScriptingFactory init() {
		try {
			OpenmlperfPerformanceScriptingFactory theOpenmlperfPerformanceScriptingFactory = (OpenmlperfPerformanceScriptingFactory)EPackage.Registry.INSTANCE.getEFactory(OpenmlperfPerformanceScriptingPackage.eNS_URI);
			if (theOpenmlperfPerformanceScriptingFactory != null) {
				return theOpenmlperfPerformanceScriptingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenmlperfPerformanceScriptingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceScriptingFactoryImpl() {
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
			case OpenmlperfPerformanceScriptingPackage.INITIAL: return createInitial();
			case OpenmlperfPerformanceScriptingPackage.FINAL: return createFinal();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY: return createActivity();
			case OpenmlperfPerformanceScriptingPackage.THINK_TIME: return createThinkTime();
			case OpenmlperfPerformanceScriptingPackage.SAVE_PARAMETERS: return createSaveParameters();
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE: return createDataTable();
			case OpenmlperfPerformanceScriptingPackage.PARAMETER_OBJECT: return createParameterObject();
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT: return createColumnsObject();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY: return createActivityToActivity();
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
			case OpenmlperfPerformanceScriptingPackage.TYPEACTION:
				return createTYPEACTIONFromString(eDataType, initialValue);
			case OpenmlperfPerformanceScriptingPackage.UPDATED_VALUE_ON:
				return createUPDATED_VALUE_ONFromString(eDataType, initialValue);
			case OpenmlperfPerformanceScriptingPackage.SELECT_NEXT_ROW:
				return createSELECT_NEXT_ROWFromString(eDataType, initialValue);
			case OpenmlperfPerformanceScriptingPackage.METHOD:
				return createMETHODFromString(eDataType, initialValue);
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
			case OpenmlperfPerformanceScriptingPackage.TYPEACTION:
				return convertTYPEACTIONToString(eDataType, instanceValue);
			case OpenmlperfPerformanceScriptingPackage.UPDATED_VALUE_ON:
				return convertUPDATED_VALUE_ONToString(eDataType, instanceValue);
			case OpenmlperfPerformanceScriptingPackage.SELECT_NEXT_ROW:
				return convertSELECT_NEXT_ROWToString(eDataType, instanceValue);
			case OpenmlperfPerformanceScriptingPackage.METHOD:
				return convertMETHODToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initial createInitial() {
		InitialImpl initial = new InitialImpl();
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Final createFinal() {
		FinalImpl final_ = new FinalImpl();
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThinkTime createThinkTime() {
		ThinkTimeImpl thinkTime = new ThinkTimeImpl();
		return thinkTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaveParameters createSaveParameters() {
		SaveParametersImpl saveParameters = new SaveParametersImpl();
		return saveParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTable createDataTable() {
		DataTableImpl dataTable = new DataTableImpl();
		return dataTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterObject createParameterObject() {
		ParameterObjectImpl parameterObject = new ParameterObjectImpl();
		return parameterObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsObject createColumnsObject() {
		ColumnsObjectImpl columnsObject = new ColumnsObjectImpl();
		return columnsObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityToActivity createActivityToActivity() {
		ActivityToActivityImpl activityToActivity = new ActivityToActivityImpl();
		return activityToActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEACTION createTYPEACTIONFromString(EDataType eDataType, String initialValue) {
		TYPEACTION result = TYPEACTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTYPEACTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UPDATED_VALUE_ON createUPDATED_VALUE_ONFromString(EDataType eDataType, String initialValue) {
		UPDATED_VALUE_ON result = UPDATED_VALUE_ON.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUPDATED_VALUE_ONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SELECT_NEXT_ROW createSELECT_NEXT_ROWFromString(EDataType eDataType, String initialValue) {
		SELECT_NEXT_ROW result = SELECT_NEXT_ROW.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSELECT_NEXT_ROWToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public METHOD createMETHODFromString(EDataType eDataType, String initialValue) {
		METHOD result = METHOD.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMETHODToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceScriptingPackage getOpenmlperfPerformanceScriptingPackage() {
		return (OpenmlperfPerformanceScriptingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenmlperfPerformanceScriptingPackage getPackage() {
		return OpenmlperfPerformanceScriptingPackage.eINSTANCE;
	}

} //OpenmlperfPerformanceScriptingFactoryImpl
