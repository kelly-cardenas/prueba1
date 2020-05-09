/**
 */
package tiendacristal.ui.provider;


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

import tiendacristal.provider.TiendaCristalEditPlugin;

import tiendacristal.ui.UI;
import tiendacristal.ui.UiPackage;

import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesFactory;

import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoFactory;

import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosFactory;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraFactory;

/**
 * This is the item provider adapter for a {@link tiendacristal.ui.UI} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UIItemProvider 
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
	public UIItemProvider(AdapterFactory adapterFactory) {
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

			addTheDomainAsociadoPropertyDescriptor(object);
			addTheContenedorPedidoViewPartPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the The Domain Asociado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheDomainAsociadoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UI_theDomainAsociado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UI_theDomainAsociado_feature", "_UI_UI_type"),
				 UiPackage.Literals.UI__THE_DOMAIN_ASOCIADO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the The Contenedor Pedido View Part feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheContenedorPedidoViewPartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UI_theContenedorPedidoViewPart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UI_theContenedorPedidoViewPart_feature", "_UI_UI_type"),
				 UiPackage.Literals.UI__THE_CONTENEDOR_PEDIDO_VIEW_PART,
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
			childrenFeatures.add(UiPackage.Literals.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL);
			childrenFeatures.add(UiPackage.Literals.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL);
			childrenFeatures.add(UiPackage.Literals.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL);
			childrenFeatures.add(UiPackage.Literals.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL);
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
	 * This returns UI.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UI"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_UI_type");
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

		switch (notification.getFeatureID(UI.class)) {
			case UiPackage.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
			case UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
			case UiPackage.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL:
			case UiPackage.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
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
				(UiPackage.Literals.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL,
				 ContenedorcrudproductosFactory.eINSTANCE.createContenedorCRUDProductosViewModel()));

		newChildDescriptors.add
			(createChildParameter
				(UiPackage.Literals.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL,
				 ContenedorcrudclientesFactory.eINSTANCE.createContenedorCRUDClienteViewModel()));

		newChildDescriptors.add
			(createChildParameter
				(UiPackage.Literals.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL,
				 ContenedorcrudrealizarcompraFactory.eINSTANCE.createContenedorCRUDCompraViewModel()));

		newChildDescriptors.add
			(createChildParameter
				(UiPackage.Literals.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL,
				 ContenedorcrudpedidoFactory.eINSTANCE.createContenedorCRUDPedidoViewModel()));
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
