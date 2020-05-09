/**
 */
package tiendacristal.ui.contenedorcrudpedido;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoFactory
 * @model kind="package"
 * @generated
 */
public interface ContenedorcrudpedidoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenedorcrudpedido";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tiendacristal/ui/contenedorcrudpedido.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tiendacristal.ui.contenedorcrudpedido";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorcrudpedidoPackage eINSTANCE = tiendacristal.ui.contenedorcrudpedido.impl.ContenedorcrudpedidoPackageImpl.init();

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorCRUDPedidoViewModelImpl <em>Contenedor CRUD Pedido View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorCRUDPedidoViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorcrudpedidoPackageImpl#getContenedorCRUDPedidoViewModel()
	 * @generated
	 */
	int CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Detalle Pedido View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Maestro Pedido View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor CRUD Pedido View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL___IMPLEMENTAR_MODELO = 0;

	/**
	 * The operation id for the '<em>Crear Pedido</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL___CREAR_PEDIDO = 1;

	/**
	 * The operation id for the '<em>Crear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL___CREAR = 2;

	/**
	 * The number of operations of the '<em>Contenedor CRUD Pedido View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorDetallePedidoViewModelImpl <em>Contenedor Detalle Pedido View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorDetallePedidoViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorcrudpedidoPackageImpl#getContenedorDetallePedidoViewModel()
	 * @generated
	 */
	int CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Id Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__ID_CLIENTE = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CODIGO = 1;

	/**
	 * The feature id for the '<em><b>Fecha Pedido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__FECHA_PEDIDO = 2;

	/**
	 * The feature id for the '<em><b>Contenedor CRUD Pedido View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>The Contenedor Maestro Cliente View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = 4;

	/**
	 * The feature id for the '<em><b>The Contenedor Mestro Productos View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL = 5;

	/**
	 * The number of structural features of the '<em>Contenedor Detalle Pedido View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Contenedor Detalle Pedido View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorMaestroPedidoViewModelImpl <em>Contenedor Maestro Pedido View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorMaestroPedidoViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorcrudpedidoPackageImpl#getContenedorMaestroPedidoViewModel()
	 * @generated
	 */
	int CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Contenedor Detalle Compra View Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Contenedor CRUD Pedido View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Lista Producto Comprar View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__LISTA_PRODUCTO_COMPRAR_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor Maestro Pedido View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contenedor Maestro Pedido View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudpedido.impl.ProductoComprarViewModelImpl <em>Producto Comprar View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudpedido.impl.ProductoComprarViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorcrudpedidoPackageImpl#getProductoComprarViewModel()
	 * @generated
	 */
	int PRODUCTO_COMPRAR_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_COMPRAR_VIEW_MODEL__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_COMPRAR_VIEW_MODEL__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_COMPRAR_VIEW_MODEL__PRECIO = 2;

	/**
	 * The feature id for the '<em><b>Categoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_COMPRAR_VIEW_MODEL__CATEGORIA = 3;

	/**
	 * The feature id for the '<em><b>Contenedor Maestro Pedido View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL = 4;

	/**
	 * The number of structural features of the '<em>Producto Comprar View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_COMPRAR_VIEW_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Producto Comprar View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_COMPRAR_VIEW_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel <em>Contenedor CRUD Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor CRUD Pedido View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel
	 * @generated
	 */
	EClass getContenedorCRUDPedidoViewModel();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UI</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getUI()
	 * @see #getContenedorCRUDPedidoViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDPedidoViewModel_UI();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getTheContenedorDetallePedidoViewModel <em>The Contenedor Detalle Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Detalle Pedido View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getTheContenedorDetallePedidoViewModel()
	 * @see #getContenedorCRUDPedidoViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDPedidoViewModel_TheContenedorDetallePedidoViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getTheContenedorMaestroPedidoViewModel <em>The Contenedor Maestro Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Maestro Pedido View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getTheContenedorMaestroPedidoViewModel()
	 * @see #getContenedorCRUDPedidoViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDPedidoViewModel_TheContenedorMaestroPedidoViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#implementarModelo()
	 * @generated
	 */
	EOperation getContenedorCRUDPedidoViewModel__ImplementarModelo();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#crearPedido() <em>Crear Pedido</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Pedido</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#crearPedido()
	 * @generated
	 */
	EOperation getContenedorCRUDPedidoViewModel__CrearPedido();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#crear() <em>Crear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#crear()
	 * @generated
	 */
	EOperation getContenedorCRUDPedidoViewModel__Crear();

	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel <em>Contenedor Detalle Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Detalle Pedido View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel
	 * @generated
	 */
	EClass getContenedorDetallePedidoViewModel();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getIdCliente <em>Id Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Cliente</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getIdCliente()
	 * @see #getContenedorDetallePedidoViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetallePedidoViewModel_IdCliente();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getCodigo()
	 * @see #getContenedorDetallePedidoViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetallePedidoViewModel_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getFechaPedido <em>Fecha Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Pedido</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getFechaPedido()
	 * @see #getContenedorDetallePedidoViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetallePedidoViewModel_FechaPedido();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getContenedorCRUDPedidoViewModel <em>Contenedor CRUD Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor CRUD Pedido View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getContenedorCRUDPedidoViewModel()
	 * @see #getContenedorDetallePedidoViewModel()
	 * @generated
	 */
	EReference getContenedorDetallePedidoViewModel_ContenedorCRUDPedidoViewModel();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Maestro Cliente View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getTheContenedorMaestroClienteViewModel()
	 * @see #getContenedorDetallePedidoViewModel()
	 * @generated
	 */
	EReference getContenedorDetallePedidoViewModel_TheContenedorMaestroClienteViewModel();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getTheContenedorMestroProductosViewModel <em>The Contenedor Mestro Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Mestro Productos View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getTheContenedorMestroProductosViewModel()
	 * @see #getContenedorDetallePedidoViewModel()
	 * @generated
	 */
	EReference getContenedorDetallePedidoViewModel_TheContenedorMestroProductosViewModel();

	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel <em>Contenedor Maestro Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Maestro Pedido View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel
	 * @generated
	 */
	EClass getContenedorMaestroPedidoViewModel();

	/**
	 * Returns the meta object for the reference list '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getContenedorDetalleCompraViewModel <em>Contenedor Detalle Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contenedor Detalle Compra View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getContenedorDetalleCompraViewModel()
	 * @see #getContenedorMaestroPedidoViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroPedidoViewModel_ContenedorDetalleCompraViewModel();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getContenedorCRUDPedidoViewModel <em>Contenedor CRUD Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor CRUD Pedido View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getContenedorCRUDPedidoViewModel()
	 * @see #getContenedorMaestroPedidoViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroPedidoViewModel_ContenedorCRUDPedidoViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getListaProductoComprarViewModel <em>Lista Producto Comprar View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Producto Comprar View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getListaProductoComprarViewModel()
	 * @see #getContenedorMaestroPedidoViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroPedidoViewModel_ListaProductoComprarViewModel();

	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel <em>Producto Comprar View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producto Comprar View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel
	 * @generated
	 */
	EClass getProductoComprarViewModel();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getCodigo()
	 * @see #getProductoComprarViewModel()
	 * @generated
	 */
	EAttribute getProductoComprarViewModel_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getNombre()
	 * @see #getProductoComprarViewModel()
	 * @generated
	 */
	EAttribute getProductoComprarViewModel_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getPrecio <em>Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getPrecio()
	 * @see #getProductoComprarViewModel()
	 * @generated
	 */
	EAttribute getProductoComprarViewModel_Precio();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getCategoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categoria</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getCategoria()
	 * @see #getProductoComprarViewModel()
	 * @generated
	 */
	EAttribute getProductoComprarViewModel_Categoria();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getContenedorMaestroPedidoViewModel <em>Contenedor Maestro Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor Maestro Pedido View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getContenedorMaestroPedidoViewModel()
	 * @see #getProductoComprarViewModel()
	 * @generated
	 */
	EReference getProductoComprarViewModel_ContenedorMaestroPedidoViewModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenedorcrudpedidoFactory getContenedorcrudpedidoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorCRUDPedidoViewModelImpl <em>Contenedor CRUD Pedido View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorCRUDPedidoViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorcrudpedidoPackageImpl#getContenedorCRUDPedidoViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL = eINSTANCE.getContenedorCRUDPedidoViewModel();

		/**
		 * The meta object literal for the '<em><b>UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI = eINSTANCE.getContenedorCRUDPedidoViewModel_UI();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Detalle Pedido View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL = eINSTANCE.getContenedorCRUDPedidoViewModel_TheContenedorDetallePedidoViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Maestro Pedido View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL = eINSTANCE.getContenedorCRUDPedidoViewModel_TheContenedorMaestroPedidoViewModel();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL___IMPLEMENTAR_MODELO = eINSTANCE.getContenedorCRUDPedidoViewModel__ImplementarModelo();

		/**
		 * The meta object literal for the '<em><b>Crear Pedido</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL___CREAR_PEDIDO = eINSTANCE.getContenedorCRUDPedidoViewModel__CrearPedido();

		/**
		 * The meta object literal for the '<em><b>Crear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL___CREAR = eINSTANCE.getContenedorCRUDPedidoViewModel__Crear();

		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorDetallePedidoViewModelImpl <em>Contenedor Detalle Pedido View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorDetallePedidoViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorcrudpedidoPackageImpl#getContenedorDetallePedidoViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL = eINSTANCE.getContenedorDetallePedidoViewModel();

		/**
		 * The meta object literal for the '<em><b>Id Cliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__ID_CLIENTE = eINSTANCE.getContenedorDetallePedidoViewModel_IdCliente();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CODIGO = eINSTANCE.getContenedorDetallePedidoViewModel_Codigo();

		/**
		 * The meta object literal for the '<em><b>Fecha Pedido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__FECHA_PEDIDO = eINSTANCE.getContenedorDetallePedidoViewModel_FechaPedido();

		/**
		 * The meta object literal for the '<em><b>Contenedor CRUD Pedido View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL = eINSTANCE.getContenedorDetallePedidoViewModel_ContenedorCRUDPedidoViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Maestro Cliente View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorDetallePedidoViewModel_TheContenedorMaestroClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Mestro Productos View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL = eINSTANCE.getContenedorDetallePedidoViewModel_TheContenedorMestroProductosViewModel();

		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorMaestroPedidoViewModelImpl <em>Contenedor Maestro Pedido View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorMaestroPedidoViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorcrudpedidoPackageImpl#getContenedorMaestroPedidoViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL = eINSTANCE.getContenedorMaestroPedidoViewModel();

		/**
		 * The meta object literal for the '<em><b>Contenedor Detalle Compra View Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL = eINSTANCE.getContenedorMaestroPedidoViewModel_ContenedorDetalleCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>Contenedor CRUD Pedido View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL = eINSTANCE.getContenedorMaestroPedidoViewModel_ContenedorCRUDPedidoViewModel();

		/**
		 * The meta object literal for the '<em><b>Lista Producto Comprar View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__LISTA_PRODUCTO_COMPRAR_VIEW_MODEL = eINSTANCE.getContenedorMaestroPedidoViewModel_ListaProductoComprarViewModel();

		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudpedido.impl.ProductoComprarViewModelImpl <em>Producto Comprar View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudpedido.impl.ProductoComprarViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudpedido.impl.ContenedorcrudpedidoPackageImpl#getProductoComprarViewModel()
		 * @generated
		 */
		EClass PRODUCTO_COMPRAR_VIEW_MODEL = eINSTANCE.getProductoComprarViewModel();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO_COMPRAR_VIEW_MODEL__CODIGO = eINSTANCE.getProductoComprarViewModel_Codigo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO_COMPRAR_VIEW_MODEL__NOMBRE = eINSTANCE.getProductoComprarViewModel_Nombre();

		/**
		 * The meta object literal for the '<em><b>Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO_COMPRAR_VIEW_MODEL__PRECIO = eINSTANCE.getProductoComprarViewModel_Precio();

		/**
		 * The meta object literal for the '<em><b>Categoria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO_COMPRAR_VIEW_MODEL__CATEGORIA = eINSTANCE.getProductoComprarViewModel_Categoria();

		/**
		 * The meta object literal for the '<em><b>Contenedor Maestro Pedido View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL = eINSTANCE.getProductoComprarViewModel_ContenedorMaestroPedidoViewModel();

	}

} //ContenedorcrudpedidoPackage
