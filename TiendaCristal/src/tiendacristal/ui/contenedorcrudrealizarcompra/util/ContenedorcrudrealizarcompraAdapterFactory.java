/**
 */
package tiendacristal.ui.contenedorcrudrealizarcompra.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ui.contenedorcrudrealizarcompra.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage
 * @generated
 */
public class ContenedorcrudrealizarcompraAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorcrudrealizarcompraPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudrealizarcompraAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContenedorcrudrealizarcompraPackage.eINSTANCE;
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
	protected ContenedorcrudrealizarcompraSwitch<Adapter> modelSwitch =
		new ContenedorcrudrealizarcompraSwitch<Adapter>() {
			@Override
			public Adapter caseContenedorCRUDCompraViewModel(ContenedorCRUDCompraViewModel object) {
				return createContenedorCRUDCompraViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorDetalleCompraViewModel(ContenedorDetalleCompraViewModel object) {
				return createContenedorDetalleCompraViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorMaestroCompraViewModel(ContenedorMaestroCompraViewModel object) {
				return createContenedorMaestroCompraViewModelAdapter();
			}
			@Override
			public Adapter caseCompraViewModel(CompraViewModel object) {
				return createCompraViewModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel <em>Contenedor CRUD Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel
	 * @generated
	 */
	public Adapter createContenedorCRUDCompraViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel <em>Contenedor Detalle Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel
	 * @generated
	 */
	public Adapter createContenedorDetalleCompraViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel <em>Contenedor Maestro Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel
	 * @generated
	 */
	public Adapter createContenedorMaestroCompraViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel <em>Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel
	 * @generated
	 */
	public Adapter createCompraViewModelAdapter() {
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

} //ContenedorcrudrealizarcompraAdapterFactory
