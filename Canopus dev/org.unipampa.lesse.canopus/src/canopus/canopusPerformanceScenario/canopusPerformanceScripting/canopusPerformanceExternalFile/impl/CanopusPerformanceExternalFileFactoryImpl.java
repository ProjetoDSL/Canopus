/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.*;

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
public class CanopusPerformanceExternalFileFactoryImpl extends EFactoryImpl implements CanopusPerformanceExternalFileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CanopusPerformanceExternalFileFactory init() {
		try {
			CanopusPerformanceExternalFileFactory theCanopusPerformanceExternalFileFactory = (CanopusPerformanceExternalFileFactory)EPackage.Registry.INSTANCE.getEFactory(CanopusPerformanceExternalFilePackage.eNS_URI);
			if (theCanopusPerformanceExternalFileFactory != null) {
				return theCanopusPerformanceExternalFileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CanopusPerformanceExternalFileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanopusPerformanceExternalFileFactoryImpl() {
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
			case CanopusPerformanceExternalFilePackage.EXTERNAL_FILE: return createExternalFile();
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
	public ExternalFile createExternalFile() {
		ExternalFileImpl externalFile = new ExternalFileImpl();
		return externalFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CanopusPerformanceExternalFilePackage getCanopusPerformanceExternalFilePackage() {
		return (CanopusPerformanceExternalFilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CanopusPerformanceExternalFilePackage getPackage() {
		return CanopusPerformanceExternalFilePackage.eINSTANCE;
	}

} //CanopusPerformanceExternalFileFactoryImpl
