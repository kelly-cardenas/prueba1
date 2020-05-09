/**
 */
package tiendacristal.ui.contenedorcrudclientes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tiendacristal.ui.contenedorcrudclientes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorcrudclientesFactoryImpl extends EFactoryImpl implements ContenedorcrudclientesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenedorcrudclientesFactory init() {
		try {
			ContenedorcrudclientesFactory theContenedorcrudclientesFactory = (ContenedorcrudclientesFactory)EPackage.Registry.INSTANCE.getEFactory(ContenedorcrudclientesPackage.eNS_URI);
			if (theContenedorcrudclientesFactory != null) {
				return theContenedorcrudclientesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenedorcrudclientesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudclientesFactoryImpl() {
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
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL: return createContenedorCRUDClienteViewModel();
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL: return createContenedorDetalleClienteViewModel();
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL: return createContenedorMaestroClienteViewModel();
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL: return createClienteViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDClienteViewModel createContenedorCRUDClienteViewModel() {
		ContenedorCRUDClienteViewModelImpl contenedorCRUDClienteViewModel = new ContenedorCRUDClienteViewModelImpl();
		return contenedorCRUDClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleClienteViewModel createContenedorDetalleClienteViewModel() {
		ContenedorDetalleClienteViewModelImpl contenedorDetalleClienteViewModel = new ContenedorDetalleClienteViewModelImpl();
		return contenedorDetalleClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroClienteViewModel createContenedorMaestroClienteViewModel() {
		ContenedorMaestroClienteViewModelImpl contenedorMaestroClienteViewModel = new ContenedorMaestroClienteViewModelImpl();
		return contenedorMaestroClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteViewModel createClienteViewModel() {
		ClienteViewModelImpl clienteViewModel = new ClienteViewModelImpl();
		return clienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudclientesPackage getContenedorcrudclientesPackage() {
		return (ContenedorcrudclientesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenedorcrudclientesPackage getPackage() {
		return ContenedorcrudclientesPackage.eINSTANCE;
	}

} //ContenedorcrudclientesFactoryImpl
