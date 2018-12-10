/**
 */
package canopus.canopusPerformanceScenario.impl;

import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;
import canopus.canopusPerformanceScenario.ScriptModel;

import canopus.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScripting.DataTable;
import canopus.canopusPerformanceScripting.Final;
import canopus.canopusPerformanceScripting.Initial;
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
 * An implementation of the model object '<em><b>Script Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptModelImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptModelImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptModelImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptModelImpl#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptModelImpl#getSaveParameters <em>Save Parameters</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptModelImpl#getDataTables <em>Data Tables</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptModelImpl extends MinimalEObjectImpl.Container implements ScriptModel {
	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

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
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected Final final_;

	/**
	 * The cached value of the '{@link #getThinkTime() <em>Think Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected EList<ThinkTime> thinkTime;

	/**
	 * The cached value of the '{@link #getSaveParameters() <em>Save Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> saveParameters;

	/**
	 * The cached value of the '{@link #getDataTables() <em>Data Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTables()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTable> dataTables;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScenarioPackage.Literals.SCRIPT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, CanopusPerformanceScenarioPackage.SCRIPT_MODEL__ACTIVITIES);
		}
		return activities;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPT_MODEL__INITIAL, oldInitial, newInitial);
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
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.SCRIPT_MODEL__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.SCRIPT_MODEL__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPT_MODEL__INITIAL, newInitial, newInitial));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPT_MODEL__FINAL, oldFinal, newFinal);
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
				msgs = ((InternalEObject)final_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.SCRIPT_MODEL__FINAL, null, msgs);
			if (newFinal != null)
				msgs = ((InternalEObject)newFinal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.SCRIPT_MODEL__FINAL, null, msgs);
			msgs = basicSetFinal(newFinal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPT_MODEL__FINAL, newFinal, newFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThinkTime> getThinkTime() {
		if (thinkTime == null) {
			thinkTime = new EObjectContainmentEList<ThinkTime>(ThinkTime.class, this, CanopusPerformanceScenarioPackage.SCRIPT_MODEL__THINK_TIME);
		}
		return thinkTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getSaveParameters() {
		if (saveParameters == null) {
			saveParameters = new EObjectContainmentEList<Activity>(Activity.class, this, CanopusPerformanceScenarioPackage.SCRIPT_MODEL__SAVE_PARAMETERS);
		}
		return saveParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTable> getDataTables() {
		if (dataTables == null) {
			dataTables = new EObjectContainmentEList<DataTable>(DataTable.class, this, CanopusPerformanceScenarioPackage.SCRIPT_MODEL__DATA_TABLES);
		}
		return dataTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPT_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__INITIAL:
				return basicSetInitial(null, msgs);
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__FINAL:
				return basicSetFinal(null, msgs);
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__THINK_TIME:
				return ((InternalEList<?>)getThinkTime()).basicRemove(otherEnd, msgs);
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__SAVE_PARAMETERS:
				return ((InternalEList<?>)getSaveParameters()).basicRemove(otherEnd, msgs);
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__DATA_TABLES:
				return ((InternalEList<?>)getDataTables()).basicRemove(otherEnd, msgs);
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
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__ACTIVITIES:
				return getActivities();
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__INITIAL:
				return getInitial();
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__FINAL:
				return getFinal();
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__THINK_TIME:
				return getThinkTime();
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__SAVE_PARAMETERS:
				return getSaveParameters();
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__DATA_TABLES:
				return getDataTables();
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__NAME:
				return getName();
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
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__INITIAL:
				setInitial((Initial)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__FINAL:
				setFinal((Final)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__THINK_TIME:
				getThinkTime().clear();
				getThinkTime().addAll((Collection<? extends ThinkTime>)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__SAVE_PARAMETERS:
				getSaveParameters().clear();
				getSaveParameters().addAll((Collection<? extends Activity>)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__DATA_TABLES:
				getDataTables().clear();
				getDataTables().addAll((Collection<? extends DataTable>)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__NAME:
				setName((String)newValue);
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
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__ACTIVITIES:
				getActivities().clear();
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__INITIAL:
				setInitial((Initial)null);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__FINAL:
				setFinal((Final)null);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__THINK_TIME:
				getThinkTime().clear();
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__SAVE_PARAMETERS:
				getSaveParameters().clear();
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__DATA_TABLES:
				getDataTables().clear();
				return;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__NAME:
				setName(NAME_EDEFAULT);
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
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__INITIAL:
				return initial != null;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__FINAL:
				return final_ != null;
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__THINK_TIME:
				return thinkTime != null && !thinkTime.isEmpty();
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__SAVE_PARAMETERS:
				return saveParameters != null && !saveParameters.isEmpty();
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__DATA_TABLES:
				return dataTables != null && !dataTables.isEmpty();
			case CanopusPerformanceScenarioPackage.SCRIPT_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ScriptModelImpl
