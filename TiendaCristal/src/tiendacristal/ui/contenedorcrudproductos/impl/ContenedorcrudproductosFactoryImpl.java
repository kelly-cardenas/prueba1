/**
 */
package tiendacristal.ui.contenedorcrudproductos.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tiendacristal.ui.contenedorcrudproductos.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorcrudproductosFactoryImpl extends EFactoryImpl implements ContenedorcrudproductosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenedorcrudproductosFactory init() {
		try {
			ContenedorcrudproductosFactory theContenedorcrudproductosFactory = (ContenedorcrudproductosFactory)EPackage.Registry.INSTANCE.getEFactory(ContenedorcrudproductosPackage.eNS_URI);
			if (theContenedorcrudproductosFactory != null) {
				return theContenedorcrudproductosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenedorcrudproductosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudproductosFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL: return createContenedorCRUDProductosViewModel();
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL: return createContenedorDetalleProductosViewmodel();
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL: return createContenedorMestroProductosViewModel();
			case ContenedorcrudproductosPackage.PRODUCTOS_VIEW_MODEL: return createProductosViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDProductosViewModel createContenedorCRUDProductosViewModel() {
		ContenedorCRUDProductosViewModelImpl contenedorCRUDProductosViewModel = new ContenedorCRUDProductosViewModelImpl();
		return contenedorCRUDProductosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleProductosViewmodel createContenedorDetalleProductosViewmodel() {
		ContenedorDetalleProductosViewmodelImpl contenedorDetalleProductosViewmodel = new ContenedorDetalleProductosViewmodelImpl();
		return contenedorDetalleProductosViewmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMestroProductosViewModel createContenedorMestroProductosViewModel() {
		ContenedorMestroProductosViewModelImpl contenedorMestroProductosViewModel = new ContenedorMestroProductosViewModelImpl();
		return contenedorMestroProductosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductosViewModel createProductosViewModel() {
		ProductosViewModelImpl productosViewModel = new ProductosViewModelImpl();
		return productosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudproductosPackage getContenedorcrudproductosPackage() {
		return (ContenedorcrudproductosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenedorcrudproductosPackage getPackage() {
		return ContenedorcrudproductosPackage.eINSTANCE;
	}

} //ContenedorcrudproductosFactoryImpl
