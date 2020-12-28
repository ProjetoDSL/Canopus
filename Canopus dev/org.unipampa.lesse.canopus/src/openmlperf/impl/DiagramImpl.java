/**
 */
package openmlperf.impl;

import openmlperf.Diagram;
import openmlperf.OpenmlperfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.impl.DiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link openmlperf.impl.DiagramImpl#getProjectLabel <em>Project Label</em>}</li>
 *   <li>{@link openmlperf.impl.DiagramImpl#getProjectAuthor <em>Project Author</em>}</li>
 *   <li>{@link openmlperf.impl.DiagramImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramImpl extends MinimalEObjectImpl.Container implements Diagram {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectLabel() <em>Project Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectLabel() <em>Project Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectLabel()
	 * @generated
	 * @ordered
	 */
	protected String projectLabel = PROJECT_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectAuthor() <em>Project Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectAuthor() <em>Project Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectAuthor()
	 * @generated
	 * @ordered
	 */
	protected String projectAuthor = PROJECT_AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenmlperfPackage.Literals.DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPackage.DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectLabel() {
		return projectLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectLabel(String newProjectLabel) {
		String oldProjectLabel = projectLabel;
		projectLabel = newProjectLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPackage.DIAGRAM__PROJECT_LABEL, oldProjectLabel, projectLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectAuthor() {
		return projectAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectAuthor(String newProjectAuthor) {
		String oldProjectAuthor = projectAuthor;
		projectAuthor = newProjectAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPackage.DIAGRAM__PROJECT_AUTHOR, oldProjectAuthor, projectAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPackage.DIAGRAM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenmlperfPackage.DIAGRAM__NAME:
				return getName();
			case OpenmlperfPackage.DIAGRAM__PROJECT_LABEL:
				return getProjectLabel();
			case OpenmlperfPackage.DIAGRAM__PROJECT_AUTHOR:
				return getProjectAuthor();
			case OpenmlperfPackage.DIAGRAM__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenmlperfPackage.DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case OpenmlperfPackage.DIAGRAM__PROJECT_LABEL:
				setProjectLabel((String)newValue);
				return;
			case OpenmlperfPackage.DIAGRAM__PROJECT_AUTHOR:
				setProjectAuthor((String)newValue);
				return;
			case OpenmlperfPackage.DIAGRAM__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpenmlperfPackage.DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenmlperfPackage.DIAGRAM__PROJECT_LABEL:
				setProjectLabel(PROJECT_LABEL_EDEFAULT);
				return;
			case OpenmlperfPackage.DIAGRAM__PROJECT_AUTHOR:
				setProjectAuthor(PROJECT_AUTHOR_EDEFAULT);
				return;
			case OpenmlperfPackage.DIAGRAM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpenmlperfPackage.DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenmlperfPackage.DIAGRAM__PROJECT_LABEL:
				return PROJECT_LABEL_EDEFAULT == null ? projectLabel != null : !PROJECT_LABEL_EDEFAULT.equals(projectLabel);
			case OpenmlperfPackage.DIAGRAM__PROJECT_AUTHOR:
				return PROJECT_AUTHOR_EDEFAULT == null ? projectAuthor != null : !PROJECT_AUTHOR_EDEFAULT.equals(projectAuthor);
			case OpenmlperfPackage.DIAGRAM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", projectLabel: ");
		result.append(projectLabel);
		result.append(", projectAuthor: ");
		result.append(projectAuthor);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DiagramImpl
