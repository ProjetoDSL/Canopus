/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.TestDuration;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.TestImpl#getTestduration <em>Testduration</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.impl.TestImpl#getVirtualusers <em>Virtualusers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestImpl extends MinimalEObjectImpl.Container implements Test {
	/**
	 * The cached value of the '{@link #getTestduration() <em>Testduration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestduration()
	 * @generated
	 * @ordered
	 */
	protected TestDuration testduration;

	/**
	 * The cached value of the '{@link #getVirtualusers() <em>Virtualusers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualusers()
	 * @generated
	 * @ordered
	 */
	protected VirtualUsers virtualusers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceWorkloadPackage.Literals.TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestDuration getTestduration() {
		if (testduration != null && testduration.eIsProxy()) {
			InternalEObject oldTestduration = (InternalEObject)testduration;
			testduration = (TestDuration)eResolveProxy(oldTestduration);
			if (testduration != oldTestduration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceWorkloadPackage.TEST__TESTDURATION, oldTestduration, testduration));
			}
		}
		return testduration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestDuration basicGetTestduration() {
		return testduration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestduration(TestDuration newTestduration) {
		TestDuration oldTestduration = testduration;
		testduration = newTestduration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.TEST__TESTDURATION, oldTestduration, testduration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualUsers getVirtualusers() {
		if (virtualusers != null && virtualusers.eIsProxy()) {
			InternalEObject oldVirtualusers = (InternalEObject)virtualusers;
			virtualusers = (VirtualUsers)eResolveProxy(oldVirtualusers);
			if (virtualusers != oldVirtualusers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceWorkloadPackage.TEST__VIRTUALUSERS, oldVirtualusers, virtualusers));
			}
		}
		return virtualusers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualUsers basicGetVirtualusers() {
		return virtualusers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualusers(VirtualUsers newVirtualusers) {
		VirtualUsers oldVirtualusers = virtualusers;
		virtualusers = newVirtualusers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceWorkloadPackage.TEST__VIRTUALUSERS, oldVirtualusers, virtualusers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceWorkloadPackage.TEST__TESTDURATION:
				if (resolve) return getTestduration();
				return basicGetTestduration();
			case CanopusPerformanceWorkloadPackage.TEST__VIRTUALUSERS:
				if (resolve) return getVirtualusers();
				return basicGetVirtualusers();
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
			case CanopusPerformanceWorkloadPackage.TEST__TESTDURATION:
				setTestduration((TestDuration)newValue);
				return;
			case CanopusPerformanceWorkloadPackage.TEST__VIRTUALUSERS:
				setVirtualusers((VirtualUsers)newValue);
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
			case CanopusPerformanceWorkloadPackage.TEST__TESTDURATION:
				setTestduration((TestDuration)null);
				return;
			case CanopusPerformanceWorkloadPackage.TEST__VIRTUALUSERS:
				setVirtualusers((VirtualUsers)null);
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
			case CanopusPerformanceWorkloadPackage.TEST__TESTDURATION:
				return testduration != null;
			case CanopusPerformanceWorkloadPackage.TEST__VIRTUALUSERS:
				return virtualusers != null;
		}
		return super.eIsSet(featureID);
	}

} //TestImpl
