/**
 */
package petri.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import petri.PetriPackage;
import petri.intervalle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>intervalle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petri.impl.intervalleImpl#getBinf <em>Binf</em>}</li>
 *   <li>{@link petri.impl.intervalleImpl#getBsup <em>Bsup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class intervalleImpl extends MinimalEObjectImpl.Container implements intervalle {
	/**
	 * The default value of the '{@link #getBinf() <em>Binf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinf()
	 * @generated
	 * @ordered
	 */
	protected static final int BINF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBinf() <em>Binf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinf()
	 * @generated
	 * @ordered
	 */
	protected int binf = BINF_EDEFAULT;

	/**
	 * The default value of the '{@link #getBsup() <em>Bsup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBsup()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BSUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBsup() <em>Bsup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBsup()
	 * @generated
	 * @ordered
	 */
	protected Integer bsup = BSUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected intervalleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriPackage.Literals.INTERVALLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBinf() {
		return binf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinf(int newBinf) {
		int oldBinf = binf;
		binf = newBinf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.INTERVALLE__BINF, oldBinf, binf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBsup() {
		return bsup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBsup(Integer newBsup) {
		Integer oldBsup = bsup;
		bsup = newBsup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriPackage.INTERVALLE__BSUP, oldBsup, bsup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriPackage.INTERVALLE__BINF:
				return getBinf();
			case PetriPackage.INTERVALLE__BSUP:
				return getBsup();
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
			case PetriPackage.INTERVALLE__BINF:
				setBinf((Integer)newValue);
				return;
			case PetriPackage.INTERVALLE__BSUP:
				setBsup((Integer)newValue);
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
			case PetriPackage.INTERVALLE__BINF:
				setBinf(BINF_EDEFAULT);
				return;
			case PetriPackage.INTERVALLE__BSUP:
				setBsup(BSUP_EDEFAULT);
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
			case PetriPackage.INTERVALLE__BINF:
				return binf != BINF_EDEFAULT;
			case PetriPackage.INTERVALLE__BSUP:
				return BSUP_EDEFAULT == null ? bsup != null : !BSUP_EDEFAULT.equals(bsup);
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
		result.append(" (binf: ");
		result.append(binf);
		result.append(", bsup: ");
		result.append(bsup);
		result.append(')');
		return result.toString();
	}

} //intervalleImpl
