/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.spem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.spem.Spem2Package
 * @generated
 */
public interface Spem2Factory extends EFactory{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Spem2Factory eINSTANCE = new model.spem.impl.Spem2FactoryImpl();

	/**
	 * Returns a new object of class '<em>Work Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Product</em>'.
	 * @generated
	 */
	WorkProduct createWorkProduct();

	WorkProduct[] createWorkProduct(int p); // declaração adicionada - criacao do vetor

	/**
	 * Returns a new object of class '<em>Process Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Performer</em>'.
	 * @generated
	 */
	ProcessPerformer createProcessPerformer();

	/**
	 * Returns a new object of class '<em>Process Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Role</em>'.
	 * @generated
	 */
	ProcessRole createProcessRole();

	ProcessRole[] createProcessRole(int r); // 23/12/05 - criacao do vetor

	/**
	 * Returns a new object of class '<em>Action State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action State</em>'.
	 * @generated
	 */
	ActionState createActionState();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	Step[] createStep(int s); // 23/12/05 - criacao do vetor

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	Activity[] createActivity(int a); // 23/12/05 - criacao do vetor

	/**
	 * Returns a new object of class '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Definition</em>'.
	 * @generated
	 */
	WorkDefinition createWorkDefinition();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Spem2Package getSpem2Package();

} //Spem2Factory
