/**
 */
package tiendacristal.domain.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.domain.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tiendacristal.domain.DomainPackage
 * @generated
 */
public class DomainAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DomainPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DomainPackage.eINSTANCE;
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
	protected DomainSwitch<Adapter> modelSwitch =
		new DomainSwitch<Adapter>() {
			@Override
			public Adapter casePedido(Pedido object) {
				return createPedidoAdapter();
			}
			@Override
			public Adapter caseCompra(Compra object) {
				return createCompraAdapter();
			}
			@Override
			public Adapter caseCliente(Cliente object) {
				return createClienteAdapter();
			}
			@Override
			public Adapter caseAdministrador(Administrador object) {
				return createAdministradorAdapter();
			}
			@Override
			public Adapter caseProducto(Producto object) {
				return createProductoAdapter();
			}
			@Override
			public Adapter caseReciboPago(ReciboPago object) {
				return createReciboPagoAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseDistribuidoraCristal(DistribuidoraCristal object) {
				return createDistribuidoraCristalAdapter();
			}
			@Override
			public Adapter caseVendedor(Vendedor object) {
				return createVendedorAdapter();
			}
			@Override
			public Adapter caseInventario(Inventario object) {
				return createInventarioAdapter();
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
	 * Creates a new adapter for an object of class '{@link tiendacristal.domain.Pedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.domain.Pedido
	 * @generated
	 */
	public Adapter createPedidoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.domain.Compra <em>Compra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.domain.Compra
	 * @generated
	 */
	public Adapter createCompraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.domain.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.domain.Cliente
	 * @generated
	 */
	public Adapter createClienteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.domain.Administrador <em>Administrador</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.domain.Administrador
	 * @generated
	 */
	public Adapter createAdministradorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.domain.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.domain.Producto
	 * @generated
	 */
	public Adapter createProductoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.domain.ReciboPago <em>Recibo Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.domain.ReciboPago
	 * @generated
	 */
	public Adapter createReciboPagoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.domain.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.domain.DistribuidoraCristal <em>Distribuidora Cristal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.domain.DistribuidoraCristal
	 * @generated
	 */
	public Adapter createDistribuidoraCristalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.domain.Vendedor <em>Vendedor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.domain.Vendedor
	 * @generated
	 */
	public Adapter createVendedorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tiendacristal.domain.Inventario <em>Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tiendacristal.domain.Inventario
	 * @generated
	 */
	public Adapter createInventarioAdapter() {
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

} //DomainAdapterFactory
