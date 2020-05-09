/**
 */
package tiendacristal.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tiendacristal.ModelFactory;
import tiendacristal.TiendacristalPackage;

import tiendacristal.domain.Domain;
import tiendacristal.domain.DomainPackage;

import tiendacristal.ui.UI;
import tiendacristal.ui.UiPackage;

import tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.impl.ModelFactoryImpl#getTheUI <em>The UI</em>}</li>
 *   <li>{@link tiendacristal.impl.ModelFactoryImpl#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryImpl extends MinimalEObjectImpl.Container implements ModelFactory {
	/**
	 * The cached value of the '{@link #getTheUI() <em>The UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUI()
	 * @generated
	 * @ordered
	 */
	protected UI theUI;

	/**
	 * The cached value of the '{@link #getTheDomain() <em>The Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain theDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TiendacristalPackage.Literals.MODEL_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getTheUI() {
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheUI(UI newTheUI, NotificationChain msgs) {
		UI oldTheUI = theUI;
		theUI = newTheUI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TiendacristalPackage.MODEL_FACTORY__THE_UI, oldTheUI, newTheUI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheUI(UI newTheUI) {
		if (newTheUI != theUI) {
			NotificationChain msgs = null;
			if (theUI != null)
				msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__OWNED_BY_MODEL_FACTORY, UI.class, msgs);
			if (newTheUI != null)
				msgs = ((InternalEObject)newTheUI).eInverseAdd(this, UiPackage.UI__OWNED_BY_MODEL_FACTORY, UI.class, msgs);
			msgs = basicSetTheUI(newTheUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TiendacristalPackage.MODEL_FACTORY__THE_UI, newTheUI, newTheUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		return theDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		Domain oldTheDomain = theDomain;
		theDomain = newTheDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TiendacristalPackage.MODEL_FACTORY__THE_DOMAIN, oldTheDomain, newTheDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != theDomain) {
			NotificationChain msgs = null;
			if (theDomain != null)
				msgs = ((InternalEObject)theDomain).eInverseRemove(this, DomainPackage.DOMAIN__OWNED_BY_MODEL_FACTORY, Domain.class, msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__OWNED_BY_MODEL_FACTORY, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TiendacristalPackage.MODEL_FACTORY__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory implementarModelo() {
						Domain domain = getTheDomain();
						UI ui = getTheUI();
				
						if (domain == null) {
				
							domain = tiendacristal.domain.DomainFactory.eINSTANCE.createDomain();
				
						}
				
						if (ui == null) {
				
							ui = tiendacristal.ui.UiFactory.eINSTANCE.createUI();
						}
				
						setTheDomain(domain);
						setTheUI(ui);
				
						ui.setTheDomainAsociado(domain);
						domain.setTheUIAsociado(ui);
				
						domain.implementarModelo();
				
						ui.implementarModelo();
				
						return this;
				
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void guardar() {
		
		
				ModelFactory modelFactory = this;
		
				// EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
				// 1. SE GUARDA EN LA INSTACIA DE ECLIPSE DONDE SE VE LA PRODUCCION.
		
				org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
						.createURI("platform:/resource/Test/Persistencia/model.tiendaCristal");
		
				// 2. SE INDICA LA RUTA POR MEDIO DEL DIRECTORIO DE ARCHIVOS DE WIMDOWS
				// org.eclipse.emf.common.util.URI uri =
				// org.eclipse.emf.common.util.URI.createURI(
				// "file:/E:/varios/td/whoownme/whoownme/whoownme.model/resource/model.whoownme");
		
				org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		
				org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
				resource.getContents().add(modelFactory);
		
				try {
		
					resource.save(java.util.Collections.EMPTY_MAP);
		
				} catch (java.io.IOException e) {
		
					// TO-DO Auto-generated catch block
					e.printStackTrace();
				}
		
				return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory cargar() {
		
		
				ModelFactory modelFactory = null;
		
				TiendacristalPackage whoownmePackage = TiendacristalPackage.eINSTANCE;
				org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		
				// EXISTEN 3 FORMAS DE CARGAR EL RECURSO
				// 1. CON LA SIGUIENTE RUTA (platform:/resource) SE CARGAR EL RECURSO CUANDO SE
				// HACE UNA NUEVA INSTANCIA DE ECLIPSE, EN DONDE SE CREA UN PROYECTO(test)
				// QUE CONTIENE LAS PRODUCCIONES, DONDE SE ESPECIFICA QUE RECURSO CARGAR
		
				org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
						.createURI("platform:/resource/Test/Persistencia/model.tiendaCristal");
		
				// 2.CON LA SIGUIENTE RUTA (platform:/plugin/) SE CARGAR EL RECURSO DE ALGUNOS
				// DE LOS PLUGINS(whoownme.model) EN LOS QUE SE ESTA TRABJANDO EN EL WORKSPACE
				// org.eclipse.emf.common.util.URI uri =
				// org.eclipse.emf.common.util.URI.createURI("platform:/plugin/whoownme.model/resource/model.whoownme");
				// 3. CON LA SIGUIENTE RUTA (file:\\E:\\) SE CARGA EL RECURSO INDICANDO UNA RUTA
				// DESDE EL DIRECTORIO DE ARCHIVOS DE WIMDOWS
				// org.eclipse.emf.common.util.URI uri =
				// org.eclipse.emf.common.util.URI.createURI("file:\\E:\\varios\\td\\whoownme\\whoownme\\whoownme.model\\resource\\model.whoownme");
		
				org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		
				try {
		
					resource.load(null);
					modelFactory = (ModelFactory) resource.getContents().get(0);
					System.out.println("loaded: " + modelFactory);
		
				}
		
				catch (java.io.IOException e) {
		
					System.out.println("failed to read " + uri);
					System.out.println(e);
		
				}
		
				return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDClienteViewModel obtenerContenedorCRUDCliente() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI obtenerUI() {
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
			case TiendacristalPackage.MODEL_FACTORY__THE_UI:
				if (theUI != null)
					msgs = ((InternalEObject)theUI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TiendacristalPackage.MODEL_FACTORY__THE_UI, null, msgs);
				return basicSetTheUI((UI)otherEnd, msgs);
			case TiendacristalPackage.MODEL_FACTORY__THE_DOMAIN:
				if (theDomain != null)
					msgs = ((InternalEObject)theDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TiendacristalPackage.MODEL_FACTORY__THE_DOMAIN, null, msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
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
			case TiendacristalPackage.MODEL_FACTORY__THE_UI:
				return basicSetTheUI(null, msgs);
			case TiendacristalPackage.MODEL_FACTORY__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TiendacristalPackage.MODEL_FACTORY__THE_UI:
				return getTheUI();
			case TiendacristalPackage.MODEL_FACTORY__THE_DOMAIN:
				return getTheDomain();
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
			case TiendacristalPackage.MODEL_FACTORY__THE_UI:
				setTheUI((UI)newValue);
				return;
			case TiendacristalPackage.MODEL_FACTORY__THE_DOMAIN:
				setTheDomain((Domain)newValue);
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
			case TiendacristalPackage.MODEL_FACTORY__THE_UI:
				setTheUI((UI)null);
				return;
			case TiendacristalPackage.MODEL_FACTORY__THE_DOMAIN:
				setTheDomain((Domain)null);
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
			case TiendacristalPackage.MODEL_FACTORY__THE_UI:
				return theUI != null;
			case TiendacristalPackage.MODEL_FACTORY__THE_DOMAIN:
				return theDomain != null;
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
			case TiendacristalPackage.MODEL_FACTORY___IMPLEMENTAR_MODELO:
				return implementarModelo();
			case TiendacristalPackage.MODEL_FACTORY___GUARDAR:
				guardar();
				return null;
			case TiendacristalPackage.MODEL_FACTORY___CARGAR:
				return cargar();
			case TiendacristalPackage.MODEL_FACTORY___OBTENER_CONTENEDOR_CRUD_CLIENTE:
				return obtenerContenedorCRUDCliente();
			case TiendacristalPackage.MODEL_FACTORY___OBTENER_UI:
				return obtenerUI();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ModelFactoryImpl
