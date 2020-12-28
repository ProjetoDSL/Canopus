/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.tests;

import junit.textui.TestRunner;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Memory;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemoryTest extends MetricTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MemoryTest.class);
	}

	/**
	 * Constructs a new Memory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Memory getFixture() {
		return (Memory)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OpenmlperfPerformanceMetricFactory.eINSTANCE.createMemory());
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

} //MemoryTest
