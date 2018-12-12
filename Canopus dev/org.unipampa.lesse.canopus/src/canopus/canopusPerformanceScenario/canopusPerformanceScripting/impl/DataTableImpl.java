/**
 */
package canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.CanopusPerformanceScriptingPackage;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.DataTable;
import canopus.canopusPerformanceScenario.canopusPerformanceScripting.ParameterHiddenObject;

import canopus.canopusPerformanceScenario.canopusPerformanceScripting.canopusPerformanceExternalFile.ExternalFile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.DataTableImpl#getDelimeter <em>Delimeter</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.DataTableImpl#getParameterhiddenobject <em>Parameterhiddenobject</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.DataTableImpl#getAttachedfile <em>Attachedfile</em>}</li>
 *   <li>{@link canopus.canopusPerformanceScenario.canopusPerformanceScripting.impl.DataTableImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTableImpl extends MinimalEObjectImpl.Container implements DataTable {
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
	 * The cached value of the '{@link #getParameterhiddenobject() <em>Parameterhiddenobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterhiddenobject()
	 * @generated
	 * @ordered
	 */
	protected ParameterHiddenObject parameterhiddenobject;

	/**
	 * The cached value of the '{@link #getAttachedfile() <em>Attachedfile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedfile()
	 * @generated
	 * @ordered
	 */
	protected ExternalFile attachedfile;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

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
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.DATA_TABLE__DELIMETER, oldDelimeter, delimeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterHiddenObject getParameterhiddenobject() {
		if (parameterhiddenobject != null && parameterhiddenobject.eIsProxy()) {
			InternalEObject oldParameterhiddenobject = (InternalEObject)parameterhiddenobject;
			parameterhiddenobject = (ParameterHiddenObject)eResolveProxy(oldParameterhiddenobject);
			if (parameterhiddenobject != oldParameterhiddenobject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScriptingPackage.DATA_TABLE__PARAMETERHIDDENOBJECT, oldParameterhiddenobject, parameterhiddenobject));
			}
		}
		return parameterhiddenobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterHiddenObject basicGetParameterhiddenobject() {
		return parameterhiddenobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterhiddenobject(ParameterHiddenObject newParameterhiddenobject) {
		ParameterHiddenObject oldParameterhiddenobject = parameterhiddenobject;
		parameterhiddenobject = newParameterhiddenobject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.DATA_TABLE__PARAMETERHIDDENOBJECT, oldParameterhiddenobject, parameterhiddenobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFile getAttachedfile() {
		return attachedfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachedfile(ExternalFile newAttachedfile, NotificationChain msgs) {
		ExternalFile oldAttachedfile = attachedfile;
		attachedfile = newAttachedfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHEDFILE, oldAttachedfile, newAttachedfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachedfile(ExternalFile newAttachedfile) {
		if (newAttachedfile != attachedfile) {
			NotificationChain msgs = null;
			if (attachedfile != null)
				msgs = ((InternalEObject)attachedfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHEDFILE, null, msgs);
			if (newAttachedfile != null)
				msgs = ((InternalEObject)newAttachedfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHEDFILE, null, msgs);
			msgs = basicSetAttachedfile(newAttachedfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHEDFILE, newAttachedfile, newAttachedfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (Activity)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceScriptingPackage.DATA_TABLE__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceScriptingPackage.DATA_TABLE__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHEDFILE:
				return basicSetAttachedfile(null, msgs);
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
			case CanopusPerformanceScriptingPackage.DATA_TABLE__DELIMETER:
				return getDelimeter();
			case CanopusPerformanceScriptingPackage.DATA_TABLE__PARAMETERHIDDENOBJECT:
				if (resolve) return getParameterhiddenobject();
				return basicGetParameterhiddenobject();
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHEDFILE:
				return getAttachedfile();
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
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
			case CanopusPerformanceScriptingPackage.DATA_TABLE__DELIMETER:
				setDelimeter((String)newValue);
				return;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__PARAMETERHIDDENOBJECT:
				setParameterhiddenobject((ParameterHiddenObject)newValue);
				return;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHEDFILE:
				setAttachedfile((ExternalFile)newValue);
				return;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				setActivity((Activity)newValue);
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
			case CanopusPerformanceScriptingPackage.DATA_TABLE__DELIMETER:
				setDelimeter(DELIMETER_EDEFAULT);
				return;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__PARAMETERHIDDENOBJECT:
				setParameterhiddenobject((ParameterHiddenObject)null);
				return;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHEDFILE:
				setAttachedfile((ExternalFile)null);
				return;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				setActivity((Activity)null);
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
			case CanopusPerformanceScriptingPackage.DATA_TABLE__DELIMETER:
				return DELIMETER_EDEFAULT == null ? delimeter != null : !DELIMETER_EDEFAULT.equals(delimeter);
			case CanopusPerformanceScriptingPackage.DATA_TABLE__PARAMETERHIDDENOBJECT:
				return parameterhiddenobject != null;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ATTACHEDFILE:
				return attachedfile != null;
			case CanopusPerformanceScriptingPackage.DATA_TABLE__ACTIVITY:
				return activity != null;
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
		result.append(" (delimeter: ");
		result.append(delimeter);
		result.append(')');
		return result.toString();
	}

} //DataTableImpl
