/**
 */
package tiendacristal.ui.contenedorcrudproductos.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Detalle Productos Viewmodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorDetalleProductosViewmodelImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorDetalleProductosViewmodelImpl#getPrecio <em>Precio</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorDetalleProductosViewmodelImpl#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorDetalleProductosViewmodelImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorDetalleProductosViewmodelImpl#getContenedorCRUDProductosViewModel <em>Contenedor CRUD Productos View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorDetalleProductosViewmodelImpl extends MinimalEObjectImpl.Container implements ContenedorDetalleProductosViewmodel {
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
	 * The default value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected String precio = PRECIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategoria() <em>Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoria()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoria() <em>Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoria()
	 * @generated
	 * @ordered
	 */
	protected String categoria = CATEGORIA_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorDetalleProductosViewmodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudproductosPackage.Literals.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecio() {
		return precio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecio(String newPrecio) {
		String oldPrecio = precio;
		precio = newPrecio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__PRECIO, oldPrecio, precio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoria(String newCategoria) {
		String oldCategoria = categoria;
		categoria = newCategoria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CATEGORIA, oldCategoria, categoria));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDProductosViewModel getContenedorCRUDProductosViewModel() {
		if (eContainerFeatureID() != ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL) return null;
		return (ContenedorCRUDProductosViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenedorCRUDProductosViewModel(ContenedorCRUDProductosViewModel newContenedorCRUDProductosViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenedorCRUDProductosViewModel, ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenedorCRUDProductosViewModel(ContenedorCRUDProductosViewModel newContenedorCRUDProductosViewModel) {
		if (newContenedorCRUDProductosViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL && newContenedorCRUDProductosViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newContenedorCRUDProductosViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenedorCRUDProductosViewModel != null)
				msgs = ((InternalEObject)newContenedorCRUDProductosViewModel).eInverseAdd(this, ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL, ContenedorCRUDProductosViewModel.class, msgs);
			msgs = basicSetContenedorCRUDProductosViewModel(newContenedorCRUDProductosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL, newContenedorCRUDProductosViewModel, newContenedorCRUDProductosViewModel));
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
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContenedorCRUDProductosViewModel((ContenedorCRUDProductosViewModel)otherEnd, msgs);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				return basicSetContenedorCRUDProductosViewModel(null, msgs);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL, ContenedorCRUDProductosViewModel.class, msgs);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CODIGO:
				return getCodigo();
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__PRECIO:
				return getPrecio();
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CATEGORIA:
				return getCategoria();
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__NOMBRE:
				return getNombre();
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				return getContenedorCRUDProductosViewModel();
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
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CODIGO:
				setCodigo((String)newValue);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__PRECIO:
				setPrecio((String)newValue);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CATEGORIA:
				setCategoria((String)newValue);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__NOMBRE:
				setNombre((String)newValue);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				setContenedorCRUDProductosViewModel((ContenedorCRUDProductosViewModel)newValue);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__PRECIO:
				setPrecio(PRECIO_EDEFAULT);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CATEGORIA:
				setCategoria(CATEGORIA_EDEFAULT);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				setContenedorCRUDProductosViewModel((ContenedorCRUDProductosViewModel)null);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__PRECIO:
				return PRECIO_EDEFAULT == null ? precio != null : !PRECIO_EDEFAULT.equals(precio);
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CATEGORIA:
				return CATEGORIA_EDEFAULT == null ? categoria != null : !CATEGORIA_EDEFAULT.equals(categoria);
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL:
				return getContenedorCRUDProductosViewModel() != null;
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
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL___CREAR:
				crear();
				return null;
			case ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL___IMPLEMENTAR_MODELO:
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
		result.append(", precio: ");
		result.append(precio);
		result.append(", categoria: ");
		result.append(categoria);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ContenedorDetalleProductosViewmodelImpl
