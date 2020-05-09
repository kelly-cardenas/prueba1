/**
 */
package tiendacristal.ui.contenedorcrudrealizarcompra;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ui.UI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor CRUD Compra View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getUI <em>UI</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getTheContenedorDetalleCompraViewModel <em>The Contenedor Detalle Compra View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getTheContenedorMaestroCompraViewModel <em>The Contenedor Maestro Compra View Model</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage#getContenedorCRUDCompraViewModel()
 * @model
 * @generated
 */
public interface ContenedorCRUDCompraViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.UI#getTheContenedorCRUDRealizarCompraViewModel <em>The Contenedor CRUD Realizar Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI</em>' container reference.
	 * @see #setUI(UI)
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage#getContenedorCRUDCompraViewModel_UI()
	 * @see tiendacristal.ui.UI#getTheContenedorCRUDRealizarCompraViewModel
	 * @model opposite="theContenedorCRUDRealizarCompraViewModel"
	 * @generated
	 */
	UI getUI();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getUI <em>UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UI</em>' container reference.
	 * @see #getUI()
	 * @generated
	 */
	void setUI(UI value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Detalle Compra View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getContenedorCRUDCompraViewModel <em>Contenedor CRUD Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Detalle Compra View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Detalle Compra View Model</em>' containment reference.
	 * @see #setTheContenedorDetalleCompraViewModel(ContenedorDetalleCompraViewModel)
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage#getContenedorCRUDCompraViewModel_TheContenedorDetalleCompraViewModel()
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getContenedorCRUDCompraViewModel
	 * @model opposite="ContenedorCRUDCompraViewModel" containment="true" required="true"
	 * @generated
	 */
	ContenedorDetalleCompraViewModel getTheContenedorDetalleCompraViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getTheContenedorDetalleCompraViewModel <em>The Contenedor Detalle Compra View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Detalle Compra View Model</em>' containment reference.
	 * @see #getTheContenedorDetalleCompraViewModel()
	 * @generated
	 */
	void setTheContenedorDetalleCompraViewModel(ContenedorDetalleCompraViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Maestro Compra View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel#getContenedorCRUDCompraViewModel <em>Contenedor CRUD Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Maestro Compra View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Maestro Compra View Model</em>' containment reference.
	 * @see #setTheContenedorMaestroCompraViewModel(ContenedorMaestroCompraViewModel)
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage#getContenedorCRUDCompraViewModel_TheContenedorMaestroCompraViewModel()
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel#getContenedorCRUDCompraViewModel
	 * @model opposite="ContenedorCRUDCompraViewModel" containment="true" required="true"
	 * @generated
	 */
	ContenedorMaestroCompraViewModel getTheContenedorMaestroCompraViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getTheContenedorMaestroCompraViewModel <em>The Contenedor Maestro Compra View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Maestro Compra View Model</em>' containment reference.
	 * @see #getTheContenedorMaestroCompraViewModel()
	 * @generated
	 */
	void setTheContenedorMaestroCompraViewModel(ContenedorMaestroCompraViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\t\tContenedorDetalleCompraViewModel contenedorDetalleCompraViewModel = getTheContenedorDetalleCompraViewModel();\r\n\t\t\t\tContenedorMaestroCompraViewModel contenedorMaestroCompraViewModel = getTheContenedorMaestroCompraViewModel();\r\n\t\t\r\n\t\t\t\tif (contenedorDetalleCompraViewModel == null) {\r\n\t\t\r\n\t\t\t\t\tcontenedorDetalleCompraViewModel = tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraFactory.eINSTANCE\r\n\t\t\t\t\t\t\t.createContenedorDetalleCompraViewModel();\r\n\t\t\r\n\t\t\t\t}\r\n\t\t\r\n\t\t\t\tsetTheContenedorDetalleCompraViewModel(contenedorDetalleCompraViewModel);\r\n\t\t\r\n\t\t\t\tif (contenedorMaestroCompraViewModel == null) {\r\n\t\t\r\n\t\t\t\t\tcontenedorMaestroCompraViewModel = tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraFactory.eINSTANCE\r\n\t\t\t\t\t\t\t.createContenedorMaestroCompraViewModel();\r\n\t\t\r\n\t\t\t\t}\r\n\t\t\r\n\t\t\t\tsetTheContenedorMaestroCompraViewModel(contenedorMaestroCompraViewModel);\r\n\t\t\t\tsetTheContenedorDetalleCompraViewModel(contenedorDetalleCompraViewModel);\r\n\t\tsetTheContenedorDetalleCompraViewModel(contenedorDetalleCompraViewModel);\r\n\r\n\t\tif (contenedorMaestroCompraViewModel == null) {\r\n\r\n\t\t\tcontenedorMaestroCompraViewModel = tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorMaestroCompraViewModel();\r\n\r\n\t\t}\r\n\r\n\t\tsetTheContenedorMaestroCompraViewModel(contenedorMaestroCompraViewModel);'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\tgetUI().crearCompra(this);'"
	 * @generated
	 */
	void crearCompra();

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
	 * @model
	 * @generated
	 */
	void implementar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enlazar();

} // ContenedorCRUDCompraViewModel
