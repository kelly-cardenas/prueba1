/**
 */
package tiendacristal.ui.contenedorcrudpedido.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage;

import tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage;

import tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Detalle Pedido View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorDetallePedidoViewModelImpl#getIdCliente <em>Id Cliente</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorDetallePedidoViewModelImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorDetallePedidoViewModelImpl#getFechaPedido <em>Fecha Pedido</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorDetallePedidoViewModelImpl#getContenedorCRUDPedidoViewModel <em>Contenedor CRUD Pedido View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorDetallePedidoViewModelImpl#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorDetallePedidoViewModelImpl#getTheContenedorMestroProductosViewModel <em>The Contenedor Mestro Productos View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorDetallePedidoViewModelImpl extends MinimalEObjectImpl.Container implements ContenedorDetallePedidoViewModel {
	/**
	 * The default value of the '{@link #getIdCliente() <em>Id Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCliente()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_CLIENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdCliente() <em>Id Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCliente()
	 * @generated
	 * @ordered
	 */
	protected String idCliente = ID_CLIENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected String codigo = CODIGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaPedido() <em>Fecha Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaPedido()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_PEDIDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaPedido() <em>Fecha Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaPedido()
	 * @generated
	 * @ordered
	 */
	protected String fechaPedido = FECHA_PEDIDO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTheContenedorMaestroClienteViewModel() <em>The Contenedor Maestro Cliente View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorMaestroClienteViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorMaestroClienteViewModel theContenedorMaestroClienteViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorMestroProductosViewModel() <em>The Contenedor Mestro Productos View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorMestroProductosViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorMestroProductosViewModel theContenedorMestroProductosViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorDetallePedidoViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudpedidoPackage.Literals.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdCliente() {
		return idCliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdCliente(String newIdCliente) {
		String oldIdCliente = idCliente;
		idCliente = newIdCliente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__ID_CLIENTE, oldIdCliente, idCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(String newCodigo) {
		String oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaPedido() {
		return fechaPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaPedido(String newFechaPedido) {
		String oldFechaPedido = fechaPedido;
		fechaPedido = newFechaPedido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__FECHA_PEDIDO, oldFechaPedido, fechaPedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDPedidoViewModel getContenedorCRUDPedidoViewModel() {
		if (eContainerFeatureID() != ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL) return null;
		return (ContenedorCRUDPedidoViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenedorCRUDPedidoViewModel(ContenedorCRUDPedidoViewModel newContenedorCRUDPedidoViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenedorCRUDPedidoViewModel, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenedorCRUDPedidoViewModel(ContenedorCRUDPedidoViewModel newContenedorCRUDPedidoViewModel) {
		if (newContenedorCRUDPedidoViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL && newContenedorCRUDPedidoViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newContenedorCRUDPedidoViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenedorCRUDPedidoViewModel != null)
				msgs = ((InternalEObject)newContenedorCRUDPedidoViewModel).eInverseAdd(this, ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL, ContenedorCRUDPedidoViewModel.class, msgs);
			msgs = basicSetContenedorCRUDPedidoViewModel(newContenedorCRUDPedidoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL, newContenedorCRUDPedidoViewModel, newContenedorCRUDPedidoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroClienteViewModel getTheContenedorMaestroClienteViewModel() {
		if (theContenedorMaestroClienteViewModel != null && theContenedorMaestroClienteViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorMaestroClienteViewModel = (InternalEObject)theContenedorMaestroClienteViewModel;
			theContenedorMaestroClienteViewModel = (ContenedorMaestroClienteViewModel)eResolveProxy(oldTheContenedorMaestroClienteViewModel);
			if (theContenedorMaestroClienteViewModel != oldTheContenedorMaestroClienteViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, oldTheContenedorMaestroClienteViewModel, theContenedorMaestroClienteViewModel));
			}
		}
		return theContenedorMaestroClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroClienteViewModel basicGetTheContenedorMaestroClienteViewModel() {
		return theContenedorMaestroClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel newTheContenedorMaestroClienteViewModel, NotificationChain msgs) {
		ContenedorMaestroClienteViewModel oldTheContenedorMaestroClienteViewModel = theContenedorMaestroClienteViewModel;
		theContenedorMaestroClienteViewModel = newTheContenedorMaestroClienteViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, oldTheContenedorMaestroClienteViewModel, newTheContenedorMaestroClienteViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel newTheContenedorMaestroClienteViewModel) {
		if (newTheContenedorMaestroClienteViewModel != theContenedorMaestroClienteViewModel) {
			NotificationChain msgs = null;
			if (theContenedorMaestroClienteViewModel != null)
				msgs = ((InternalEObject)theContenedorMaestroClienteViewModel).eInverseRemove(this, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
			if (newTheContenedorMaestroClienteViewModel != null)
				msgs = ((InternalEObject)newTheContenedorMaestroClienteViewModel).eInverseAdd(this, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
			msgs = basicSetTheContenedorMaestroClienteViewModel(newTheContenedorMaestroClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, newTheContenedorMaestroClienteViewModel, newTheContenedorMaestroClienteViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMestroProductosViewModel getTheContenedorMestroProductosViewModel() {
		if (theContenedorMestroProductosViewModel != null && theContenedorMestroProductosViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorMestroProductosViewModel = (InternalEObject)theContenedorMestroProductosViewModel;
			theContenedorMestroProductosViewModel = (ContenedorMestroProductosViewModel)eResolveProxy(oldTheContenedorMestroProductosViewModel);
			if (theContenedorMestroProductosViewModel != oldTheContenedorMestroProductosViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL, oldTheContenedorMestroProductosViewModel, theContenedorMestroProductosViewModel));
			}
		}
		return theContenedorMestroProductosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMestroProductosViewModel basicGetTheContenedorMestroProductosViewModel() {
		return theContenedorMestroProductosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorMestroProductosViewModel(ContenedorMestroProductosViewModel newTheContenedorMestroProductosViewModel, NotificationChain msgs) {
		ContenedorMestroProductosViewModel oldTheContenedorMestroProductosViewModel = theContenedorMestroProductosViewModel;
		theContenedorMestroProductosViewModel = newTheContenedorMestroProductosViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL, oldTheContenedorMestroProductosViewModel, newTheContenedorMestroProductosViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorMestroProductosViewModel(ContenedorMestroProductosViewModel newTheContenedorMestroProductosViewModel) {
		if (newTheContenedorMestroProductosViewModel != theContenedorMestroProductosViewModel) {
			NotificationChain msgs = null;
			if (theContenedorMestroProductosViewModel != null)
				msgs = ((InternalEObject)theContenedorMestroProductosViewModel).eInverseRemove(this, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL, ContenedorMestroProductosViewModel.class, msgs);
			if (newTheContenedorMestroProductosViewModel != null)
				msgs = ((InternalEObject)newTheContenedorMestroProductosViewModel).eInverseAdd(this, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL, ContenedorMestroProductosViewModel.class, msgs);
			msgs = basicSetTheContenedorMestroProductosViewModel(newTheContenedorMestroProductosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL, newTheContenedorMestroProductosViewModel, newTheContenedorMestroProductosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContenedorCRUDPedidoViewModel((ContenedorCRUDPedidoViewModel)otherEnd, msgs);
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				if (theContenedorMaestroClienteViewModel != null)
					msgs = ((InternalEObject)theContenedorMaestroClienteViewModel).eInverseRemove(this, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
				return basicSetTheContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)otherEnd, msgs);
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				if (theContenedorMestroProductosViewModel != null)
					msgs = ((InternalEObject)theContenedorMestroProductosViewModel).eInverseRemove(this, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL, ContenedorMestroProductosViewModel.class, msgs);
				return basicSetTheContenedorMestroProductosViewModel((ContenedorMestroProductosViewModel)otherEnd, msgs);
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
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				return basicSetContenedorCRUDPedidoViewModel(null, msgs);
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return basicSetTheContenedorMaestroClienteViewModel(null, msgs);
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				return basicSetTheContenedorMestroProductosViewModel(null, msgs);
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
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL, ContenedorCRUDPedidoViewModel.class, msgs);
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
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__ID_CLIENTE:
				return getIdCliente();
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CODIGO:
				return getCodigo();
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__FECHA_PEDIDO:
				return getFechaPedido();
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				return getContenedorCRUDPedidoViewModel();
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				if (resolve) return getTheContenedorMaestroClienteViewModel();
				return basicGetTheContenedorMaestroClienteViewModel();
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				if (resolve) return getTheContenedorMestroProductosViewModel();
				return basicGetTheContenedorMestroProductosViewModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__ID_CLIENTE:
				setIdCliente((String)newValue);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CODIGO:
				setCodigo((String)newValue);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__FECHA_PEDIDO:
				setFechaPedido((String)newValue);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				setContenedorCRUDPedidoViewModel((ContenedorCRUDPedidoViewModel)newValue);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				setTheContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)newValue);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				setTheContenedorMestroProductosViewModel((ContenedorMestroProductosViewModel)newValue);
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
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__ID_CLIENTE:
				setIdCliente(ID_CLIENTE_EDEFAULT);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__FECHA_PEDIDO:
				setFechaPedido(FECHA_PEDIDO_EDEFAULT);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				setContenedorCRUDPedidoViewModel((ContenedorCRUDPedidoViewModel)null);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				setTheContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)null);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				setTheContenedorMestroProductosViewModel((ContenedorMestroProductosViewModel)null);
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
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__ID_CLIENTE:
				return ID_CLIENTE_EDEFAULT == null ? idCliente != null : !ID_CLIENTE_EDEFAULT.equals(idCliente);
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__FECHA_PEDIDO:
				return FECHA_PEDIDO_EDEFAULT == null ? fechaPedido != null : !FECHA_PEDIDO_EDEFAULT.equals(fechaPedido);
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
				return getContenedorCRUDPedidoViewModel() != null;
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return theContenedorMaestroClienteViewModel != null;
			case ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				return theContenedorMestroProductosViewModel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (idCliente: ");
		result.append(idCliente);
		result.append(", codigo: ");
		result.append(codigo);
		result.append(", fechaPedido: ");
		result.append(fechaPedido);
		result.append(')');
		return result.toString();
	}

} //ContenedorDetallePedidoViewModelImpl
