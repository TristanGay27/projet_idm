/**
 */
package petri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.transition#getNom <em>Nom</em>}</li>
 *   <li>{@link petri.transition#getIntervalle <em>Intervalle</em>}</li>
 *   <li>{@link petri.transition#getLinksToArcs <em>Links To Arcs</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#gettransition()
 * @model
 * @generated
 */
public interface transition extends petriElement {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see petri.PetriPackage#gettransition_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link petri.transition#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Intervalle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle</em>' containment reference.
	 * @see #setIntervalle(intervalle)
	 * @see petri.PetriPackage#gettransition_Intervalle()
	 * @model containment="true"
	 * @generated
	 */
	intervalle getIntervalle();

	/**
	 * Sets the value of the '{@link petri.transition#getIntervalle <em>Intervalle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle</em>' containment reference.
	 * @see #getIntervalle()
	 * @generated
	 */
	void setIntervalle(intervalle value);

	/**
	 * Returns the value of the '<em><b>Links To Arcs</b></em>' reference list.
	 * The list contents are of type {@link petri.arcsPonderes}.
	 * It is bidirectional and its opposite is '{@link petri.arcsPonderes#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Arcs</em>' reference list.
	 * @see petri.PetriPackage#gettransition_LinksToArcs()
	 * @see petri.arcsPonderes#getTransition
	 * @model opposite="transition"
	 * @generated
	 */
	EList<arcsPonderes> getLinksToArcs();

} // transition
