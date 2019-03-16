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
 * A representation of the model object '<em><b>Process Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.spem.ProcessPerformer#getWork <em>Work</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.spem.Spem2Package#getProcessPerformer()
 * @model
 * @generated
 */
public interface ProcessPerformer extends EObject {
	/**
	 * Returns the value of the '<em><b>Work</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' containment reference.
	 * @see #setWork(WorkDefinition)
	 * @see model.spem.Spem2Package#getProcessPerformer_Work()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	WorkDefinition getWork();

	/**
	 * Sets the value of the '{@link model.spem.ProcessPerformer#getWork <em>Work</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' containment reference.
	 * @see #getWork()
	 * @generated
	 */
	void setWork(WorkDefinition value);

} // ProcessPerformer
