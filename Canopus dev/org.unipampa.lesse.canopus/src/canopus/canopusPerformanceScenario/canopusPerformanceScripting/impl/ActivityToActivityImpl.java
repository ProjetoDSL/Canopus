/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ActivityToActivity;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity To Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityToActivityImpl#getTimePercentage <em>Time Percentage</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityToActivityImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.ActivityToActivityImpl#getActivies <em>Activies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityToActivityImpl extends MinimalEObjectImpl.Container implements ActivityToActivity {
	/**
	 * The default value of the '{@link #getTimePercentage() <em>Time Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePercentage()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_PERCENTAGE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTimePercentage() <em>Time Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePercentage()
	 * @generated
	 * @ordered
	 */
	protected int timePercentage = TIME_PERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * The cached value of the '{@link #getActivies() <em>Activies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivies()
	 * @generated
	 * @ordered
	 */
	protected Activity activies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityToActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScriptingPackage.Literals.ACTIVITY_TO_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTimePercentage() {
		return timePercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimePercentage(int newTimePercentage) {
		int oldTimePercentage = timePercentage;
		timePercentage = newTimePercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__TIME_PERCENTAGE, oldTimePercentage, timePercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (Activity)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVITY, oldActivity, newActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivity(Activity newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject)activity).eInverseRemove(this, CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY, Activity.class, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY, Activity.class, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getActivies() {
		if (activies != null && activies.eIsProxy()) {
			InternalEObject oldActivies = (InternalEObject)activies;
			activies = (Activity)eResolveProxy(oldActivies);
			if (activies != oldActivies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVIES, oldActivies, activies));
			}
		}
		return activies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivies() {
		return activies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivies(Activity newActivies) {
		Activity oldActivies = activies;
		activies = newActivies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVIES, oldActivies, activies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVITY:
				if (activity != null)
					msgs = ((InternalEObject)activity).eInverseRemove(this, CanopusPerformanceScriptingPackage.ACTIVITY__ACTIVITYTOACTIVITY, Activity.class, msgs);
				return basicSetActivity((Activity)otherEnd, msgs);
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
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVITY:
				return basicSetActivity(null, msgs);
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
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__TIME_PERCENTAGE:
				return getTimePercentage();
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVIES:
				if (resolve) return getActivies();
				return basicGetActivies();
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
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__TIME_PERCENTAGE:
				setTimePercentage((Integer)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVIES:
				setActivies((Activity)newValue);
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
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__TIME_PERCENTAGE:
				setTimePercentage(TIME_PERCENTAGE_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVITY:
				setActivity((Activity)null);
				return;
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVIES:
				setActivies((Activity)null);
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
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__TIME_PERCENTAGE:
				return timePercentage != TIME_PERCENTAGE_EDEFAULT;
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVITY:
				return activity != null;
			case CanopusPerformanceScriptingPackage.ACTIVITY_TO_ACTIVITY__ACTIVIES:
				return activies != null;
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
		result.append(" (timePercentage: ");
		result.append(timePercentage);
		result.append(')');
		return result.toString();
	}

} //ActivityToActivityImpl
