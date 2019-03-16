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
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.spem.Activity#getName <em>Name</em>}</li>
 *   <li>{@link model.spem.Activity#getAssistant <em>Assistant</em>}</li>
 *   <li>{@link model.spem.Activity#getStep <em>Step</em>}</li>
 *   <li>{@link model.spem.Activity#getSteps <em>Steps</em>}</li>
 *   <li>{@link model.spem.Activity#getAssistants <em>Assistants</em>}</li>
 *   <li>{@link model.spem.Activity#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.spem.Spem2Package#getActivity()
 * @model
 * @generated
 */
public interface Activity extends WorkDefinition {
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
	 * @see model.spem.Spem2Package#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.spem.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Assistant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assistant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assistant</em>' containment reference.
	 * @see #setAssistant(ProcessRole)
	 * @see model.spem.Spem2Package#getActivity_Assistant()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	ProcessRole getAssistant();

	/**
	 * Sets the value of the '{@link model.spem.Activity#getAssistant <em>Assistant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assistant</em>' containment reference.
	 * @see #getAssistant()
	 * @generated
	 */
	void setAssistant(ProcessRole value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference.
	 * @see #setStep(Step)
	 * @see model.spem.Spem2Package#getActivity_Step()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	Step getStep();

	/**
	 * Sets the value of the '{@link model.spem.Activity#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Step value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link model.spem.Step}.
	 * It is bidirectional and its opposite is '{@link model.spem.Step#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see model.spem.Spem2Package#getActivity_Steps()
	 * @see model.spem.Step#getActivities
	 * @model type="model.spem.Step" opposite="activities" containment="true"
	 * @generated
	 */
	EList getSteps();

	/**
	 * Returns the value of the '<em><b>Assistants</b></em>' reference list.
	 * The list contents are of type {@link model.spem.ProcessRole}.
	 * It is bidirectional and its opposite is '{@link model.spem.ProcessRole#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assistants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assistants</em>' reference list.
	 * @see model.spem.Spem2Package#getActivity_Assistants()
	 * @see model.spem.ProcessRole#getActivities
	 * @model type="model.spem.ProcessRole" opposite="activities"
	 * @generated
	 */
	EList getAssistants();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.spem.Process#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' container reference.
	 * @see #setProcess(model.spem.Process)
	 * @see model.spem.Spem2Package#getActivity_Process()
	 * @see model.spem.Process#getActivity
	 * @model opposite="Activity" required="true"
	 * @generated
	 */
	model.spem.Process getProcess();

	/**
	 * Sets the value of the '{@link model.spem.Activity#getProcess <em>Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' container reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(model.spem.Process value);

} // Activity
