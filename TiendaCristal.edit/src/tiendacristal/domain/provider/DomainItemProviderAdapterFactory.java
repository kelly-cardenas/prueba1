/**
 */
package tiendacristal.domain.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import tiendacristal.domain.util.DomainAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainItemProviderAdapterFactory extends DomainAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link tiendacristal.domain.Pedido} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedidoItemProvider pedidoItemProvider;

	/**
	 * This creates an adapter for a {@link tiendacristal.domain.Pedido}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPedidoAdapter() {
		if (pedidoItemProvider == null) {
			pedidoItemProvider = new PedidoItemProvider(this);
		}

		return pedidoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tiendacristal.domain.Compra} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompraItemProvider compraItemProvider;

	/**
	 * This creates an adapter for a {@link tiendacristal.domain.Compra}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompraAdapter() {
		if (compraItemProvider == null) {
			compraItemProvider = new CompraItemProvider(this);
		}

		return compraItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tiendacristal.domain.Cliente} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClienteItemProvider clienteItemProvider;

	/**
	 * This creates an adapter for a {@link tiendacristal.domain.Cliente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClienteAdapter() {
		if (clienteItemProvider == null) {
			clienteItemProvider = new ClienteItemProvider(this);
		}

		return clienteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tiendacristal.domain.Administrador} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministradorItemProvider administradorItemProvider;

	/**
	 * This creates an adapter for a {@link tiendacristal.domain.Administrador}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdministradorAdapter() {
		if (administradorItemProvider == null) {
			administradorItemProvider = new AdministradorItemProvider(this);
		}

		return administradorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tiendacristal.domain.Producto} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductoItemProvider productoItemProvider;

	/**
	 * This creates an adapter for a {@link tiendacristal.domain.Producto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductoAdapter() {
		if (productoItemProvider == null) {
			productoItemProvider = new ProductoItemProvider(this);
		}

		return productoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tiendacristal.domain.ReciboPago} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReciboPagoItemProvider reciboPagoItemProvider;

	/**
	 * This creates an adapter for a {@link tiendacristal.domain.ReciboPago}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReciboPagoAdapter() {
		if (reciboPagoItemProvider == null) {
			reciboPagoItemProvider = new ReciboPagoItemProvider(this);
		}

		return reciboPagoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tiendacristal.domain.Domain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainItemProvider domainItemProvider;

	/**
	 * This creates an adapter for a {@link tiendacristal.domain.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainAdapter() {
		if (domainItemProvider == null) {
			domainItemProvider = new DomainItemProvider(this);
		}

		return domainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tiendacristal.domain.DistribuidoraCristal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistribuidoraCristalItemProvider distribuidoraCristalItemProvider;

	/**
	 * This creates an adapter for a {@link tiendacristal.domain.DistribuidoraCristal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDistribuidoraCristalAdapter() {
		if (distribuidoraCristalItemProvider == null) {
			distribuidoraCristalItemProvider = new DistribuidoraCristalItemProvider(this);
		}

		return distribuidoraCristalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tiendacristal.domain.Vendedor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VendedorItemProvider vendedorItemProvider;

	/**
	 * This creates an adapter for a {@link tiendacristal.domain.Vendedor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVendedorAdapter() {
		if (vendedorItemProvider == null) {
			vendedorItemProvider = new VendedorItemProvider(this);
		}

		return vendedorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tiendacristal.domain.Inventario} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventarioItemProvider inventarioItemProvider;

	/**
	 * This creates an adapter for a {@link tiendacristal.domain.Inventario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInventarioAdapter() {
		if (inventarioItemProvider == null) {
			inventarioItemProvider = new InventarioItemProvider(this);
		}

		return inventarioItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (pedidoItemProvider != null) pedidoItemProvider.dispose();
		if (compraItemProvider != null) compraItemProvider.dispose();
		if (clienteItemProvider != null) clienteItemProvider.dispose();
		if (administradorItemProvider != null) administradorItemProvider.dispose();
		if (productoItemProvider != null) productoItemProvider.dispose();
		if (reciboPagoItemProvider != null) reciboPagoItemProvider.dispose();
		if (domainItemProvider != null) domainItemProvider.dispose();
		if (distribuidoraCristalItemProvider != null) distribuidoraCristalItemProvider.dispose();
		if (vendedorItemProvider != null) vendedorItemProvider.dispose();
		if (inventarioItemProvider != null) inventarioItemProvider.dispose();
	}

}
