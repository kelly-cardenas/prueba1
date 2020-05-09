/**
 */
package tiendacristal.domain.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tiendacristal.TiendacristalPackage;

import tiendacristal.domain.Administrador;
import tiendacristal.domain.Cliente;
import tiendacristal.domain.Compra;
import tiendacristal.domain.DistribuidoraCristal;
import tiendacristal.domain.Domain;
import tiendacristal.domain.DomainFactory;
import tiendacristal.domain.DomainPackage;
import tiendacristal.domain.Inventario;
import tiendacristal.domain.Pedido;
import tiendacristal.domain.Producto;
import tiendacristal.domain.ReciboPago;
import tiendacristal.domain.Vendedor;

import tiendacristal.impl.TiendacristalPackageImpl;

import tiendacristal.ui.UiPackage;

import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage;

import tiendacristal.ui.contenedorcrudclientes.impl.ContenedorcrudclientesPackageImpl;

import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage;

import tiendacristal.ui.contenedorcrudpedido.impl.ContenedorcrudpedidoPackageImpl;

import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage;

import tiendacristal.ui.contenedorcrudproductos.impl.ContenedorcrudproductosPackageImpl;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage;

import tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorcrudrealizarcompraPackageImpl;

import tiendacristal.ui.contenedorpedidoviewpart.ContenedorpedidoviewpartPackage;

import tiendacristal.ui.contenedorpedidoviewpart.impl.ContenedorpedidoviewpartPackageImpl;

