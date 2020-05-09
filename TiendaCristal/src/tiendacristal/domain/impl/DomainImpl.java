/**
 */
package tiendacristal.domain.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tiendacristal.ModelFactory;
import tiendacristal.TiendacristalPackage;

import tiendacristal.domain.Administrador;
import tiendacristal.domain.Cliente;
import tiendacristal.domain.Compra;
import tiendacristal.domain.DistribuidoraCristal;
import tiendacristal.domain.Domain;
import tiendacristal.domain.DomainPackage;
import tiendacristal.domain.Inventario;
import tiendacristal.domain.Pedido;
import tiendacristal.domain.Producto;
import tiendacristal.domain.ReciboPago;
import tiendacristal.domain.Vendedor;

import tiendacristal.ui.UI;
import tiendacristal.ui.UiPackage;

import tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;

import tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel;

import tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.impl.DomainImpl#getTheUIAsociado <em>The UI Asociado</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.DomainImpl#getOwnedByModelFactory <em>Owned By Model Factory</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.DomainImpl#getListaPedidos <em>Lista Pedidos</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.DomainImpl#getListaCompras <em>Lista Compras</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.DomainImpl#getTheAdministrador <em>The Administrador</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.DomainImpl#getListaClientes <em>Lista Clientes</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.DomainImpl#getListaProductos <em>Lista Productos</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.DomainImpl#getListaFacturas <em>Lista Facturas</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.DomainImpl#getTheTiendaCristal <em>The Tienda Cristal</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.DomainImpl#getTheVendedor <em>The Vendedor</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.DomainImpl#getTheInventario <em>The Inventario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getTheUIAsociado() <em>The UI Asociado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUIAsociado()
	 * @generated
	 * @ordered
	 */
	protected UI theUIAsociado;

	/**
	 * The cached value of the '{@link #getListaPedidos() <em>Lista Pedidos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaPedidos()
	 * @generated
	 * @ordered
	 */
	protected EList<Pedido> listaPedidos;

	/**
	 * The cached value of the '{@link #getListaCompras() <em>Lista Compras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaCompras()
	 * @generated
	 * @ordered
	 */
	protected EList<Compra> listaCompras;

	/**
	 * The cached value of the '{@link #getTheAdministrador() <em>The Administrador</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheAdministrador()
	 * @generated
	 * @ordered
	 */
	protected Administrador theAdministrador;

	/**
	 * The cached value of the '{@link #getListaClientes() <em>Lista Clientes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaClientes()
	 * @generated
	 * @ordered
	 */
	protected EList<Cliente> listaClientes;

	/**
	 * The cached value of the '{@link #getListaProductos() <em>Lista Productos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaProductos()
	 * @generated
	 * @ordered
	 */
	protected EList<Producto> listaProductos;

	/**
	 * The cached value of the '{@link #getListaFacturas() <em>Lista Facturas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaFacturas()
	 * @generated
	 * @ordered
	 */
	protected EList<ReciboPago> listaFacturas;

	/**
	 * The cached value of the '{@link #getTheTiendaCristal() <em>The Tienda Cristal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheTiendaCristal()
	 * @generated
	 * @ordered
	 */
	protected DistribuidoraCristal theTiendaCristal;

	/**
	 * The cached value of the '{@link #getTheVendedor() <em>The Vendedor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheVendedor()
	 * @generated
	 * @ordered
	 */
	protected Vendedor theVendedor;

	/**
	 * The cached value of the '{@link #getTheInventario() <em>The Inventario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheInventario()
	 * @generated
	 * @ordered
	 */
	protected Inventario theInventario;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getTheUIAsociado() {
		if (theUIAsociado != null && theUIAsociado.eIsProxy()) {
			InternalEObject oldTheUIAsociado = (InternalEObject)theUIAsociado;
			theUIAsociado = (UI)eResolveProxy(oldTheUIAsociado);
			if (theUIAsociado != oldTheUIAsociado) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DOMAIN__THE_UI_ASOCIADO, oldTheUIAsociado, theUIAsociado));
			}
		}
		return theUIAsociado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI basicGetTheUIAsociado() {
		return theUIAsociado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheUIAsociado(UI newTheUIAsociado, NotificationChain msgs) {
		UI oldTheUIAsociado = theUIAsociado;
		theUIAsociado = newTheUIAsociado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI_ASOCIADO, oldTheUIAsociado, newTheUIAsociado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheUIAsociado(UI newTheUIAsociado) {
		if (newTheUIAsociado != theUIAsociado) {
			NotificationChain msgs = null;
			if (theUIAsociado != null)
				msgs = ((InternalEObject)theUIAsociado).eInverseRemove(this, UiPackage.UI__THE_DOMAIN_ASOCIADO, UI.class, msgs);
			if (newTheUIAsociado != null)
				msgs = ((InternalEObject)newTheUIAsociado).eInverseAdd(this, UiPackage.UI__THE_DOMAIN_ASOCIADO, UI.class, msgs);
			msgs = basicSetTheUIAsociado(newTheUIAsociado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI_ASOCIADO, newTheUIAsociado, newTheUIAsociado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getOwnedByModelFactory() {
		if (eContainerFeatureID() != DomainPackage.DOMAIN__OWNED_BY_MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByModelFactory(ModelFactory newOwnedByModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByModelFactory, DomainPackage.DOMAIN__OWNED_BY_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByModelFactory(ModelFactory newOwnedByModelFactory) {
		if (newOwnedByModelFactory != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN__OWNED_BY_MODEL_FACTORY && newOwnedByModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByModelFactory != null)
				msgs = ((InternalEObject)newOwnedByModelFactory).eInverseAdd(this, TiendacristalPackage.MODEL_FACTORY__THE_DOMAIN, ModelFactory.class, msgs);
			msgs = basicSetOwnedByModelFactory(newOwnedByModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__OWNED_BY_MODEL_FACTORY, newOwnedByModelFactory, newOwnedByModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pedido> getListaPedidos() {
		if (listaPedidos == null) {
			listaPedidos = new EObjectContainmentWithInverseEList<Pedido>(Pedido.class, this, DomainPackage.DOMAIN__LISTA_PEDIDOS, DomainPackage.PEDIDO__DOMAIN);
		}
		return listaPedidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compra> getListaCompras() {
		if (listaCompras == null) {
			listaCompras = new EObjectContainmentWithInverseEList<Compra>(Compra.class, this, DomainPackage.DOMAIN__LISTA_COMPRAS, DomainPackage.COMPRA__DOMAIN);
		}
		return listaCompras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Administrador getTheAdministrador() {
		return theAdministrador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheAdministrador(Administrador newTheAdministrador, NotificationChain msgs) {
		Administrador oldTheAdministrador = theAdministrador;
		theAdministrador = newTheAdministrador;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_ADMINISTRADOR, oldTheAdministrador, newTheAdministrador);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheAdministrador(Administrador newTheAdministrador) {
		if (newTheAdministrador != theAdministrador) {
			NotificationChain msgs = null;
			if (theAdministrador != null)
				msgs = ((InternalEObject)theAdministrador).eInverseRemove(this, DomainPackage.ADMINISTRADOR__DOMAIN, Administrador.class, msgs);
			if (newTheAdministrador != null)
				msgs = ((InternalEObject)newTheAdministrador).eInverseAdd(this, DomainPackage.ADMINISTRADOR__DOMAIN, Administrador.class, msgs);
			msgs = basicSetTheAdministrador(newTheAdministrador, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_ADMINISTRADOR, newTheAdministrador, newTheAdministrador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cliente> getListaClientes() {
		if (listaClientes == null) {
			listaClientes = new EObjectContainmentWithInverseEList<Cliente>(Cliente.class, this, DomainPackage.DOMAIN__LISTA_CLIENTES, DomainPackage.CLIENTE__DOMAIN);
		}
		return listaClientes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Producto> getListaProductos() {
		if (listaProductos == null) {
			listaProductos = new EObjectContainmentWithInverseEList<Producto>(Producto.class, this, DomainPackage.DOMAIN__LISTA_PRODUCTOS, DomainPackage.PRODUCTO__DOMAIN);
		}
		return listaProductos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReciboPago> getListaFacturas() {
		if (listaFacturas == null) {
			listaFacturas = new EObjectContainmentWithInverseEList<ReciboPago>(ReciboPago.class, this, DomainPackage.DOMAIN__LISTA_FACTURAS, DomainPackage.RECIBO_PAGO__DOMAIN);
		}
		return listaFacturas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistribuidoraCristal getTheTiendaCristal() {
		return theTiendaCristal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheTiendaCristal(DistribuidoraCristal newTheTiendaCristal, NotificationChain msgs) {
		DistribuidoraCristal oldTheTiendaCristal = theTiendaCristal;
		theTiendaCristal = newTheTiendaCristal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_TIENDA_CRISTAL, oldTheTiendaCristal, newTheTiendaCristal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheTiendaCristal(DistribuidoraCristal newTheTiendaCristal) {
		if (newTheTiendaCristal != theTiendaCristal) {
			NotificationChain msgs = null;
			if (theTiendaCristal != null)
				msgs = ((InternalEObject)theTiendaCristal).eInverseRemove(this, DomainPackage.DISTRIBUIDORA_CRISTAL__DOMAIN, DistribuidoraCristal.class, msgs);
			if (newTheTiendaCristal != null)
				msgs = ((InternalEObject)newTheTiendaCristal).eInverseAdd(this, DomainPackage.DISTRIBUIDORA_CRISTAL__DOMAIN, DistribuidoraCristal.class, msgs);
			msgs = basicSetTheTiendaCristal(newTheTiendaCristal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_TIENDA_CRISTAL, newTheTiendaCristal, newTheTiendaCristal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendedor getTheVendedor() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_VENDEDOR, oldTheVendedor, newTheVendedor);
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
				msgs = ((InternalEObject)theVendedor).eInverseRemove(this, DomainPackage.VENDEDOR__DOMAIN, Vendedor.class, msgs);
			if (newTheVendedor != null)
				msgs = ((InternalEObject)newTheVendedor).eInverseAdd(this, DomainPackage.VENDEDOR__DOMAIN, Vendedor.class, msgs);
			msgs = basicSetTheVendedor(newTheVendedor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_VENDEDOR, newTheVendedor, newTheVendedor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inventario getTheInventario() {
		return theInventario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheInventario(Inventario newTheInventario, NotificationChain msgs) {
		Inventario oldTheInventario = theInventario;
		theInventario = newTheInventario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_INVENTARIO, oldTheInventario, newTheInventario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheInventario(Inventario newTheInventario) {
		if (newTheInventario != theInventario) {
			NotificationChain msgs = null;
			if (theInventario != null)
				msgs = ((InternalEObject)theInventario).eInverseRemove(this, DomainPackage.INVENTARIO__DOMAIN, Inventario.class, msgs);
			if (newTheInventario != null)
				msgs = ((InternalEObject)newTheInventario).eInverseAdd(this, DomainPackage.INVENTARIO__DOMAIN, Inventario.class, msgs);
			msgs = basicSetTheInventario(newTheInventario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_INVENTARIO, newTheInventario, newTheInventario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain implementarModelo() {
			return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void crearProducto(final ContenedorCRUDProductosViewModel formulario) {
		
		
				Producto producto = tiendacristal.domain.DomainFactory.eINSTANCE.createProducto();
		
				producto.setNombre(formulario.getTheContenedorDetalleProductosViewmodel().getNombre());
				producto.setCodigo(formulario.getTheContenedorDetalleProductosViewmodel().getCategoria());
				producto.setCategoria(formulario.getTheContenedorDetalleProductosViewmodel().getCategoria());
				producto.setPrecio(formulario.getTheContenedorDetalleProductosViewmodel().getPrecio());
		
				getListaProductos().add(producto);
		
				tiendacristal.ui.contenedorcrudproductos.ProductosViewModel productosViewModel = tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosFactory.eINSTANCE
						.createProductosViewModel();
				
				productosViewModel.setNombre(producto.getNombre());
				productosViewModel.setPrecio(producto.getPrecio());
				productosViewModel.setCategoria(producto.getCategoria());
				productosViewModel.setCodigo(producto.getCodigo());
				
				formulario.getTheContenedorMestroProductosViewModel().getTheProductosViewModel().add(productosViewModel);
				
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void crearCompra(ContenedorCRUDCompraViewModel formuario) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void crearPedido(final ContenedorCRUDPedidoViewModel formulario) {
				
				Pedido pedido = tiendacristal.domain.DomainFactory.eINSTANCE.createPedido();
		
				pedido.setIdCliente(formulario.getTheContenedorDetallePedidoViewModel().getIdCliente());
				pedido.setFechaPedido(formulario.getTheContenedorDetallePedidoViewModel().getFechaPedido());
				pedido.setCodigo(formulario.getTheContenedorDetallePedidoViewModel().getCodigo());
				pedido.setTheCliente(buscarClienteId(formulario.getTheContenedorDetallePedidoViewModel().getIdCliente()));
				
				System.out.println("El cliente:" + pedido.getTheCliente().getNombre());
		
				for (ProductoComprarViewModel productoComprarViewModel : formulario.getTheContenedorMaestroPedidoViewModel()
						.getListaProductoComprarViewModel()) {
		
					Producto producto = tiendacristal.domain.DomainFactory.eINSTANCE.createProducto();
		
					producto.setCategoria(productoComprarViewModel.getCategoria());
					producto.setCodigo(productoComprarViewModel.getCodigo());
					producto.setNombre(productoComprarViewModel.getNombre());
					producto.setPrecio(productoComprarViewModel.getPrecio());
		
					pedido.getListaProductos().add(producto);
		
				}
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Producto buscarProductoId(final String id) {
				
						Producto resultado = null;
				
						for (Producto producto : getListaProductos()) {
				
							if (producto.getCodigo().equals(id)) {
				
								resultado = producto;
				
							}
						}
				
						return resultado;
						
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void agregarListaP(ContenedorCRUDProductosViewModel formulario) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductoComprarViewModel buscarProductoNombre(final String nombre) {
			
				ProductoComprarViewModel productoComprarViewModel = tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoFactory.eINSTANCE
						.createProductoComprarViewModel();
		
				for (Producto producto : getListaProductos()) {
		
					if (producto.getNombre().equals(nombre)) {
		
						productoComprarViewModel.setCodigo(producto.getCodigo());
		
						productoComprarViewModel.setCategoria(producto.getCategoria());
		
						productoComprarViewModel.setNombre(producto.getNombre());
		
						productoComprarViewModel.setPrecio(""+producto.getPrecio());
		
					}
				}
		
				return productoComprarViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void crearCliente(final ContenedorCRUDClienteViewModel formulario) {
		
		
				Cliente cliente = tiendacristal.domain.DomainFactory.eINSTANCE.createCliente();
		
				cliente.setCodigo(formulario.getTheContenedorDetalleClienteViewModel().getCodigo());
				cliente.setNombre(formulario.getTheContenedorDetalleClienteViewModel().getNombre());
				cliente.setTipoCliente(formulario.getTheContenedorDetalleClienteViewModel().getTipoCliente());
		
				getListaClientes().add(cliente);
		
				tiendacristal.ui.contenedorcrudclientes.ClienteViewModel clienteViewModel = tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesFactory.eINSTANCE
						.createClienteViewModel();
		
				clienteViewModel.setCodigo(cliente.getCodigo());
				clienteViewModel.setNombre(cliente.getNombre());
				clienteViewModel.setTipoCliente(cliente.getTipoCliente());
		
				formulario.getTheContenedorMaestroClienteViewModel().getTheClienteViewModel().add(clienteViewModel);
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void actualizarCliente(final ContenedorCRUDClienteViewModel formulario) {
				
				Cliente cliente = buscarClienteId(formulario.getTheContenedorDetalleClienteViewModel().getCodigo());
		
				if (cliente == null)
					return;
				
		
		//		tiendacristal.ui.contenedorcrudclientes.ClienteViewModel clienteViewModelSeleccionado = formulario
		//				.getTheContenedorMaestroClienteViewModel().getTheClienteViewModelSeleccionada();
		
				cliente.setNombre(formulario.getTheContenedorDetalleClienteViewModel().getNombre());
				cliente.setCodigo(formulario.getTheContenedorDetalleClienteViewModel().getCodigo());
				cliente.setTipoCliente(formulario.getTheContenedorDetalleClienteViewModel().getTipoCliente());
				
				formulario.update();
		
		//		if (clienteViewModelSeleccionado != null) {
		//
		//			System.out.println("Entra 3");
		//			
		//			formulario.getTheContenedorMaestroClienteViewModel().getTheClienteViewModelSeleccionada()
		//					.setNombre(cliente.getNombre());
		//			formulario.getTheContenedorMaestroClienteViewModel().getTheClienteViewModelSeleccionada()
		//					.setTipoCliente(cliente.getTipoCliente());
		//
		//			System.out.println("Entra 4");
		//		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eliminarCliente(ContenedorCRUDClienteViewModel formulario) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void buscarCliente(final ContenedorCRUDClienteViewModel formulario) {
		
		
				Cliente cliente = buscarClienteId(formulario.getTheContenedorDetalleClienteViewModel().getCodigo());
				
				if( cliente == null) 
					return;
				
				formulario.getTheContenedorDetalleClienteViewModel().setCodigo(cliente.getCodigo());
				formulario.getTheContenedorDetalleClienteViewModel().setNombre(cliente.getNombre());
				formulario.getTheContenedorDetalleClienteViewModel().setTipoCliente(cliente .getTipoCliente());
				
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente buscarClienteId(final String id) {
				
				Cliente resultado = null;
				
				for (Cliente cliente : getListaClientes()) {
		
					if (cliente.getCodigo().equals(id)) {
		
						resultado = cliente;
		
					}
				}
		
				return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void buscarProducto(final ContenedorCRUDProductosViewModel formulario) {
			
				Producto producto = buscarProductoId(formulario.getTheContenedorDetalleProductosViewmodel().getCodigo());
				
				if( producto == null) 
					return;
				
				formulario.getTheContenedorDetalleProductosViewmodel().setCodigo(producto.getCodigo());
				formulario.getTheContenedorDetalleProductosViewmodel().setNombre(producto.getNombre());
				formulario.getTheContenedorDetalleProductosViewmodel().setCategoria(producto.getCategoria());
				formulario.getTheContenedorDetalleProductosViewmodel().setPrecio(producto.getPrecio());
			
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eliminarProducto(ContenedorCRUDProductosViewModel formulario) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void actualizarProducto(final ContenedorCRUDProductosViewModel formulario) {
		
		
				Producto producto = buscarProductoId(formulario.getTheContenedorDetalleProductosViewmodel().getCodigo());
		
				if (producto == null)
					return;
		
				tiendacristal.ui.contenedorcrudproductos.ProductosViewModel productosViewModelSeleccionado = formulario
						.getTheContenedorMestroProductosViewModel().getTheProductoViewModelSeleccionado();
		
				producto.setNombre(formulario.getTheContenedorDetalleProductosViewmodel().getNombre());
				producto.setCodigo(formulario.getTheContenedorDetalleProductosViewmodel().getCodigo());
				producto.setCategoria(formulario.getTheContenedorDetalleProductosViewmodel().getCategoria());
				producto.setPrecio(formulario.getTheContenedorDetalleProductosViewmodel().getPrecio());
		
				if (productosViewModelSeleccionado != null) {
		
					formulario.getTheContenedorMestroProductosViewModel().getTheProductoViewModelSeleccionado()
							.setCodigo(producto.getCodigo());
					formulario.getTheContenedorMestroProductosViewModel().getTheProductoViewModelSeleccionado()
					.setNombre(producto.getNombre());
					formulario.getTheContenedorMestroProductosViewModel().getTheProductoViewModelSeleccionado()
					.setCategoria(producto.getCategoria());
					formulario.getTheContenedorMestroProductosViewModel().getTheProductoViewModelSeleccionado()
					.setPrecio(producto.getPrecio());
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateContenedorListadoClientes(final ContenedorMaestroClienteViewModel formulario) {
		
		
				// Limpiamos fromulario
		
				formulario.getTheClienteViewModel().clear();
		
				// Armar el listado
				for (Cliente cliente : listaClientes) {
		
					tiendacristal.ui.contenedorcrudclientes.ClienteViewModel clienteViewModel = tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesFactory.eINSTANCE
							.createClienteViewModel();
		
					clienteViewModel.setNombre(cliente.getNombre());
					clienteViewModel.setCodigo(cliente.getCodigo());
					clienteViewModel.setTipoCliente(cliente.getTipoCliente());
					formulario.getTheClienteViewModel().add(clienteViewModel);
		
				}
		
		
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
			case DomainPackage.DOMAIN__THE_UI_ASOCIADO:
				if (theUIAsociado != null)
					msgs = ((InternalEObject)theUIAsociado).eInverseRemove(this, UiPackage.UI__THE_DOMAIN_ASOCIADO, UI.class, msgs);
				return basicSetTheUIAsociado((UI)otherEnd, msgs);
			case DomainPackage.DOMAIN__OWNED_BY_MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByModelFactory((ModelFactory)otherEnd, msgs);
			case DomainPackage.DOMAIN__LISTA_PEDIDOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaPedidos()).basicAdd(otherEnd, msgs);
			case DomainPackage.DOMAIN__LISTA_COMPRAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaCompras()).basicAdd(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_ADMINISTRADOR:
				if (theAdministrador != null)
					msgs = ((InternalEObject)theAdministrador).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_ADMINISTRADOR, null, msgs);
				return basicSetTheAdministrador((Administrador)otherEnd, msgs);
			case DomainPackage.DOMAIN__LISTA_CLIENTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaClientes()).basicAdd(otherEnd, msgs);
			case DomainPackage.DOMAIN__LISTA_PRODUCTOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaProductos()).basicAdd(otherEnd, msgs);
			case DomainPackage.DOMAIN__LISTA_FACTURAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaFacturas()).basicAdd(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_TIENDA_CRISTAL:
				if (theTiendaCristal != null)
					msgs = ((InternalEObject)theTiendaCristal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_TIENDA_CRISTAL, null, msgs);
				return basicSetTheTiendaCristal((DistribuidoraCristal)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_VENDEDOR:
				if (theVendedor != null)
					msgs = ((InternalEObject)theVendedor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_VENDEDOR, null, msgs);
				return basicSetTheVendedor((Vendedor)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_INVENTARIO:
				if (theInventario != null)
					msgs = ((InternalEObject)theInventario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_INVENTARIO, null, msgs);
				return basicSetTheInventario((Inventario)otherEnd, msgs);
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
			case DomainPackage.DOMAIN__THE_UI_ASOCIADO:
				return basicSetTheUIAsociado(null, msgs);
			case DomainPackage.DOMAIN__OWNED_BY_MODEL_FACTORY:
				return basicSetOwnedByModelFactory(null, msgs);
			case DomainPackage.DOMAIN__LISTA_PEDIDOS:
				return ((InternalEList<?>)getListaPedidos()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__LISTA_COMPRAS:
				return ((InternalEList<?>)getListaCompras()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_ADMINISTRADOR:
				return basicSetTheAdministrador(null, msgs);
			case DomainPackage.DOMAIN__LISTA_CLIENTES:
				return ((InternalEList<?>)getListaClientes()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__LISTA_PRODUCTOS:
				return ((InternalEList<?>)getListaProductos()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__LISTA_FACTURAS:
				return ((InternalEList<?>)getListaFacturas()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_TIENDA_CRISTAL:
				return basicSetTheTiendaCristal(null, msgs);
			case DomainPackage.DOMAIN__THE_VENDEDOR:
				return basicSetTheVendedor(null, msgs);
			case DomainPackage.DOMAIN__THE_INVENTARIO:
				return basicSetTheInventario(null, msgs);
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
			case DomainPackage.DOMAIN__OWNED_BY_MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, TiendacristalPackage.MODEL_FACTORY__THE_DOMAIN, ModelFactory.class, msgs);
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
			case DomainPackage.DOMAIN__THE_UI_ASOCIADO:
				if (resolve) return getTheUIAsociado();
				return basicGetTheUIAsociado();
			case DomainPackage.DOMAIN__OWNED_BY_MODEL_FACTORY:
				return getOwnedByModelFactory();
			case DomainPackage.DOMAIN__LISTA_PEDIDOS:
				return getListaPedidos();
			case DomainPackage.DOMAIN__LISTA_COMPRAS:
				return getListaCompras();
			case DomainPackage.DOMAIN__THE_ADMINISTRADOR:
				return getTheAdministrador();
			case DomainPackage.DOMAIN__LISTA_CLIENTES:
				return getListaClientes();
			case DomainPackage.DOMAIN__LISTA_PRODUCTOS:
				return getListaProductos();
			case DomainPackage.DOMAIN__LISTA_FACTURAS:
				return getListaFacturas();
			case DomainPackage.DOMAIN__THE_TIENDA_CRISTAL:
				return getTheTiendaCristal();
			case DomainPackage.DOMAIN__THE_VENDEDOR:
				return getTheVendedor();
			case DomainPackage.DOMAIN__THE_INVENTARIO:
				return getTheInventario();
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
			case DomainPackage.DOMAIN__THE_UI_ASOCIADO:
				setTheUIAsociado((UI)newValue);
				return;
			case DomainPackage.DOMAIN__OWNED_BY_MODEL_FACTORY:
				setOwnedByModelFactory((ModelFactory)newValue);
				return;
			case DomainPackage.DOMAIN__LISTA_PEDIDOS:
				getListaPedidos().clear();
				getListaPedidos().addAll((Collection<? extends Pedido>)newValue);
				return;
			case DomainPackage.DOMAIN__LISTA_COMPRAS:
				getListaCompras().clear();
				getListaCompras().addAll((Collection<? extends Compra>)newValue);
				return;
			case DomainPackage.DOMAIN__THE_ADMINISTRADOR:
				setTheAdministrador((Administrador)newValue);
				return;
			case DomainPackage.DOMAIN__LISTA_CLIENTES:
				getListaClientes().clear();
				getListaClientes().addAll((Collection<? extends Cliente>)newValue);
				return;
			case DomainPackage.DOMAIN__LISTA_PRODUCTOS:
				getListaProductos().clear();
				getListaProductos().addAll((Collection<? extends Producto>)newValue);
				return;
			case DomainPackage.DOMAIN__LISTA_FACTURAS:
				getListaFacturas().clear();
				getListaFacturas().addAll((Collection<? extends ReciboPago>)newValue);
				return;
			case DomainPackage.DOMAIN__THE_TIENDA_CRISTAL:
				setTheTiendaCristal((DistribuidoraCristal)newValue);
				return;
			case DomainPackage.DOMAIN__THE_VENDEDOR:
				setTheVendedor((Vendedor)newValue);
				return;
			case DomainPackage.DOMAIN__THE_INVENTARIO:
				setTheInventario((Inventario)newValue);
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
			case DomainPackage.DOMAIN__THE_UI_ASOCIADO:
				setTheUIAsociado((UI)null);
				return;
			case DomainPackage.DOMAIN__OWNED_BY_MODEL_FACTORY:
				setOwnedByModelFactory((ModelFactory)null);
				return;
			case DomainPackage.DOMAIN__LISTA_PEDIDOS:
				getListaPedidos().clear();
				return;
			case DomainPackage.DOMAIN__LISTA_COMPRAS:
				getListaCompras().clear();
				return;
			case DomainPackage.DOMAIN__THE_ADMINISTRADOR:
				setTheAdministrador((Administrador)null);
				return;
			case DomainPackage.DOMAIN__LISTA_CLIENTES:
				getListaClientes().clear();
				return;
			case DomainPackage.DOMAIN__LISTA_PRODUCTOS:
				getListaProductos().clear();
				return;
			case DomainPackage.DOMAIN__LISTA_FACTURAS:
				getListaFacturas().clear();
				return;
			case DomainPackage.DOMAIN__THE_TIENDA_CRISTAL:
				setTheTiendaCristal((DistribuidoraCristal)null);
				return;
			case DomainPackage.DOMAIN__THE_VENDEDOR:
				setTheVendedor((Vendedor)null);
				return;
			case DomainPackage.DOMAIN__THE_INVENTARIO:
				setTheInventario((Inventario)null);
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
			case DomainPackage.DOMAIN__THE_UI_ASOCIADO:
				return theUIAsociado != null;
			case DomainPackage.DOMAIN__OWNED_BY_MODEL_FACTORY:
				return getOwnedByModelFactory() != null;
			case DomainPackage.DOMAIN__LISTA_PEDIDOS:
				return listaPedidos != null && !listaPedidos.isEmpty();
			case DomainPackage.DOMAIN__LISTA_COMPRAS:
				return listaCompras != null && !listaCompras.isEmpty();
			case DomainPackage.DOMAIN__THE_ADMINISTRADOR:
				return theAdministrador != null;
			case DomainPackage.DOMAIN__LISTA_CLIENTES:
				return listaClientes != null && !listaClientes.isEmpty();
			case DomainPackage.DOMAIN__LISTA_PRODUCTOS:
				return listaProductos != null && !listaProductos.isEmpty();
			case DomainPackage.DOMAIN__LISTA_FACTURAS:
				return listaFacturas != null && !listaFacturas.isEmpty();
			case DomainPackage.DOMAIN__THE_TIENDA_CRISTAL:
				return theTiendaCristal != null;
			case DomainPackage.DOMAIN__THE_VENDEDOR:
				return theVendedor != null;
			case DomainPackage.DOMAIN__THE_INVENTARIO:
				return theInventario != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DomainPackage.DOMAIN___IMPLEMENTAR_MODELO:
				return implementarModelo();
			case DomainPackage.DOMAIN___CREAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL:
				crearProducto((ContenedorCRUDProductosViewModel)arguments.get(0));
				return null;
			case DomainPackage.DOMAIN___CREAR_COMPRA__CONTENEDORCRUDCOMPRAVIEWMODEL:
				crearCompra((ContenedorCRUDCompraViewModel)arguments.get(0));
				return null;
			case DomainPackage.DOMAIN___CREAR_PEDIDO__CONTENEDORCRUDPEDIDOVIEWMODEL:
				crearPedido((ContenedorCRUDPedidoViewModel)arguments.get(0));
				return null;
			case DomainPackage.DOMAIN___BUSCAR_PRODUCTO_ID__STRING:
				return buscarProductoId((String)arguments.get(0));
			case DomainPackage.DOMAIN___AGREGAR_LISTA_P__CONTENEDORCRUDPRODUCTOSVIEWMODEL:
				agregarListaP((ContenedorCRUDProductosViewModel)arguments.get(0));
				return null;
			case DomainPackage.DOMAIN___BUSCAR_PRODUCTO_NOMBRE__STRING:
				return buscarProductoNombre((String)arguments.get(0));
			case DomainPackage.DOMAIN___CREAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL:
				crearCliente((ContenedorCRUDClienteViewModel)arguments.get(0));
				return null;
			case DomainPackage.DOMAIN___ACTUALIZAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL:
				actualizarCliente((ContenedorCRUDClienteViewModel)arguments.get(0));
				return null;
			case DomainPackage.DOMAIN___ELIMINAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL:
				eliminarCliente((ContenedorCRUDClienteViewModel)arguments.get(0));
				return null;
			case DomainPackage.DOMAIN___BUSCAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL:
				buscarCliente((ContenedorCRUDClienteViewModel)arguments.get(0));
				return null;
			case DomainPackage.DOMAIN___BUSCAR_CLIENTE_ID__STRING:
				return buscarClienteId((String)arguments.get(0));
			case DomainPackage.DOMAIN___BUSCAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL:
				buscarProducto((ContenedorCRUDProductosViewModel)arguments.get(0));
				return null;
			case DomainPackage.DOMAIN___ELIMINAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL:
				eliminarProducto((ContenedorCRUDProductosViewModel)arguments.get(0));
				return null;
			case DomainPackage.DOMAIN___ACTUALIZAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL:
				actualizarProducto((ContenedorCRUDProductosViewModel)arguments.get(0));
				return null;
			case DomainPackage.DOMAIN___UPDATE_CONTENEDOR_LISTADO_CLIENTES__CONTENEDORMAESTROCLIENTEVIEWMODEL:
				updateContenedorListadoClientes((ContenedorMaestroClienteViewModel)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DomainImpl
