/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage
 * @generated
 */
public interface OpenmlperfPerformanceScriptingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenmlperfPerformanceScriptingFactory eINSTANCE = openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.OpenmlperfPerformanceScriptingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Initial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial</em>'.
	 * @generated
	 */
	Initial createInitial();

	/**
	 * Returns a new object of class '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final</em>'.
	 * @generated
	 */
	Final createFinal();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Think Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Think Time</em>'.
	 * @generated
	 */
	ThinkTime createThinkTime();

	/**
	 * Returns a new object of class '<em>Save Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Save Parameters</em>'.
	 * @generated
	 */
	SaveParameters createSaveParameters();

	/**
	 * Returns a new object of class '<em>Data Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Table</em>'.
	 * @generated
	 */
	DataTable createDataTable();

	/**
	 * Returns a new object of class '<em>Parameter Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Object</em>'.
	 * @generated
	 */
	ParameterObject createParameterObject();

	/**
	 * Returns a new object of class '<em>Columns Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Columns Object</em>'.
	 * @generated
	 */
	ColumnsObject createColumnsObject();

	/**
	 * Returns a new object of class '<em>Activity To Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity To Activity</em>'.
	 * @generated
	 */
	ActivityToActivity createActivityToActivity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OpenmlperfPerformanceScriptingPackage getOpenmlperfPerformanceScriptingPackage();

} //OpenmlperfPerformanceScriptingFactory