import tiendacristal.ui.impl.UiPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pedidoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clienteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administradorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reciboPagoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distribuidoraCristalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendedorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventarioEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tiendacristal.domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TiendacristalPackageImpl theTiendacristalPackage = (TiendacristalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI) instanceof TiendacristalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI) : TiendacristalPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		ContenedorcrudproductosPackageImpl theContenedorcrudproductosPackage = (ContenedorcrudproductosPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI) instanceof ContenedorcrudproductosPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI) : ContenedorcrudproductosPackage.eINSTANCE);
		ContenedorcrudclientesPackageImpl theContenedorcrudclientesPackage = (ContenedorcrudclientesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI) instanceof ContenedorcrudclientesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI) : ContenedorcrudclientesPackage.eINSTANCE);
		ContenedorcrudrealizarcompraPackageImpl theContenedorcrudrealizarcompraPackage = (ContenedorcrudrealizarcompraPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI) instanceof ContenedorcrudrealizarcompraPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI) : ContenedorcrudrealizarcompraPackage.eINSTANCE);
		ContenedorcrudpedidoPackageImpl theContenedorcrudpedidoPackage = (ContenedorcrudpedidoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI) instanceof ContenedorcrudpedidoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI) : ContenedorcrudpedidoPackage.eINSTANCE);
		ContenedorpedidoviewpartPackageImpl theContenedorpedidoviewpartPackage = (ContenedorpedidoviewpartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorpedidoviewpartPackage.eNS_URI) instanceof ContenedorpedidoviewpartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorpedidoviewpartPackage.eNS_URI) : ContenedorpedidoviewpartPackage.eINSTANCE);

		// Create package meta-data objects
		theDomainPackage.createPackageContents();
		theTiendacristalPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theContenedorcrudproductosPackage.createPackageContents();
		theContenedorcrudclientesPackage.createPackageContents();
		theContenedorcrudrealizarcompraPackage.createPackageContents();
		theContenedorcrudpedidoPackage.createPackageContents();
		theContenedorpedidoviewpartPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();
		theTiendacristalPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theContenedorcrudproductosPackage.initializePackageContents();
		theContenedorcrudclientesPackage.initializePackageContents();
		theContenedorcrudrealizarcompraPackage.initializePackageContents();
		theContenedorcrudpedidoPackage.initializePackageContents();
		theContenedorpedidoviewpartPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPedido() {
		return pedidoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedido_IdCliente() {
		return (EAttribute)pedidoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedido_Codigo() {
		return (EAttribute)pedidoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedido_FechaPedido() {
		return (EAttribute)pedidoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPedido_Domain() {
		return (EReference)pedidoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPedido_TheCompra() {
		return (EReference)pedidoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPedido_TheCliente() {
		return (EReference)pedidoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPedido_ListaProductos() {
		return (EReference)pedidoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPedido_TheVendedor() {
		return (EReference)pedidoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompra() {
		return compraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompra_Codigo() {
		return (EAttribute)compraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompra_IdCliente() {
		return (EAttribute)compraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompra_CodigoP() {
		return (EAttribute)compraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompra_Fecha() {
		return (EAttribute)compraEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompra_Total() {
		return (EAttribute)compraEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompra_Domain() {
		return (EReference)compraEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompra_TheReciboPago() {
		return (EReference)compraEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompra_ThePedido() {
		return (EReference)compraEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCliente() {
		return clienteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_Nombre() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_Codigo() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_TipoCliente() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCliente_Domain() {
		return (EReference)clienteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCliente_ListaPedidos() {
		return (EReference)clienteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrador() {
		return administradorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrador_Domain() {
		return (EReference)administradorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProducto() {
		return productoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducto_Codigo() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducto_Precio() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducto_Categoria() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducto_Nombre() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProducto_Domain() {
		return (EReference)productoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProducto_ThePedido() {
		return (EReference)productoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReciboPago() {
		return reciboPagoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReciboPago_CodigoFactura() {
		return (EAttribute)reciboPagoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReciboPago_CostoTotalPedido() {
		return (EAttribute)reciboPagoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReciboPago_Domain() {
		return (EReference)reciboPagoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReciboPago_TheCompra() {
		return (EReference)reciboPagoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheUIAsociado() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_OwnedByModelFactory() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_ListaPedidos() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_ListaCompras() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheAdministrador() {
		return (EReference)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_ListaClientes() {
		return (EReference)domainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_ListaProductos() {
		return (EReference)domainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_ListaFacturas() {
		return (EReference)domainEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheTiendaCristal() {
		return (EReference)domainEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheVendedor() {
		return (EReference)domainEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheInventario() {
		return (EReference)domainEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__ImplementarModelo() {
		return domainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__CrearProducto__ContenedorCRUDProductosViewModel() {
		return domainEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__CrearCompra__ContenedorCRUDCompraViewModel() {
		return domainEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__CrearPedido__ContenedorCRUDPedidoViewModel() {
		return domainEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__BuscarProductoId__String() {
		return domainEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__AgregarListaP__ContenedorCRUDProductosViewModel() {
		return domainEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__BuscarProductoNombre__String() {
		return domainEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__CrearCliente__ContenedorCRUDClienteViewModel() {
		return domainEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__ActualizarCliente__ContenedorCRUDClienteViewModel() {
		return domainEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__EliminarCliente__ContenedorCRUDClienteViewModel() {
		return domainEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__BuscarCliente__ContenedorCRUDClienteViewModel() {
		return domainEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__BuscarClienteId__String() {
		return domainEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__BuscarProducto__ContenedorCRUDProductosViewModel() {
		return domainEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__EliminarProducto__ContenedorCRUDProductosViewModel() {
		return domainEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__ActualizarProducto__ContenedorCRUDProductosViewModel() {
		return domainEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomain__UpdateContenedorListadoClientes__ContenedorMaestroClienteViewModel() {
		return domainEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistribuidoraCristal() {
		return distribuidoraCristalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribuidoraCristal_Nombre() {
		return (EAttribute)distribuidoraCristalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribuidoraCristal_Codigo() {
		return (EAttribute)distribuidoraCristalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribuidoraCristal_Domain() {
		return (EReference)distribuidoraCristalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVendedor() {
		return vendedorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendedor_Nombre() {
		return (EAttribute)vendedorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVendedor_Domain() {
		return (EReference)vendedorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVendedor_ListaPedidos() {
		return (EReference)vendedorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInventario() {
		return inventarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventario_Domain() {
		return (EReference)inventarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pedidoEClass = createEClass(PEDIDO);
		createEAttribute(pedidoEClass, PEDIDO__ID_CLIENTE);
		createEAttribute(pedidoEClass, PEDIDO__CODIGO);
		createEAttribute(pedidoEClass, PEDIDO__FECHA_PEDIDO);
		createEReference(pedidoEClass, PEDIDO__DOMAIN);
		createEReference(pedidoEClass, PEDIDO__THE_COMPRA);
		createEReference(pedidoEClass, PEDIDO__THE_CLIENTE);
		createEReference(pedidoEClass, PEDIDO__LISTA_PRODUCTOS);
		createEReference(pedidoEClass, PEDIDO__THE_VENDEDOR);

		compraEClass = createEClass(COMPRA);
		createEAttribute(compraEClass, COMPRA__CODIGO);
		createEAttribute(compraEClass, COMPRA__ID_CLIENTE);
		createEAttribute(compraEClass, COMPRA__CODIGO_P);
		createEAttribute(compraEClass, COMPRA__FECHA);
		createEAttribute(compraEClass, COMPRA__TOTAL);
		createEReference(compraEClass, COMPRA__DOMAIN);
		createEReference(compraEClass, COMPRA__THE_RECIBO_PAGO);
		createEReference(compraEClass, COMPRA__THE_PEDIDO);

		clienteEClass = createEClass(CLIENTE);
		createEAttribute(clienteEClass, CLIENTE__NOMBRE);
		createEAttribute(clienteEClass, CLIENTE__CODIGO);
		createEAttribute(clienteEClass, CLIENTE__TIPO_CLIENTE);
		createEReference(clienteEClass, CLIENTE__DOMAIN);
		createEReference(clienteEClass, CLIENTE__LISTA_PEDIDOS);

		administradorEClass = createEClass(ADMINISTRADOR);
		createEReference(administradorEClass, ADMINISTRADOR__DOMAIN);

		productoEClass = createEClass(PRODUCTO);
		createEAttribute(productoEClass, PRODUCTO__CODIGO);
		createEAttribute(productoEClass, PRODUCTO__PRECIO);
		createEAttribute(productoEClass, PRODUCTO__CATEGORIA);
		createEAttribute(productoEClass, PRODUCTO__NOMBRE);
		createEReference(productoEClass, PRODUCTO__DOMAIN);
		createEReference(productoEClass, PRODUCTO__THE_PEDIDO);

		reciboPagoEClass = createEClass(RECIBO_PAGO);
		createEAttribute(reciboPagoEClass, RECIBO_PAGO__CODIGO_FACTURA);
		createEAttribute(reciboPagoEClass, RECIBO_PAGO__COSTO_TOTAL_PEDIDO);
		createEReference(reciboPagoEClass, RECIBO_PAGO__DOMAIN);
		createEReference(reciboPagoEClass, RECIBO_PAGO__THE_COMPRA);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__THE_UI_ASOCIADO);
		createEReference(domainEClass, DOMAIN__OWNED_BY_MODEL_FACTORY);
		createEReference(domainEClass, DOMAIN__LISTA_PEDIDOS);
		createEReference(domainEClass, DOMAIN__LISTA_COMPRAS);
		createEReference(domainEClass, DOMAIN__THE_ADMINISTRADOR);
		createEReference(domainEClass, DOMAIN__LISTA_CLIENTES);
		createEReference(domainEClass, DOMAIN__LISTA_PRODUCTOS);
		createEReference(domainEClass, DOMAIN__LISTA_FACTURAS);
		createEReference(domainEClass, DOMAIN__THE_TIENDA_CRISTAL);
		createEReference(domainEClass, DOMAIN__THE_VENDEDOR);
		createEReference(domainEClass, DOMAIN__THE_INVENTARIO);
		createEOperation(domainEClass, DOMAIN___IMPLEMENTAR_MODELO);
		createEOperation(domainEClass, DOMAIN___CREAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL);
		createEOperation(domainEClass, DOMAIN___CREAR_COMPRA__CONTENEDORCRUDCOMPRAVIEWMODEL);
		createEOperation(domainEClass, DOMAIN___CREAR_PEDIDO__CONTENEDORCRUDPEDIDOVIEWMODEL);
		createEOperation(domainEClass, DOMAIN___BUSCAR_PRODUCTO_ID__STRING);
		createEOperation(domainEClass, DOMAIN___AGREGAR_LISTA_P__CONTENEDORCRUDPRODUCTOSVIEWMODEL);
		createEOperation(domainEClass, DOMAIN___BUSCAR_PRODUCTO_NOMBRE__STRING);
		createEOperation(domainEClass, DOMAIN___CREAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL);
		createEOperation(domainEClass, DOMAIN___ACTUALIZAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL);
		createEOperation(domainEClass, DOMAIN___ELIMINAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL);
		createEOperation(domainEClass, DOMAIN___BUSCAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL);
		createEOperation(domainEClass, DOMAIN___BUSCAR_CLIENTE_ID__STRING);
		createEOperation(domainEClass, DOMAIN___BUSCAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL);
		createEOperation(domainEClass, DOMAIN___ELIMINAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL);
		createEOperation(domainEClass, DOMAIN___ACTUALIZAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL);
		createEOperation(domainEClass, DOMAIN___UPDATE_CONTENEDOR_LISTADO_CLIENTES__CONTENEDORMAESTROCLIENTEVIEWMODEL);

		distribuidoraCristalEClass = createEClass(DISTRIBUIDORA_CRISTAL);
		createEAttribute(distribuidoraCristalEClass, DISTRIBUIDORA_CRISTAL__NOMBRE);
		createEAttribute(distribuidoraCristalEClass, DISTRIBUIDORA_CRISTAL__CODIGO);
		createEReference(distribuidoraCristalEClass, DISTRIBUIDORA_CRISTAL__DOMAIN);

		vendedorEClass = createEClass(VENDEDOR);
		createEAttribute(vendedorEClass, VENDEDOR__NOMBRE);
		createEReference(vendedorEClass, VENDEDOR__DOMAIN);
		createEReference(vendedorEClass, VENDEDOR__LISTA_PEDIDOS);

		inventarioEClass = createEClass(INVENTARIO);
		createEReference(inventarioEClass, INVENTARIO__DOMAIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);
		TiendacristalPackage theTiendacristalPackage = (TiendacristalPackage)EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI);
		ContenedorcrudproductosPackage theContenedorcrudproductosPackage = (ContenedorcrudproductosPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI);
		ContenedorcrudrealizarcompraPackage theContenedorcrudrealizarcompraPackage = (ContenedorcrudrealizarcompraPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI);
		ContenedorcrudpedidoPackage theContenedorcrudpedidoPackage = (ContenedorcrudpedidoPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI);
		ContenedorcrudclientesPackage theContenedorcrudclientesPackage = (ContenedorcrudclientesPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(pedidoEClass, Pedido.class, "Pedido", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPedido_IdCliente(), ecorePackage.getEString(), "idCliente", null, 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPedido_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPedido_FechaPedido(), ecorePackage.getEString(), "fechaPedido", null, 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPedido_Domain(), this.getDomain(), this.getDomain_ListaPedidos(), "Domain", null, 0, 1, Pedido.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPedido_TheCompra(), this.getCompra(), this.getCompra_ThePedido(), "theCompra", null, 1, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPedido_TheCliente(), this.getCliente(), this.getCliente_ListaPedidos(), "theCliente", null, 1, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPedido_ListaProductos(), this.getProducto(), this.getProducto_ThePedido(), "listaProductos", null, 0, -1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPedido_TheVendedor(), this.getVendedor(), this.getVendedor_ListaPedidos(), "theVendedor", null, 1, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compraEClass, Compra.class, "Compra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompra_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Compra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompra_IdCliente(), ecorePackage.getEString(), "idCliente", null, 0, 1, Compra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompra_CodigoP(), ecorePackage.getEString(), "codigoP", null, 0, 1, Compra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompra_Fecha(), ecorePackage.getEString(), "fecha", null, 0, 1, Compra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompra_Total(), ecorePackage.getEInt(), "total", null, 0, 1, Compra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompra_Domain(), this.getDomain(), this.getDomain_ListaCompras(), "Domain", null, 0, 1, Compra.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompra_TheReciboPago(), this.getReciboPago(), this.getReciboPago_TheCompra(), "theReciboPago", null, 1, 1, Compra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompra_ThePedido(), this.getPedido(), this.getPedido_TheCompra(), "thePedido", null, 1, 1, Compra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clienteEClass, Cliente.class, "Cliente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCliente_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_TipoCliente(), ecorePackage.getEString(), "tipoCliente", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCliente_Domain(), this.getDomain(), this.getDomain_ListaClientes(), "Domain", null, 0, 1, Cliente.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCliente_ListaPedidos(), this.getPedido(), this.getPedido_TheCliente(), "listaPedidos", null, 0, -1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(administradorEClass, Administrador.class, "Administrador", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdministrador_Domain(), this.getDomain(), this.getDomain_TheAdministrador(), "Domain", null, 0, 1, Administrador.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productoEClass, Producto.class, "Producto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProducto_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducto_Precio(), ecorePackage.getEString(), "precio", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducto_Categoria(), ecorePackage.getEString(), "categoria", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducto_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProducto_Domain(), this.getDomain(), this.getDomain_ListaProductos(), "Domain", null, 0, 1, Producto.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProducto_ThePedido(), this.getPedido(), this.getPedido_ListaProductos(), "thePedido", null, 1, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reciboPagoEClass, ReciboPago.class, "ReciboPago", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReciboPago_CodigoFactura(), ecorePackage.getEString(), "codigoFactura", null, 0, 1, ReciboPago.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReciboPago_CostoTotalPedido(), ecorePackage.getEInt(), "costoTotalPedido", null, 0, 1, ReciboPago.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReciboPago_Domain(), this.getDomain(), this.getDomain_ListaFacturas(), "Domain", null, 0, 1, ReciboPago.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReciboPago_TheCompra(), this.getCompra(), this.getCompra_TheReciboPago(), "theCompra", null, 1, 1, ReciboPago.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_TheUIAsociado(), theUiPackage.getUI(), theUiPackage.getUI_TheDomainAsociado(), "theUIAsociado", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_OwnedByModelFactory(), theTiendacristalPackage.getModelFactory(), theTiendacristalPackage.getModelFactory_TheDomain(), "ownedByModelFactory", null, 0, 1, Domain.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_ListaPedidos(), this.getPedido(), this.getPedido_Domain(), "listaPedidos", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_ListaCompras(), this.getCompra(), this.getCompra_Domain(), "listaCompras", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TheAdministrador(), this.getAdministrador(), this.getAdministrador_Domain(), "theAdministrador", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_ListaClientes(), this.getCliente(), this.getCliente_Domain(), "listaClientes", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_ListaProductos(), this.getProducto(), this.getProducto_Domain(), "listaProductos", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_ListaFacturas(), this.getReciboPago(), this.getReciboPago_Domain(), "listaFacturas", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TheTiendaCristal(), this.getDistribuidoraCristal(), this.getDistribuidoraCristal_Domain(), "theTiendaCristal", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TheVendedor(), this.getVendedor(), this.getVendedor_Domain(), "theVendedor", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TheInventario(), this.getInventario(), this.getInventario_Domain(), "theInventario", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDomain__ImplementarModelo(), this.getDomain(), "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getDomain__CrearProducto__ContenedorCRUDProductosViewModel(), null, "crearProducto", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudproductosPackage.getContenedorCRUDProductosViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__CrearCompra__ContenedorCRUDCompraViewModel(), null, "crearCompra", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudrealizarcompraPackage.getContenedorCRUDCompraViewModel(), "formuario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__CrearPedido__ContenedorCRUDPedidoViewModel(), null, "crearPedido", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudpedidoPackage.getContenedorCRUDPedidoViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__BuscarProductoId__String(), this.getProducto(), "buscarProductoId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__AgregarListaP__ContenedorCRUDProductosViewModel(), null, "agregarListaP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudproductosPackage.getContenedorCRUDProductosViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__BuscarProductoNombre__String(), theContenedorcrudpedidoPackage.getProductoComprarViewModel(), "buscarProductoNombre", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nombre", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__CrearCliente__ContenedorCRUDClienteViewModel(), null, "crearCliente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudclientesPackage.getContenedorCRUDClienteViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__ActualizarCliente__ContenedorCRUDClienteViewModel(), null, "actualizarCliente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudclientesPackage.getContenedorCRUDClienteViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__EliminarCliente__ContenedorCRUDClienteViewModel(), null, "eliminarCliente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudclientesPackage.getContenedorCRUDClienteViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__BuscarCliente__ContenedorCRUDClienteViewModel(), null, "buscarCliente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudclientesPackage.getContenedorCRUDClienteViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__BuscarClienteId__String(), this.getCliente(), "buscarClienteId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__BuscarProducto__ContenedorCRUDProductosViewModel(), null, "buscarProducto", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudproductosPackage.getContenedorCRUDProductosViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__EliminarProducto__ContenedorCRUDProductosViewModel(), null, "eliminarProducto", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudproductosPackage.getContenedorCRUDProductosViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__ActualizarProducto__ContenedorCRUDProductosViewModel(), null, "actualizarProducto", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudproductosPackage.getContenedorCRUDProductosViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomain__UpdateContenedorListadoClientes__ContenedorMaestroClienteViewModel(), null, "updateContenedorListadoClientes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudclientesPackage.getContenedorMaestroClienteViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(distribuidoraCristalEClass, DistribuidoraCristal.class, "DistribuidoraCristal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistribuidoraCristal_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, DistribuidoraCristal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribuidoraCristal_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, DistribuidoraCristal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribuidoraCristal_Domain(), this.getDomain(), this.getDomain_TheTiendaCristal(), "Domain", null, 0, 1, DistribuidoraCristal.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vendedorEClass, Vendedor.class, "Vendedor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVendedor_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Vendedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVendedor_Domain(), this.getDomain(), this.getDomain_TheVendedor(), "Domain", null, 0, 1, Vendedor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVendedor_ListaPedidos(), this.getPedido(), this.getPedido_TheVendedor(), "listaPedidos", null, 0, -1, Vendedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventarioEClass, Inventario.class, "Inventario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventario_Domain(), this.getDomain(), this.getDomain_TheInventario(), "Domain", null, 0, 1, Inventario.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DomainPackageImpl
