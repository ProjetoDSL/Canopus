/**
 */
package canopus.canopusPerformanceScenario.impl;

import canopus.canopusPerformanceScenario.CanopusPerformanceScenarioPackage;
import canopus.canopusPerformanceScenario.Teste1;
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
 * An implementation of the model object '<em><b>Teste1 E2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.Teste1E2Impl#getPorcentagem <em>Porcentagem</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.Teste1E2Impl#getTeste1 <em>Teste1</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.impl.Teste1E2Impl#getTeste2 <em>Teste2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Teste1E2Impl extends MinimalEObjectImpl.Container implements Teste1E2 {
	/**
	 * The default value of the '{@link #getPorcentagem() <em>Porcentagem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorcentagem()
	 * @generated
	 * @ordered
	 */
	protected static final int PORCENTAGEM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPorcentagem() <em>Porcentagem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorcentagem()
	 * @generated
	 * @ordered
	 */
	protected int porcentagem = PORCENTAGEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeste1() <em>Teste1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeste1()
	 * @generated
	 * @ordered
	 */
	protected Teste1 teste1;

	/**
	 * The cached value of the '{@link #getTeste2() <em>Teste2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeste2()
	 * @generated
	 * @ordered
	 */
	protected Teste2 teste2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Teste1E2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScenarioPackage.Literals.TESTE1_E2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPorcentagem() {
		return porcentagem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorcentagem(int newPorcentagem) {
		int oldPorcentagem = porcentagem;
		porcentagem = newPorcentagem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.TESTE1_E2__PORCENTAGEM, oldPorcentagem, porcentagem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teste1 getTeste1() {
		if (teste1 != null && teste1.eIsProxy()) {
			InternalEObject oldTeste1 = (InternalEObject)teste1;
			teste1 = (Teste1)eResolveProxy(oldTeste1);
			if (teste1 != oldTeste1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE1, oldTeste1, teste1));
			}
		}
		return teste1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teste1 basicGetTeste1() {
		return teste1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeste1(Teste1 newTeste1, NotificationChain msgs) {
		Teste1 oldTeste1 = teste1;
		teste1 = newTeste1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE1, oldTeste1, newTeste1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeste1(Teste1 newTeste1) {
		if (newTeste1 != teste1) {
			NotificationChain msgs = null;
			if (teste1 != null)
				msgs = ((InternalEObject)teste1).eInverseRemove(this, CanopusPerformanceScenarioPackage.TESTE1__TESTE1E2, Teste1.class, msgs);
			if (newTeste1 != null)
				msgs = ((InternalEObject)newTeste1).eInverseAdd(this, CanopusPerformanceScenarioPackage.TESTE1__TESTE1E2, Teste1.class, msgs);
			msgs = basicSetTeste1(newTeste1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE1, newTeste1, newTeste1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teste2 getTeste2() {
		if (teste2 != null && teste2.eIsProxy()) {
			InternalEObject oldTeste2 = (InternalEObject)teste2;
			teste2 = (Teste2)eResolveProxy(oldTeste2);
			if (teste2 != oldTeste2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE2, oldTeste2, teste2));
			}
		}
		return teste2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teste2 basicGetTeste2() {
		return teste2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeste2(Teste2 newTeste2, NotificationChain msgs) {
		Teste2 oldTeste2 = teste2;
		teste2 = newTeste2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE2, oldTeste2, newTeste2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeste2(Teste2 newTeste2) {
		if (newTeste2 != teste2) {
			NotificationChain msgs = null;
			if (teste2 != null)
				msgs = ((InternalEObject)teste2).eInverseRemove(this, CanopusPerformanceScenarioPackage.TESTE2__TESTE1E2, Teste2.class, msgs);
			if (newTeste2 != null)
				msgs = ((InternalEObject)newTeste2).eInverseAdd(this, CanopusPerformanceScenarioPackage.TESTE2__TESTE1E2, Teste2.class, msgs);
			msgs = basicSetTeste2(newTeste2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE2, newTeste2, newTeste2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE1:
				if (teste1 != null)
					msgs = ((InternalEObject)teste1).eInverseRemove(this, CanopusPerformanceScenarioPackage.TESTE1__TESTE1E2, Teste1.class, msgs);
				return basicSetTeste1((Teste1)otherEnd, msgs);
			case CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE2:
				if (teste2 != null)
					msgs = ((InternalEObject)teste2).eInverseRemove(this, CanopusPerformanceScenarioPackage.TESTE2__TESTE1E2, Teste2.class, msgs);
				return basicSetTeste2((Teste2)otherEnd, msgs);
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
			case CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE1:
				return basicSetTeste1(null, msgs);
			case CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE2:
				return basicSetTeste2(null, msgs);
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
			case CanopusPerformanceScenarioPackage.TESTE1_E2__PORCENTAGEM:
				return getPorcentagem();
			case CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE1:
				if (resolve) return getTeste1();
				return basicGetTeste1();
			case CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE2:
				if (resolve) return getTeste2();
				return basicGetTeste2();
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
			case CanopusPerformanceScenarioPackage.TESTE1_E2__PORCENTAGEM:
				setPorcentagem((Integer)newValue);
				return;
			case CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE1:
				setTeste1((Teste1)newValue);
				return;
			case CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE2:
				setTeste2((Teste2)newValue);
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
			case CanopusPerformanceScenarioPackage.TESTE1_E2__PORCENTAGEM:
				setPorcentagem(PORCENTAGEM_EDEFAULT);
				return;
			case CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE1:
				setTeste1((Teste1)null);
				return;
			case CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE2:
				setTeste2((Teste2)null);
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
			case CanopusPerformanceScenarioPackage.TESTE1_E2__PORCENTAGEM:
				return porcentagem != PORCENTAGEM_EDEFAULT;
			case CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE1:
				return teste1 != null;
			case CanopusPerformanceScenarioPackage.TESTE1_E2__TESTE2:
				return teste2 != null;
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
		result.append(" (porcentagem: ");
		result.append(porcentagem);
		result.append(')');
		return result.toString();
	}

} //Teste1E2Impl
