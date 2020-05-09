/**
 */
package tiendacristal.ui.contenedorcrudpedido.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tiendacristal.ui.contenedorcrudpedido.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorcrudpedidoFactoryImpl extends EFactoryImpl implements ContenedorcrudpedidoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenedorcrudpedidoFactory init() {
		try {
			ContenedorcrudpedidoFactory theContenedorcrudpedidoFactory = (ContenedorcrudpedidoFactory)EPackage.Registry.INSTANCE.getEFactory(ContenedorcrudpedidoPackage.eNS_URI);
			if (theContenedorcrudpedidoFactory != null) {
				return theContenedorcrudpedidoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenedorcrudpedidoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudpedidoFactoryImpl() {
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
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL: return createContenedorCRUDPedidoViewModel();
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL: return createContenedorDetallePedidoViewModel();
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL: return createContenedorMaestroPedidoViewModel();
			case ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL: return createProductoComprarViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDPedidoViewModel createContenedorCRUDPedidoViewModel() {
		ContenedorCRUDPedidoViewModelImpl contenedorCRUDPedidoViewModel = new ContenedorCRUDPedidoViewModelImpl();
		return contenedorCRUDPedidoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetallePedidoViewModel createContenedorDetallePedidoViewModel() {
		ContenedorDetallePedidoViewModelImpl contenedorDetallePedidoViewModel = new ContenedorDetallePedidoViewModelImpl();
		return contenedorDetallePedidoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroPedidoViewModel createContenedorMaestroPedidoViewModel() {
		ContenedorMaestroPedidoViewModelImpl contenedorMaestroPedidoViewModel = new ContenedorMaestroPedidoViewModelImpl();
		return contenedorMaestroPedidoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductoComprarViewModel createProductoComprarViewModel() {
		ProductoComprarViewModelImpl productoComprarViewModel = new ProductoComprarViewModelImpl();
		return productoComprarViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudpedidoPackage getContenedorcrudpedidoPackage() {
		return (ContenedorcrudpedidoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenedorcrudpedidoPackage getPackage() {
		return ContenedorcrudpedidoPackage.eINSTANCE;
	}

} //ContenedorcrudpedidoFactoryImpl
