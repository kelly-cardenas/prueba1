/**
 */
package tiendacristal.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tiendacristal.domain.Cliente;
import tiendacristal.domain.Compra;
import tiendacristal.domain.Domain;
import tiendacristal.domain.DomainPackage;
import tiendacristal.domain.Pedido;
import tiendacristal.domain.Producto;
import tiendacristal.domain.Vendedor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pedido</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.impl.PedidoImpl#getIdCliente <em>Id Cliente</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.PedidoImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.PedidoImpl#getFechaPedido <em>Fecha Pedido</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.PedidoImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.PedidoImpl#getTheCompra <em>The Compra</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.PedidoImpl#getTheCliente <em>The Cliente</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.PedidoImpl#getListaProductos <em>Lista Productos</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.PedidoImpl#getTheVendedor <em>The Vendedor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PedidoImpl extends MinimalEObjectImpl.Container implements Pedido {
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
	 * The default value of the '{@link #getFechaPedido() <em>Fecha Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaPedido()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_PEDIDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaPedido() <em>Fecha Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaPedido()
	 * @generated
	 * @ordered
	 */
	protected String fechaPedido = FECHA_PEDIDO_EDEFAULT;

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
	 * The cached value of the '{@link #getTheCliente() <em>The Cliente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheCliente()
	 * @generated
	 * @ordered
	 */
	protected Cliente theCliente;

	/**
	 * The cached value of the '{@link #getListaProductos() <em>Lista Productos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaProductos()
	 * @generated
	 * @ordered
	 */
	protected EList<Producto> listaProductos;

	/**
	 * The cached value of the '{@link #getTheVendedor() <em>The Vendedor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheVendedor()
	 * @generated
	 * @ordered
	 */
	protected Vendedor theVendedor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedidoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.PEDIDO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PEDIDO__ID_CLIENTE, oldIdCliente, idCliente));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PEDIDO__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaPedido() {
		return fechaPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaPedido(String newFechaPedido) {
		String oldFechaPedido = fechaPedido;
		fechaPedido = newFechaPedido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PEDIDO__FECHA_PEDIDO, oldFechaPedido, fechaPedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomain() {
		if (eContainerFeatureID() != DomainPackage.PEDIDO__DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, DomainPackage.PEDIDO__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Domain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.PEDIDO__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, DomainPackage.DOMAIN__LISTA_PEDIDOS, Domain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PEDIDO__DOMAIN, newDomain, newDomain));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.PEDIDO__THE_COMPRA, oldTheCompra, theCompra));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.PEDIDO__THE_COMPRA, oldTheCompra, newTheCompra);
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
				msgs = ((InternalEObject)theCompra).eInverseRemove(this, DomainPackage.COMPRA__THE_PEDIDO, Compra.class, msgs);
			if (newTheCompra != null)
				msgs = ((InternalEObject)newTheCompra).eInverseAdd(this, DomainPackage.COMPRA__THE_PEDIDO, Compra.class, msgs);
			msgs = basicSetTheCompra(newTheCompra, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PEDIDO__THE_COMPRA, newTheCompra, newTheCompra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente getTheCliente() {
		if (theCliente != null && theCliente.eIsProxy()) {
			InternalEObject oldTheCliente = (InternalEObject)theCliente;
			theCliente = (Cliente)eResolveProxy(oldTheCliente);
			if (theCliente != oldTheCliente) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.PEDIDO__THE_CLIENTE, oldTheCliente, theCliente));
			}
		}
		return theCliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente basicGetTheCliente() {
		return theCliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheCliente(Cliente newTheCliente, NotificationChain msgs) {
		Cliente oldTheCliente = theCliente;
		theCliente = newTheCliente;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.PEDIDO__THE_CLIENTE, oldTheCliente, newTheCliente);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheCliente(Cliente newTheCliente) {
		if (newTheCliente != theCliente) {
			NotificationChain msgs = null;
			if (theCliente != null)
				msgs = ((InternalEObject)theCliente).eInverseRemove(this, DomainPackage.CLIENTE__LISTA_PEDIDOS, Cliente.class, msgs);
			if (newTheCliente != null)
				msgs = ((InternalEObject)newTheCliente).eInverseAdd(this, DomainPackage.CLIENTE__LISTA_PEDIDOS, Cliente.class, msgs);
			msgs = basicSetTheCliente(newTheCliente, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PEDIDO__THE_CLIENTE, newTheCliente, newTheCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Producto> getListaProductos() {
		if (listaProductos == null) {
			listaProductos = new EObjectWithInverseResolvingEList<Producto>(Producto.class, this, DomainPackage.PEDIDO__LISTA_PRODUCTOS, DomainPackage.PRODUCTO__THE_PEDIDO);
		}
		return listaProductos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendedor getTheVendedor() {
		if (theVendedor != null && theVendedor.eIsProxy()) {
			InternalEObject oldTheVendedor = (InternalEObject)theVendedor;
			theVendedor = (Vendedor)eResolveProxy(oldTheVendedor);
			if (theVendedor != oldTheVendedor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.PEDIDO__THE_VENDEDOR, oldTheVendedor, theVendedor));
			}
		}
		return theVendedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendedor basicGetTheVendedor() {
		return theVendedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheVendedor(Vendedor newTheVendedor, NotificationChain msgs) {
		Vendedor oldTheVendedor = theVendedor;
		theVendedor = newTheVendedor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.PEDIDO__THE_VENDEDOR, oldTheVendedor, newTheVendedor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheVendedor(Vendedor newTheVendedor) {
		if (newTheVendedor != theVendedor) {
			NotificationChain msgs = null;
			if (theVendedor != null)
				msgs = ((InternalEObject)theVendedor).eInverseRemove(this, DomainPackage.VENDEDOR__LISTA_PEDIDOS, Vendedor.class, msgs);
			if (newTheVendedor != null)
				msgs = ((InternalEObject)newTheVendedor).eInverseAdd(this, DomainPackage.VENDEDOR__LISTA_PEDIDOS, Vendedor.class, msgs);
			msgs = basicSetTheVendedor(newTheVendedor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PEDIDO__THE_VENDEDOR, newTheVendedor, newTheVendedor));
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
			case DomainPackage.PEDIDO__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((Domain)otherEnd, msgs);
			case DomainPackage.PEDIDO__THE_COMPRA:
				if (theCompra != null)
					msgs = ((InternalEObject)theCompra).eInverseRemove(this, DomainPackage.COMPRA__THE_PEDIDO, Compra.class, msgs);
				return basicSetTheCompra((Compra)otherEnd, msgs);
			case DomainPackage.PEDIDO__THE_CLIENTE:
				if (theCliente != null)
					msgs = ((InternalEObject)theCliente).eInverseRemove(this, DomainPackage.CLIENTE__LISTA_PEDIDOS, Cliente.class, msgs);
				return basicSetTheCliente((Cliente)otherEnd, msgs);
			case DomainPackage.PEDIDO__LISTA_PRODUCTOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaProductos()).basicAdd(otherEnd, msgs);
			case DomainPackage.PEDIDO__THE_VENDEDOR:
				if (theVendedor != null)
					msgs = ((InternalEObject)theVendedor).eInverseRemove(this, DomainPackage.VENDEDOR__LISTA_PEDIDOS, Vendedor.class, msgs);
				return basicSetTheVendedor((Vendedor)otherEnd, msgs);
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
			case DomainPackage.PEDIDO__DOMAIN:
				return basicSetDomain(null, msgs);
			case DomainPackage.PEDIDO__THE_COMPRA:
				return basicSetTheCompra(null, msgs);
			case DomainPackage.PEDIDO__THE_CLIENTE:
				return basicSetTheCliente(null, msgs);
			case DomainPackage.PEDIDO__LISTA_PRODUCTOS:
				return ((InternalEList<?>)getListaProductos()).basicRemove(otherEnd, msgs);
			case DomainPackage.PEDIDO__THE_VENDEDOR:
				return basicSetTheVendedor(null, msgs);
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
			case DomainPackage.PEDIDO__DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LISTA_PEDIDOS, Domain.class, msgs);
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
			case DomainPackage.PEDIDO__ID_CLIENTE:
				return getIdCliente();
			case DomainPackage.PEDIDO__CODIGO:
				return getCodigo();
			case DomainPackage.PEDIDO__FECHA_PEDIDO:
				return getFechaPedido();
			case DomainPackage.PEDIDO__DOMAIN:
				return getDomain();
			case DomainPackage.PEDIDO__THE_COMPRA:
				if (resolve) return getTheCompra();
				return basicGetTheCompra();
			case DomainPackage.PEDIDO__THE_CLIENTE:
				if (resolve) return getTheCliente();
				return basicGetTheCliente();
			case DomainPackage.PEDIDO__LISTA_PRODUCTOS:
				return getListaProductos();
			case DomainPackage.PEDIDO__THE_VENDEDOR:
				if (resolve) return getTheVendedor();
				return basicGetTheVendedor();
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
			case DomainPackage.PEDIDO__ID_CLIENTE:
				setIdCliente((String)newValue);
				return;
			case DomainPackage.PEDIDO__CODIGO:
				setCodigo((String)newValue);
				return;
			case DomainPackage.PEDIDO__FECHA_PEDIDO:
				setFechaPedido((String)newValue);
				return;
			case DomainPackage.PEDIDO__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case DomainPackage.PEDIDO__THE_COMPRA:
				setTheCompra((Compra)newValue);
				return;
			case DomainPackage.PEDIDO__THE_CLIENTE:
				setTheCliente((Cliente)newValue);
				return;
			case DomainPackage.PEDIDO__LISTA_PRODUCTOS:
				getListaProductos().clear();
				getListaProductos().addAll((Collection<? extends Producto>)newValue);
				return;
			case DomainPackage.PEDIDO__THE_VENDEDOR:
				setTheVendedor((Vendedor)newValue);
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
			case DomainPackage.PEDIDO__ID_CLIENTE:
				setIdCliente(ID_CLIENTE_EDEFAULT);
				return;
			case DomainPackage.PEDIDO__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case DomainPackage.PEDIDO__FECHA_PEDIDO:
				setFechaPedido(FECHA_PEDIDO_EDEFAULT);
				return;
			case DomainPackage.PEDIDO__DOMAIN:
				setDomain((Domain)null);
				return;
			case DomainPackage.PEDIDO__THE_COMPRA:
				setTheCompra((Compra)null);
				return;
			case DomainPackage.PEDIDO__THE_CLIENTE:
				setTheCliente((Cliente)null);
				return;
			case DomainPackage.PEDIDO__LISTA_PRODUCTOS:
				getListaProductos().clear();
				return;
			case DomainPackage.PEDIDO__THE_VENDEDOR:
				setTheVendedor((Vendedor)null);
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
			case DomainPackage.PEDIDO__ID_CLIENTE:
				return ID_CLIENTE_EDEFAULT == null ? idCliente != null : !ID_CLIENTE_EDEFAULT.equals(idCliente);
			case DomainPackage.PEDIDO__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case DomainPackage.PEDIDO__FECHA_PEDIDO:
				return FECHA_PEDIDO_EDEFAULT == null ? fechaPedido != null : !FECHA_PEDIDO_EDEFAULT.equals(fechaPedido);
			case DomainPackage.PEDIDO__DOMAIN:
				return getDomain() != null;
			case DomainPackage.PEDIDO__THE_COMPRA:
				return theCompra != null;
			case DomainPackage.PEDIDO__THE_CLIENTE:
				return theCliente != null;
			case DomainPackage.PEDIDO__LISTA_PRODUCTOS:
				return listaProductos != null && !listaProductos.isEmpty();
			case DomainPackage.PEDIDO__THE_VENDEDOR:
				return theVendedor != null;
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
		result.append(" (idCliente: ");
		result.append(idCliente);
		result.append(", codigo: ");
		result.append(codigo);
		result.append(", fechaPedido: ");
		result.append(fechaPedido);
		result.append(')');
		return result.toString();
	}

} //PedidoImpl
