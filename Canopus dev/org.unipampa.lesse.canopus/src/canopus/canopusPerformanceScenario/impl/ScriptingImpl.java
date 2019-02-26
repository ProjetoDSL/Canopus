/**
 */
package canopus.canopusPerformanceScenario.impl;

import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;
import canopus.canopusPerformanceScenario.Scripting;
import canopus.canopusPerformanceScenario.UserProfile;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.Final;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.Initial;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.SaveParameters;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime;

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
 * An implementation of the model object '<em><b>Scripting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptingImpl#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptingImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptingImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptingImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptingImpl#getSaveparameters <em>Saveparameters</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptingImpl#getDatatables <em>Datatables</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptingImpl#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptingImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptingImpl#getUserprofile <em>Userprofile</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.ScriptingImpl#getDedicatedTime <em>Dedicated Time</em>}</li>
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
	 * The cached value of the '{@link #getUserprofile() <em>Userprofile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserprofile()
	 * @generated
	 * @ordered
	 */
	protected UserProfile userprofile;

	/**
	 * The default value of the '{@link #getDedicatedTime() <em>Dedicated Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDedicatedTime()
	 * @generated
	 * @ordered
	 */
	protected static final int DEDICATED_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDedicatedTime() <em>Dedicated Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDedicatedTime()
	 * @generated
	 * @ordered
	 */
	protected int dedicatedTime = DEDICATED_TIME_EDEFAULT;

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
		return CanopusPerformanceScenarioPackage.Literals.SCRIPTING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPTING__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPTING__INITIAL, oldInitial, newInitial);
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
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.SCRIPTING__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.SCRIPTING__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPTING__INITIAL, newInitial, newInitial));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPTING__FINAL, oldFinal, newFinal);
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
				msgs = ((InternalEObject)final_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.SCRIPTING__FINAL, null, msgs);
			if (newFinal != null)
				msgs = ((InternalEObject)newFinal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScenarioPackage.SCRIPTING__FINAL, null, msgs);
			msgs = basicSetFinal(newFinal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPTING__FINAL, newFinal, newFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, CanopusPerformanceScenarioPackage.SCRIPTING__ACTIVITIES);
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
			saveparameters = new EObjectContainmentEList<SaveParameters>(SaveParameters.class, this, CanopusPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS);
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
			datatables = new EObjectContainmentEList<DataTable>(DataTable.class, this, CanopusPerformanceScenarioPackage.SCRIPTING__DATATABLES);
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
			thinkTime = new EObjectContainmentEList<ThinkTime>(ThinkTime.class, this, CanopusPerformanceScenarioPackage.SCRIPTING__THINK_TIME);
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
			scripts = new EObjectContainmentEList<Scripting>(Scripting.class, this, CanopusPerformanceScenarioPackage.SCRIPTING__SCRIPTS);
		}
		return scripts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfile getUserprofile() {
		if (userprofile != null && userprofile.eIsProxy()) {
			InternalEObject oldUserprofile = (InternalEObject)userprofile;
			userprofile = (UserProfile)eResolveProxy(oldUserprofile);
			if (userprofile != oldUserprofile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScenarioPackage.SCRIPTING__USERPROFILE, oldUserprofile, userprofile));
			}
		}
		return userprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfile basicGetUserprofile() {
		return userprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserprofile(UserProfile newUserprofile, NotificationChain msgs) {
		UserProfile oldUserprofile = userprofile;
		userprofile = newUserprofile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPTING__USERPROFILE, oldUserprofile, newUserprofile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserprofile(UserProfile newUserprofile) {
		if (newUserprofile != userprofile) {
			NotificationChain msgs = null;
			if (userprofile != null)
				msgs = ((InternalEObject)userprofile).eInverseRemove(this, CanopusPerformanceScenarioPackage.USER_PROFILE__SCRIPTING, UserProfile.class, msgs);
			if (newUserprofile != null)
				msgs = ((InternalEObject)newUserprofile).eInverseAdd(this, CanopusPerformanceScenarioPackage.USER_PROFILE__SCRIPTING, UserProfile.class, msgs);
			msgs = basicSetUserprofile(newUserprofile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPTING__USERPROFILE, newUserprofile, newUserprofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDedicatedTime() {
		return dedicatedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDedicatedTime(int newDedicatedTime) {
		int oldDedicatedTime = dedicatedTime;
		dedicatedTime = newDedicatedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.SCRIPTING__DEDICATED_TIME, oldDedicatedTime, dedicatedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScenarioPackage.SCRIPTING__USERPROFILE:
				if (userprofile != null)
					msgs = ((InternalEObject)userprofile).eInverseRemove(this, CanopusPerformanceScenarioPackage.USER_PROFILE__SCRIPTING, UserProfile.class, msgs);
				return basicSetUserprofile((UserProfile)otherEnd, msgs);
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
			case CanopusPerformanceScenarioPackage.SCRIPTING__INITIAL:
				return basicSetInitial(null, msgs);
			case CanopusPerformanceScenarioPackage.SCRIPTING__FINAL:
				return basicSetFinal(null, msgs);
			case CanopusPerformanceScenarioPackage.SCRIPTING__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case CanopusPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS:
				return ((InternalEList<?>)getSaveparameters()).basicRemove(otherEnd, msgs);
			case CanopusPerformanceScenarioPackage.SCRIPTING__DATATABLES:
				return ((InternalEList<?>)getDatatables()).basicRemove(otherEnd, msgs);
			case CanopusPerformanceScenarioPackage.SCRIPTING__THINK_TIME:
				return ((InternalEList<?>)getThinkTime()).basicRemove(otherEnd, msgs);
			case CanopusPerformanceScenarioPackage.SCRIPTING__SCRIPTS:
				return ((InternalEList<?>)getScripts()).basicRemove(otherEnd, msgs);
			case CanopusPerformanceScenarioPackage.SCRIPTING__USERPROFILE:
				return basicSetUserprofile(null, msgs);
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
			case CanopusPerformanceScenarioPackage.SCRIPTING__NAME:
				return getName();
			case CanopusPerformanceScenarioPackage.SCRIPTING__INITIAL:
				return getInitial();
			case CanopusPerformanceScenarioPackage.SCRIPTING__FINAL:
				return getFinal();
			case CanopusPerformanceScenarioPackage.SCRIPTING__ACTIVITIES:
				return getActivities();
			case CanopusPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS:
				return getSaveparameters();
			case CanopusPerformanceScenarioPackage.SCRIPTING__DATATABLES:
				return getDatatables();
			case CanopusPerformanceScenarioPackage.SCRIPTING__THINK_TIME:
				return getThinkTime();
			case CanopusPerformanceScenarioPackage.SCRIPTING__SCRIPTS:
				return getScripts();
			case CanopusPerformanceScenarioPackage.SCRIPTING__USERPROFILE:
				if (resolve) return getUserprofile();
				return basicGetUserprofile();
			case CanopusPerformanceScenarioPackage.SCRIPTING__DEDICATED_TIME:
				return getDedicatedTime();
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
			case CanopusPerformanceScenarioPackage.SCRIPTING__NAME:
				setName((String)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__INITIAL:
				setInitial((Initial)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__FINAL:
				setFinal((Final)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS:
				getSaveparameters().clear();
				getSaveparameters().addAll((Collection<? extends SaveParameters>)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__DATATABLES:
				getDatatables().clear();
				getDatatables().addAll((Collection<? extends DataTable>)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__THINK_TIME:
				getThinkTime().clear();
				getThinkTime().addAll((Collection<? extends ThinkTime>)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__SCRIPTS:
				getScripts().clear();
				getScripts().addAll((Collection<? extends Scripting>)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__USERPROFILE:
				setUserprofile((UserProfile)newValue);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__DEDICATED_TIME:
				setDedicatedTime((Integer)newValue);
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
			case CanopusPerformanceScenarioPackage.SCRIPTING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__INITIAL:
				setInitial((Initial)null);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__FINAL:
				setFinal((Final)null);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__ACTIVITIES:
				getActivities().clear();
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS:
				getSaveparameters().clear();
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__DATATABLES:
				getDatatables().clear();
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__THINK_TIME:
				getThinkTime().clear();
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__SCRIPTS:
				getScripts().clear();
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__USERPROFILE:
				setUserprofile((UserProfile)null);
				return;
			case CanopusPerformanceScenarioPackage.SCRIPTING__DEDICATED_TIME:
				setDedicatedTime(DEDICATED_TIME_EDEFAULT);
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
			case CanopusPerformanceScenarioPackage.SCRIPTING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CanopusPerformanceScenarioPackage.SCRIPTING__INITIAL:
				return initial != null;
			case CanopusPerformanceScenarioPackage.SCRIPTING__FINAL:
				return final_ != null;
			case CanopusPerformanceScenarioPackage.SCRIPTING__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case CanopusPerformanceScenarioPackage.SCRIPTING__SAVEPARAMETERS:
				return saveparameters != null && !saveparameters.isEmpty();
			case CanopusPerformanceScenarioPackage.SCRIPTING__DATATABLES:
				return datatables != null && !datatables.isEmpty();
			case CanopusPerformanceScenarioPackage.SCRIPTING__THINK_TIME:
				return thinkTime != null && !thinkTime.isEmpty();
			case CanopusPerformanceScenarioPackage.SCRIPTING__SCRIPTS:
				return scripts != null && !scripts.isEmpty();
			case CanopusPerformanceScenarioPackage.SCRIPTING__USERPROFILE:
				return userprofile != null;
			case CanopusPerformanceScenarioPackage.SCRIPTING__DEDICATED_TIME:
				return dedicatedTime != DEDICATED_TIME_EDEFAULT;
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
		result.append(", dedicatedTime: ");
		result.append(dedicatedTime);
		result.append(')');
		return result.toString();
	}

} //ScriptingImpl
