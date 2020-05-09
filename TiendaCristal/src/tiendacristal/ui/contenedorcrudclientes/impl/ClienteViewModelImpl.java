/**
 */
package tiendacristal.ui.contenedorcrudclientes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tiendacristal.ui.contenedorcrudclientes.ClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ClienteViewModelImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ClienteViewModelImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ClienteViewModelImpl#getTipoCliente <em>Tipo Cliente</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.impl.ClienteViewModelImpl#getOwnedBy <em>Owned By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClienteViewModelImpl extends MinimalEObjectImpl.Container implements ClienteViewModel {
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
	protected ClienteViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudclientesPackage.Literals.CLIENTE_VIEW_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__CODIGO, oldCodigo, codigo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__TIPO_CLIENTE, oldTipoCliente, tipoCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroClienteViewModel getOwnedBy() {
		if (eContainerFeatureID() != ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__OWNED_BY) return null;
		return (ContenedorMaestroClienteViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedBy(ContenedorMaestroClienteViewModel newOwnedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedBy, ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__OWNED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedBy(ContenedorMaestroClienteViewModel newOwnedBy) {
		if (newOwnedBy != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__OWNED_BY && newOwnedBy != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedBy != null)
				msgs = ((InternalEObject)newOwnedBy).eInverseAdd(this, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
			msgs = basicSetOwnedBy(newOwnedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__OWNED_BY, newOwnedBy, newOwnedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__OWNED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedBy((ContenedorMaestroClienteViewModel)otherEnd, msgs);
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
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__OWNED_BY:
				return basicSetOwnedBy(null, msgs);
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
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__OWNED_BY:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudclientesPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
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
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__NOMBRE:
				return getNombre();
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__CODIGO:
				return getCodigo();
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__TIPO_CLIENTE:
				return getTipoCliente();
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__OWNED_BY:
				return getOwnedBy();
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
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__NOMBRE:
				setNombre((String)newValue);
				return;
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__CODIGO:
				setCodigo((String)newValue);
				return;
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__TIPO_CLIENTE:
				setTipoCliente((String)newValue);
				return;
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__OWNED_BY:
				setOwnedBy((ContenedorMaestroClienteViewModel)newValue);
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
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__TIPO_CLIENTE:
				setTipoCliente(TIPO_CLIENTE_EDEFAULT);
				return;
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__OWNED_BY:
				setOwnedBy((ContenedorMaestroClienteViewModel)null);
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
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__TIPO_CLIENTE:
				return TIPO_CLIENTE_EDEFAULT == null ? tipoCliente != null : !TIPO_CLIENTE_EDEFAULT.equals(tipoCliente);
			case ContenedorcrudclientesPackage.CLIENTE_VIEW_MODEL__OWNED_BY:
				return getOwnedBy() != null;
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", codigo: ");
		result.append(codigo);
		result.append(", tipoCliente: ");
		result.append(tipoCliente);
		result.append(')');
		return result.toString();
	}

} //ClienteViewModelImpl
