/**
 */
package tiendacristal.ui.contenedorcrudproductos;

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
 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosFactory
 * @model kind="package"
 * @generated
 */
public interface ContenedorcrudproductosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenedorcrudproductos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tiendacristal/ui/contenedorcrudproductos.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tiendacristal.ui.contenedorcrudproductos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorcrudproductosPackage eINSTANCE = tiendacristal.ui.contenedorcrudproductos.impl.ContenedorcrudproductosPackageImpl.init();

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorCRUDProductosViewModelImpl <em>Contenedor CRUD Productos View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorCRUDProductosViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorcrudproductosPackageImpl#getContenedorCRUDProductosViewModel()
	 * @generated
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Detalle Productos Viewmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Mestro Productos View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor CRUD Productos View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Crear Producto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___CREAR_PRODUCTO = 0;

	/**
	 * The operation id for the '<em>Crear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___CREAR = 1;

	/**
	 * The operation id for the '<em>Enlazar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___ENLAZAR = 2;

	/**
	 * The operation id for the '<em>Buscar Producto Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___BUSCAR_PRODUCTO_ID__STRING = 3;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___IMPLEMENTAR_MODELO = 4;

	/**
	 * The operation id for the '<em>Agregar Lista P</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___AGREGAR_LISTA_P = 5;

	/**
	 * The operation id for the '<em>Buscar Producto Nombre</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___BUSCAR_PRODUCTO_NOMBRE__STRING = 6;

	/**
	 * The operation id for the '<em>Buscar Producto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___BUSCAR_PRODUCTO = 7;

	/**
	 * The operation id for the '<em>Eliminar Producto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___ELIMINAR_PRODUCTO = 8;

	/**
	 * The operation id for the '<em>Actualizar Producto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___ACTUALIZAR_PRODUCTO = 9;

	/**
	 * The number of operations of the '<em>Contenedor CRUD Productos View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorDetalleProductosViewmodelImpl <em>Contenedor Detalle Productos Viewmodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorDetalleProductosViewmodelImpl
	 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorcrudproductosPackageImpl#getContenedorDetalleProductosViewmodel()
	 * @generated
	 */
	int CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL = 1;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__PRECIO = 1;

	/**
	 * The feature id for the '<em><b>Categoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CATEGORIA = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__NOMBRE = 3;

	/**
	 * The feature id for the '<em><b>Contenedor CRUD Productos View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL = 4;

	/**
	 * The number of structural features of the '<em>Contenedor Detalle Productos Viewmodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Crear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL___CREAR = 0;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL___IMPLEMENTAR_MODELO = 1;

	/**
	 * The number of operations of the '<em>Contenedor Detalle Productos Viewmodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorMestroProductosViewModelImpl <em>Contenedor Mestro Productos View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorMestroProductosViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorcrudproductosPackageImpl#getContenedorMestroProductosViewModel()
	 * @generated
	 */
	int CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Contenedor CRUD Productos View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The Productos View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTOS_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Producto View Model Seleccionado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTO_VIEW_MODEL_SELECCIONADO = 2;

	/**
	 * The feature id for the '<em><b>Contenedor Detalle Compra View Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Contenedor Detalle Pedido View Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL = 4;

	/**
	 * The number of structural features of the '<em>Contenedor Mestro Productos View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Crear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL___CREAR = 0;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL___IMPLEMENTAR_MODELO = 1;

	/**
	 * The number of operations of the '<em>Contenedor Mestro Productos View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudproductos.impl.ProductosViewModelImpl <em>Productos View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudproductos.impl.ProductosViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorcrudproductosPackageImpl#getProductosViewModel()
	 * @generated
	 */
	int PRODUCTOS_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTOS_VIEW_MODEL__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTOS_VIEW_MODEL__PRECIO = 1;

	/**
	 * The feature id for the '<em><b>Categoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTOS_VIEW_MODEL__CATEGORIA = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTOS_VIEW_MODEL__NOMBRE = 3;

	/**
	 * The feature id for the '<em><b>Owned By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTOS_VIEW_MODEL__OWNED_BY = 4;

	/**
	 * The number of structural features of the '<em>Productos View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTOS_VIEW_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Productos View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTOS_VIEW_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel <em>Contenedor CRUD Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor CRUD Productos View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel
	 * @generated
	 */
	EClass getContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UI</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getUI()
	 * @see #getContenedorCRUDProductosViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDProductosViewModel_UI();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getTheContenedorDetalleProductosViewmodel <em>The Contenedor Detalle Productos Viewmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Detalle Productos Viewmodel</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getTheContenedorDetalleProductosViewmodel()
	 * @see #getContenedorCRUDProductosViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDProductosViewModel_TheContenedorDetalleProductosViewmodel();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getTheContenedorMestroProductosViewModel <em>The Contenedor Mestro Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Mestro Productos View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getTheContenedorMestroProductosViewModel()
	 * @see #getContenedorCRUDProductosViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDProductosViewModel_TheContenedorMestroProductosViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#crearProducto() <em>Crear Producto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Producto</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#crearProducto()
	 * @generated
	 */
	EOperation getContenedorCRUDProductosViewModel__CrearProducto();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#crear() <em>Crear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#crear()
	 * @generated
	 */
	EOperation getContenedorCRUDProductosViewModel__Crear();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#enlazar() <em>Enlazar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enlazar</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#enlazar()
	 * @generated
	 */
	EOperation getContenedorCRUDProductosViewModel__Enlazar();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#buscarProductoId(java.lang.String) <em>Buscar Producto Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Producto Id</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#buscarProductoId(java.lang.String)
	 * @generated
	 */
	EOperation getContenedorCRUDProductosViewModel__BuscarProductoId__String();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#implementarModelo()
	 * @generated
	 */
	EOperation getContenedorCRUDProductosViewModel__ImplementarModelo();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#agregarListaP() <em>Agregar Lista P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Agregar Lista P</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#agregarListaP()
	 * @generated
	 */
	EOperation getContenedorCRUDProductosViewModel__AgregarListaP();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#buscarProductoNombre(java.lang.String) <em>Buscar Producto Nombre</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Producto Nombre</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#buscarProductoNombre(java.lang.String)
	 * @generated
	 */
	EOperation getContenedorCRUDProductosViewModel__BuscarProductoNombre__String();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#buscarProducto() <em>Buscar Producto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Producto</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#buscarProducto()
	 * @generated
	 */
	EOperation getContenedorCRUDProductosViewModel__BuscarProducto();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#eliminarProducto() <em>Eliminar Producto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eliminar Producto</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#eliminarProducto()
	 * @generated
	 */
	EOperation getContenedorCRUDProductosViewModel__EliminarProducto();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#actualizarProducto() <em>Actualizar Producto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Actualizar Producto</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#actualizarProducto()
	 * @generated
	 */
	EOperation getContenedorCRUDProductosViewModel__ActualizarProducto();

	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel <em>Contenedor Detalle Productos Viewmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Detalle Productos Viewmodel</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel
	 * @generated
	 */
	EClass getContenedorDetalleProductosViewmodel();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#getCodigo()
	 * @see #getContenedorDetalleProductosViewmodel()
	 * @generated
	 */
	EAttribute getContenedorDetalleProductosViewmodel_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#getPrecio <em>Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#getPrecio()
	 * @see #getContenedorDetalleProductosViewmodel()
	 * @generated
	 */
	EAttribute getContenedorDetalleProductosViewmodel_Precio();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#getCategoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categoria</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#getCategoria()
	 * @see #getContenedorDetalleProductosViewmodel()
	 * @generated
	 */
	EAttribute getContenedorDetalleProductosViewmodel_Categoria();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#getNombre()
	 * @see #getContenedorDetalleProductosViewmodel()
	 * @generated
	 */
	EAttribute getContenedorDetalleProductosViewmodel_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#getContenedorCRUDProductosViewModel <em>Contenedor CRUD Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor CRUD Productos View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#getContenedorCRUDProductosViewModel()
	 * @see #getContenedorDetalleProductosViewmodel()
	 * @generated
	 */
	EReference getContenedorDetalleProductosViewmodel_ContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#crear() <em>Crear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#crear()
	 * @generated
	 */
	EOperation getContenedorDetalleProductosViewmodel__Crear();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#implementarModelo()
	 * @generated
	 */
	EOperation getContenedorDetalleProductosViewmodel__ImplementarModelo();

	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel <em>Contenedor Mestro Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Mestro Productos View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel
	 * @generated
	 */
	EClass getContenedorMestroProductosViewModel();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorCRUDProductosViewModel <em>Contenedor CRUD Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor CRUD Productos View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorCRUDProductosViewModel()
	 * @see #getContenedorMestroProductosViewModel()
	 * @generated
	 */
	EReference getContenedorMestroProductosViewModel_ContenedorCRUDProductosViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getTheProductosViewModel <em>The Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>The Productos View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getTheProductosViewModel()
	 * @see #getContenedorMestroProductosViewModel()
	 * @generated
	 */
	EReference getContenedorMestroProductosViewModel_TheProductosViewModel();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getTheProductoViewModelSeleccionado <em>The Producto View Model Seleccionado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Producto View Model Seleccionado</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getTheProductoViewModelSeleccionado()
	 * @see #getContenedorMestroProductosViewModel()
	 * @generated
	 */
	EReference getContenedorMestroProductosViewModel_TheProductoViewModelSeleccionado();

	/**
	 * Returns the meta object for the reference list '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorDetalleCompraViewModel <em>Contenedor Detalle Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contenedor Detalle Compra View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorDetalleCompraViewModel()
	 * @see #getContenedorMestroProductosViewModel()
	 * @generated
	 */
	EReference getContenedorMestroProductosViewModel_ContenedorDetalleCompraViewModel();

	/**
	 * Returns the meta object for the reference list '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorDetallePedidoViewModel <em>Contenedor Detalle Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contenedor Detalle Pedido View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorDetallePedidoViewModel()
	 * @see #getContenedorMestroProductosViewModel()
	 * @generated
	 */
	EReference getContenedorMestroProductosViewModel_ContenedorDetallePedidoViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#crear() <em>Crear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#crear()
	 * @generated
	 */
	EOperation getContenedorMestroProductosViewModel__Crear();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#implementarModelo()
	 * @generated
	 */
	EOperation getContenedorMestroProductosViewModel__ImplementarModelo();

	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudproductos.ProductosViewModel <em>Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Productos View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ProductosViewModel
	 * @generated
	 */
	EClass getProductosViewModel();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudproductos.ProductosViewModel#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ProductosViewModel#getCodigo()
	 * @see #getProductosViewModel()
	 * @generated
	 */
	EAttribute getProductosViewModel_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudproductos.ProductosViewModel#getPrecio <em>Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ProductosViewModel#getPrecio()
	 * @see #getProductosViewModel()
	 * @generated
	 */
	EAttribute getProductosViewModel_Precio();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudproductos.ProductosViewModel#getCategoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categoria</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ProductosViewModel#getCategoria()
	 * @see #getProductosViewModel()
	 * @generated
	 */
	EAttribute getProductosViewModel_Categoria();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudproductos.ProductosViewModel#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ProductosViewModel#getNombre()
	 * @see #getProductosViewModel()
	 * @generated
	 */
	EAttribute getProductosViewModel_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudproductos.ProductosViewModel#getOwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By</em>'.
	 * @see tiendacristal.ui.contenedorcrudproductos.ProductosViewModel#getOwnedBy()
	 * @see #getProductosViewModel()
	 * @generated
	 */
	EReference getProductosViewModel_OwnedBy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenedorcrudproductosFactory getContenedorcrudproductosFactory();

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
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorCRUDProductosViewModelImpl <em>Contenedor CRUD Productos View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorCRUDProductosViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorcrudproductosPackageImpl#getContenedorCRUDProductosViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL = eINSTANCE.getContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI = eINSTANCE.getContenedorCRUDProductosViewModel_UI();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Detalle Productos Viewmodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL = eINSTANCE.getContenedorCRUDProductosViewModel_TheContenedorDetalleProductosViewmodel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Mestro Productos View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL = eINSTANCE.getContenedorCRUDProductosViewModel_TheContenedorMestroProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Crear Producto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___CREAR_PRODUCTO = eINSTANCE.getContenedorCRUDProductosViewModel__CrearProducto();

		/**
		 * The meta object literal for the '<em><b>Crear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___CREAR = eINSTANCE.getContenedorCRUDProductosViewModel__Crear();

		/**
		 * The meta object literal for the '<em><b>Enlazar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___ENLAZAR = eINSTANCE.getContenedorCRUDProductosViewModel__Enlazar();

		/**
		 * The meta object literal for the '<em><b>Buscar Producto Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___BUSCAR_PRODUCTO_ID__STRING = eINSTANCE.getContenedorCRUDProductosViewModel__BuscarProductoId__String();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___IMPLEMENTAR_MODELO = eINSTANCE.getContenedorCRUDProductosViewModel__ImplementarModelo();

		/**
		 * The meta object literal for the '<em><b>Agregar Lista P</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___AGREGAR_LISTA_P = eINSTANCE.getContenedorCRUDProductosViewModel__AgregarListaP();

		/**
		 * The meta object literal for the '<em><b>Buscar Producto Nombre</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___BUSCAR_PRODUCTO_NOMBRE__STRING = eINSTANCE.getContenedorCRUDProductosViewModel__BuscarProductoNombre__String();

		/**
		 * The meta object literal for the '<em><b>Buscar Producto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___BUSCAR_PRODUCTO = eINSTANCE.getContenedorCRUDProductosViewModel__BuscarProducto();

		/**
		 * The meta object literal for the '<em><b>Eliminar Producto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___ELIMINAR_PRODUCTO = eINSTANCE.getContenedorCRUDProductosViewModel__EliminarProducto();

		/**
		 * The meta object literal for the '<em><b>Actualizar Producto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___ACTUALIZAR_PRODUCTO = eINSTANCE.getContenedorCRUDProductosViewModel__ActualizarProducto();

		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorDetalleProductosViewmodelImpl <em>Contenedor Detalle Productos Viewmodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorDetalleProductosViewmodelImpl
		 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorcrudproductosPackageImpl#getContenedorDetalleProductosViewmodel()
		 * @generated
		 */
		EClass CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL = eINSTANCE.getContenedorDetalleProductosViewmodel();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CODIGO = eINSTANCE.getContenedorDetalleProductosViewmodel_Codigo();

		/**
		 * The meta object literal for the '<em><b>Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__PRECIO = eINSTANCE.getContenedorDetalleProductosViewmodel_Precio();

		/**
		 * The meta object literal for the '<em><b>Categoria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CATEGORIA = eINSTANCE.getContenedorDetalleProductosViewmodel_Categoria();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__NOMBRE = eINSTANCE.getContenedorDetalleProductosViewmodel_Nombre();

		/**
		 * The meta object literal for the '<em><b>Contenedor CRUD Productos View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL = eINSTANCE.getContenedorDetalleProductosViewmodel_ContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Crear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL___CREAR = eINSTANCE.getContenedorDetalleProductosViewmodel__Crear();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL___IMPLEMENTAR_MODELO = eINSTANCE.getContenedorDetalleProductosViewmodel__ImplementarModelo();

		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorMestroProductosViewModelImpl <em>Contenedor Mestro Productos View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorMestroProductosViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorcrudproductosPackageImpl#getContenedorMestroProductosViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL = eINSTANCE.getContenedorMestroProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Contenedor CRUD Productos View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL = eINSTANCE.getContenedorMestroProductosViewModel_ContenedorCRUDProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>The Productos View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTOS_VIEW_MODEL = eINSTANCE.getContenedorMestroProductosViewModel_TheProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>The Producto View Model Seleccionado</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTO_VIEW_MODEL_SELECCIONADO = eINSTANCE.getContenedorMestroProductosViewModel_TheProductoViewModelSeleccionado();

		/**
		 * The meta object literal for the '<em><b>Contenedor Detalle Compra View Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL = eINSTANCE.getContenedorMestroProductosViewModel_ContenedorDetalleCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>Contenedor Detalle Pedido View Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL = eINSTANCE.getContenedorMestroProductosViewModel_ContenedorDetallePedidoViewModel();

		/**
		 * The meta object literal for the '<em><b>Crear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL___CREAR = eINSTANCE.getContenedorMestroProductosViewModel__Crear();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL___IMPLEMENTAR_MODELO = eINSTANCE.getContenedorMestroProductosViewModel__ImplementarModelo();

		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudproductos.impl.ProductosViewModelImpl <em>Productos View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudproductos.impl.ProductosViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudproductos.impl.ContenedorcrudproductosPackageImpl#getProductosViewModel()
		 * @generated
		 */
		EClass PRODUCTOS_VIEW_MODEL = eINSTANCE.getProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTOS_VIEW_MODEL__CODIGO = eINSTANCE.getProductosViewModel_Codigo();

		/**
		 * The meta object literal for the '<em><b>Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTOS_VIEW_MODEL__PRECIO = eINSTANCE.getProductosViewModel_Precio();

		/**
		 * The meta object literal for the '<em><b>Categoria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTOS_VIEW_MODEL__CATEGORIA = eINSTANCE.getProductosViewModel_Categoria();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTOS_VIEW_MODEL__NOMBRE = eINSTANCE.getProductosViewModel_Nombre();

		/**
		 * The meta object literal for the '<em><b>Owned By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTOS_VIEW_MODEL__OWNED_BY = eINSTANCE.getProductosViewModel_OwnedBy();

	}

} //ContenedorcrudproductosPackage
