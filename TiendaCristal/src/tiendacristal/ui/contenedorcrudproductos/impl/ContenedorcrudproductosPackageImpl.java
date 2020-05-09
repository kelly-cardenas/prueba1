/**
 */
package tiendacristal.ui.contenedorcrudproductos.impl;

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

import tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosFactory;
import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage;
import tiendacristal.ui.contenedorcrudproductos.ProductosViewModel;

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
public class ContenedorcrudproductosPackageImpl extends EPackageImpl implements ContenedorcrudproductosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorCRUDProductosViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorDetalleProductosViewmodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorMestroProductosViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productosViewModelEClass = null;

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
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContenedorcrudproductosPackageImpl() {
		super(eNS_URI, ContenedorcrudproductosFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContenedorcrudproductosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContenedorcrudproductosPackage init() {
		if (isInited) return (ContenedorcrudproductosPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudproductosPackage.eNS_URI);

		// Obtain or create and register package
		ContenedorcrudproductosPackageImpl theContenedorcrudproductosPackage = (ContenedorcrudproductosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContenedorcrudproductosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContenedorcrudproductosPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TiendacristalPackageImpl theTiendacristalPackage = (TiendacristalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI) instanceof TiendacristalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TiendacristalPackage.eNS_URI) : TiendacristalPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		ContenedorcrudclientesPackageImpl theContenedorcrudclientesPackage = (ContenedorcrudclientesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI) instanceof ContenedorcrudclientesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclientesPackage.eNS_URI) : ContenedorcrudclientesPackage.eINSTANCE);
		ContenedorcrudrealizarcompraPackageImpl theContenedorcrudrealizarcompraPackage = (ContenedorcrudrealizarcompraPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI) instanceof ContenedorcrudrealizarcompraPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI) : ContenedorcrudrealizarcompraPackage.eINSTANCE);
		ContenedorcrudpedidoPackageImpl theContenedorcrudpedidoPackage = (ContenedorcrudpedidoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI) instanceof ContenedorcrudpedidoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI) : ContenedorcrudpedidoPackage.eINSTANCE);
		ContenedorpedidoviewpartPackageImpl theContenedorpedidoviewpartPackage = (ContenedorpedidoviewpartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorpedidoviewpartPackage.eNS_URI) instanceof ContenedorpedidoviewpartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorpedidoviewpartPackage.eNS_URI) : ContenedorpedidoviewpartPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);

		// Create package meta-data objects
		theContenedorcrudproductosPackage.createPackageContents();
		theTiendacristalPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theContenedorcrudclientesPackage.createPackageContents();
		theContenedorcrudrealizarcompraPackage.createPackageContents();
		theContenedorcrudpedidoPackage.createPackageContents();
		theContenedorpedidoviewpartPackage.createPackageContents();
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		theContenedorcrudproductosPackage.initializePackageContents();
		theTiendacristalPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theContenedorcrudclientesPackage.initializePackageContents();
		theContenedorcrudrealizarcompraPackage.initializePackageContents();
		theContenedorcrudpedidoPackage.initializePackageContents();
		theContenedorpedidoviewpartPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContenedorcrudproductosPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContenedorcrudproductosPackage.eNS_URI, theContenedorcrudproductosPackage);
		return theContenedorcrudproductosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorCRUDProductosViewModel() {
		return contenedorCRUDProductosViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDProductosViewModel_UI() {
		return (EReference)contenedorCRUDProductosViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDProductosViewModel_TheContenedorDetalleProductosViewmodel() {
		return (EReference)contenedorCRUDProductosViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDProductosViewModel_TheContenedorMestroProductosViewModel() {
		return (EReference)contenedorCRUDProductosViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDProductosViewModel__CrearProducto() {
		return contenedorCRUDProductosViewModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDProductosViewModel__Crear() {
		return contenedorCRUDProductosViewModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDProductosViewModel__Enlazar() {
		return contenedorCRUDProductosViewModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDProductosViewModel__BuscarProductoId__String() {
		return contenedorCRUDProductosViewModelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDProductosViewModel__ImplementarModelo() {
		return contenedorCRUDProductosViewModelEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDProductosViewModel__AgregarListaP() {
		return contenedorCRUDProductosViewModelEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDProductosViewModel__BuscarProductoNombre__String() {
		return contenedorCRUDProductosViewModelEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDProductosViewModel__BuscarProducto() {
		return contenedorCRUDProductosViewModelEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDProductosViewModel__EliminarProducto() {
		return contenedorCRUDProductosViewModelEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorCRUDProductosViewModel__ActualizarProducto() {
		return contenedorCRUDProductosViewModelEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorDetalleProductosViewmodel() {
		return contenedorDetalleProductosViewmodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleProductosViewmodel_Codigo() {
		return (EAttribute)contenedorDetalleProductosViewmodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleProductosViewmodel_Precio() {
		return (EAttribute)contenedorDetalleProductosViewmodelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleProductosViewmodel_Categoria() {
		return (EAttribute)contenedorDetalleProductosViewmodelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleProductosViewmodel_Nombre() {
		return (EAttribute)contenedorDetalleProductosViewmodelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetalleProductosViewmodel_ContenedorCRUDProductosViewModel() {
		return (EReference)contenedorDetalleProductosViewmodelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorDetalleProductosViewmodel__Crear() {
		return contenedorDetalleProductosViewmodelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorDetalleProductosViewmodel__ImplementarModelo() {
		return contenedorDetalleProductosViewmodelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorMestroProductosViewModel() {
		return contenedorMestroProductosViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMestroProductosViewModel_ContenedorCRUDProductosViewModel() {
		return (EReference)contenedorMestroProductosViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMestroProductosViewModel_TheProductosViewModel() {
		return (EReference)contenedorMestroProductosViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMestroProductosViewModel_TheProductoViewModelSeleccionado() {
		return (EReference)contenedorMestroProductosViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMestroProductosViewModel_ContenedorDetalleCompraViewModel() {
		return (EReference)contenedorMestroProductosViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMestroProductosViewModel_ContenedorDetallePedidoViewModel() {
		return (EReference)contenedorMestroProductosViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorMestroProductosViewModel__Crear() {
		return contenedorMestroProductosViewModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenedorMestroProductosViewModel__ImplementarModelo() {
		return contenedorMestroProductosViewModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductosViewModel() {
		return productosViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductosViewModel_Codigo() {
		return (EAttribute)productosViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductosViewModel_Precio() {
		return (EAttribute)productosViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductosViewModel_Categoria() {
		return (EAttribute)productosViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductosViewModel_Nombre() {
		return (EAttribute)productosViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductosViewModel_OwnedBy() {
		return (EReference)productosViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudproductosFactory getContenedorcrudproductosFactory() {
		return (ContenedorcrudproductosFactory)getEFactoryInstance();
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
		contenedorCRUDProductosViewModelEClass = createEClass(CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL);
		createEReference(contenedorCRUDProductosViewModelEClass, CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI);
		createEReference(contenedorCRUDProductosViewModelEClass, CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL);
		createEReference(contenedorCRUDProductosViewModelEClass, CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL);
		createEOperation(contenedorCRUDProductosViewModelEClass, CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___CREAR_PRODUCTO);
		createEOperation(contenedorCRUDProductosViewModelEClass, CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___CREAR);
		createEOperation(contenedorCRUDProductosViewModelEClass, CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___ENLAZAR);
		createEOperation(contenedorCRUDProductosViewModelEClass, CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___BUSCAR_PRODUCTO_ID__STRING);
		createEOperation(contenedorCRUDProductosViewModelEClass, CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___IMPLEMENTAR_MODELO);
		createEOperation(contenedorCRUDProductosViewModelEClass, CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___AGREGAR_LISTA_P);
		createEOperation(contenedorCRUDProductosViewModelEClass, CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___BUSCAR_PRODUCTO_NOMBRE__STRING);
		createEOperation(contenedorCRUDProductosViewModelEClass, CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___BUSCAR_PRODUCTO);
		createEOperation(contenedorCRUDProductosViewModelEClass, CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___ELIMINAR_PRODUCTO);
		createEOperation(contenedorCRUDProductosViewModelEClass, CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___ACTUALIZAR_PRODUCTO);

		contenedorDetalleProductosViewmodelEClass = createEClass(CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL);
		createEAttribute(contenedorDetalleProductosViewmodelEClass, CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CODIGO);
		createEAttribute(contenedorDetalleProductosViewmodelEClass, CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__PRECIO);
		createEAttribute(contenedorDetalleProductosViewmodelEClass, CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CATEGORIA);
		createEAttribute(contenedorDetalleProductosViewmodelEClass, CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__NOMBRE);
		createEReference(contenedorDetalleProductosViewmodelEClass, CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL);
		createEOperation(contenedorDetalleProductosViewmodelEClass, CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL___CREAR);
		createEOperation(contenedorDetalleProductosViewmodelEClass, CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL___IMPLEMENTAR_MODELO);

		contenedorMestroProductosViewModelEClass = createEClass(CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL);
		createEReference(contenedorMestroProductosViewModelEClass, CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL);
		createEReference(contenedorMestroProductosViewModelEClass, CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTOS_VIEW_MODEL);
		createEReference(contenedorMestroProductosViewModelEClass, CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTO_VIEW_MODEL_SELECCIONADO);
		createEReference(contenedorMestroProductosViewModelEClass, CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL);
		createEReference(contenedorMestroProductosViewModelEClass, CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL);
		createEOperation(contenedorMestroProductosViewModelEClass, CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL___CREAR);
		createEOperation(contenedorMestroProductosViewModelEClass, CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL___IMPLEMENTAR_MODELO);

		productosViewModelEClass = createEClass(PRODUCTOS_VIEW_MODEL);
		createEAttribute(productosViewModelEClass, PRODUCTOS_VIEW_MODEL__CODIGO);
		createEAttribute(productosViewModelEClass, PRODUCTOS_VIEW_MODEL__PRECIO);
		createEAttribute(productosViewModelEClass, PRODUCTOS_VIEW_MODEL__CATEGORIA);
		createEAttribute(productosViewModelEClass, PRODUCTOS_VIEW_MODEL__NOMBRE);
		createEReference(productosViewModelEClass, PRODUCTOS_VIEW_MODEL__OWNED_BY);
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
		ContenedorcrudpedidoPackage theContenedorcrudpedidoPackage = (ContenedorcrudpedidoPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudpedidoPackage.eNS_URI);
		ContenedorcrudrealizarcompraPackage theContenedorcrudrealizarcompraPackage = (ContenedorcrudrealizarcompraPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudrealizarcompraPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(contenedorCRUDProductosViewModelEClass, ContenedorCRUDProductosViewModel.class, "ContenedorCRUDProductosViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorCRUDProductosViewModel_UI(), theUiPackage.getUI(), theUiPackage.getUI_TheContenedorCRUDProductosViewModel(), "UI", null, 0, 1, ContenedorCRUDProductosViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorCRUDProductosViewModel_TheContenedorDetalleProductosViewmodel(), this.getContenedorDetalleProductosViewmodel(), this.getContenedorDetalleProductosViewmodel_ContenedorCRUDProductosViewModel(), "theContenedorDetalleProductosViewmodel", null, 1, 1, ContenedorCRUDProductosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorCRUDProductosViewModel_TheContenedorMestroProductosViewModel(), this.getContenedorMestroProductosViewModel(), this.getContenedorMestroProductosViewModel_ContenedorCRUDProductosViewModel(), "theContenedorMestroProductosViewModel", null, 1, 1, ContenedorCRUDProductosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContenedorCRUDProductosViewModel__CrearProducto(), null, "crearProducto", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDProductosViewModel__Crear(), null, "crear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDProductosViewModel__Enlazar(), null, "enlazar", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getContenedorCRUDProductosViewModel__BuscarProductoId__String(), null, "buscarProductoId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nombre", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDProductosViewModel__ImplementarModelo(), null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDProductosViewModel__AgregarListaP(), null, "agregarListaP", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContenedorCRUDProductosViewModel__BuscarProductoNombre__String(), theContenedorcrudpedidoPackage.getProductoComprarViewModel(), "buscarProductoNombre", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nombre", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDProductosViewModel__BuscarProducto(), null, "buscarProducto", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDProductosViewModel__EliminarProducto(), null, "eliminarProducto", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorCRUDProductosViewModel__ActualizarProducto(), null, "actualizarProducto", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorDetalleProductosViewmodelEClass, ContenedorDetalleProductosViewmodel.class, "ContenedorDetalleProductosViewmodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenedorDetalleProductosViewmodel_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, ContenedorDetalleProductosViewmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleProductosViewmodel_Precio(), ecorePackage.getEString(), "precio", null, 0, 1, ContenedorDetalleProductosViewmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleProductosViewmodel_Categoria(), ecorePackage.getEString(), "categoria", null, 0, 1, ContenedorDetalleProductosViewmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleProductosViewmodel_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ContenedorDetalleProductosViewmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetalleProductosViewmodel_ContenedorCRUDProductosViewModel(), this.getContenedorCRUDProductosViewModel(), this.getContenedorCRUDProductosViewModel_TheContenedorDetalleProductosViewmodel(), "ContenedorCRUDProductosViewModel", null, 0, 1, ContenedorDetalleProductosViewmodel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContenedorDetalleProductosViewmodel__Crear(), null, "crear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorDetalleProductosViewmodel__ImplementarModelo(), null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorMestroProductosViewModelEClass, ContenedorMestroProductosViewModel.class, "ContenedorMestroProductosViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorMestroProductosViewModel_ContenedorCRUDProductosViewModel(), this.getContenedorCRUDProductosViewModel(), this.getContenedorCRUDProductosViewModel_TheContenedorMestroProductosViewModel(), "ContenedorCRUDProductosViewModel", null, 0, 1, ContenedorMestroProductosViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMestroProductosViewModel_TheProductosViewModel(), this.getProductosViewModel(), this.getProductosViewModel_OwnedBy(), "theProductosViewModel", null, 0, -1, ContenedorMestroProductosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMestroProductosViewModel_TheProductoViewModelSeleccionado(), this.getProductosViewModel(), null, "theProductoViewModelSeleccionado", null, 1, 1, ContenedorMestroProductosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMestroProductosViewModel_ContenedorDetalleCompraViewModel(), theContenedorcrudrealizarcompraPackage.getContenedorDetalleCompraViewModel(), theContenedorcrudrealizarcompraPackage.getContenedorDetalleCompraViewModel_TheContenedorMestroProductosViewModel(), "ContenedorDetalleCompraViewModel", null, 0, -1, ContenedorMestroProductosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMestroProductosViewModel_ContenedorDetallePedidoViewModel(), theContenedorcrudpedidoPackage.getContenedorDetallePedidoViewModel(), theContenedorcrudpedidoPackage.getContenedorDetallePedidoViewModel_TheContenedorMestroProductosViewModel(), "ContenedorDetallePedidoViewModel", null, 0, -1, ContenedorMestroProductosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContenedorMestroProductosViewModel__Crear(), null, "crear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContenedorMestroProductosViewModel__ImplementarModelo(), null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productosViewModelEClass, ProductosViewModel.class, "ProductosViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductosViewModel_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, ProductosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductosViewModel_Precio(), ecorePackage.getEString(), "precio", null, 0, 1, ProductosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductosViewModel_Categoria(), ecorePackage.getEString(), "categoria", null, 0, 1, ProductosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductosViewModel_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ProductosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductosViewModel_OwnedBy(), this.getContenedorMestroProductosViewModel(), this.getContenedorMestroProductosViewModel_TheProductosViewModel(), "ownedBy", null, 0, 1, ProductosViewModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ContenedorcrudproductosPackageImpl
