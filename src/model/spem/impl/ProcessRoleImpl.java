/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.spem.impl;

import java.util.Collection;

import model.spem.Activity;
import model.spem.ProcessRole;
import model.spem.Spem2Package;
import model.spem.WorkDefinition;
import model.spem.WorkProduct;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.spem.impl.ProcessRoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.spem.impl.ProcessRoleImpl#getWorkProducts <em>Work Products</em>}</li>
 *   <li>{@link model.spem.impl.ProcessRoleImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link model.spem.impl.ProcessRoleImpl#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessRoleImpl extends ProcessPerformerImpl implements ProcessRole {
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
	 * The cached value of the '{@link #getWorkProducts() <em>Work Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkProducts()
	 * @generated
	 * @ordered
	 */
	protected EList workProducts = null;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList activities = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Spem2Package.eINSTANCE.getProcessRole();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.PROCESS_ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWorkProducts() {
		if (workProducts == null) {
			workProducts = new EObjectWithInverseResolvingEList(WorkProduct.class, this, Spem2Package.PROCESS_ROLE__WORK_PRODUCTS, Spem2Package.WORK_PRODUCT__RESPONSIBLE_ROLES);
		}
		return workProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActivities() {
		if (activities == null) {
			activities = new EObjectWithInverseResolvingEList.ManyInverse(Activity.class, this, Spem2Package.PROCESS_ROLE__ACTIVITIES, Spem2Package.ACTIVITY__ASSISTANTS);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public model.spem.Process getProcess() {
		if (eContainerFeatureID != Spem2Package.PROCESS_ROLE__PROCESS) return null;
		return (model.spem.Process)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(model.spem.Process newProcess) {
		if (newProcess != eContainer || (eContainerFeatureID != Spem2Package.PROCESS_ROLE__PROCESS && newProcess != null)) {
			if (EcoreUtil.isAncestor(this, newProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, Spem2Package.PROCESS__PROCESS_ROLE, model.spem.Process.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newProcess, Spem2Package.PROCESS_ROLE__PROCESS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.PROCESS_ROLE__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Spem2Package.PROCESS_ROLE__WORK_PRODUCTS:
					return ((InternalEList)getWorkProducts()).basicAdd(otherEnd, msgs);
				case Spem2Package.PROCESS_ROLE__ACTIVITIES:
					return ((InternalEList)getActivities()).basicAdd(otherEnd, msgs);
				case Spem2Package.PROCESS_ROLE__PROCESS:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, Spem2Package.PROCESS_ROLE__PROCESS, msgs);
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
				case Spem2Package.PROCESS_ROLE__WORK:
					return basicSetWork(null, msgs);
				case Spem2Package.PROCESS_ROLE__WORK_PRODUCTS:
					return ((InternalEList)getWorkProducts()).basicRemove(otherEnd, msgs);
				case Spem2Package.PROCESS_ROLE__ACTIVITIES:
					return ((InternalEList)getActivities()).basicRemove(otherEnd, msgs);
				case Spem2Package.PROCESS_ROLE__PROCESS:
					return eBasicSetContainer(null, Spem2Package.PROCESS_ROLE__PROCESS, msgs);
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
				case Spem2Package.PROCESS_ROLE__PROCESS:
					return eContainer.eInverseRemove(this, Spem2Package.PROCESS__PROCESS_ROLE, model.spem.Process.class, msgs);
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
			case Spem2Package.PROCESS_ROLE__WORK:
				return getWork();
			case Spem2Package.PROCESS_ROLE__NAME:
				return getName();
			case Spem2Package.PROCESS_ROLE__WORK_PRODUCTS:
				return getWorkProducts();
			case Spem2Package.PROCESS_ROLE__ACTIVITIES:
				return getActivities();
			case Spem2Package.PROCESS_ROLE__PROCESS:
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
			case Spem2Package.PROCESS_ROLE__WORK:
				setWork((WorkDefinition)newValue);
				return;
			case Spem2Package.PROCESS_ROLE__NAME:
				setName((String)newValue);
				return;
			case Spem2Package.PROCESS_ROLE__WORK_PRODUCTS:
				getWorkProducts().clear();
				getWorkProducts().addAll((Collection)newValue);
				return;
			case Spem2Package.PROCESS_ROLE__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection)newValue);
				return;
			case Spem2Package.PROCESS_ROLE__PROCESS:
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
			case Spem2Package.PROCESS_ROLE__WORK:
				setWork((WorkDefinition)null);
				return;
			case Spem2Package.PROCESS_ROLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Spem2Package.PROCESS_ROLE__WORK_PRODUCTS:
				getWorkProducts().clear();
				return;
			case Spem2Package.PROCESS_ROLE__ACTIVITIES:
				getActivities().clear();
				return;
			case Spem2Package.PROCESS_ROLE__PROCESS:
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
			case Spem2Package.PROCESS_ROLE__WORK:
				return work != null;
			case Spem2Package.PROCESS_ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Spem2Package.PROCESS_ROLE__WORK_PRODUCTS:
				return workProducts != null && !workProducts.isEmpty();
			case Spem2Package.PROCESS_ROLE__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case Spem2Package.PROCESS_ROLE__PROCESS:
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
		result.append(')');
		return result.toString();
	}

} //ProcessRoleImpl
