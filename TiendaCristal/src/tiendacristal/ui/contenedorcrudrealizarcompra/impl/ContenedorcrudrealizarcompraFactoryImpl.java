/**
 */
package tiendacristal.ui.contenedorcrudrealizarcompra.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tiendacristal.ui.contenedorcrudrealizarcompra.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorcrudrealizarcompraFactoryImpl extends EFactoryImpl implements ContenedorcrudrealizarcompraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenedorcrudrealizarcompraFactory init() {
		try {
			ContenedorcrudrealizarcompraFactory theContenedorcrudrealizarcompraFactory = (ContenedorcrudrealizarcompraFactory)EPackage.Registry.INSTANCE.getEFactory(ContenedorcrudrealizarcompraPackage.eNS_URI);
			if (theContenedorcrudrealizarcompraFactory != null) {
				return theContenedorcrudrealizarcompraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenedorcrudrealizarcompraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudrealizarcompraFactoryImpl() {
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL: return createContenedorCRUDCompraViewModel();
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL: return createContenedorDetalleCompraViewModel();
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL: return createContenedorMaestroCompraViewModel();
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL: return createCompraViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDCompraViewModel createContenedorCRUDCompraViewModel() {
		ContenedorCRUDCompraViewModelImpl contenedorCRUDCompraViewModel = new ContenedorCRUDCompraViewModelImpl();
		return contenedorCRUDCompraViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleCompraViewModel createContenedorDetalleCompraViewModel() {
		ContenedorDetalleCompraViewModelImpl contenedorDetalleCompraViewModel = new ContenedorDetalleCompraViewModelImpl();
		return contenedorDetalleCompraViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroCompraViewModel createContenedorMaestroCompraViewModel() {
		ContenedorMaestroCompraViewModelImpl contenedorMaestroCompraViewModel = new ContenedorMaestroCompraViewModelImpl();
		return contenedorMaestroCompraViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompraViewModel createCompraViewModel() {
		CompraViewModelImpl compraViewModel = new CompraViewModelImpl();
		return compraViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudrealizarcompraPackage getContenedorcrudrealizarcompraPackage() {
		return (ContenedorcrudrealizarcompraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenedorcrudrealizarcompraPackage getPackage() {
		return ContenedorcrudrealizarcompraPackage.eINSTANCE;
	}

} //ContenedorcrudrealizarcompraFactoryImpl
