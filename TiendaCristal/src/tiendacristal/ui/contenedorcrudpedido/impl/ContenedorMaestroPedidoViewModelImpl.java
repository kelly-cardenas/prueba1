/**
 */
package tiendacristal.ui.contenedorcrudpedido.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage;
import tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Maestro Pedido View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorMaestroPedidoViewModelImpl#getContenedorDetalleCompraViewModel <em>Contenedor Detalle Compra View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorMaestroPedidoViewModelImpl#getContenedorCRUDPedidoViewModel <em>Contenedor CRUD Pedido View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorMaestroPedidoViewModelImpl#getListaProductoComprarViewModel <em>Lista Producto Comprar View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorMaestroPedidoViewModelImpl extends MinimalEObjectImpl.Container implements ContenedorMaestroPedidoViewModel {
	/**
	 * The cached value of the '{@link #getContenedorDetalleCompraViewModel() <em>Contenedor Detalle Compra View Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenedorDetalleCompraViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ContenedorDetalleCompraViewModel> contenedorDetalleCompraViewModel;

	/**
	 * The cached value of the '{@link #getListaProductoComprarViewModel() <em>Lista Producto Comprar View Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaProductoComprarViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductoComprarViewModel> listaProductoComprarViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorMaestroPedidoViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudpedidoPackage.Literals.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContenedorDetalleCompraViewModel> getContenedorDetalleCompraViewModel() {
		if (contenedorDetalleCompraViewModel == null) {
			contenedorDetalleCompraViewModel = new EObjectWithInverseResolvingEList<ContenedorDetalleCompraViewModel>(ContenedorDetalleCompraViewModel.class, this, ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL);
		}
		return contenedorDetalleCompraViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDPedidoViewModel getContenedorCRUDPedidoViewModel() {
		if (eContainerFeatureID() != ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL) return null;
		return (ContenedorCRUDPedidoViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenedorCRUDPedidoViewModel(ContenedorCRUDPedidoViewModel newContenedorCRUDPedidoViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenedorCRUDPedidoViewModel, ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenedorCRUDPedidoViewModel(ContenedorCRUDPedidoViewModel newContenedorCRUDPedidoViewModel) {
		if (newContenedorCRUDPedidoViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL && newContenedorCRUDPedidoViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newContenedorCRUDPedidoViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenedorCRUDPedidoViewModel != null)
				msgs = ((InternalEObject)newContenedorCRUDPedidoViewModel).eInverseAdd(this, ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL, ContenedorCRUDPedidoViewModel.class, msgs);
			msgs = basicSetContenedorCRUDPedidoViewModel(newContenedorCRUDPedidoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL, newContenedorCRUDPedidoViewModel, newContenedorCRUDPedidoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductoComprarViewModel> getListaProductoComprarViewModel() {
		if (listaProductoComprarViewModel == null) {
			listaProductoComprarViewModel = new EObjectContainmentWithInverseEList<ProductoComprarViewModel>(ProductoComprarViewModel.class, this, ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__LISTA_PRODUCTO_COMPRAR_VIEW_MODEL, ContenedorcrudpedidoPackage.PRODUCTO_COMPRAR_VIEW_MODEL__CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL);
		}
		return listaProductoComprarViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContenedorDetalleCompraViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContenedorCRUDPedidoViewModel((ContenedorCRUDPedidoViewModel)otherEnd, msgs);
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__LISTA_PRODUCTO_COMPRAR_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaProductoComprarViewModel()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return ((InternalEList<?>)getContenedorDetalleCompraViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				return basicSetContenedorCRUDPedidoViewModel(null, msgs);
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__LISTA_PRODUCTO_COMPRAR_VIEW_MODEL:
				return ((InternalEList<?>)getListaProductoComprarViewModel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL, ContenedorCRUDPedidoViewModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return getContenedorDetalleCompraViewModel();
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				return getContenedorCRUDPedidoViewModel();
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__LISTA_PRODUCTO_COMPRAR_VIEW_MODEL:
				return getListaProductoComprarViewModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				getContenedorDetalleCompraViewModel().clear();
				getContenedorDetalleCompraViewModel().addAll((Collection<? extends ContenedorDetalleCompraViewModel>)newValue);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				setContenedorCRUDPedidoViewModel((ContenedorCRUDPedidoViewModel)newValue);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__LISTA_PRODUCTO_COMPRAR_VIEW_MODEL:
				getListaProductoComprarViewModel().clear();
				getListaProductoComprarViewModel().addAll((Collection<? extends ProductoComprarViewModel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				getContenedorDetalleCompraViewModel().clear();
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				setContenedorCRUDPedidoViewModel((ContenedorCRUDPedidoViewModel)null);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__LISTA_PRODUCTO_COMPRAR_VIEW_MODEL:
				getListaProductoComprarViewModel().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return contenedorDetalleCompraViewModel != null && !contenedorDetalleCompraViewModel.isEmpty();
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				return getContenedorCRUDPedidoViewModel() != null;
			case ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__LISTA_PRODUCTO_COMPRAR_VIEW_MODEL:
				return listaProductoComprarViewModel != null && !listaProductoComprarViewModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContenedorMaestroPedidoViewModelImpl
