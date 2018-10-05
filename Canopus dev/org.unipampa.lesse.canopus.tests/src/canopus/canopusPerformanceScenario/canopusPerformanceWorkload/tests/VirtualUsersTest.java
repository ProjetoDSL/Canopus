/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.tests;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadFactory;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.VirtualUsers;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virtual Users</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VirtualUsersTest extends TestCase {

	/**
	 * The fixture for this Virtual Users test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualUsers fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VirtualUsersTest.class);
	}

	/**
	 * Constructs a new Virtual Users test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualUsersTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Virtual Users test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VirtualUsers fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Virtual Users test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualUsers getFixture() {
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
		setFixture(CanopusPerformanceWorkloadFactory.eINSTANCE.createVirtualUsers());
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

} //VirtualUsersTest
