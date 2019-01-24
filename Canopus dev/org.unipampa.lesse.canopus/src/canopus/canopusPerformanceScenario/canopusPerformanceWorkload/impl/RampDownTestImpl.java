/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTimer;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ramp Down Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTestImpl#getRampdowntimer <em>Rampdowntimer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampDownTestImpl#getRampdownusers <em>Rampdownusers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RampDownTestImpl extends MinimalEObjectImpl.Container implements RampDownTest {
	/**
	 * The cached value of the '{@link #getRampdowntimer() <em>Rampdowntimer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampdowntimer()
	 * @generated
	 * @ordered
	 */
	protected RampDownTimer rampdowntimer;

	/**
	 * The cached value of the '{@link #getRampdownusers() <em>Rampdownusers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampdownusers()
	 * @generated
	 * @ordered
	 */
	protected RampDownUsers rampdownusers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampDownTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceWorkloadPackage.Literals.RAMP_DOWN_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampDownTimer getRampdowntimer() {
		if (rampdowntimer != null && rampdowntimer.eIsProxy()) {
			InternalEObject oldRampdowntimer = (InternalEObject)rampdowntimer;
			rampdowntimer = (RampDownTimer)eResolveProxy(oldRampdowntimer);
			if (rampdowntimer != oldRampdowntimer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceWorkloadPackage.RAMP_DOWN_TEST__RAMPDOWNTIMER, oldRampdowntimer, rampdowntimer));
			}
		}
		return rampdowntimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampDownTimer basicGetRampdowntimer() {
		return rampdowntimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampdowntimer(RampDownTimer newRampdowntimer) {
		RampDownTimer oldRampdowntimer = rampdowntimer;
		rampdowntimer = newRampdowntimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.RAMP_DOWN_TEST__RAMPDOWNTIMER, oldRampdowntimer, rampdowntimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampDownUsers getRampdownusers() {
		if (rampdownusers != null && rampdownusers.eIsProxy()) {
			InternalEObject oldRampdownusers = (InternalEObject)rampdownusers;
			rampdownusers = (RampDownUsers)eResolveProxy(oldRampdownusers);
			if (rampdownusers != oldRampdownusers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceWorkloadPackage.RAMP_DOWN_TEST__RAMPDOWNUSERS, oldRampdownusers, rampdownusers));
			}
		}
		return rampdownusers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampDownUsers basicGetRampdownusers() {
		return rampdownusers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampdownusers(RampDownUsers newRampdownusers) {
		RampDownUsers oldRampdownusers = rampdownusers;
		rampdownusers = newRampdownusers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.RAMP_DOWN_TEST__RAMPDOWNUSERS, oldRampdownusers, rampdownusers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceWorkloadPackage.RAMP_DOWN_TEST__RAMPDOWNTIMER:
				if (resolve) return getRampdowntimer();
				return basicGetRampdowntimer();
			case CanopusPerformanceWorkloadPackage.RAMP_DOWN_TEST__RAMPDOWNUSERS:
				if (resolve) return getRampdownusers();
				return basicGetRampdownusers();
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
			case CanopusPerformanceWorkloadPackage.RAMP_DOWN_TEST__RAMPDOWNTIMER:
				setRampdowntimer((RampDownTimer)newValue);
				return;
			case CanopusPerformanceWorkloadPackage.RAMP_DOWN_TEST__RAMPDOWNUSERS:
				setRampdownusers((RampDownUsers)newValue);
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
			case CanopusPerformanceWorkloadPackage.RAMP_DOWN_TEST__RAMPDOWNTIMER:
				setRampdowntimer((RampDownTimer)null);
				return;
			case CanopusPerformanceWorkloadPackage.RAMP_DOWN_TEST__RAMPDOWNUSERS:
				setRampdownusers((RampDownUsers)null);
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
			case CanopusPerformanceWorkloadPackage.RAMP_DOWN_TEST__RAMPDOWNTIMER:
				return rampdowntimer != null;
			case CanopusPerformanceWorkloadPackage.RAMP_DOWN_TEST__RAMPDOWNUSERS:
				return rampdownusers != null;
		}
		return super.eIsSet(featureID);
	}

} //RampDownTestImpl
