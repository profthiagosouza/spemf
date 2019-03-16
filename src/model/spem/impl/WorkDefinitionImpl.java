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
 * An implementation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.spem.impl.WorkDefinitionImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link model.spem.impl.WorkDefinitionImpl#getParentWork <em>Parent Work</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkDefinitionImpl extends EObjectImpl implements WorkDefinition {
	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected ProcessPerformer performer = null;

	/**
	 * The cached value of the '{@link #getParentWork() <em>Parent Work</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentWork()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition parentWork = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Spem2Package.eINSTANCE.getWorkDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPerformer getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(ProcessPerformer newPerformer, NotificationChain msgs) {
		ProcessPerformer oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Spem2Package.WORK_DEFINITION__PERFORMER, oldPerformer, newPerformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(ProcessPerformer newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Spem2Package.WORK_DEFINITION__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Spem2Package.WORK_DEFINITION__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.WORK_DEFINITION__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition getParentWork() {
		return parentWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentWork(WorkDefinition newParentWork, NotificationChain msgs) {
		WorkDefinition oldParentWork = parentWork;
		parentWork = newParentWork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Spem2Package.WORK_DEFINITION__PARENT_WORK, oldParentWork, newParentWork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentWork(WorkDefinition newParentWork) {
		if (newParentWork != parentWork) {
			NotificationChain msgs = null;
			if (parentWork != null)
				msgs = ((InternalEObject)parentWork).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Spem2Package.WORK_DEFINITION__PARENT_WORK, null, msgs);
			if (newParentWork != null)
				msgs = ((InternalEObject)newParentWork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Spem2Package.WORK_DEFINITION__PARENT_WORK, null, msgs);
			msgs = basicSetParentWork(newParentWork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.WORK_DEFINITION__PARENT_WORK, newParentWork, newParentWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Spem2Package.WORK_DEFINITION__PERFORMER:
					return basicSetPerformer(null, msgs);
				case Spem2Package.WORK_DEFINITION__PARENT_WORK:
					return basicSetParentWork(null, msgs);
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
			case Spem2Package.WORK_DEFINITION__PERFORMER:
				return getPerformer();
			case Spem2Package.WORK_DEFINITION__PARENT_WORK:
				return getParentWork();
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
			case Spem2Package.WORK_DEFINITION__PERFORMER:
				setPerformer((ProcessPerformer)newValue);
				return;
			case Spem2Package.WORK_DEFINITION__PARENT_WORK:
				setParentWork((WorkDefinition)newValue);
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
			case Spem2Package.WORK_DEFINITION__PERFORMER:
				setPerformer((ProcessPerformer)null);
				return;
			case Spem2Package.WORK_DEFINITION__PARENT_WORK:
				setParentWork((WorkDefinition)null);
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
			case Spem2Package.WORK_DEFINITION__PERFORMER:
				return performer != null;
			case Spem2Package.WORK_DEFINITION__PARENT_WORK:
				return parentWork != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //WorkDefinitionImpl
