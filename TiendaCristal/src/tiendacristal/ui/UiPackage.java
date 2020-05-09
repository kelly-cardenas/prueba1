/**
 */
package tiendacristal.ui;

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
 * @see tiendacristal.ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tiendacristal/ui.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tiendacristal.ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiPackage eINSTANCE = tiendacristal.ui.impl.UiPackageImpl.init();

	/**
	 * The meta object id for the '{@link tiendacristal.ui.impl.UIImpl <em>UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.impl.UIImpl
	 * @see tiendacristal.ui.impl.UiPackageImpl#getUI()
	 * @generated
	 */
	int UI = 0;

	/**
	 * The feature id for the '<em><b>Owned By Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__OWNED_BY_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>The Domain Asociado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_DOMAIN_ASOCIADO = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor CRUD Productos View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>The Contenedor CRUD Cliente View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>The Contenedor CRUD Realizar Compra View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL = 4;

	/**
	 * The feature id for the '<em><b>The Contenedor CRUD Pedido View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL = 5;

	/**
	 * The feature id for the '<em><b>The Contenedor Pedido View Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_CONTENEDOR_PEDIDO_VIEW_PART = 6;

	/**
	 * The number of structural features of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___IMPLEMENTAR_MODELO = 0;

	/**
	 * The operation id for the '<em>Crear Producto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___CREAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = 1;

	/**
	 * The operation id for the '<em>Crear Compra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___CREAR_COMPRA__CONTENEDORCRUDCOMPRAVIEWMODEL = 2;

	/**
	 * The operation id for the '<em>Crear Pedido</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___CREAR_PEDIDO__CONTENEDORCRUDPEDIDOVIEWMODEL = 3;

	/**
	 * The operation id for the '<em>Buscar Producto Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___BUSCAR_PRODUCTO_ID__STRING = 4;

	/**
	 * The operation id for the '<em>Agregar Lista P</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___AGREGAR_LISTA_P__CONTENEDORCRUDPRODUCTOSVIEWMODEL = 5;

	/**
	 * The operation id for the '<em>Buscar Producto Nombre</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___BUSCAR_PRODUCTO_NOMBRE__STRING = 6;

	/**
	 * The operation id for the '<em>Crear Cliente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___CREAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = 7;

	/**
	 * The operation id for the '<em>Actualizar Cliente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___ACTUALIZAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = 8;

	/**
	 * The operation id for the '<em>Eliminar Cliente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___ELIMINAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = 9;

	/**
	 * The operation id for the '<em>Buscar Cliente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___BUSCAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = 10;

	/**
	 * The operation id for the '<em>Buscar Producto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___BUSCAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = 11;

	/**
	 * The operation id for the '<em>Eliminar Producto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___ELIMINAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = 12;

	/**
	 * The operation id for the '<em>Actualizar Producto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___ACTUALIZAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = 13;

	/**
	 * The operation id for the '<em>Update Contenedor Listado Clientes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___UPDATE_CONTENEDOR_LISTADO_CLIENTES__CONTENEDORMAESTROCLIENTEVIEWMODEL = 14;

	/**
	 * The number of operations of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_COUNT = 15;


	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI</em>'.
	 * @see tiendacristal.ui.UI
	 * @generated
	 */
	EClass getUI();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.UI#getOwnedByModelFactory <em>Owned By Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Model Factory</em>'.
	 * @see tiendacristal.ui.UI#getOwnedByModelFactory()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_OwnedByModelFactory();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.ui.UI#getTheDomainAsociado <em>The Domain Asociado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Domain Asociado</em>'.
	 * @see tiendacristal.ui.UI#getTheDomainAsociado()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheDomainAsociado();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ui.UI#getTheContenedorCRUDProductosViewModel <em>The Contenedor CRUD Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor CRUD Productos View Model</em>'.
	 * @see tiendacristal.ui.UI#getTheContenedorCRUDProductosViewModel()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ui.UI#getTheContenedorCRUDClienteViewModel <em>The Contenedor CRUD Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor CRUD Cliente View Model</em>'.
	 * @see tiendacristal.ui.UI#getTheContenedorCRUDClienteViewModel()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheContenedorCRUDClienteViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ui.UI#getTheContenedorCRUDRealizarCompraViewModel <em>The Contenedor CRUD Realizar Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor CRUD Realizar Compra View Model</em>'.
	 * @see tiendacristal.ui.UI#getTheContenedorCRUDRealizarCompraViewModel()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheContenedorCRUDRealizarCompraViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ui.UI#getTheContenedorCRUDPedidoViewModel <em>The Contenedor CRUD Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor CRUD Pedido View Model</em>'.
	 * @see tiendacristal.ui.UI#getTheContenedorCRUDPedidoViewModel()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheContenedorCRUDPedidoViewModel();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.ui.UI#getTheContenedorPedidoViewPart <em>The Contenedor Pedido View Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Pedido View Part</em>'.
	 * @see tiendacristal.ui.UI#getTheContenedorPedidoViewPart()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheContenedorPedidoViewPart();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.ui.UI#implementarModelo()
	 * @generated
	 */
	EOperation getUI__ImplementarModelo();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#crearProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel) <em>Crear Producto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Producto</em>' operation.
	 * @see tiendacristal.ui.UI#crearProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel)
	 * @generated
	 */
	EOperation getUI__CrearProducto__ContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#crearCompra(tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel) <em>Crear Compra</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Compra</em>' operation.
	 * @see tiendacristal.ui.UI#crearCompra(tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel)
	 * @generated
	 */
	EOperation getUI__CrearCompra__ContenedorCRUDCompraViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#crearPedido(tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel) <em>Crear Pedido</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Pedido</em>' operation.
	 * @see tiendacristal.ui.UI#crearPedido(tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel)
	 * @generated
	 */
	EOperation getUI__CrearPedido__ContenedorCRUDPedidoViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#buscarProductoId(java.lang.String) <em>Buscar Producto Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Producto Id</em>' operation.
	 * @see tiendacristal.ui.UI#buscarProductoId(java.lang.String)
	 * @generated
	 */
	EOperation getUI__BuscarProductoId__String();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#agregarListaP(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel) <em>Agregar Lista P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Agregar Lista P</em>' operation.
	 * @see tiendacristal.ui.UI#agregarListaP(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel)
	 * @generated
	 */
	EOperation getUI__AgregarListaP__ContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#buscarProductoNombre(java.lang.String) <em>Buscar Producto Nombre</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Producto Nombre</em>' operation.
	 * @see tiendacristal.ui.UI#buscarProductoNombre(java.lang.String)
	 * @generated
	 */
	EOperation getUI__BuscarProductoNombre__String();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#crearCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel) <em>Crear Cliente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Cliente</em>' operation.
	 * @see tiendacristal.ui.UI#crearCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel)
	 * @generated
	 */
	EOperation getUI__CrearCliente__ContenedorCRUDClienteViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#actualizarCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel) <em>Actualizar Cliente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Actualizar Cliente</em>' operation.
	 * @see tiendacristal.ui.UI#actualizarCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel)
	 * @generated
	 */
	EOperation getUI__ActualizarCliente__ContenedorCRUDClienteViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#eliminarCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel) <em>Eliminar Cliente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eliminar Cliente</em>' operation.
	 * @see tiendacristal.ui.UI#eliminarCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel)
	 * @generated
	 */
	EOperation getUI__EliminarCliente__ContenedorCRUDClienteViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#buscarCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel) <em>Buscar Cliente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Cliente</em>' operation.
	 * @see tiendacristal.ui.UI#buscarCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel)
	 * @generated
	 */
	EOperation getUI__BuscarCliente__ContenedorCRUDClienteViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#buscarProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel) <em>Buscar Producto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Producto</em>' operation.
	 * @see tiendacristal.ui.UI#buscarProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel)
	 * @generated
	 */
	EOperation getUI__BuscarProducto__ContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#eliminarProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel) <em>Eliminar Producto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eliminar Producto</em>' operation.
	 * @see tiendacristal.ui.UI#eliminarProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel)
	 * @generated
	 */
	EOperation getUI__EliminarProducto__ContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#actualizarProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel) <em>Actualizar Producto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Actualizar Producto</em>' operation.
	 * @see tiendacristal.ui.UI#actualizarProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel)
	 * @generated
	 */
	EOperation getUI__ActualizarProducto__ContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.UI#updateContenedorListadoClientes(tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel) <em>Update Contenedor Listado Clientes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Contenedor Listado Clientes</em>' operation.
	 * @see tiendacristal.ui.UI#updateContenedorListadoClientes(tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel)
	 * @generated
	 */
	EOperation getUI__UpdateContenedorListadoClientes__ContenedorMaestroClienteViewModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiFactory getUiFactory();

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
		 * The meta object literal for the '{@link tiendacristal.ui.impl.UIImpl <em>UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.impl.UIImpl
		 * @see tiendacristal.ui.impl.UiPackageImpl#getUI()
		 * @generated
		 */
		EClass UI = eINSTANCE.getUI();

		/**
		 * The meta object literal for the '<em><b>Owned By Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__OWNED_BY_MODEL_FACTORY = eINSTANCE.getUI_OwnedByModelFactory();

		/**
		 * The meta object literal for the '<em><b>The Domain Asociado</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_DOMAIN_ASOCIADO = eINSTANCE.getUI_TheDomainAsociado();

		/**
		 * The meta object literal for the '<em><b>The Contenedor CRUD Productos View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL = eINSTANCE.getUI_TheContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor CRUD Cliente View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = eINSTANCE.getUI_TheContenedorCRUDClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor CRUD Realizar Compra View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL = eINSTANCE.getUI_TheContenedorCRUDRealizarCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor CRUD Pedido View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL = eINSTANCE.getUI_TheContenedorCRUDPedidoViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Pedido View Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_CONTENEDOR_PEDIDO_VIEW_PART = eINSTANCE.getUI_TheContenedorPedidoViewPart();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___IMPLEMENTAR_MODELO = eINSTANCE.getUI__ImplementarModelo();

		/**
		 * The meta object literal for the '<em><b>Crear Producto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___CREAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = eINSTANCE.getUI__CrearProducto__ContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Crear Compra</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___CREAR_COMPRA__CONTENEDORCRUDCOMPRAVIEWMODEL = eINSTANCE.getUI__CrearCompra__ContenedorCRUDCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>Crear Pedido</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___CREAR_PEDIDO__CONTENEDORCRUDPEDIDOVIEWMODEL = eINSTANCE.getUI__CrearPedido__ContenedorCRUDPedidoViewModel();

		/**
		 * The meta object literal for the '<em><b>Buscar Producto Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___BUSCAR_PRODUCTO_ID__STRING = eINSTANCE.getUI__BuscarProductoId__String();

		/**
		 * The meta object literal for the '<em><b>Agregar Lista P</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___AGREGAR_LISTA_P__CONTENEDORCRUDPRODUCTOSVIEWMODEL = eINSTANCE.getUI__AgregarListaP__ContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Buscar Producto Nombre</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___BUSCAR_PRODUCTO_NOMBRE__STRING = eINSTANCE.getUI__BuscarProductoNombre__String();

		/**
		 * The meta object literal for the '<em><b>Crear Cliente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___CREAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = eINSTANCE.getUI__CrearCliente__ContenedorCRUDClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Actualizar Cliente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___ACTUALIZAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = eINSTANCE.getUI__ActualizarCliente__ContenedorCRUDClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Eliminar Cliente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___ELIMINAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = eINSTANCE.getUI__EliminarCliente__ContenedorCRUDClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Buscar Cliente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___BUSCAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = eINSTANCE.getUI__BuscarCliente__ContenedorCRUDClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Buscar Producto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___BUSCAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = eINSTANCE.getUI__BuscarProducto__ContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Eliminar Producto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___ELIMINAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = eINSTANCE.getUI__EliminarProducto__ContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Actualizar Producto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___ACTUALIZAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = eINSTANCE.getUI__ActualizarProducto__ContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Update Contenedor Listado Clientes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___UPDATE_CONTENEDOR_LISTADO_CLIENTES__CONTENEDORMAESTROCLIENTEVIEWMODEL = eINSTANCE.getUI__UpdateContenedorListadoClientes__ContenedorMaestroClienteViewModel();

	}

} //UiPackage
