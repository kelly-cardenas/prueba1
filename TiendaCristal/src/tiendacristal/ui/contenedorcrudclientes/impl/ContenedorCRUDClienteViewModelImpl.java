/**
 */
package tiendacristal.ui.contenedorcrudclientes.impl;

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

import tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor CRUD Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorCRUDClienteViewModelImpl#getUI <em>UI</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorCRUDClienteViewModelImpl#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorCRUDClienteViewModelImpl#getTheContenedorDetalleClienteViewModel <em>The Contenedor Detalle Cliente View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorCRUDClienteViewModelImpl extends MinimalEObjectImpl.Container implements ContenedorCRUDClienteViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorMaestroClienteViewModel() <em>The Contenedor Maestro Cliente View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorMaestroClienteViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorMaestroClienteViewModel theContenedorMaestroClienteViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorDetalleClienteViewModel() <em>The Contenedor Detalle Cliente View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorDetalleClienteViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorDetalleClienteViewModel theContenedorDetalleClienteViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorCRUDClienteViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudclientesPackage.Literals.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getUI() {
		if (eContainerFeatureID() != ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUI(UI newUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUI, ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUI(UI newUI) {
		if (newUI != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI && newUI != null)) {
			if (EcoreUtil.isAncestor(this, newUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUI != null)
				msgs = ((InternalEObject)newUI).eInverseAdd(this, UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, UI.class, msgs);
			msgs = basicSetUI(newUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI, newUI, newUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroClienteViewModel getTheContenedorMaestroClienteViewModel() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, oldTheContenedorMaestroClienteViewModel, newTheContenedorMaestroClienteViewModel);
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
				msgs = ((InternalEObject)theContenedorMaestroClienteViewModel).eInverseRemove(this, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY, ContenedorMaestroClienteViewModel.class, msgs);
			if (newTheContenedorMaestroClienteViewModel != null)
				msgs = ((InternalEObject)newTheContenedorMaestroClienteViewModel).eInverseAdd(this, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY, ContenedorMaestroClienteViewModel.class, msgs);
			msgs = basicSetTheContenedorMaestroClienteViewModel(newTheContenedorMaestroClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, newTheContenedorMaestroClienteViewModel, newTheContenedorMaestroClienteViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleClienteViewModel getTheContenedorDetalleClienteViewModel() {
		return theContenedorDetalleClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel newTheContenedorDetalleClienteViewModel, NotificationChain msgs) {
		ContenedorDetalleClienteViewModel oldTheContenedorDetalleClienteViewModel = theContenedorDetalleClienteViewModel;
		theContenedorDetalleClienteViewModel = newTheContenedorDetalleClienteViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, oldTheContenedorDetalleClienteViewModel, newTheContenedorDetalleClienteViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel newTheContenedorDetalleClienteViewModel) {
		if (newTheContenedorDetalleClienteViewModel != theContenedorDetalleClienteViewModel) {
			NotificationChain msgs = null;
			if (theContenedorDetalleClienteViewModel != null)
				msgs = ((InternalEObject)theContenedorDetalleClienteViewModel).eInverseRemove(this, ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, ContenedorDetalleClienteViewModel.class, msgs);
			if (newTheContenedorDetalleClienteViewModel != null)
				msgs = ((InternalEObject)newTheContenedorDetalleClienteViewModel).eInverseAdd(this, ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, ContenedorDetalleClienteViewModel.class, msgs);
			msgs = basicSetTheContenedorDetalleClienteViewModel(newTheContenedorDetalleClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, newTheContenedorDetalleClienteViewModel, newTheContenedorDetalleClienteViewModel));
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
		
		
				ContenedorDetalleClienteViewModel contenedorDetalleClienteViewModel = getTheContenedorDetalleClienteViewModel();
				ContenedorMaestroClienteViewModel contenedorMaestroClienteViewModel = getTheContenedorMaestroClienteViewModel();
				
				if (contenedorDetalleClienteViewModel == null) {
					
					contenedorDetalleClienteViewModel = tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesFactory.eINSTANCE.createContenedorDetalleClienteViewModel();
					
				}
				
				if(contenedorMaestroClienteViewModel == null ) {
					
					contenedorMaestroClienteViewModel = tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesFactory.eINSTANCE.createContenedorMaestroClienteViewModel();
					
				}
				
				setTheContenedorDetalleClienteViewModel(contenedorDetalleClienteViewModel);
				setTheContenedorMaestroClienteViewModel(contenedorMaestroClienteViewModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void enlazar() {
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
		getTheContenedorDetalleClienteViewModel().setNombre("");
						getTheContenedorDetalleClienteViewModel().setCodigo("");
						getTheContenedorDetalleClienteViewModel().setTipoCliente("");
						
						getTheContenedorMaestroClienteViewModel().update();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUI((UI)otherEnd, msgs);
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				if (theContenedorMaestroClienteViewModel != null)
					msgs = ((InternalEObject)theContenedorMaestroClienteViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)otherEnd, msgs);
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				if (theContenedorDetalleClienteViewModel != null)
					msgs = ((InternalEObject)theContenedorDetalleClienteViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorDetalleClienteViewModel((ContenedorDetalleClienteViewModel)otherEnd, msgs);
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
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI:
				return basicSetUI(null, msgs);
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return basicSetTheContenedorMaestroClienteViewModel(null, msgs);
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				return basicSetTheContenedorDetalleClienteViewModel(null, msgs);
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
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, UI.class, msgs);
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
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI:
				return getUI();
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return getTheContenedorMaestroClienteViewModel();
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				return getTheContenedorDetalleClienteViewModel();
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
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI:
				setUI((UI)newValue);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				setTheContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)newValue);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				setTheContenedorDetalleClienteViewModel((ContenedorDetalleClienteViewModel)newValue);
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
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI:
				setUI((UI)null);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				setTheContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)null);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				setTheContenedorDetalleClienteViewModel((ContenedorDetalleClienteViewModel)null);
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
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__UI:
				return getUI() != null;
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return theContenedorMaestroClienteViewModel != null;
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				return theContenedorDetalleClienteViewModel != null;
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
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___CREAR:
				crear();
				return null;
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___IMPLEMENTAR_MODELO:
				implementarModelo();
				return null;
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___ENLAZAR:
				enlazar();
				return null;
			case ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL___UPDATE:
				update();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContenedorCRUDClienteViewModelImpl
