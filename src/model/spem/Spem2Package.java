/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.spem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.spem.Spem2Factory
 * @model kind="package"
 * @generated
 */
public interface Spem2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model.spem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model.spem.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model.spem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Spem2Package eINSTANCE = model.spem.impl.Spem2PackageImpl.init();

	/**
	 * The meta object id for the '{@link model.spem.impl.WorkProductImpl <em>Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.spem.impl.WorkProductImpl
	 * @see model.spem.impl.Spem2PackageImpl#getWorkProduct()
	 * @generated
	 */
	int WORK_PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Deliverable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__IS_DELIVERABLE = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__KIND = 2;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__RESPONSIBLE = 3;

	/**
	 * The feature id for the '<em><b>Responsible Roles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__RESPONSIBLE_ROLES = 4;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__PROCESS = 5;

	/**
	 * The number of structural features of the the '<em>Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link model.spem.impl.ProcessPerformerImpl <em>Process Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.spem.impl.ProcessPerformerImpl
	 * @see model.spem.impl.Spem2PackageImpl#getProcessPerformer()
	 * @generated
	 */
	int PROCESS_PERFORMER = 1;

	/**
	 * The feature id for the '<em><b>Work</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER__WORK = 0;

	/**
	 * The number of structural features of the the '<em>Process Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERFORMER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.spem.impl.ProcessRoleImpl <em>Process Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.spem.impl.ProcessRoleImpl
	 * @see model.spem.impl.Spem2PackageImpl#getProcessRole()
	 * @generated
	 */
	int PROCESS_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Work</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ROLE__WORK = PROCESS_PERFORMER__WORK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ROLE__NAME = PROCESS_PERFORMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ROLE__WORK_PRODUCTS = PROCESS_PERFORMER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ROLE__ACTIVITIES = PROCESS_PERFORMER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ROLE__PROCESS = PROCESS_PERFORMER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Process Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ROLE_FEATURE_COUNT = PROCESS_PERFORMER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link model.spem.impl.ActionStateImpl <em>Action State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.spem.impl.ActionStateImpl
	 * @see model.spem.impl.Spem2PackageImpl#getActionState()
	 * @generated
	 */
	int ACTION_STATE = 3;

	/**
	 * The number of structural features of the the '<em>Action State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.spem.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.spem.impl.StepImpl
	 * @see model.spem.impl.Spem2PackageImpl#getStep()
	 * @generated
	 */
	int STEP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = ACTION_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ACTIVITIES = ACTION_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = ACTION_STATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link model.spem.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.spem.impl.WorkDefinitionImpl
	 * @see model.spem.impl.Spem2PackageImpl#getWorkDefinition()
	 * @generated
	 */
	int WORK_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION__PERFORMER = 0;

	/**
	 * The feature id for the '<em><b>Parent Work</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION__PARENT_WORK = 1;

	/**
	 * The number of structural features of the the '<em>Work Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.spem.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.spem.impl.ActivityImpl
	 * @see model.spem.impl.Spem2PackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PERFORMER = WORK_DEFINITION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Parent Work</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PARENT_WORK = WORK_DEFINITION__PARENT_WORK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = WORK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assistant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ASSISTANT = WORK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STEP = WORK_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STEPS = WORK_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assistants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ASSISTANTS = WORK_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROCESS = WORK_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = WORK_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link model.spem.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.spem.impl.ProcessImpl
	 * @see model.spem.impl.Spem2PackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Process Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Work Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__WORK_PRODUCT = 3;

	/**
	 * The number of structural features of the the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link model.spem.WorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product</em>'.
	 * @see model.spem.WorkProduct
	 * @generated
	 */
	EClass getWorkProduct();

	/**
	 * Returns the meta object for the attribute '{@link model.spem.WorkProduct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.spem.WorkProduct#getName()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EAttribute getWorkProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.spem.WorkProduct#getIsDeliverable <em>Is Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deliverable</em>'.
	 * @see model.spem.WorkProduct#getIsDeliverable()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EAttribute getWorkProduct_IsDeliverable();

	/**
	 * Returns the meta object for the attribute '{@link model.spem.WorkProduct#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see model.spem.WorkProduct#getKind()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EAttribute getWorkProduct_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link model.spem.WorkProduct#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responsible</em>'.
	 * @see model.spem.WorkProduct#getResponsible()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_Responsible();

	/**
	 * Returns the meta object for the reference '{@link model.spem.WorkProduct#getResponsibleRoles <em>Responsible Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible Roles</em>'.
	 * @see model.spem.WorkProduct#getResponsibleRoles()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_ResponsibleRoles();

	/**
	 * Returns the meta object for the container reference '{@link model.spem.WorkProduct#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Process</em>'.
	 * @see model.spem.WorkProduct#getProcess()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_Process();

	/**
	 * Returns the meta object for class '{@link model.spem.ProcessPerformer <em>Process Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Performer</em>'.
	 * @see model.spem.ProcessPerformer
	 * @generated
	 */
	EClass getProcessPerformer();

	/**
	 * Returns the meta object for the containment reference '{@link model.spem.ProcessPerformer#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Work</em>'.
	 * @see model.spem.ProcessPerformer#getWork()
	 * @see #getProcessPerformer()
	 * @generated
	 */
	EReference getProcessPerformer_Work();

	/**
	 * Returns the meta object for class '{@link model.spem.ProcessRole <em>Process Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Role</em>'.
	 * @see model.spem.ProcessRole
	 * @generated
	 */
	EClass getProcessRole();

	/**
	 * Returns the meta object for the attribute '{@link model.spem.ProcessRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.spem.ProcessRole#getName()
	 * @see #getProcessRole()
	 * @generated
	 */
	EAttribute getProcessRole_Name();

	/**
	 * Returns the meta object for the reference list '{@link model.spem.ProcessRole#getWorkProducts <em>Work Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Products</em>'.
	 * @see model.spem.ProcessRole#getWorkProducts()
	 * @see #getProcessRole()
	 * @generated
	 */
	EReference getProcessRole_WorkProducts();

	/**
	 * Returns the meta object for the reference list '{@link model.spem.ProcessRole#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see model.spem.ProcessRole#getActivities()
	 * @see #getProcessRole()
	 * @generated
	 */
	EReference getProcessRole_Activities();

	/**
	 * Returns the meta object for the container reference '{@link model.spem.ProcessRole#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Process</em>'.
	 * @see model.spem.ProcessRole#getProcess()
	 * @see #getProcessRole()
	 * @generated
	 */
	EReference getProcessRole_Process();

	/**
	 * Returns the meta object for class '{@link model.spem.ActionState <em>Action State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action State</em>'.
	 * @see model.spem.ActionState
	 * @generated
	 */
	EClass getActionState();

	/**
	 * Returns the meta object for class '{@link model.spem.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see model.spem.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link model.spem.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.spem.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the container reference '{@link model.spem.Step#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activities</em>'.
	 * @see model.spem.Step#getActivities()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Activities();

	/**
	 * Returns the meta object for class '{@link model.spem.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see model.spem.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link model.spem.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.spem.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the containment reference '{@link model.spem.Activity#getAssistant <em>Assistant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assistant</em>'.
	 * @see model.spem.Activity#getAssistant()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Assistant();

	/**
	 * Returns the meta object for the containment reference '{@link model.spem.Activity#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step</em>'.
	 * @see model.spem.Activity#getStep()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Step();

	/**
	 * Returns the meta object for the containment reference list '{@link model.spem.Activity#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see model.spem.Activity#getSteps()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Steps();

	/**
	 * Returns the meta object for the reference list '{@link model.spem.Activity#getAssistants <em>Assistants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assistants</em>'.
	 * @see model.spem.Activity#getAssistants()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Assistants();

	/**
	 * Returns the meta object for the container reference '{@link model.spem.Activity#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Process</em>'.
	 * @see model.spem.Activity#getProcess()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Process();

	/**
	 * Returns the meta object for class '{@link model.spem.WorkDefinition <em>Work Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Definition</em>'.
	 * @see model.spem.WorkDefinition
	 * @generated
	 */
	EClass getWorkDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link model.spem.WorkDefinition#getPerformer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performer</em>'.
	 * @see model.spem.WorkDefinition#getPerformer()
	 * @see #getWorkDefinition()
	 * @generated
	 */
	EReference getWorkDefinition_Performer();

	/**
	 * Returns the meta object for the containment reference '{@link model.spem.WorkDefinition#getParentWork <em>Parent Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Work</em>'.
	 * @see model.spem.WorkDefinition#getParentWork()
	 * @see #getWorkDefinition()
	 * @generated
	 */
	EReference getWorkDefinition_ParentWork();

	/**
	 * Returns the meta object for class '{@link model.spem.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see model.spem.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link model.spem.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.spem.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link model.spem.Process#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see model.spem.Process#getActivity()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link model.spem.Process#getProcessRole <em>Process Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Role</em>'.
	 * @see model.spem.Process#getProcessRole()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ProcessRole();

	/**
	 * Returns the meta object for the containment reference list '{@link model.spem.Process#getWorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Product</em>'.
	 * @see model.spem.Process#getWorkProduct()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_WorkProduct();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Spem2Factory getSpem2Factory();

} //Spem2Package
