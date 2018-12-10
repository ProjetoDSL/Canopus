/**
 */
package canopus.canopusPerformanceScripting.impl;

import canopus.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;
import canopus.canopusPerformanceScripting.Final;
import canopus.canopusPerformanceScripting.ParameterHiddenObject;
import canopus.canopusPerformanceScripting.TYPEACTION;
import canopus.canopusPerformanceScripting.ThinkTime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ActivityImpl#getAction <em>Action</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ActivityImpl#isMethod <em>Method</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ActivityImpl#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ActivityImpl#getLoopInstances <em>Loop Instances</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ActivityImpl#getParameterhiddenobject <em>Parameterhiddenobject</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ActivityImpl#isTransaction <em>Transaction</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ActivityImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ActivityImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.ActivityImpl#getThinktime <em>Thinktime</em>}</li>
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
	 * The default value of the '{@link #isMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMethod()
	 * @generated
	 * @ordered
	 */
	protected static final boolean METHOD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMethod()
	 * @generated
	 * @ordered
	 */
	protected boolean method = METHOD_EDEFAULT;

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
	protected static final int LOOP_INSTANCES_EDEFAULT = 0;

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
	 * The cached value of the '{@link #getParameterhiddenobject() <em>Parameterhiddenobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterhiddenobject()
	 * @generated
	 * @ordered
	 */
	protected ParameterHiddenObject parameterhiddenobject;

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
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

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
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(boolean newMethod) {
		boolean oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEACTION getTypeAction() {
		return typeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public int getLoopInstances() {
		return loopInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public ParameterHiddenObject getParameterhiddenobject() {
		return parameterhiddenobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterhiddenobject(ParameterHiddenObject newParameterhiddenobject, NotificationChain msgs) {
		ParameterHiddenObject oldParameterhiddenobject = parameterhiddenobject;
		parameterhiddenobject = newParameterhiddenobject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT, oldParameterhiddenobject, newParameterhiddenobject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterhiddenobject(ParameterHiddenObject newParameterhiddenobject) {
		if (newParameterhiddenobject != parameterhiddenobject) {
			NotificationChain msgs = null;
			if (parameterhiddenobject != null)
				msgs = ((InternalEObject)parameterhiddenobject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT, null, msgs);
			if (newParameterhiddenobject != null)
				msgs = ((InternalEObject)newParameterhiddenobject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT, null, msgs);
			msgs = basicSetParameterhiddenobject(newParameterhiddenobject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT, newParameterhiddenobject, newParameterhiddenobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransaction() {
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectResolvingEList<Activity>(Activity.class, this, CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT:
				return basicSetParameterhiddenobject(null, msgs);
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
				return isMethod();
			case CanopusPerformanceScriptingPackage.ACTIVITY__TYPE_ACTION:
				return getTypeAction();
			case CanopusPerformanceScriptingPackage.ACTIVITY__LOOP_INSTANCES:
				return getLoopInstances();
			case CanopusPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT:
				return getParameterhiddenobject();
			case CanopusPerformanceScriptingPackage.ACTIVITY__TRANSACTION:
				return isTransaction();
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITY:
				return getActivity();
			case CanopusPerformanceScriptingPackage.ACTIVITY__FINAL:
				if (resolve) return getFinal();
				return basicGetFinal();
			case CanopusPerformanceScriptingPackage.ACTIVITY__THINKTIME:
				if (resolve) return getThinktime();
				return basicGetThinktime();
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
				setMethod((Boolean)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__TYPE_ACTION:
				setTypeAction((TYPEACTION)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__LOOP_INSTANCES:
				setLoopInstances((Integer)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT:
				setParameterhiddenobject((ParameterHiddenObject)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__TRANSACTION:
				setTransaction((Boolean)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__FINAL:
				setFinal((Final)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__THINKTIME:
				setThinktime((ThinkTime)newValue);
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
				setParameterhiddenobject((ParameterHiddenObject)null);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__TRANSACTION:
				setTransaction(TRANSACTION_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITY:
				getActivity().clear();
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__FINAL:
				setFinal((Final)null);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY__THINKTIME:
				setThinktime((ThinkTime)null);
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
				return parameterhiddenobject != null;
			case CanopusPerformanceScriptingPackage.ACTIVITY__TRANSACTION:
				return transaction != TRANSACTION_EDEFAULT;
			case CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case CanopusPerformanceScriptingPackage.ACTIVITY__FINAL:
				return final_ != null;
			case CanopusPerformanceScriptingPackage.ACTIVITY__THINKTIME:
				return thinktime != null;
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
