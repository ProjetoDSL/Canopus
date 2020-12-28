/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.OpenmlperfPerformanceWorkloadFactory
 * @model kind="package"
 * @generated
 */
public interface OpenmlperfPerformanceWorkloadPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openmlperfPerformanceWorkload";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unipampa.lesse.org/openmlperfPerformanceWorkload";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openmlperfPerformanceWorkload";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenmlperfPerformanceWorkloadPackage eINSTANCE = openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl.init();

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampUpUsersImpl <em>Ramp Up Users</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampUpUsersImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl#getRampUpUsers()
	 * @generated
	 */
	int RAMP_UP_USERS = 0;

	/**
	 * The feature id for the '<em><b>Virtual Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_USERS__VIRTUAL_USERS = 0;

	/**
	 * The number of structural features of the '<em>Ramp Up Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_USERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ramp Up Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_USERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampDownUsersImpl <em>Ramp Down Users</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampDownUsersImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl#getRampDownUsers()
	 * @generated
	 */
	int RAMP_DOWN_USERS = 1;

	/**
	 * The feature id for the '<em><b>Virtual Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_USERS__VIRTUAL_USERS = 0;

	/**
	 * The number of structural features of the '<em>Ramp Down Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_USERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ramp Down Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_USERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampUpTimerImpl <em>Ramp Up Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampUpTimerImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl#getRampUpTimer()
	 * @generated
	 */
	int RAMP_UP_TIMER = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_TIMER__TIME = 0;

	/**
	 * The feature id for the '<em><b>Time Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_TIMER__TIME_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Ramp Up Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_TIMER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ramp Up Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_UP_TIMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampDownTimerImpl <em>Ramp Down Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampDownTimerImpl
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl#getRampDownTimer()
	 * @generated
	 */
	int RAMP_DOWN_TIMER = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TIMER__TIME = 0;

	/**
	 * The feature id for the '<em><b>Time Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TIMER__TIME_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Ramp Down Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TIMER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ramp Down Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_DOWN_TIMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.TimeTypeRamps <em>Time Type Ramps</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.TimeTypeRamps
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl#getTimeTypeRamps()
	 * @generated
	 */
	int TIME_TYPE_RAMPS = 4;


	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpUsers <em>Ramp Up Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Up Users</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpUsers
	 * @generated
	 */
	EClass getRampUpUsers();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpUsers#getVirtualUsers <em>Virtual Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Users</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpUsers#getVirtualUsers()
	 * @see #getRampUpUsers()
	 * @generated
	 */
	EAttribute getRampUpUsers_VirtualUsers();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownUsers <em>Ramp Down Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Down Users</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownUsers
	 * @generated
	 */
	EClass getRampDownUsers();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownUsers#getVirtualUsers <em>Virtual Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Users</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownUsers#getVirtualUsers()
	 * @see #getRampDownUsers()
	 * @generated
	 */
	EAttribute getRampDownUsers_VirtualUsers();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpTimer <em>Ramp Up Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Up Timer</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpTimer
	 * @generated
	 */
	EClass getRampUpTimer();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpTimer#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpTimer#getTime()
	 * @see #getRampUpTimer()
	 * @generated
	 */
	EAttribute getRampUpTimer_Time();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpTimer#getTimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Type</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampUpTimer#getTimeType()
	 * @see #getRampUpTimer()
	 * @generated
	 */
	EAttribute getRampUpTimer_TimeType();

	/**
	 * Returns the meta object for class '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownTimer <em>Ramp Down Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Down Timer</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownTimer
	 * @generated
	 */
	EClass getRampDownTimer();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownTimer#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownTimer#getTime()
	 * @see #getRampDownTimer()
	 * @generated
	 */
	EAttribute getRampDownTimer_Time();

	/**
	 * Returns the meta object for the attribute '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownTimer#getTimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Type</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownTimer#getTimeType()
	 * @see #getRampDownTimer()
	 * @generated
	 */
	EAttribute getRampDownTimer_TimeType();

	/**
	 * Returns the meta object for enum '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.TimeTypeRamps <em>Time Type Ramps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Type Ramps</em>'.
	 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.TimeTypeRamps
	 * @generated
	 */
	EEnum getTimeTypeRamps();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpenmlperfPerformanceWorkloadFactory getOpenmlperfPerformanceWorkloadFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampUpUsersImpl <em>Ramp Up Users</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampUpUsersImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl#getRampUpUsers()
		 * @generated
		 */
		EClass RAMP_UP_USERS = eINSTANCE.getRampUpUsers();

		/**
		 * The meta object literal for the '<em><b>Virtual Users</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAMP_UP_USERS__VIRTUAL_USERS = eINSTANCE.getRampUpUsers_VirtualUsers();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampDownUsersImpl <em>Ramp Down Users</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampDownUsersImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl#getRampDownUsers()
		 * @generated
		 */
		EClass RAMP_DOWN_USERS = eINSTANCE.getRampDownUsers();

		/**
		 * The meta object literal for the '<em><b>Virtual Users</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAMP_DOWN_USERS__VIRTUAL_USERS = eINSTANCE.getRampDownUsers_VirtualUsers();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampUpTimerImpl <em>Ramp Up Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampUpTimerImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl#getRampUpTimer()
		 * @generated
		 */
		EClass RAMP_UP_TIMER = eINSTANCE.getRampUpTimer();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAMP_UP_TIMER__TIME = eINSTANCE.getRampUpTimer_Time();

		/**
		 * The meta object literal for the '<em><b>Time Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAMP_UP_TIMER__TIME_TYPE = eINSTANCE.getRampUpTimer_TimeType();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampDownTimerImpl <em>Ramp Down Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.RampDownTimerImpl
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl#getRampDownTimer()
		 * @generated
		 */
		EClass RAMP_DOWN_TIMER = eINSTANCE.getRampDownTimer();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAMP_DOWN_TIMER__TIME = eINSTANCE.getRampDownTimer_Time();

		/**
		 * The meta object literal for the '<em><b>Time Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAMP_DOWN_TIMER__TIME_TYPE = eINSTANCE.getRampDownTimer_TimeType();

		/**
		 * The meta object literal for the '{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.TimeTypeRamps <em>Time Type Ramps</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.TimeTypeRamps
		 * @see openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.impl.OpenmlperfPerformanceWorkloadPackageImpl#getTimeTypeRamps()
		 * @generated
		 */
		EEnum TIME_TYPE_RAMPS = eINSTANCE.getTimeTypeRamps();

	}

} //OpenmlperfPerformanceWorkloadPackage
