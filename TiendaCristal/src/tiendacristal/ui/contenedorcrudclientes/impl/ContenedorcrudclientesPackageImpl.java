/**
 */
package tiendacristal.ui.contenedorcrudclientes.impl;

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

import tiendacristal.ui.contenedorcrudclientes.ClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesFactory;
import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage;

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
public class ContenedorcrudclientesPackageImpl extends EPackageImpl implements ContenedorcrudclientesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorCRUDClienteViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorDetalleClienteViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorMaestroClienteViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clienteViewModelEClass = null;

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
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContenedorcrudclientesPackageImpl() {
		super(eNS_URI, ContenedorcrudclientesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContenedorcrudclientesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContenedorcrudclientesPackage init() {
		if (isInited) return (ContenedorcrudclientesPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI);

		// Obtain or create and register package
		ContenedorcrudclientesPackageImpl theContenedorcrudclientesPackage = (ContenedorcrudclientesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContenedorcrudclientesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContenedorcrudclientesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TiendacristalPackageImpl theTiendacristalPackage = (TiendacristalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI) instanceof TiendacristalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI) : TiendacristalPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		ContenedorcrudproductosPackageImpl theContenedorcrudproductosPackage = (ContenedorcrudproductosPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI) instanceof ContenedorcrudproductosPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI) : ContenedorcrudproductosPackage.eINSTANCE);
		ContenedorcrudrealizarcompraPackageImpl theContenedorcrudrealizarcompraPackage = (ContenedorcrudrealizarcompraPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI) instanceof ContenedorcrudrealizarcompraPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI) : ContenedorcrudrealizarcompraPackage.eINSTANCE);
		ContenedorcrudpedidoPackageImpl theContenedorcrudpedidoPackage = (ContenedorcrudpedidoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI) instanceof ContenedorcrudpedidoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI) : ContenedorcrudpedidoPackage.eINSTANCE);
		ContenedorpedidoviewpartPackageImpl theContenedorpedidoviewpartPackage = (ContenedorpedidoviewpartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorpedidoviewpartPackage.eNS_URI) instanceof ContenedorpedidoviewpartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorpedidoviewpartPackage.eNS_URI) : ContenedorpedidoviewpartPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);

		// Create package meta-data objects
		theContenedorcrudclientesPackage.createPackageContents();
		theTiendacristalPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theContenedorcrudproductosPackage.createPackageContents();
		theContenedorcrudrealizarcompraPackage.createPackageContents();
		theContenedorcrudpedidoPackage.createPackageContents();
		theContenedorpedidoviewpartPackage.createPackageContents();
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		theContenedorcrudclientesPackage.initializePackageContents();
		theTiendacristalPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theContenedorcrudproductosPackage.initializePackageContents();
		theContenedorcrudrealizarcompraPackage.initializePackageContents();
		theContenedorcrudpedidoPackage.initializePackageContents();
		theContenedorpedidoviewpartPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContenedorcrudclientesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContenedorcrudclientesPackage.eNS_URI, theContenedorcrudclientesPackage);
		return theContenedorcrudclientesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorCRUDClienteViewModel() {
		return contenedorCRUDClienteViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDClienteViewModel_UI() {
		return (EReference)contenedorCRUDClienteViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDClienteViewModel_TheContenedorMaestroClienteViewModel() {
		return (EReference)contenedorCRUDClienteViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDClienteViewModel_TheContenedorDetalleClienteViewModel() {
		return (EReference)contenedorCRUDClienteViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDClienteViewModel__Crear() {
		return contenedorCRUDClienteViewModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDClienteViewModel__ImplementarModelo() {
		return contenedorCRUDClienteViewModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDClienteViewModel__Enlazar() {
		return contenedorCRUDClienteViewModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDClienteViewModel__Update() {
		return contenedorCRUDClienteViewModelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorDetalleClienteViewModel() {
		return contenedorDetalleClienteViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleClienteViewModel_Nombre() {
		return (EAttribute)contenedorDetalleClienteViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleClienteViewModel_Codigo() {
		return (EAttribute)contenedorDetalleClienteViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleClienteViewModel_TipoCliente() {
		return (EAttribute)contenedorDetalleClienteViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetalleClienteViewModel_ContenedorCRUDClienteViewModel() {
		return (EReference)contenedorDetalleClienteViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorDetalleClienteViewModel__ImplementarModelo() {
		return contenedorDetalleClienteViewModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorDetalleClienteViewModel__Crear() {
		return contenedorDetalleClienteViewModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorMaestroClienteViewModel() {
		return contenedorMaestroClienteViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroClienteViewModel_OwnedBy() {
		return (EReference)contenedorMaestroClienteViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroClienteViewModel_TheClienteViewModel() {
		return (EReference)contenedorMaestroClienteViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroClienteViewModel_TheClienteViewModelSeleccionada() {
		return (EReference)contenedorMaestroClienteViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroClienteViewModel_ContenedorDetalleCompraViewModel() {
		return (EReference)contenedorMaestroClienteViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroClienteViewModel_ContenedorDetallePedidoViewModel() {
		return (EReference)contenedorMaestroClienteViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorMaestroClienteViewModel__ImplementarModelo() {
		return contenedorMaestroClienteViewModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorMaestroClienteViewModel__Crear() {
		return contenedorMaestroClienteViewModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorMaestroClienteViewModel__Update() {
		return contenedorMaestroClienteViewModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClienteViewModel() {
		return clienteViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClienteViewModel_Nombre() {
		return (EAttribute)clienteViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClienteViewModel_Codigo() {
		return (EAttribute)clienteViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClienteViewModel_TipoCliente() {
		return (EAttribute)clienteViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClienteViewModel_OwnedBy() {
		return (EReference)clienteViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudclientesFactory getContenedorcrudclientesFactory() {
		return (ContenedorcrudclientesFactory)getEFactoryInstance();
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
		contenedorCRUDClienteViewModelEClass = createEClass(CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL);
		createEReference(contenedorCRUDClienteViewModelEClass, CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI);
		createEReference(contenedorCRUDClienteViewModelEClass, CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL);
		createEReference(contenedorCRUDClienteViewModelEClass, CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL);
		createEOperation(contenedorCRUDClienteViewModelEClass, CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___CREAR);
		createEOperation(contenedorCRUDClienteViewModelEClass, CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___IMPLEMENTAR_MODELO);
		createEOperation(contenedorCRUDClienteViewModelEClass, CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___ENLAZAR);
		createEOperation(contenedorCRUDClienteViewModelEClass, CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___UPDATE);

		contenedorDetalleClienteViewModelEClass = createEClass(CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL);
		createEAttribute(contenedorDetalleClienteViewModelEClass, CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__NOMBRE);
		createEAttribute(contenedorDetalleClienteViewModelEClass, CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CODIGO);
		createEAttribute(contenedorDetalleClienteViewModelEClass, CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__TIPO_CLIENTE);
		createEReference(contenedorDetalleClienteViewModelEClass, CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL);
		createEOperation(contenedorDetalleClienteViewModelEClass, CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL___IMPLEMENTAR_MODELO);
		createEOperation(contenedorDetalleClienteViewModelEClass, CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL___CREAR);

		contenedorMaestroClienteViewModelEClass = createEClass(CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL);
		createEReference(contenedorMaestroClienteViewModelEClass, CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY);
		createEReference(contenedorMaestroClienteViewModelEClass, CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL);
		createEReference(contenedorMaestroClienteViewModelEClass, CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL_SELECCIONADA);
		createEReference(contenedorMaestroClienteViewModelEClass, CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL);
		createEReference(contenedorMaestroClienteViewModelEClass, CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL);
		createEOperation(contenedorMaestroClienteViewModelEClass, CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL___IMPLEMENTAR_MODELO);
		createEOperation(contenedorMaestroClienteViewModelEClass, CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL___CREAR);
		createEOperation(contenedorMaestroClienteViewModelEClass, CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL___UPDATE);

		clienteViewModelEClass = createEClass(CLIENTE_VIEW_MODEL);
		createEAttribute(clienteViewModelEClass, CLIENTE_VIEW_MODEL__NOMBRE);
		createEAttribute(clienteViewModelEClass, CLIENTE_VIEW_MODEL__CODIGO);
		createEAttribute(clienteViewModelEClass, CLIENTE_VIEW_MODEL__TIPO_CLIENTE);
		createEReference(clienteViewModelEClass, CLIENTE_VIEW_MODEL__OWNED_BY);
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
		ContenedorcrudrealizarcompraPackage theContenedorcrudrealizarcompraPackage = (ContenedorcrudrealizarcompraPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI);
		ContenedorcrudpedidoPackage theContenedorcrudpedidoPackage = (ContenedorcrudpedidoPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(contenedorCRUDClienteViewModelEClass, ContenedorCRUDClienteViewModel.class, "ContenedorCRUDClienteViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorCRUDClienteViewModel_UI(), theUiPackage.getUI(), theUiPackage.getUI_TheContenedorCRUDClienteViewModel(), "UI", null, 0, 1, ContenedorCRUDClienteViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorCRUDClienteViewModel_TheContenedorMaestroClienteViewModel(), this.getContenedorMaestroClienteViewModel(), this.getContenedorMaestroClienteViewModel_OwnedBy(), "theContenedorMaestroClienteViewModel", null, 1, 1, ContenedorCRUDClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorCRUDClienteViewModel_TheContenedorDetalleClienteViewModel(), this.getContenedorDetalleClienteViewModel(), this.getContenedorDetalleClienteViewModel_ContenedorCRUDClienteViewModel(), "theContenedorDetalleClienteViewModel", null, 1, 1, ContenedorCRUDClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContenedorCRUDClienteViewModel__Crear(), null, "crear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDClienteViewModel__ImplementarModelo(), null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDClienteViewModel__Enlazar(), null, "enlazar", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDClienteViewModel__Update(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorDetalleClienteViewModelEClass, ContenedorDetalleClienteViewModel.class, "ContenedorDetalleClienteViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenedorDetalleClienteViewModel_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ContenedorDetalleClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleClienteViewModel_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, ContenedorDetalleClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleClienteViewModel_TipoCliente(), ecorePackage.getEString(), "tipoCliente", null, 0, 1, ContenedorDetalleClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetalleClienteViewModel_ContenedorCRUDClienteViewModel(), this.getContenedorCRUDClienteViewModel(), this.getContenedorCRUDClienteViewModel_TheContenedorDetalleClienteViewModel(), "ContenedorCRUDClienteViewModel", null, 0, 1, ContenedorDetalleClienteViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContenedorDetalleClienteViewModel__ImplementarModelo(), null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorDetalleClienteViewModel__Crear(), null, "crear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorMaestroClienteViewModelEClass, ContenedorMaestroClienteViewModel.class, "ContenedorMaestroClienteViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorMaestroClienteViewModel_OwnedBy(), this.getContenedorCRUDClienteViewModel(), this.getContenedorCRUDClienteViewModel_TheContenedorMaestroClienteViewModel(), "ownedBy", null, 0, 1, ContenedorMaestroClienteViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMaestroClienteViewModel_TheClienteViewModel(), this.getClienteViewModel(), this.getClienteViewModel_OwnedBy(), "theClienteViewModel", null, 0, -1, ContenedorMaestroClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMaestroClienteViewModel_TheClienteViewModelSeleccionada(), this.getClienteViewModel(), null, "theClienteViewModelSeleccionada", null, 1, 1, ContenedorMaestroClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMaestroClienteViewModel_ContenedorDetalleCompraViewModel(), theContenedorcrudrealizarcompraPackage.getContenedorDetalleCompraViewModel(), theContenedorcrudrealizarcompraPackage.getContenedorDetalleCompraViewModel_TheContenedorMaestroClienteViewModel(), "ContenedorDetalleCompraViewModel", null, 0, -1, ContenedorMaestroClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMaestroClienteViewModel_ContenedorDetallePedidoViewModel(), theContenedorcrudpedidoPackage.getContenedorDetallePedidoViewModel(), theContenedorcrudpedidoPackage.getContenedorDetallePedidoViewModel_TheContenedorMaestroClienteViewModel(), "ContenedorDetallePedidoViewModel", null, 0, -1, ContenedorMaestroClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContenedorMaestroClienteViewModel__ImplementarModelo(), null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorMaestroClienteViewModel__Crear(), null, "crear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorMaestroClienteViewModel__Update(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clienteViewModelEClass, ClienteViewModel.class, "ClienteViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClienteViewModel_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClienteViewModel_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, ClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClienteViewModel_TipoCliente(), ecorePackage.getEString(), "tipoCliente", null, 0, 1, ClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClienteViewModel_OwnedBy(), this.getContenedorMaestroClienteViewModel(), this.getContenedorMaestroClienteViewModel_TheClienteViewModel(), "ownedBy", null, 0, 1, ClienteViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ContenedorcrudclientesPackageImpl
