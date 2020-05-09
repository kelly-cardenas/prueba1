/**
 */
package tiendacristal.ui.contenedorcrudrealizarcompra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compra View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.CompraViewModelImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.CompraViewModelImpl#getIdCliente <em>Id Cliente</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.CompraViewModelImpl#getCodigoP <em>Codigo P</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.CompraViewModelImpl#getFecha <em>Fecha</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.CompraViewModelImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.impl.CompraViewModelImpl#getContenedorMaestroCompraViewModel <em>Contenedor Maestro Compra View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompraViewModelImpl extends MinimalEObjectImpl.Container implements CompraViewModel {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompraViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudrealizarcompraPackage.Literals.COMPRA_VIEW_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CODIGO, oldCodigo, codigo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__ID_CLIENTE, oldIdCliente, idCliente));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CODIGO_P, oldCodigoP, codigoP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__FECHA, oldFecha, fecha));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroCompraViewModel getContenedorMaestroCompraViewModel() {
		if (eContainerFeatureID() != ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL) return null;
		return (ContenedorMaestroCompraViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenedorMaestroCompraViewModel(ContenedorMaestroCompraViewModel newContenedorMaestroCompraViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenedorMaestroCompraViewModel, ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenedorMaestroCompraViewModel(ContenedorMaestroCompraViewModel newContenedorMaestroCompraViewModel) {
		if (newContenedorMaestroCompraViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL && newContenedorMaestroCompraViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newContenedorMaestroCompraViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenedorMaestroCompraViewModel != null)
				msgs = ((InternalEObject)newContenedorMaestroCompraViewModel).eInverseAdd(this, ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__LISTA_COMPRA_VIEW_MODEL, ContenedorMaestroCompraViewModel.class, msgs);
			msgs = basicSetContenedorMaestroCompraViewModel(newContenedorMaestroCompraViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL, newContenedorMaestroCompraViewModel, newContenedorMaestroCompraViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContenedorMaestroCompraViewModel((ContenedorMaestroCompraViewModel)otherEnd, msgs);
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
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL:
				return basicSetContenedorMaestroCompraViewModel(null, msgs);
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
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL__LISTA_COMPRA_VIEW_MODEL, ContenedorMaestroCompraViewModel.class, msgs);
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
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CODIGO:
				return getCodigo();
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__ID_CLIENTE:
				return getIdCliente();
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CODIGO_P:
				return getCodigoP();
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__FECHA:
				return getFecha();
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__TOTAL:
				return getTotal();
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL:
				return getContenedorMaestroCompraViewModel();
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
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CODIGO:
				setCodigo((String)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__ID_CLIENTE:
				setIdCliente((String)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CODIGO_P:
				setCodigoP((String)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__FECHA:
				setFecha((String)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__TOTAL:
				setTotal((Integer)newValue);
				return;
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL:
				setContenedorMaestroCompraViewModel((ContenedorMaestroCompraViewModel)newValue);
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
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__ID_CLIENTE:
				setIdCliente(ID_CLIENTE_EDEFAULT);
				return;
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CODIGO_P:
				setCodigoP(CODIGO_P_EDEFAULT);
				return;
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__FECHA:
				setFecha(FECHA_EDEFAULT);
				return;
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__TOTAL:
				setTotal(TOTAL_EDEFAULT);
				return;
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL:
				setContenedorMaestroCompraViewModel((ContenedorMaestroCompraViewModel)null);
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
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__ID_CLIENTE:
				return ID_CLIENTE_EDEFAULT == null ? idCliente != null : !ID_CLIENTE_EDEFAULT.equals(idCliente);
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CODIGO_P:
				return CODIGO_P_EDEFAULT == null ? codigoP != null : !CODIGO_P_EDEFAULT.equals(codigoP);
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__FECHA:
				return FECHA_EDEFAULT == null ? fecha != null : !FECHA_EDEFAULT.equals(fecha);
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__TOTAL:
				return total != TOTAL_EDEFAULT;
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL__CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL:
				return getContenedorMaestroCompraViewModel() != null;
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

} //CompraViewModelImpl
