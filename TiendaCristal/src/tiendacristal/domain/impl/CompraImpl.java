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
import tiendacristal.domain.Pedido;
import tiendacristal.domain.ReciboPago;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.impl.CompraImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.CompraImpl#getIdCliente <em>Id Cliente</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.CompraImpl#getCodigoP <em>Codigo P</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.CompraImpl#getFecha <em>Fecha</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.CompraImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.CompraImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.CompraImpl#getTheReciboPago <em>The Recibo Pago</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.CompraImpl#getThePedido <em>The Pedido</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompraImpl extends MinimalEObjectImpl.Container implements Compra {
	/**
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected String codigo = CODIGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdCliente() <em>Id Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCliente()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_CLIENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdCliente() <em>Id Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCliente()
	 * @generated
	 * @ordered
	 */
	protected String idCliente = ID_CLIENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodigoP() <em>Codigo P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoP()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigoP() <em>Codigo P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoP()
	 * @generated
	 * @ordered
	 */
	protected String codigoP = CODIGO_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected String fecha = FECHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected int total = TOTAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTheReciboPago() <em>The Recibo Pago</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheReciboPago()
	 * @generated
	 * @ordered
	 */
	protected ReciboPago theReciboPago;

	/**
	 * The cached value of the '{@link #getThePedido() <em>The Pedido</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThePedido()
	 * @generated
	 * @ordered
	 */
	protected Pedido thePedido;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.COMPRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(String newCodigo) {
		String oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.COMPRA__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdCliente() {
		return idCliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdCliente(String newIdCliente) {
		String oldIdCliente = idCliente;
		idCliente = newIdCliente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.COMPRA__ID_CLIENTE, oldIdCliente, idCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigoP() {
		return codigoP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoP(String newCodigoP) {
		String oldCodigoP = codigoP;
		codigoP = newCodigoP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.COMPRA__CODIGO_P, oldCodigoP, codigoP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFecha(String newFecha) {
		String oldFecha = fecha;
		fecha = newFecha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.COMPRA__FECHA, oldFecha, fecha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(int newTotal) {
		int oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.COMPRA__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomain() {
		if (eContainerFeatureID() != DomainPackage.COMPRA__DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, DomainPackage.COMPRA__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Domain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.COMPRA__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, DomainPackage.DOMAIN__LISTA_COMPRAS, Domain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.COMPRA__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReciboPago getTheReciboPago() {
		if (theReciboPago != null && theReciboPago.eIsProxy()) {
			InternalEObject oldTheReciboPago = (InternalEObject)theReciboPago;
			theReciboPago = (ReciboPago)eResolveProxy(oldTheReciboPago);
			if (theReciboPago != oldTheReciboPago) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.COMPRA__THE_RECIBO_PAGO, oldTheReciboPago, theReciboPago));
			}
		}
		return theReciboPago;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReciboPago basicGetTheReciboPago() {
		return theReciboPago;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheReciboPago(ReciboPago newTheReciboPago, NotificationChain msgs) {
		ReciboPago oldTheReciboPago = theReciboPago;
		theReciboPago = newTheReciboPago;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.COMPRA__THE_RECIBO_PAGO, oldTheReciboPago, newTheReciboPago);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheReciboPago(ReciboPago newTheReciboPago) {
		if (newTheReciboPago != theReciboPago) {
			NotificationChain msgs = null;
			if (theReciboPago != null)
				msgs = ((InternalEObject)theReciboPago).eInverseRemove(this, DomainPackage.RECIBO_PAGO__THE_COMPRA, ReciboPago.class, msgs);
			if (newTheReciboPago != null)
				msgs = ((InternalEObject)newTheReciboPago).eInverseAdd(this, DomainPackage.RECIBO_PAGO__THE_COMPRA, ReciboPago.class, msgs);
			msgs = basicSetTheReciboPago(newTheReciboPago, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.COMPRA__THE_RECIBO_PAGO, newTheReciboPago, newTheReciboPago));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pedido getThePedido() {
		if (thePedido != null && thePedido.eIsProxy()) {
			InternalEObject oldThePedido = (InternalEObject)thePedido;
			thePedido = (Pedido)eResolveProxy(oldThePedido);
			if (thePedido != oldThePedido) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.COMPRA__THE_PEDIDO, oldThePedido, thePedido));
			}
		}
		return thePedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pedido basicGetThePedido() {
		return thePedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThePedido(Pedido newThePedido, NotificationChain msgs) {
		Pedido oldThePedido = thePedido;
		thePedido = newThePedido;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.COMPRA__THE_PEDIDO, oldThePedido, newThePedido);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThePedido(Pedido newThePedido) {
		if (newThePedido != thePedido) {
			NotificationChain msgs = null;
			if (thePedido != null)
				msgs = ((InternalEObject)thePedido).eInverseRemove(this, DomainPackage.PEDIDO__THE_COMPRA, Pedido.class, msgs);
			if (newThePedido != null)
				msgs = ((InternalEObject)newThePedido).eInverseAdd(this, DomainPackage.PEDIDO__THE_COMPRA, Pedido.class, msgs);
			msgs = basicSetThePedido(newThePedido, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.COMPRA__THE_PEDIDO, newThePedido, newThePedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.COMPRA__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((Domain)otherEnd, msgs);
			case DomainPackage.COMPRA__THE_RECIBO_PAGO:
				if (theReciboPago != null)
					msgs = ((InternalEObject)theReciboPago).eInverseRemove(this, DomainPackage.RECIBO_PAGO__THE_COMPRA, ReciboPago.class, msgs);
				return basicSetTheReciboPago((ReciboPago)otherEnd, msgs);
			case DomainPackage.COMPRA__THE_PEDIDO:
				if (thePedido != null)
					msgs = ((InternalEObject)thePedido).eInverseRemove(this, DomainPackage.PEDIDO__THE_COMPRA, Pedido.class, msgs);
				return basicSetThePedido((Pedido)otherEnd, msgs);
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
			case DomainPackage.COMPRA__DOMAIN:
				return basicSetDomain(null, msgs);
			case DomainPackage.COMPRA__THE_RECIBO_PAGO:
				return basicSetTheReciboPago(null, msgs);
			case DomainPackage.COMPRA__THE_PEDIDO:
				return basicSetThePedido(null, msgs);
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
			case DomainPackage.COMPRA__DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LISTA_COMPRAS, Domain.class, msgs);
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
			case DomainPackage.COMPRA__CODIGO:
				return getCodigo();
			case DomainPackage.COMPRA__ID_CLIENTE:
				return getIdCliente();
			case DomainPackage.COMPRA__CODIGO_P:
				return getCodigoP();
			case DomainPackage.COMPRA__FECHA:
				return getFecha();
			case DomainPackage.COMPRA__TOTAL:
				return getTotal();
			case DomainPackage.COMPRA__DOMAIN:
				return getDomain();
			case DomainPackage.COMPRA__THE_RECIBO_PAGO:
				if (resolve) return getTheReciboPago();
				return basicGetTheReciboPago();
			case DomainPackage.COMPRA__THE_PEDIDO:
				if (resolve) return getThePedido();
				return basicGetThePedido();
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
			case DomainPackage.COMPRA__CODIGO:
				setCodigo((String)newValue);
				return;
			case DomainPackage.COMPRA__ID_CLIENTE:
				setIdCliente((String)newValue);
				return;
			case DomainPackage.COMPRA__CODIGO_P:
				setCodigoP((String)newValue);
				return;
			case DomainPackage.COMPRA__FECHA:
				setFecha((String)newValue);
				return;
			case DomainPackage.COMPRA__TOTAL:
				setTotal((Integer)newValue);
				return;
			case DomainPackage.COMPRA__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case DomainPackage.COMPRA__THE_RECIBO_PAGO:
				setTheReciboPago((ReciboPago)newValue);
				return;
			case DomainPackage.COMPRA__THE_PEDIDO:
				setThePedido((Pedido)newValue);
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
			case DomainPackage.COMPRA__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case DomainPackage.COMPRA__ID_CLIENTE:
				setIdCliente(ID_CLIENTE_EDEFAULT);
				return;
			case DomainPackage.COMPRA__CODIGO_P:
				setCodigoP(CODIGO_P_EDEFAULT);
				return;
			case DomainPackage.COMPRA__FECHA:
				setFecha(FECHA_EDEFAULT);
				return;
			case DomainPackage.COMPRA__TOTAL:
				setTotal(TOTAL_EDEFAULT);
				return;
			case DomainPackage.COMPRA__DOMAIN:
				setDomain((Domain)null);
				return;
			case DomainPackage.COMPRA__THE_RECIBO_PAGO:
				setTheReciboPago((ReciboPago)null);
				return;
			case DomainPackage.COMPRA__THE_PEDIDO:
				setThePedido((Pedido)null);
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
			case DomainPackage.COMPRA__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case DomainPackage.COMPRA__ID_CLIENTE:
				return ID_CLIENTE_EDEFAULT == null ? idCliente != null : !ID_CLIENTE_EDEFAULT.equals(idCliente);
			case DomainPackage.COMPRA__CODIGO_P:
				return CODIGO_P_EDEFAULT == null ? codigoP != null : !CODIGO_P_EDEFAULT.equals(codigoP);
			case DomainPackage.COMPRA__FECHA:
				return FECHA_EDEFAULT == null ? fecha != null : !FECHA_EDEFAULT.equals(fecha);
			case DomainPackage.COMPRA__TOTAL:
				return total != TOTAL_EDEFAULT;
			case DomainPackage.COMPRA__DOMAIN:
				return getDomain() != null;
			case DomainPackage.COMPRA__THE_RECIBO_PAGO:
				return theReciboPago != null;
			case DomainPackage.COMPRA__THE_PEDIDO:
				return thePedido != null;
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
		result.append(" (codigo: ");
		result.append(codigo);
		result.append(", idCliente: ");
		result.append(idCliente);
		result.append(", codigoP: ");
		result.append(codigoP);
		result.append(", fecha: ");
		result.append(fecha);
		result.append(", total: ");
		result.append(total);
		result.append(')');
		return result.toString();
	}

} //CompraImpl
