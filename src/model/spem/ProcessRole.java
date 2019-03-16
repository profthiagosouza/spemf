/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.spem.ProcessRole#getName <em>Name</em>}</li>
 *   <li>{@link model.spem.ProcessRole#getWorkProducts <em>Work Products</em>}</li>
 *   <li>{@link model.spem.ProcessRole#getActivities <em>Activities</em>}</li>
 *   <li>{@link model.spem.ProcessRole#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.spem.Spem2Package#getProcessRole()
 * @model
 * @generated
 */
public interface ProcessRole extends ProcessPerformer {
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
	 * @see model.spem.Spem2Package#getProcessRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.spem.ProcessRole#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Work Products</b></em>' reference list.
	 * The list contents are of type {@link model.spem.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link model.spem.WorkProduct#getResponsibleRoles <em>Responsible Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Products</em>' reference list.
	 * @see model.spem.Spem2Package#getProcessRole_WorkProducts()
	 * @see model.spem.WorkProduct#getResponsibleRoles
	 * @model type="model.spem.WorkProduct" opposite="responsibleRoles"
	 * @generated
	 */
	EList getWorkProducts();

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link model.spem.Activity}.
	 * It is bidirectional and its opposite is '{@link model.spem.Activity#getAssistants <em>Assistants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see model.spem.Spem2Package#getProcessRole_Activities()
	 * @see model.spem.Activity#getAssistants
	 * @model type="model.spem.Activity" opposite="assistants"
	 * @generated
	 */
	EList getActivities();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.spem.Process#getProcessRole <em>Process Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' container reference.
	 * @see #setProcess(model.spem.Process)
	 * @see model.spem.Spem2Package#getProcessRole_Process()
	 * @see model.spem.Process#getProcessRole
	 * @model opposite="ProcessRole" required="true"
	 * @generated
	 */
	model.spem.Process getProcess();

	/**
	 * Sets the value of the '{@link model.spem.ProcessRole#getProcess <em>Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' container reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(model.spem.Process value);

} // ProcessRole
