/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getTestduration <em>Testduration</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampdownusers <em>Rampdownusers</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampdowntime <em>Rampdowntime</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampuptimer <em>Rampuptimer</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampupusers <em>Rampupusers</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getVirtualusers <em>Virtualusers</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getWorkloadModel()
 * @model
 * @generated
 */
public interface WorkloadModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Testduration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testduration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testduration</em>' containment reference.
	 * @see #setTestduration(TestDuration)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getWorkloadModel_Testduration()
	 * @model containment="true"
	 * @generated
	 */
	TestDuration getTestduration();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getTestduration <em>Testduration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testduration</em>' containment reference.
	 * @see #getTestduration()
	 * @generated
	 */
	void setTestduration(TestDuration value);

	/**
	 * Returns the value of the '<em><b>Rampdownusers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rampdownusers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rampdownusers</em>' containment reference.
	 * @see #setRampdownusers(RampDownUsers)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getWorkloadModel_Rampdownusers()
	 * @model containment="true"
	 * @generated
	 */
	RampDownUsers getRampdownusers();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampdownusers <em>Rampdownusers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rampdownusers</em>' containment reference.
	 * @see #getRampdownusers()
	 * @generated
	 */
	void setRampdownusers(RampDownUsers value);

	/**
	 * Returns the value of the '<em><b>Rampdowntime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rampdowntime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rampdowntime</em>' containment reference.
	 * @see #setRampdowntime(RampDownTime)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getWorkloadModel_Rampdowntime()
	 * @model containment="true"
	 * @generated
	 */
	RampDownTime getRampdowntime();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampdowntime <em>Rampdowntime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rampdowntime</em>' containment reference.
	 * @see #getRampdowntime()
	 * @generated
	 */
	void setRampdowntime(RampDownTime value);

	/**
	 * Returns the value of the '<em><b>Rampuptimer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rampuptimer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rampuptimer</em>' containment reference.
	 * @see #setRampuptimer(RampUpTimer)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getWorkloadModel_Rampuptimer()
	 * @model containment="true"
	 * @generated
	 */
	RampUpTimer getRampuptimer();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampuptimer <em>Rampuptimer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rampuptimer</em>' containment reference.
	 * @see #getRampuptimer()
	 * @generated
	 */
	void setRampuptimer(RampUpTimer value);

	/**
	 * Returns the value of the '<em><b>Rampupusers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rampupusers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rampupusers</em>' containment reference.
	 * @see #setRampupusers(RampUpUsers)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getWorkloadModel_Rampupusers()
	 * @model containment="true"
	 * @generated
	 */
	RampUpUsers getRampupusers();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getRampupusers <em>Rampupusers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rampupusers</em>' containment reference.
	 * @see #getRampupusers()
	 * @generated
	 */
	void setRampupusers(RampUpUsers value);

	/**
	 * Returns the value of the '<em><b>Virtualusers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtualusers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtualusers</em>' containment reference.
	 * @see #setVirtualusers(VirtualUsers)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getWorkloadModel_Virtualusers()
	 * @model containment="true"
	 * @generated
	 */
	VirtualUsers getVirtualusers();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getVirtualusers <em>Virtualusers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtualusers</em>' containment reference.
	 * @see #getVirtualusers()
	 * @generated
	 */
	void setVirtualusers(VirtualUsers value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadPackage#getWorkloadModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // WorkloadModel
