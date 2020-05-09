/**
 */
package tiendacristal.ui.contenedorcrudclientes.impl;

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

import tiendacristal.ui.contenedorcrudclientes.ClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage;

import tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Maestro Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorMaestroClienteViewModelImpl#getOwnedBy <em>Owned By</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorMaestroClienteViewModelImpl#getTheClienteViewModel <em>The Cliente View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorMaestroClienteViewModelImpl#getTheClienteViewModelSeleccionada <em>The Cliente View Model Seleccionada</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorMaestroClienteViewModelImpl#getContenedorDetalleCompraViewModel <em>Contenedor Detalle Compra View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorMaestroClienteViewModelImpl#getContenedorDetallePedidoViewModel <em>Contenedor Detalle Pedido View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorMaestroClienteViewModelImpl extends MinimalEObjectImpl.Container implements ContenedorMaestroClienteViewModel {
	/**
	 * The cached value of the '{@link #getTheClienteViewModel() <em>The Cliente View Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheClienteViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ClienteViewModel> theClienteViewModel;

	/**
	 * The cached value of the '{@link #getTheClienteViewModelSeleccionada() <em>The Cliente View Model Seleccionada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheClienteViewModelSeleccionada()
	 * @generated
	 * @ordered
	 */
	protected ClienteViewModel theClienteViewModelSeleccionada;

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
	protected ContenedorMaestroClienteViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudclientesPackage.Literals.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDClienteViewModel getOwnedBy() {
		if (eContainerFeatureID() != ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY) return null;
		return (ContenedorCRUDClienteViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedBy(ContenedorCRUDClienteViewModel newOwnedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedBy, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedBy(ContenedorCRUDClienteViewModel newOwnedBy) {
		if (newOwnedBy != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY && newOwnedBy != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedBy != null)
				msgs = ((InternalEObject)newOwnedBy).eInverseAdd(this, ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, ContenedorCRUDClienteViewModel.class, msgs);
			msgs = basicSetOwnedBy(newOwnedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY, newOwnedBy, newOwnedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClienteViewModel> getTheClienteViewModel() {
		if (theClienteViewModel == null) {
			theClienteViewModel = new EObjectContainmentWithInverseEList<ClienteViewModel>(ClienteViewModel.class, this, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL, ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__OWNED_BY);
		}
		return theClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteViewModel getTheClienteViewModelSeleccionada() {
		if (theClienteViewModelSeleccionada != null && theClienteViewModelSeleccionada.eIsProxy()) {
			InternalEObject oldTheClienteViewModelSeleccionada = (InternalEObject)theClienteViewModelSeleccionada;
			theClienteViewModelSeleccionada = (ClienteViewModel)eResolveProxy(oldTheClienteViewModelSeleccionada);
			if (theClienteViewModelSeleccionada != oldTheClienteViewModelSeleccionada) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL_SELECCIONADA, oldTheClienteViewModelSeleccionada, theClienteViewModelSeleccionada));
			}
		}
		return theClienteViewModelSeleccionada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteViewModel basicGetTheClienteViewModelSeleccionada() {
		return theClienteViewModelSeleccionada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheClienteViewModelSeleccionada(ClienteViewModel newTheClienteViewModelSeleccionada) {
		ClienteViewModel oldTheClienteViewModelSeleccionada = theClienteViewModelSeleccionada;
		theClienteViewModelSeleccionada = newTheClienteViewModelSeleccionada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL_SELECCIONADA, oldTheClienteViewModelSeleccionada, theClienteViewModelSeleccionada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContenedorDetalleCompraViewModel> getContenedorDetalleCompraViewModel() {
		if (contenedorDetalleCompraViewModel == null) {
			contenedorDetalleCompraViewModel = new EObjectWithInverseResolvingEList<ContenedorDetalleCompraViewModel>(ContenedorDetalleCompraViewModel.class, this, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL);
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
			contenedorDetallePedidoViewModel = new EObjectWithInverseResolvingEList<ContenedorDetallePedidoViewModel>(ContenedorDetallePedidoViewModel.class, this, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL);
		}
		return contenedorDetallePedidoViewModel;
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
	public void update() {
							
					getOwnedBy().getUI().updateContenedorListadoClientes(this);
						
		
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
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedBy((ContenedorCRUDClienteViewModel)otherEnd, msgs);
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTheClienteViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContenedorDetalleCompraViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
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
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY:
				return basicSetOwnedBy(null, msgs);
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL:
				return ((InternalEList<?>)getTheClienteViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return ((InternalEList<?>)getContenedorDetalleCompraViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
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
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, ContenedorCRUDClienteViewModel.class, msgs);
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
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY:
				return getOwnedBy();
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL:
				return getTheClienteViewModel();
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL_SELECCIONADA:
				if (resolve) return getTheClienteViewModelSeleccionada();
				return basicGetTheClienteViewModelSeleccionada();
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return getContenedorDetalleCompraViewModel();
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
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
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY:
				setOwnedBy((ContenedorCRUDClienteViewModel)newValue);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL:
				getTheClienteViewModel().clear();
				getTheClienteViewModel().addAll((Collection<? extends ClienteViewModel>)newValue);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL_SELECCIONADA:
				setTheClienteViewModelSeleccionada((ClienteViewModel)newValue);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				getContenedorDetalleCompraViewModel().clear();
				getContenedorDetalleCompraViewModel().addAll((Collection<? extends ContenedorDetalleCompraViewModel>)newValue);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
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
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY:
				setOwnedBy((ContenedorCRUDClienteViewModel)null);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL:
				getTheClienteViewModel().clear();
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL_SELECCIONADA:
				setTheClienteViewModelSeleccionada((ClienteViewModel)null);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				getContenedorDetalleCompraViewModel().clear();
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
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
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY:
				return getOwnedBy() != null;
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL:
				return theClienteViewModel != null && !theClienteViewModel.isEmpty();
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL_SELECCIONADA:
				return theClienteViewModelSeleccionada != null;
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return contenedorDetalleCompraViewModel != null && !contenedorDetalleCompraViewModel.isEmpty();
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
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
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL___IMPLEMENTAR_MODELO:
				implementarModelo();
				return null;
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL___CREAR:
				crear();
				return null;
			case ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL___UPDATE:
				update();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContenedorMaestroClienteViewModelImpl
