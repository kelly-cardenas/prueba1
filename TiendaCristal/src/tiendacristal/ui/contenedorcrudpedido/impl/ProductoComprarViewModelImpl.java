/**
 */
package tiendacristal.ui.contenedorcrudpedido.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage;
import tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Producto Comprar View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ProductoComprarViewModelImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ProductoComprarViewModelImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ProductoComprarViewModelImpl#getPrecio <em>Precio</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ProductoComprarViewModelImpl#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ProductoComprarViewModelImpl#getContenedorMaestroPedidoViewModel <em>Contenedor Maestro Pedido View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductoComprarViewModelImpl extends MinimalEObjectImpl.Container implements ProductoComprarViewModel {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductoComprarViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudpedidoPackage.Literals.PRODUCTO_COMPRAR_VIEW_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CODIGO, oldCodigo, codigo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__PRECIO, oldPrecio, precio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CATEGORIA, oldCategoria, categoria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroPedidoViewModel getContenedorMaestroPedidoViewModel() {
		if (eContainerFeatureID() != ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL) return null;
		return (ContenedorMaestroPedidoViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenedorMaestroPedidoViewModel(ContenedorMaestroPedidoViewModel newContenedorMaestroPedidoViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenedorMaestroPedidoViewModel, ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenedorMaestroPedidoViewModel(ContenedorMaestroPedidoViewModel newContenedorMaestroPedidoViewModel) {
		if (newContenedorMaestroPedidoViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL && newContenedorMaestroPedidoViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newContenedorMaestroPedidoViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenedorMaestroPedidoViewModel != null)
				msgs = ((InternalEObject)newContenedorMaestroPedidoViewModel).eInverseAdd(this, ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__LISTA_PRODUCTO_COMPRAR_VIEW_MODEL, ContenedorMaestroPedidoViewModel.class, msgs);
			msgs = basicSetContenedorMaestroPedidoViewModel(newContenedorMaestroPedidoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL, newContenedorMaestroPedidoViewModel, newContenedorMaestroPedidoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContenedorMaestroPedidoViewModel((ContenedorMaestroPedidoViewModel)otherEnd, msgs);
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
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				return basicSetContenedorMaestroPedidoViewModel(null, msgs);
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
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__LISTA_PRODUCTO_COMPRAR_VIEW_MODEL, ContenedorMaestroPedidoViewModel.class, msgs);
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
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CODIGO:
				return getCodigo();
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__NOMBRE:
				return getNombre();
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__PRECIO:
				return getPrecio();
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CATEGORIA:
				return getCategoria();
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				return getContenedorMaestroPedidoViewModel();
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
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CODIGO:
				setCodigo((String)newValue);
				return;
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__NOMBRE:
				setNombre((String)newValue);
				return;
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__PRECIO:
				setPrecio((String)newValue);
				return;
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CATEGORIA:
				setCategoria((String)newValue);
				return;
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				setContenedorMaestroPedidoViewModel((ContenedorMaestroPedidoViewModel)newValue);
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
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__PRECIO:
				setPrecio(PRECIO_EDEFAULT);
				return;
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CATEGORIA:
				setCategoria(CATEGORIA_EDEFAULT);
				return;
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				setContenedorMaestroPedidoViewModel((ContenedorMaestroPedidoViewModel)null);
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
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__PRECIO:
				return PRECIO_EDEFAULT == null ? precio != null : !PRECIO_EDEFAULT.equals(precio);
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CATEGORIA:
				return CATEGORIA_EDEFAULT == null ? categoria != null : !CATEGORIA_EDEFAULT.equals(categoria);
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				return getContenedorMaestroPedidoViewModel() != null;
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
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", precio: ");
		result.append(precio);
		result.append(", categoria: ");
		result.append(categoria);
		result.append(')');
		return result.toString();
	}

} //ProductoComprarViewModelImpl
