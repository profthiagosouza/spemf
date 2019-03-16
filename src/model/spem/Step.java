/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.spem.Step#getName <em>Name</em>}</li>
 *   <li>{@link model.spem.Step#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.spem.Spem2Package#getStep()
 * @model
 * @generated
 */
public interface Step extends ActionState {
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
	 * @see model.spem.Spem2Package#getStep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.spem.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.spem.Activity#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' container reference.
	 * @see #setActivities(Activity)
	 * @see model.spem.Spem2Package#getStep_Activities()
	 * @see model.spem.Activity#getSteps
	 * @model opposite="steps" required="true"
	 * @generated
	 */
	Activity getActivities();

	/**
	 * Sets the value of the '{@link model.spem.Step#getActivities <em>Activities</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activities</em>' container reference.
	 * @see #getActivities()
	 * @generated
	 */
	void setActivities(Activity value);

} // Step
