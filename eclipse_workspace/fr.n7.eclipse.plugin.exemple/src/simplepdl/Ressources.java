/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Ressources#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.Ressources#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link simplepdl.Ressources#getAllouees <em>Allouees</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getRessources()
 * @model
 * @generated
 */
public interface Ressources extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplepdl.SimplepdlPackage#getRessources_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.Ressources#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see simplepdl.SimplepdlPackage#getRessources_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link simplepdl.Ressources#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Allouees</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.RessourcesAllouees}.
	 * It is bidirectional and its opposite is '{@link simplepdl.RessourcesAllouees#getRessources <em>Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allouees</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getRessources_Allouees()
	 * @see simplepdl.RessourcesAllouees#getRessources
	 * @model opposite="ressources"
	 * @generated
	 */
	EList<RessourcesAllouees> getAllouees();

} // Ressources
