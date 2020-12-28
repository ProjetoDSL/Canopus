/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl;

import java.util.Collection;

import openmlperf.openmlperfPerformanceScenario.Scripting;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ActivityToActivity;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ColumnsObject;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Final;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.METHOD;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ParameterObject;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.SaveParameters;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.TYPEACTION;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#getAction <em>Action</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#getLoopInstances <em>Loop Instances</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#getParameterhiddenobject <em>Parameterhiddenobject</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#isTransaction <em>Transaction</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#getThinktime <em>Thinktime</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#getScripting <em>Scripting</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#getActivitytoactivity <em>Activitytoactivity</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#getSaveparameters <em>Saveparameters</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#getDatatable <em>Datatable</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.ActivityImpl#getColumnshiddenobject <em>Columnshiddenobject</em>}</li>
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
	protected EList<ParameterObject> parameterhiddenobject;

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
	 * The cached value of the '{@link #getDatatable() <em>Datatable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatable()
	 * @generated
	 * @ordered
	 */
	protected DataTable datatable;

	/**
	 * The cached value of the '{@link #getColumnshiddenobject() <em>Columnshiddenobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnshiddenobject()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnsObject> columnshiddenobject;

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
		return OpenmlperfPerformanceScriptingPackage.Literals.ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.ACTIVITY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.ACTIVITY__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public METHOD getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(METHOD newMethod) {
		METHOD oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.ACTIVITY__METHOD, oldMethod, method));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.ACTIVITY__TYPE_ACTION, oldTypeAction, typeAction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.ACTIVITY__LOOP_INSTANCES, oldLoopInstances, loopInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterObject> getParameterhiddenobject() {
		if (parameterhiddenobject == null) {
			parameterhiddenobject = new EObjectResolvingEList<ParameterObject>(ParameterObject.class, this, OpenmlperfPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT);
		}
		return parameterhiddenobject;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.ACTIVITY__TRANSACTION, oldTransaction, transaction));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenmlperfPerformanceScriptingPackage.ACTIVITY__FINAL, oldFinal, final_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.ACTIVITY__FINAL, oldFinal, final_));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenmlperfPerformanceScriptingPackage.ACTIVITY__THINKTIME, oldThinktime, thinktime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.ACTIVITY__THINKTIME, oldThinktime, thinktime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scripting getScripting() {
		if (scripting != null && scripting.eIsProxy()) {
			InternalEObject oldScripting = (InternalEObject)scripting;
			scripting = (Scripting)eResolveProxy(oldScripting);
			if (scripting != oldScripting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenmlperfPerformanceScriptingPackage.ACTIVITY__SCRIPTING, oldScripting, scripting));
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
	public void setScripting(Scripting newScripting) {
		Scripting oldScripting = scripting;
		scripting = newScripting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.ACTIVITY__SCRIPTING, oldScripting, scripting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityToActivity> getActivitytoactivity() {
		if (activitytoactivity == null) {
			activitytoactivity = new EObjectWithInverseResolvingEList<ActivityToActivity>(ActivityToActivity.class, this, OpenmlperfPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY, OpenmlperfPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVITY);
		}
		return activitytoactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaveParameters getSaveparameters() {
		if (saveparameters != null && saveparameters.eIsProxy()) {
			InternalEObject oldSaveparameters = (InternalEObject)saveparameters;
			saveparameters = (SaveParameters)eResolveProxy(oldSaveparameters);
			if (saveparameters != oldSaveparameters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenmlperfPerformanceScriptingPackage.ACTIVITY__SAVEPARAMETERS, oldSaveparameters, saveparameters));
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
	public void setSaveparameters(SaveParameters newSaveparameters) {
		SaveParameters oldSaveparameters = saveparameters;
		saveparameters = newSaveparameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.ACTIVITY__SAVEPARAMETERS, oldSaveparameters, saveparameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTable getDatatable() {
		if (datatable != null && datatable.eIsProxy()) {
			InternalEObject oldDatatable = (InternalEObject)datatable;
			datatable = (DataTable)eResolveProxy(oldDatatable);
			if (datatable != oldDatatable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenmlperfPerformanceScriptingPackage.ACTIVITY__DATATABLE, oldDatatable, datatable));
			}
		}
		return datatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTable basicGetDatatable() {
		return datatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatable(DataTable newDatatable, NotificationChain msgs) {
		DataTable oldDatatable = datatable;
		datatable = newDatatable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.ACTIVITY__DATATABLE, oldDatatable, newDatatable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatable(DataTable newDatatable) {
		if (newDatatable != datatable) {
			NotificationChain msgs = null;
			if (datatable != null)
				msgs = ((InternalEObject)datatable).eInverseRemove(this, OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ACTIVITY, DataTable.class, msgs);
			if (newDatatable != null)
				msgs = ((InternalEObject)newDatatable).eInverseAdd(this, OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ACTIVITY, DataTable.class, msgs);
			msgs = basicSetDatatable(newDatatable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.ACTIVITY__DATATABLE, newDatatable, newDatatable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnsObject> getColumnshiddenobject() {
		if (columnshiddenobject == null) {
			columnshiddenobject = new EObjectContainmentEList<ColumnsObject>(ColumnsObject.class, this, OpenmlperfPerformanceScriptingPackage.ACTIVITY__COLUMNSHIDDENOBJECT);
		}
		return columnshiddenobject;
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
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivitytoactivity()).basicAdd(otherEnd, msgs);
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__DATATABLE:
				if (datatable != null)
					msgs = ((InternalEObject)datatable).eInverseRemove(this, OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ACTIVITY, DataTable.class, msgs);
				return basicSetDatatable((DataTable)otherEnd, msgs);
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
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY:
				return ((InternalEList<?>)getActivitytoactivity()).basicRemove(otherEnd, msgs);
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__DATATABLE:
				return basicSetDatatable(null, msgs);
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__COLUMNSHIDDENOBJECT:
				return ((InternalEList<?>)getColumnshiddenobject()).basicRemove(otherEnd, msgs);
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
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__NAME:
				return getName();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__ACTION:
				return getAction();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__METHOD:
				return getMethod();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__TYPE_ACTION:
				return getTypeAction();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__LOOP_INSTANCES:
				return getLoopInstances();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT:
				return getParameterhiddenobject();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__TRANSACTION:
				return isTransaction();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__FINAL:
				if (resolve) return getFinal();
				return basicGetFinal();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__THINKTIME:
				if (resolve) return getThinktime();
				return basicGetThinktime();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__SCRIPTING:
				if (resolve) return getScripting();
				return basicGetScripting();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY:
				return getActivitytoactivity();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__SAVEPARAMETERS:
				if (resolve) return getSaveparameters();
				return basicGetSaveparameters();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__DATATABLE:
				if (resolve) return getDatatable();
				return basicGetDatatable();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__COLUMNSHIDDENOBJECT:
				return getColumnshiddenobject();
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
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__ACTION:
				setAction((String)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__METHOD:
				setMethod((METHOD)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__TYPE_ACTION:
				setTypeAction((TYPEACTION)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__LOOP_INSTANCES:
				setLoopInstances((Integer)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT:
				getParameterhiddenobject().clear();
				getParameterhiddenobject().addAll((Collection<? extends ParameterObject>)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__TRANSACTION:
				setTransaction((Boolean)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__FINAL:
				setFinal((Final)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__THINKTIME:
				setThinktime((ThinkTime)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__SCRIPTING:
				setScripting((Scripting)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY:
				getActivitytoactivity().clear();
				getActivitytoactivity().addAll((Collection<? extends ActivityToActivity>)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__SAVEPARAMETERS:
				setSaveparameters((SaveParameters)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__DATATABLE:
				setDatatable((DataTable)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__COLUMNSHIDDENOBJECT:
				getColumnshiddenobject().clear();
				getColumnshiddenobject().addAll((Collection<? extends ColumnsObject>)newValue);
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
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__TYPE_ACTION:
				setTypeAction(TYPE_ACTION_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__LOOP_INSTANCES:
				setLoopInstances(LOOP_INSTANCES_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT:
				getParameterhiddenobject().clear();
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__TRANSACTION:
				setTransaction(TRANSACTION_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__FINAL:
				setFinal((Final)null);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__THINKTIME:
				setThinktime((ThinkTime)null);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__SCRIPTING:
				setScripting((Scripting)null);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY:
				getActivitytoactivity().clear();
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__SAVEPARAMETERS:
				setSaveparameters((SaveParameters)null);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__DATATABLE:
				setDatatable((DataTable)null);
				return;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__COLUMNSHIDDENOBJECT:
				getColumnshiddenobject().clear();
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
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__METHOD:
				return method != METHOD_EDEFAULT;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__TYPE_ACTION:
				return typeAction != TYPE_ACTION_EDEFAULT;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__LOOP_INSTANCES:
				return loopInstances != LOOP_INSTANCES_EDEFAULT;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__PARAMETERHIDDENOBJECT:
				return parameterhiddenobject != null && !parameterhiddenobject.isEmpty();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__TRANSACTION:
				return transaction != TRANSACTION_EDEFAULT;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__FINAL:
				return final_ != null;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__THINKTIME:
				return thinktime != null;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__SCRIPTING:
				return scripting != null;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY:
				return activitytoactivity != null && !activitytoactivity.isEmpty();
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__SAVEPARAMETERS:
				return saveparameters != null;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__DATATABLE:
				return datatable != null;
			case OpenmlperfPerformanceScriptingPackage.ACTIVITY__COLUMNSHIDDENOBJECT:
				return columnshiddenobject != null && !columnshiddenobject.isEmpty();
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
