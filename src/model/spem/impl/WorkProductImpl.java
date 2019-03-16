/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.spem.impl;

import model.spem.ProcessRole;
import model.spem.Spem2Package;
import model.spem.WorkProduct;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.spem.impl.WorkProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.spem.impl.WorkProductImpl#getIsDeliverable <em>Is Deliverable</em>}</li>
 *   <li>{@link model.spem.impl.WorkProductImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link model.spem.impl.WorkProductImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link model.spem.impl.WorkProductImpl#getResponsibleRoles <em>Responsible Roles</em>}</li>
 *   <li>{@link model.spem.impl.WorkProductImpl#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkProductImpl extends EObjectImpl implements WorkProduct {
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
	 * The default value of the '{@link #getIsDeliverable() <em>Is Deliverable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeliverable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DELIVERABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDeliverable() <em>Is Deliverable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeliverable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDeliverable = IS_DELIVERABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected ProcessRole responsible = null;

	/**
	 * The cached value of the '{@link #getResponsibleRoles() <em>Responsible Roles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleRoles()
	 * @generated
	 * @ordered
	 */
	protected ProcessRole responsibleRoles = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Spem2Package.eINSTANCE.getWorkProduct();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.WORK_PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDeliverable() {
		return isDeliverable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeliverable(Boolean newIsDeliverable) {
		Boolean oldIsDeliverable = isDeliverable;
		isDeliverable = newIsDeliverable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.WORK_PRODUCT__IS_DELIVERABLE, oldIsDeliverable, isDeliverable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.WORK_PRODUCT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRole getResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsible(ProcessRole newResponsible, NotificationChain msgs) {
		ProcessRole oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Spem2Package.WORK_PRODUCT__RESPONSIBLE, oldResponsible, newResponsible);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsible(ProcessRole newResponsible) {
		if (newResponsible != responsible) {
			NotificationChain msgs = null;
			if (responsible != null)
				msgs = ((InternalEObject)responsible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Spem2Package.WORK_PRODUCT__RESPONSIBLE, null, msgs);
			if (newResponsible != null)
				msgs = ((InternalEObject)newResponsible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Spem2Package.WORK_PRODUCT__RESPONSIBLE, null, msgs);
			msgs = basicSetResponsible(newResponsible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.WORK_PRODUCT__RESPONSIBLE, newResponsible, newResponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRole getResponsibleRoles() {
		if (responsibleRoles != null && responsibleRoles.eIsProxy()) {
			ProcessRole oldResponsibleRoles = responsibleRoles;
			responsibleRoles = (ProcessRole)eResolveProxy((InternalEObject)responsibleRoles);
			if (responsibleRoles != oldResponsibleRoles) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Spem2Package.WORK_PRODUCT__RESPONSIBLE_ROLES, oldResponsibleRoles, responsibleRoles));
			}
		}
		return responsibleRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRole basicGetResponsibleRoles() {
		return responsibleRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibleRoles(ProcessRole newResponsibleRoles, NotificationChain msgs) {
		ProcessRole oldResponsibleRoles = responsibleRoles;
		responsibleRoles = newResponsibleRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Spem2Package.WORK_PRODUCT__RESPONSIBLE_ROLES, oldResponsibleRoles, newResponsibleRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleRoles(ProcessRole newResponsibleRoles) {
		if (newResponsibleRoles != responsibleRoles) {
			NotificationChain msgs = null;
			if (responsibleRoles != null)
				msgs = ((InternalEObject)responsibleRoles).eInverseRemove(this, Spem2Package.PROCESS_ROLE__WORK_PRODUCTS, ProcessRole.class, msgs);
			if (newResponsibleRoles != null)
				msgs = ((InternalEObject)newResponsibleRoles).eInverseAdd(this, Spem2Package.PROCESS_ROLE__WORK_PRODUCTS, ProcessRole.class, msgs);
			msgs = basicSetResponsibleRoles(newResponsibleRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.WORK_PRODUCT__RESPONSIBLE_ROLES, newResponsibleRoles, newResponsibleRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public model.spem.Process getProcess() {
		if (eContainerFeatureID != Spem2Package.WORK_PRODUCT__PROCESS) return null;
		return (model.spem.Process)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(model.spem.Process newProcess) {
		if (newProcess != eContainer || (eContainerFeatureID != Spem2Package.WORK_PRODUCT__PROCESS && newProcess != null)) {
			if (EcoreUtil.isAncestor(this, newProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, Spem2Package.PROCESS__WORK_PRODUCT, model.spem.Process.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newProcess, Spem2Package.WORK_PRODUCT__PROCESS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.WORK_PRODUCT__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Spem2Package.WORK_PRODUCT__RESPONSIBLE_ROLES:
					if (responsibleRoles != null)
						msgs = ((InternalEObject)responsibleRoles).eInverseRemove(this, Spem2Package.PROCESS_ROLE__WORK_PRODUCTS, ProcessRole.class, msgs);
					return basicSetResponsibleRoles((ProcessRole)otherEnd, msgs);
				case Spem2Package.WORK_PRODUCT__PROCESS:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, Spem2Package.WORK_PRODUCT__PROCESS, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Spem2Package.WORK_PRODUCT__RESPONSIBLE:
					return basicSetResponsible(null, msgs);
				case Spem2Package.WORK_PRODUCT__RESPONSIBLE_ROLES:
					return basicSetResponsibleRoles(null, msgs);
				case Spem2Package.WORK_PRODUCT__PROCESS:
					return eBasicSetContainer(null, Spem2Package.WORK_PRODUCT__PROCESS, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case Spem2Package.WORK_PRODUCT__PROCESS:
					return eContainer.eInverseRemove(this, Spem2Package.PROCESS__WORK_PRODUCT, model.spem.Process.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case Spem2Package.WORK_PRODUCT__NAME:
				return getName();
			case Spem2Package.WORK_PRODUCT__IS_DELIVERABLE:
				return getIsDeliverable();
			case Spem2Package.WORK_PRODUCT__KIND:
				return getKind();
			case Spem2Package.WORK_PRODUCT__RESPONSIBLE:
				return getResponsible();
			case Spem2Package.WORK_PRODUCT__RESPONSIBLE_ROLES:
				if (resolve) return getResponsibleRoles();
				return basicGetResponsibleRoles();
			case Spem2Package.WORK_PRODUCT__PROCESS:
				return getProcess();
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
			case Spem2Package.WORK_PRODUCT__NAME:
				setName((String)newValue);
				return;
			case Spem2Package.WORK_PRODUCT__IS_DELIVERABLE:
				setIsDeliverable((Boolean)newValue);
				return;
			case Spem2Package.WORK_PRODUCT__KIND:
				setKind((String)newValue);
				return;
			case Spem2Package.WORK_PRODUCT__RESPONSIBLE:
				setResponsible((ProcessRole)newValue);
				return;
			case Spem2Package.WORK_PRODUCT__RESPONSIBLE_ROLES:
				setResponsibleRoles((ProcessRole)newValue);
				return;
			case Spem2Package.WORK_PRODUCT__PROCESS:
				setProcess((model.spem.Process)newValue);
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
			case Spem2Package.WORK_PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Spem2Package.WORK_PRODUCT__IS_DELIVERABLE:
				setIsDeliverable(IS_DELIVERABLE_EDEFAULT);
				return;
			case Spem2Package.WORK_PRODUCT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case Spem2Package.WORK_PRODUCT__RESPONSIBLE:
				setResponsible((ProcessRole)null);
				return;
			case Spem2Package.WORK_PRODUCT__RESPONSIBLE_ROLES:
				setResponsibleRoles((ProcessRole)null);
				return;
			case Spem2Package.WORK_PRODUCT__PROCESS:
				setProcess((model.spem.Process)null);
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
			case Spem2Package.WORK_PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Spem2Package.WORK_PRODUCT__IS_DELIVERABLE:
				return IS_DELIVERABLE_EDEFAULT == null ? isDeliverable != null : !IS_DELIVERABLE_EDEFAULT.equals(isDeliverable);
			case Spem2Package.WORK_PRODUCT__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case Spem2Package.WORK_PRODUCT__RESPONSIBLE:
				return responsible != null;
			case Spem2Package.WORK_PRODUCT__RESPONSIBLE_ROLES:
				return responsibleRoles != null;
			case Spem2Package.WORK_PRODUCT__PROCESS:
				return getProcess() != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isDeliverable: ");
		result.append(isDeliverable);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //WorkProductImpl
