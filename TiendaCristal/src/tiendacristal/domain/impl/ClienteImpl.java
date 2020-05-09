/**
 */
package tiendacristal.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tiendacristal.domain.Cliente;
import tiendacristal.domain.Domain;
import tiendacristal.domain.DomainPackage;
import tiendacristal.domain.Pedido;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.impl.ClienteImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.ClienteImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.ClienteImpl#getTipoCliente <em>Tipo Cliente</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.ClienteImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link tiendacristal.domain.impl.ClienteImpl#getListaPedidos <em>Lista Pedidos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClienteImpl extends MinimalEObjectImpl.Container implements Cliente {
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
	 * The cached value of the '{@link #getListaPedidos() <em>Lista Pedidos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaPedidos()
	 * @generated
	 * @ordered
	 */
	protected EList<Pedido> listaPedidos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClienteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CLIENTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__CODIGO, oldCodigo, codigo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__TIPO_CLIENTE, oldTipoCliente, tipoCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomain() {
		if (eContainerFeatureID() != DomainPackage.CLIENTE__DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, DomainPackage.CLIENTE__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Domain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.CLIENTE__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, DomainPackage.DOMAIN__LISTA_CLIENTES, Domain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pedido> getListaPedidos() {
		if (listaPedidos == null) {
			listaPedidos = new EObjectWithInverseResolvingEList<Pedido>(Pedido.class, this, DomainPackage.CLIENTE__LISTA_PEDIDOS, DomainPackage.PEDIDO__THE_CLIENTE);
		}
		return listaPedidos;
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
			case DomainPackage.CLIENTE__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((Domain)otherEnd, msgs);
			case DomainPackage.CLIENTE__LISTA_PEDIDOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaPedidos()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.CLIENTE__DOMAIN:
				return basicSetDomain(null, msgs);
			case DomainPackage.CLIENTE__LISTA_PEDIDOS:
				return ((InternalEList<?>)getListaPedidos()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.CLIENTE__DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LISTA_CLIENTES, Domain.class, msgs);
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
			case DomainPackage.CLIENTE__NOMBRE:
				return getNombre();
			case DomainPackage.CLIENTE__CODIGO:
				return getCodigo();
			case DomainPackage.CLIENTE__TIPO_CLIENTE:
				return getTipoCliente();
			case DomainPackage.CLIENTE__DOMAIN:
				return getDomain();
			case DomainPackage.CLIENTE__LISTA_PEDIDOS:
				return getListaPedidos();
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
			case DomainPackage.CLIENTE__NOMBRE:
				setNombre((String)newValue);
				return;
			case DomainPackage.CLIENTE__CODIGO:
				setCodigo((String)newValue);
				return;
			case DomainPackage.CLIENTE__TIPO_CLIENTE:
				setTipoCliente((String)newValue);
				return;
			case DomainPackage.CLIENTE__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case DomainPackage.CLIENTE__LISTA_PEDIDOS:
				getListaPedidos().clear();
				getListaPedidos().addAll((Collection<? extends Pedido>)newValue);
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
			case DomainPackage.CLIENTE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__TIPO_CLIENTE:
				setTipoCliente(TIPO_CLIENTE_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__DOMAIN:
				setDomain((Domain)null);
				return;
			case DomainPackage.CLIENTE__LISTA_PEDIDOS:
				getListaPedidos().clear();
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
			case DomainPackage.CLIENTE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DomainPackage.CLIENTE__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case DomainPackage.CLIENTE__TIPO_CLIENTE:
				return TIPO_CLIENTE_EDEFAULT == null ? tipoCliente != null : !TIPO_CLIENTE_EDEFAULT.equals(tipoCliente);
			case DomainPackage.CLIENTE__DOMAIN:
				return getDomain() != null;
			case DomainPackage.CLIENTE__LISTA_PEDIDOS:
				return listaPedidos != null && !listaPedidos.isEmpty();
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

} //ClienteImpl
