/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ramp Up Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpTestImpl#getRampuptimer <em>Rampuptimer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.RampUpTestImpl#getRampupusers <em>Rampupusers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RampUpTestImpl extends MinimalEObjectImpl.Container implements RampUpTest {
	/**
	 * The cached value of the '{@link #getRampuptimer() <em>Rampuptimer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampuptimer()
	 * @generated
	 * @ordered
	 */
	protected RampUpTimer rampuptimer;

	/**
	 * The cached value of the '{@link #getRampupusers() <em>Rampupusers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampupusers()
	 * @generated
	 * @ordered
	 */
	protected RampUpUsers rampupusers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampUpTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceWorkloadPackage.Literals.RAMP_UP_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpTimer getRampuptimer() {
		if (rampuptimer != null && rampuptimer.eIsProxy()) {
			InternalEObject oldRampuptimer = (InternalEObject)rampuptimer;
			rampuptimer = (RampUpTimer)eResolveProxy(oldRampuptimer);
			if (rampuptimer != oldRampuptimer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceWorkloadPackage.RAMP_UP_TEST__RAMPUPTIMER, oldRampuptimer, rampuptimer));
			}
		}
		return rampuptimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpTimer basicGetRampuptimer() {
		return rampuptimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampuptimer(RampUpTimer newRampuptimer) {
		RampUpTimer oldRampuptimer = rampuptimer;
		rampuptimer = newRampuptimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.RAMP_UP_TEST__RAMPUPTIMER, oldRampuptimer, rampuptimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpUsers getRampupusers() {
		if (rampupusers != null && rampupusers.eIsProxy()) {
			InternalEObject oldRampupusers = (InternalEObject)rampupusers;
			rampupusers = (RampUpUsers)eResolveProxy(oldRampupusers);
			if (rampupusers != oldRampupusers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceWorkloadPackage.RAMP_UP_TEST__RAMPUPUSERS, oldRampupusers, rampupusers));
			}
		}
		return rampupusers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpUsers basicGetRampupusers() {
		return rampupusers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampupusers(RampUpUsers newRampupusers) {
		RampUpUsers oldRampupusers = rampupusers;
		rampupusers = newRampupusers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.RAMP_UP_TEST__RAMPUPUSERS, oldRampupusers, rampupusers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceWorkloadPackage.RAMP_UP_TEST__RAMPUPTIMER:
				if (resolve) return getRampuptimer();
				return basicGetRampuptimer();
			case CanopusPerformanceWorkloadPackage.RAMP_UP_TEST__RAMPUPUSERS:
				if (resolve) return getRampupusers();
				return basicGetRampupusers();
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
			case CanopusPerformanceWorkloadPackage.RAMP_UP_TEST__RAMPUPTIMER:
				setRampuptimer((RampUpTimer)newValue);
				return;
			case CanopusPerformanceWorkloadPackage.RAMP_UP_TEST__RAMPUPUSERS:
				setRampupusers((RampUpUsers)newValue);
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
			case CanopusPerformanceWorkloadPackage.RAMP_UP_TEST__RAMPUPTIMER:
				setRampuptimer((RampUpTimer)null);
				return;
			case CanopusPerformanceWorkloadPackage.RAMP_UP_TEST__RAMPUPUSERS:
				setRampupusers((RampUpUsers)null);
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
			case CanopusPerformanceWorkloadPackage.RAMP_UP_TEST__RAMPUPTIMER:
				return rampuptimer != null;
			case CanopusPerformanceWorkloadPackage.RAMP_UP_TEST__RAMPUPUSERS:
				return rampupusers != null;
		}
		return super.eIsSet(featureID);
	}

} //RampUpTestImpl
