/**
 */
package tiendacristal.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tiendacristal.TiendacristalPackage;

import tiendacristal.domain.DomainPackage;

import tiendacristal.domain.impl.DomainPackageImpl;

import tiendacristal.impl.TiendacristalPackageImpl;

import tiendacristal.ui.UiFactory;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiPackageImpl extends EPackageImpl implements UiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiEClass = null;

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
	 * @see tiendacristal.ui.UiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiPackageImpl() {
		super(eNS_URI, UiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiPackage init() {
		if (isInited) return (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Obtain or create and register package
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UiPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TiendacristalPackageImpl theTiendacristalPackage = (TiendacristalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI) instanceof TiendacristalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI) : TiendacristalPackage.eINSTANCE);
		ContenedorcrudproductosPackageImpl theContenedorcrudproductosPackage = (ContenedorcrudproductosPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI) instanceof ContenedorcrudproductosPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI) : ContenedorcrudproductosPackage.eINSTANCE);
		ContenedorcrudclientesPackageImpl theContenedorcrudclientesPackage = (ContenedorcrudclientesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI) instanceof ContenedorcrudclientesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI) : ContenedorcrudclientesPackage.eINSTANCE);
		ContenedorcrudrealizarcompraPackageImpl theContenedorcrudrealizarcompraPackage = (ContenedorcrudrealizarcompraPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI) instanceof ContenedorcrudrealizarcompraPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI) : ContenedorcrudrealizarcompraPackage.eINSTANCE);
		ContenedorcrudpedidoPackageImpl theContenedorcrudpedidoPackage = (ContenedorcrudpedidoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI) instanceof ContenedorcrudpedidoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI) : ContenedorcrudpedidoPackage.eINSTANCE);
		ContenedorpedidoviewpartPackageImpl theContenedorpedidoviewpartPackage = (ContenedorpedidoviewpartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorpedidoviewpartPackage.eNS_URI) instanceof ContenedorpedidoviewpartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorpedidoviewpartPackage.eNS_URI) : ContenedorpedidoviewpartPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);

		// Create package meta-data objects
		theUiPackage.createPackageContents();
		theTiendacristalPackage.createPackageContents();
		theContenedorcrudproductosPackage.createPackageContents();
		theContenedorcrudclientesPackage.createPackageContents();
		theContenedorcrudrealizarcompraPackage.createPackageContents();
		theContenedorcrudpedidoPackage.createPackageContents();
		theContenedorpedidoviewpartPackage.createPackageContents();
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		theUiPackage.initializePackageContents();
		theTiendacristalPackage.initializePackageContents();
		theContenedorcrudproductosPackage.initializePackageContents();
		theContenedorcrudclientesPackage.initializePackageContents();
		theContenedorcrudrealizarcompraPackage.initializePackageContents();
		theContenedorcrudpedidoPackage.initializePackageContents();
		theContenedorpedidoviewpartPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiPackage.eNS_URI, theUiPackage);
		return theUiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUI() {
		return uiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_OwnedByModelFactory() {
		return (EReference)uiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheDomainAsociado() {
		return (EReference)uiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheContenedorCRUDProductosViewModel() {
		return (EReference)uiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheContenedorCRUDClienteViewModel() {
		return (EReference)uiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheContenedorCRUDRealizarCompraViewModel() {
		return (EReference)uiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheContenedorCRUDPedidoViewModel() {
		return (EReference)uiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheContenedorPedidoViewPart() {
		return (EReference)uiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__ImplementarModelo() {
		return uiEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__CrearProducto__ContenedorCRUDProductosViewModel() {
		return uiEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__CrearCompra__ContenedorCRUDCompraViewModel() {
		return uiEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__CrearPedido__ContenedorCRUDPedidoViewModel() {
		return uiEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__BuscarProductoId__String() {
		return uiEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__AgregarListaP__ContenedorCRUDProductosViewModel() {
		return uiEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__BuscarProductoNombre__String() {
		return uiEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__CrearCliente__ContenedorCRUDClienteViewModel() {
		return uiEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__ActualizarCliente__ContenedorCRUDClienteViewModel() {
		return uiEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__EliminarCliente__ContenedorCRUDClienteViewModel() {
		return uiEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__BuscarCliente__ContenedorCRUDClienteViewModel() {
		return uiEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__BuscarProducto__ContenedorCRUDProductosViewModel() {
		return uiEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__EliminarProducto__ContenedorCRUDProductosViewModel() {
		return uiEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__ActualizarProducto__ContenedorCRUDProductosViewModel() {
		return uiEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__UpdateContenedorListadoClientes__ContenedorMaestroClienteViewModel() {
		return uiEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiFactory getUiFactory() {
		return (UiFactory)getEFactoryInstance();
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
		uiEClass = createEClass(UI);
		createEReference(uiEClass, UI__OWNED_BY_MODEL_FACTORY);
		createEReference(uiEClass, UI__THE_DOMAIN_ASOCIADO);
		createEReference(uiEClass, UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL);
		createEReference(uiEClass, UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL);
		createEReference(uiEClass, UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL);
		createEReference(uiEClass, UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL);
		createEReference(uiEClass, UI__THE_CONTENEDOR_PEDIDO_VIEW_PART);
		createEOperation(uiEClass, UI___IMPLEMENTAR_MODELO);
		createEOperation(uiEClass, UI___CREAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL);
		createEOperation(uiEClass, UI___CREAR_COMPRA__CONTENEDORCRUDCOMPRAVIEWMODEL);
		createEOperation(uiEClass, UI___CREAR_PEDIDO__CONTENEDORCRUDPEDIDOVIEWMODEL);
		createEOperation(uiEClass, UI___BUSCAR_PRODUCTO_ID__STRING);
		createEOperation(uiEClass, UI___AGREGAR_LISTA_P__CONTENEDORCRUDPRODUCTOSVIEWMODEL);
		createEOperation(uiEClass, UI___BUSCAR_PRODUCTO_NOMBRE__STRING);
		createEOperation(uiEClass, UI___CREAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL);
		createEOperation(uiEClass, UI___ACTUALIZAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL);
		createEOperation(uiEClass, UI___ELIMINAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL);
		createEOperation(uiEClass, UI___BUSCAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL);
		createEOperation(uiEClass, UI___BUSCAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL);
		createEOperation(uiEClass, UI___ELIMINAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL);
		createEOperation(uiEClass, UI___ACTUALIZAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL);
		createEOperation(uiEClass, UI___UPDATE_CONTENEDOR_LISTADO_CLIENTES__CONTENEDORMAESTROCLIENTEVIEWMODEL);
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
		ContenedorcrudproductosPackage theContenedorcrudproductosPackage = (ContenedorcrudproductosPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI);
		ContenedorcrudclientesPackage theContenedorcrudclientesPackage = (ContenedorcrudclientesPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI);
		ContenedorcrudrealizarcompraPackage theContenedorcrudrealizarcompraPackage = (ContenedorcrudrealizarcompraPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI);
		ContenedorcrudpedidoPackage theContenedorcrudpedidoPackage = (ContenedorcrudpedidoPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI);
		ContenedorpedidoviewpartPackage theContenedorpedidoviewpartPackage = (ContenedorpedidoviewpartPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorpedidoviewpartPackage.eNS_URI);
		TiendacristalPackage theTiendacristalPackage = (TiendacristalPackage)EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theContenedorcrudproductosPackage);
		getESubpackages().add(theContenedorcrudclientesPackage);
		getESubpackages().add(theContenedorcrudrealizarcompraPackage);
		getESubpackages().add(theContenedorcrudpedidoPackage);
		getESubpackages().add(theContenedorpedidoviewpartPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(uiEClass, tiendacristal.ui.UI.class, "UI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUI_OwnedByModelFactory(), theTiendacristalPackage.getModelFactory(), theTiendacristalPackage.getModelFactory_TheUI(), "ownedByModelFactory", null, 0, 1, tiendacristal.ui.UI.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheDomainAsociado(), theDomainPackage.getDomain(), theDomainPackage.getDomain_TheUIAsociado(), "theDomainAsociado", null, 1, 1, tiendacristal.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheContenedorCRUDProductosViewModel(), theContenedorcrudproductosPackage.getContenedorCRUDProductosViewModel(), theContenedorcrudproductosPackage.getContenedorCRUDProductosViewModel_UI(), "theContenedorCRUDProductosViewModel", null, 1, 1, tiendacristal.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheContenedorCRUDClienteViewModel(), theContenedorcrudclientesPackage.getContenedorCRUDClienteViewModel(), theContenedorcrudclientesPackage.getContenedorCRUDClienteViewModel_UI(), "theContenedorCRUDClienteViewModel", null, 1, 1, tiendacristal.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheContenedorCRUDRealizarCompraViewModel(), theContenedorcrudrealizarcompraPackage.getContenedorCRUDCompraViewModel(), theContenedorcrudrealizarcompraPackage.getContenedorCRUDCompraViewModel_UI(), "theContenedorCRUDRealizarCompraViewModel", null, 1, 1, tiendacristal.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheContenedorCRUDPedidoViewModel(), theContenedorcrudpedidoPackage.getContenedorCRUDPedidoViewModel(), theContenedorcrudpedidoPackage.getContenedorCRUDPedidoViewModel_UI(), "theContenedorCRUDPedidoViewModel", null, 1, 1, tiendacristal.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheContenedorPedidoViewPart(), theContenedorpedidoviewpartPackage.getContenedorPedidoViewPart(), theContenedorpedidoviewpartPackage.getContenedorPedidoViewPart_UI(), "theContenedorPedidoViewPart", null, 1, 1, tiendacristal.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUI__ImplementarModelo(), this.getUI(), "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getUI__CrearProducto__ContenedorCRUDProductosViewModel(), null, "crearProducto", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudproductosPackage.getContenedorCRUDProductosViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__CrearCompra__ContenedorCRUDCompraViewModel(), null, "crearCompra", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudrealizarcompraPackage.getContenedorCRUDCompraViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__CrearPedido__ContenedorCRUDPedidoViewModel(), null, "crearPedido", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudpedidoPackage.getContenedorCRUDPedidoViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__BuscarProductoId__String(), null, "buscarProductoId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__AgregarListaP__ContenedorCRUDProductosViewModel(), null, "agregarListaP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudproductosPackage.getContenedorCRUDProductosViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__BuscarProductoNombre__String(), theContenedorcrudpedidoPackage.getProductoComprarViewModel(), "buscarProductoNombre", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nombre", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__CrearCliente__ContenedorCRUDClienteViewModel(), null, "crearCliente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudclientesPackage.getContenedorCRUDClienteViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__ActualizarCliente__ContenedorCRUDClienteViewModel(), null, "actualizarCliente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudclientesPackage.getContenedorCRUDClienteViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__EliminarCliente__ContenedorCRUDClienteViewModel(), null, "eliminarCliente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudclientesPackage.getContenedorCRUDClienteViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__BuscarCliente__ContenedorCRUDClienteViewModel(), null, "buscarCliente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudclientesPackage.getContenedorCRUDClienteViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__BuscarProducto__ContenedorCRUDProductosViewModel(), null, "buscarProducto", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudproductosPackage.getContenedorCRUDProductosViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__EliminarProducto__ContenedorCRUDProductosViewModel(), null, "eliminarProducto", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudproductosPackage.getContenedorCRUDProductosViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__ActualizarProducto__ContenedorCRUDProductosViewModel(), null, "actualizarProducto", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudproductosPackage.getContenedorCRUDProductosViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__UpdateContenedorListadoClientes__ContenedorMaestroClienteViewModel(), null, "updateContenedorListadoClientes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudclientesPackage.getContenedorMaestroClienteViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //UiPackageImpl
