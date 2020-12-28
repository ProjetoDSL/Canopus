/**
 */
package openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.tests;

import junit.textui.TestRunner;

import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.OpenmlperfPerformanceMetricFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiskTest extends MetricTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiskTest.class);
	}

	/**
	 * Constructs a new Disk test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Disk test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Disk getFixture() {
		return (Disk)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OpenmlperfPerformanceMetricFactory.eINSTANCE.createDisk());
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

} //DiskTest
