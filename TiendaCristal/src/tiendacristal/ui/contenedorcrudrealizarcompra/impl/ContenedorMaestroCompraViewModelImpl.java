/**
 */
package tiendacristal.ui.contenedorcrudrealizarcompra.impl;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Maestro Compra View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorMaestroCompraViewModelImpl#getContenedorCRUDCompraViewModel <em>Contenedor CRUD Compra View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorMaestroCompraViewModelImpl#getListaCompraViewModel <em>Lista Compra View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorMaestroCompraViewModelImpl extends MinimalEObjectImpl.Container implements ContenedorMaestroCompraViewModel {
	/**
	 * The cached value of the '{@link #getListaCompraViewModel() <em>Lista Compra View Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaCompraViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<CompraViewModel> listaCompraViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorMaestroCompraViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudrealizarcompraPackage.Literals.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDCompraViewModel getContenedorCRUDCompraViewModel() {
		if (eContainerFeatureID() != ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL) return null;
		return (ContenedorCRUDCompraViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenedorCRUDCompraViewModel(ContenedorCRUDCompraViewModel newContenedorCRUDCompraViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenedorCRUDCompraViewModel, ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenedorCRUDCompraViewModel(ContenedorCRUDCompraViewModel newContenedorCRUDCompraViewModel) {
		if (newContenedorCRUDCompraViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL && newContenedorCRUDCompraViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newContenedorCRUDCompraViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenedorCRUDCompraViewModel != null)
				msgs = ((InternalEObject)newContenedorCRUDCompraViewModel).eInverseAdd(this, ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL, ContenedorCRUDCompraViewModel.class, msgs);
			msgs = basicSetContenedorCRUDCompraViewModel(newContenedorCRUDCompraViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL, newContenedorCRUDCompraViewModel, newContenedorCRUDCompraViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompraViewModel> getListaCompraViewModel() {
		if (listaCompraViewModel == null) {
			listaCompraViewModel = new EObjectContainmentWithInverseEList<CompraViewModel>(CompraViewModel.class, this, ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__LISTA_COMPRA_VIEW_MODEL, ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL);
		}
		return listaCompraViewModel;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContenedorCRUDCompraViewModel((ContenedorCRUDCompraViewModel)otherEnd, msgs);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__LISTA_COMPRA_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaCompraViewModel()).basicAdd(otherEnd, msgs);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				return basicSetContenedorCRUDCompraViewModel(null, msgs);
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__LISTA_COMPRA_VIEW_MODEL:
				return ((InternalEList<?>)getListaCompraViewModel()).basicRemove(otherEnd, msgs);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL, ContenedorCRUDCompraViewModel.class, msgs);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				return getContenedorCRUDCompraViewModel();
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__LISTA_COMPRA_VIEW_MODEL:
				return getListaCompraViewModel();
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				setContenedorCRUDCompraViewModel((ContenedorCRUDCompraViewModel)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__LISTA_COMPRA_VIEW_MODEL:
				getListaCompraViewModel().clear();
				getListaCompraViewModel().addAll((Collection<? extends CompraViewModel>)newValue);
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				setContenedorCRUDCompraViewModel((ContenedorCRUDCompraViewModel)null);
				return;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__LISTA_COMPRA_VIEW_MODEL:
				getListaCompraViewModel().clear();
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__CONTENEDOR_CRUD_COMPRA_VIEW_MODEL:
				return getContenedorCRUDCompraViewModel() != null;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__LISTA_COMPRA_VIEW_MODEL:
				return listaCompraViewModel != null && !listaCompraViewModel.isEmpty();
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
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL___CREATE:
				create();
				return null;
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL___IMPLEMENTAR_MODELO:
				implementarModelo();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContenedorMaestroCompraViewModelImpl
