/**
 */
package petri;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see petri.PetriFactory
 * @model kind="package"
 * @generated
 */
public interface PetriPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petri";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://petri";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petri";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetriPackage eINSTANCE = petri.impl.PetriPackageImpl.init();

	/**
	 * The meta object id for the '{@link petri.impl.petriElementImpl <em>petri Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petri.impl.petriElementImpl
	 * @see petri.impl.PetriPackageImpl#getpetriElement()
	 * @generated
	 */
	int PETRI_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_ELEMENT__PETRI_NET = 0;

	/**
	 * The number of structural features of the '<em>petri Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>petri Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petri.impl.placeImpl <em>place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petri.impl.placeImpl
	 * @see petri.impl.PetriPackageImpl#getplace()
	 * @generated
	 */
	int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__PETRI_NET = PETRI_ELEMENT__PETRI_NET;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NOM = PETRI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jetons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__JETONS = PETRI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links To Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__LINKS_TO_ARCS = PETRI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PETRI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = PETRI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petri.impl.transitionImpl <em>transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petri.impl.transitionImpl
	 * @see petri.impl.PetriPackageImpl#gettransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PETRI_NET = PETRI_ELEMENT__PETRI_NET;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NOM = PETRI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intervalle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INTERVALLE = PETRI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links To Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LINKS_TO_ARCS = PETRI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = PETRI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = PETRI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petri.impl.arcsPonderesImpl <em>arcs Ponderes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petri.impl.arcsPonderesImpl
	 * @see petri.impl.PetriPackageImpl#getarcsPonderes()
	 * @generated
	 */
	int ARCS_PONDERES = 2;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES__PETRI_NET = PETRI_ELEMENT__PETRI_NET;

	/**
	 * The feature id for the '<em><b>Poids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES__POIDS = PETRI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Arc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES__TYPE_ARC = PETRI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES__PLACE = PETRI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES__TRANSITION = PETRI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Read Arc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES__READ_ARC = PETRI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>arcs Ponderes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_FEATURE_COUNT = PETRI_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>arcs Ponderes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCS_PONDERES_OPERATION_COUNT = PETRI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petri.impl.petriNetImpl <em>petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petri.impl.petriNetImpl
	 * @see petri.impl.PetriPackageImpl#getpetriNet()
	 * @generated
	 */
	int PETRI_NET = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__NOM = 0;

	/**
	 * The feature id for the '<em><b>Petrielements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__PETRIELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petri.impl.intervalleImpl <em>intervalle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petri.impl.intervalleImpl
	 * @see petri.impl.PetriPackageImpl#getintervalle()
	 * @generated
	 */
	int INTERVALLE = 4;

	/**
	 * The feature id for the '<em><b>Binf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALLE__BINF = 0;

	/**
	 * The feature id for the '<em><b>Bsup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALLE__BSUP = 1;

	/**
	 * The number of structural features of the '<em>intervalle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>intervalle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petri.arcType <em>arc Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petri.arcType
	 * @see petri.impl.PetriPackageImpl#getarcType()
	 * @generated
	 */
	int ARC_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link petri.place <em>place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>place</em>'.
	 * @see petri.place
	 * @generated
	 */
	EClass getplace();

	/**
	 * Returns the meta object for the attribute '{@link petri.place#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see petri.place#getNom()
	 * @see #getplace()
	 * @generated
	 */
	EAttribute getplace_Nom();

	/**
	 * Returns the meta object for the attribute '{@link petri.place#getJetons <em>Jetons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jetons</em>'.
	 * @see petri.place#getJetons()
	 * @see #getplace()
	 * @generated
	 */
	EAttribute getplace_Jetons();

	/**
	 * Returns the meta object for the reference list '{@link petri.place#getLinksToArcs <em>Links To Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links To Arcs</em>'.
	 * @see petri.place#getLinksToArcs()
	 * @see #getplace()
	 * @generated
	 */
	EReference getplace_LinksToArcs();

	/**
	 * Returns the meta object for class '{@link petri.transition <em>transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>transition</em>'.
	 * @see petri.transition
	 * @generated
	 */
	EClass gettransition();

	/**
	 * Returns the meta object for the attribute '{@link petri.transition#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see petri.transition#getNom()
	 * @see #gettransition()
	 * @generated
	 */
	EAttribute gettransition_Nom();

	/**
	 * Returns the meta object for the containment reference '{@link petri.transition#getIntervalle <em>Intervalle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intervalle</em>'.
	 * @see petri.transition#getIntervalle()
	 * @see #gettransition()
	 * @generated
	 */
	EReference gettransition_Intervalle();

	/**
	 * Returns the meta object for the reference list '{@link petri.transition#getLinksToArcs <em>Links To Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links To Arcs</em>'.
	 * @see petri.transition#getLinksToArcs()
	 * @see #gettransition()
	 * @generated
	 */
	EReference gettransition_LinksToArcs();

	/**
	 * Returns the meta object for class '{@link petri.arcsPonderes <em>arcs Ponderes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>arcs Ponderes</em>'.
	 * @see petri.arcsPonderes
	 * @generated
	 */
	EClass getarcsPonderes();

	/**
	 * Returns the meta object for the attribute '{@link petri.arcsPonderes#getPoids <em>Poids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poids</em>'.
	 * @see petri.arcsPonderes#getPoids()
	 * @see #getarcsPonderes()
	 * @generated
	 */
	EAttribute getarcsPonderes_Poids();

	/**
	 * Returns the meta object for the attribute '{@link petri.arcsPonderes#getTypeArc <em>Type Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Arc</em>'.
	 * @see petri.arcsPonderes#getTypeArc()
	 * @see #getarcsPonderes()
	 * @generated
	 */
	EAttribute getarcsPonderes_TypeArc();

	/**
	 * Returns the meta object for the reference '{@link petri.arcsPonderes#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see petri.arcsPonderes#getPlace()
	 * @see #getarcsPonderes()
	 * @generated
	 */
	EReference getarcsPonderes_Place();

	/**
	 * Returns the meta object for the reference '{@link petri.arcsPonderes#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see petri.arcsPonderes#getTransition()
	 * @see #getarcsPonderes()
	 * @generated
	 */
	EReference getarcsPonderes_Transition();

	/**
	 * Returns the meta object for the attribute '{@link petri.arcsPonderes#isReadArc <em>Read Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Arc</em>'.
	 * @see petri.arcsPonderes#isReadArc()
	 * @see #getarcsPonderes()
	 * @generated
	 */
	EAttribute getarcsPonderes_ReadArc();

	/**
	 * Returns the meta object for class '{@link petri.petriNet <em>petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>petri Net</em>'.
	 * @see petri.petriNet
	 * @generated
	 */
	EClass getpetriNet();

	/**
	 * Returns the meta object for the attribute '{@link petri.petriNet#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see petri.petriNet#getNom()
	 * @see #getpetriNet()
	 * @generated
	 */
	EAttribute getpetriNet_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link petri.petriNet#getPetrielements <em>Petrielements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Petrielements</em>'.
	 * @see petri.petriNet#getPetrielements()
	 * @see #getpetriNet()
	 * @generated
	 */
	EReference getpetriNet_Petrielements();

	/**
	 * Returns the meta object for class '{@link petri.intervalle <em>intervalle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>intervalle</em>'.
	 * @see petri.intervalle
	 * @generated
	 */
	EClass getintervalle();

	/**
	 * Returns the meta object for the attribute '{@link petri.intervalle#getBinf <em>Binf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binf</em>'.
	 * @see petri.intervalle#getBinf()
	 * @see #getintervalle()
	 * @generated
	 */
	EAttribute getintervalle_Binf();

	/**
	 * Returns the meta object for the attribute '{@link petri.intervalle#getBsup <em>Bsup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bsup</em>'.
	 * @see petri.intervalle#getBsup()
	 * @see #getintervalle()
	 * @generated
	 */
	EAttribute getintervalle_Bsup();

	/**
	 * Returns the meta object for class '{@link petri.petriElement <em>petri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>petri Element</em>'.
	 * @see petri.petriElement
	 * @generated
	 */
	EClass getpetriElement();

	/**
	 * Returns the meta object for the container reference '{@link petri.petriElement#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Petri Net</em>'.
	 * @see petri.petriElement#getPetriNet()
	 * @see #getpetriElement()
	 * @generated
	 */
	EReference getpetriElement_PetriNet();

	/**
	 * Returns the meta object for enum '{@link petri.arcType <em>arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>arc Type</em>'.
	 * @see petri.arcType
	 * @generated
	 */
	EEnum getarcType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetriFactory getPetriFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link petri.impl.placeImpl <em>place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petri.impl.placeImpl
		 * @see petri.impl.PetriPackageImpl#getplace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getplace();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NOM = eINSTANCE.getplace_Nom();

		/**
		 * The meta object literal for the '<em><b>Jetons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__JETONS = eINSTANCE.getplace_Jetons();

		/**
		 * The meta object literal for the '<em><b>Links To Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__LINKS_TO_ARCS = eINSTANCE.getplace_LinksToArcs();

		/**
		 * The meta object literal for the '{@link petri.impl.transitionImpl <em>transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petri.impl.transitionImpl
		 * @see petri.impl.PetriPackageImpl#gettransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.gettransition();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NOM = eINSTANCE.gettransition_Nom();

		/**
		 * The meta object literal for the '<em><b>Intervalle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INTERVALLE = eINSTANCE.gettransition_Intervalle();

		/**
		 * The meta object literal for the '<em><b>Links To Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__LINKS_TO_ARCS = eINSTANCE.gettransition_LinksToArcs();

		/**
		 * The meta object literal for the '{@link petri.impl.arcsPonderesImpl <em>arcs Ponderes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petri.impl.arcsPonderesImpl
		 * @see petri.impl.PetriPackageImpl#getarcsPonderes()
		 * @generated
		 */
		EClass ARCS_PONDERES = eINSTANCE.getarcsPonderes();

		/**
		 * The meta object literal for the '<em><b>Poids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCS_PONDERES__POIDS = eINSTANCE.getarcsPonderes_Poids();

		/**
		 * The meta object literal for the '<em><b>Type Arc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCS_PONDERES__TYPE_ARC = eINSTANCE.getarcsPonderes_TypeArc();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCS_PONDERES__PLACE = eINSTANCE.getarcsPonderes_Place();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCS_PONDERES__TRANSITION = eINSTANCE.getarcsPonderes_Transition();

		/**
		 * The meta object literal for the '<em><b>Read Arc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCS_PONDERES__READ_ARC = eINSTANCE.getarcsPonderes_ReadArc();

		/**
		 * The meta object literal for the '{@link petri.impl.petriNetImpl <em>petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petri.impl.petriNetImpl
		 * @see petri.impl.PetriPackageImpl#getpetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getpetriNet();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI_NET__NOM = eINSTANCE.getpetriNet_Nom();

		/**
		 * The meta object literal for the '<em><b>Petrielements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__PETRIELEMENTS = eINSTANCE.getpetriNet_Petrielements();

		/**
		 * The meta object literal for the '{@link petri.impl.intervalleImpl <em>intervalle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petri.impl.intervalleImpl
		 * @see petri.impl.PetriPackageImpl#getintervalle()
		 * @generated
		 */
		EClass INTERVALLE = eINSTANCE.getintervalle();

		/**
		 * The meta object literal for the '<em><b>Binf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVALLE__BINF = eINSTANCE.getintervalle_Binf();

		/**
		 * The meta object literal for the '<em><b>Bsup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVALLE__BSUP = eINSTANCE.getintervalle_Bsup();

		/**
		 * The meta object literal for the '{@link petri.impl.petriElementImpl <em>petri Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petri.impl.petriElementImpl
		 * @see petri.impl.PetriPackageImpl#getpetriElement()
		 * @generated
		 */
		EClass PETRI_ELEMENT = eINSTANCE.getpetriElement();

		/**
		 * The meta object literal for the '<em><b>Petri Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_ELEMENT__PETRI_NET = eINSTANCE.getpetriElement_PetriNet();

		/**
		 * The meta object literal for the '{@link petri.arcType <em>arc Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petri.arcType
		 * @see petri.impl.PetriPackageImpl#getarcType()
		 * @generated
		 */
		EEnum ARC_TYPE = eINSTANCE.getarcType();

	}

} //PetriPackage
