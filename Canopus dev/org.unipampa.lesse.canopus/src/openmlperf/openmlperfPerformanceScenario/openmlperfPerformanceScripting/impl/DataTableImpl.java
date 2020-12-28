/**
 */
package openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl;

import java.util.Collection;

import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.OpenmlperfPerformanceScriptingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.DataTableImpl#getAttachedFile <em>Attached File</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.DataTableImpl#getDelimeter <em>Delimeter</em>}</li>
 *   <li>{@link openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.impl.DataTableImpl#getActivity <em>Activity</em>}</li>
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
		return OpenmlperfPerformanceScriptingPackage.Literals.DATA_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttachedFile() {
		return attachedFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachedFile(String newAttachedFile) {
		String oldAttachedFile = attachedFile;
		attachedFile = newAttachedFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ATTACHED_FILE, oldAttachedFile, attachedFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelimeter() {
		return delimeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelimeter(String newDelimeter) {
		String oldDelimeter = delimeter;
		delimeter = newDelimeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenmlperfPerformanceScriptingPackage.DATA_TABLE__DELIMETER, oldDelimeter, delimeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectWithInverseResolvingEList<Activity>(Activity.class, this, OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ACTIVITY, OpenmlperfPerformanceScriptingPackage.ACTIVITY__DATATABLE);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivity()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
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
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ATTACHED_FILE:
				return getAttachedFile();
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__DELIMETER:
				return getDelimeter();
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				return getActivity();
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
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ATTACHED_FILE:
				setAttachedFile((String)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__DELIMETER:
				setDelimeter((String)newValue);
				return;
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
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
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ATTACHED_FILE:
				setAttachedFile(ATTACHED_FILE_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__DELIMETER:
				setDelimeter(DELIMETER_EDEFAULT);
				return;
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				getActivity().clear();
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
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ATTACHED_FILE:
				return ATTACHED_FILE_EDEFAULT == null ? attachedFile != null : !ATTACHED_FILE_EDEFAULT.equals(attachedFile);
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__DELIMETER:
				return DELIMETER_EDEFAULT == null ? delimeter != null : !DELIMETER_EDEFAULT.equals(delimeter);
			case OpenmlperfPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				return activity != null && !activity.isEmpty();
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
