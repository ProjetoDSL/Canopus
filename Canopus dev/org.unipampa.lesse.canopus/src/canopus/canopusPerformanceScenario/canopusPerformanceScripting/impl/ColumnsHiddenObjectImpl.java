/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.SELECT_NEXT_ROW;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.UPDATED_VALUE_ON;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Columns Hidden Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ColumnsHiddenObjectImpl#getReferendedParameter <em>Referended Parameter</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ColumnsHiddenObjectImpl#getSelectnextrow <em>Selectnextrow</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ColumnsHiddenObjectImpl#getUpdatedvalueon <em>Updatedvalueon</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ColumnsHiddenObjectImpl#getParameterName <em>Parameter Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnsHiddenObjectImpl extends MinimalEObjectImpl.Container implements ColumnsHiddenObject {
	/**
	 * The default value of the '{@link #getReferendedParameter() <em>Referended Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferendedParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENDED_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferendedParameter() <em>Referended Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferendedParameter()
	 * @generated
	 * @ordered
	 */
	protected String referendedParameter = REFERENDED_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectnextrow() <em>Selectnextrow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectnextrow()
	 * @generated
	 * @ordered
	 */
	protected static final SELECT_NEXT_ROW SELECTNEXTROW_EDEFAULT = SELECT_NEXT_ROW.SEQUENTIAL;

	/**
	 * The cached value of the '{@link #getSelectnextrow() <em>Selectnextrow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectnextrow()
	 * @generated
	 * @ordered
	 */
	protected SELECT_NEXT_ROW selectnextrow = SELECTNEXTROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdatedvalueon() <em>Updatedvalueon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedvalueon()
	 * @generated
	 * @ordered
	 */
	protected static final UPDATED_VALUE_ON UPDATEDVALUEON_EDEFAULT = UPDATED_VALUE_ON.EACH_INTERACTION;

	/**
	 * The cached value of the '{@link #getUpdatedvalueon() <em>Updatedvalueon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedvalueon()
	 * @generated
	 * @ordered
	 */
	protected UPDATED_VALUE_ON updatedvalueon = UPDATEDVALUEON_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected String parameterName = PARAMETER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnsHiddenObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScriptingPackage.Literals.COLUMNS_HIDDEN_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferendedParameter() {
		return referendedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferendedParameter(String newReferendedParameter) {
		String oldReferendedParameter = referendedParameter;
		referendedParameter = newReferendedParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__REFERENDED_PARAMETER, oldReferendedParameter, referendedParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SELECT_NEXT_ROW getSelectnextrow() {
		return selectnextrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectnextrow(SELECT_NEXT_ROW newSelectnextrow) {
		SELECT_NEXT_ROW oldSelectnextrow = selectnextrow;
		selectnextrow = newSelectnextrow == null ? SELECTNEXTROW_EDEFAULT : newSelectnextrow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__SELECTNEXTROW, oldSelectnextrow, selectnextrow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UPDATED_VALUE_ON getUpdatedvalueon() {
		return updatedvalueon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdatedvalueon(UPDATED_VALUE_ON newUpdatedvalueon) {
		UPDATED_VALUE_ON oldUpdatedvalueon = updatedvalueon;
		updatedvalueon = newUpdatedvalueon == null ? UPDATEDVALUEON_EDEFAULT : newUpdatedvalueon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__UPDATEDVALUEON, oldUpdatedvalueon, updatedvalueon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterName(String newParameterName) {
		String oldParameterName = parameterName;
		parameterName = newParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__PARAMETER_NAME, oldParameterName, parameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__REFERENDED_PARAMETER:
				return getReferendedParameter();
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__SELECTNEXTROW:
				return getSelectnextrow();
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__UPDATEDVALUEON:
				return getUpdatedvalueon();
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__PARAMETER_NAME:
				return getParameterName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__REFERENDED_PARAMETER:
				setReferendedParameter((String)newValue);
				return;
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__SELECTNEXTROW:
				setSelectnextrow((SELECT_NEXT_ROW)newValue);
				return;
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__UPDATEDVALUEON:
				setUpdatedvalueon((UPDATED_VALUE_ON)newValue);
				return;
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__PARAMETER_NAME:
				setParameterName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__REFERENDED_PARAMETER:
				setReferendedParameter(REFERENDED_PARAMETER_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__SELECTNEXTROW:
				setSelectnextrow(SELECTNEXTROW_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__UPDATEDVALUEON:
				setUpdatedvalueon(UPDATEDVALUEON_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__PARAMETER_NAME:
				setParameterName(PARAMETER_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__REFERENDED_PARAMETER:
				return REFERENDED_PARAMETER_EDEFAULT == null ? referendedParameter != null : !REFERENDED_PARAMETER_EDEFAULT.equals(referendedParameter);
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__SELECTNEXTROW:
				return selectnextrow != SELECTNEXTROW_EDEFAULT;
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__UPDATEDVALUEON:
				return updatedvalueon != UPDATEDVALUEON_EDEFAULT;
			case CanopusPerformanceScriptingPackage.COLUMNS_HIDDEN_OBJECT__PARAMETER_NAME:
				return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (referendedParameter: ");
		result.append(referendedParameter);
		result.append(", selectnextrow: ");
		result.append(selectnextrow);
		result.append(", updatedvalueon: ");
		result.append(updatedvalueon);
		result.append(", parameterName: ");
		result.append(parameterName);
		result.append(')');
		return result.toString();
	}

} //ColumnsHiddenObjectImpl
