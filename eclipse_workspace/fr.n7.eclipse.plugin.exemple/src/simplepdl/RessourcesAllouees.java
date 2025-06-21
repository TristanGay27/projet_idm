/**
 */
package simplepdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressources Allouees</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.RessourcesAllouees#getNumber <em>Number</em>}</li>
 *   <li>{@link simplepdl.RessourcesAllouees#getWorkDefinition <em>Work Definition</em>}</li>
 *   <li>{@link simplepdl.RessourcesAllouees#getRessources <em>Ressources</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getRessourcesAllouees()
 * @model
 * @generated
 */
public interface RessourcesAllouees extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see simplepdl.SimplepdlPackage#getRessourcesAllouees_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link simplepdl.RessourcesAllouees#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Work Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getRessources <em>Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Definition</em>' container reference.
	 * @see #setWorkDefinition(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getRessourcesAllouees_WorkDefinition()
	 * @see simplepdl.WorkDefinition#getRessources
	 * @model opposite="ressources" required="true" transient="false"
	 * @generated
	 */
	WorkDefinition getWorkDefinition();

	/**
	 * Sets the value of the '{@link simplepdl.RessourcesAllouees#getWorkDefinition <em>Work Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Definition</em>' container reference.
	 * @see #getWorkDefinition()
	 * @generated
	 */
	void setWorkDefinition(WorkDefinition value);

	/**
	 * Returns the value of the '<em><b>Ressources</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.Ressources#getAllouees <em>Allouees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressources</em>' reference.
	 * @see #setRessources(Ressources)
	 * @see simplepdl.SimplepdlPackage#getRessourcesAllouees_Ressources()
	 * @see simplepdl.Ressources#getAllouees
	 * @model opposite="allouees" required="true"
	 * @generated
	 */
	Ressources getRessources();

	/**
	 * Sets the value of the '{@link simplepdl.RessourcesAllouees#getRessources <em>Ressources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressources</em>' reference.
	 * @see #getRessources()
	 * @generated
	 */
	void setRessources(Ressources value);

} // RessourcesAllouees
