/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.spem.impl;

import java.util.Collection;

import model.spem.Activity;
import model.spem.ProcessPerformer;
import model.spem.ProcessRole;
import model.spem.Spem2Package;
import model.spem.Step;
import model.spem.WorkDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.spem.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.spem.impl.ActivityImpl#getAssistant <em>Assistant</em>}</li>
 *   <li>{@link model.spem.impl.ActivityImpl#getStep <em>Step</em>}</li>
 *   <li>{@link model.spem.impl.ActivityImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link model.spem.impl.ActivityImpl#getAssistants <em>Assistants</em>}</li>
 *   <li>{@link model.spem.impl.ActivityImpl#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends WorkDefinitionImpl implements Activity {
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
	 * The cached value of the '{@link #getAssistant() <em>Assistant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssistant()
	 * @generated
	 * @ordered
	 */
	protected ProcessRole assistant = null;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected Step step = null;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList steps = null;

	/**
	 * The cached value of the '{@link #getAssistants() <em>Assistants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssistants()
	 * @generated
	 * @ordered
	 */
	protected EList assistants = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Spem2Package.eINSTANCE.getActivity();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRole getAssistant() {
		return assistant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssistant(ProcessRole newAssistant, NotificationChain msgs) {
		ProcessRole oldAssistant = assistant;
		assistant = newAssistant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Spem2Package.ACTIVITY__ASSISTANT, oldAssistant, newAssistant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssistant(ProcessRole newAssistant) {
		if (newAssistant != assistant) {
			NotificationChain msgs = null;
			if (assistant != null)
				msgs = ((InternalEObject)assistant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Spem2Package.ACTIVITY__ASSISTANT, null, msgs);
			if (newAssistant != null)
				msgs = ((InternalEObject)newAssistant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Spem2Package.ACTIVITY__ASSISTANT, null, msgs);
			msgs = basicSetAssistant(newAssistant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.ACTIVITY__ASSISTANT, newAssistant, newAssistant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(Step newStep, NotificationChain msgs) {
		Step oldStep = step;
		step = newStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Spem2Package.ACTIVITY__STEP, oldStep, newStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(Step newStep) {
		if (newStep != step) {
			NotificationChain msgs = null;
			if (step != null)
				msgs = ((InternalEObject)step).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Spem2Package.ACTIVITY__STEP, null, msgs);
			if (newStep != null)
				msgs = ((InternalEObject)newStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Spem2Package.ACTIVITY__STEP, null, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.ACTIVITY__STEP, newStep, newStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentWithInverseEList(Step.class, this, Spem2Package.ACTIVITY__STEPS, Spem2Package.STEP__ACTIVITIES);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssistants() {
		if (assistants == null) {
			assistants = new EObjectWithInverseResolvingEList.ManyInverse(ProcessRole.class, this, Spem2Package.ACTIVITY__ASSISTANTS, Spem2Package.PROCESS_ROLE__ACTIVITIES);
		}
		return assistants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public model.spem.Process getProcess() {
		if (eContainerFeatureID != Spem2Package.ACTIVITY__PROCESS) return null;
		return (model.spem.Process)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(model.spem.Process newProcess) {
		if (newProcess != eContainer || (eContainerFeatureID != Spem2Package.ACTIVITY__PROCESS && newProcess != null)) {
			if (EcoreUtil.isAncestor(this, newProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, Spem2Package.PROCESS__ACTIVITY, model.spem.Process.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newProcess, Spem2Package.ACTIVITY__PROCESS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Spem2Package.ACTIVITY__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Spem2Package.ACTIVITY__STEPS:
					return ((InternalEList)getSteps()).basicAdd(otherEnd, msgs);
				case Spem2Package.ACTIVITY__ASSISTANTS:
					return ((InternalEList)getAssistants()).basicAdd(otherEnd, msgs);
				case Spem2Package.ACTIVITY__PROCESS:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, Spem2Package.ACTIVITY__PROCESS, msgs);
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
				case Spem2Package.ACTIVITY__PERFORMER:
					return basicSetPerformer(null, msgs);
				case Spem2Package.ACTIVITY__PARENT_WORK:
					return basicSetParentWork(null, msgs);
				case Spem2Package.ACTIVITY__ASSISTANT:
					return basicSetAssistant(null, msgs);
				case Spem2Package.ACTIVITY__STEP:
					return basicSetStep(null, msgs);
				case Spem2Package.ACTIVITY__STEPS:
					return ((InternalEList)getSteps()).basicRemove(otherEnd, msgs);
				case Spem2Package.ACTIVITY__ASSISTANTS:
					return ((InternalEList)getAssistants()).basicRemove(otherEnd, msgs);
				case Spem2Package.ACTIVITY__PROCESS:
					return eBasicSetContainer(null, Spem2Package.ACTIVITY__PROCESS, msgs);
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
				case Spem2Package.ACTIVITY__PROCESS:
					return eContainer.eInverseRemove(this, Spem2Package.PROCESS__ACTIVITY, model.spem.Process.class, msgs);
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
			case Spem2Package.ACTIVITY__PERFORMER:
				return getPerformer();
			case Spem2Package.ACTIVITY__PARENT_WORK:
				return getParentWork();
			case Spem2Package.ACTIVITY__NAME:
				return getName();
			case Spem2Package.ACTIVITY__ASSISTANT:
				return getAssistant();
			case Spem2Package.ACTIVITY__STEP:
				return getStep();
			case Spem2Package.ACTIVITY__STEPS:
				return getSteps();
			case Spem2Package.ACTIVITY__ASSISTANTS:
				return getAssistants();
			case Spem2Package.ACTIVITY__PROCESS:
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
			case Spem2Package.ACTIVITY__PERFORMER:
				setPerformer((ProcessPerformer)newValue);
				return;
			case Spem2Package.ACTIVITY__PARENT_WORK:
				setParentWork((WorkDefinition)newValue);
				return;
			case Spem2Package.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case Spem2Package.ACTIVITY__ASSISTANT:
				setAssistant((ProcessRole)newValue);
				return;
			case Spem2Package.ACTIVITY__STEP:
				setStep((Step)newValue);
				return;
			case Spem2Package.ACTIVITY__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection)newValue);
				return;
			case Spem2Package.ACTIVITY__ASSISTANTS:
				getAssistants().clear();
				getAssistants().addAll((Collection)newValue);
				return;
			case Spem2Package.ACTIVITY__PROCESS:
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
			case Spem2Package.ACTIVITY__PERFORMER:
				setPerformer((ProcessPerformer)null);
				return;
			case Spem2Package.ACTIVITY__PARENT_WORK:
				setParentWork((WorkDefinition)null);
				return;
			case Spem2Package.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Spem2Package.ACTIVITY__ASSISTANT:
				setAssistant((ProcessRole)null);
				return;
			case Spem2Package.ACTIVITY__STEP:
				setStep((Step)null);
				return;
			case Spem2Package.ACTIVITY__STEPS:
				getSteps().clear();
				return;
			case Spem2Package.ACTIVITY__ASSISTANTS:
				getAssistants().clear();
				return;
			case Spem2Package.ACTIVITY__PROCESS:
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
			case Spem2Package.ACTIVITY__PERFORMER:
				return performer != null;
			case Spem2Package.ACTIVITY__PARENT_WORK:
				return parentWork != null;
			case Spem2Package.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Spem2Package.ACTIVITY__ASSISTANT:
				return assistant != null;
			case Spem2Package.ACTIVITY__STEP:
				return step != null;
			case Spem2Package.ACTIVITY__STEPS:
				return steps != null && !steps.isEmpty();
			case Spem2Package.ACTIVITY__ASSISTANTS:
				return assistants != null && !assistants.isEmpty();
			case Spem2Package.ACTIVITY__PROCESS:
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

} //ActivityImpl
