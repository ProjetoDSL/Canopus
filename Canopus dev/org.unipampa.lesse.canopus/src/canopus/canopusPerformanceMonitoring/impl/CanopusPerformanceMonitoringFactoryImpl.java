/**
 */
package canopus.canopusPerformanceMonitoring.impl;

import canopus.canopusPerformanceMonitoring.*;

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
public class CanopusPerformanceMonitoringFactoryImpl extends EFactoryImpl implements CanopusPerformanceMonitoringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CanopusPerformanceMonitoringFactory init() {
		try {
			CanopusPerformanceMonitoringFactory theCanopusPerformanceMonitoringFactory = (CanopusPerformanceMonitoringFactory)EPackage.Registry.INSTANCE.getEFactory(CanopusPerformanceMonitoringPackage.eNS_URI);
			if (theCanopusPerformanceMonitoringFactory != null) {
				return theCanopusPerformanceMonitoringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CanopusPerformanceMonitoringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceMonitoringFactoryImpl() {
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
			case CanopusPerformanceMonitoringPackage.SUT: return createSUT();
			case CanopusPerformanceMonitoringPackage.LOAD_GENERATOR: return createLoadGenerator();
			case CanopusPerformanceMonitoringPackage.MONITOR: return createMonitor();
			case CanopusPerformanceMonitoringPackage.METRIC_MODEL: return createMetricModel();
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
			case CanopusPerformanceMonitoringPackage.SUT_TYPE:
				return createSUT_TYPEFromString(eDataType, initialValue);
			case CanopusPerformanceMonitoringPackage.HARDWARE:
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
			case CanopusPerformanceMonitoringPackage.SUT_TYPE:
				return convertSUT_TYPEToString(eDataType, instanceValue);
			case CanopusPerformanceMonitoringPackage.HARDWARE:
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
	@Override
	public SUT createSUT() {
		SUTImpl sut = new SUTImpl();
		return sut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadGenerator createLoadGenerator() {
		LoadGeneratorImpl loadGenerator = new LoadGeneratorImpl();
		return loadGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Monitor createMonitor() {
		MonitorImpl monitor = new MonitorImpl();
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public CanopusPerformanceMonitoringPackage getCanopusPerformanceMonitoringPackage() {
		return (CanopusPerformanceMonitoringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CanopusPerformanceMonitoringPackage getPackage() {
		return CanopusPerformanceMonitoringPackage.eINSTANCE;
	}

} //CanopusPerformanceMonitoringFactoryImpl
