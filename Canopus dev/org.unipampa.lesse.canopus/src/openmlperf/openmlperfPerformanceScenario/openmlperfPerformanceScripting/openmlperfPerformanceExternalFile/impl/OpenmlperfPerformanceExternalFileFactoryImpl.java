/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.impl;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.openmlperfPerformanceExternalFile.*;

import org.eclipse.emf.ecore.EClass;
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
public class OpenmlperfPerformanceExternalFileFactoryImpl extends EFactoryImpl implements OpenmlperfPerformanceExternalFileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenmlperfPerformanceExternalFileFactory init() {
		try {
			OpenmlperfPerformanceExternalFileFactory theOpenmlperfPerformanceExternalFileFactory = (OpenmlperfPerformanceExternalFileFactory)EPackage.Registry.INSTANCE.getEFactory(OpenmlperfPerformanceExternalFilePackage.eNS_URI);
			if (theOpenmlperfPerformanceExternalFileFactory != null) {
				return theOpenmlperfPerformanceExternalFileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenmlperfPerformanceExternalFileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceExternalFileFactoryImpl() {
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
			case OpenmlperfPerformanceExternalFilePackage.EXTERNAL_FILE: return createExternalFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFile createExternalFile() {
		ExternalFileImpl externalFile = new ExternalFileImpl();
		return externalFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenmlperfPerformanceExternalFilePackage getOpenmlperfPerformanceExternalFilePackage() {
		return (OpenmlperfPerformanceExternalFilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenmlperfPerformanceExternalFilePackage getPackage() {
		return OpenmlperfPerformanceExternalFilePackage.eINSTANCE;
	}

} //OpenmlperfPerformanceExternalFileFactoryImpl
