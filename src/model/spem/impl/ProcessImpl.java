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
import model.spem.WorkProduct;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.spem.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.spem.impl.ProcessImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link model.spem.impl.ProcessImpl#getProcessRole <em>Process Role</em>}</li>
 *   <li>{@link model.spem.impl.ProcessImpl#getWorkProduct <em>Work Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends EObjectImpl implements model.spem.Process {
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
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList activity = null;

	/**
	 * The cached value of the '{@link #getProcessRole() <em>Process Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessRole()
	 * @generated
	 * @ordered
	 */
	protected EList processRole = null;

	/**
	 * The cached value of the '{@link #getWorkProduct() <em>Work Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected EList workProduct = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Spem2Package.eINSTANCE.getProcess();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentWithInverseEList(Activity.class, this, Spem2Package.PROCESS__ACTIVITY, Spem2Package.ACTIVITY__PROCESS);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcessRole() {
		if (processRole == null) {
			processRole = new EObjectContainmentWithInverseEList(ProcessRole.class, this, Spem2Package.PROCESS__PROCESS_ROLE, Spem2Package.PROCESS_ROLE__PROCESS);
		}
		return processRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWorkProduct() {
		if (workProduct == null) {
			workProduct = new EObjectContainmentWithInverseEList(WorkProduct.class, this, Spem2Package.PROCESS__WORK_PRODUCT, Spem2Package.WORK_PRODUCT__PROCESS);
		}
		return workProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Spem2Package.PROCESS__ACTIVITY:
					return ((InternalEList)getActivity()).basicAdd(otherEnd, msgs);
				case Spem2Package.PROCESS__PROCESS_ROLE:
					return ((InternalEList)getProcessRole()).basicAdd(otherEnd, msgs);
				case Spem2Package.PROCESS__WORK_PRODUCT:
					return ((InternalEList)getWorkProduct()).basicAdd(otherEnd, msgs);
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
				case Spem2Package.PROCESS__ACTIVITY:
					return ((InternalEList)getActivity()).basicRemove(otherEnd, msgs);
				case Spem2Package.PROCESS__PROCESS_ROLE:
					return ((InternalEList)getProcessRole()).basicRemove(otherEnd, msgs);
				case Spem2Package.PROCESS__WORK_PRODUCT:
					return ((InternalEList)getWorkProduct()).basicRemove(otherEnd, msgs);
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
			case Spem2Package.PROCESS__NAME:
				return getName();
			case Spem2Package.PROCESS__ACTIVITY:
				return getActivity();
			case Spem2Package.PROCESS__PROCESS_ROLE:
				return getProcessRole();
			case Spem2Package.PROCESS__WORK_PRODUCT:
				return getWorkProduct();
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
			case Spem2Package.PROCESS__NAME:
				setName((String)newValue);
				return;
			case Spem2Package.PROCESS__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection)newValue);
				return;
			case Spem2Package.PROCESS__PROCESS_ROLE:
				getProcessRole().clear();
				getProcessRole().addAll((Collection)newValue);
				return;
			case Spem2Package.PROCESS__WORK_PRODUCT:
				getWorkProduct().clear();
				getWorkProduct().addAll((Collection)newValue);
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
			case Spem2Package.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Spem2Package.PROCESS__ACTIVITY:
				getActivity().clear();
				return;
			case Spem2Package.PROCESS__PROCESS_ROLE:
				getProcessRole().clear();
				return;
			case Spem2Package.PROCESS__WORK_PRODUCT:
				getWorkProduct().clear();
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
			case Spem2Package.PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Spem2Package.PROCESS__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case Spem2Package.PROCESS__PROCESS_ROLE:
				return processRole != null && !processRole.isEmpty();
			case Spem2Package.PROCESS__WORK_PRODUCT:
				return workProduct != null && !workProduct.isEmpty();
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

} //ProcessImpl
