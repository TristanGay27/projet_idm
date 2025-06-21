/**
 */
package petri.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import petri.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see petri.PetriPackage
 * @generated
 */
public class PetriAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PetriPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PetriPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriSwitch<Adapter> modelSwitch =
		new PetriSwitch<Adapter>() {
			@Override
			public Adapter caseplace(place object) {
				return createplaceAdapter();
			}
			@Override
			public Adapter casetransition(transition object) {
				return createtransitionAdapter();
			}
			@Override
			public Adapter casearcsPonderes(arcsPonderes object) {
				return createarcsPonderesAdapter();
			}
			@Override
			public Adapter casepetriNet(petriNet object) {
				return createpetriNetAdapter();
			}
			@Override
			public Adapter caseintervalle(intervalle object) {
				return createintervalleAdapter();
			}
			@Override
			public Adapter casepetriElement(petriElement object) {
				return createpetriElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link petri.place <em>place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petri.place
	 * @generated
	 */
	public Adapter createplaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petri.transition <em>transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petri.transition
	 * @generated
	 */
	public Adapter createtransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petri.arcsPonderes <em>arcs Ponderes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petri.arcsPonderes
	 * @generated
	 */
	public Adapter createarcsPonderesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petri.petriNet <em>petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petri.petriNet
	 * @generated
	 */
	public Adapter createpetriNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petri.intervalle <em>intervalle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petri.intervalle
	 * @generated
	 */
	public Adapter createintervalleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petri.petriElement <em>petri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petri.petriElement
	 * @generated
	 */
	public Adapter createpetriElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PetriAdapterFactory
