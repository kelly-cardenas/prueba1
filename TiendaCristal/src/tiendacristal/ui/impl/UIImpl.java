/**
 */
package tiendacristal.ui.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tiendacristal.ModelFactory;
import tiendacristal.TiendacristalPackage;

import tiendacristal.domain.Domain;
import tiendacristal.domain.DomainPackage;

import tiendacristal.ui.UI;
import tiendacristal.ui.UiPackage;

import tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage;

import tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage;
import tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel;

import tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage;

import tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart;
import tiendacristal.ui.contenedorpedidoviewpart.ContenedorpedidoviewpartPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>UI</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link tiendacristal.ui.impl.UIImpl#getOwnedByModelFactory <em>Owned By
 * Model Factory</em>}</li>
 * <li>{@link tiendacristal.ui.impl.UIImpl#getTheDomainAsociado <em>The Domain
 * Asociado</em>}</li>
 * <li>{@link tiendacristal.ui.impl.UIImpl#getTheContenedorCRUDProductosViewModel
 * <em>The Contenedor CRUD Productos View Model</em>}</li>
 * <li>{@link tiendacristal.ui.impl.UIImpl#getTheContenedorCRUDClienteViewModel
 * <em>The Contenedor CRUD Cliente View Model</em>}</li>
 * <li>{@link tiendacristal.ui.impl.UIImpl#getTheContenedorCRUDRealizarCompraViewModel
 * <em>The Contenedor CRUD Realizar Compra View Model</em>}</li>
 * <li>{@link tiendacristal.ui.impl.UIImpl#getTheContenedorCRUDPedidoViewModel
 * <em>The Contenedor CRUD Pedido View Model</em>}</li>
 * <li>{@link tiendacristal.ui.impl.UIImpl#getTheContenedorPedidoViewPart
 * <em>The Contenedor Pedido View Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIImpl extends MinimalEObjectImpl.Container implements UI {
	/**
	 * The cached value of the '{@link #getTheDomainAsociado() <em>The Domain
	 * Asociado</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTheDomainAsociado()
	 * @generated
	 * @ordered
	 */
	protected Domain theDomainAsociado;

	/**
	 * The cached value of the '{@link #getTheContenedorCRUDProductosViewModel()
	 * <em>The Contenedor CRUD Productos View Model</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTheContenedorCRUDProductosViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorCRUDProductosViewModel theContenedorCRUDProductosViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorCRUDClienteViewModel()
	 * <em>The Contenedor CRUD Cliente View Model</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTheContenedorCRUDClienteViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorCRUDClienteViewModel theContenedorCRUDClienteViewModel;

	/**
	 * The cached value of the
	 * '{@link #getTheContenedorCRUDRealizarCompraViewModel() <em>The Contenedor
	 * CRUD Realizar Compra View Model</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTheContenedorCRUDRealizarCompraViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorCRUDCompraViewModel theContenedorCRUDRealizarCompraViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorCRUDPedidoViewModel()
	 * <em>The Contenedor CRUD Pedido View Model</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTheContenedorCRUDPedidoViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorCRUDPedidoViewModel theContenedorCRUDPedidoViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorPedidoViewPart() <em>The
	 * Contenedor Pedido View Part</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTheContenedorPedidoViewPart()
	 * @generated
	 * @ordered
	 */
	protected ContenedorPedidoViewPart theContenedorPedidoViewPart;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModelFactory getOwnedByModelFactory() {
		if (eContainerFeatureID() != UiPackage.UI__OWNED_BY_MODEL_FACTORY)
			return null;
		return (ModelFactory) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetOwnedByModelFactory(ModelFactory newOwnedByModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwnedByModelFactory, UiPackage.UI__OWNED_BY_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOwnedByModelFactory(ModelFactory newOwnedByModelFactory) {
		if (newOwnedByModelFactory != eInternalContainer()
				|| (eContainerFeatureID() != UiPackage.UI__OWNED_BY_MODEL_FACTORY && newOwnedByModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByModelFactory != null)
				msgs = ((InternalEObject) newOwnedByModelFactory).eInverseAdd(this,
						TiendacristalPackage.MODEL_FACTORY__THE_UI, ModelFactory.class, msgs);
			msgs = basicSetOwnedByModelFactory(newOwnedByModelFactory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__OWNED_BY_MODEL_FACTORY,
					newOwnedByModelFactory, newOwnedByModelFactory));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Domain getTheDomainAsociado() {
		if (theDomainAsociado != null && theDomainAsociado.eIsProxy()) {
			InternalEObject oldTheDomainAsociado = (InternalEObject) theDomainAsociado;
			theDomainAsociado = (Domain) eResolveProxy(oldTheDomainAsociado);
			if (theDomainAsociado != oldTheDomainAsociado) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.UI__THE_DOMAIN_ASOCIADO,
							oldTheDomainAsociado, theDomainAsociado));
			}
		}
		return theDomainAsociado;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Domain basicGetTheDomainAsociado() {
		return theDomainAsociado;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTheDomainAsociado(Domain newTheDomainAsociado, NotificationChain msgs) {
		Domain oldTheDomainAsociado = theDomainAsociado;
		theDomainAsociado = newTheDomainAsociado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UiPackage.UI__THE_DOMAIN_ASOCIADO, oldTheDomainAsociado, newTheDomainAsociado);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTheDomainAsociado(Domain newTheDomainAsociado) {
		if (newTheDomainAsociado != theDomainAsociado) {
			NotificationChain msgs = null;
			if (theDomainAsociado != null)
				msgs = ((InternalEObject) theDomainAsociado).eInverseRemove(this, DomainPackage.DOMAIN__THE_UI_ASOCIADO,
						Domain.class, msgs);
			if (newTheDomainAsociado != null)
				msgs = ((InternalEObject) newTheDomainAsociado).eInverseAdd(this, DomainPackage.DOMAIN__THE_UI_ASOCIADO,
						Domain.class, msgs);
			msgs = basicSetTheDomainAsociado(newTheDomainAsociado, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_DOMAIN_ASOCIADO,
					newTheDomainAsociado, newTheDomainAsociado));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ContenedorCRUDProductosViewModel getTheContenedorCRUDProductosViewModel() {
		return theContenedorCRUDProductosViewModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorCRUDProductosViewModel(
			ContenedorCRUDProductosViewModel newTheContenedorCRUDProductosViewModel, NotificationChain msgs) {
		ContenedorCRUDProductosViewModel oldTheContenedorCRUDProductosViewModel = theContenedorCRUDProductosViewModel;
		theContenedorCRUDProductosViewModel = newTheContenedorCRUDProductosViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UiPackage.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL, oldTheContenedorCRUDProductosViewModel,
					newTheContenedorCRUDProductosViewModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTheContenedorCRUDProductosViewModel(
			ContenedorCRUDProductosViewModel newTheContenedorCRUDProductosViewModel) {
		if (newTheContenedorCRUDProductosViewModel != theContenedorCRUDProductosViewModel) {
			NotificationChain msgs = null;
			if (theContenedorCRUDProductosViewModel != null)
				msgs = ((InternalEObject) theContenedorCRUDProductosViewModel).eInverseRemove(this,
						ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI,
						ContenedorCRUDProductosViewModel.class, msgs);
			if (newTheContenedorCRUDProductosViewModel != null)
				msgs = ((InternalEObject) newTheContenedorCRUDProductosViewModel).eInverseAdd(this,
						ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI,
						ContenedorCRUDProductosViewModel.class, msgs);
			msgs = basicSetTheContenedorCRUDProductosViewModel(newTheContenedorCRUDProductosViewModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL, newTheContenedorCRUDProductosViewModel,
					newTheContenedorCRUDProductosViewModel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ContenedorCRUDClienteViewModel getTheContenedorCRUDClienteViewModel() {
		return theContenedorCRUDClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorCRUDClienteViewModel(
			ContenedorCRUDClienteViewModel newTheContenedorCRUDClienteViewModel, NotificationChain msgs) {
		ContenedorCRUDClienteViewModel oldTheContenedorCRUDClienteViewModel = theContenedorCRUDClienteViewModel;
		theContenedorCRUDClienteViewModel = newTheContenedorCRUDClienteViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, oldTheContenedorCRUDClienteViewModel,
					newTheContenedorCRUDClienteViewModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTheContenedorCRUDClienteViewModel(
			ContenedorCRUDClienteViewModel newTheContenedorCRUDClienteViewModel) {
		if (newTheContenedorCRUDClienteViewModel != theContenedorCRUDClienteViewModel) {
			NotificationChain msgs = null;
			if (theContenedorCRUDClienteViewModel != null)
				msgs = ((InternalEObject) theContenedorCRUDClienteViewModel).eInverseRemove(this,
						ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI,
						ContenedorCRUDClienteViewModel.class, msgs);
			if (newTheContenedorCRUDClienteViewModel != null)
				msgs = ((InternalEObject) newTheContenedorCRUDClienteViewModel).eInverseAdd(this,
						ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI,
						ContenedorCRUDClienteViewModel.class, msgs);
			msgs = basicSetTheContenedorCRUDClienteViewModel(newTheContenedorCRUDClienteViewModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL,
					newTheContenedorCRUDClienteViewModel, newTheContenedorCRUDClienteViewModel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ContenedorCRUDCompraViewModel getTheContenedorCRUDRealizarCompraViewModel() {
		return theContenedorCRUDRealizarCompraViewModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorCRUDRealizarCompraViewModel(
			ContenedorCRUDCompraViewModel newTheContenedorCRUDRealizarCompraViewModel, NotificationChain msgs) {
		ContenedorCRUDCompraViewModel oldTheContenedorCRUDRealizarCompraViewModel = theContenedorCRUDRealizarCompraViewModel;
		theContenedorCRUDRealizarCompraViewModel = newTheContenedorCRUDRealizarCompraViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UiPackage.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL,
					oldTheContenedorCRUDRealizarCompraViewModel, newTheContenedorCRUDRealizarCompraViewModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTheContenedorCRUDRealizarCompraViewModel(
			ContenedorCRUDCompraViewModel newTheContenedorCRUDRealizarCompraViewModel) {
		if (newTheContenedorCRUDRealizarCompraViewModel != theContenedorCRUDRealizarCompraViewModel) {
			NotificationChain msgs = null;
			if (theContenedorCRUDRealizarCompraViewModel != null)
				msgs = ((InternalEObject) theContenedorCRUDRealizarCompraViewModel).eInverseRemove(this,
						ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI,
						ContenedorCRUDCompraViewModel.class, msgs);
			if (newTheContenedorCRUDRealizarCompraViewModel != null)
				msgs = ((InternalEObject) newTheContenedorCRUDRealizarCompraViewModel).eInverseAdd(this,
						ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI,
						ContenedorCRUDCompraViewModel.class, msgs);
			msgs = basicSetTheContenedorCRUDRealizarCompraViewModel(newTheContenedorCRUDRealizarCompraViewModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UiPackage.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL,
					newTheContenedorCRUDRealizarCompraViewModel, newTheContenedorCRUDRealizarCompraViewModel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ContenedorCRUDPedidoViewModel getTheContenedorCRUDPedidoViewModel() {
		return theContenedorCRUDPedidoViewModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorCRUDPedidoViewModel(
			ContenedorCRUDPedidoViewModel newTheContenedorCRUDPedidoViewModel, NotificationChain msgs) {
		ContenedorCRUDPedidoViewModel oldTheContenedorCRUDPedidoViewModel = theContenedorCRUDPedidoViewModel;
		theContenedorCRUDPedidoViewModel = newTheContenedorCRUDPedidoViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UiPackage.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL, oldTheContenedorCRUDPedidoViewModel,
					newTheContenedorCRUDPedidoViewModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTheContenedorCRUDPedidoViewModel(ContenedorCRUDPedidoViewModel newTheContenedorCRUDPedidoViewModel) {
		if (newTheContenedorCRUDPedidoViewModel != theContenedorCRUDPedidoViewModel) {
			NotificationChain msgs = null;
			if (theContenedorCRUDPedidoViewModel != null)
				msgs = ((InternalEObject) theContenedorCRUDPedidoViewModel).eInverseRemove(this,
						ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI,
						ContenedorCRUDPedidoViewModel.class, msgs);
			if (newTheContenedorCRUDPedidoViewModel != null)
				msgs = ((InternalEObject) newTheContenedorCRUDPedidoViewModel).eInverseAdd(this,
						ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI,
						ContenedorCRUDPedidoViewModel.class, msgs);
			msgs = basicSetTheContenedorCRUDPedidoViewModel(newTheContenedorCRUDPedidoViewModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL,
					newTheContenedorCRUDPedidoViewModel, newTheContenedorCRUDPedidoViewModel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ContenedorPedidoViewPart getTheContenedorPedidoViewPart() {
		if (theContenedorPedidoViewPart != null && theContenedorPedidoViewPart.eIsProxy()) {
			InternalEObject oldTheContenedorPedidoViewPart = (InternalEObject) theContenedorPedidoViewPart;
			theContenedorPedidoViewPart = (ContenedorPedidoViewPart) eResolveProxy(oldTheContenedorPedidoViewPart);
			if (theContenedorPedidoViewPart != oldTheContenedorPedidoViewPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UiPackage.UI__THE_CONTENEDOR_PEDIDO_VIEW_PART, oldTheContenedorPedidoViewPart,
							theContenedorPedidoViewPart));
			}
		}
		return theContenedorPedidoViewPart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ContenedorPedidoViewPart basicGetTheContenedorPedidoViewPart() {
		return theContenedorPedidoViewPart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorPedidoViewPart(
			ContenedorPedidoViewPart newTheContenedorPedidoViewPart, NotificationChain msgs) {
		ContenedorPedidoViewPart oldTheContenedorPedidoViewPart = theContenedorPedidoViewPart;
		theContenedorPedidoViewPart = newTheContenedorPedidoViewPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UiPackage.UI__THE_CONTENEDOR_PEDIDO_VIEW_PART, oldTheContenedorPedidoViewPart,
					newTheContenedorPedidoViewPart);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTheContenedorPedidoViewPart(ContenedorPedidoViewPart newTheContenedorPedidoViewPart) {
		if (newTheContenedorPedidoViewPart != theContenedorPedidoViewPart) {
			NotificationChain msgs = null;
			if (theContenedorPedidoViewPart != null)
				msgs = ((InternalEObject) theContenedorPedidoViewPart).eInverseRemove(this,
						ContenedorpedidoviewpartPackage.CONTENEDOR_PEDIDO_VIEW_PART__UI, ContenedorPedidoViewPart.class,
						msgs);
			if (newTheContenedorPedidoViewPart != null)
				msgs = ((InternalEObject) newTheContenedorPedidoViewPart).eInverseAdd(this,
						ContenedorpedidoviewpartPackage.CONTENEDOR_PEDIDO_VIEW_PART__UI, ContenedorPedidoViewPart.class,
						msgs);
			msgs = basicSetTheContenedorPedidoViewPart(newTheContenedorPedidoViewPart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CONTENEDOR_PEDIDO_VIEW_PART,
					newTheContenedorPedidoViewPart, newTheContenedorPedidoViewPart));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UI implementarModelo() {

		ContenedorCRUDProductosViewModel contenedorCRUDProductosViewModel = getTheContenedorCRUDProductosViewModel();
		ContenedorCRUDClienteViewModel contenedorCRUDClienteViewModel = getTheContenedorCRUDClienteViewModel();
		ContenedorCRUDCompraViewModel contenedorCRUDRealizarCompraViewModel = getTheContenedorCRUDRealizarCompraViewModel();
		ContenedorCRUDPedidoViewModel contenedorCRUDPedidoViewModel = getTheContenedorCRUDPedidoViewModel();
		ContenedorPedidoViewPart contenedorPedidoViewPart = getTheContenedorPedidoViewPart();

		if (contenedorCRUDClienteViewModel == null) {

			contenedorCRUDClienteViewModel = tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesFactory.eINSTANCE
					.createContenedorCRUDClienteViewModel();

		}

		setTheContenedorCRUDClienteViewModel(contenedorCRUDClienteViewModel);

		contenedorCRUDClienteViewModel.implementarModelo();

		if (contenedorCRUDProductosViewModel == null) {

			contenedorCRUDProductosViewModel = tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosFactory.eINSTANCE
					.createContenedorCRUDProductosViewModel();

		}

		setTheContenedorCRUDProductosViewModel(contenedorCRUDProductosViewModel);

		contenedorCRUDProductosViewModel.implementarModelo();

		if (contenedorCRUDRealizarCompraViewModel == null) {

			contenedorCRUDRealizarCompraViewModel = tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraFactory.eINSTANCE
					.createContenedorCRUDCompraViewModel();

		}

		setTheContenedorCRUDRealizarCompraViewModel(contenedorCRUDRealizarCompraViewModel);

		contenedorCRUDRealizarCompraViewModel.implementarModelo();

		if (contenedorCRUDPedidoViewModel == null) {

			contenedorCRUDPedidoViewModel = tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoFactory.eINSTANCE
					.createContenedorCRUDPedidoViewModel();

		}

		setTheContenedorCRUDPedidoViewModel(contenedorCRUDPedidoViewModel);

		contenedorCRUDPedidoViewModel.implementarModelo();

		if (contenedorPedidoViewPart == null) {

			contenedorPedidoViewPart = tiendacristal.ui.contenedorpedidoviewpart.ContenedorpedidoviewpartFactory.eINSTANCE
					.createContenedorPedidoViewPart();

		}
		
		setTheContenedorPedidoViewPart(contenedorPedidoViewPart);
		
		//contenedorPedidoViewPart.implementarModelo();

		return this;
		
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void crearProducto(final ContenedorCRUDProductosViewModel formulario) {

		getTheDomainAsociado().crearProducto(formulario);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void crearCompra(final ContenedorCRUDCompraViewModel formulario) {

		getTheDomainAsociado().crearCompra(formulario);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void crearPedido(final ContenedorCRUDPedidoViewModel formulario) {

		getTheDomainAsociado().crearPedido(formulario);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void buscarProductoId(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void agregarListaP(ContenedorCRUDProductosViewModel formulario) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProductoComprarViewModel buscarProductoNombre(final String nombre) {

		return getTheDomainAsociado().buscarProductoNombre(nombre);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void crearCliente(final ContenedorCRUDClienteViewModel formulario) {

		getTheDomainAsociado().crearCliente(formulario);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void actualizarCliente(final ContenedorCRUDClienteViewModel formulario) {

		getTheDomainAsociado().actualizarCliente(formulario);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eliminarCliente(ContenedorCRUDClienteViewModel formulario) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void buscarCliente(final ContenedorCRUDClienteViewModel formulario) {

		getTheDomainAsociado().buscarCliente(formulario);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void buscarProducto(ContenedorCRUDProductosViewModel formulario) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eliminarProducto(ContenedorCRUDProductosViewModel formulario) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void actualizarProducto(ContenedorCRUDProductosViewModel formulario) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void updateContenedorListadoClientes(final ContenedorMaestroClienteViewModel formulario) {

		getTheDomainAsociado().updateContenedorListadoClientes(formulario);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UiPackage.UI__OWNED_BY_MODEL_FACTORY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwnedByModelFactory((ModelFactory) otherEnd, msgs);
		case UiPackage.UI__THE_DOMAIN_ASOCIADO:
			if (theDomainAsociado != null)
				msgs = ((InternalEObject) theDomainAsociado).eInverseRemove(this, DomainPackage.DOMAIN__THE_UI_ASOCIADO,
						Domain.class, msgs);
			return basicSetTheDomainAsociado((Domain) otherEnd, msgs);
		case UiPackage.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
			if (theContenedorCRUDProductosViewModel != null)
				msgs = ((InternalEObject) theContenedorCRUDProductosViewModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UiPackage.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL, null, msgs);
			return basicSetTheContenedorCRUDProductosViewModel((ContenedorCRUDProductosViewModel) otherEnd, msgs);
		case UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
			if (theContenedorCRUDClienteViewModel != null)
				msgs = ((InternalEObject) theContenedorCRUDClienteViewModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, null, msgs);
			return basicSetTheContenedorCRUDClienteViewModel((ContenedorCRUDClienteViewModel) otherEnd, msgs);
		case UiPackage.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL:
			if (theContenedorCRUDRealizarCompraViewModel != null)
				msgs = ((InternalEObject) theContenedorCRUDRealizarCompraViewModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UiPackage.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL, null,
						msgs);
			return basicSetTheContenedorCRUDRealizarCompraViewModel((ContenedorCRUDCompraViewModel) otherEnd, msgs);
		case UiPackage.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
			if (theContenedorCRUDPedidoViewModel != null)
				msgs = ((InternalEObject) theContenedorCRUDPedidoViewModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UiPackage.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL, null, msgs);
			return basicSetTheContenedorCRUDPedidoViewModel((ContenedorCRUDPedidoViewModel) otherEnd, msgs);
		case UiPackage.UI__THE_CONTENEDOR_PEDIDO_VIEW_PART:
			if (theContenedorPedidoViewPart != null)
				msgs = ((InternalEObject) theContenedorPedidoViewPart).eInverseRemove(this,
						ContenedorpedidoviewpartPackage.CONTENEDOR_PEDIDO_VIEW_PART__UI, ContenedorPedidoViewPart.class,
						msgs);
			return basicSetTheContenedorPedidoViewPart((ContenedorPedidoViewPart) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UiPackage.UI__OWNED_BY_MODEL_FACTORY:
			return basicSetOwnedByModelFactory(null, msgs);
		case UiPackage.UI__THE_DOMAIN_ASOCIADO:
			return basicSetTheDomainAsociado(null, msgs);
		case UiPackage.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
			return basicSetTheContenedorCRUDProductosViewModel(null, msgs);
		case UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
			return basicSetTheContenedorCRUDClienteViewModel(null, msgs);
		case UiPackage.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL:
			return basicSetTheContenedorCRUDRealizarCompraViewModel(null, msgs);
		case UiPackage.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
			return basicSetTheContenedorCRUDPedidoViewModel(null, msgs);
		case UiPackage.UI__THE_CONTENEDOR_PEDIDO_VIEW_PART:
			return basicSetTheContenedorPedidoViewPart(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case UiPackage.UI__OWNED_BY_MODEL_FACTORY:
			return eInternalContainer().eInverseRemove(this, TiendacristalPackage.MODEL_FACTORY__THE_UI,
					ModelFactory.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UiPackage.UI__OWNED_BY_MODEL_FACTORY:
			return getOwnedByModelFactory();
		case UiPackage.UI__THE_DOMAIN_ASOCIADO:
			if (resolve)
				return getTheDomainAsociado();
			return basicGetTheDomainAsociado();
		case UiPackage.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
			return getTheContenedorCRUDProductosViewModel();
		case UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
			return getTheContenedorCRUDClienteViewModel();
		case UiPackage.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL:
			return getTheContenedorCRUDRealizarCompraViewModel();
		case UiPackage.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
			return getTheContenedorCRUDPedidoViewModel();
		case UiPackage.UI__THE_CONTENEDOR_PEDIDO_VIEW_PART:
			if (resolve)
				return getTheContenedorPedidoViewPart();
			return basicGetTheContenedorPedidoViewPart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UiPackage.UI__OWNED_BY_MODEL_FACTORY:
			setOwnedByModelFactory((ModelFactory) newValue);
			return;
		case UiPackage.UI__THE_DOMAIN_ASOCIADO:
			setTheDomainAsociado((Domain) newValue);
			return;
		case UiPackage.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
			setTheContenedorCRUDProductosViewModel((ContenedorCRUDProductosViewModel) newValue);
			return;
		case UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
			setTheContenedorCRUDClienteViewModel((ContenedorCRUDClienteViewModel) newValue);
			return;
		case UiPackage.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL:
			setTheContenedorCRUDRealizarCompraViewModel((ContenedorCRUDCompraViewModel) newValue);
			return;
		case UiPackage.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
			setTheContenedorCRUDPedidoViewModel((ContenedorCRUDPedidoViewModel) newValue);
			return;
		case UiPackage.UI__THE_CONTENEDOR_PEDIDO_VIEW_PART:
			setTheContenedorPedidoViewPart((ContenedorPedidoViewPart) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UiPackage.UI__OWNED_BY_MODEL_FACTORY:
			setOwnedByModelFactory((ModelFactory) null);
			return;
		case UiPackage.UI__THE_DOMAIN_ASOCIADO:
			setTheDomainAsociado((Domain) null);
			return;
		case UiPackage.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
			setTheContenedorCRUDProductosViewModel((ContenedorCRUDProductosViewModel) null);
			return;
		case UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
			setTheContenedorCRUDClienteViewModel((ContenedorCRUDClienteViewModel) null);
			return;
		case UiPackage.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL:
			setTheContenedorCRUDRealizarCompraViewModel((ContenedorCRUDCompraViewModel) null);
			return;
		case UiPackage.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
			setTheContenedorCRUDPedidoViewModel((ContenedorCRUDPedidoViewModel) null);
			return;
		case UiPackage.UI__THE_CONTENEDOR_PEDIDO_VIEW_PART:
			setTheContenedorPedidoViewPart((ContenedorPedidoViewPart) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UiPackage.UI__OWNED_BY_MODEL_FACTORY:
			return getOwnedByModelFactory() != null;
		case UiPackage.UI__THE_DOMAIN_ASOCIADO:
			return theDomainAsociado != null;
		case UiPackage.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
			return theContenedorCRUDProductosViewModel != null;
		case UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
			return theContenedorCRUDClienteViewModel != null;
		case UiPackage.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL:
			return theContenedorCRUDRealizarCompraViewModel != null;
		case UiPackage.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL:
			return theContenedorCRUDPedidoViewModel != null;
		case UiPackage.UI__THE_CONTENEDOR_PEDIDO_VIEW_PART:
			return theContenedorPedidoViewPart != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case UiPackage.UI___IMPLEMENTAR_MODELO:
			return implementarModelo();
		case UiPackage.UI___CREAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL:
			crearProducto((ContenedorCRUDProductosViewModel) arguments.get(0));
			return null;
		case UiPackage.UI___CREAR_COMPRA__CONTENEDORCRUDCOMPRAVIEWMODEL:
			crearCompra((ContenedorCRUDCompraViewModel) arguments.get(0));
			return null;
		case UiPackage.UI___CREAR_PEDIDO__CONTENEDORCRUDPEDIDOVIEWMODEL:
			crearPedido((ContenedorCRUDPedidoViewModel) arguments.get(0));
			return null;
		case UiPackage.UI___BUSCAR_PRODUCTO_ID__STRING:
			buscarProductoId((String) arguments.get(0));
			return null;
		case UiPackage.UI___AGREGAR_LISTA_P__CONTENEDORCRUDPRODUCTOSVIEWMODEL:
			agregarListaP((ContenedorCRUDProductosViewModel) arguments.get(0));
			return null;
		case UiPackage.UI___BUSCAR_PRODUCTO_NOMBRE__STRING:
			return buscarProductoNombre((String) arguments.get(0));
		case UiPackage.UI___CREAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL:
			crearCliente((ContenedorCRUDClienteViewModel) arguments.get(0));
			return null;
		case UiPackage.UI___ACTUALIZAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL:
			actualizarCliente((ContenedorCRUDClienteViewModel) arguments.get(0));
			return null;
		case UiPackage.UI___ELIMINAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL:
			eliminarCliente((ContenedorCRUDClienteViewModel) arguments.get(0));
			return null;
		case UiPackage.UI___BUSCAR_CLIENTE__CONTENEDORCRUDCLIENTEVIEWMODEL:
			buscarCliente((ContenedorCRUDClienteViewModel) arguments.get(0));
			return null;
		case UiPackage.UI___BUSCAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL:
			buscarProducto((ContenedorCRUDProductosViewModel) arguments.get(0));
			return null;
		case UiPackage.UI___ELIMINAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL:
			eliminarProducto((ContenedorCRUDProductosViewModel) arguments.get(0));
			return null;
		case UiPackage.UI___ACTUALIZAR_PRODUCTO__CONTENEDORCRUDPRODUCTOSVIEWMODEL:
			actualizarProducto((ContenedorCRUDProductosViewModel) arguments.get(0));
			return null;
		case UiPackage.UI___UPDATE_CONTENEDOR_LISTADO_CLIENTES__CONTENEDORMAESTROCLIENTEVIEWMODEL:
			updateContenedorListadoClientes((ContenedorMaestroClienteViewModel) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // UIImpl
