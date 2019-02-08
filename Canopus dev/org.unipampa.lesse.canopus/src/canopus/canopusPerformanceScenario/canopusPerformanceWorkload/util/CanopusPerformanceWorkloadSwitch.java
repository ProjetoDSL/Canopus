/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.util;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage
 * @generated
 */
public class CanopusPerformanceWorkloadSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CanopusPerformanceWorkloadPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceWorkloadSwitch() {
		if (modelPackage == null) {
			modelPackage = CanopusPerformanceWorkloadPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CanopusPerformanceWorkloadPackage.RAMP_UP_USERS: {
				RampUpUsers rampUpUsers = (RampUpUsers)theEObject;
				T result = caseRampUpUsers(rampUpUsers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanopusPerformanceWorkloadPackage.RAMP_DOWN_USERS: {
				RampDownUsers rampDownUsers = (RampDownUsers)theEObject;
				T result = caseRampDownUsers(rampDownUsers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanopusPerformanceWorkloadPackage.RAMP_UP_TIMER: {
				RampUpTimer rampUpTimer = (RampUpTimer)theEObject;
				T result = caseRampUpTimer(rampUpTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanopusPerformanceWorkloadPackage.RAMP_DOWN_TIMER: {
				RampDownTimer rampDownTimer = (RampDownTimer)theEObject;
				T result = caseRampDownTimer(rampDownTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ramp Up Users</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ramp Up Users</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRampUpUsers(RampUpUsers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ramp Down Users</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ramp Down Users</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRampDownUsers(RampDownUsers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ramp Up Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ramp Up Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRampUpTimer(RampUpTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ramp Down Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ramp Down Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRampDownTimer(RampDownTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CanopusPerformanceWorkloadSwitch
