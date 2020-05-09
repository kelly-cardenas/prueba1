/**
 */
package tiendacristal.ui.contenedorpedidoviewpart.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ui.contenedorpedidoviewpart.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tiendacristal.ui.contenedorpedidoviewpart.ContenedorpedidoviewpartPackage
 * @generated
 */
public class ContenedorpedidoviewpartAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorpedidoviewpartPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorpedidoviewpartAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContenedorpedidoviewpartPackage.eINSTANCE;
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
	protected ContenedorpedidoviewpartSwitch<Adapter> modelSwitch =
		new ContenedorpedidoviewpartSwitch<Adapter>() {
			@Override
			public Adapter caseContenedorPedidoViewPart(ContenedorPedidoViewPart object) {
				return createContenedorPedidoViewPartAdapter();
			}
			@Override
			public Adapter casePedidoViewModel(PedidoViewModel object) {
				return createPedidoViewModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart <em>Contenedor Pedido View Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart
	 * @generated
	 */
	public Adapter createContenedorPedidoViewPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.ui.contenedorpedidoviewpart.PedidoViewModel <em>Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.ui.contenedorpedidoviewpart.PedidoViewModel
	 * @generated
	 */
	public Adapter createPedidoViewModelAdapter() {
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

} //ContenedorpedidoviewpartAdapterFactory
