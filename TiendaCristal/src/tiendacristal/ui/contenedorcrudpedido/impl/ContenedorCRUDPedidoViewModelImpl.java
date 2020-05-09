/**
 */
package tiendacristal.ui.contenedorcrudpedido.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tiendacristal.ui.UI;
import tiendacristal.ui.UiPackage;

import tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor CRUD Pedido View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorCRUDPedidoViewModelImpl#getUI <em>UI</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorCRUDPedidoViewModelImpl#getTheContenedorDetallePedidoViewModel <em>The Contenedor Detalle Pedido View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.impl.ContenedorCRUDPedidoViewModelImpl#getTheContenedorMaestroPedidoViewModel <em>The Contenedor Maestro Pedido View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorCRUDPedidoViewModelImpl extends MinimalEObjectImpl.Container implements ContenedorCRUDPedidoViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorDetallePedidoViewModel() <em>The Contenedor Detalle Pedido View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorDetallePedidoViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorDetallePedidoViewModel theContenedorDetallePedidoViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorMaestroPedidoViewModel() <em>The Contenedor Maestro Pedido View Model</em>}' containment reference.
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
	protected ContenedorCRUDPedidoViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudpedidoPackage.Literals.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getUI() {
		if (eContainerFeatureID() != ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUI(UI newUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUI, ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUI(UI newUI) {
		if (newUI != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI && newUI != null)) {
			if (EcoreUtil.isAncestor(this, newUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUI != null)
				msgs = ((InternalEObject)newUI).eInverseAdd(this, UiPackage.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL, UI.class, msgs);
			msgs = basicSetUI(newUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI, newUI, newUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetallePedidoViewModel getTheContenedorDetallePedidoViewModel() {
		return theContenedorDetallePedidoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorDetallePedidoViewModel(ContenedorDetallePedidoViewModel newTheContenedorDetallePedidoViewModel, NotificationChain msgs) {
		ContenedorDetallePedidoViewModel oldTheContenedorDetallePedidoViewModel = theContenedorDetallePedidoViewModel;
		theContenedorDetallePedidoViewModel = newTheContenedorDetallePedidoViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL, oldTheContenedorDetallePedidoViewModel, newTheContenedorDetallePedidoViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorDetallePedidoViewModel(ContenedorDetallePedidoViewModel newTheContenedorDetallePedidoViewModel) {
		if (newTheContenedorDetallePedidoViewModel != theContenedorDetallePedidoViewModel) {
			NotificationChain msgs = null;
			if (theContenedorDetallePedidoViewModel != null)
				msgs = ((InternalEObject)theContenedorDetallePedidoViewModel).eInverseRemove(this, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL, ContenedorDetallePedidoViewModel.class, msgs);
			if (newTheContenedorDetallePedidoViewModel != null)
				msgs = ((InternalEObject)newTheContenedorDetallePedidoViewModel).eInverseAdd(this, ContenedorcrudpedidoPackage.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL, ContenedorDetallePedidoViewModel.class, msgs);
			msgs = basicSetTheContenedorDetallePedidoViewModel(newTheContenedorDetallePedidoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL, newTheContenedorDetallePedidoViewModel, newTheContenedorDetallePedidoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroPedidoViewModel getTheContenedorMaestroPedidoViewModel() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL, oldTheContenedorMaestroPedidoViewModel, newTheContenedorMaestroPedidoViewModel);
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
				msgs = ((InternalEObject)theContenedorMaestroPedidoViewModel).eInverseRemove(this, ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL, ContenedorMaestroPedidoViewModel.class, msgs);
			if (newTheContenedorMaestroPedidoViewModel != null)
				msgs = ((InternalEObject)newTheContenedorMaestroPedidoViewModel).eInverseAdd(this, ContenedorcrudpedidoPackage.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL, ContenedorMaestroPedidoViewModel.class, msgs);
			msgs = basicSetTheContenedorMaestroPedidoViewModel(newTheContenedorMaestroPedidoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL, newTheContenedorMaestroPedidoViewModel, newTheContenedorMaestroPedidoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		
		
				ContenedorDetallePedidoViewModel contenedorDetallePedidoViewModel = getTheContenedorDetallePedidoViewModel();
				ContenedorMaestroPedidoViewModel contenedorMaestroPedidoViewModel = getTheContenedorMaestroPedidoViewModel();
				
				if (contenedorDetallePedidoViewModel == null) {
					
					contenedorDetallePedidoViewModel = tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoFactory.eINSTANCE.createContenedorDetallePedidoViewModel();
					
							
				}
				
				if (contenedorMaestroPedidoViewModel == null) {
					
					contenedorMaestroPedidoViewModel = tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoFactory.eINSTANCE.createContenedorMaestroPedidoViewModel();
					
				}
				
				setTheContenedorDetallePedidoViewModel(contenedorDetallePedidoViewModel);
				setTheContenedorMaestroPedidoViewModel(contenedorMaestroPedidoViewModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void crearPedido() {
				
				getUI().crearPedido(this);
		
			
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUI((UI)otherEnd, msgs);
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
				if (theContenedorDetallePedidoViewModel != null)
					msgs = ((InternalEObject)theContenedorDetallePedidoViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorDetallePedidoViewModel((ContenedorDetallePedidoViewModel)otherEnd, msgs);
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				if (theContenedorMaestroPedidoViewModel != null)
					msgs = ((InternalEObject)theContenedorMaestroPedidoViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL, null, msgs);
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
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI:
				return basicSetUI(null, msgs);
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
				return basicSetTheContenedorDetallePedidoViewModel(null, msgs);
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
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
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL, UI.class, msgs);
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
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI:
				return getUI();
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
				return getTheContenedorDetallePedidoViewModel();
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
				return getTheContenedorMaestroPedidoViewModel();
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
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI:
				setUI((UI)newValue);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
				setTheContenedorDetallePedidoViewModel((ContenedorDetallePedidoViewModel)newValue);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
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
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI:
				setUI((UI)null);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
				setTheContenedorDetallePedidoViewModel((ContenedorDetallePedidoViewModel)null);
				return;
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
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
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__UI:
				return getUI() != null;
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL:
				return theContenedorDetallePedidoViewModel != null;
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL:
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
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL___IMPLEMENTAR_MODELO:
				implementarModelo();
				return null;
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL___CREAR_PEDIDO:
				crearPedido();
				return null;
			case ContenedorcrudpedidoPackage.CONTENEDOR_CRUD_PEDIDO_VIEW_MODEL___CREAR:
				crear();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContenedorCRUDPedidoViewModelImpl
