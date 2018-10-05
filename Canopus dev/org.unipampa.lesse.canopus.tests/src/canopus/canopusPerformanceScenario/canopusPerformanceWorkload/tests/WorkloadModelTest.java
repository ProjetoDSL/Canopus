/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.tests;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadFactory;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.WorkloadModel;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Workload Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkloadModelTest extends TestCase {

	/**
	 * The fixture for this Workload Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkloadModelTest.class);
	}

	/**
	 * Constructs a new Workload Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Workload Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WorkloadModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Workload Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadModel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CanopusPerformanceWorkloadFactory.eINSTANCE.createWorkloadModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WorkloadModelTest
