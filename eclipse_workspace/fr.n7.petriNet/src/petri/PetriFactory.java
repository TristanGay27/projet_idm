/**
 */
package petri;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petri.PetriPackage
 * @generated
 */
public interface PetriFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetriFactory eINSTANCE = petri.impl.PetriFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>place</em>'.
	 * @generated
	 */
	place createplace();

	/**
	 * Returns a new object of class '<em>transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>transition</em>'.
	 * @generated
	 */
	transition createtransition();

	/**
	 * Returns a new object of class '<em>arcs Ponderes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>arcs Ponderes</em>'.
	 * @generated
	 */
	arcsPonderes createarcsPonderes();

	/**
	 * Returns a new object of class '<em>petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>petri Net</em>'.
	 * @generated
	 */
	petriNet createpetriNet();

	/**
	 * Returns a new object of class '<em>intervalle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>intervalle</em>'.
	 * @generated
	 */
	intervalle createintervalle();

	/**
	 * Returns a new object of class '<em>petri Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>petri Element</em>'.
	 * @generated
	 */
	petriElement createpetriElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PetriPackage getPetriPackage();

} //PetriFactory
