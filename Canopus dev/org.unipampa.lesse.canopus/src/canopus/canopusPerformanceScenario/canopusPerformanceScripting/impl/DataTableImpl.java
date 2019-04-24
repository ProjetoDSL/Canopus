/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ColumnsHiddenObject;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.DataTableImpl#getAttachedFile <em>Attached File</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.DataTableImpl#getDelimeter <em>Delimeter</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.DataTableImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.DataTableImpl#getColumnshiddenobject <em>Columnshiddenobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTableImpl extends MinimalEObjectImpl.Container implements DataTable {
	/**
	 * The default value of the '{@link #getAttachedFile() <em>Attached File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedFile()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHED_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachedFile() <em>Attached File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedFile()
	 * @generated
	 * @ordered
	 */
	protected String attachedFile = ATTACHED_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelimeter() <em>Delimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimeter()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelimeter() <em>Delimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimeter()
	 * @generated
	 * @ordered
	 */
	protected String delimeter = DELIMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * The cached value of the '{@link #getColumnshiddenobject() <em>Columnshiddenobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnshiddenobject()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnsHiddenObject> columnshiddenobject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceScriptingPackage.Literals.DATA_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttachedFile() {
		return attachedFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachedFile(String newAttachedFile) {
		String oldAttachedFile = attachedFile;
		attachedFile = newAttachedFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHED_FILE, oldAttachedFile, attachedFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelimeter() {
		return delimeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelimeter(String newDelimeter) {
		String oldDelimeter = delimeter;
		delimeter = newDelimeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.DATA_TABLE__DELIMETER, oldDelimeter, delimeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectResolvingEList<Activity>(Activity.class, this, CanopusPerformanceScriptingPackage.DATA_TABLE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ColumnsHiddenObject> getColumnshiddenobject() {
		if (columnshiddenobject == null) {
			columnshiddenobject = new EObjectContainmentEList<ColumnsHiddenObject>(ColumnsHiddenObject.class, this, CanopusPerformanceScriptingPackage.DATA_TABLE__COLUMNSHIDDENOBJECT);
		}
		return columnshiddenobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.DATA_TABLE__COLUMNSHIDDENOBJECT:
				return ((InternalEList<?>)getColumnshiddenobject()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHED_FILE:
				return getAttachedFile();
			case CanopusPerformanceScriptingPackage.DATA_TABLE__DELIMETER:
				return getDelimeter();
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				return getActivity();
			case CanopusPerformanceScriptingPackage.DATA_TABLE__COLUMNSHIDDENOBJECT:
				return getColumnshiddenobject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHED_FILE:
				setAttachedFile((String)newValue);
				return;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__DELIMETER:
				setDelimeter((String)newValue);
				return;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__COLUMNSHIDDENOBJECT:
				getColumnshiddenobject().clear();
				getColumnshiddenobject().addAll((Collection<? extends ColumnsHiddenObject>)newValue);
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
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHED_FILE:
				setAttachedFile(ATTACHED_FILE_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__DELIMETER:
				setDelimeter(DELIMETER_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				getActivity().clear();
				return;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__COLUMNSHIDDENOBJECT:
				getColumnshiddenobject().clear();
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
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHED_FILE:
				return ATTACHED_FILE_EDEFAULT == null ? attachedFile != null : !ATTACHED_FILE_EDEFAULT.equals(attachedFile);
			case CanopusPerformanceScriptingPackage.DATA_TABLE__DELIMETER:
				return DELIMETER_EDEFAULT == null ? delimeter != null : !DELIMETER_EDEFAULT.equals(delimeter);
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case CanopusPerformanceScriptingPackage.DATA_TABLE__COLUMNSHIDDENOBJECT:
				return columnshiddenobject != null && !columnshiddenobject.isEmpty();
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
		result.append(" (attachedFile: ");
		result.append(attachedFile);
		result.append(", delimeter: ");
		result.append(delimeter);
		result.append(')');
		return result.toString();
	}

} //DataTableImpl
