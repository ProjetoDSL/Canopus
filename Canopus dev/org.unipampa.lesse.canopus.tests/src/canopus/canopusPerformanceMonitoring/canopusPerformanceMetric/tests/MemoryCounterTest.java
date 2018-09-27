/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.tests;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricFactory;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.MemoryCounter;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Memory Counter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemoryCounterTest extends CounterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MemoryCounterTest.class);
	}

	/**
	 * Constructs a new Memory Counter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryCounterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Memory Counter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MemoryCounter getFixture() {
		return (MemoryCounter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CanopusPerformanceMetricFactory.eINSTANCE.createMemoryCounter());
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

} //MemoryCounterTest
