/**
 */
package tiendacristal.ui.contenedorcrudproductos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Mestro Productos View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorCRUDProductosViewModel <em>Contenedor CRUD Productos View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getTheProductosViewModel <em>The Productos View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getTheProductoViewModelSeleccionado <em>The Producto View Model Seleccionado</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorDetalleCompraViewModel <em>Contenedor Detalle Compra View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorDetallePedidoViewModel <em>Contenedor Detalle Pedido View Model</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage#getContenedorMestroProductosViewModel()
 * @model
 * @generated
 */
public interface ContenedorMestroProductosViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Contenedor CRUD Productos View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getTheContenedorMestroProductosViewModel <em>The Contenedor Mestro Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor CRUD Productos View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor CRUD Productos View Model</em>' container reference.
	 * @see #setContenedorCRUDProductosViewModel(ContenedorCRUDProductosViewModel)
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage#getContenedorMestroProductosViewModel_ContenedorCRUDProductosViewModel()
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getTheContenedorMestroProductosViewModel
	 * @model opposite="theContenedorMestroProductosViewModel"
	 * @generated
	 */
	ContenedorCRUDProductosViewModel getContenedorCRUDProductosViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorCRUDProductosViewModel <em>Contenedor CRUD Productos View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenedor CRUD Productos View Model</em>' container reference.
	 * @see #getContenedorCRUDProductosViewModel()
	 * @generated
	 */
	void setContenedorCRUDProductosViewModel(ContenedorCRUDProductosViewModel value);

	/**
	 * Returns the value of the '<em><b>The Productos View Model</b></em>' containment reference list.
	 * The list contents are of type {@link tiendacristal.ui.contenedorcrudproductos.ProductosViewModel}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudproductos.ProductosViewModel#getOwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Productos View Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Productos View Model</em>' containment reference list.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage#getContenedorMestroProductosViewModel_TheProductosViewModel()
	 * @see tiendacristal.ui.contenedorcrudproductos.ProductosViewModel#getOwnedBy
	 * @model opposite="ownedBy" containment="true"
	 * @generated
	 */
	EList<ProductosViewModel> getTheProductosViewModel();

	/**
	 * Returns the value of the '<em><b>The Producto View Model Seleccionado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Producto View Model Seleccionado</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Producto View Model Seleccionado</em>' reference.
	 * @see #setTheProductoViewModelSeleccionado(ProductosViewModel)
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage#getContenedorMestroProductosViewModel_TheProductoViewModelSeleccionado()
	 * @model required="true"
	 * @generated
	 */
	ProductosViewModel getTheProductoViewModelSeleccionado();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getTheProductoViewModelSeleccionado <em>The Producto View Model Seleccionado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Producto View Model Seleccionado</em>' reference.
	 * @see #getTheProductoViewModelSeleccionado()
	 * @generated
	 */
	void setTheProductoViewModelSeleccionado(ProductosViewModel value);

	/**
	 * Returns the value of the '<em><b>Contenedor Detalle Compra View Model</b></em>' reference list.
	 * The list contents are of type {@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTheContenedorMestroProductosViewModel <em>The Contenedor Mestro Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor Detalle Compra View Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor Detalle Compra View Model</em>' reference list.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage#getContenedorMestroProductosViewModel_ContenedorDetalleCompraViewModel()
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel#getTheContenedorMestroProductosViewModel
	 * @model opposite="theContenedorMestroProductosViewModel"
	 * @generated
	 */
	EList<ContenedorDetalleCompraViewModel> getContenedorDetalleCompraViewModel();

	/**
	 * Returns the value of the '<em><b>Contenedor Detalle Pedido View Model</b></em>' reference list.
	 * The list contents are of type {@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getTheContenedorMestroProductosViewModel <em>The Contenedor Mestro Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor Detalle Pedido View Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor Detalle Pedido View Model</em>' reference list.
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage#getContenedorMestroProductosViewModel_ContenedorDetallePedidoViewModel()
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getTheContenedorMestroProductosViewModel
	 * @model opposite="theContenedorMestroProductosViewModel"
	 * @generated
	 */
	EList<ContenedorDetallePedidoViewModel> getContenedorDetallePedidoViewModel();

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
	void implementarModelo();

} // ContenedorMestroProductosViewModel
