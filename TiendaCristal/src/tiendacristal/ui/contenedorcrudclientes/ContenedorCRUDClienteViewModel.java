/**
 */
package tiendacristal.ui.contenedorcrudclientes;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ui.UI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor CRUD Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getUI <em>UI</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getTheContenedorDetalleClienteViewModel <em>The Contenedor Detalle Cliente View Model</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorCRUDClienteViewModel()
 * @model
 * @generated
 */
public interface ContenedorCRUDClienteViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.UI#getTheContenedorCRUDClienteViewModel <em>The Contenedor CRUD Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI</em>' container reference.
	 * @see #setUI(UI)
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorCRUDClienteViewModel_UI()
	 * @see tiendacristal.ui.UI#getTheContenedorCRUDClienteViewModel
	 * @model opposite="theContenedorCRUDClienteViewModel"
	 * @generated
	 */
	UI getUI();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getUI <em>UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UI</em>' container reference.
	 * @see #getUI()
	 * @generated
	 */
	void setUI(UI value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Maestro Cliente View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getOwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Maestro Cliente View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Maestro Cliente View Model</em>' containment reference.
	 * @see #setTheContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel)
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorCRUDClienteViewModel_TheContenedorMaestroClienteViewModel()
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getOwnedBy
	 * @model opposite="ownedBy" containment="true" required="true"
	 * @generated
	 */
	ContenedorMaestroClienteViewModel getTheContenedorMaestroClienteViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Maestro Cliente View Model</em>' containment reference.
	 * @see #getTheContenedorMaestroClienteViewModel()
	 * @generated
	 */
	void setTheContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Detalle Cliente View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getContenedorCRUDClienteViewModel <em>Contenedor CRUD Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Detalle Cliente View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Detalle Cliente View Model</em>' containment reference.
	 * @see #setTheContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel)
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorCRUDClienteViewModel_TheContenedorDetalleClienteViewModel()
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getContenedorCRUDClienteViewModel
	 * @model opposite="ContenedorCRUDClienteViewModel" containment="true" required="true"
	 * @generated
	 */
	ContenedorDetalleClienteViewModel getTheContenedorDetalleClienteViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getTheContenedorDetalleClienteViewModel <em>The Contenedor Detalle Cliente View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Detalle Cliente View Model</em>' containment reference.
	 * @see #getTheContenedorDetalleClienteViewModel()
	 * @generated
	 */
	void setTheContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void crear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tContenedorDetalleClienteViewModel contenedorDetalleClienteViewModel = getTheContenedorDetalleClienteViewModel();\r\n\t\tContenedorMaestroClienteViewModel contenedorMaestroClienteViewModel = getTheContenedorMaestroClienteViewModel();\r\n\t\t\r\n\t\tif (contenedorDetalleClienteViewModel == null) {\r\n\t\t\t\r\n\t\t\tcontenedorDetalleClienteViewModel = tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesFactory.eINSTANCE.createContenedorDetalleClienteViewModel();\r\n\t\t\t\r\n\t\t}\r\n\t\t\r\n\t\tif(contenedorMaestroClienteViewModel == null ) {\r\n\t\t\t\r\n\t\t\tcontenedorMaestroClienteViewModel = tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesFactory.eINSTANCE.createContenedorMaestroClienteViewModel();\r\n\t\t\t\r\n\t\t}\r\n\t\t\r\n\t\tsetTheContenedorDetalleClienteViewModel(contenedorDetalleClienteViewModel);\r\n\t\tsetTheContenedorMaestroClienteViewModel(contenedorMaestroClienteViewModel);'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enlazar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='getTheContenedorDetalleClienteViewModel().setNombre(\"\");\r\n\t\t\t\tgetTheContenedorDetalleClienteViewModel().setCodigo(\"\");\r\n\t\t\t\tgetTheContenedorDetalleClienteViewModel().setTipoCliente(\"\");\r\n\t\t\t\t\r\n\t\t\t\tgetTheContenedorMaestroClienteViewModel().update();'"
	 * @generated
	 */
	void update();

} // ContenedorCRUDClienteViewModel
