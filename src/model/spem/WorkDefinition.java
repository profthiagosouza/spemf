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
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.spem.WorkDefinition#getPerformer <em>Performer</em>}</li>
 *   <li>{@link model.spem.WorkDefinition#getParentWork <em>Parent Work</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.spem.Spem2Package#getWorkDefinition()
 * @model
 * @generated
 */
public interface WorkDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(ProcessPerformer)
	 * @see model.spem.Spem2Package#getWorkDefinition_Performer()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	ProcessPerformer getPerformer();

	/**
	 * Sets the value of the '{@link model.spem.WorkDefinition#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(ProcessPerformer value);

	/**
	 * Returns the value of the '<em><b>Parent Work</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Work</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Work</em>' containment reference.
	 * @see #setParentWork(WorkDefinition)
	 * @see model.spem.Spem2Package#getWorkDefinition_ParentWork()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	WorkDefinition getParentWork();

	/**
	 * Sets the value of the '{@link model.spem.WorkDefinition#getParentWork <em>Parent Work</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Work</em>' containment reference.
	 * @see #getParentWork()
	 * @generated
	 */
	void setParentWork(WorkDefinition value);

} // WorkDefinition
