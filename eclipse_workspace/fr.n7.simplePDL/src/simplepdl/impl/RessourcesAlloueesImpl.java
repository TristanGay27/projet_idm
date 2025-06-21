/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import simplepdl.Ressources;
import simplepdl.RessourcesAllouees;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressources Allouees</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.RessourcesAlloueesImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link simplepdl.impl.RessourcesAlloueesImpl#getWorkDefinition <em>Work Definition</em>}</li>
 *   <li>{@link simplepdl.impl.RessourcesAlloueesImpl#getRessources <em>Ressources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourcesAlloueesImpl extends MinimalEObjectImpl.Container implements RessourcesAllouees {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessources() <em>Ressources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessources()
	 * @generated
	 * @ordered
	 */
	protected Ressources ressources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourcesAlloueesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.RESSOURCES_ALLOUEES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCES_ALLOUEES__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkDefinition getWorkDefinition() {
		if (eContainerFeatureID() != SimplepdlPackage.RESSOURCES_ALLOUEES__WORK_DEFINITION) return null;
		return (WorkDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkDefinition(WorkDefinition newWorkDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWorkDefinition, SimplepdlPackage.RESSOURCES_ALLOUEES__WORK_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkDefinition(WorkDefinition newWorkDefinition) {
		if (newWorkDefinition != eInternalContainer() || (eContainerFeatureID() != SimplepdlPackage.RESSOURCES_ALLOUEES__WORK_DEFINITION && newWorkDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newWorkDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkDefinition != null)
				msgs = ((InternalEObject)newWorkDefinition).eInverseAdd(this, SimplepdlPackage.WORK_DEFINITION__RESSOURCES, WorkDefinition.class, msgs);
			msgs = basicSetWorkDefinition(newWorkDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCES_ALLOUEES__WORK_DEFINITION, newWorkDefinition, newWorkDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ressources getRessources() {
		if (ressources != null && ressources.eIsProxy()) {
			InternalEObject oldRessources = (InternalEObject)ressources;
			ressources = (Ressources)eResolveProxy(oldRessources);
			if (ressources != oldRessources) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.RESSOURCES_ALLOUEES__RESSOURCES, oldRessources, ressources));
			}
		}
		return ressources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressources basicGetRessources() {
		return ressources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRessources(Ressources newRessources, NotificationChain msgs) {
		Ressources oldRessources = ressources;
		ressources = newRessources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCES_ALLOUEES__RESSOURCES, oldRessources, newRessources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRessources(Ressources newRessources) {
		if (newRessources != ressources) {
			NotificationChain msgs = null;
			if (ressources != null)
				msgs = ((InternalEObject)ressources).eInverseRemove(this, SimplepdlPackage.RESSOURCES__ALLOUEES, Ressources.class, msgs);
			if (newRessources != null)
				msgs = ((InternalEObject)newRessources).eInverseAdd(this, SimplepdlPackage.RESSOURCES__ALLOUEES, Ressources.class, msgs);
			msgs = basicSetRessources(newRessources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCES_ALLOUEES__RESSOURCES, newRessources, newRessources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCES_ALLOUEES__WORK_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWorkDefinition((WorkDefinition)otherEnd, msgs);
			case SimplepdlPackage.RESSOURCES_ALLOUEES__RESSOURCES:
				if (ressources != null)
					msgs = ((InternalEObject)ressources).eInverseRemove(this, SimplepdlPackage.RESSOURCES__ALLOUEES, Ressources.class, msgs);
				return basicSetRessources((Ressources)otherEnd, msgs);
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
			case SimplepdlPackage.RESSOURCES_ALLOUEES__WORK_DEFINITION:
				return basicSetWorkDefinition(null, msgs);
			case SimplepdlPackage.RESSOURCES_ALLOUEES__RESSOURCES:
				return basicSetRessources(null, msgs);
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
			case SimplepdlPackage.RESSOURCES_ALLOUEES__WORK_DEFINITION:
				return eInternalContainer().eInverseRemove(this, SimplepdlPackage.WORK_DEFINITION__RESSOURCES, WorkDefinition.class, msgs);
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
			case SimplepdlPackage.RESSOURCES_ALLOUEES__NUMBER:
				return getNumber();
			case SimplepdlPackage.RESSOURCES_ALLOUEES__WORK_DEFINITION:
				return getWorkDefinition();
			case SimplepdlPackage.RESSOURCES_ALLOUEES__RESSOURCES:
				if (resolve) return getRessources();
				return basicGetRessources();
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
			case SimplepdlPackage.RESSOURCES_ALLOUEES__NUMBER:
				setNumber((Integer)newValue);
				return;
			case SimplepdlPackage.RESSOURCES_ALLOUEES__WORK_DEFINITION:
				setWorkDefinition((WorkDefinition)newValue);
				return;
			case SimplepdlPackage.RESSOURCES_ALLOUEES__RESSOURCES:
				setRessources((Ressources)newValue);
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
			case SimplepdlPackage.RESSOURCES_ALLOUEES__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case SimplepdlPackage.RESSOURCES_ALLOUEES__WORK_DEFINITION:
				setWorkDefinition((WorkDefinition)null);
				return;
			case SimplepdlPackage.RESSOURCES_ALLOUEES__RESSOURCES:
				setRessources((Ressources)null);
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
			case SimplepdlPackage.RESSOURCES_ALLOUEES__NUMBER:
				return number != NUMBER_EDEFAULT;
			case SimplepdlPackage.RESSOURCES_ALLOUEES__WORK_DEFINITION:
				return getWorkDefinition() != null;
			case SimplepdlPackage.RESSOURCES_ALLOUEES__RESSOURCES:
				return ressources != null;
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
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //RessourcesAlloueesImpl
