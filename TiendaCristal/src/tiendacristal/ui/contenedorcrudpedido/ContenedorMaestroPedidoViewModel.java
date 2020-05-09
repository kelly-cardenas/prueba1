/**
 */
package tiendacristal.ui.contenedorcrudpedido;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Maestro Pedido View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getContenedorDetalleCompraViewModel <em>Contenedor Detalle Compra View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getContenedorCRUDPedidoViewModel <em>Contenedor CRUD Pedido View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getListaProductoComprarViewModel <em>Lista Producto Comprar View Model</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorMaestroPedidoViewModel()
 * @model
 * @generated
 */
public interface ContenedorMaestroPedidoViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Contenedor Detalle Compra View Model</b></em>' reference list.
	 * The list contents are of type {@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTheContenedorMaestroPedidoViewModel <em>The Contenedor Maestro Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor Detalle Compra View Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor Detalle Compra View Model</em>' reference list.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorMaestroPedidoViewModel_ContenedorDetalleCompraViewModel()
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTheContenedorMaestroPedidoViewModel
	 * @model opposite="theContenedorMaestroPedidoViewModel"
	 * @generated
	 */
	EList<ContenedorDetalleCompraViewModel> getContenedorDetalleCompraViewModel();

	/**
	 * Returns the value of the '<em><b>Contenedor CRUD Pedido View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getTheContenedorMaestroPedidoViewModel <em>The Contenedor Maestro Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor CRUD Pedido View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor CRUD Pedido View Model</em>' container reference.
	 * @see #setContenedorCRUDPedidoViewModel(ContenedorCRUDPedidoViewModel)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorMaestroPedidoViewModel_ContenedorCRUDPedidoViewModel()
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getTheContenedorMaestroPedidoViewModel
	 * @model opposite="theContenedorMaestroPedidoViewModel"
	 * @generated
	 */
	ContenedorCRUDPedidoViewModel getContenedorCRUDPedidoViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getContenedorCRUDPedidoViewModel <em>Contenedor CRUD Pedido View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenedor CRUD Pedido View Model</em>' container reference.
	 * @see #getContenedorCRUDPedidoViewModel()
	 * @generated
	 */
	void setContenedorCRUDPedidoViewModel(ContenedorCRUDPedidoViewModel value);

	/**
	 * Returns the value of the '<em><b>Lista Producto Comprar View Model</b></em>' containment reference list.
	 * The list contents are of type {@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getContenedorMaestroPedidoViewModel <em>Contenedor Maestro Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Producto Comprar View Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Producto Comprar View Model</em>' containment reference list.
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorMaestroPedidoViewModel_ListaProductoComprarViewModel()
	 * @see tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getContenedorMaestroPedidoViewModel
	 * @model opposite="ContenedorMaestroPedidoViewModel" containment="true"
	 * @generated
	 */
	EList<ProductoComprarViewModel> getListaProductoComprarViewModel();

} // ContenedorMaestroPedidoViewModel
