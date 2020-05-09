/**
 */
package tiendacristal.domain;

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
 * @see tiendacristal.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tiendacristal/domain.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tiendacristal.domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = tiendacristal.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link tiendacristal.domain.impl.PedidoImpl <em>Pedido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.domain.impl.PedidoImpl
	 * @see tiendacristal.domain.impl.DomainPackageImpl#getPedido()
	 * @generated
	 */
	int PEDIDO = 0;

	/**
	 * The feature id for the '<em><b>Id Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__ID_CLIENTE = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__CODIGO = 1;

	/**
	 * The feature id for the '<em><b>Fecha Pedido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__FECHA_PEDIDO = 2;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>The Compra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__THE_COMPRA = 4;

	/**
	 * The feature id for the '<em><b>The Cliente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__THE_CLIENTE = 5;

	/**
	 * The feature id for the '<em><b>Lista Productos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__LISTA_PRODUCTOS = 6;

	/**
	 * The feature id for the '<em><b>The Vendedor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__THE_VENDEDOR = 7;

	/**
	 * The number of structural features of the '<em>Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tiendacristal.domain.impl.CompraImpl <em>Compra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.domain.impl.CompraImpl
	 * @see tiendacristal.domain.impl.DomainPackageImpl#getCompra()
	 * @generated
	 */
	int COMPRA = 1;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Id Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA__ID_CLIENTE = 1;

	/**
	 * The feature id for the '<em><b>Codigo P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA__CODIGO_P = 2;

	/**
	 * The feature id for the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA__FECHA = 3;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA__TOTAL = 4;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA__DOMAIN = 5;

	/**
	 * The feature id for the '<em><b>The Recibo Pago</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA__THE_RECIBO_PAGO = 6;

	/**
	 * The feature id for the '<em><b>The Pedido</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA__THE_PEDIDO = 7;

	/**
	 * The number of structural features of the '<em>Compra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Compra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tiendacristal.domain.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.domain.impl.ClienteImpl
	 * @see tiendacristal.domain.impl.DomainPackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__CODIGO = 1;

	/**
	 * The feature id for the '<em><b>Tipo Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__TIPO_CLIENTE = 2;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>Lista Pedidos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__LISTA_PEDIDOS = 4;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tiendacristal.domain.impl.AdministradorImpl <em>Administrador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.domain.impl.AdministradorImpl
	 * @see tiendacristal.domain.impl.DomainPackageImpl#getAdministrador()
	 * @generated
	 */
	int ADMINISTRADOR = 3;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRADOR__DOMAIN = 0;

	/**
	 * The number of structural features of the '<em>Administrador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRADOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Administrador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRADOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tiendacristal.domain.impl.ProductoImpl <em>Producto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.domain.impl.ProductoImpl
	 * @see tiendacristal.domain.impl.DomainPackageImpl#getProducto()
	 * @generated
	 */
	int PRODUCTO = 4;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__PRECIO = 1;

	/**
	 * The feature id for the '<em><b>Categoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__CATEGORIA = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__NOMBRE = 3;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__DOMAIN = 4;

	/**
	 * The feature id for the '<em><b>The Pedido</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__THE_PEDIDO = 5;

	/**
	 * The number of structural features of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tiendacristal.domain.impl.ReciboPagoImpl <em>Recibo Pago</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.domain.impl.ReciboPagoImpl
	 * @see tiendacristal.domain.impl.DomainPackageImpl#getReciboPago()
	 * @generated
	 */
	int RECIBO_PAGO = 5;

	/**
	 * The feature id for the '<em><b>Codigo Factura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIBO_PAGO__CODIGO_FACTURA = 0;

	/**
	 * The feature id for the '<em><b>Costo Total Pedido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIBO_PAGO__COSTO_TOTAL_PEDIDO = 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIBO_PAGO__DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>The Compra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIBO_PAGO__THE_COMPRA = 3;

	/**
	 * The number of structural features of the '<em>Recibo Pago</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIBO_PAGO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Recibo Pago</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIBO_PAGO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tiendacristal.domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.domain.impl.DomainImpl
	 * @see tiendacristal.domain.impl.DomainPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 6;

	/**
	 * The feature id for the '<em><b>The UI Asociado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_UI_ASOCIADO = 0;

	/**
	 * The feature id for the '<em><b>Owned By Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__OWNED_BY_MODEL_FACTORY = 1;

	/**
	 * The feature id for the '<em><b>Lista Pedidos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LISTA_PEDIDOS = 2;

	/**
	 * The feature id for the '<em><b>Lista Compras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LISTA_COMPRAS = 3;

	/**
	 * The feature id for the '<em><b>The Administrador</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_ADMINISTRADOR = 4;

	/**
	 * The feature id for the '<em><b>Lista Clientes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LISTA_CLIENTES = 5;

	/**
	 * The feature id for the '<em><b>Lista Productos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LISTA_PRODUCTOS = 6;

	/**
	 * The feature id for the '<em><b>Lista Facturas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LISTA_FACTURAS = 7;

	/**
	 * The feature id for the '<em><b>The Tienda Cristal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_TIENDA_CRISTAL = 8;

	/**
	 * The feature id for the '<em><b>The Vendedor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_VENDEDOR = 9;

	/**
	 * The feature id for the '<em><b>The Inventario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_INVENTARIO = 10;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___IMPLEMENTAR_MODELO = 0;

	/**
	 * The operation id for the '<em>Crear Producto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___CREAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = 1;

	/**
	 * The operation id for the '<em>Crear Compra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___CREAR_COMPRA__CONTENEDORCRUDCOMPRAVIEWMODEL = 2;

	/**
	 * The operation id for the '<em>Crear Pedido</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___CREAR_PEDIDO__CONTENEDORCRUDPEDIDOVIEWMODEL = 3;

	/**
	 * The operation id for the '<em>Buscar Producto Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___BUSCAR_PRODUCTO_ID__STRING = 4;

	/**
	 * The operation id for the '<em>Agregar Lista P</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___AGREGAR_LISTA_P__CONTENEDORCRUDPRODUCTOSVIEWMODEL = 5;

	/**
	 * The operation id for the '<em>Buscar Producto Nombre</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___BUSCAR_PRODUCTO_NOMBRE__STRING = 6;

	/**
	 * The operation id for the '<em>Crear Cliente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___CREAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = 7;

	/**
	 * The operation id for the '<em>Actualizar Cliente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___ACTUALIZAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = 8;

	/**
	 * The operation id for the '<em>Eliminar Cliente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___ELIMINAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = 9;

	/**
	 * The operation id for the '<em>Buscar Cliente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___BUSCAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = 10;

	/**
	 * The operation id for the '<em>Buscar Cliente Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___BUSCAR_CLIENTE_ID__STRING = 11;

	/**
	 * The operation id for the '<em>Buscar Producto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___BUSCAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = 12;

	/**
	 * The operation id for the '<em>Eliminar Producto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___ELIMINAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = 13;

	/**
	 * The operation id for the '<em>Actualizar Producto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___ACTUALIZAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = 14;

	/**
	 * The operation id for the '<em>Update Contenedor Listado Clientes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___UPDATE_CONTENEDOR_LISTADO_CLIENTES__CONTENEDORMAESTROCLIENTEVIEWMODEL = 15;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 16;

	/**
	 * The meta object id for the '{@link tiendacristal.domain.impl.DistribuidoraCristalImpl <em>Distribuidora Cristal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.domain.impl.DistribuidoraCristalImpl
	 * @see tiendacristal.domain.impl.DomainPackageImpl#getDistribuidoraCristal()
	 * @generated
	 */
	int DISTRIBUIDORA_CRISTAL = 7;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUIDORA_CRISTAL__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUIDORA_CRISTAL__CODIGO = 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUIDORA_CRISTAL__DOMAIN = 2;

	/**
	 * The number of structural features of the '<em>Distribuidora Cristal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUIDORA_CRISTAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Distribuidora Cristal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUIDORA_CRISTAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tiendacristal.domain.impl.VendedorImpl <em>Vendedor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.domain.impl.VendedorImpl
	 * @see tiendacristal.domain.impl.DomainPackageImpl#getVendedor()
	 * @generated
	 */
	int VENDEDOR = 8;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDEDOR__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDEDOR__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Lista Pedidos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDEDOR__LISTA_PEDIDOS = 2;

	/**
	 * The number of structural features of the '<em>Vendedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDEDOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vendedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDEDOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tiendacristal.domain.impl.InventarioImpl <em>Inventario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.domain.impl.InventarioImpl
	 * @see tiendacristal.domain.impl.DomainPackageImpl#getInventario()
	 * @generated
	 */
	int INVENTARIO = 9;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTARIO__DOMAIN = 0;

	/**
	 * The number of structural features of the '<em>Inventario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTARIO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inventario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTARIO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tiendacristal.domain.Pedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedido</em>'.
	 * @see tiendacristal.domain.Pedido
	 * @generated
	 */
	EClass getPedido();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Pedido#getIdCliente <em>Id Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Cliente</em>'.
	 * @see tiendacristal.domain.Pedido#getIdCliente()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_IdCliente();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Pedido#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see tiendacristal.domain.Pedido#getCodigo()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Pedido#getFechaPedido <em>Fecha Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Pedido</em>'.
	 * @see tiendacristal.domain.Pedido#getFechaPedido()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_FechaPedido();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.domain.Pedido#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see tiendacristal.domain.Pedido#getDomain()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_Domain();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.domain.Pedido#getTheCompra <em>The Compra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Compra</em>'.
	 * @see tiendacristal.domain.Pedido#getTheCompra()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_TheCompra();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.domain.Pedido#getTheCliente <em>The Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Cliente</em>'.
	 * @see tiendacristal.domain.Pedido#getTheCliente()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_TheCliente();

	/**
	 * Returns the meta object for the reference list '{@link tiendacristal.domain.Pedido#getListaProductos <em>Lista Productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Productos</em>'.
	 * @see tiendacristal.domain.Pedido#getListaProductos()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_ListaProductos();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.domain.Pedido#getTheVendedor <em>The Vendedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Vendedor</em>'.
	 * @see tiendacristal.domain.Pedido#getTheVendedor()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_TheVendedor();

	/**
	 * Returns the meta object for class '{@link tiendacristal.domain.Compra <em>Compra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compra</em>'.
	 * @see tiendacristal.domain.Compra
	 * @generated
	 */
	EClass getCompra();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Compra#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see tiendacristal.domain.Compra#getCodigo()
	 * @see #getCompra()
	 * @generated
	 */
	EAttribute getCompra_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Compra#getIdCliente <em>Id Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Cliente</em>'.
	 * @see tiendacristal.domain.Compra#getIdCliente()
	 * @see #getCompra()
	 * @generated
	 */
	EAttribute getCompra_IdCliente();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Compra#getCodigoP <em>Codigo P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo P</em>'.
	 * @see tiendacristal.domain.Compra#getCodigoP()
	 * @see #getCompra()
	 * @generated
	 */
	EAttribute getCompra_CodigoP();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Compra#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha</em>'.
	 * @see tiendacristal.domain.Compra#getFecha()
	 * @see #getCompra()
	 * @generated
	 */
	EAttribute getCompra_Fecha();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Compra#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see tiendacristal.domain.Compra#getTotal()
	 * @see #getCompra()
	 * @generated
	 */
	EAttribute getCompra_Total();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.domain.Compra#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see tiendacristal.domain.Compra#getDomain()
	 * @see #getCompra()
	 * @generated
	 */
	EReference getCompra_Domain();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.domain.Compra#getTheReciboPago <em>The Recibo Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Recibo Pago</em>'.
	 * @see tiendacristal.domain.Compra#getTheReciboPago()
	 * @see #getCompra()
	 * @generated
	 */
	EReference getCompra_TheReciboPago();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.domain.Compra#getThePedido <em>The Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Pedido</em>'.
	 * @see tiendacristal.domain.Compra#getThePedido()
	 * @see #getCompra()
	 * @generated
	 */
	EReference getCompra_ThePedido();

	/**
	 * Returns the meta object for class '{@link tiendacristal.domain.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see tiendacristal.domain.Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Cliente#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see tiendacristal.domain.Cliente#getNombre()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Cliente#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see tiendacristal.domain.Cliente#getCodigo()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Cliente#getTipoCliente <em>Tipo Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Cliente</em>'.
	 * @see tiendacristal.domain.Cliente#getTipoCliente()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_TipoCliente();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.domain.Cliente#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see tiendacristal.domain.Cliente#getDomain()
	 * @see #getCliente()
	 * @generated
	 */
	EReference getCliente_Domain();

	/**
	 * Returns the meta object for the reference list '{@link tiendacristal.domain.Cliente#getListaPedidos <em>Lista Pedidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Pedidos</em>'.
	 * @see tiendacristal.domain.Cliente#getListaPedidos()
	 * @see #getCliente()
	 * @generated
	 */
	EReference getCliente_ListaPedidos();

	/**
	 * Returns the meta object for class '{@link tiendacristal.domain.Administrador <em>Administrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrador</em>'.
	 * @see tiendacristal.domain.Administrador
	 * @generated
	 */
	EClass getAdministrador();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.domain.Administrador#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see tiendacristal.domain.Administrador#getDomain()
	 * @see #getAdministrador()
	 * @generated
	 */
	EReference getAdministrador_Domain();

	/**
	 * Returns the meta object for class '{@link tiendacristal.domain.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producto</em>'.
	 * @see tiendacristal.domain.Producto
	 * @generated
	 */
	EClass getProducto();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Producto#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see tiendacristal.domain.Producto#getCodigo()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Producto#getPrecio <em>Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio</em>'.
	 * @see tiendacristal.domain.Producto#getPrecio()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Precio();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Producto#getCategoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categoria</em>'.
	 * @see tiendacristal.domain.Producto#getCategoria()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Categoria();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Producto#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see tiendacristal.domain.Producto#getNombre()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.domain.Producto#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see tiendacristal.domain.Producto#getDomain()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_Domain();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.domain.Producto#getThePedido <em>The Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Pedido</em>'.
	 * @see tiendacristal.domain.Producto#getThePedido()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_ThePedido();

	/**
	 * Returns the meta object for class '{@link tiendacristal.domain.ReciboPago <em>Recibo Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recibo Pago</em>'.
	 * @see tiendacristal.domain.ReciboPago
	 * @generated
	 */
	EClass getReciboPago();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.ReciboPago#getCodigoFactura <em>Codigo Factura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Factura</em>'.
	 * @see tiendacristal.domain.ReciboPago#getCodigoFactura()
	 * @see #getReciboPago()
	 * @generated
	 */
	EAttribute getReciboPago_CodigoFactura();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.ReciboPago#getCostoTotalPedido <em>Costo Total Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Costo Total Pedido</em>'.
	 * @see tiendacristal.domain.ReciboPago#getCostoTotalPedido()
	 * @see #getReciboPago()
	 * @generated
	 */
	EAttribute getReciboPago_CostoTotalPedido();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.domain.ReciboPago#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see tiendacristal.domain.ReciboPago#getDomain()
	 * @see #getReciboPago()
	 * @generated
	 */
	EReference getReciboPago_Domain();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.domain.ReciboPago#getTheCompra <em>The Compra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Compra</em>'.
	 * @see tiendacristal.domain.ReciboPago#getTheCompra()
	 * @see #getReciboPago()
	 * @generated
	 */
	EReference getReciboPago_TheCompra();

	/**
	 * Returns the meta object for class '{@link tiendacristal.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see tiendacristal.domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.domain.Domain#getTheUIAsociado <em>The UI Asociado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The UI Asociado</em>'.
	 * @see tiendacristal.domain.Domain#getTheUIAsociado()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheUIAsociado();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.domain.Domain#getOwnedByModelFactory <em>Owned By Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Model Factory</em>'.
	 * @see tiendacristal.domain.Domain#getOwnedByModelFactory()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_OwnedByModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link tiendacristal.domain.Domain#getListaPedidos <em>Lista Pedidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Pedidos</em>'.
	 * @see tiendacristal.domain.Domain#getListaPedidos()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ListaPedidos();

	/**
	 * Returns the meta object for the containment reference list '{@link tiendacristal.domain.Domain#getListaCompras <em>Lista Compras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Compras</em>'.
	 * @see tiendacristal.domain.Domain#getListaCompras()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ListaCompras();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.domain.Domain#getTheAdministrador <em>The Administrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Administrador</em>'.
	 * @see tiendacristal.domain.Domain#getTheAdministrador()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheAdministrador();

	/**
	 * Returns the meta object for the containment reference list '{@link tiendacristal.domain.Domain#getListaClientes <em>Lista Clientes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Clientes</em>'.
	 * @see tiendacristal.domain.Domain#getListaClientes()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ListaClientes();

	/**
	 * Returns the meta object for the containment reference list '{@link tiendacristal.domain.Domain#getListaProductos <em>Lista Productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Productos</em>'.
	 * @see tiendacristal.domain.Domain#getListaProductos()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ListaProductos();

	/**
	 * Returns the meta object for the containment reference list '{@link tiendacristal.domain.Domain#getListaFacturas <em>Lista Facturas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Facturas</em>'.
	 * @see tiendacristal.domain.Domain#getListaFacturas()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ListaFacturas();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.domain.Domain#getTheTiendaCristal <em>The Tienda Cristal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Tienda Cristal</em>'.
	 * @see tiendacristal.domain.Domain#getTheTiendaCristal()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheTiendaCristal();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.domain.Domain#getTheVendedor <em>The Vendedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Vendedor</em>'.
	 * @see tiendacristal.domain.Domain#getTheVendedor()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheVendedor();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.domain.Domain#getTheInventario <em>The Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Inventario</em>'.
	 * @see tiendacristal.domain.Domain#getTheInventario()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheInventario();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.domain.Domain#implementarModelo()
	 * @generated
	 */
	EOperation getDomain__ImplementarModelo();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#crearProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel) <em>Crear Producto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Producto</em>' operation.
	 * @see tiendacristal.domain.Domain#crearProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel)
	 * @generated
	 */
	EOperation getDomain__CrearProducto__ContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#crearCompra(tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel) <em>Crear Compra</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Compra</em>' operation.
	 * @see tiendacristal.domain.Domain#crearCompra(tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel)
	 * @generated
	 */
	EOperation getDomain__CrearCompra__ContenedorCRUDCompraViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#crearPedido(tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel) <em>Crear Pedido</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Pedido</em>' operation.
	 * @see tiendacristal.domain.Domain#crearPedido(tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel)
	 * @generated
	 */
	EOperation getDomain__CrearPedido__ContenedorCRUDPedidoViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#buscarProductoId(java.lang.String) <em>Buscar Producto Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Producto Id</em>' operation.
	 * @see tiendacristal.domain.Domain#buscarProductoId(java.lang.String)
	 * @generated
	 */
	EOperation getDomain__BuscarProductoId__String();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#agregarListaP(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel) <em>Agregar Lista P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Agregar Lista P</em>' operation.
	 * @see tiendacristal.domain.Domain#agregarListaP(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel)
	 * @generated
	 */
	EOperation getDomain__AgregarListaP__ContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#buscarProductoNombre(java.lang.String) <em>Buscar Producto Nombre</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Producto Nombre</em>' operation.
	 * @see tiendacristal.domain.Domain#buscarProductoNombre(java.lang.String)
	 * @generated
	 */
	EOperation getDomain__BuscarProductoNombre__String();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#crearCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel) <em>Crear Cliente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Cliente</em>' operation.
	 * @see tiendacristal.domain.Domain#crearCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel)
	 * @generated
	 */
	EOperation getDomain__CrearCliente__ContenedorCRUDClienteViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#actualizarCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel) <em>Actualizar Cliente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Actualizar Cliente</em>' operation.
	 * @see tiendacristal.domain.Domain#actualizarCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel)
	 * @generated
	 */
	EOperation getDomain__ActualizarCliente__ContenedorCRUDClienteViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#eliminarCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel) <em>Eliminar Cliente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eliminar Cliente</em>' operation.
	 * @see tiendacristal.domain.Domain#eliminarCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel)
	 * @generated
	 */
	EOperation getDomain__EliminarCliente__ContenedorCRUDClienteViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#buscarCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel) <em>Buscar Cliente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Cliente</em>' operation.
	 * @see tiendacristal.domain.Domain#buscarCliente(tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel)
	 * @generated
	 */
	EOperation getDomain__BuscarCliente__ContenedorCRUDClienteViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#buscarClienteId(java.lang.String) <em>Buscar Cliente Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Cliente Id</em>' operation.
	 * @see tiendacristal.domain.Domain#buscarClienteId(java.lang.String)
	 * @generated
	 */
	EOperation getDomain__BuscarClienteId__String();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#buscarProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel) <em>Buscar Producto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Producto</em>' operation.
	 * @see tiendacristal.domain.Domain#buscarProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel)
	 * @generated
	 */
	EOperation getDomain__BuscarProducto__ContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#eliminarProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel) <em>Eliminar Producto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eliminar Producto</em>' operation.
	 * @see tiendacristal.domain.Domain#eliminarProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel)
	 * @generated
	 */
	EOperation getDomain__EliminarProducto__ContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#actualizarProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel) <em>Actualizar Producto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Actualizar Producto</em>' operation.
	 * @see tiendacristal.domain.Domain#actualizarProducto(tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel)
	 * @generated
	 */
	EOperation getDomain__ActualizarProducto__ContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.domain.Domain#updateContenedorListadoClientes(tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel) <em>Update Contenedor Listado Clientes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Contenedor Listado Clientes</em>' operation.
	 * @see tiendacristal.domain.Domain#updateContenedorListadoClientes(tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel)
	 * @generated
	 */
	EOperation getDomain__UpdateContenedorListadoClientes__ContenedorMaestroClienteViewModel();

	/**
	 * Returns the meta object for class '{@link tiendacristal.domain.DistribuidoraCristal <em>Distribuidora Cristal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribuidora Cristal</em>'.
	 * @see tiendacristal.domain.DistribuidoraCristal
	 * @generated
	 */
	EClass getDistribuidoraCristal();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.DistribuidoraCristal#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see tiendacristal.domain.DistribuidoraCristal#getNombre()
	 * @see #getDistribuidoraCristal()
	 * @generated
	 */
	EAttribute getDistribuidoraCristal_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.DistribuidoraCristal#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see tiendacristal.domain.DistribuidoraCristal#getCodigo()
	 * @see #getDistribuidoraCristal()
	 * @generated
	 */
	EAttribute getDistribuidoraCristal_Codigo();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.domain.DistribuidoraCristal#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see tiendacristal.domain.DistribuidoraCristal#getDomain()
	 * @see #getDistribuidoraCristal()
	 * @generated
	 */
	EReference getDistribuidoraCristal_Domain();

	/**
	 * Returns the meta object for class '{@link tiendacristal.domain.Vendedor <em>Vendedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendedor</em>'.
	 * @see tiendacristal.domain.Vendedor
	 * @generated
	 */
	EClass getVendedor();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.domain.Vendedor#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see tiendacristal.domain.Vendedor#getNombre()
	 * @see #getVendedor()
	 * @generated
	 */
	EAttribute getVendedor_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.domain.Vendedor#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see tiendacristal.domain.Vendedor#getDomain()
	 * @see #getVendedor()
	 * @generated
	 */
	EReference getVendedor_Domain();

	/**
	 * Returns the meta object for the reference list '{@link tiendacristal.domain.Vendedor#getListaPedidos <em>Lista Pedidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Pedidos</em>'.
	 * @see tiendacristal.domain.Vendedor#getListaPedidos()
	 * @see #getVendedor()
	 * @generated
	 */
	EReference getVendedor_ListaPedidos();

	/**
	 * Returns the meta object for class '{@link tiendacristal.domain.Inventario <em>Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventario</em>'.
	 * @see tiendacristal.domain.Inventario
	 * @generated
	 */
	EClass getInventario();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.domain.Inventario#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see tiendacristal.domain.Inventario#getDomain()
	 * @see #getInventario()
	 * @generated
	 */
	EReference getInventario_Domain();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

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
		 * The meta object literal for the '{@link tiendacristal.domain.impl.PedidoImpl <em>Pedido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.domain.impl.PedidoImpl
		 * @see tiendacristal.domain.impl.DomainPackageImpl#getPedido()
		 * @generated
		 */
		EClass PEDIDO = eINSTANCE.getPedido();

		/**
		 * The meta object literal for the '<em><b>Id Cliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__ID_CLIENTE = eINSTANCE.getPedido_IdCliente();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__CODIGO = eINSTANCE.getPedido_Codigo();

		/**
		 * The meta object literal for the '<em><b>Fecha Pedido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__FECHA_PEDIDO = eINSTANCE.getPedido_FechaPedido();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__DOMAIN = eINSTANCE.getPedido_Domain();

		/**
		 * The meta object literal for the '<em><b>The Compra</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__THE_COMPRA = eINSTANCE.getPedido_TheCompra();

		/**
		 * The meta object literal for the '<em><b>The Cliente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__THE_CLIENTE = eINSTANCE.getPedido_TheCliente();

		/**
		 * The meta object literal for the '<em><b>Lista Productos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__LISTA_PRODUCTOS = eINSTANCE.getPedido_ListaProductos();

		/**
		 * The meta object literal for the '<em><b>The Vendedor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__THE_VENDEDOR = eINSTANCE.getPedido_TheVendedor();

		/**
		 * The meta object literal for the '{@link tiendacristal.domain.impl.CompraImpl <em>Compra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.domain.impl.CompraImpl
		 * @see tiendacristal.domain.impl.DomainPackageImpl#getCompra()
		 * @generated
		 */
		EClass COMPRA = eINSTANCE.getCompra();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPRA__CODIGO = eINSTANCE.getCompra_Codigo();

		/**
		 * The meta object literal for the '<em><b>Id Cliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPRA__ID_CLIENTE = eINSTANCE.getCompra_IdCliente();

		/**
		 * The meta object literal for the '<em><b>Codigo P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPRA__CODIGO_P = eINSTANCE.getCompra_CodigoP();

		/**
		 * The meta object literal for the '<em><b>Fecha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPRA__FECHA = eINSTANCE.getCompra_Fecha();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPRA__TOTAL = eINSTANCE.getCompra_Total();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRA__DOMAIN = eINSTANCE.getCompra_Domain();

		/**
		 * The meta object literal for the '<em><b>The Recibo Pago</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRA__THE_RECIBO_PAGO = eINSTANCE.getCompra_TheReciboPago();

		/**
		 * The meta object literal for the '<em><b>The Pedido</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRA__THE_PEDIDO = eINSTANCE.getCompra_ThePedido();

		/**
		 * The meta object literal for the '{@link tiendacristal.domain.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.domain.impl.ClienteImpl
		 * @see tiendacristal.domain.impl.DomainPackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__NOMBRE = eINSTANCE.getCliente_Nombre();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__CODIGO = eINSTANCE.getCliente_Codigo();

		/**
		 * The meta object literal for the '<em><b>Tipo Cliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__TIPO_CLIENTE = eINSTANCE.getCliente_TipoCliente();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE__DOMAIN = eINSTANCE.getCliente_Domain();

		/**
		 * The meta object literal for the '<em><b>Lista Pedidos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE__LISTA_PEDIDOS = eINSTANCE.getCliente_ListaPedidos();

		/**
		 * The meta object literal for the '{@link tiendacristal.domain.impl.AdministradorImpl <em>Administrador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.domain.impl.AdministradorImpl
		 * @see tiendacristal.domain.impl.DomainPackageImpl#getAdministrador()
		 * @generated
		 */
		EClass ADMINISTRADOR = eINSTANCE.getAdministrador();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRADOR__DOMAIN = eINSTANCE.getAdministrador_Domain();

		/**
		 * The meta object literal for the '{@link tiendacristal.domain.impl.ProductoImpl <em>Producto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.domain.impl.ProductoImpl
		 * @see tiendacristal.domain.impl.DomainPackageImpl#getProducto()
		 * @generated
		 */
		EClass PRODUCTO = eINSTANCE.getProducto();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__CODIGO = eINSTANCE.getProducto_Codigo();

		/**
		 * The meta object literal for the '<em><b>Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__PRECIO = eINSTANCE.getProducto_Precio();

		/**
		 * The meta object literal for the '<em><b>Categoria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__CATEGORIA = eINSTANCE.getProducto_Categoria();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__NOMBRE = eINSTANCE.getProducto_Nombre();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__DOMAIN = eINSTANCE.getProducto_Domain();

		/**
		 * The meta object literal for the '<em><b>The Pedido</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__THE_PEDIDO = eINSTANCE.getProducto_ThePedido();

		/**
		 * The meta object literal for the '{@link tiendacristal.domain.impl.ReciboPagoImpl <em>Recibo Pago</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.domain.impl.ReciboPagoImpl
		 * @see tiendacristal.domain.impl.DomainPackageImpl#getReciboPago()
		 * @generated
		 */
		EClass RECIBO_PAGO = eINSTANCE.getReciboPago();

		/**
		 * The meta object literal for the '<em><b>Codigo Factura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIBO_PAGO__CODIGO_FACTURA = eINSTANCE.getReciboPago_CodigoFactura();

		/**
		 * The meta object literal for the '<em><b>Costo Total Pedido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIBO_PAGO__COSTO_TOTAL_PEDIDO = eINSTANCE.getReciboPago_CostoTotalPedido();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIBO_PAGO__DOMAIN = eINSTANCE.getReciboPago_Domain();

		/**
		 * The meta object literal for the '<em><b>The Compra</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIBO_PAGO__THE_COMPRA = eINSTANCE.getReciboPago_TheCompra();

		/**
		 * The meta object literal for the '{@link tiendacristal.domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.domain.impl.DomainImpl
		 * @see tiendacristal.domain.impl.DomainPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>The UI Asociado</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_UI_ASOCIADO = eINSTANCE.getDomain_TheUIAsociado();

		/**
		 * The meta object literal for the '<em><b>Owned By Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__OWNED_BY_MODEL_FACTORY = eINSTANCE.getDomain_OwnedByModelFactory();

		/**
		 * The meta object literal for the '<em><b>Lista Pedidos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LISTA_PEDIDOS = eINSTANCE.getDomain_ListaPedidos();

		/**
		 * The meta object literal for the '<em><b>Lista Compras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LISTA_COMPRAS = eINSTANCE.getDomain_ListaCompras();

		/**
		 * The meta object literal for the '<em><b>The Administrador</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_ADMINISTRADOR = eINSTANCE.getDomain_TheAdministrador();

		/**
		 * The meta object literal for the '<em><b>Lista Clientes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LISTA_CLIENTES = eINSTANCE.getDomain_ListaClientes();

		/**
		 * The meta object literal for the '<em><b>Lista Productos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LISTA_PRODUCTOS = eINSTANCE.getDomain_ListaProductos();

		/**
		 * The meta object literal for the '<em><b>Lista Facturas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LISTA_FACTURAS = eINSTANCE.getDomain_ListaFacturas();

		/**
		 * The meta object literal for the '<em><b>The Tienda Cristal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_TIENDA_CRISTAL = eINSTANCE.getDomain_TheTiendaCristal();

		/**
		 * The meta object literal for the '<em><b>The Vendedor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_VENDEDOR = eINSTANCE.getDomain_TheVendedor();

		/**
		 * The meta object literal for the '<em><b>The Inventario</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_INVENTARIO = eINSTANCE.getDomain_TheInventario();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___IMPLEMENTAR_MODELO = eINSTANCE.getDomain__ImplementarModelo();

		/**
		 * The meta object literal for the '<em><b>Crear Producto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___CREAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = eINSTANCE.getDomain__CrearProducto__ContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Crear Compra</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___CREAR_COMPRA__CONTENEDORCRUDCOMPRAVIEWMODEL = eINSTANCE.getDomain__CrearCompra__ContenedorCRUDCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>Crear Pedido</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___CREAR_PEDIDO__CONTENEDORCRUDPEDIDOVIEWMODEL = eINSTANCE.getDomain__CrearPedido__ContenedorCRUDPedidoViewModel();

		/**
		 * The meta object literal for the '<em><b>Buscar Producto Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___BUSCAR_PRODUCTO_ID__STRING = eINSTANCE.getDomain__BuscarProductoId__String();

		/**
		 * The meta object literal for the '<em><b>Agregar Lista P</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___AGREGAR_LISTA_P__CONTENEDORCRUDPRODUCTOSVIEWMODEL = eINSTANCE.getDomain__AgregarListaP__ContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Buscar Producto Nombre</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___BUSCAR_PRODUCTO_NOMBRE__STRING = eINSTANCE.getDomain__BuscarProductoNombre__String();

		/**
		 * The meta object literal for the '<em><b>Crear Cliente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___CREAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = eINSTANCE.getDomain__CrearCliente__ContenedorCRUDClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Actualizar Cliente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___ACTUALIZAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = eINSTANCE.getDomain__ActualizarCliente__ContenedorCRUDClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Eliminar Cliente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___ELIMINAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = eINSTANCE.getDomain__EliminarCliente__ContenedorCRUDClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Buscar Cliente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___BUSCAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL = eINSTANCE.getDomain__BuscarCliente__ContenedorCRUDClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Buscar Cliente Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___BUSCAR_CLIENTE_ID__STRING = eINSTANCE.getDomain__BuscarClienteId__String();

		/**
		 * The meta object literal for the '<em><b>Buscar Producto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___BUSCAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = eINSTANCE.getDomain__BuscarProducto__ContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Eliminar Producto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___ELIMINAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = eINSTANCE.getDomain__EliminarProducto__ContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Actualizar Producto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___ACTUALIZAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL = eINSTANCE.getDomain__ActualizarProducto__ContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Update Contenedor Listado Clientes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___UPDATE_CONTENEDOR_LISTADO_CLIENTES__CONTENEDORMAESTROCLIENTEVIEWMODEL = eINSTANCE.getDomain__UpdateContenedorListadoClientes__ContenedorMaestroClienteViewModel();

		/**
		 * The meta object literal for the '{@link tiendacristal.domain.impl.DistribuidoraCristalImpl <em>Distribuidora Cristal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.domain.impl.DistribuidoraCristalImpl
		 * @see tiendacristal.domain.impl.DomainPackageImpl#getDistribuidoraCristal()
		 * @generated
		 */
		EClass DISTRIBUIDORA_CRISTAL = eINSTANCE.getDistribuidoraCristal();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUIDORA_CRISTAL__NOMBRE = eINSTANCE.getDistribuidoraCristal_Nombre();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUIDORA_CRISTAL__CODIGO = eINSTANCE.getDistribuidoraCristal_Codigo();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUIDORA_CRISTAL__DOMAIN = eINSTANCE.getDistribuidoraCristal_Domain();

		/**
		 * The meta object literal for the '{@link tiendacristal.domain.impl.VendedorImpl <em>Vendedor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.domain.impl.VendedorImpl
		 * @see tiendacristal.domain.impl.DomainPackageImpl#getVendedor()
		 * @generated
		 */
		EClass VENDEDOR = eINSTANCE.getVendedor();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDEDOR__NOMBRE = eINSTANCE.getVendedor_Nombre();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDEDOR__DOMAIN = eINSTANCE.getVendedor_Domain();

		/**
		 * The meta object literal for the '<em><b>Lista Pedidos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDEDOR__LISTA_PEDIDOS = eINSTANCE.getVendedor_ListaPedidos();

		/**
		 * The meta object literal for the '{@link tiendacristal.domain.impl.InventarioImpl <em>Inventario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.domain.impl.InventarioImpl
		 * @see tiendacristal.domain.impl.DomainPackageImpl#getInventario()
		 * @generated
		 */
		EClass INVENTARIO = eINSTANCE.getInventario();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTARIO__DOMAIN = eINSTANCE.getInventario_Domain();

	}

} //DomainPackage
