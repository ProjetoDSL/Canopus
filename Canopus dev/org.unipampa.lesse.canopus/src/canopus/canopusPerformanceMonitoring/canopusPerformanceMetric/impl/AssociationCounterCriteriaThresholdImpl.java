/**
 */
package canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.ASSOCIATION_CRITERIA;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.CanopusPerformanceMetricPackage;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Criteria;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Threshold;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Counter Criteria Threshold</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.AssociationCounterCriteriaThresholdImpl#getAssociationCriteria <em>Association Criteria</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.AssociationCounterCriteriaThresholdImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.impl.AssociationCounterCriteriaThresholdImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationCounterCriteriaThresholdImpl extends MinimalEObjectImpl.Container implements AssociationCounterCriteriaThreshold {
	/**
	 * The default value of the '{@link #getAssociationCriteria() <em>Association Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final ASSOCIATION_CRITERIA ASSOCIATION_CRITERIA_EDEFAULT = ASSOCIATION_CRITERIA.BETWEEN;

	/**
	 * The cached value of the '{@link #getAssociationCriteria() <em>Association Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationCriteria()
	 * @generated
	 * @ordered
	 */
	protected ASSOCIATION_CRITERIA associationCriteria = ASSOCIATION_CRITERIA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected Threshold threshold;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<Criteria> criteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationCounterCriteriaThresholdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanopusPerformanceMetricPackage.Literals.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASSOCIATION_CRITERIA getAssociationCriteria() {
		return associationCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociationCriteria(ASSOCIATION_CRITERIA newAssociationCriteria) {
		ASSOCIATION_CRITERIA oldAssociationCriteria = associationCriteria;
		associationCriteria = newAssociationCriteria == null ? ASSOCIATION_CRITERIA_EDEFAULT : newAssociationCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__ASSOCIATION_CRITERIA, oldAssociationCriteria, associationCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threshold getThreshold() {
		if (threshold != null && threshold.eIsProxy()) {
			InternalEObject oldThreshold = (InternalEObject)threshold;
			threshold = (Threshold)eResolveProxy(oldThreshold);
			if (threshold != oldThreshold) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__THRESHOLD, oldThreshold, threshold));
			}
		}
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threshold basicGetThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreshold(Threshold newThreshold) {
		Threshold oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Criteria> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectResolvingEList<Criteria>(Criteria.class, this, CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__CRITERIA);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__ASSOCIATION_CRITERIA:
				return getAssociationCriteria();
			case CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__THRESHOLD:
				if (resolve) return getThreshold();
				return basicGetThreshold();
			case CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__CRITERIA:
				return getCriteria();
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
			case CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__ASSOCIATION_CRITERIA:
				setAssociationCriteria((ASSOCIATION_CRITERIA)newValue);
				return;
			case CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__THRESHOLD:
				setThreshold((Threshold)newValue);
				return;
			case CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends Criteria>)newValue);
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
			case CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__ASSOCIATION_CRITERIA:
				setAssociationCriteria(ASSOCIATION_CRITERIA_EDEFAULT);
				return;
			case CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__THRESHOLD:
				setThreshold((Threshold)null);
				return;
			case CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__CRITERIA:
				getCriteria().clear();
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
			case CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__ASSOCIATION_CRITERIA:
				return associationCriteria != ASSOCIATION_CRITERIA_EDEFAULT;
			case CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__THRESHOLD:
				return threshold != null;
			case CanopusPerformanceMetricPackage.ASSOCIATION_COUNTER_CRITERIA_THRESHOLD__CRITERIA:
				return criteria != null && !criteria.isEmpty();
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
		result.append(" (associationCriteria: ");
		result.append(associationCriteria);
		result.append(')');
		return result.toString();
	}

} //AssociationCounterCriteriaThresholdImpl
