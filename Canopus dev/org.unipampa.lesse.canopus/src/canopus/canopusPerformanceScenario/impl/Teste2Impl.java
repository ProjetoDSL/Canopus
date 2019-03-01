/**
 */
package canopus.canopusPerformanceScenario.impl;

import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;
import canopus.canopusPerformanceScenario.Teste1E2;
import canopus.canopusPerformanceScenario.Teste2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teste2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.Teste2Impl#getTeste1e2 <em>Teste1e2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Teste2Impl extends MinimalEObjectImpl.Container implements Teste2 {
	/**
	 * The cached value of the '{@link #getTeste1e2() <em>Teste1e2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeste1e2()
	 * @generated
	 * @ordered
	 */
	protected Teste1E2 teste1e2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Teste2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScenarioPackage.Literals.TESTE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teste1E2 getTeste1e2() {
		if (teste1e2 != null && teste1e2.eIsProxy()) {
			InternalEObject oldTeste1e2 = (InternalEObject)teste1e2;
			teste1e2 = (Teste1E2)eResolveProxy(oldTeste1e2);
			if (teste1e2 != oldTeste1e2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScenarioPackage.TESTE2__TESTE1E2, oldTeste1e2, teste1e2));
			}
		}
		return teste1e2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teste1E2 basicGetTeste1e2() {
		return teste1e2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeste1e2(Teste1E2 newTeste1e2, NotificationChain msgs) {
		Teste1E2 oldTeste1e2 = teste1e2;
		teste1e2 = newTeste1e2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.TESTE2__TESTE1E2, oldTeste1e2, newTeste1e2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeste1e2(Teste1E2 newTeste1e2) {
		if (newTeste1e2 != teste1e2) {
			NotificationChain msgs = null;
			if (teste1e2 != null)
				msgs = ((InternalEObject)teste1e2).eInverseRemove(this, CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE2, Teste1E2.class, msgs);
			if (newTeste1e2 != null)
				msgs = ((InternalEObject)newTeste1e2).eInverseAdd(this, CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE2, Teste1E2.class, msgs);
			msgs = basicSetTeste1e2(newTeste1e2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.TESTE2__TESTE1E2, newTeste1e2, newTeste1e2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScenarioPackage.TESTE2__TESTE1E2:
				if (teste1e2 != null)
					msgs = ((InternalEObject)teste1e2).eInverseRemove(this, CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE2, Teste1E2.class, msgs);
				return basicSetTeste1e2((Teste1E2)otherEnd, msgs);
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
			case CanopusPerformanceScenarioPackage.TESTE2__TESTE1E2:
				return basicSetTeste1e2(null, msgs);
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
			case CanopusPerformanceScenarioPackage.TESTE2__TESTE1E2:
				if (resolve) return getTeste1e2();
				return basicGetTeste1e2();
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
			case CanopusPerformanceScenarioPackage.TESTE2__TESTE1E2:
				setTeste1e2((Teste1E2)newValue);
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
			case CanopusPerformanceScenarioPackage.TESTE2__TESTE1E2:
				setTeste1e2((Teste1E2)null);
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
			case CanopusPerformanceScenarioPackage.TESTE2__TESTE1E2:
				return teste1e2 != null;
		}
		return super.eIsSet(featureID);
	}

} //Teste2Impl
