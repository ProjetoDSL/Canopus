/**
 */
package canopus.canopusPerformanceMonitoring.tests;

import canopus.canopusPerformanceMonitoring.CanopusPerformanceMonitoringFactory;
import canopus.canopusPerformanceMonitoring.LoadGenerator;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Load Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadGeneratorTest extends TestCase {

	/**
	 * The fixture for this Load Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadGenerator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoadGeneratorTest.class);
	}

	/**
	 * Constructs a new Load Generator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadGeneratorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Load Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LoadGenerator fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Load Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadGenerator getFixture() {
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
		setFixture(CanopusPerformanceMonitoringFactory.eINSTANCE.createLoadGenerator());
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

} //LoadGeneratorTest
