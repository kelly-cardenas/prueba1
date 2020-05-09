/**
 */
package tiendacristal.ui.contenedorcrudpedido.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tiendacristal.TiendacristalPackage;

import tiendacristal.domain.DomainPackage;

import tiendacristal.domain.impl.DomainPackageImpl;

import tiendacristal.impl.TiendacristalPackageImpl;

import tiendacristal.ui.UiPackage;

import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage;

import tiendacristal.ui.contenedorcrudclientes.impl.ContenedorcrudclientesPackageImpl;

import tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoFactory;
import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage;
import tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel;

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
public class ContenedorcrudpedidoPackageImpl extends EPackageImpl implements ContenedorcrudpedidoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorCRUDPedidoViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorDetallePedidoViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorMaestroPedidoViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productoComprarViewModelEClass = null;

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
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContenedorcrudpedidoPackageImpl() {
		super(eNS_URI, ContenedorcrudpedidoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContenedorcrudpedidoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContenedorcrudpedidoPackage init() {
		if (isInited) return (ContenedorcrudpedidoPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI);

		// Obtain or create and register package
		ContenedorcrudpedidoPackageImpl theContenedorcrudpedidoPackage = (ContenedorcrudpedidoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContenedorcrudpedidoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContenedorcrudpedidoPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TiendacristalPackageImpl theTiendacristalPackage = (TiendacristalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI) instanceof TiendacristalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI) : TiendacristalPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		ContenedorcrudproductosPackageImpl theContenedorcrudproductosPackage = (ContenedorcrudproductosPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI) instanceof ContenedorcrudproductosPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI) : ContenedorcrudproductosPackage.eINSTANCE);
		ContenedorcrudclientesPackageImpl theContenedorcrudclientesPackage = (ContenedorcrudclientesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI) instanceof ContenedorcrudclientesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI) : ContenedorcrudclientesPackage.eINSTANCE);
		ContenedorcrudrealizarcompraPackageImpl theContenedorcrudrealizarcompraPackage = (ContenedorcrudrealizarcompraPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI) instanceof ContenedorcrudrealizarcompraPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI) : ContenedorcrudrealizarcompraPackage.eINSTANCE);
		ContenedorpedidoviewpartPackageImpl theContenedorpedidoviewpartPackage = (ContenedorpedidoviewpartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorpedidoviewpartPackage.eNS_URI) instanceof ContenedorpedidoviewpartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorpedidoviewpartPackage.eNS_URI) : ContenedorpedidoviewpartPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);

		// Create package meta-data objects
		theContenedorcrudpedidoPackage.createPackageContents();
		theTiendacristalPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theContenedorcrudproductosPackage.createPackageContents();
		theContenedorcrudclientesPackage.createPackageContents();
		theContenedorcrudrealizarcompraPackage.createPackageContents();
		theContenedorpedidoviewpartPackage.createPackageContents();
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		theContenedorcrudpedidoPackage.initializePackageContents();
		theTiendacristalPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theContenedorcrudproductosPackage.initializePackageContents();
		theContenedorcrudclientesPackage.initializePackageContents();
		theContenedorcrudrealizarcompraPackage.initializePackageContents();
		theContenedorpedidoviewpartPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContenedorcrudpedidoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContenedorcrudpedidoPackage.eNS_URI, theContenedorcrudpedidoPackage);
		return theContenedorcrudpedidoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorCRUDPedidoViewModel() {
		return contenedorCRUDPedidoViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDPedidoViewModel_UI() {
		return (EReference)contenedorCRUDPedidoViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDPedidoViewModel_TheContenedorDetallePedidoViewModel() {
		return (EReference)contenedorCRUDPedidoViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDPedidoViewModel_TheContenedorMaestroPedidoViewModel() {
		return (EReference)contenedorCRUDPedidoViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDPedidoViewModel__ImplementarModelo() {
		return contenedorCRUDPedidoViewModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDPedidoViewModel__CrearPedido() {
		return contenedorCRUDPedidoViewModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDPedidoViewModel__Crear() {
		return contenedorCRUDPedidoViewModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorDetallePedidoViewModel() {
		return contenedorDetallePedidoViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetallePedidoViewModel_IdCliente() {
		return (EAttribute)contenedorDetallePedidoViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetallePedidoViewModel_Codigo() {
		return (EAttribute)contenedorDetallePedidoViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetallePedidoViewModel_FechaPedido() {
		return (EAttribute)contenedorDetallePedidoViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetallePedidoViewModel_ContenedorCRUDPedidoViewModel() {
		return (EReference)contenedorDetallePedidoViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetallePedidoViewModel_TheContenedorMaestroClienteViewModel() {
		return (EReference)contenedorDetallePedidoViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetallePedidoViewModel_TheContenedorMestroProductosViewModel() {
		return (EReference)contenedorDetallePedidoViewModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorMaestroPedidoViewModel() {
		return contenedorMaestroPedidoViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroPedidoViewModel_ContenedorDetalleCompraViewModel() {
		return (EReference)contenedorMaestroPedidoViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroPedidoViewModel_ContenedorCRUDPedidoViewModel() {
		return (EReference)contenedorMaestroPedidoViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroPedidoViewModel_ListaProductoComprarViewModel() {
		return (EReference)contenedorMaestroPedidoViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductoComprarViewModel() {
		return productoComprarViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductoComprarViewModel_Codigo() {
		return (EAttribute)productoComprarViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductoComprarViewModel_Nombre() {
		return (EAttribute)productoComprarViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductoComprarViewModel_Precio() {
		return (EAttribute)productoComprarViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductoComprarViewModel_Categoria() {
		return (EAttribute)productoComprarViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductoComprarViewModel_ContenedorMaestroPedidoViewModel() {
		return (EReference)productoComprarViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudpedidoFactory getContenedorcrudpedidoFactory() {
		return (ContenedorcrudpedidoFactory)getEFactoryInstance();
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
		contenedorCRUDPedidoViewModelEClass = createEClass(CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL);
		createEReference(contenedorCRUDPedidoViewModelEClass, CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI);
		createEReference(contenedorCRUDPedidoViewModelEClass, CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL);
		createEReference(contenedorCRUDPedidoViewModelEClass, CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL);
		createEOperation(contenedorCRUDPedidoViewModelEClass, CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL___IMPLEMENTAR_MODELO);
		createEOperation(contenedorCRUDPedidoViewModelEClass, CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL___CREAR_PEDIDO);
		createEOperation(contenedorCRUDPedidoViewModelEClass, CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL___CREAR);

		contenedorDetallePedidoViewModelEClass = createEClass(CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL);
		createEAttribute(contenedorDetallePedidoViewModelEClass, CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__ID_CLIENTE);
		createEAttribute(contenedorDetallePedidoViewModelEClass, CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CODIGO);
		createEAttribute(contenedorDetallePedidoViewModelEClass, CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__FECHA_PEDIDO);
		createEReference(contenedorDetallePedidoViewModelEClass, CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL);
		createEReference(contenedorDetallePedidoViewModelEClass, CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL);
		createEReference(contenedorDetallePedidoViewModelEClass, CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL);

		contenedorMaestroPedidoViewModelEClass = createEClass(CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL);
		createEReference(contenedorMaestroPedidoViewModelEClass, CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL);
		createEReference(contenedorMaestroPedidoViewModelEClass, CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL);
		createEReference(contenedorMaestroPedidoViewModelEClass, CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__LISTA_PRODUCTO_COMPRAR_VIEW_MODEL);

		productoComprarViewModelEClass = createEClass(PRODUCTO_COMPRAR_VIEW_MODEL);
		createEAttribute(productoComprarViewModelEClass, PRODUCTO_COMPRAR_VIEW_MODEL__CODIGO);
		createEAttribute(productoComprarViewModelEClass, PRODUCTO_COMPRAR_VIEW_MODEL__NOMBRE);
		createEAttribute(productoComprarViewModelEClass, PRODUCTO_COMPRAR_VIEW_MODEL__PRECIO);
		createEAttribute(productoComprarViewModelEClass, PRODUCTO_COMPRAR_VIEW_MODEL__CATEGORIA);
		createEReference(productoComprarViewModelEClass, PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL);
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
		ContenedorcrudclientesPackage theContenedorcrudclientesPackage = (ContenedorcrudclientesPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI);
		ContenedorcrudproductosPackage theContenedorcrudproductosPackage = (ContenedorcrudproductosPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI);
		ContenedorcrudrealizarcompraPackage theContenedorcrudrealizarcompraPackage = (ContenedorcrudrealizarcompraPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(contenedorCRUDPedidoViewModelEClass, ContenedorCRUDPedidoViewModel.class, "ContenedorCRUDPedidoViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorCRUDPedidoViewModel_UI(), theUiPackage.getUI(), theUiPackage.getUI_TheContenedorCRUDPedidoViewModel(), "UI", null, 0, 1, ContenedorCRUDPedidoViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorCRUDPedidoViewModel_TheContenedorDetallePedidoViewModel(), this.getContenedorDetallePedidoViewModel(), this.getContenedorDetallePedidoViewModel_ContenedorCRUDPedidoViewModel(), "theContenedorDetallePedidoViewModel", null, 1, 1, ContenedorCRUDPedidoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorCRUDPedidoViewModel_TheContenedorMaestroPedidoViewModel(), this.getContenedorMaestroPedidoViewModel(), this.getContenedorMaestroPedidoViewModel_ContenedorCRUDPedidoViewModel(), "theContenedorMaestroPedidoViewModel", null, 1, 1, ContenedorCRUDPedidoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContenedorCRUDPedidoViewModel__ImplementarModelo(), null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDPedidoViewModel__CrearPedido(), null, "crearPedido", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDPedidoViewModel__Crear(), null, "crear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorDetallePedidoViewModelEClass, ContenedorDetallePedidoViewModel.class, "ContenedorDetallePedidoViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenedorDetallePedidoViewModel_IdCliente(), ecorePackage.getEString(), "idCliente", null, 0, 1, ContenedorDetallePedidoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetallePedidoViewModel_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, ContenedorDetallePedidoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetallePedidoViewModel_FechaPedido(), ecorePackage.getEString(), "fechaPedido", null, 0, 1, ContenedorDetallePedidoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetallePedidoViewModel_ContenedorCRUDPedidoViewModel(), this.getContenedorCRUDPedidoViewModel(), this.getContenedorCRUDPedidoViewModel_TheContenedorDetallePedidoViewModel(), "ContenedorCRUDPedidoViewModel", null, 0, 1, ContenedorDetallePedidoViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetallePedidoViewModel_TheContenedorMaestroClienteViewModel(), theContenedorcrudclientesPackage.getContenedorMaestroClienteViewModel(), theContenedorcrudclientesPackage.getContenedorMaestroClienteViewModel_ContenedorDetallePedidoViewModel(), "theContenedorMaestroClienteViewModel", null, 1, 1, ContenedorDetallePedidoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetallePedidoViewModel_TheContenedorMestroProductosViewModel(), theContenedorcrudproductosPackage.getContenedorMestroProductosViewModel(), theContenedorcrudproductosPackage.getContenedorMestroProductosViewModel_ContenedorDetallePedidoViewModel(), "theContenedorMestroProductosViewModel", null, 1, 1, ContenedorDetallePedidoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorMaestroPedidoViewModelEClass, ContenedorMaestroPedidoViewModel.class, "ContenedorMaestroPedidoViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorMaestroPedidoViewModel_ContenedorDetalleCompraViewModel(), theContenedorcrudrealizarcompraPackage.getContenedorDetalleCompraViewModel(), theContenedorcrudrealizarcompraPackage.getContenedorDetalleCompraViewModel_TheContenedorMaestroPedidoViewModel(), "ContenedorDetalleCompraViewModel", null, 0, -1, ContenedorMaestroPedidoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMaestroPedidoViewModel_ContenedorCRUDPedidoViewModel(), this.getContenedorCRUDPedidoViewModel(), this.getContenedorCRUDPedidoViewModel_TheContenedorMaestroPedidoViewModel(), "ContenedorCRUDPedidoViewModel", null, 0, 1, ContenedorMaestroPedidoViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMaestroPedidoViewModel_ListaProductoComprarViewModel(), this.getProductoComprarViewModel(), this.getProductoComprarViewModel_ContenedorMaestroPedidoViewModel(), "listaProductoComprarViewModel", null, 0, -1, ContenedorMaestroPedidoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productoComprarViewModelEClass, ProductoComprarViewModel.class, "ProductoComprarViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductoComprarViewModel_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, ProductoComprarViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductoComprarViewModel_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ProductoComprarViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductoComprarViewModel_Precio(), ecorePackage.getEString(), "precio", null, 0, 1, ProductoComprarViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductoComprarViewModel_Categoria(), ecorePackage.getEString(), "categoria", null, 0, 1, ProductoComprarViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductoComprarViewModel_ContenedorMaestroPedidoViewModel(), this.getContenedorMaestroPedidoViewModel(), this.getContenedorMaestroPedidoViewModel_ListaProductoComprarViewModel(), "ContenedorMaestroPedidoViewModel", null, 0, 1, ProductoComprarViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ContenedorcrudpedidoPackageImpl
