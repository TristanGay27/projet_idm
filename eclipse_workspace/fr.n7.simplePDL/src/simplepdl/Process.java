/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Process#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.Process#getProcesselement <em>Processelement</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplepdl.SimplepdlPackage#getProcess_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Processelement</b></em>' containment reference list.
	 * The list contents are of type {@link simplepdl.ProcessElement}.
	 * It is bidirectional and its opposite is '{@link simplepdl.ProcessElement#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processelement</em>' containment reference list.
	 * @see simplepdl.SimplepdlPackage#getProcess_Processelement()
	 * @see simplepdl.ProcessElement#getProcess
	 * @model opposite="process" containment="true"
	 * @generated
	 */
	EList<ProcessElement> getProcesselement();

} // Process
