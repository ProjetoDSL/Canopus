/**
 */
package canopus.tests;

import canopus.CanopusFactory;
import canopus.Scenario;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioTest extends DiagramTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScenarioTest.class);
	}

	/**
	 * Constructs a new Scenario test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Scenario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Scenario getFixture() {
		return (Scenario)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CanopusFactory.eINSTANCE.createScenario());
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

} //ScenarioTest
