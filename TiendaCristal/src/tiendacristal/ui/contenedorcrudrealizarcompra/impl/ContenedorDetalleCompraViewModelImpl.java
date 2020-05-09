/**
 */
package tiendacristal.ui.contenedorcrudrealizarcompra.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage;

import tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage;

import tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Detalle Compra View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorDetalleCompraViewModelImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorDetalleCompraViewModelImpl#getIdCliente <em>Id Cliente</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorDetalleCompraViewModelImpl#getCodigoP <em>Codigo P</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorDetalleCompraViewModelImpl#getFecha <em>Fecha</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorDetalleCompraViewModelImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorDetalleCompraViewModelImpl#getContenedorCRUDCompraViewModel <em>Contenedor CRUD Compra View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorDetalleCompraViewModelImpl#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorDetalleCompraViewModelImpl#getTheContenedorMestroProductosViewModel <em>The Contenedor Mestro Productos View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorDetalleCompraViewModelImpl#getTheContenedorMaestroPedidoViewModel <em>The Contenedor Maestro Pedido View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorDetalleCompraViewModelImpl extends MinimalEObjectImpl.Container implements ContenedorDetalleCompraViewModel {
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
	 * The default value of the '{@link #getCodigoP() <em>Codigo P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoP()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigoP() <em>Codigo P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoP()
	 * @generated
	 * @ordered
	 */
	protected String codigoP = CODIGO_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected String fecha = FECHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected int total = TOTAL_EDEFAULT;

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
	 * The cached value of the '{@link #getTheContenedorMaestroPedidoViewModel() <em>The Contenedor Maestro Pedido View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorMaestroPedidoViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorMaestroPedidoViewModel theContenedorMaestroPedidoViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorDetalleCompraViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudrealizarcompraPackage.Literals.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO, oldCodigo, codigo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__ID_CLIENTE, oldIdCliente, idCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigoP() {
		return codigoP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoP(String newCodigoP) {
		String oldCodigoP = codigoP;
		codigoP = newCodigoP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO_P, oldCodigoP, codigoP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFecha(String newFecha) {
		String oldFecha = fecha;
		fecha = newFecha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__FECHA, oldFecha, fecha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(int newTotal) {
		int oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDCompraViewModel getContenedorCRUDCompraViewModel() {
		if (eContainerFeatureID() != ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL) return null;
		return (ContenedorCRUDCompraViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenedorCRUDCompraViewModel(ContenedorCRUDCompraViewModel newContenedorCRUDCompraViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenedorCRUDCompraViewModel, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenedorCRUDCompraViewModel(ContenedorCRUDCompraViewModel newContenedorCRUDCompraViewModel) {
		if (newContenedorCRUDCompraViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL && newContenedorCRUDCompraViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newContenedorCRUDCompraViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenedorCRUDCompraViewModel != null)
				msgs = ((InternalEObject)newContenedorCRUDCompraViewModel).eInverseAdd(this, ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorCRUDCompraViewModel.class, msgs);
			msgs = basicSetContenedorCRUDCompraViewModel(newContenedorCRUDCompraViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL, newContenedorCRUDCompraViewModel, newContenedorCRUDCompraViewModel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, oldTheContenedorMaestroClienteViewModel, theContenedorMaestroClienteViewModel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, oldTheContenedorMaestroClienteViewModel, newTheContenedorMaestroClienteViewModel);
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
				msgs = ((InternalEObject)theContenedorMaestroClienteViewModel).eInverseRemove(this, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
			if (newTheContenedorMaestroClienteViewModel != null)
				msgs = ((InternalEObject)newTheContenedorMaestroClienteViewModel).eInverseAdd(this, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
			msgs = basicSetTheContenedorMaestroClienteViewModel(newTheContenedorMaestroClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, newTheContenedorMaestroClienteViewModel, newTheContenedorMaestroClienteViewModel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL, oldTheContenedorMestroProductosViewModel, theContenedorMestroProductosViewModel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL, oldTheContenedorMestroProductosViewModel, newTheContenedorMestroProductosViewModel);
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
				msgs = ((InternalEObject)theContenedorMestroProductosViewModel).eInverseRemove(this, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorMestroProductosViewModel.class, msgs);
			if (newTheContenedorMestroProductosViewModel != null)
				msgs = ((InternalEObject)newTheContenedorMestroProductosViewModel).eInverseAdd(this, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorMestroProductosViewModel.class, msgs);
			msgs = basicSetTheContenedorMestroProductosViewModel(newTheContenedorMestroProductosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL, newTheContenedorMestroProductosViewModel, newTheContenedorMestroProductosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroPedidoViewModel getTheContenedorMaestroPedidoViewModel() {
		if (theContenedorMaestroPedidoViewModel != null && theContenedorMaestroPedidoViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorMaestroPedidoViewModel = (InternalEObject)theContenedorMaestroPedidoViewModel;
			theContenedorMaestroPedidoViewModel = (ContenedorMaestroPedidoViewModel)eResolveProxy(oldTheContenedorMaestroPedidoViewModel);
			if (theContenedorMaestroPedidoViewModel != oldTheContenedorMaestroPedidoViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL, oldTheContenedorMaestroPedidoViewModel, theContenedorMaestroPedidoViewModel));
			}
		}
		return theContenedorMaestroPedidoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroPedidoViewModel basicGetTheContenedorMaestroPedidoViewModel() {
		return theContenedorMaestroPedidoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorMaestroPedidoViewModel(ContenedorMaestroPedidoViewModel newTheContenedorMaestroPedidoViewModel, NotificationChain msgs) {
		ContenedorMaestroPedidoViewModel oldTheContenedorMaestroPedidoViewModel = theContenedorMaestroPedidoViewModel;
		theContenedorMaestroPedidoViewModel = newTheContenedorMaestroPedidoViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL, oldTheContenedorMaestroPedidoViewModel, newTheContenedorMaestroPedidoViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorMaestroPedidoViewModel(ContenedorMaestroPedidoViewModel newTheContenedorMaestroPedidoViewModel) {
		if (newTheContenedorMaestroPedidoViewModel != theContenedorMaestroPedidoViewModel) {
			NotificationChain msgs = null;
			if (theContenedorMaestroPedidoViewModel != null)
				msgs = ((InternalEObject)theContenedorMaestroPedidoViewModel).eInverseRemove(this, ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorMaestroPedidoViewModel.class, msgs);
			if (newTheContenedorMaestroPedidoViewModel != null)
				msgs = ((InternalEObject)newTheContenedorMaestroPedidoViewModel).eInverseAdd(this, ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorMaestroPedidoViewModel.class, msgs);
			msgs = basicSetTheContenedorMaestroPedidoViewModel(newTheContenedorMaestroPedidoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL, newTheContenedorMaestroPedidoViewModel, newTheContenedorMaestroPedidoViewModel));
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
	public void create() {
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContenedorCRUDCompraViewModel((ContenedorCRUDCompraViewModel)otherEnd, msgs);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				if (theContenedorMaestroClienteViewModel != null)
					msgs = ((InternalEObject)theContenedorMaestroClienteViewModel).eInverseRemove(this, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
				return basicSetTheContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)otherEnd, msgs);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				if (theContenedorMestroProductosViewModel != null)
					msgs = ((InternalEObject)theContenedorMestroProductosViewModel).eInverseRemove(this, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorMestroProductosViewModel.class, msgs);
				return basicSetTheContenedorMestroProductosViewModel((ContenedorMestroProductosViewModel)otherEnd, msgs);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				if (theContenedorMaestroPedidoViewModel != null)
					msgs = ((InternalEObject)theContenedorMaestroPedidoViewModel).eInverseRemove(this, ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorMaestroPedidoViewModel.class, msgs);
				return basicSetTheContenedorMaestroPedidoViewModel((ContenedorMaestroPedidoViewModel)otherEnd, msgs);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				return basicSetContenedorCRUDCompraViewModel(null, msgs);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return basicSetTheContenedorMaestroClienteViewModel(null, msgs);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				return basicSetTheContenedorMestroProductosViewModel(null, msgs);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				return basicSetTheContenedorMaestroPedidoViewModel(null, msgs);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, ContenedorCRUDCompraViewModel.class, msgs);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO:
				return getCodigo();
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__ID_CLIENTE:
				return getIdCliente();
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO_P:
				return getCodigoP();
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__FECHA:
				return getFecha();
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__TOTAL:
				return getTotal();
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				return getContenedorCRUDCompraViewModel();
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				if (resolve) return getTheContenedorMaestroClienteViewModel();
				return basicGetTheContenedorMaestroClienteViewModel();
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				if (resolve) return getTheContenedorMestroProductosViewModel();
				return basicGetTheContenedorMestroProductosViewModel();
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				if (resolve) return getTheContenedorMaestroPedidoViewModel();
				return basicGetTheContenedorMaestroPedidoViewModel();
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO:
				setCodigo((String)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__ID_CLIENTE:
				setIdCliente((String)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO_P:
				setCodigoP((String)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__FECHA:
				setFecha((String)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__TOTAL:
				setTotal((Integer)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				setContenedorCRUDCompraViewModel((ContenedorCRUDCompraViewModel)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				setTheContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				setTheContenedorMestroProductosViewModel((ContenedorMestroProductosViewModel)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				setTheContenedorMaestroPedidoViewModel((ContenedorMaestroPedidoViewModel)newValue);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__ID_CLIENTE:
				setIdCliente(ID_CLIENTE_EDEFAULT);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO_P:
				setCodigoP(CODIGO_P_EDEFAULT);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__FECHA:
				setFecha(FECHA_EDEFAULT);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__TOTAL:
				setTotal(TOTAL_EDEFAULT);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				setContenedorCRUDCompraViewModel((ContenedorCRUDCompraViewModel)null);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				setTheContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)null);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				setTheContenedorMestroProductosViewModel((ContenedorMestroProductosViewModel)null);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				setTheContenedorMaestroPedidoViewModel((ContenedorMaestroPedidoViewModel)null);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__ID_CLIENTE:
				return ID_CLIENTE_EDEFAULT == null ? idCliente != null : !ID_CLIENTE_EDEFAULT.equals(idCliente);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CODIGO_P:
				return CODIGO_P_EDEFAULT == null ? codigoP != null : !CODIGO_P_EDEFAULT.equals(codigoP);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__FECHA:
				return FECHA_EDEFAULT == null ? fecha != null : !FECHA_EDEFAULT.equals(fecha);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__TOTAL:
				return total != TOTAL_EDEFAULT;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				return getContenedorCRUDCompraViewModel() != null;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return theContenedorMaestroClienteViewModel != null;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				return theContenedorMestroProductosViewModel != null;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				return theContenedorMaestroPedidoViewModel != null;
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL___CREAR:
				crear();
				return null;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL___CREATE:
				create();
				return null;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL___IMPLEMENTAR_MODELO:
				implementarModelo();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (codigo: ");
		result.append(codigo);
		result.append(", idCliente: ");
		result.append(idCliente);
		result.append(", codigoP: ");
		result.append(codigoP);
		result.append(", fecha: ");
		result.append(fecha);
		result.append(", total: ");
		result.append(total);
		result.append(')');
		return result.toString();
	}

} //ContenedorDetalleCompraViewModelImpl
