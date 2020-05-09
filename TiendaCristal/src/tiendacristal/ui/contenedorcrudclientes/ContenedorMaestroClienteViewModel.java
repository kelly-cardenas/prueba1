/**
 */
package tiendacristal.ui.contenedorcrudclientes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Maestro Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getOwnedBy <em>Owned By</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getTheClienteViewModel <em>The Cliente View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getTheClienteViewModelSeleccionada <em>The Cliente View Model Seleccionada</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getContenedorDetalleCompraViewModel <em>Contenedor Detalle Compra View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getContenedorDetallePedidoViewModel <em>Contenedor Detalle Pedido View Model</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorMaestroClienteViewModel()
 * @model
 * @generated
 */
public interface ContenedorMaestroClienteViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By</em>' container reference.
	 * @see #setOwnedBy(ContenedorCRUDClienteViewModel)
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorMaestroClienteViewModel_OwnedBy()
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getTheContenedorMaestroClienteViewModel
	 * @model opposite="theContenedorMaestroClienteViewModel"
	 * @generated
	 */
	ContenedorCRUDClienteViewModel getOwnedBy();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getOwnedBy <em>Owned By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By</em>' container reference.
	 * @see #getOwnedBy()
	 * @generated
	 */
	void setOwnedBy(ContenedorCRUDClienteViewModel value);

	/**
	 * Returns the value of the '<em><b>The Cliente View Model</b></em>' containment reference list.
	 * The list contents are of type {@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getOwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Cliente View Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Cliente View Model</em>' containment reference list.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorMaestroClienteViewModel_TheClienteViewModel()
	 * @see tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getOwnedBy
	 * @model opposite="ownedBy" containment="true"
	 * @generated
	 */
	EList<ClienteViewModel> getTheClienteViewModel();

	/**
	 * Returns the value of the '<em><b>The Cliente View Model Seleccionada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Cliente View Model Seleccionada</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Cliente View Model Seleccionada</em>' reference.
	 * @see #setTheClienteViewModelSeleccionada(ClienteViewModel)
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorMaestroClienteViewModel_TheClienteViewModelSeleccionada()
	 * @model required="true"
	 * @generated
	 */
	ClienteViewModel getTheClienteViewModelSeleccionada();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getTheClienteViewModelSeleccionada <em>The Cliente View Model Seleccionada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Cliente View Model Seleccionada</em>' reference.
	 * @see #getTheClienteViewModelSeleccionada()
	 * @generated
	 */
	void setTheClienteViewModelSeleccionada(ClienteViewModel value);

	/**
	 * Returns the value of the '<em><b>Contenedor Detalle Compra View Model</b></em>' reference list.
	 * The list contents are of type {@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor Detalle Compra View Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor Detalle Compra View Model</em>' reference list.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorMaestroClienteViewModel_ContenedorDetalleCompraViewModel()
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTheContenedorMaestroClienteViewModel
	 * @model opposite="theContenedorMaestroClienteViewModel"
	 * @generated
	 */
	EList<ContenedorDetalleCompraViewModel> getContenedorDetalleCompraViewModel();

	/**
	 * Returns the value of the '<em><b>Contenedor Detalle Pedido View Model</b></em>' reference list.
	 * The list contents are of type {@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor Detalle Pedido View Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor Detalle Pedido View Model</em>' reference list.
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorMaestroClienteViewModel_ContenedorDetallePedidoViewModel()
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getTheContenedorMaestroClienteViewModel
	 * @model opposite="theContenedorMaestroClienteViewModel"
	 * @generated
	 */
	EList<ContenedorDetallePedidoViewModel> getContenedorDetallePedidoViewModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void implementarModelo();

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\t\t\t\r\n\t\t\tgetOwnedBy().getUI().updateContenedorListadoClientes(this);\r\n\t\t\t\t\r\n'"
	 * @generated
	 */
	void update();

} // ContenedorMaestroClienteViewModel
