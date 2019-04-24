/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl;

import canopus.canopusPerformanceScenario.Scripting;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.Final;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.METHOD;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.SaveParameters;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.TYPEACTION;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ThinkTime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl#getAction <em>Action</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl#getLoopInstances <em>Loop Instances</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl#getParameterhiddenobject <em>Parameterhiddenobject</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl#isTransaction <em>Transaction</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl#getThinktime <em>Thinktime</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl#getScripting <em>Scripting</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl#getActivitytoactivity <em>Activitytoactivity</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityImpl#getSaveparameters <em>Saveparameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
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
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final METHOD METHOD_EDEFAULT = METHOD.GET;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected METHOD method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeAction() <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAction()
	 * @generated
	 * @ordered
	 */
	protected static final TYPEACTION TYPE_ACTION_EDEFAULT = TYPEACTION.BODY;

	/**
	 * The cached value of the '{@link #getTypeAction() <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAction()
	 * @generated
	 * @ordered
	 */
	protected TYPEACTION typeAction = TYPE_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoopInstances() <em>Loop Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int LOOP_INSTANCES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLoopInstances() <em>Loop Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopInstances()
	 * @generated
	 * @ordered
	 */
	protected int loopInstances = LOOP_INSTANCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterhiddenobject() <em>Parameterhiddenobject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterhiddenobject()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterHiddenObject> parameterhiddenobject;

	/**
	 * The default value of the '{@link #isTransaction() <em>Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransaction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransaction() <em>Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransaction()
	 * @generated
	 * @ordered
	 */
	protected boolean transaction = TRANSACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected Final final_;

	/**
	 * The cached value of the '{@link #getThinktime() <em>Thinktime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinktime()
	 * @generated
	 * @ordered
	 */
	protected ThinkTime thinktime;

	/**
	 * The cached value of the '{@link #getScripting() <em>Scripting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScripting()
	 * @generated
	 * @ordered
	 */
	protected Scripting scripting;

	/**
	 * The cached value of the '{@link #getActivitytoactivity() <em>Activitytoactivity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitytoactivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityToActivity> activitytoactivity;

	/**
	 * The cached value of the '{@link #getSaveparameters() <em>Saveparameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveparameters()
	 * @generated
	 * @ordered
	 */
	protected SaveParameters saveparameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScriptingPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public METHOD getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(METHOD newMethod) {
		METHOD oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TYPEACTION getTypeAction() {
		return typeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeAction(TYPEACTION newTypeAction) {
		TYPEACTION oldTypeAction = typeAction;
		typeAction = newTypeAction == null ? TYPE_ACTION_EDEFAULT : newTypeAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__TYPE_ACTION, oldTypeAction, typeAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLoopInstances() {
		return loopInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopInstances(int newLoopInstances) {
		int oldLoopInstances = loopInstances;
		loopInstances = newLoopInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__LOOP_INSTANCES, oldLoopInstances, loopInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterHiddenObject> getParameterhiddenobject() {
		if (parameterhiddenobject == null) {
			parameterhiddenobject = new EObjectResolvingEList<ParameterHiddenObject>(ParameterHiddenObject.class, this, CanopusPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT);
		}
		return parameterhiddenobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTransaction() {
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransaction(boolean newTransaction) {
		boolean oldTransaction = transaction;
		transaction = newTransaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__TRANSACTION, oldTransaction, transaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Final getFinal() {
		if (final_ != null && final_.eIsProxy()) {
			InternalEObject oldFinal = (InternalEObject)final_;
			final_ = (Final)eResolveProxy(oldFinal);
			if (final_ != oldFinal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScriptingPackage.ACTIVITY__FINAL, oldFinal, final_));
			}
		}
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Final basicGetFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinal(Final newFinal) {
		Final oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThinkTime getThinktime() {
		if (thinktime != null && thinktime.eIsProxy()) {
			InternalEObject oldThinktime = (InternalEObject)thinktime;
			thinktime = (ThinkTime)eResolveProxy(oldThinktime);
			if (thinktime != oldThinktime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScriptingPackage.ACTIVITY__THINKTIME, oldThinktime, thinktime));
			}
		}
		return thinktime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThinkTime basicGetThinktime() {
		return thinktime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThinktime(ThinkTime newThinktime) {
		ThinkTime oldThinktime = thinktime;
		thinktime = newThinktime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__THINKTIME, oldThinktime, thinktime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scripting getScripting() {
		if (scripting != null && scripting.eIsProxy()) {
			InternalEObject oldScripting = (InternalEObject)scripting;
			scripting = (Scripting)eResolveProxy(oldScripting);
			if (scripting != oldScripting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScriptingPackage.ACTIVITY__SCRIPTING, oldScripting, scripting));
			}
		}
		return scripting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scripting basicGetScripting() {
		return scripting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScripting(Scripting newScripting) {
		Scripting oldScripting = scripting;
		scripting = newScripting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__SCRIPTING, oldScripting, scripting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityToActivity> getActivitytoactivity() {
		if (activitytoactivity == null) {
			activitytoactivity = new EObjectWithInverseResolvingEList<ActivityToActivity>(ActivityToActivity.class, this, CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY, CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVITY);
		}
		return activitytoactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SaveParameters getSaveparameters() {
		if (saveparameters != null && saveparameters.eIsProxy()) {
			InternalEObject oldSaveparameters = (InternalEObject)saveparameters;
			saveparameters = (SaveParameters)eResolveProxy(oldSaveparameters);
			if (saveparameters != oldSaveparameters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScriptingPackage.ACTIVITY__SAVEPARAMETERS, oldSaveparameters, saveparameters));
			}
		}
		return saveparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaveParameters basicGetSaveparameters() {
		return saveparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaveparameters(SaveParameters newSaveparameters) {
		SaveParameters oldSaveparameters = saveparameters;
		saveparameters = newSaveparameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__SAVEPARAMETERS, oldSaveparameters, saveparameters));
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
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivitytoactivity()).basicAdd(otherEnd, msgs);
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
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY:
				return ((InternalEList<?>)getActivitytoactivity()).basicRemove(otherEnd, msgs);
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
			case CanopusPerformanceScriptingPackage.ACTIVITY__NAME:
				return getName();
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTION:
				return getAction();
			case CanopusPerformanceScriptingPackage.ACTIVITY__METHOD:
				return getMethod();
			case CanopusPerformanceScriptingPackage.ACTIVITY__TYPE_ACTION:
				return getTypeAction();
			case CanopusPerformanceScriptingPackage.ACTIVITY__LOOP_INSTANCES:
				return getLoopInstances();
			case CanopusPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT:
				return getParameterhiddenobject();
			case CanopusPerformanceScriptingPackage.ACTIVITY__TRANSACTION:
				return isTransaction();
			case CanopusPerformanceScriptingPackage.ACTIVITY__FINAL:
				if (resolve) return getFinal();
				return basicGetFinal();
			case CanopusPerformanceScriptingPackage.ACTIVITY__THINKTIME:
				if (resolve) return getThinktime();
				return basicGetThinktime();
			case CanopusPerformanceScriptingPackage.ACTIVITY__SCRIPTING:
				if (resolve) return getScripting();
				return basicGetScripting();
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY:
				return getActivitytoactivity();
			case CanopusPerformanceScriptingPackage.ACTIVITY__SAVEPARAMETERS:
				if (resolve) return getSaveparameters();
				return basicGetSaveparameters();
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
			case CanopusPerformanceScriptingPackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTION:
				setAction((String)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__METHOD:
				setMethod((METHOD)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__TYPE_ACTION:
				setTypeAction((TYPEACTION)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__LOOP_INSTANCES:
				setLoopInstances((Integer)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT:
				getParameterhiddenobject().clear();
				getParameterhiddenobject().addAll((Collection<? extends ParameterHiddenObject>)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__TRANSACTION:
				setTransaction((Boolean)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__FINAL:
				setFinal((Final)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__THINKTIME:
				setThinktime((ThinkTime)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__SCRIPTING:
				setScripting((Scripting)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY:
				getActivitytoactivity().clear();
				getActivitytoactivity().addAll((Collection<? extends ActivityToActivity>)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__SAVEPARAMETERS:
				setSaveparameters((SaveParameters)newValue);
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
			case CanopusPerformanceScriptingPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__TYPE_ACTION:
				setTypeAction(TYPE_ACTION_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__LOOP_INSTANCES:
				setLoopInstances(LOOP_INSTANCES_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT:
				getParameterhiddenobject().clear();
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__TRANSACTION:
				setTransaction(TRANSACTION_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__FINAL:
				setFinal((Final)null);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__THINKTIME:
				setThinktime((ThinkTime)null);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__SCRIPTING:
				setScripting((Scripting)null);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY:
				getActivitytoactivity().clear();
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__SAVEPARAMETERS:
				setSaveparameters((SaveParameters)null);
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
			case CanopusPerformanceScriptingPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case CanopusPerformanceScriptingPackage.ACTIVITY__METHOD:
				return method != METHOD_EDEFAULT;
			case CanopusPerformanceScriptingPackage.ACTIVITY__TYPE_ACTION:
				return typeAction != TYPE_ACTION_EDEFAULT;
			case CanopusPerformanceScriptingPackage.ACTIVITY__LOOP_INSTANCES:
				return loopInstances != LOOP_INSTANCES_EDEFAULT;
			case CanopusPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT:
				return parameterhiddenobject != null && !parameterhiddenobject.isEmpty();
			case CanopusPerformanceScriptingPackage.ACTIVITY__TRANSACTION:
				return transaction != TRANSACTION_EDEFAULT;
			case CanopusPerformanceScriptingPackage.ACTIVITY__FINAL:
				return final_ != null;
			case CanopusPerformanceScriptingPackage.ACTIVITY__THINKTIME:
				return thinktime != null;
			case CanopusPerformanceScriptingPackage.ACTIVITY__SCRIPTING:
				return scripting != null;
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY:
				return activitytoactivity != null && !activitytoactivity.isEmpty();
			case CanopusPerformanceScriptingPackage.ACTIVITY__SAVEPARAMETERS:
				return saveparameters != null;
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
		result.append(", action: ");
		result.append(action);
		result.append(", method: ");
		result.append(method);
		result.append(", typeAction: ");
		result.append(typeAction);
		result.append(", loopInstances: ");
		result.append(loopInstances);
		result.append(", transaction: ");
		result.append(transaction);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
