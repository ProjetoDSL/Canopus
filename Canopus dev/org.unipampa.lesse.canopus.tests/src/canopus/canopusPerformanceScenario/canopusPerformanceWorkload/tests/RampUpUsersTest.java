/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.tests;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadFactory;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpUsers;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ramp Up Users</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RampUpUsersTest extends TestCase {

	/**
	 * The fixture for this Ramp Up Users test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampUpUsers fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RampUpUsersTest.class);
	}

	/**
	 * Constructs a new Ramp Up Users test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpUsersTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ramp Up Users test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RampUpUsers fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ramp Up Users test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampUpUsers getFixture() {
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
		setFixture(CanopusPerformanceWorkloadFactory.eINSTANCE.createRampUpUsers());
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

} //RampUpUsersTest
