/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.spem.impl;

import model.spem.ActionState;
import model.spem.Activity;
import model.spem.ProcessPerformer;
import model.spem.ProcessRole;
import model.spem.Spem2Factory;
import model.spem.Spem2Package;
import model.spem.Step;
import model.spem.WorkDefinition;
import model.spem.WorkProduct;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Spem2FactoryImpl extends EFactoryImpl implements Spem2Factory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spem2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Spem2Package.WORK_PRODUCT: return createWorkProduct();
			case Spem2Package.PROCESS_PERFORMER: return createProcessPerformer();
			case Spem2Package.PROCESS_ROLE: return createProcessRole();
			case Spem2Package.ACTION_STATE: return createActionState();
			case Spem2Package.STEP: return createStep();
			case Spem2Package.ACTIVITY: return createActivity();
			case Spem2Package.WORK_DEFINITION: return createWorkDefinition();
			case Spem2Package.PROCESS: return createProcess();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct createWorkProduct() {
		WorkProductImpl workProduct = new WorkProductImpl();
		return workProduct;
	}

	// 23/12/05 - implementação do vetor
	public WorkProduct[] createWorkProduct(int p) {
		WorkProductImpl aWorkProducts[] = new WorkProductImpl[p];
		return aWorkProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPerformer createProcessPerformer() {
		ProcessPerformerImpl processPerformer = new ProcessPerformerImpl();
		return processPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRole createProcessRole() {
		ProcessRoleImpl processRole = new ProcessRoleImpl();
		return processRole;
	}

	// 23/12/05 - implementação do vetor
	public ProcessRole[] createProcessRole(int r) {
		ProcessRoleImpl aRoles[] = new ProcessRoleImpl[r];
		return aRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionState createActionState() {
		ActionStateImpl actionState = new ActionStateImpl();
		return actionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	// 23/12/05 - implementação do vetor
	public Step[] createStep(int s) {
		StepImpl aSteps[] = new StepImpl[s];
		return aSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	// 23/12/05 - implementação do vetor
	public Activity[] createActivity(int a) {
		ActivityImpl aActivities[] = new ActivityImpl[a];
		return aActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition createWorkDefinition() {
		WorkDefinitionImpl workDefinition = new WorkDefinitionImpl();
		return workDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public model.spem.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spem2Package getSpem2Package() {
		return (Spem2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static Spem2Package getPackage() {
		return Spem2Package.eINSTANCE;
	}

} //Spem2FactoryImpl
