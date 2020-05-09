/**
 */
package tiendacristal.ui.contenedorpedidoviewpart.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tiendacristal.ui.contenedorpedidoviewpart.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorpedidoviewpartFactoryImpl extends EFactoryImpl implements ContenedorpedidoviewpartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenedorpedidoviewpartFactory init() {
		try {
			ContenedorpedidoviewpartFactory theContenedorpedidoviewpartFactory = (ContenedorpedidoviewpartFactory)EPackage.Registry.INSTANCE.getEFactory(ContenedorpedidoviewpartPackage.eNS_URI);
			if (theContenedorpedidoviewpartFactory != null) {
				return theContenedorpedidoviewpartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenedorpedidoviewpartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorpedidoviewpartFactoryImpl() {
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
			case ContenedorpedidoviewpartPackage.CONTENEDOR_PEDIDO_VIEW_PART: return createContenedorPedidoViewPart();
			case ContenedorpedidoviewpartPackage.PEDIDO_VIEW_MODEL: return createPedidoViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorPedidoViewPart createContenedorPedidoViewPart() {
		ContenedorPedidoViewPartImpl contenedorPedidoViewPart = new ContenedorPedidoViewPartImpl();
		return contenedorPedidoViewPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedidoViewModel createPedidoViewModel() {
		PedidoViewModelImpl pedidoViewModel = new PedidoViewModelImpl();
		return pedidoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorpedidoviewpartPackage getContenedorpedidoviewpartPackage() {
		return (ContenedorpedidoviewpartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenedorpedidoviewpartPackage getPackage() {
		return ContenedorpedidoviewpartPackage.eINSTANCE;
	}

} //ContenedorpedidoviewpartFactoryImpl
