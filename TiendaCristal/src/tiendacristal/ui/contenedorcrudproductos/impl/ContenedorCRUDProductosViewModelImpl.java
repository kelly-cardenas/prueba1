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

import tiendacristal.ui.UI;
import tiendacristal.ui.UiPackage;

import tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel;

import tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor CRUD Productos View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorCRUDProductosViewModelImpl#getUI <em>UI</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorCRUDProductosViewModelImpl#getTheContenedorDetalleProductosViewmodel <em>The Contenedor Detalle Productos Viewmodel</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.impl.ContenedorCRUDProductosViewModelImpl#getTheContenedorMestroProductosViewModel <em>The Contenedor Mestro Productos View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorCRUDProductosViewModelImpl extends MinimalEObjectImpl.Container implements ContenedorCRUDProductosViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorDetalleProductosViewmodel() <em>The Contenedor Detalle Productos Viewmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorDetalleProductosViewmodel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorDetalleProductosViewmodel theContenedorDetalleProductosViewmodel;

	/**
	 * The cached value of the '{@link #getTheContenedorMestroProductosViewModel() <em>The Contenedor Mestro Productos View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorMestroProductosViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorMestroProductosViewModel theContenedorMestroProductosViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorCRUDProductosViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudproductosPackage.Literals.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getUI() {
		if (eContainerFeatureID() != ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUI(UI newUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUI, ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUI(UI newUI) {
		if (newUI != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI && newUI != null)) {
			if (EcoreUtil.isAncestor(this, newUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUI != null)
				msgs = ((InternalEObject)newUI).eInverseAdd(this, UiPackage.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL, UI.class, msgs);
			msgs = basicSetUI(newUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI, newUI, newUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleProductosViewmodel getTheContenedorDetalleProductosViewmodel() {
		return theContenedorDetalleProductosViewmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorDetalleProductosViewmodel(ContenedorDetalleProductosViewmodel newTheContenedorDetalleProductosViewmodel, NotificationChain msgs) {
		ContenedorDetalleProductosViewmodel oldTheContenedorDetalleProductosViewmodel = theContenedorDetalleProductosViewmodel;
		theContenedorDetalleProductosViewmodel = newTheContenedorDetalleProductosViewmodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL, oldTheContenedorDetalleProductosViewmodel, newTheContenedorDetalleProductosViewmodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorDetalleProductosViewmodel(ContenedorDetalleProductosViewmodel newTheContenedorDetalleProductosViewmodel) {
		if (newTheContenedorDetalleProductosViewmodel != theContenedorDetalleProductosViewmodel) {
			NotificationChain msgs = null;
			if (theContenedorDetalleProductosViewmodel != null)
				msgs = ((InternalEObject)theContenedorDetalleProductosViewmodel).eInverseRemove(this, ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL, ContenedorDetalleProductosViewmodel.class, msgs);
			if (newTheContenedorDetalleProductosViewmodel != null)
				msgs = ((InternalEObject)newTheContenedorDetalleProductosViewmodel).eInverseAdd(this, ContenedorcrudproductosPackage.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL, ContenedorDetalleProductosViewmodel.class, msgs);
			msgs = basicSetTheContenedorDetalleProductosViewmodel(newTheContenedorDetalleProductosViewmodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL, newTheContenedorDetalleProductosViewmodel, newTheContenedorDetalleProductosViewmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMestroProductosViewModel getTheContenedorMestroProductosViewModel() {
		return theContenedorMestroProductosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorMestroProductosViewModel(ContenedorMestroProductosViewModel newTheContenedorMestroProductosViewModel, NotificationChain msgs) {
		ContenedorMestroProductosViewModel oldTheContenedorMestroProductosViewModel = theContenedorMestroProductosViewModel;
		theContenedorMestroProductosViewModel = newTheContenedorMestroProductosViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL, oldTheContenedorMestroProductosViewModel, newTheContenedorMestroProductosViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorMestroProductosViewModel(ContenedorMestroProductosViewModel newTheContenedorMestroProductosViewModel) {
		if (newTheContenedorMestroProductosViewModel != theContenedorMestroProductosViewModel) {
			NotificationChain msgs = null;
			if (theContenedorMestroProductosViewModel != null)
				msgs = ((InternalEObject)theContenedorMestroProductosViewModel).eInverseRemove(this, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL, ContenedorMestroProductosViewModel.class, msgs);
			if (newTheContenedorMestroProductosViewModel != null)
				msgs = ((InternalEObject)newTheContenedorMestroProductosViewModel).eInverseAdd(this, ContenedorcrudproductosPackage.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL, ContenedorMestroProductosViewModel.class, msgs);
			msgs = basicSetTheContenedorMestroProductosViewModel(newTheContenedorMestroProductosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL, newTheContenedorMestroProductosViewModel, newTheContenedorMestroProductosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void crearProducto() {
				getUI().crearProducto(this);
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
	public void buscarProductoId(String nombre) {
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
		
		
				ContenedorDetalleProductosViewmodel contenedorDetalleProductosViewmodel = getTheContenedorDetalleProductosViewmodel();
				ContenedorMestroProductosViewModel contenedorMestroProductosViewModel = getTheContenedorMestroProductosViewModel();
		
				if (contenedorDetalleProductosViewmodel == null) {
		
					contenedorDetalleProductosViewmodel = tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosFactory.eINSTANCE
							.createContenedorDetalleProductosViewmodel();
		
				}
		
				if (contenedorMestroProductosViewModel == null) {
		
					contenedorMestroProductosViewModel = tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosFactory.eINSTANCE
							.createContenedorMestroProductosViewModel();
				}
				
				setTheContenedorDetalleProductosViewmodel(contenedorDetalleProductosViewmodel);
				setTheContenedorMestroProductosViewModel(contenedorMestroProductosViewModel);
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void agregarListaP() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductoComprarViewModel buscarProductoNombre(final String nombre) {
			
			return	getUI().buscarProductoNombre(nombre);
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void buscarProducto() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eliminarProducto() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void actualizarProducto() {
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
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUI((UI)otherEnd, msgs);
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL:
				if (theContenedorDetalleProductosViewmodel != null)
					msgs = ((InternalEObject)theContenedorDetalleProductosViewmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL, null, msgs);
				return basicSetTheContenedorDetalleProductosViewmodel((ContenedorDetalleProductosViewmodel)otherEnd, msgs);
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				if (theContenedorMestroProductosViewModel != null)
					msgs = ((InternalEObject)theContenedorMestroProductosViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorMestroProductosViewModel((ContenedorMestroProductosViewModel)otherEnd, msgs);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI:
				return basicSetUI(null, msgs);
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL:
				return basicSetTheContenedorDetalleProductosViewmodel(null, msgs);
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				return basicSetTheContenedorMestroProductosViewModel(null, msgs);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL, UI.class, msgs);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI:
				return getUI();
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL:
				return getTheContenedorDetalleProductosViewmodel();
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				return getTheContenedorMestroProductosViewModel();
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
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI:
				setUI((UI)newValue);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL:
				setTheContenedorDetalleProductosViewmodel((ContenedorDetalleProductosViewmodel)newValue);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				setTheContenedorMestroProductosViewModel((ContenedorMestroProductosViewModel)newValue);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI:
				setUI((UI)null);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL:
				setTheContenedorDetalleProductosViewmodel((ContenedorDetalleProductosViewmodel)null);
				return;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				setTheContenedorMestroProductosViewModel((ContenedorMestroProductosViewModel)null);
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
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__UI:
				return getUI() != null;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL:
				return theContenedorDetalleProductosViewmodel != null;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL__THE_CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL:
				return theContenedorMestroProductosViewModel != null;
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
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___CREAR_PRODUCTO:
				crearProducto();
				return null;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___CREAR:
				crear();
				return null;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___ENLAZAR:
				enlazar();
				return null;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___BUSCAR_PRODUCTO_ID__STRING:
				buscarProductoId((String)arguments.get(0));
				return null;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___IMPLEMENTAR_MODELO:
				implementarModelo();
				return null;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___AGREGAR_LISTA_P:
				agregarListaP();
				return null;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___BUSCAR_PRODUCTO_NOMBRE__STRING:
				return buscarProductoNombre((String)arguments.get(0));
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___BUSCAR_PRODUCTO:
				buscarProducto();
				return null;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___ELIMINAR_PRODUCTO:
				eliminarProducto();
				return null;
			case ContenedorcrudproductosPackage.CONTENEDOR_CRUD_PRODUCTOS_VIEW_MODEL___ACTUALIZAR_PRODUCTO:
				actualizarProducto();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContenedorCRUDProductosViewModelImpl
