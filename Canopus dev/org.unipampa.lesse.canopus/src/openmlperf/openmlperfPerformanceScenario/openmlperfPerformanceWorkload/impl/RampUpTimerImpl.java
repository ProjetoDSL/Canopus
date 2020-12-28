/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadPackage;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpTimer;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.TimeTypeRamps;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ramp Up Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampUpTimerImpl#getTime <em>Time</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampUpTimerImpl#getTimeType <em>Time Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RampUpTimerImpl extends MinimalEObjectImpl.Container implements RampUpTimer {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeType() <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeType()
	 * @generated
	 * @ordered
	 */
	protected static final TimeTypeRamps TIME_TYPE_EDEFAULT = TimeTypeRamps.SECONDS;

	/**
	 * The cached value of the '{@link #getTimeType() <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeType()
	 * @generated
	 * @ordered
	 */
	protected TimeTypeRamps timeType = TIME_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampUpTimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenmlperfPerformanceWorkloadPackage.Literals.RAMP_UP_TIMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceWorkloadPackage.RAMP_UP_TIMER__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTypeRamps getTimeType() {
		return timeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeType(TimeTypeRamps newTimeType) {
		TimeTypeRamps oldTimeType = timeType;
		timeType = newTimeType == null ? TIME_TYPE_EDEFAULT : newTimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceWorkloadPackage.RAMP_UP_TIMER__TIME_TYPE, oldTimeType, timeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenmlperfPerformanceWorkloadPackage.RAMP_UP_TIMER__TIME:
				return getTime();
			case OpenmlperfPerformanceWorkloadPackage.RAMP_UP_TIMER__TIME_TYPE:
				return getTimeType();
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
			case OpenmlperfPerformanceWorkloadPackage.RAMP_UP_TIMER__TIME:
				setTime((Integer)newValue);
				return;
			case OpenmlperfPerformanceWorkloadPackage.RAMP_UP_TIMER__TIME_TYPE:
				setTimeType((TimeTypeRamps)newValue);
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
			case OpenmlperfPerformanceWorkloadPackage.RAMP_UP_TIMER__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case OpenmlperfPerformanceWorkloadPackage.RAMP_UP_TIMER__TIME_TYPE:
				setTimeType(TIME_TYPE_EDEFAULT);
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
			case OpenmlperfPerformanceWorkloadPackage.RAMP_UP_TIMER__TIME:
				return time != TIME_EDEFAULT;
			case OpenmlperfPerformanceWorkloadPackage.RAMP_UP_TIMER__TIME_TYPE:
				return timeType != TIME_TYPE_EDEFAULT;
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
		result.append(" (time: ");
		result.append(time);
		result.append(", timeType: ");
		result.append(timeType);
		result.append(')');
		return result.toString();
	}

} //RampUpTimerImpl
