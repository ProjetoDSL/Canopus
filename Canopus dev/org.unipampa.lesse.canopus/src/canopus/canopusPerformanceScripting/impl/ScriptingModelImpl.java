/**
 */
package canopus.canopusPerformanceScripting.impl;

import canopus.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;
import canopus.canopusPerformanceScripting.DataTable;
import canopus.canopusPerformanceScripting.Final;
import canopus.canopusPerformanceScripting.Initial;
import canopus.canopusPerformanceScripting.SaveParameters;
import canopus.canopusPerformanceScripting.ScriptingModel;
import canopus.canopusPerformanceScripting.ThinkTime;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Scripting Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ScriptingModelImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ScriptingModelImpl#getSaveparameters <em>Saveparameters</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ScriptingModelImpl#getDatatable <em>Datatable</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ScriptingModelImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ScriptingModelImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ScriptingModelImpl#getThinktime <em>Thinktime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptingModelImpl extends MinimalEObjectImpl.Container implements ScriptingModel {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * The cached value of the '{@link #getSaveparameters() <em>Saveparameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveparameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SaveParameters> saveparameters;

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
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected Final final_;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected Initial initial;

	/**
	 * The cached value of the '{@link #getThinktime() <em>Thinktime</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinktime()
	 * @generated
	 * @ordered
	 */
	protected EList<ThinkTime> thinktime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptingModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScriptingPackage.Literals.SCRIPTING_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<Activity>(Activity.class, this, CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SaveParameters> getSaveparameters() {
		if (saveparameters == null) {
			saveparameters = new EObjectContainmentEList<SaveParameters>(SaveParameters.class, this, CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__SAVEPARAMETERS);
		}
		return saveparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTable> getDatatable() {
		if (datatable == null) {
			datatable = new EObjectContainmentEList<DataTable>(DataTable.class, this, CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__DATATABLE);
		}
		return datatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Final getFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinal(Final newFinal, NotificationChain msgs) {
		Final oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__FINAL, oldFinal, newFinal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(Final newFinal) {
		if (newFinal != final_) {
			NotificationChain msgs = null;
			if (final_ != null)
				msgs = ((InternalEObject)final_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__FINAL, null, msgs);
			if (newFinal != null)
				msgs = ((InternalEObject)newFinal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__FINAL, null, msgs);
			msgs = basicSetFinal(newFinal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__FINAL, newFinal, newFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initial getInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitial(Initial newInitial, NotificationChain msgs) {
		Initial oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__INITIAL, oldInitial, newInitial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(Initial newInitial) {
		if (newInitial != initial) {
			NotificationChain msgs = null;
			if (initial != null)
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__INITIAL, newInitial, newInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThinkTime> getThinktime() {
		if (thinktime == null) {
			thinktime = new EObjectContainmentEList<ThinkTime>(ThinkTime.class, this, CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__THINKTIME);
		}
		return thinktime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__SAVEPARAMETERS:
				return ((InternalEList<?>)getSaveparameters()).basicRemove(otherEnd, msgs);
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__DATATABLE:
				return ((InternalEList<?>)getDatatable()).basicRemove(otherEnd, msgs);
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__FINAL:
				return basicSetFinal(null, msgs);
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__INITIAL:
				return basicSetInitial(null, msgs);
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__THINKTIME:
				return ((InternalEList<?>)getThinktime()).basicRemove(otherEnd, msgs);
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
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__ACTIVITY:
				return getActivity();
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__SAVEPARAMETERS:
				return getSaveparameters();
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__DATATABLE:
				return getDatatable();
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__FINAL:
				return getFinal();
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__INITIAL:
				return getInitial();
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__THINKTIME:
				return getThinktime();
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
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__SAVEPARAMETERS:
				getSaveparameters().clear();
				getSaveparameters().addAll((Collection<? extends SaveParameters>)newValue);
				return;
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__DATATABLE:
				getDatatable().clear();
				getDatatable().addAll((Collection<? extends DataTable>)newValue);
				return;
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__FINAL:
				setFinal((Final)newValue);
				return;
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__INITIAL:
				setInitial((Initial)newValue);
				return;
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__THINKTIME:
				getThinktime().clear();
				getThinktime().addAll((Collection<? extends ThinkTime>)newValue);
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
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__ACTIVITY:
				getActivity().clear();
				return;
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__SAVEPARAMETERS:
				getSaveparameters().clear();
				return;
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__DATATABLE:
				getDatatable().clear();
				return;
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__FINAL:
				setFinal((Final)null);
				return;
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__INITIAL:
				setInitial((Initial)null);
				return;
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__THINKTIME:
				getThinktime().clear();
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
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__SAVEPARAMETERS:
				return saveparameters != null && !saveparameters.isEmpty();
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__DATATABLE:
				return datatable != null && !datatable.isEmpty();
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__FINAL:
				return final_ != null;
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__INITIAL:
				return initial != null;
			case CanopusPerformanceScriptingPackage.SCRIPTING_MODEL__THINKTIME:
				return thinktime != null && !thinktime.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScriptingModelImpl
