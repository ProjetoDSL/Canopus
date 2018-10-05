/**
 */
package canopus.canopusPerformanceScripting.impl;

import canopus.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;
import canopus.canopusPerformanceScripting.ThinkTime;
import canopus.canopusPerformanceScripting.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.TransitionImpl#getPorcentage <em>Porcentage</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.TransitionImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScripting.impl.TransitionImpl#getThinktime <em>Thinktime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The default value of the '{@link #getPorcentage() <em>Porcentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorcentage()
	 * @generated
	 * @ordered
	 */
	protected static final int PORCENTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPorcentage() <em>Porcentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorcentage()
	 * @generated
	 * @ordered
	 */
	protected int porcentage = PORCENTAGE_EDEFAULT;

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
	 * The cached value of the '{@link #getThinktime() <em>Thinktime</em>}' reference list.
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
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScriptingPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPorcentage() {
		return porcentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorcentage(int newPorcentage) {
		int oldPorcentage = porcentage;
		porcentage = newPorcentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.TRANSITION__PORCENTAGE, oldPorcentage, porcentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectResolvingEList<Activity>(Activity.class, this, CanopusPerformanceScriptingPackage.TRANSITION__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThinkTime> getThinktime() {
		if (thinktime == null) {
			thinktime = new EObjectResolvingEList<ThinkTime>(ThinkTime.class, this, CanopusPerformanceScriptingPackage.TRANSITION__THINKTIME);
		}
		return thinktime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.TRANSITION__PORCENTAGE:
				return getPorcentage();
			case CanopusPerformanceScriptingPackage.TRANSITION__ACTIVITY:
				return getActivity();
			case CanopusPerformanceScriptingPackage.TRANSITION__THINKTIME:
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
			case CanopusPerformanceScriptingPackage.TRANSITION__PORCENTAGE:
				setPorcentage((Integer)newValue);
				return;
			case CanopusPerformanceScriptingPackage.TRANSITION__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case CanopusPerformanceScriptingPackage.TRANSITION__THINKTIME:
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
			case CanopusPerformanceScriptingPackage.TRANSITION__PORCENTAGE:
				setPorcentage(PORCENTAGE_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.TRANSITION__ACTIVITY:
				getActivity().clear();
				return;
			case CanopusPerformanceScriptingPackage.TRANSITION__THINKTIME:
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
			case CanopusPerformanceScriptingPackage.TRANSITION__PORCENTAGE:
				return porcentage != PORCENTAGE_EDEFAULT;
			case CanopusPerformanceScriptingPackage.TRANSITION__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case CanopusPerformanceScriptingPackage.TRANSITION__THINKTIME:
				return thinktime != null && !thinktime.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (porcentage: ");
		result.append(porcentage);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
