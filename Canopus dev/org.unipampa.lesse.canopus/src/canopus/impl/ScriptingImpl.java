/**
 */
package canopus.impl;

import canopus.CanopusPackage;
import canopus.Scripting;

import canopus.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScripting.DataTable;
import canopus.canopusPerformanceScripting.Final;
import canopus.canopusPerformanceScripting.Initial;
import canopus.canopusPerformanceScripting.SaveParameters;
import canopus.canopusPerformanceScripting.ThinkTime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link canopus.impl.ScriptingImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link canopus.impl.ScriptingImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link canopus.impl.ScriptingImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link canopus.impl.ScriptingImpl#getSaveparameters <em>Saveparameters</em>}</li>
 *   <li>{@link canopus.impl.ScriptingImpl#getDatatables <em>Datatables</em>}</li>
 *   <li>{@link canopus.impl.ScriptingImpl#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link canopus.impl.ScriptingImpl#getScripts <em>Scripts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptingImpl extends DiagramImpl implements Scripting {
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
		return CanopusPackage.Literals.SCRIPTING;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPackage.SCRIPTING__INITIAL, oldInitial, newInitial);
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
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPackage.SCRIPTING__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPackage.SCRIPTING__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPackage.SCRIPTING__INITIAL, newInitial, newInitial));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPackage.SCRIPTING__FINAL, oldFinal, newFinal);
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
				msgs = ((InternalEObject)final_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPackage.SCRIPTING__FINAL, null, msgs);
			if (newFinal != null)
				msgs = ((InternalEObject)newFinal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPackage.SCRIPTING__FINAL, null, msgs);
			msgs = basicSetFinal(newFinal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPackage.SCRIPTING__FINAL, newFinal, newFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, CanopusPackage.SCRIPTING__ACTIVITIES);
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
			saveparameters = new EObjectContainmentEList<SaveParameters>(SaveParameters.class, this, CanopusPackage.SCRIPTING__SAVEPARAMETERS);
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
			datatables = new EObjectContainmentEList<DataTable>(DataTable.class, this, CanopusPackage.SCRIPTING__DATATABLES);
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
			thinkTime = new EObjectContainmentEList<ThinkTime>(ThinkTime.class, this, CanopusPackage.SCRIPTING__THINK_TIME);
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
			scripts = new EObjectContainmentEList<Scripting>(Scripting.class, this, CanopusPackage.SCRIPTING__SCRIPTS);
		}
		return scripts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPackage.SCRIPTING__INITIAL:
				return basicSetInitial(null, msgs);
			case CanopusPackage.SCRIPTING__FINAL:
				return basicSetFinal(null, msgs);
			case CanopusPackage.SCRIPTING__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case CanopusPackage.SCRIPTING__SAVEPARAMETERS:
				return ((InternalEList<?>)getSaveparameters()).basicRemove(otherEnd, msgs);
			case CanopusPackage.SCRIPTING__DATATABLES:
				return ((InternalEList<?>)getDatatables()).basicRemove(otherEnd, msgs);
			case CanopusPackage.SCRIPTING__THINK_TIME:
				return ((InternalEList<?>)getThinkTime()).basicRemove(otherEnd, msgs);
			case CanopusPackage.SCRIPTING__SCRIPTS:
				return ((InternalEList<?>)getScripts()).basicRemove(otherEnd, msgs);
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
			case CanopusPackage.SCRIPTING__INITIAL:
				return getInitial();
			case CanopusPackage.SCRIPTING__FINAL:
				return getFinal();
			case CanopusPackage.SCRIPTING__ACTIVITIES:
				return getActivities();
			case CanopusPackage.SCRIPTING__SAVEPARAMETERS:
				return getSaveparameters();
			case CanopusPackage.SCRIPTING__DATATABLES:
				return getDatatables();
			case CanopusPackage.SCRIPTING__THINK_TIME:
				return getThinkTime();
			case CanopusPackage.SCRIPTING__SCRIPTS:
				return getScripts();
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
			case CanopusPackage.SCRIPTING__INITIAL:
				setInitial((Initial)newValue);
				return;
			case CanopusPackage.SCRIPTING__FINAL:
				setFinal((Final)newValue);
				return;
			case CanopusPackage.SCRIPTING__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case CanopusPackage.SCRIPTING__SAVEPARAMETERS:
				getSaveparameters().clear();
				getSaveparameters().addAll((Collection<? extends SaveParameters>)newValue);
				return;
			case CanopusPackage.SCRIPTING__DATATABLES:
				getDatatables().clear();
				getDatatables().addAll((Collection<? extends DataTable>)newValue);
				return;
			case CanopusPackage.SCRIPTING__THINK_TIME:
				getThinkTime().clear();
				getThinkTime().addAll((Collection<? extends ThinkTime>)newValue);
				return;
			case CanopusPackage.SCRIPTING__SCRIPTS:
				getScripts().clear();
				getScripts().addAll((Collection<? extends Scripting>)newValue);
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
			case CanopusPackage.SCRIPTING__INITIAL:
				setInitial((Initial)null);
				return;
			case CanopusPackage.SCRIPTING__FINAL:
				setFinal((Final)null);
				return;
			case CanopusPackage.SCRIPTING__ACTIVITIES:
				getActivities().clear();
				return;
			case CanopusPackage.SCRIPTING__SAVEPARAMETERS:
				getSaveparameters().clear();
				return;
			case CanopusPackage.SCRIPTING__DATATABLES:
				getDatatables().clear();
				return;
			case CanopusPackage.SCRIPTING__THINK_TIME:
				getThinkTime().clear();
				return;
			case CanopusPackage.SCRIPTING__SCRIPTS:
				getScripts().clear();
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
			case CanopusPackage.SCRIPTING__INITIAL:
				return initial != null;
			case CanopusPackage.SCRIPTING__FINAL:
				return final_ != null;
			case CanopusPackage.SCRIPTING__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case CanopusPackage.SCRIPTING__SAVEPARAMETERS:
				return saveparameters != null && !saveparameters.isEmpty();
			case CanopusPackage.SCRIPTING__DATATABLES:
				return datatables != null && !datatables.isEmpty();
			case CanopusPackage.SCRIPTING__THINK_TIME:
				return thinkTime != null && !thinkTime.isEmpty();
			case CanopusPackage.SCRIPTING__SCRIPTS:
				return scripts != null && !scripts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScriptingImpl
