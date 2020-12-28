/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl;

import java.util.Collection;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SELECT_NEXT_ROW;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.UPDATED_VALUE_ON;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Columns Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ColumnsObjectImpl#getReferendedParameter <em>Referended Parameter</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ColumnsObjectImpl#getSelectnextrow <em>Selectnextrow</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ColumnsObjectImpl#getUpdatedvalueon <em>Updatedvalueon</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ColumnsObjectImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ColumnsObjectImpl#getDatatable <em>Datatable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnsObjectImpl extends MinimalEObjectImpl.Container implements ColumnsObject {
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
	 * The cached value of the '{@link #getDatatable() <em>Datatable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatable()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTable> datatable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnsObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenmlperfPerformanceScriptingPackage.Literals.COLUMNS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferendedParameter() {
		return referendedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferendedParameter(String newReferendedParameter) {
		String oldReferendedParameter = referendedParameter;
		referendedParameter = newReferendedParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__REFERENDED_PARAMETER, oldReferendedParameter, referendedParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SELECT_NEXT_ROW getSelectnextrow() {
		return selectnextrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectnextrow(SELECT_NEXT_ROW newSelectnextrow) {
		SELECT_NEXT_ROW oldSelectnextrow = selectnextrow;
		selectnextrow = newSelectnextrow == null ? SELECTNEXTROW_EDEFAULT : newSelectnextrow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__SELECTNEXTROW, oldSelectnextrow, selectnextrow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UPDATED_VALUE_ON getUpdatedvalueon() {
		return updatedvalueon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedvalueon(UPDATED_VALUE_ON newUpdatedvalueon) {
		UPDATED_VALUE_ON oldUpdatedvalueon = updatedvalueon;
		updatedvalueon = newUpdatedvalueon == null ? UPDATEDVALUEON_EDEFAULT : newUpdatedvalueon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__UPDATEDVALUEON, oldUpdatedvalueon, updatedvalueon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterName(String newParameterName) {
		String oldParameterName = parameterName;
		parameterName = newParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__PARAMETER_NAME, oldParameterName, parameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTable> getDatatable() {
		if (datatable == null) {
			datatable = new EObjectContainmentEList<DataTable>(DataTable.class, this, OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__DATATABLE);
		}
		return datatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__DATATABLE:
				return ((InternalEList<?>)getDatatable()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__REFERENDED_PARAMETER:
				return getReferendedParameter();
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__SELECTNEXTROW:
				return getSelectnextrow();
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__UPDATEDVALUEON:
				return getUpdatedvalueon();
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__PARAMETER_NAME:
				return getParameterName();
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__DATATABLE:
				return getDatatable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__REFERENDED_PARAMETER:
				setReferendedParameter((String)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__SELECTNEXTROW:
				setSelectnextrow((SELECT_NEXT_ROW)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__UPDATEDVALUEON:
				setUpdatedvalueon((UPDATED_VALUE_ON)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__PARAMETER_NAME:
				setParameterName((String)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__DATATABLE:
				getDatatable().clear();
				getDatatable().addAll((Collection<? extends DataTable>)newValue);
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
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__REFERENDED_PARAMETER:
				setReferendedParameter(REFERENDED_PARAMETER_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__SELECTNEXTROW:
				setSelectnextrow(SELECTNEXTROW_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__UPDATEDVALUEON:
				setUpdatedvalueon(UPDATEDVALUEON_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__PARAMETER_NAME:
				setParameterName(PARAMETER_NAME_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__DATATABLE:
				getDatatable().clear();
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
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__REFERENDED_PARAMETER:
				return REFERENDED_PARAMETER_EDEFAULT == null ? referendedParameter != null : !REFERENDED_PARAMETER_EDEFAULT.equals(referendedParameter);
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__SELECTNEXTROW:
				return selectnextrow != SELECTNEXTROW_EDEFAULT;
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__UPDATEDVALUEON:
				return updatedvalueon != UPDATEDVALUEON_EDEFAULT;
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__PARAMETER_NAME:
				return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
			case OpenmlperfPerformanceScriptingPackage.COLUMNS_OBJECT__DATATABLE:
				return datatable != null && !datatable.isEmpty();
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

} //ColumnsObjectImpl
