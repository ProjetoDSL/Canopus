/**
 */
package openmlperf.openmlperfPerformanceMonitoring.impl;

import openmlperf.openmlperfPerformanceMonitoring.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenmlperfPerformanceMonitoringFactoryImpl extends EFactoryImpl implements OpenmlperfPerformanceMonitoringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenmlperfPerformanceMonitoringFactory init() {
		try {
			OpenmlperfPerformanceMonitoringFactory theOpenmlperfPerformanceMonitoringFactory = (OpenmlperfPerformanceMonitoringFactory)EPackage.Registry.INSTANCE.getEFactory(OpenmlperfPerformanceMonitoringPackage.eNS_URI);
			if (theOpenmlperfPerformanceMonitoringFactory != null) {
				return theOpenmlperfPerformanceMonitoringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenmlperfPerformanceMonitoringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceMonitoringFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpenmlperfPerformanceMonitoringPackage.SUT: return createSUT();
			case OpenmlperfPerformanceMonitoringPackage.LOAD_GENERATOR: return createLoadGenerator();
			case OpenmlperfPerformanceMonitoringPackage.MONITOR: return createMonitor();
			case OpenmlperfPerformanceMonitoringPackage.METRIC_MODEL: return createMetricModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OpenmlperfPerformanceMonitoringPackage.SUT_TYPE:
				return createSUT_TYPEFromString(eDataType, initialValue);
			case OpenmlperfPerformanceMonitoringPackage.HARDWARE:
				return createHARDWAREFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OpenmlperfPerformanceMonitoringPackage.SUT_TYPE:
				return convertSUT_TYPEToString(eDataType, instanceValue);
			case OpenmlperfPerformanceMonitoringPackage.HARDWARE:
				return convertHARDWAREToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUT createSUT() {
		SUTImpl sut = new SUTImpl();
		return sut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadGenerator createLoadGenerator() {
		LoadGeneratorImpl loadGenerator = new LoadGeneratorImpl();
		return loadGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor createMonitor() {
		MonitorImpl monitor = new MonitorImpl();
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricModel createMetricModel() {
		MetricModelImpl metricModel = new MetricModelImpl();
		return metricModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUT_TYPE createSUT_TYPEFromString(EDataType eDataType, String initialValue) {
		SUT_TYPE result = SUT_TYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSUT_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HARDWARE createHARDWAREFromString(EDataType eDataType, String initialValue) {
		HARDWARE result = HARDWARE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHARDWAREToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceMonitoringPackage getOpenmlperfPerformanceMonitoringPackage() {
		return (OpenmlperfPerformanceMonitoringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenmlperfPerformanceMonitoringPackage getPackage() {
		return OpenmlperfPerformanceMonitoringPackage.eINSTANCE;
	}

} //OpenmlperfPerformanceMonitoringFactoryImpl
