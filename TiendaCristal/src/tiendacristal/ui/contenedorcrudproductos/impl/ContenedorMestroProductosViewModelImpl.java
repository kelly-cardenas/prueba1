/**
 */
package tiendacristal.ui.contenedorcrudproductos.impl;

import java.lang.reflect.InvocationTargetException;

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

import tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage;

import tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage;
import tiendacristal.ui.contenedorcrudproductos.ProductosViewModel;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Mestro Productos View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorMestroProductosViewModelImpl#getContenedorCRUDProductosViewModel <em>Contenedor CRUD Productos View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorMestroProductosViewModelImpl#getTheProductosViewModel <em>The Productos View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorMestroProductosViewModelImpl#getTheProductoViewModelSeleccionado <em>The Producto View Model Seleccionado</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorMestroProductosViewModelImpl#getContenedorDetalleCompraViewModel <em>Contenedor Detalle Compra View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorMestroProductosViewModelImpl#getContenedorDetallePedidoViewModel <em>Contenedor Detalle Pedido View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorMestroProductosViewModelImpl extends MinimalEObjectImpl.Container implements ContenedorMestroProductosViewModel {
	/**
	 * The cached value of the '{@link #getTheProductosViewModel() <em>The Productos View Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheProductosViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductosViewModel> theProductosViewModel;

	/**
	 * The cached value of the '{@link #getTheProductoViewModelSeleccionado() <em>The Producto View Model Seleccionado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheProductoViewModelSeleccionado()
	 * @generated
	 * @ordered
	 */
	protected ProductosViewModel theProductoViewModelSeleccionado;

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
	 * The cached value of the '{@link #getContenedorDetallePedidoViewModel() <em>Contenedor Detalle Pedido View Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenedorDetallePedidoViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ContenedorDetallePedidoViewModel> contenedorDetallePedidoViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorMestroProductosViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudproductosPackage.Literals.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDProductosViewModel getContenedorCRUDProductosViewModel() {
		if (eContainerFeatureID() != ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL) return null;
		return (ContenedorCRUDProductosViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenedorCRUDProductosViewModel(ContenedorCRUDProductosViewModel newContenedorCRUDProductosViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenedorCRUDProductosViewModel, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenedorCRUDProductosViewModel(ContenedorCRUDProductosViewModel newContenedorCRUDProductosViewModel) {
		if (newContenedorCRUDProductosViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL && newContenedorCRUDProductosViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newContenedorCRUDProductosViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenedorCRUDProductosViewModel != null)
				msgs = ((InternalEObject)newContenedorCRUDProductosViewModel).eInverseAdd(this, ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL, ContenedorCRUDProductosViewModel.class, msgs);
			msgs = basicSetContenedorCRUDProductosViewModel(newContenedorCRUDProductosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL, newContenedorCRUDProductosViewModel, newContenedorCRUDProductosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductosViewModel> getTheProductosViewModel() {
		if (theProductosViewModel == null) {
			theProductosViewModel = new EObjectContainmentWithInverseEList<ProductosViewModel>(ProductosViewModel.class, this, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTOS_VIEW_MODEL, ContenedorcrudproductosPackage.PRODUCTOS_VIEW_MODEL__OWNED_BY);
		}
		return theProductosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductosViewModel getTheProductoViewModelSeleccionado() {
		if (theProductoViewModelSeleccionado != null && theProductoViewModelSeleccionado.eIsProxy()) {
			InternalEObject oldTheProductoViewModelSeleccionado = (InternalEObject)theProductoViewModelSeleccionado;
			theProductoViewModelSeleccionado = (ProductosViewModel)eResolveProxy(oldTheProductoViewModelSeleccionado);
			if (theProductoViewModelSeleccionado != oldTheProductoViewModelSeleccionado) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTO_VIEW_MODEL_SELECCIONADO, oldTheProductoViewModelSeleccionado, theProductoViewModelSeleccionado));
			}
		}
		return theProductoViewModelSeleccionado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductosViewModel basicGetTheProductoViewModelSeleccionado() {
		return theProductoViewModelSeleccionado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheProductoViewModelSeleccionado(ProductosViewModel newTheProductoViewModelSeleccionado) {
		ProductosViewModel oldTheProductoViewModelSeleccionado = theProductoViewModelSeleccionado;
		theProductoViewModelSeleccionado = newTheProductoViewModelSeleccionado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTO_VIEW_MODEL_SELECCIONADO, oldTheProductoViewModelSeleccionado, theProductoViewModelSeleccionado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContenedorDetalleCompraViewModel> getContenedorDetalleCompraViewModel() {
		if (contenedorDetalleCompraViewModel == null) {
			contenedorDetalleCompraViewModel = new EObjectWithInverseResolvingEList<ContenedorDetalleCompraViewModel>(ContenedorDetalleCompraViewModel.class, this, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL);
		}
		return contenedorDetalleCompraViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContenedorDetallePedidoViewModel> getContenedorDetallePedidoViewModel() {
		if (contenedorDetallePedidoViewModel == null) {
			contenedorDetallePedidoViewModel = new EObjectWithInverseResolvingEList<ContenedorDetallePedidoViewModel>(ContenedorDetallePedidoViewModel.class, this, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL);
		}
		return contenedorDetallePedidoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void crear() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContenedorCRUDProductosViewModel((ContenedorCRUDProductosViewModel)otherEnd, msgs);
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTOS_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTheProductosViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContenedorDetalleCompraViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContenedorDetallePedidoViewModel()).basicAdd(otherEnd, msgs);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				return basicSetContenedorCRUDProductosViewModel(null, msgs);
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTOS_VIEW_MODEL:
				return ((InternalEList<?>)getTheProductosViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return ((InternalEList<?>)getContenedorDetalleCompraViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
				return ((InternalEList<?>)getContenedorDetallePedidoViewModel()).basicRemove(otherEnd, msgs);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL, ContenedorCRUDProductosViewModel.class, msgs);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				return getContenedorCRUDProductosViewModel();
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTOS_VIEW_MODEL:
				return getTheProductosViewModel();
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTO_VIEW_MODEL_SELECCIONADO:
				if (resolve) return getTheProductoViewModelSeleccionado();
				return basicGetTheProductoViewModelSeleccionado();
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return getContenedorDetalleCompraViewModel();
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
				return getContenedorDetallePedidoViewModel();
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
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				setContenedorCRUDProductosViewModel((ContenedorCRUDProductosViewModel)newValue);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTOS_VIEW_MODEL:
				getTheProductosViewModel().clear();
				getTheProductosViewModel().addAll((Collection<? extends ProductosViewModel>)newValue);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTO_VIEW_MODEL_SELECCIONADO:
				setTheProductoViewModelSeleccionado((ProductosViewModel)newValue);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				getContenedorDetalleCompraViewModel().clear();
				getContenedorDetalleCompraViewModel().addAll((Collection<? extends ContenedorDetalleCompraViewModel>)newValue);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
				getContenedorDetallePedidoViewModel().clear();
				getContenedorDetallePedidoViewModel().addAll((Collection<? extends ContenedorDetallePedidoViewModel>)newValue);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				setContenedorCRUDProductosViewModel((ContenedorCRUDProductosViewModel)null);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTOS_VIEW_MODEL:
				getTheProductosViewModel().clear();
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTO_VIEW_MODEL_SELECCIONADO:
				setTheProductoViewModelSeleccionado((ProductosViewModel)null);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				getContenedorDetalleCompraViewModel().clear();
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
				getContenedorDetallePedidoViewModel().clear();
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
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				return getContenedorCRUDProductosViewModel() != null;
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTOS_VIEW_MODEL:
				return theProductosViewModel != null && !theProductosViewModel.isEmpty();
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTO_VIEW_MODEL_SELECCIONADO:
				return theProductoViewModelSeleccionado != null;
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return contenedorDetalleCompraViewModel != null && !contenedorDetalleCompraViewModel.isEmpty();
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
				return contenedorDetallePedidoViewModel != null && !contenedorDetallePedidoViewModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL___CREAR:
				crear();
				return null;
			case ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL___IMPLEMENTAR_MODELO:
				implementarModelo();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContenedorMestroProductosViewModelImpl
