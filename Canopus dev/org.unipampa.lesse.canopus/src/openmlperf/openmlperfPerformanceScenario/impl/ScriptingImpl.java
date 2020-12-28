/**
 */
package openmlperf.openmlperfPerformanceScenario.impl;

import java.util.Collection;

import openmlperf.openmlperfPerformanceScenario.OpenmlperfPerformanceScenarioPackage;
import openmlperf.openmlperfPerformanceScenario.Scripting;
import openmlperf.openmlperfPerformanceScenario.UserProfileToScript;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Final;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Initial;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SaveParameters;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scripting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.ScriptingImpl#getName <em>Name</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.ScriptingImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.ScriptingImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.ScriptingImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.ScriptingImpl#getSaveparameters <em>Saveparameters</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.ScriptingImpl#getDatatables <em>Datatables</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.ScriptingImpl#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.ScriptingImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.ScriptingImpl#getUserprofiletoscript <em>Userprofiletoscript</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.ScriptingImpl#getParamenters <em>Paramenters</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.ScriptingImpl#getActivityToActivity <em>Activity To Activity</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.ScriptingImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.impl.ScriptingImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptingImpl extends MinimalEObjectImpl.Container implements Scripting {
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
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

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
	 * The cached value of the '{@link #getDatatables() <em>Datatables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatables()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTable> datatables;

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
	 * The cached value of the '{@link #getScripts() <em>Scripts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScripts()
	 * @generated
	 * @ordered
	 */
	protected EList<Scripting> scripts;

	/**
	 * The cached value of the '{@link #getUserprofiletoscript() <em>Userprofiletoscript</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserprofiletoscript()
	 * @generated
	 * @ordered
	 */
	protected EList<UserProfileToScript> userprofiletoscript;

	/**
	 * The cached value of the '{@link #getParamenters() <em>Paramenters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamenters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterObject> paramenters;

	/**
	 * The cached value of the '{@link #getActivityToActivity() <em>Activity To Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityToActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityToActivity> activityToActivity;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnsObject> columns;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenmlperfPerformanceScenarioPackage.Literals.SCRIPTING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScenarioPackage.SCRIPTING__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScenarioPackage.SCRIPTING__INITIAL, oldInitial, newInitial);
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
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenmlperfPerformanceScenarioPackage.SCRIPTING__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenmlperfPerformanceScenarioPackage.SCRIPTING__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScenarioPackage.SCRIPTING__INITIAL, newInitial, newInitial));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScenarioPackage.SCRIPTING__FINAL, oldFinal, newFinal);
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
				msgs = ((InternalEObject)final_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenmlperfPerformanceScenarioPackage.SCRIPTING__FINAL, null, msgs);
			if (newFinal != null)
				msgs = ((InternalEObject)newFinal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenmlperfPerformanceScenarioPackage.SCRIPTING__FINAL, null, msgs);
			msgs = basicSetFinal(newFinal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScenarioPackage.SCRIPTING__FINAL, newFinal, newFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SaveParameters> getSaveparameters() {
		if (saveparameters == null) {
			saveparameters = new EObjectContainmentEList<SaveParameters>(SaveParameters.class, this, OpenmlperfPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS);
		}
		return saveparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTable> getDatatables() {
		if (datatables == null) {
			datatables = new EObjectContainmentEList<DataTable>(DataTable.class, this, OpenmlperfPerformanceScenarioPackage.SCRIPTING__DATATABLES);
		}
		return datatables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThinkTime> getThinkTime() {
		if (thinkTime == null) {
			thinkTime = new EObjectContainmentEList<ThinkTime>(ThinkTime.class, this, OpenmlperfPerformanceScenarioPackage.SCRIPTING__THINK_TIME);
		}
		return thinkTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scripting> getScripts() {
		if (scripts == null) {
			scripts = new EObjectContainmentEList<Scripting>(Scripting.class, this, OpenmlperfPerformanceScenarioPackage.SCRIPTING__SCRIPTS);
		}
		return scripts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfileToScript> getUserprofiletoscript() {
		if (userprofiletoscript == null) {
			userprofiletoscript = new EObjectWithInverseResolvingEList.ManyInverse<UserProfileToScript>(UserProfileToScript.class, this, OpenmlperfPerformanceScenarioPackage.SCRIPTING__USERPROFILETOSCRIPT, OpenmlperfPerformanceScenarioPackage.USER_PROFILE_TO_SCRIPT__SCRIPTING);
		}
		return userprofiletoscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterObject> getParamenters() {
		if (paramenters == null) {
			paramenters = new EObjectContainmentEList<ParameterObject>(ParameterObject.class, this, OpenmlperfPerformanceScenarioPackage.SCRIPTING__PARAMENTERS);
		}
		return paramenters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityToActivity> getActivityToActivity() {
		if (activityToActivity == null) {
			activityToActivity = new EObjectContainmentEList<ActivityToActivity>(ActivityToActivity.class, this, OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITY_TO_ACTIVITY);
		}
		return activityToActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnsObject> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<ColumnsObject>(ColumnsObject.class, this, OpenmlperfPerformanceScenarioPackage.SCRIPTING__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScenarioPackage.SCRIPTING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__USERPROFILETOSCRIPT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserprofiletoscript()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__INITIAL:
				return basicSetInitial(null, msgs);
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__FINAL:
				return basicSetFinal(null, msgs);
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS:
				return ((InternalEList<?>)getSaveparameters()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__DATATABLES:
				return ((InternalEList<?>)getDatatables()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__THINK_TIME:
				return ((InternalEList<?>)getThinkTime()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__SCRIPTS:
				return ((InternalEList<?>)getScripts()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__USERPROFILETOSCRIPT:
				return ((InternalEList<?>)getUserprofiletoscript()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__PARAMENTERS:
				return ((InternalEList<?>)getParamenters()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITY_TO_ACTIVITY:
				return ((InternalEList<?>)getActivityToActivity()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
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
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__NAME:
				return getName();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__INITIAL:
				return getInitial();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__FINAL:
				return getFinal();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITIES:
				return getActivities();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS:
				return getSaveparameters();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__DATATABLES:
				return getDatatables();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__THINK_TIME:
				return getThinkTime();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__SCRIPTS:
				return getScripts();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__USERPROFILETOSCRIPT:
				return getUserprofiletoscript();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__PARAMENTERS:
				return getParamenters();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITY_TO_ACTIVITY:
				return getActivityToActivity();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__COLUMNS:
				return getColumns();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__DESCRIPTION:
				return getDescription();
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
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__NAME:
				setName((String)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__INITIAL:
				setInitial((Initial)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__FINAL:
				setFinal((Final)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS:
				getSaveparameters().clear();
				getSaveparameters().addAll((Collection<? extends SaveParameters>)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__DATATABLES:
				getDatatables().clear();
				getDatatables().addAll((Collection<? extends DataTable>)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__THINK_TIME:
				getThinkTime().clear();
				getThinkTime().addAll((Collection<? extends ThinkTime>)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__SCRIPTS:
				getScripts().clear();
				getScripts().addAll((Collection<? extends Scripting>)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__USERPROFILETOSCRIPT:
				getUserprofiletoscript().clear();
				getUserprofiletoscript().addAll((Collection<? extends UserProfileToScript>)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__PARAMENTERS:
				getParamenters().clear();
				getParamenters().addAll((Collection<? extends ParameterObject>)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITY_TO_ACTIVITY:
				getActivityToActivity().clear();
				getActivityToActivity().addAll((Collection<? extends ActivityToActivity>)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends ColumnsObject>)newValue);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__DESCRIPTION:
				setDescription((String)newValue);
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
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__INITIAL:
				setInitial((Initial)null);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__FINAL:
				setFinal((Final)null);
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITIES:
				getActivities().clear();
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS:
				getSaveparameters().clear();
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__DATATABLES:
				getDatatables().clear();
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__THINK_TIME:
				getThinkTime().clear();
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__SCRIPTS:
				getScripts().clear();
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__USERPROFILETOSCRIPT:
				getUserprofiletoscript().clear();
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__PARAMENTERS:
				getParamenters().clear();
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITY_TO_ACTIVITY:
				getActivityToActivity().clear();
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__COLUMNS:
				getColumns().clear();
				return;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__INITIAL:
				return initial != null;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__FINAL:
				return final_ != null;
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS:
				return saveparameters != null && !saveparameters.isEmpty();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__DATATABLES:
				return datatables != null && !datatables.isEmpty();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__THINK_TIME:
				return thinkTime != null && !thinkTime.isEmpty();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__SCRIPTS:
				return scripts != null && !scripts.isEmpty();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__USERPROFILETOSCRIPT:
				return userprofiletoscript != null && !userprofiletoscript.isEmpty();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__PARAMENTERS:
				return paramenters != null && !paramenters.isEmpty();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__ACTIVITY_TO_ACTIVITY:
				return activityToActivity != null && !activityToActivity.isEmpty();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__COLUMNS:
				return columns != null && !columns.isEmpty();
			case OpenmlperfPerformanceScenarioPackage.SCRIPTING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ScriptingImpl
