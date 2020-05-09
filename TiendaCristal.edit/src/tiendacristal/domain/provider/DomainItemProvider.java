/**
 */
package tiendacristal.domain.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tiendacristal.domain.Domain;
import tiendacristal.domain.DomainFactory;
import tiendacristal.domain.DomainPackage;

import tiendacristal.provider.TiendaCristalEditPlugin;

/**
 * This is the item provider adapter for a {@link tiendacristal.domain.Domain} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainItemProvider 
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
	public DomainItemProvider(AdapterFactory adapterFactory) {
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

			addTheUIAsociadoPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the The UI Asociado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheUIAsociadoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Domain_theUIAsociado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Domain_theUIAsociado_feature", "_UI_Domain_type"),
				 DomainPackage.Literals.DOMAIN__THE_UI_ASOCIADO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__LISTA_PEDIDOS);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__LISTA_COMPRAS);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__THE_ADMINISTRADOR);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__LISTA_CLIENTES);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__LISTA_PRODUCTOS);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__LISTA_FACTURAS);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__THE_TIENDA_CRISTAL);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__THE_VENDEDOR);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__THE_INVENTARIO);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Domain.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Domain"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Domain_type");
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

		switch (notification.getFeatureID(Domain.class)) {
			case DomainPackage.DOMAIN__LISTA_PEDIDOS:
			case DomainPackage.DOMAIN__LISTA_COMPRAS:
			case DomainPackage.DOMAIN__THE_ADMINISTRADOR:
			case DomainPackage.DOMAIN__LISTA_CLIENTES:
			case DomainPackage.DOMAIN__LISTA_PRODUCTOS:
			case DomainPackage.DOMAIN__LISTA_FACTURAS:
			case DomainPackage.DOMAIN__THE_TIENDA_CRISTAL:
			case DomainPackage.DOMAIN__THE_VENDEDOR:
			case DomainPackage.DOMAIN__THE_INVENTARIO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__LISTA_PEDIDOS,
				 DomainFactory.eINSTANCE.createPedido()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__LISTA_COMPRAS,
				 DomainFactory.eINSTANCE.createCompra()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__THE_ADMINISTRADOR,
				 DomainFactory.eINSTANCE.createAdministrador()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__LISTA_CLIENTES,
				 DomainFactory.eINSTANCE.createCliente()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__LISTA_PRODUCTOS,
				 DomainFactory.eINSTANCE.createProducto()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__LISTA_FACTURAS,
				 DomainFactory.eINSTANCE.createReciboPago()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__THE_TIENDA_CRISTAL,
				 DomainFactory.eINSTANCE.createDistribuidoraCristal()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__THE_VENDEDOR,
				 DomainFactory.eINSTANCE.createVendedor()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__THE_INVENTARIO,
				 DomainFactory.eINSTANCE.createInventario()));
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
