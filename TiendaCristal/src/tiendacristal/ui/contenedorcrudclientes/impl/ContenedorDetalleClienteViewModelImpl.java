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

import tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Detalle Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorDetalleClienteViewModelImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorDetalleClienteViewModelImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorDetalleClienteViewModelImpl#getTipoCliente <em>Tipo Cliente</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ContenedorDetalleClienteViewModelImpl#getContenedorCRUDClienteViewModel <em>Contenedor CRUD Cliente View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorDetalleClienteViewModelImpl extends MinimalEObjectImpl.Container implements ContenedorDetalleClienteViewModel {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

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
	 * The default value of the '{@link #getTipoCliente() <em>Tipo Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoCliente()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_CLIENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoCliente() <em>Tipo Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoCliente()
	 * @generated
	 * @ordered
	 */
	protected String tipoCliente = TIPO_CLIENTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorDetalleClienteViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudclientesPackage.Literals.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoCliente() {
		return tipoCliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoCliente(String newTipoCliente) {
		String oldTipoCliente = tipoCliente;
		tipoCliente = newTipoCliente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__TIPO_CLIENTE, oldTipoCliente, tipoCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDClienteViewModel getContenedorCRUDClienteViewModel() {
		if (eContainerFeatureID() != ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL) return null;
		return (ContenedorCRUDClienteViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenedorCRUDClienteViewModel(ContenedorCRUDClienteViewModel newContenedorCRUDClienteViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenedorCRUDClienteViewModel, ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenedorCRUDClienteViewModel(ContenedorCRUDClienteViewModel newContenedorCRUDClienteViewModel) {
		if (newContenedorCRUDClienteViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL && newContenedorCRUDClienteViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newContenedorCRUDClienteViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenedorCRUDClienteViewModel != null)
				msgs = ((InternalEObject)newContenedorCRUDClienteViewModel).eInverseAdd(this, ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, ContenedorCRUDClienteViewModel.class, msgs);
			msgs = basicSetContenedorCRUDClienteViewModel(newContenedorCRUDClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, newContenedorCRUDClienteViewModel, newContenedorCRUDClienteViewModel));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContenedorCRUDClienteViewModel((ContenedorCRUDClienteViewModel)otherEnd, msgs);
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
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return basicSetContenedorCRUDClienteViewModel(null, msgs);
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
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudclientesPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, ContenedorCRUDClienteViewModel.class, msgs);
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
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__NOMBRE:
				return getNombre();
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CODIGO:
				return getCodigo();
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__TIPO_CLIENTE:
				return getTipoCliente();
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return getContenedorCRUDClienteViewModel();
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
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__NOMBRE:
				setNombre((String)newValue);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CODIGO:
				setCodigo((String)newValue);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__TIPO_CLIENTE:
				setTipoCliente((String)newValue);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				setContenedorCRUDClienteViewModel((ContenedorCRUDClienteViewModel)newValue);
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
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__TIPO_CLIENTE:
				setTipoCliente(TIPO_CLIENTE_EDEFAULT);
				return;
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				setContenedorCRUDClienteViewModel((ContenedorCRUDClienteViewModel)null);
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
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__TIPO_CLIENTE:
				return TIPO_CLIENTE_EDEFAULT == null ? tipoCliente != null : !TIPO_CLIENTE_EDEFAULT.equals(tipoCliente);
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return getContenedorCRUDClienteViewModel() != null;
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
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL___IMPLEMENTAR_MODELO:
				implementarModelo();
				return null;
			case ContenedorcrudclientesPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL___CREAR:
				crear();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", codigo: ");
		result.append(codigo);
		result.append(", tipoCliente: ");
		result.append(tipoCliente);
		result.append(')');
		return result.toString();
	}

} //ContenedorDetalleClienteViewModelImpl
