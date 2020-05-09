/**
 */
package tiendacristal.ui.contenedorcrudrealizarcompra.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tiendacristal.provider.TiendaCristalEditPlugin;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage;

/**
 * This is the item provider adapter for a {@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorDetalleCompraViewModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleCompraViewModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCodigoPropertyDescriptor(object);
			addIdClientePropertyDescriptor(object);
			addCodigoPPropertyDescriptor(object);
			addFechaPropertyDescriptor(object);
			addTotalPropertyDescriptor(object);
			addTheContenedorMaestroClienteViewModelPropertyDescriptor(object);
			addTheContenedorMestroProductosViewModelPropertyDescriptor(object);
			addTheContenedorMaestroPedidoViewModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Codigo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodigoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleCompraViewModel_codigo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleCompraViewModel_codigo_feature", "_UI_ContenedorDetalleCompraViewModel_type"),
				 ContenedorcrudrealizarcompraPackage.Literals.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id Cliente feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdClientePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleCompraViewModel_idCliente_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleCompraViewModel_idCliente_feature", "_UI_ContenedorDetalleCompraViewModel_type"),
				 ContenedorcrudrealizarcompraPackage.Literals.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__ID_CLIENTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Codigo P feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodigoPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleCompraViewModel_codigoP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleCompraViewModel_codigoP_feature", "_UI_ContenedorDetalleCompraViewModel_type"),
				 ContenedorcrudrealizarcompraPackage.Literals.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO_P,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fecha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFechaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleCompraViewModel_fecha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleCompraViewModel_fecha_feature", "_UI_ContenedorDetalleCompraViewModel_type"),
				 ContenedorcrudrealizarcompraPackage.Literals.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__FECHA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleCompraViewModel_total_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleCompraViewModel_total_feature", "_UI_ContenedorDetalleCompraViewModel_type"),
				 ContenedorcrudrealizarcompraPackage.Literals.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__TOTAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the The Contenedor Maestro Cliente View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheContenedorMaestroClienteViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleCompraViewModel_theContenedorMaestroClienteViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleCompraViewModel_theContenedorMaestroClienteViewModel_feature", "_UI_ContenedorDetalleCompraViewModel_type"),
				 ContenedorcrudrealizarcompraPackage.Literals.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the The Contenedor Mestro Productos View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheContenedorMestroProductosViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleCompraViewModel_theContenedorMestroProductosViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleCompraViewModel_theContenedorMestroProductosViewModel_feature", "_UI_ContenedorDetalleCompraViewModel_type"),
				 ContenedorcrudrealizarcompraPackage.Literals.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the The Contenedor Maestro Pedido View Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheContenedorMaestroPedidoViewModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleCompraViewModel_theContenedorMaestroPedidoViewModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleCompraViewModel_theContenedorMaestroPedidoViewModel_feature", "_UI_ContenedorDetalleCompraViewModel_type"),
				 ContenedorcrudrealizarcompraPackage.Literals.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ContenedorDetalleCompraViewModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContenedorDetalleCompraViewModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContenedorDetalleCompraViewModel)object).getCodigo();
		return label == null || label.length() == 0 ?
			getString("_UI_ContenedorDetalleCompraViewModel_type") :
			getString("_UI_ContenedorDetalleCompraViewModel_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ContenedorDetalleCompraViewModel.class)) {
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO:
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__ID_CLIENTE:
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO_P:
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__FECHA:
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__TOTAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TiendaCristalEditPlugin.INSTANCE;
	}

}
