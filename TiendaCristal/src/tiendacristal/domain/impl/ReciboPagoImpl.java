/**
 */
package tiendacristal.domain.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tiendacristal.domain.Compra;
import tiendacristal.domain.Domain;
import tiendacristal.domain.DomainPackage;
import tiendacristal.domain.ReciboPago;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recibo Pago</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.impl.ReciboPagoImpl#getCodigoFactura <em>Codigo Factura</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.ReciboPagoImpl#getCostoTotalPedido <em>Costo Total Pedido</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.ReciboPagoImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.ReciboPagoImpl#getTheCompra <em>The Compra</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReciboPagoImpl extends MinimalEObjectImpl.Container implements ReciboPago {
	/**
	 * The default value of the '{@link #getCodigoFactura() <em>Codigo Factura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoFactura()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_FACTURA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigoFactura() <em>Codigo Factura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoFactura()
	 * @generated
	 * @ordered
	 */
	protected String codigoFactura = CODIGO_FACTURA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostoTotalPedido() <em>Costo Total Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostoTotalPedido()
	 * @generated
	 * @ordered
	 */
	protected static final int COSTO_TOTAL_PEDIDO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCostoTotalPedido() <em>Costo Total Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostoTotalPedido()
	 * @generated
	 * @ordered
	 */
	protected int costoTotalPedido = COSTO_TOTAL_PEDIDO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTheCompra() <em>The Compra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheCompra()
	 * @generated
	 * @ordered
	 */
	protected Compra theCompra;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReciboPagoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.RECIBO_PAGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigoFactura() {
		return codigoFactura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoFactura(String newCodigoFactura) {
		String oldCodigoFactura = codigoFactura;
		codigoFactura = newCodigoFactura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIBO_PAGO__CODIGO_FACTURA, oldCodigoFactura, codigoFactura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCostoTotalPedido() {
		return costoTotalPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostoTotalPedido(int newCostoTotalPedido) {
		int oldCostoTotalPedido = costoTotalPedido;
		costoTotalPedido = newCostoTotalPedido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIBO_PAGO__COSTO_TOTAL_PEDIDO, oldCostoTotalPedido, costoTotalPedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomain() {
		if (eContainerFeatureID() != DomainPackage.RECIBO_PAGO__DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, DomainPackage.RECIBO_PAGO__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Domain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.RECIBO_PAGO__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, DomainPackage.DOMAIN__LISTA_FACTURAS, Domain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIBO_PAGO__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compra getTheCompra() {
		if (theCompra != null && theCompra.eIsProxy()) {
			InternalEObject oldTheCompra = (InternalEObject)theCompra;
			theCompra = (Compra)eResolveProxy(oldTheCompra);
			if (theCompra != oldTheCompra) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.RECIBO_PAGO__THE_COMPRA, oldTheCompra, theCompra));
			}
		}
		return theCompra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compra basicGetTheCompra() {
		return theCompra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheCompra(Compra newTheCompra, NotificationChain msgs) {
		Compra oldTheCompra = theCompra;
		theCompra = newTheCompra;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.RECIBO_PAGO__THE_COMPRA, oldTheCompra, newTheCompra);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheCompra(Compra newTheCompra) {
		if (newTheCompra != theCompra) {
			NotificationChain msgs = null;
			if (theCompra != null)
				msgs = ((InternalEObject)theCompra).eInverseRemove(this, DomainPackage.COMPRA__THE_RECIBO_PAGO, Compra.class, msgs);
			if (newTheCompra != null)
				msgs = ((InternalEObject)newTheCompra).eInverseAdd(this, DomainPackage.COMPRA__THE_RECIBO_PAGO, Compra.class, msgs);
			msgs = basicSetTheCompra(newTheCompra, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RECIBO_PAGO__THE_COMPRA, newTheCompra, newTheCompra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.RECIBO_PAGO__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((Domain)otherEnd, msgs);
			case DomainPackage.RECIBO_PAGO__THE_COMPRA:
				if (theCompra != null)
					msgs = ((InternalEObject)theCompra).eInverseRemove(this, DomainPackage.COMPRA__THE_RECIBO_PAGO, Compra.class, msgs);
				return basicSetTheCompra((Compra)otherEnd, msgs);
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
			case DomainPackage.RECIBO_PAGO__DOMAIN:
				return basicSetDomain(null, msgs);
			case DomainPackage.RECIBO_PAGO__THE_COMPRA:
				return basicSetTheCompra(null, msgs);
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
			case DomainPackage.RECIBO_PAGO__DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LISTA_FACTURAS, Domain.class, msgs);
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
			case DomainPackage.RECIBO_PAGO__CODIGO_FACTURA:
				return getCodigoFactura();
			case DomainPackage.RECIBO_PAGO__COSTO_TOTAL_PEDIDO:
				return getCostoTotalPedido();
			case DomainPackage.RECIBO_PAGO__DOMAIN:
				return getDomain();
			case DomainPackage.RECIBO_PAGO__THE_COMPRA:
				if (resolve) return getTheCompra();
				return basicGetTheCompra();
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
			case DomainPackage.RECIBO_PAGO__CODIGO_FACTURA:
				setCodigoFactura((String)newValue);
				return;
			case DomainPackage.RECIBO_PAGO__COSTO_TOTAL_PEDIDO:
				setCostoTotalPedido((Integer)newValue);
				return;
			case DomainPackage.RECIBO_PAGO__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case DomainPackage.RECIBO_PAGO__THE_COMPRA:
				setTheCompra((Compra)newValue);
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
			case DomainPackage.RECIBO_PAGO__CODIGO_FACTURA:
				setCodigoFactura(CODIGO_FACTURA_EDEFAULT);
				return;
			case DomainPackage.RECIBO_PAGO__COSTO_TOTAL_PEDIDO:
				setCostoTotalPedido(COSTO_TOTAL_PEDIDO_EDEFAULT);
				return;
			case DomainPackage.RECIBO_PAGO__DOMAIN:
				setDomain((Domain)null);
				return;
			case DomainPackage.RECIBO_PAGO__THE_COMPRA:
				setTheCompra((Compra)null);
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
			case DomainPackage.RECIBO_PAGO__CODIGO_FACTURA:
				return CODIGO_FACTURA_EDEFAULT == null ? codigoFactura != null : !CODIGO_FACTURA_EDEFAULT.equals(codigoFactura);
			case DomainPackage.RECIBO_PAGO__COSTO_TOTAL_PEDIDO:
				return costoTotalPedido != COSTO_TOTAL_PEDIDO_EDEFAULT;
			case DomainPackage.RECIBO_PAGO__DOMAIN:
				return getDomain() != null;
			case DomainPackage.RECIBO_PAGO__THE_COMPRA:
				return theCompra != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (codigoFactura: ");
		result.append(codigoFactura);
		result.append(", costoTotalPedido: ");
		result.append(costoTotalPedido);
		result.append(')');
		return result.toString();
	}

} //ReciboPagoImpl
