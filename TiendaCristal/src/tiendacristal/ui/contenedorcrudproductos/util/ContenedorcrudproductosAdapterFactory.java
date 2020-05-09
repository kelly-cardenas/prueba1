/**
 */
package tiendacristal.ui.contenedorcrudproductos.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ui.contenedorcrudproductos.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage
 * @generated
 */
public class ContenedorcrudproductosAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorcrudproductosPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudproductosAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContenedorcrudproductosPackage.eINSTANCE;
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
	protected ContenedorcrudproductosSwitch<Adapter> modelSwitch =
		new ContenedorcrudproductosSwitch<Adapter>() {
			@Override
			public Adapter caseContenedorCRUDProductosViewModel(ContenedorCRUDProductosViewModel object) {
				return createContenedorCRUDProductosViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorDetalleProductosViewmodel(ContenedorDetalleProductosViewmodel object) {
				return createContenedorDetalleProductosViewmodelAdapter();
			}
			@Override
			public Adapter caseContenedorMestroProductosViewModel(ContenedorMestroProductosViewModel object) {
				return createContenedorMestroProductosViewModelAdapter();
			}
			@Override
			public Adapter caseProductosViewModel(ProductosViewModel object) {
				return createProductosViewModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel <em>Contenedor CRUD Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel
	 * @generated
	 */
	public Adapter createContenedorCRUDProductosViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel <em>Contenedor Detalle Productos Viewmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel
	 * @generated
	 */
	public Adapter createContenedorDetalleProductosViewmodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel <em>Contenedor Mestro Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel
	 * @generated
	 */
	public Adapter createContenedorMestroProductosViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorcrudproductos.ProductosViewModel <em>Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorcrudproductos.ProductosViewModel
	 * @generated
	 */
	public Adapter createProductosViewModelAdapter() {
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

} //ContenedorcrudproductosAdapterFactory
