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

import tiendacristal.ui.UI;
import tiendacristal.ui.UiPackage;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor CRUD Compra View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorCRUDCompraViewModelImpl#getUI <em>UI</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorCRUDCompraViewModelImpl#getTheContenedorDetalleCompraViewModel <em>The Contenedor Detalle Compra View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorCRUDCompraViewModelImpl#getTheContenedorMaestroCompraViewModel <em>The Contenedor Maestro Compra View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorCRUDCompraViewModelImpl extends MinimalEObjectImpl.Container implements ContenedorCRUDCompraViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorDetalleCompraViewModel() <em>The Contenedor Detalle Compra View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorDetalleCompraViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorDetalleCompraViewModel theContenedorDetalleCompraViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorMaestroCompraViewModel() <em>The Contenedor Maestro Compra View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorMaestroCompraViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorMaestroCompraViewModel theContenedorMaestroCompraViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorCRUDCompraViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudrealizarcompraPackage.Literals.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getUI() {
		if (eContainerFeatureID() != ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUI(UI newUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUI, ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUI(UI newUI) {
		if (newUI != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI && newUI != null)) {
			if (EcoreUtil.isAncestor(this, newUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUI != null)
				msgs = ((InternalEObject)newUI).eInverseAdd(this, UiPackage.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL, UI.class, msgs);
			msgs = basicSetUI(newUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI, newUI, newUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleCompraViewModel getTheContenedorDetalleCompraViewModel() {
		return theContenedorDetalleCompraViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorDetalleCompraViewModel(ContenedorDetalleCompraViewModel newTheContenedorDetalleCompraViewModel, NotificationChain msgs) {
		ContenedorDetalleCompraViewModel oldTheContenedorDetalleCompraViewModel = theContenedorDetalleCompraViewModel;
		theContenedorDetalleCompraViewModel = newTheContenedorDetalleCompraViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, oldTheContenedorDetalleCompraViewModel, newTheContenedorDetalleCompraViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorDetalleCompraViewModel(ContenedorDetalleCompraViewModel newTheContenedorDetalleCompraViewModel) {
		if (newTheContenedorDetalleCompraViewModel != theContenedorDetalleCompraViewModel) {
			NotificationChain msgs = null;
			if (theContenedorDetalleCompraViewModel != null)
				msgs = ((InternalEObject)theContenedorDetalleCompraViewModel).eInverseRemove(this, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL, ContenedorDetalleCompraViewModel.class, msgs);
			if (newTheContenedorDetalleCompraViewModel != null)
				msgs = ((InternalEObject)newTheContenedorDetalleCompraViewModel).eInverseAdd(this, ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL, ContenedorDetalleCompraViewModel.class, msgs);
			msgs = basicSetTheContenedorDetalleCompraViewModel(newTheContenedorDetalleCompraViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, newTheContenedorDetalleCompraViewModel, newTheContenedorDetalleCompraViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroCompraViewModel getTheContenedorMaestroCompraViewModel() {
		return theContenedorMaestroCompraViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorMaestroCompraViewModel(ContenedorMaestroCompraViewModel newTheContenedorMaestroCompraViewModel, NotificationChain msgs) {
		ContenedorMaestroCompraViewModel oldTheContenedorMaestroCompraViewModel = theContenedorMaestroCompraViewModel;
		theContenedorMaestroCompraViewModel = newTheContenedorMaestroCompraViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL, oldTheContenedorMaestroCompraViewModel, newTheContenedorMaestroCompraViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorMaestroCompraViewModel(ContenedorMaestroCompraViewModel newTheContenedorMaestroCompraViewModel) {
		if (newTheContenedorMaestroCompraViewModel != theContenedorMaestroCompraViewModel) {
			NotificationChain msgs = null;
			if (theContenedorMaestroCompraViewModel != null)
				msgs = ((InternalEObject)theContenedorMaestroCompraViewModel).eInverseRemove(this, ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL, ContenedorMaestroCompraViewModel.class, msgs);
			if (newTheContenedorMaestroCompraViewModel != null)
				msgs = ((InternalEObject)newTheContenedorMaestroCompraViewModel).eInverseAdd(this, ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL, ContenedorMaestroCompraViewModel.class, msgs);
			msgs = basicSetTheContenedorMaestroCompraViewModel(newTheContenedorMaestroCompraViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL, newTheContenedorMaestroCompraViewModel, newTheContenedorMaestroCompraViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		
		
						ContenedorDetalleCompraViewModel contenedorDetalleCompraViewModel = getTheContenedorDetalleCompraViewModel();
						ContenedorMaestroCompraViewModel contenedorMaestroCompraViewModel = getTheContenedorMaestroCompraViewModel();
				
						if (contenedorDetalleCompraViewModel == null) {
				
							contenedorDetalleCompraViewModel = tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraFactory.eINSTANCE
									.createContenedorDetalleCompraViewModel();
				
						}
				
						setTheContenedorDetalleCompraViewModel(contenedorDetalleCompraViewModel);
				
						if (contenedorMaestroCompraViewModel == null) {
				
							contenedorMaestroCompraViewModel = tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraFactory.eINSTANCE
									.createContenedorMaestroCompraViewModel();
				
						}
				
						setTheContenedorMaestroCompraViewModel(contenedorMaestroCompraViewModel);
						setTheContenedorDetalleCompraViewModel(contenedorDetalleCompraViewModel);
				setTheContenedorDetalleCompraViewModel(contenedorDetalleCompraViewModel);
		
				if (contenedorMaestroCompraViewModel == null) {
		
					contenedorMaestroCompraViewModel = tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraFactory.eINSTANCE
							.createContenedorMaestroCompraViewModel();
		
				}
		
				setTheContenedorMaestroCompraViewModel(contenedorMaestroCompraViewModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void crearCompra() {
				
				getUI().crearCompra(this);
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
	public void implementar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUI((UI)otherEnd, msgs);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				if (theContenedorDetalleCompraViewModel != null)
					msgs = ((InternalEObject)theContenedorDetalleCompraViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorDetalleCompraViewModel((ContenedorDetalleCompraViewModel)otherEnd, msgs);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL:
				if (theContenedorMaestroCompraViewModel != null)
					msgs = ((InternalEObject)theContenedorMaestroCompraViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorMaestroCompraViewModel((ContenedorMaestroCompraViewModel)otherEnd, msgs);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI:
				return basicSetUI(null, msgs);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return basicSetTheContenedorDetalleCompraViewModel(null, msgs);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL:
				return basicSetTheContenedorMaestroCompraViewModel(null, msgs);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_CONTENEDOR_CRUD_REALIZAR_COMPRA_VIEW_MODEL, UI.class, msgs);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI:
				return getUI();
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return getTheContenedorDetalleCompraViewModel();
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL:
				return getTheContenedorMaestroCompraViewModel();
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI:
				setUI((UI)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				setTheContenedorDetalleCompraViewModel((ContenedorDetalleCompraViewModel)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL:
				setTheContenedorMaestroCompraViewModel((ContenedorMaestroCompraViewModel)newValue);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI:
				setUI((UI)null);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				setTheContenedorDetalleCompraViewModel((ContenedorDetalleCompraViewModel)null);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL:
				setTheContenedorMaestroCompraViewModel((ContenedorMaestroCompraViewModel)null);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__UI:
				return getUI() != null;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL:
				return theContenedorDetalleCompraViewModel != null;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL:
				return theContenedorMaestroCompraViewModel != null;
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___IMPLEMENTAR_MODELO:
				implementarModelo();
				return null;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___CREAR_COMPRA:
				crearCompra();
				return null;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___CREAR:
				crear();
				return null;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___IMPLEMENTAR:
				implementar();
				return null;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL___ENLAZAR:
				enlazar();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContenedorCRUDCompraViewModelImpl
