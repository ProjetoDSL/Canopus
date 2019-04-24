/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.*;

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
public class CanopusPerformanceScriptingFactoryImpl extends EFactoryImpl implements CanopusPerformanceScriptingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CanopusPerformanceScriptingFactory init() {
		try {
			CanopusPerformanceScriptingFactory theCanopusPerformanceScriptingFactory = (CanopusPerformanceScriptingFactory)EPackage.Registry.INSTANCE.getEFactory(CanopusPerformanceScriptingPackage.eNS_URI);
			if (theCanopusPerformanceScriptingFactory != null) {
				return theCanopusPerformanceScriptingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CanopusPerformanceScriptingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceScriptingFactoryImpl() {
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
			case CanopusPerformanceScriptingPackage.INITIAL: return createInitial();
			case CanopusPerformanceScriptingPackage.FINAL: return createFinal();
			case CanopusPerformanceScriptingPackage.ACTIVITY: return createActivity();
			case CanopusPerformanceScriptingPackage.THINK_TIME: return createThinkTime();
			case CanopusPerformanceScriptingPackage.SAVE_PARAMETERS: return createSaveParameters();
			case CanopusPerformanceScriptingPackage.DATA_TABLE: return createDataTable();
			case CanopusPerformanceScriptingPackage.PARAMETER_HIDDEN_OBJECT: return createParameterHiddenObject();
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT: return createColumnsHiddenObject();
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY: return createActivityToActivity();
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
			case CanopusPerformanceScriptingPackage.TYPEACTION:
				return createTYPEACTIONFromString(eDataType, initialValue);
			case CanopusPerformanceScriptingPackage.UPDATED_VALUE_ON:
				return createUPDATED_VALUE_ONFromString(eDataType, initialValue);
			case CanopusPerformanceScriptingPackage.SELECT_NEXT_ROW:
				return createSELECT_NEXT_ROWFromString(eDataType, initialValue);
			case CanopusPerformanceScriptingPackage.METHOD:
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
			case CanopusPerformanceScriptingPackage.TYPEACTION:
				return convertTYPEACTIONToString(eDataType, instanceValue);
			case CanopusPerformanceScriptingPackage.UPDATED_VALUE_ON:
				return convertUPDATED_VALUE_ONToString(eDataType, instanceValue);
			case CanopusPerformanceScriptingPackage.SELECT_NEXT_ROW:
				return convertSELECT_NEXT_ROWToString(eDataType, instanceValue);
			case CanopusPerformanceScriptingPackage.METHOD:
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
	@Override
	public Initial createInitial() {
		InitialImpl initial = new InitialImpl();
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Final createFinal() {
		FinalImpl final_ = new FinalImpl();
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThinkTime createThinkTime() {
		ThinkTimeImpl thinkTime = new ThinkTimeImpl();
		return thinkTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SaveParameters createSaveParameters() {
		SaveParametersImpl saveParameters = new SaveParametersImpl();
		return saveParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTable createDataTable() {
		DataTableImpl dataTable = new DataTableImpl();
		return dataTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterHiddenObject createParameterHiddenObject() {
		ParameterHiddenObjectImpl parameterHiddenObject = new ParameterHiddenObjectImpl();
		return parameterHiddenObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnsHiddenObject createColumnsHiddenObject() {
		ColumnsHiddenObjectImpl columnsHiddenObject = new ColumnsHiddenObjectImpl();
		return columnsHiddenObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public CanopusPerformanceScriptingPackage getCanopusPerformanceScriptingPackage() {
		return (CanopusPerformanceScriptingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CanopusPerformanceScriptingPackage getPackage() {
		return CanopusPerformanceScriptingPackage.eINSTANCE;
	}

} //CanopusPerformanceScriptingFactoryImpl
