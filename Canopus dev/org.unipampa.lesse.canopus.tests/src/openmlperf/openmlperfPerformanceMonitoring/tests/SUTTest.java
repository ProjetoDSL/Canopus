/**
 */
package openmlperf.openmlperfPerformanceMonitoring.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import openmlperf.openmlperfPerformanceMonitoring.OpenmlperfPerformanceMonitoringFactory;
import openmlperf.openmlperfPerformanceMonitoring.SUT;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SUT</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SUTTest extends TestCase {

	/**
	 * The fixture for this SUT test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SUT fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SUTTest.class);
	}

	/**
	 * Constructs a new SUT test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUTTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this SUT test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SUT fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this SUT test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SUT getFixture() {
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
		setFixture(OpenmlperfPerformanceMonitoringFactory.eINSTANCE.createSUT());
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

} //SUTTest
