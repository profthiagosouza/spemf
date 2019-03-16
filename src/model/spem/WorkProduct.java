/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.spem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.spem.WorkProduct#getName <em>Name</em>}</li>
 *   <li>{@link model.spem.WorkProduct#getIsDeliverable <em>Is Deliverable</em>}</li>
 *   <li>{@link model.spem.WorkProduct#getKind <em>Kind</em>}</li>
 *   <li>{@link model.spem.WorkProduct#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link model.spem.WorkProduct#getResponsibleRoles <em>Responsible Roles</em>}</li>
 *   <li>{@link model.spem.WorkProduct#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.spem.Spem2Package#getWorkProduct()
 * @model
 * @generated
 */
public interface WorkProduct extends EObject {
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
	 * @see model.spem.Spem2Package#getWorkProduct_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.spem.WorkProduct#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Deliverable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Deliverable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Deliverable</em>' attribute.
	 * @see #setIsDeliverable(Boolean)
	 * @see model.spem.Spem2Package#getWorkProduct_IsDeliverable()
	 * @model
	 * @generated
	 */
	Boolean getIsDeliverable();

	/**
	 * Sets the value of the '{@link model.spem.WorkProduct#getIsDeliverable <em>Is Deliverable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Deliverable</em>' attribute.
	 * @see #getIsDeliverable()
	 * @generated
	 */
	void setIsDeliverable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see model.spem.Spem2Package#getWorkProduct_Kind()
	 * @model derived="true"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link model.spem.WorkProduct#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference.
	 * @see #setResponsible(ProcessRole)
	 * @see model.spem.Spem2Package#getWorkProduct_Responsible()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	ProcessRole getResponsible();

	/**
	 * Sets the value of the '{@link model.spem.WorkProduct#getResponsible <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' containment reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(ProcessRole value);

	/**
	 * Returns the value of the '<em><b>Responsible Roles</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.spem.ProcessRole#getWorkProducts <em>Work Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Roles</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Roles</em>' reference.
	 * @see #setResponsibleRoles(ProcessRole)
	 * @see model.spem.Spem2Package#getWorkProduct_ResponsibleRoles()
	 * @see model.spem.ProcessRole#getWorkProducts
	 * @model opposite="workProducts"
	 * @generated
	 */
	ProcessRole getResponsibleRoles();

	/**
	 * Sets the value of the '{@link model.spem.WorkProduct#getResponsibleRoles <em>Responsible Roles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Roles</em>' reference.
	 * @see #getResponsibleRoles()
	 * @generated
	 */
	void setResponsibleRoles(ProcessRole value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.spem.Process#getWorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' container reference.
	 * @see #setProcess(model.spem.Process)
	 * @see model.spem.Spem2Package#getWorkProduct_Process()
	 * @see model.spem.Process#getWorkProduct
	 * @model opposite="WorkProduct" required="true"
	 * @generated
	 */
	model.spem.Process getProcess();

	/**
	 * Sets the value of the '{@link model.spem.WorkProduct#getProcess <em>Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' container reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(model.spem.Process value);

} // WorkProduct
