/**
 */
package tiendacristal.ui.contenedorcrudrealizarcompra;

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
 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraFactory
 * @model kind="package"
 * @generated
 */
public interface ContenedorcrudrealizarcompraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenedorcrudrealizarcompra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tiendacristal/ui/contenedorcrudrealizarcompra.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tiendacristal.ui.contenedorcrudrealizarcompra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorcrudrealizarcompraPackage eINSTANCE = tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorcrudrealizarcompraPackageImpl.init();

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorCRUDCompraViewModelImpl <em>Contenedor CRUD Compra View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorCRUDCompraViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorcrudrealizarcompraPackageImpl#getContenedorCRUDCompraViewModel()
	 * @generated
	 */
	int CONTENEDOR_CRUD_COMPRA_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Detalle Compra View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Maestro Compra View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor CRUD Compra View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_COMPRA_VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___IMPLEMENTAR_MODELO = 0;

	/**
	 * The operation id for the '<em>Crear Compra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___CREAR_COMPRA = 1;

	/**
	 * The operation id for the '<em>Crear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___CREAR = 2;

	/**
	 * The operation id for the '<em>Implementar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___IMPLEMENTAR = 3;

	/**
	 * The operation id for the '<em>Enlazar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___ENLAZAR = 4;

	/**
	 * The number of operations of the '<em>Contenedor CRUD Compra View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_COMPRA_VIEW_MODEL_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorDetalleCompraViewModelImpl <em>Contenedor Detalle Compra View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorDetalleCompraViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorcrudrealizarcompraPackageImpl#getContenedorDetalleCompraViewModel()
	 * @generated
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Id Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__ID_CLIENTE = 1;

	/**
	 * The feature id for the '<em><b>Codigo P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO_P = 2;

	/**
	 * The feature id for the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__FECHA = 3;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__TOTAL = 4;

	/**
	 * The feature id for the '<em><b>Contenedor CRUD Compra View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL = 5;

	/**
	 * The feature id for the '<em><b>The Contenedor Maestro Cliente View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = 6;

	/**
	 * The feature id for the '<em><b>The Contenedor Mestro Productos View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL = 7;

	/**
	 * The feature id for the '<em><b>The Contenedor Maestro Pedido View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL = 8;

	/**
	 * The number of structural features of the '<em>Contenedor Detalle Compra View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Crear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL___CREAR = 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL___CREATE = 1;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL___IMPLEMENTAR_MODELO = 2;

	/**
	 * The number of operations of the '<em>Contenedor Detalle Compra View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorMaestroCompraViewModelImpl <em>Contenedor Maestro Compra View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorMaestroCompraViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorcrudrealizarcompraPackageImpl#getContenedorMaestroCompraViewModel()
	 * @generated
	 */
	int CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Contenedor CRUD Compra View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Lista Compra View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__LISTA_COMPRA_VIEW_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Contenedor Maestro Compra View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL___CREATE = 0;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL___IMPLEMENTAR_MODELO = 1;

	/**
	 * The number of operations of the '<em>Contenedor Maestro Compra View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.CompraViewModelImpl <em>Compra View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.CompraViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorcrudrealizarcompraPackageImpl#getCompraViewModel()
	 * @generated
	 */
	int COMPRA_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA_VIEW_MODEL__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Id Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA_VIEW_MODEL__ID_CLIENTE = 1;

	/**
	 * The feature id for the '<em><b>Codigo P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA_VIEW_MODEL__CODIGO_P = 2;

	/**
	 * The feature id for the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA_VIEW_MODEL__FECHA = 3;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA_VIEW_MODEL__TOTAL = 4;

	/**
	 * The feature id for the '<em><b>Contenedor Maestro Compra View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL = 5;

	/**
	 * The number of structural features of the '<em>Compra View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA_VIEW_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Compra View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRA_VIEW_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel <em>Contenedor CRUD Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor CRUD Compra View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel
	 * @generated
	 */
	EClass getContenedorCRUDCompraViewModel();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UI</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getUI()
	 * @see #getContenedorCRUDCompraViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDCompraViewModel_UI();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getTheContenedorDetalleCompraViewModel <em>The Contenedor Detalle Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Detalle Compra View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getTheContenedorDetalleCompraViewModel()
	 * @see #getContenedorCRUDCompraViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDCompraViewModel_TheContenedorDetalleCompraViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getTheContenedorMaestroCompraViewModel <em>The Contenedor Maestro Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Maestro Compra View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getTheContenedorMaestroCompraViewModel()
	 * @see #getContenedorCRUDCompraViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDCompraViewModel_TheContenedorMaestroCompraViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#implementarModelo()
	 * @generated
	 */
	EOperation getContenedorCRUDCompraViewModel__ImplementarModelo();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#crearCompra() <em>Crear Compra</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Compra</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#crearCompra()
	 * @generated
	 */
	EOperation getContenedorCRUDCompraViewModel__CrearCompra();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#crear() <em>Crear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#crear()
	 * @generated
	 */
	EOperation getContenedorCRUDCompraViewModel__Crear();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#implementar() <em>Implementar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#implementar()
	 * @generated
	 */
	EOperation getContenedorCRUDCompraViewModel__Implementar();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#enlazar() <em>Enlazar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enlazar</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#enlazar()
	 * @generated
	 */
	EOperation getContenedorCRUDCompraViewModel__Enlazar();

	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel <em>Contenedor Detalle Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Detalle Compra View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel
	 * @generated
	 */
	EClass getContenedorDetalleCompraViewModel();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getCodigo()
	 * @see #getContenedorDetalleCompraViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleCompraViewModel_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getIdCliente <em>Id Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Cliente</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getIdCliente()
	 * @see #getContenedorDetalleCompraViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleCompraViewModel_IdCliente();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getCodigoP <em>Codigo P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo P</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getCodigoP()
	 * @see #getContenedorDetalleCompraViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleCompraViewModel_CodigoP();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getFecha()
	 * @see #getContenedorDetalleCompraViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleCompraViewModel_Fecha();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTotal()
	 * @see #getContenedorDetalleCompraViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleCompraViewModel_Total();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getContenedorCRUDCompraViewModel <em>Contenedor CRUD Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor CRUD Compra View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getContenedorCRUDCompraViewModel()
	 * @see #getContenedorDetalleCompraViewModel()
	 * @generated
	 */
	EReference getContenedorDetalleCompraViewModel_ContenedorCRUDCompraViewModel();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Maestro Cliente View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTheContenedorMaestroClienteViewModel()
	 * @see #getContenedorDetalleCompraViewModel()
	 * @generated
	 */
	EReference getContenedorDetalleCompraViewModel_TheContenedorMaestroClienteViewModel();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTheContenedorMestroProductosViewModel <em>The Contenedor Mestro Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Mestro Productos View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTheContenedorMestroProductosViewModel()
	 * @see #getContenedorDetalleCompraViewModel()
	 * @generated
	 */
	EReference getContenedorDetalleCompraViewModel_TheContenedorMestroProductosViewModel();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTheContenedorMaestroPedidoViewModel <em>The Contenedor Maestro Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Maestro Pedido View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTheContenedorMaestroPedidoViewModel()
	 * @see #getContenedorDetalleCompraViewModel()
	 * @generated
	 */
	EReference getContenedorDetalleCompraViewModel_TheContenedorMaestroPedidoViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#crear() <em>Crear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#crear()
	 * @generated
	 */
	EOperation getContenedorDetalleCompraViewModel__Crear();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#create() <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#create()
	 * @generated
	 */
	EOperation getContenedorDetalleCompraViewModel__Create();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#implementarModelo()
	 * @generated
	 */
	EOperation getContenedorDetalleCompraViewModel__ImplementarModelo();

	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel <em>Contenedor Maestro Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Maestro Compra View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel
	 * @generated
	 */
	EClass getContenedorMaestroCompraViewModel();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel#getContenedorCRUDCompraViewModel <em>Contenedor CRUD Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor CRUD Compra View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel#getContenedorCRUDCompraViewModel()
	 * @see #getContenedorMaestroCompraViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroCompraViewModel_ContenedorCRUDCompraViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel#getListaCompraViewModel <em>Lista Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Compra View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel#getListaCompraViewModel()
	 * @see #getContenedorMaestroCompraViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroCompraViewModel_ListaCompraViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel#create() <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel#create()
	 * @generated
	 */
	EOperation getContenedorMaestroCompraViewModel__Create();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel#implementarModelo()
	 * @generated
	 */
	EOperation getContenedorMaestroCompraViewModel__ImplementarModelo();

	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel <em>Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compra View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel
	 * @generated
	 */
	EClass getCompraViewModel();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getCodigo()
	 * @see #getCompraViewModel()
	 * @generated
	 */
	EAttribute getCompraViewModel_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getIdCliente <em>Id Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Cliente</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getIdCliente()
	 * @see #getCompraViewModel()
	 * @generated
	 */
	EAttribute getCompraViewModel_IdCliente();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getCodigoP <em>Codigo P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo P</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getCodigoP()
	 * @see #getCompraViewModel()
	 * @generated
	 */
	EAttribute getCompraViewModel_CodigoP();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getFecha()
	 * @see #getCompraViewModel()
	 * @generated
	 */
	EAttribute getCompraViewModel_Fecha();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getTotal()
	 * @see #getCompraViewModel()
	 * @generated
	 */
	EAttribute getCompraViewModel_Total();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getContenedorMaestroCompraViewModel <em>Contenedor Maestro Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor Maestro Compra View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getContenedorMaestroCompraViewModel()
	 * @see #getCompraViewModel()
	 * @generated
	 */
	EReference getCompraViewModel_ContenedorMaestroCompraViewModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenedorcrudrealizarcompraFactory getContenedorcrudrealizarcompraFactory();

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
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorCRUDCompraViewModelImpl <em>Contenedor CRUD Compra View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorCRUDCompraViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorcrudrealizarcompraPackageImpl#getContenedorCRUDCompraViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_CRUD_COMPRA_VIEW_MODEL = eINSTANCE.getContenedorCRUDCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI = eINSTANCE.getContenedorCRUDCompraViewModel_UI();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Detalle Compra View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL = eINSTANCE.getContenedorCRUDCompraViewModel_TheContenedorDetalleCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Maestro Compra View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL = eINSTANCE.getContenedorCRUDCompraViewModel_TheContenedorMaestroCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___IMPLEMENTAR_MODELO = eINSTANCE.getContenedorCRUDCompraViewModel__ImplementarModelo();

		/**
		 * The meta object literal for the '<em><b>Crear Compra</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___CREAR_COMPRA = eINSTANCE.getContenedorCRUDCompraViewModel__CrearCompra();

		/**
		 * The meta object literal for the '<em><b>Crear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___CREAR = eINSTANCE.getContenedorCRUDCompraViewModel__Crear();

		/**
		 * The meta object literal for the '<em><b>Implementar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___IMPLEMENTAR = eINSTANCE.getContenedorCRUDCompraViewModel__Implementar();

		/**
		 * The meta object literal for the '<em><b>Enlazar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___ENLAZAR = eINSTANCE.getContenedorCRUDCompraViewModel__Enlazar();

		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorDetalleCompraViewModelImpl <em>Contenedor Detalle Compra View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorDetalleCompraViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorcrudrealizarcompraPackageImpl#getContenedorDetalleCompraViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL = eINSTANCE.getContenedorDetalleCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO = eINSTANCE.getContenedorDetalleCompraViewModel_Codigo();

		/**
		 * The meta object literal for the '<em><b>Id Cliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__ID_CLIENTE = eINSTANCE.getContenedorDetalleCompraViewModel_IdCliente();

		/**
		 * The meta object literal for the '<em><b>Codigo P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO_P = eINSTANCE.getContenedorDetalleCompraViewModel_CodigoP();

		/**
		 * The meta object literal for the '<em><b>Fecha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__FECHA = eINSTANCE.getContenedorDetalleCompraViewModel_Fecha();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__TOTAL = eINSTANCE.getContenedorDetalleCompraViewModel_Total();

		/**
		 * The meta object literal for the '<em><b>Contenedor CRUD Compra View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL = eINSTANCE.getContenedorDetalleCompraViewModel_ContenedorCRUDCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Maestro Cliente View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorDetalleCompraViewModel_TheContenedorMaestroClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Mestro Productos View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL = eINSTANCE.getContenedorDetalleCompraViewModel_TheContenedorMestroProductosViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Maestro Pedido View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL = eINSTANCE.getContenedorDetalleCompraViewModel_TheContenedorMaestroPedidoViewModel();

		/**
		 * The meta object literal for the '<em><b>Crear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL___CREAR = eINSTANCE.getContenedorDetalleCompraViewModel__Crear();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL___CREATE = eINSTANCE.getContenedorDetalleCompraViewModel__Create();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL___IMPLEMENTAR_MODELO = eINSTANCE.getContenedorDetalleCompraViewModel__ImplementarModelo();

		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorMaestroCompraViewModelImpl <em>Contenedor Maestro Compra View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorMaestroCompraViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorcrudrealizarcompraPackageImpl#getContenedorMaestroCompraViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL = eINSTANCE.getContenedorMaestroCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>Contenedor CRUD Compra View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL = eINSTANCE.getContenedorMaestroCompraViewModel_ContenedorCRUDCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>Lista Compra View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__LISTA_COMPRA_VIEW_MODEL = eINSTANCE.getContenedorMaestroCompraViewModel_ListaCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL___CREATE = eINSTANCE.getContenedorMaestroCompraViewModel__Create();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL___IMPLEMENTAR_MODELO = eINSTANCE.getContenedorMaestroCompraViewModel__ImplementarModelo();

		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.CompraViewModelImpl <em>Compra View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.CompraViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorcrudrealizarcompraPackageImpl#getCompraViewModel()
		 * @generated
		 */
		EClass COMPRA_VIEW_MODEL = eINSTANCE.getCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPRA_VIEW_MODEL__CODIGO = eINSTANCE.getCompraViewModel_Codigo();

		/**
		 * The meta object literal for the '<em><b>Id Cliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPRA_VIEW_MODEL__ID_CLIENTE = eINSTANCE.getCompraViewModel_IdCliente();

		/**
		 * The meta object literal for the '<em><b>Codigo P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPRA_VIEW_MODEL__CODIGO_P = eINSTANCE.getCompraViewModel_CodigoP();

		/**
		 * The meta object literal for the '<em><b>Fecha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPRA_VIEW_MODEL__FECHA = eINSTANCE.getCompraViewModel_Fecha();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPRA_VIEW_MODEL__TOTAL = eINSTANCE.getCompraViewModel_Total();

		/**
		 * The meta object literal for the '<em><b>Contenedor Maestro Compra View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL = eINSTANCE.getCompraViewModel_ContenedorMaestroCompraViewModel();

	}

} //ContenedorcrudrealizarcompraPackage
