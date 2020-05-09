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

import tiendacristal.domain.Domain;
import tiendacristal.domain.DomainPackage;
import tiendacristal.domain.Pedido;
import tiendacristal.domain.Producto;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.impl.ProductoImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.ProductoImpl#getPrecio <em>Precio</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.ProductoImpl#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.ProductoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.ProductoImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.ProductoImpl#getThePedido <em>The Pedido</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductoImpl extends MinimalEObjectImpl.Container implements Producto {
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
	 * The default value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected String precio = PRECIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategoria() <em>Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoria()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoria() <em>Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoria()
	 * @generated
	 * @ordered
	 */
	protected String categoria = CATEGORIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

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
	protected ProductoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.PRODUCTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PRODUCTO__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecio() {
		return precio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecio(String newPrecio) {
		String oldPrecio = precio;
		precio = newPrecio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PRODUCTO__PRECIO, oldPrecio, precio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoria(String newCategoria) {
		String oldCategoria = categoria;
		categoria = newCategoria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PRODUCTO__CATEGORIA, oldCategoria, categoria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PRODUCTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomain() {
		if (eContainerFeatureID() != DomainPackage.PRODUCTO__DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, DomainPackage.PRODUCTO__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Domain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.PRODUCTO__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, DomainPackage.DOMAIN__LISTA_PRODUCTOS, Domain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PRODUCTO__DOMAIN, newDomain, newDomain));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.PRODUCTO__THE_PEDIDO, oldThePedido, thePedido));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.PRODUCTO__THE_PEDIDO, oldThePedido, newThePedido);
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
				msgs = ((InternalEObject)thePedido).eInverseRemove(this, DomainPackage.PEDIDO__LISTA_PRODUCTOS, Pedido.class, msgs);
			if (newThePedido != null)
				msgs = ((InternalEObject)newThePedido).eInverseAdd(this, DomainPackage.PEDIDO__LISTA_PRODUCTOS, Pedido.class, msgs);
			msgs = basicSetThePedido(newThePedido, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PRODUCTO__THE_PEDIDO, newThePedido, newThePedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.PRODUCTO__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((Domain)otherEnd, msgs);
			case DomainPackage.PRODUCTO__THE_PEDIDO:
				if (thePedido != null)
					msgs = ((InternalEObject)thePedido).eInverseRemove(this, DomainPackage.PEDIDO__LISTA_PRODUCTOS, Pedido.class, msgs);
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
			case DomainPackage.PRODUCTO__DOMAIN:
				return basicSetDomain(null, msgs);
			case DomainPackage.PRODUCTO__THE_PEDIDO:
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
			case DomainPackage.PRODUCTO__DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LISTA_PRODUCTOS, Domain.class, msgs);
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
			case DomainPackage.PRODUCTO__CODIGO:
				return getCodigo();
			case DomainPackage.PRODUCTO__PRECIO:
				return getPrecio();
			case DomainPackage.PRODUCTO__CATEGORIA:
				return getCategoria();
			case DomainPackage.PRODUCTO__NOMBRE:
				return getNombre();
			case DomainPackage.PRODUCTO__DOMAIN:
				return getDomain();
			case DomainPackage.PRODUCTO__THE_PEDIDO:
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
			case DomainPackage.PRODUCTO__CODIGO:
				setCodigo((String)newValue);
				return;
			case DomainPackage.PRODUCTO__PRECIO:
				setPrecio((String)newValue);
				return;
			case DomainPackage.PRODUCTO__CATEGORIA:
				setCategoria((String)newValue);
				return;
			case DomainPackage.PRODUCTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case DomainPackage.PRODUCTO__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case DomainPackage.PRODUCTO__THE_PEDIDO:
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
			case DomainPackage.PRODUCTO__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case DomainPackage.PRODUCTO__PRECIO:
				setPrecio(PRECIO_EDEFAULT);
				return;
			case DomainPackage.PRODUCTO__CATEGORIA:
				setCategoria(CATEGORIA_EDEFAULT);
				return;
			case DomainPackage.PRODUCTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DomainPackage.PRODUCTO__DOMAIN:
				setDomain((Domain)null);
				return;
			case DomainPackage.PRODUCTO__THE_PEDIDO:
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
			case DomainPackage.PRODUCTO__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case DomainPackage.PRODUCTO__PRECIO:
				return PRECIO_EDEFAULT == null ? precio != null : !PRECIO_EDEFAULT.equals(precio);
			case DomainPackage.PRODUCTO__CATEGORIA:
				return CATEGORIA_EDEFAULT == null ? categoria != null : !CATEGORIA_EDEFAULT.equals(categoria);
			case DomainPackage.PRODUCTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DomainPackage.PRODUCTO__DOMAIN:
				return getDomain() != null;
			case DomainPackage.PRODUCTO__THE_PEDIDO:
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
		result.append(", precio: ");
		result.append(precio);
		result.append(", categoria: ");
		result.append(categoria);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ProductoImpl
