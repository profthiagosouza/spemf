/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.spem.impl;

import model.spem.ProcessPerformer;
import model.spem.Spem2Package;
import model.spem.WorkDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Performer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.spem.impl.ProcessPerformerImpl#getWork <em>Work</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessPerformerImpl extends EObjectImpl implements ProcessPerformer {
	/**
	 * The cached value of the '{@link #getWork() <em>Work</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition work = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessPerformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Spem2Package.eINSTANCE.getProcessPerformer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition getWork() {
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWork(WorkDefinition newWork, NotificationChain msgs) {
		WorkDefinition oldWork = work;
		work = newWork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Spem2Package.PROCESS_PERFORMER__WORK, oldWork, newWork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWork(WorkDefinition newWork) {
		if (newWork != work) {
			NotificationChain msgs = null;
			if (work != null)
				msgs = ((InternalEObject)work).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Spem2Package.PROCESS_PERFORMER__WORK, null, msgs);
			if (newWork != null)
				msgs = ((InternalEObject)newWork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Spem2Package.PROCESS_PERFORMER__WORK, null, msgs);
			msgs = basicSetWork(newWork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.PROCESS_PERFORMER__WORK, newWork, newWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Spem2Package.PROCESS_PERFORMER__WORK:
					return basicSetWork(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Spem2Package.PROCESS_PERFORMER__WORK:
				return getWork();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Spem2Package.PROCESS_PERFORMER__WORK:
				setWork((WorkDefinition)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Spem2Package.PROCESS_PERFORMER__WORK:
				setWork((WorkDefinition)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Spem2Package.PROCESS_PERFORMER__WORK:
				return work != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ProcessPerformerImpl
