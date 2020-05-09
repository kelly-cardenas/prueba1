/**
 */
package tiendacristal.ui.contenedorcrudpedido;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ui.UI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor CRUD Pedido View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getUI <em>UI</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getTheContenedorDetallePedidoViewModel <em>The Contenedor Detalle Pedido View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getTheContenedorMaestroPedidoViewModel <em>The Contenedor Maestro Pedido View Model</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorCRUDPedidoViewModel()
 * @model
 * @generated
 */
public interface ContenedorCRUDPedidoViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.UI#getTheContenedorCRUDPedidoViewModel <em>The Contenedor CRUD Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI</em>' container reference.
	 * @see #setUI(UI)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorCRUDPedidoViewModel_UI()
	 * @see tiendacristal.ui.UI#getTheContenedorCRUDPedidoViewModel
	 * @model opposite="theContenedorCRUDPedidoViewModel"
	 * @generated
	 */
	UI getUI();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getUI <em>UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UI</em>' container reference.
	 * @see #getUI()
	 * @generated
	 */
	void setUI(UI value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Detalle Pedido View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getContenedorCRUDPedidoViewModel <em>Contenedor CRUD Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Detalle Pedido View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Detalle Pedido View Model</em>' containment reference.
	 * @see #setTheContenedorDetallePedidoViewModel(ContenedorDetallePedidoViewModel)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorCRUDPedidoViewModel_TheContenedorDetallePedidoViewModel()
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getContenedorCRUDPedidoViewModel
	 * @model opposite="ContenedorCRUDPedidoViewModel" containment="true" required="true"
	 * @generated
	 */
	ContenedorDetallePedidoViewModel getTheContenedorDetallePedidoViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getTheContenedorDetallePedidoViewModel <em>The Contenedor Detalle Pedido View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Detalle Pedido View Model</em>' containment reference.
	 * @see #getTheContenedorDetallePedidoViewModel()
	 * @generated
	 */
	void setTheContenedorDetallePedidoViewModel(ContenedorDetallePedidoViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Maestro Pedido View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getContenedorCRUDPedidoViewModel <em>Contenedor CRUD Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Maestro Pedido View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Maestro Pedido View Model</em>' containment reference.
	 * @see #setTheContenedorMaestroPedidoViewModel(ContenedorMaestroPedidoViewModel)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorCRUDPedidoViewModel_TheContenedorMaestroPedidoViewModel()
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getContenedorCRUDPedidoViewModel
	 * @model opposite="ContenedorCRUDPedidoViewModel" containment="true" required="true"
	 * @generated
	 */
	ContenedorMaestroPedidoViewModel getTheContenedorMaestroPedidoViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getTheContenedorMaestroPedidoViewModel <em>The Contenedor Maestro Pedido View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Maestro Pedido View Model</em>' containment reference.
	 * @see #getTheContenedorMaestroPedidoViewModel()
	 * @generated
	 */
	void setTheContenedorMaestroPedidoViewModel(ContenedorMaestroPedidoViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tContenedorDetallePedidoViewModel contenedorDetallePedidoViewModel = getTheContenedorDetallePedidoViewModel();\r\n\t\tContenedorMaestroPedidoViewModel contenedorMaestroPedidoViewModel = getTheContenedorMaestroPedidoViewModel();\r\n\t\t\r\n\t\tif (contenedorDetallePedidoViewModel == null) {\r\n\t\t\t\r\n\t\t\tcontenedorDetallePedidoViewModel = tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoFactory.eINSTANCE.createContenedorDetallePedidoViewModel();\r\n\t\t\t\r\n\t\t\t\t\t\r\n\t\t}\r\n\t\t\r\n\t\tif (contenedorMaestroPedidoViewModel == null) {\r\n\t\t\t\r\n\t\t\tcontenedorMaestroPedidoViewModel = tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoFactory.eINSTANCE.createContenedorMaestroPedidoViewModel();\r\n\t\t\t\r\n\t\t}\r\n\t\t\r\n\t\tsetTheContenedorDetallePedidoViewModel(contenedorDetallePedidoViewModel);\r\n\t\tsetTheContenedorMaestroPedidoViewModel(contenedorMaestroPedidoViewModel);'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\tgetUI().crearPedido(this);\r\n\r\n\t'"
	 * @generated
	 */
	void crearPedido();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void crear();

} // ContenedorCRUDPedidoViewModel
