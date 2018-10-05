/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceWorkload.tests;

import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.CanopusPerformanceWorkloadFactory;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampUpTimer;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ramp Up Timer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RampUpTimerTest extends TestCase {

	/**
	 * The fixture for this Ramp Up Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampUpTimer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RampUpTimerTest.class);
	}

	/**
	 * Constructs a new Ramp Up Timer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampUpTimerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ramp Up Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RampUpTimer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ramp Up Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampUpTimer getFixture() {
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
		setFixture(CanopusPerformanceWorkloadFactory.eINSTANCE.createRampUpTimer());
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

} //RampUpTimerTest
