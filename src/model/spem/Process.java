/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.spem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.spem.Process#getName <em>Name</em>}</li>
 *   <li>{@link model.spem.Process#getActivity <em>Activity</em>}</li>
 *   <li>{@link model.spem.Process#getProcessRole <em>Process Role</em>}</li>
 *   <li>{@link model.spem.Process#getWorkProduct <em>Work Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.spem.Spem2Package#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.spem.Spem2Package#getProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.spem.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link model.spem.Activity}.
	 * It is bidirectional and its opposite is '{@link model.spem.Activity#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see model.spem.Spem2Package#getProcess_Activity()
	 * @see model.spem.Activity#getProcess
	 * @model type="model.spem.Activity" opposite="Process" containment="true" required="true"
	 * @generated
	 */
	EList getActivity();

	/**
	 * Returns the value of the '<em><b>Process Role</b></em>' containment reference list.
	 * The list contents are of type {@link model.spem.ProcessRole}.
	 * It is bidirectional and its opposite is '{@link model.spem.ProcessRole#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Role</em>' containment reference list.
	 * @see model.spem.Spem2Package#getProcess_ProcessRole()
	 * @see model.spem.ProcessRole#getProcess
	 * @model type="model.spem.ProcessRole" opposite="Process" containment="true" required="true"
	 * @generated
	 */
	EList getProcessRole();

	/**
	 * Returns the value of the '<em><b>Work Product</b></em>' containment reference list.
	 * The list contents are of type {@link model.spem.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link model.spem.WorkProduct#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Product</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Product</em>' containment reference list.
	 * @see model.spem.Spem2Package#getProcess_WorkProduct()
	 * @see model.spem.WorkProduct#getProcess
	 * @model type="model.spem.WorkProduct" opposite="Process" containment="true" required="true"
	 * @generated
	 */
	EList getWorkProduct();

} // Process
