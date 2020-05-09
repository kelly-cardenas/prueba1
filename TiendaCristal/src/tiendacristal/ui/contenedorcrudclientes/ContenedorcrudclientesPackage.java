/**
 */
package tiendacristal.ui.contenedorcrudclientes;

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
 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesFactory
 * @model kind="package"
 * @generated
 */
public interface ContenedorcrudclientesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenedorcrudclientes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tiendacristal/ui/contenedorcrudclientes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tiendacristal.ui.contenedorcrudclientes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorcrudclientesPackage eINSTANCE = tiendacristal.ui.contenedorcrudclientes.impl.ContenedorcrudclientesPackageImpl.init();

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorCRUDClienteViewModelImpl <em>Contenedor CRUD Cliente View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorCRUDClienteViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorcrudclientesPackageImpl#getContenedorCRUDClienteViewModel()
	 * @generated
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Maestro Cliente View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Detalle Cliente View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor CRUD Cliente View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Crear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___CREAR = 0;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___IMPLEMENTAR_MODELO = 1;

	/**
	 * The operation id for the '<em>Enlazar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___ENLAZAR = 2;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___UPDATE = 3;

	/**
	 * The number of operations of the '<em>Contenedor CRUD Cliente View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorDetalleClienteViewModelImpl <em>Contenedor Detalle Cliente View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorDetalleClienteViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorcrudclientesPackageImpl#getContenedorDetalleClienteViewModel()
	 * @generated
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CODIGO = 1;

	/**
	 * The feature id for the '<em><b>Tipo Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__TIPO_CLIENTE = 2;

	/**
	 * The feature id for the '<em><b>Contenedor CRUD Cliente View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Contenedor Detalle Cliente View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL___IMPLEMENTAR_MODELO = 0;

	/**
	 * The operation id for the '<em>Crear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL___CREAR = 1;

	/**
	 * The number of operations of the '<em>Contenedor Detalle Cliente View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorMaestroClienteViewModelImpl <em>Contenedor Maestro Cliente View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorMaestroClienteViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorcrudclientesPackageImpl#getContenedorMaestroClienteViewModel()
	 * @generated
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Owned By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY = 0;

	/**
	 * The feature id for the '<em><b>The Cliente View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Cliente View Model Seleccionada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL_SELECCIONADA = 2;

	/**
	 * The feature id for the '<em><b>Contenedor Detalle Compra View Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Contenedor Detalle Pedido View Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL = 4;

	/**
	 * The number of structural features of the '<em>Contenedor Maestro Cliente View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL___IMPLEMENTAR_MODELO = 0;

	/**
	 * The operation id for the '<em>Crear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL___CREAR = 1;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL___UPDATE = 2;

	/**
	 * The number of operations of the '<em>Contenedor Maestro Cliente View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorcrudclientes.impl.ClienteViewModelImpl <em>Cliente View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorcrudclientes.impl.ClienteViewModelImpl
	 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorcrudclientesPackageImpl#getClienteViewModel()
	 * @generated
	 */
	int CLIENTE_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_VIEW_MODEL__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_VIEW_MODEL__CODIGO = 1;

	/**
	 * The feature id for the '<em><b>Tipo Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_VIEW_MODEL__TIPO_CLIENTE = 2;

	/**
	 * The feature id for the '<em><b>Owned By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_VIEW_MODEL__OWNED_BY = 3;

	/**
	 * The number of structural features of the '<em>Cliente View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_VIEW_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cliente View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_VIEW_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel <em>Contenedor CRUD Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor CRUD Cliente View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel
	 * @generated
	 */
	EClass getContenedorCRUDClienteViewModel();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UI</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getUI()
	 * @see #getContenedorCRUDClienteViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDClienteViewModel_UI();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Maestro Cliente View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getTheContenedorMaestroClienteViewModel()
	 * @see #getContenedorCRUDClienteViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDClienteViewModel_TheContenedorMaestroClienteViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getTheContenedorDetalleClienteViewModel <em>The Contenedor Detalle Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Detalle Cliente View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getTheContenedorDetalleClienteViewModel()
	 * @see #getContenedorCRUDClienteViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDClienteViewModel_TheContenedorDetalleClienteViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#crear() <em>Crear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#crear()
	 * @generated
	 */
	EOperation getContenedorCRUDClienteViewModel__Crear();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#implementarModelo()
	 * @generated
	 */
	EOperation getContenedorCRUDClienteViewModel__ImplementarModelo();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#enlazar() <em>Enlazar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enlazar</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#enlazar()
	 * @generated
	 */
	EOperation getContenedorCRUDClienteViewModel__Enlazar();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#update()
	 * @generated
	 */
	EOperation getContenedorCRUDClienteViewModel__Update();

	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel <em>Contenedor Detalle Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Detalle Cliente View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel
	 * @generated
	 */
	EClass getContenedorDetalleClienteViewModel();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getNombre()
	 * @see #getContenedorDetalleClienteViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleClienteViewModel_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getCodigo()
	 * @see #getContenedorDetalleClienteViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleClienteViewModel_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getTipoCliente <em>Tipo Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Cliente</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getTipoCliente()
	 * @see #getContenedorDetalleClienteViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleClienteViewModel_TipoCliente();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getContenedorCRUDClienteViewModel <em>Contenedor CRUD Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor CRUD Cliente View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getContenedorCRUDClienteViewModel()
	 * @see #getContenedorDetalleClienteViewModel()
	 * @generated
	 */
	EReference getContenedorDetalleClienteViewModel_ContenedorCRUDClienteViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#implementarModelo()
	 * @generated
	 */
	EOperation getContenedorDetalleClienteViewModel__ImplementarModelo();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#crear() <em>Crear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#crear()
	 * @generated
	 */
	EOperation getContenedorDetalleClienteViewModel__Crear();

	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel <em>Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Maestro Cliente View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel
	 * @generated
	 */
	EClass getContenedorMaestroClienteViewModel();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getOwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getOwnedBy()
	 * @see #getContenedorMaestroClienteViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroClienteViewModel_OwnedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getTheClienteViewModel <em>The Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>The Cliente View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getTheClienteViewModel()
	 * @see #getContenedorMaestroClienteViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroClienteViewModel_TheClienteViewModel();

	/**
	 * Returns the meta object for the reference '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getTheClienteViewModelSeleccionada <em>The Cliente View Model Seleccionada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Cliente View Model Seleccionada</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getTheClienteViewModelSeleccionada()
	 * @see #getContenedorMaestroClienteViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroClienteViewModel_TheClienteViewModelSeleccionada();

	/**
	 * Returns the meta object for the reference list '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getContenedorDetalleCompraViewModel <em>Contenedor Detalle Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contenedor Detalle Compra View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getContenedorDetalleCompraViewModel()
	 * @see #getContenedorMaestroClienteViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroClienteViewModel_ContenedorDetalleCompraViewModel();

	/**
	 * Returns the meta object for the reference list '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getContenedorDetallePedidoViewModel <em>Contenedor Detalle Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contenedor Detalle Pedido View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getContenedorDetallePedidoViewModel()
	 * @see #getContenedorMaestroClienteViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroClienteViewModel_ContenedorDetallePedidoViewModel();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#implementarModelo()
	 * @generated
	 */
	EOperation getContenedorMaestroClienteViewModel__ImplementarModelo();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#crear() <em>Crear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#crear()
	 * @generated
	 */
	EOperation getContenedorMaestroClienteViewModel__Crear();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#update()
	 * @generated
	 */
	EOperation getContenedorMaestroClienteViewModel__Update();

	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel <em>Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente View Model</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ClienteViewModel
	 * @generated
	 */
	EClass getClienteViewModel();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getNombre()
	 * @see #getClienteViewModel()
	 * @generated
	 */
	EAttribute getClienteViewModel_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getCodigo()
	 * @see #getClienteViewModel()
	 * @generated
	 */
	EAttribute getClienteViewModel_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getTipoCliente <em>Tipo Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Cliente</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getTipoCliente()
	 * @see #getClienteViewModel()
	 * @generated
	 */
	EAttribute getClienteViewModel_TipoCliente();

	/**
	 * Returns the meta object for the container reference '{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getOwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By</em>'.
	 * @see tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getOwnedBy()
	 * @see #getClienteViewModel()
	 * @generated
	 */
	EReference getClienteViewModel_OwnedBy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenedorcrudclientesFactory getContenedorcrudclientesFactory();

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
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorCRUDClienteViewModelImpl <em>Contenedor CRUD Cliente View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorCRUDClienteViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorcrudclientesPackageImpl#getContenedorCRUDClienteViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorCRUDClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI = eINSTANCE.getContenedorCRUDClienteViewModel_UI();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Maestro Cliente View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorCRUDClienteViewModel_TheContenedorMaestroClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Detalle Cliente View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorCRUDClienteViewModel_TheContenedorDetalleClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Crear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___CREAR = eINSTANCE.getContenedorCRUDClienteViewModel__Crear();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___IMPLEMENTAR_MODELO = eINSTANCE.getContenedorCRUDClienteViewModel__ImplementarModelo();

		/**
		 * The meta object literal for the '<em><b>Enlazar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___ENLAZAR = eINSTANCE.getContenedorCRUDClienteViewModel__Enlazar();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___UPDATE = eINSTANCE.getContenedorCRUDClienteViewModel__Update();

		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorDetalleClienteViewModelImpl <em>Contenedor Detalle Cliente View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorDetalleClienteViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorcrudclientesPackageImpl#getContenedorDetalleClienteViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorDetalleClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__NOMBRE = eINSTANCE.getContenedorDetalleClienteViewModel_Nombre();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CODIGO = eINSTANCE.getContenedorDetalleClienteViewModel_Codigo();

		/**
		 * The meta object literal for the '<em><b>Tipo Cliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__TIPO_CLIENTE = eINSTANCE.getContenedorDetalleClienteViewModel_TipoCliente();

		/**
		 * The meta object literal for the '<em><b>Contenedor CRUD Cliente View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorDetalleClienteViewModel_ContenedorCRUDClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL___IMPLEMENTAR_MODELO = eINSTANCE.getContenedorDetalleClienteViewModel__ImplementarModelo();

		/**
		 * The meta object literal for the '<em><b>Crear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL___CREAR = eINSTANCE.getContenedorDetalleClienteViewModel__Crear();

		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorMaestroClienteViewModelImpl <em>Contenedor Maestro Cliente View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorMaestroClienteViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorcrudclientesPackageImpl#getContenedorMaestroClienteViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorMaestroClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY = eINSTANCE.getContenedorMaestroClienteViewModel_OwnedBy();

		/**
		 * The meta object literal for the '<em><b>The Cliente View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorMaestroClienteViewModel_TheClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>The Cliente View Model Seleccionada</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL_SELECCIONADA = eINSTANCE.getContenedorMaestroClienteViewModel_TheClienteViewModelSeleccionada();

		/**
		 * The meta object literal for the '<em><b>Contenedor Detalle Compra View Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL = eINSTANCE.getContenedorMaestroClienteViewModel_ContenedorDetalleCompraViewModel();

		/**
		 * The meta object literal for the '<em><b>Contenedor Detalle Pedido View Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL = eINSTANCE.getContenedorMaestroClienteViewModel_ContenedorDetallePedidoViewModel();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL___IMPLEMENTAR_MODELO = eINSTANCE.getContenedorMaestroClienteViewModel__ImplementarModelo();

		/**
		 * The meta object literal for the '<em><b>Crear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL___CREAR = eINSTANCE.getContenedorMaestroClienteViewModel__Crear();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL___UPDATE = eINSTANCE.getContenedorMaestroClienteViewModel__Update();

		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorcrudclientes.impl.ClienteViewModelImpl <em>Cliente View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorcrudclientes.impl.ClienteViewModelImpl
		 * @see tiendacristal.ui.contenedorcrudclientes.impl.ContenedorcrudclientesPackageImpl#getClienteViewModel()
		 * @generated
		 */
		EClass CLIENTE_VIEW_MODEL = eINSTANCE.getClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE_VIEW_MODEL__NOMBRE = eINSTANCE.getClienteViewModel_Nombre();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE_VIEW_MODEL__CODIGO = eINSTANCE.getClienteViewModel_Codigo();

		/**
		 * The meta object literal for the '<em><b>Tipo Cliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE_VIEW_MODEL__TIPO_CLIENTE = eINSTANCE.getClienteViewModel_TipoCliente();

		/**
		 * The meta object literal for the '<em><b>Owned By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE_VIEW_MODEL__OWNED_BY = eINSTANCE.getClienteViewModel_OwnedBy();

	}

} //ContenedorcrudclientesPackage
