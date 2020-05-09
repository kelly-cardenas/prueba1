/**
 */
package tiendacristal.ui.contenedorcrudclientes.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ui.contenedorcrudclientes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage
 * @generated
 */
public class ContenedorcrudclientesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorcrudclientesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudclientesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContenedorcrudclientesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorcrudclientesSwitch<Adapter> modelSwitch =
		new ContenedorcrudclientesSwitch<Adapter>() {
			@Override
			public Adapter caseContenedorCRUDClienteViewModel(ContenedorCRUDClienteViewModel object) {
				return createContenedorCRUDClienteViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel object) {
				return createContenedorDetalleClienteViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel object) {
				return createContenedorMaestroClienteViewModelAdapter();
			}
			@Override
			public Adapter caseClienteViewModel(ClienteViewModel object) {
				return createClienteViewModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel <em>Contenedor CRUD Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel
	 * @generated
	 */
	public Adapter createContenedorCRUDClienteViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel <em>Contenedor Detalle Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel
	 * @generated
	 */
	public Adapter createContenedorDetalleClienteViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel <em>Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel
	 * @generated
	 */
	public Adapter createContenedorMaestroClienteViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel <em>Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorcrudclientes.ClienteViewModel
	 * @generated
	 */
	public Adapter createClienteViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ContenedorcrudclientesAdapterFactory
