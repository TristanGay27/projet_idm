/**
 */
package petri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.place#getNom <em>Nom</em>}</li>
 *   <li>{@link petri.place#getJetons <em>Jetons</em>}</li>
 *   <li>{@link petri.place#getLinksToArcs <em>Links To Arcs</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getplace()
 * @model
 * @generated
 */
public interface place extends petriElement {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see petri.PetriPackage#getplace_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link petri.place#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Jetons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jetons</em>' attribute.
	 * @see #setJetons(int)
	 * @see petri.PetriPackage#getplace_Jetons()
	 * @model required="true"
	 * @generated
	 */
	int getJetons();

	/**
	 * Sets the value of the '{@link petri.place#getJetons <em>Jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jetons</em>' attribute.
	 * @see #getJetons()
	 * @generated
	 */
	void setJetons(int value);

	/**
	 * Returns the value of the '<em><b>Links To Arcs</b></em>' reference list.
	 * The list contents are of type {@link petri.arcsPonderes}.
	 * It is bidirectional and its opposite is '{@link petri.arcsPonderes#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Arcs</em>' reference list.
	 * @see petri.PetriPackage#getplace_LinksToArcs()
	 * @see petri.arcsPonderes#getPlace
	 * @model opposite="place"
	 * @generated
	 */
	EList<arcsPonderes> getLinksToArcs();

} // place
