/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.tests;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricFactory;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.TransactionCounter;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transaction Counter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransactionCounterTest extends CounterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransactionCounterTest.class);
	}

	/**
	 * Constructs a new Transaction Counter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionCounterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transaction Counter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TransactionCounter getFixture() {
		return (TransactionCounter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CanopusPerformanceMetricFactory.eINSTANCE.createTransactionCounter());
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

} //TransactionCounterTest
