/**
 */
package petri.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petri.PetriPackage;
import petri.arcsPonderes;
import petri.place;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petri.impl.placeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link petri.impl.placeImpl#getJetons <em>Jetons</em>}</li>
 *   <li>{@link petri.impl.placeImpl#getLinksToArcs <em>Links To Arcs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class placeImpl extends petriElementImpl implements place {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getJetons() <em>Jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJetons()
	 * @generated
	 * @ordered
	 */
	protected static final int JETONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJetons() <em>Jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJetons()
	 * @generated
	 * @ordered
	 */
	protected int jetons = JETONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinksToArcs() <em>Links To Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<arcsPonderes> linksToArcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected placeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.PLACE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getJetons() {
		return jetons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJetons(int newJetons) {
		int oldJetons = jetons;
		jetons = newJetons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.PLACE__JETONS, oldJetons, jetons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<arcsPonderes> getLinksToArcs() {
		if (linksToArcs == null) {
			linksToArcs = new EObjectWithInverseResolvingEList<arcsPonderes>(arcsPonderes.class, this, PetriPackage.PLACE__LINKS_TO_ARCS, PetriPackage.ARCS_PONDERES__PLACE);
		}
		return linksToArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriPackage.PLACE__LINKS_TO_ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinksToArcs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriPackage.PLACE__LINKS_TO_ARCS:
				return ((InternalEList<?>)getLinksToArcs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriPackage.PLACE__NOM:
				return getNom();
			case PetriPackage.PLACE__JETONS:
				return getJetons();
			case PetriPackage.PLACE__LINKS_TO_ARCS:
				return getLinksToArcs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriPackage.PLACE__NOM:
				setNom((String)newValue);
				return;
			case PetriPackage.PLACE__JETONS:
				setJetons((Integer)newValue);
				return;
			case PetriPackage.PLACE__LINKS_TO_ARCS:
				getLinksToArcs().clear();
				getLinksToArcs().addAll((Collection<? extends arcsPonderes>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetriPackage.PLACE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case PetriPackage.PLACE__JETONS:
				setJetons(JETONS_EDEFAULT);
				return;
			case PetriPackage.PLACE__LINKS_TO_ARCS:
				getLinksToArcs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetriPackage.PLACE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case PetriPackage.PLACE__JETONS:
				return jetons != JETONS_EDEFAULT;
			case PetriPackage.PLACE__LINKS_TO_ARCS:
				return linksToArcs != null && !linksToArcs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(", jetons: ");
		result.append(jetons);
		result.append(')');
		return result.toString();
	}

} //placeImpl
