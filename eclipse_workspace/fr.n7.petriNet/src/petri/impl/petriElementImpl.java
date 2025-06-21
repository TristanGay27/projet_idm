/**
 */
package petri.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import petri.PetriPackage;
import petri.petriElement;
import petri.petriNet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>petri Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petri.impl.petriElementImpl#getPetriNet <em>Petri Net</em>}</li>
 * </ul>
 *
 * @generated
 */
public class petriElementImpl extends MinimalEObjectImpl.Container implements petriElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected petriElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriPackage.Literals.PETRI_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public petriNet getPetriNet() {
		if (eContainerFeatureID() != PetriPackage.PETRI_ELEMENT__PETRI_NET) return null;
		return (petriNet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPetriNet(petriNet newPetriNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPetriNet, PetriPackage.PETRI_ELEMENT__PETRI_NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPetriNet(petriNet newPetriNet) {
		if (newPetriNet != eInternalContainer() || (eContainerFeatureID() != PetriPackage.PETRI_ELEMENT__PETRI_NET && newPetriNet != null)) {
			if (EcoreUtil.isAncestor(this, newPetriNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPetriNet != null)
				msgs = ((InternalEObject)newPetriNet).eInverseAdd(this, PetriPackage.PETRI_NET__PETRIELEMENTS, petriNet.class, msgs);
			msgs = basicSetPetriNet(newPetriNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.PETRI_ELEMENT__PETRI_NET, newPetriNet, newPetriNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriPackage.PETRI_ELEMENT__PETRI_NET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPetriNet((petriNet)otherEnd, msgs);
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
			case PetriPackage.PETRI_ELEMENT__PETRI_NET:
				return basicSetPetriNet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PetriPackage.PETRI_ELEMENT__PETRI_NET:
				return eInternalContainer().eInverseRemove(this, PetriPackage.PETRI_NET__PETRIELEMENTS, petriNet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriPackage.PETRI_ELEMENT__PETRI_NET:
				return getPetriNet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriPackage.PETRI_ELEMENT__PETRI_NET:
				setPetriNet((petriNet)newValue);
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
			case PetriPackage.PETRI_ELEMENT__PETRI_NET:
				setPetriNet((petriNet)null);
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
			case PetriPackage.PETRI_ELEMENT__PETRI_NET:
				return getPetriNet() != null;
		}
		return super.eIsSet(featureID);
	}

} //petriElementImpl
