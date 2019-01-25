/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTest;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadGroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadGroupImpl#getRampdowntest <em>Rampdowntest</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadGroupImpl#getRampuptest <em>Rampuptest</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.WorkloadGroupImpl#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkloadGroupImpl extends MinimalEObjectImpl.Container implements WorkloadGroup {
	/**
	 * The cached value of the '{@link #getRampdowntest() <em>Rampdowntest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampdowntest()
	 * @generated
	 * @ordered
	 */
	protected RampDownTest rampdowntest;

	/**
	 * The cached value of the '{@link #getRampuptest() <em>Rampuptest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampuptest()
	 * @generated
	 * @ordered
	 */
	protected RampUpTest rampuptest;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected Test test;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceWorkloadPackage.Literals.WORKLOAD_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampDownTest getRampdowntest() {
		if (rampdowntest != null && rampdowntest.eIsProxy()) {
			InternalEObject oldRampdowntest = (InternalEObject)rampdowntest;
			rampdowntest = (RampDownTest)eResolveProxy(oldRampdowntest);
			if (rampdowntest != oldRampdowntest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__RAMPDOWNTEST, oldRampdowntest, rampdowntest));
			}
		}
		return rampdowntest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampDownTest basicGetRampdowntest() {
		return rampdowntest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampdowntest(RampDownTest newRampdowntest) {
		RampDownTest oldRampdowntest = rampdowntest;
		rampdowntest = newRampdowntest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__RAMPDOWNTEST, oldRampdowntest, rampdowntest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpTest getRampuptest() {
		if (rampuptest != null && rampuptest.eIsProxy()) {
			InternalEObject oldRampuptest = (InternalEObject)rampuptest;
			rampuptest = (RampUpTest)eResolveProxy(oldRampuptest);
			if (rampuptest != oldRampuptest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__RAMPUPTEST, oldRampuptest, rampuptest));
			}
		}
		return rampuptest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpTest basicGetRampuptest() {
		return rampuptest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampuptest(RampUpTest newRampuptest) {
		RampUpTest oldRampuptest = rampuptest;
		rampuptest = newRampuptest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__RAMPUPTEST, oldRampuptest, rampuptest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test getTest() {
		if (test != null && test.eIsProxy()) {
			InternalEObject oldTest = (InternalEObject)test;
			test = (Test)eResolveProxy(oldTest);
			if (test != oldTest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__TEST, oldTest, test));
			}
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test basicGetTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest(Test newTest) {
		Test oldTest = test;
		test = newTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__TEST, oldTest, test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__RAMPDOWNTEST:
				if (resolve) return getRampdowntest();
				return basicGetRampdowntest();
			case CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__RAMPUPTEST:
				if (resolve) return getRampuptest();
				return basicGetRampuptest();
			case CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__TEST:
				if (resolve) return getTest();
				return basicGetTest();
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
			case CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__RAMPDOWNTEST:
				setRampdowntest((RampDownTest)newValue);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__RAMPUPTEST:
				setRampuptest((RampUpTest)newValue);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__TEST:
				setTest((Test)newValue);
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
			case CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__RAMPDOWNTEST:
				setRampdowntest((RampDownTest)null);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__RAMPUPTEST:
				setRampuptest((RampUpTest)null);
				return;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__TEST:
				setTest((Test)null);
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
			case CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__RAMPDOWNTEST:
				return rampdowntest != null;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__RAMPUPTEST:
				return rampuptest != null;
			case CanopusPerformanceWorkloadPackage.WORKLOAD_GROUP__TEST:
				return test != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkloadGroupImpl
