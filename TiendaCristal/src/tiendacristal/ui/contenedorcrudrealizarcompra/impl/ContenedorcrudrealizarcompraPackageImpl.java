/**
 */
package tiendacristal.ui.contenedorcrudrealizarcompra.impl;

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

import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage;

import tiendacristal.ui.contenedorcrudpedido.impl.ContenedorcrudpedidoPackageImpl;

import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage;

import tiendacristal.ui.contenedorcrudproductos.impl.ContenedorcrudproductosPackageImpl;

import tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraFactory;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage;

import tiendacristal.ui.contenedorpedidoviewpart.ContenedorpedidoviewpartPackage;

import tiendacristal.ui.contenedorpedidoviewpart.impl.ContenedorpedidoviewpartPackageImpl;

import tiendacristal.ui.impl.UiPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorcrudrealizarcompraPackageImpl extends EPackageImpl implements ContenedorcrudrealizarcompraPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorCRUDCompraViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorDetalleCompraViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorMaestroCompraViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compraViewModelEClass = null;

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
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContenedorcrudrealizarcompraPackageImpl() {
		super(eNS_URI, ContenedorcrudrealizarcompraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContenedorcrudrealizarcompraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContenedorcrudrealizarcompraPackage init() {
		if (isInited) return (ContenedorcrudrealizarcompraPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI);

		// Obtain or create and register package
		ContenedorcrudrealizarcompraPackageImpl theContenedorcrudrealizarcompraPackage = (ContenedorcrudrealizarcompraPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContenedorcrudrealizarcompraPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContenedorcrudrealizarcompraPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TiendacristalPackageImpl theTiendacristalPackage = (TiendacristalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI) instanceof TiendacristalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI) : TiendacristalPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		ContenedorcrudproductosPackageImpl theContenedorcrudproductosPackage = (ContenedorcrudproductosPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI) instanceof ContenedorcrudproductosPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI) : ContenedorcrudproductosPackage.eINSTANCE);
		ContenedorcrudclientesPackageImpl theContenedorcrudclientesPackage = (ContenedorcrudclientesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI) instanceof ContenedorcrudclientesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI) : ContenedorcrudclientesPackage.eINSTANCE);
		ContenedorcrudpedidoPackageImpl theContenedorcrudpedidoPackage = (ContenedorcrudpedidoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI) instanceof ContenedorcrudpedidoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI) : ContenedorcrudpedidoPackage.eINSTANCE);
		ContenedorpedidoviewpartPackageImpl theContenedorpedidoviewpartPackage = (ContenedorpedidoviewpartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorpedidoviewpartPackage.eNS_URI) instanceof ContenedorpedidoviewpartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorpedidoviewpartPackage.eNS_URI) : ContenedorpedidoviewpartPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);

		// Create package meta-data objects
		theContenedorcrudrealizarcompraPackage.createPackageContents();
		theTiendacristalPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theContenedorcrudproductosPackage.createPackageContents();
		theContenedorcrudclientesPackage.createPackageContents();
		theContenedorcrudpedidoPackage.createPackageContents();
		theContenedorpedidoviewpartPackage.createPackageContents();
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		theContenedorcrudrealizarcompraPackage.initializePackageContents();
		theTiendacristalPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theContenedorcrudproductosPackage.initializePackageContents();
		theContenedorcrudclientesPackage.initializePackageContents();
		theContenedorcrudpedidoPackage.initializePackageContents();
		theContenedorpedidoviewpartPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContenedorcrudrealizarcompraPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContenedorcrudrealizarcompraPackage.eNS_URI, theContenedorcrudrealizarcompraPackage);
		return theContenedorcrudrealizarcompraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorCRUDCompraViewModel() {
		return contenedorCRUDCompraViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDCompraViewModel_UI() {
		return (EReference)contenedorCRUDCompraViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDCompraViewModel_TheContenedorDetalleCompraViewModel() {
		return (EReference)contenedorCRUDCompraViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDCompraViewModel_TheContenedorMaestroCompraViewModel() {
		return (EReference)contenedorCRUDCompraViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDCompraViewModel__ImplementarModelo() {
		return contenedorCRUDCompraViewModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDCompraViewModel__CrearCompra() {
		return contenedorCRUDCompraViewModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDCompraViewModel__Crear() {
		return contenedorCRUDCompraViewModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDCompraViewModel__Implementar() {
		return contenedorCRUDCompraViewModelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDCompraViewModel__Enlazar() {
		return contenedorCRUDCompraViewModelEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorDetalleCompraViewModel() {
		return contenedorDetalleCompraViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleCompraViewModel_Codigo() {
		return (EAttribute)contenedorDetalleCompraViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleCompraViewModel_IdCliente() {
		return (EAttribute)contenedorDetalleCompraViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleCompraViewModel_CodigoP() {
		return (EAttribute)contenedorDetalleCompraViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleCompraViewModel_Fecha() {
		return (EAttribute)contenedorDetalleCompraViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleCompraViewModel_Total() {
		return (EAttribute)contenedorDetalleCompraViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetalleCompraViewModel_ContenedorCRUDCompraViewModel() {
		return (EReference)contenedorDetalleCompraViewModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetalleCompraViewModel_TheContenedorMaestroClienteViewModel() {
		return (EReference)contenedorDetalleCompraViewModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetalleCompraViewModel_TheContenedorMestroProductosViewModel() {
		return (EReference)contenedorDetalleCompraViewModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetalleCompraViewModel_TheContenedorMaestroPedidoViewModel() {
		return (EReference)contenedorDetalleCompraViewModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorDetalleCompraViewModel__Crear() {
		return contenedorDetalleCompraViewModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorDetalleCompraViewModel__Create() {
		return contenedorDetalleCompraViewModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorDetalleCompraViewModel__ImplementarModelo() {
		return contenedorDetalleCompraViewModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorMaestroCompraViewModel() {
		return contenedorMaestroCompraViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroCompraViewModel_ContenedorCRUDCompraViewModel() {
		return (EReference)contenedorMaestroCompraViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroCompraViewModel_ListaCompraViewModel() {
		return (EReference)contenedorMaestroCompraViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorMaestroCompraViewModel__Create() {
		return contenedorMaestroCompraViewModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorMaestroCompraViewModel__ImplementarModelo() {
		return contenedorMaestroCompraViewModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompraViewModel() {
		return compraViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompraViewModel_Codigo() {
		return (EAttribute)compraViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompraViewModel_IdCliente() {
		return (EAttribute)compraViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompraViewModel_CodigoP() {
		return (EAttribute)compraViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompraViewModel_Fecha() {
		return (EAttribute)compraViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompraViewModel_Total() {
		return (EAttribute)compraViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompraViewModel_ContenedorMaestroCompraViewModel() {
		return (EReference)compraViewModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudrealizarcompraFactory getContenedorcrudrealizarcompraFactory() {
		return (ContenedorcrudrealizarcompraFactory)getEFactoryInstance();
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
		contenedorCRUDCompraViewModelEClass = createEClass(CONTENEDOR_CRUD_COMPRA_VIEW_MODEL);
		createEReference(contenedorCRUDCompraViewModelEClass, CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI);
		createEReference(contenedorCRUDCompraViewModelEClass, CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL);
		createEReference(contenedorCRUDCompraViewModelEClass, CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL);
		createEOperation(contenedorCRUDCompraViewModelEClass, CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___IMPLEMENTAR_MODELO);
		createEOperation(contenedorCRUDCompraViewModelEClass, CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___CREAR_COMPRA);
		createEOperation(contenedorCRUDCompraViewModelEClass, CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___CREAR);
		createEOperation(contenedorCRUDCompraViewModelEClass, CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___IMPLEMENTAR);
		createEOperation(contenedorCRUDCompraViewModelEClass, CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___ENLAZAR);

		contenedorDetalleCompraViewModelEClass = createEClass(CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL);
		createEAttribute(contenedorDetalleCompraViewModelEClass, CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO);
		createEAttribute(contenedorDetalleCompraViewModelEClass, CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__ID_CLIENTE);
		createEAttribute(contenedorDetalleCompraViewModelEClass, CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO_P);
		createEAttribute(contenedorDetalleCompraViewModelEClass, CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__FECHA);
		createEAttribute(contenedorDetalleCompraViewModelEClass, CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__TOTAL);
		createEReference(contenedorDetalleCompraViewModelEClass, CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL);
		createEReference(contenedorDetalleCompraViewModelEClass, CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL);
		createEReference(contenedorDetalleCompraViewModelEClass, CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL);
		createEReference(contenedorDetalleCompraViewModelEClass, CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL);
		createEOperation(contenedorDetalleCompraViewModelEClass, CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL___CREAR);
		createEOperation(contenedorDetalleCompraViewModelEClass, CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL___CREATE);
		createEOperation(contenedorDetalleCompraViewModelEClass, CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL___IMPLEMENTAR_MODELO);

		contenedorMaestroCompraViewModelEClass = createEClass(CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL);
		createEReference(contenedorMaestroCompraViewModelEClass, CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL);
		createEReference(contenedorMaestroCompraViewModelEClass, CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__LISTA_COMPRA_VIEW_MODEL);
		createEOperation(contenedorMaestroCompraViewModelEClass, CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL___CREATE);
		createEOperation(contenedorMaestroCompraViewModelEClass, CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL___IMPLEMENTAR_MODELO);

		compraViewModelEClass = createEClass(COMPRA_VIEW_MODEL);
		createEAttribute(compraViewModelEClass, COMPRA_VIEW_MODEL__CODIGO);
		createEAttribute(compraViewModelEClass, COMPRA_VIEW_MODEL__ID_CLIENTE);
		createEAttribute(compraViewModelEClass, COMPRA_VIEW_MODEL__CODIGO_P);
		createEAttribute(compraViewModelEClass, COMPRA_VIEW_MODEL__FECHA);
		createEAttribute(compraViewModelEClass, COMPRA_VIEW_MODEL__TOTAL);
		createEReference(compraViewModelEClass, COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL);
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
		ContenedorcrudpedidoPackage theContenedorcrudpedidoPackage = (ContenedorcrudpedidoPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(contenedorCRUDCompraViewModelEClass, ContenedorCRUDCompraViewModel.class, "ContenedorCRUDCompraViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorCRUDCompraViewModel_UI(), theUiPackage.getUI(), theUiPackage.getUI_TheContenedorCRUDRealizarCompraViewModel(), "UI", null, 0, 1, ContenedorCRUDCompraViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorCRUDCompraViewModel_TheContenedorDetalleCompraViewModel(), this.getContenedorDetalleCompraViewModel(), this.getContenedorDetalleCompraViewModel_ContenedorCRUDCompraViewModel(), "theContenedorDetalleCompraViewModel", null, 1, 1, ContenedorCRUDCompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorCRUDCompraViewModel_TheContenedorMaestroCompraViewModel(), this.getContenedorMaestroCompraViewModel(), this.getContenedorMaestroCompraViewModel_ContenedorCRUDCompraViewModel(), "theContenedorMaestroCompraViewModel", null, 1, 1, ContenedorCRUDCompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContenedorCRUDCompraViewModel__ImplementarModelo(), null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDCompraViewModel__CrearCompra(), null, "crearCompra", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDCompraViewModel__Crear(), null, "crear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDCompraViewModel__Implementar(), null, "implementar", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDCompraViewModel__Enlazar(), null, "enlazar", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorDetalleCompraViewModelEClass, ContenedorDetalleCompraViewModel.class, "ContenedorDetalleCompraViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenedorDetalleCompraViewModel_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, ContenedorDetalleCompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleCompraViewModel_IdCliente(), ecorePackage.getEString(), "idCliente", null, 0, 1, ContenedorDetalleCompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleCompraViewModel_CodigoP(), ecorePackage.getEString(), "codigoP", null, 0, 1, ContenedorDetalleCompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleCompraViewModel_Fecha(), ecorePackage.getEString(), "fecha", null, 0, 1, ContenedorDetalleCompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleCompraViewModel_Total(), ecorePackage.getEInt(), "total", null, 0, 1, ContenedorDetalleCompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetalleCompraViewModel_ContenedorCRUDCompraViewModel(), this.getContenedorCRUDCompraViewModel(), this.getContenedorCRUDCompraViewModel_TheContenedorDetalleCompraViewModel(), "ContenedorCRUDCompraViewModel", null, 0, 1, ContenedorDetalleCompraViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetalleCompraViewModel_TheContenedorMaestroClienteViewModel(), theContenedorcrudclientesPackage.getContenedorMaestroClienteViewModel(), theContenedorcrudclientesPackage.getContenedorMaestroClienteViewModel_ContenedorDetalleCompraViewModel(), "theContenedorMaestroClienteViewModel", null, 1, 1, ContenedorDetalleCompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetalleCompraViewModel_TheContenedorMestroProductosViewModel(), theContenedorcrudproductosPackage.getContenedorMestroProductosViewModel(), theContenedorcrudproductosPackage.getContenedorMestroProductosViewModel_ContenedorDetalleCompraViewModel(), "theContenedorMestroProductosViewModel", null, 1, 1, ContenedorDetalleCompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetalleCompraViewModel_TheContenedorMaestroPedidoViewModel(), theContenedorcrudpedidoPackage.getContenedorMaestroPedidoViewModel(), theContenedorcrudpedidoPackage.getContenedorMaestroPedidoViewModel_ContenedorDetalleCompraViewModel(), "theContenedorMaestroPedidoViewModel", null, 1, 1, ContenedorDetalleCompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContenedorDetalleCompraViewModel__Crear(), null, "crear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorDetalleCompraViewModel__Create(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorDetalleCompraViewModel__ImplementarModelo(), null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorMaestroCompraViewModelEClass, ContenedorMaestroCompraViewModel.class, "ContenedorMaestroCompraViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorMaestroCompraViewModel_ContenedorCRUDCompraViewModel(), this.getContenedorCRUDCompraViewModel(), this.getContenedorCRUDCompraViewModel_TheContenedorMaestroCompraViewModel(), "ContenedorCRUDCompraViewModel", null, 0, 1, ContenedorMaestroCompraViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMaestroCompraViewModel_ListaCompraViewModel(), this.getCompraViewModel(), this.getCompraViewModel_ContenedorMaestroCompraViewModel(), "listaCompraViewModel", null, 0, -1, ContenedorMaestroCompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContenedorMaestroCompraViewModel__Create(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorMaestroCompraViewModel__ImplementarModelo(), null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compraViewModelEClass, CompraViewModel.class, "CompraViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompraViewModel_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, CompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompraViewModel_IdCliente(), ecorePackage.getEString(), "idCliente", null, 0, 1, CompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompraViewModel_CodigoP(), ecorePackage.getEString(), "codigoP", null, 0, 1, CompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompraViewModel_Fecha(), ecorePackage.getEString(), "fecha", null, 0, 1, CompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompraViewModel_Total(), ecorePackage.getEInt(), "total", null, 0, 1, CompraViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompraViewModel_ContenedorMaestroCompraViewModel(), this.getContenedorMaestroCompraViewModel(), this.getContenedorMaestroCompraViewModel_ListaCompraViewModel(), "ContenedorMaestroCompraViewModel", null, 0, 1, CompraViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ContenedorcrudrealizarcompraPackageImpl
