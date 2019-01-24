/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test#getTestduration <em>Testduration</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test#getVirtualusers <em>Virtualusers</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getTest()
 * @model
 * @generated
 */
public interface Test extends EObject {
	/**
	 * Returns the value of the '<em><b>Testduration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testduration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testduration</em>' reference.
	 * @see #setTestduration(TestDuration)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getTest_Testduration()
	 * @model
	 * @generated
	 */
	TestDuration getTestduration();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test#getTestduration <em>Testduration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testduration</em>' reference.
	 * @see #getTestduration()
	 * @generated
	 */
	void setTestduration(TestDuration value);

	/**
	 * Returns the value of the '<em><b>Virtualusers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtualusers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtualusers</em>' reference.
	 * @see #setVirtualusers(VirtualUsers)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getTest_Virtualusers()
	 * @model
	 * @generated
	 */
	VirtualUsers getVirtualusers();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.Test#getVirtualusers <em>Virtualusers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtualusers</em>' reference.
	 * @see #getVirtualusers()
	 * @generated
	 */
	void setVirtualusers(VirtualUsers value);

} // Test
