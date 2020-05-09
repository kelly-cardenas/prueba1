/**
 */
package tiendacristal.ui.contenedorcrudpedido;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;

import tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Detalle Pedido View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getIdCliente <em>Id Cliente</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getFechaPedido <em>Fecha Pedido</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getContenedorCRUDPedidoViewModel <em>Contenedor CRUD Pedido View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getTheContenedorMestroProductosViewModel <em>The Contenedor Mestro Productos View Model</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorDetallePedidoViewModel()
 * @model
 * @generated
 */
public interface ContenedorDetallePedidoViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Cliente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Cliente</em>' attribute.
	 * @see #setIdCliente(String)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorDetallePedidoViewModel_IdCliente()
	 * @model
	 * @generated
	 */
	String getIdCliente();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getIdCliente <em>Id Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Cliente</em>' attribute.
	 * @see #getIdCliente()
	 * @generated
	 */
	void setIdCliente(String value);

	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(String)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorDetallePedidoViewModel_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Pedido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Pedido</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Pedido</em>' attribute.
	 * @see #setFechaPedido(String)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorDetallePedidoViewModel_FechaPedido()
	 * @model
	 * @generated
	 */
	String getFechaPedido();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getFechaPedido <em>Fecha Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Pedido</em>' attribute.
	 * @see #getFechaPedido()
	 * @generated
	 */
	void setFechaPedido(String value);

	/**
	 * Returns the value of the '<em><b>Contenedor CRUD Pedido View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getTheContenedorDetallePedidoViewModel <em>The Contenedor Detalle Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor CRUD Pedido View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor CRUD Pedido View Model</em>' container reference.
	 * @see #setContenedorCRUDPedidoViewModel(ContenedorCRUDPedidoViewModel)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorDetallePedidoViewModel_ContenedorCRUDPedidoViewModel()
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getTheContenedorDetallePedidoViewModel
	 * @model opposite="theContenedorDetallePedidoViewModel"
	 * @generated
	 */
	ContenedorCRUDPedidoViewModel getContenedorCRUDPedidoViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getContenedorCRUDPedidoViewModel <em>Contenedor CRUD Pedido View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenedor CRUD Pedido View Model</em>' container reference.
	 * @see #getContenedorCRUDPedidoViewModel()
	 * @generated
	 */
	void setContenedorCRUDPedidoViewModel(ContenedorCRUDPedidoViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Maestro Cliente View Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getContenedorDetallePedidoViewModel <em>Contenedor Detalle Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Maestro Cliente View Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Maestro Cliente View Model</em>' reference.
	 * @see #setTheContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorDetallePedidoViewModel_TheContenedorMaestroClienteViewModel()
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getContenedorDetallePedidoViewModel
	 * @model opposite="ContenedorDetallePedidoViewModel" required="true"
	 * @generated
	 */
	ContenedorMaestroClienteViewModel getTheContenedorMaestroClienteViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Maestro Cliente View Model</em>' reference.
	 * @see #getTheContenedorMaestroClienteViewModel()
	 * @generated
	 */
	void setTheContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Mestro Productos View Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorDetallePedidoViewModel <em>Contenedor Detalle Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Mestro Productos View Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Mestro Productos View Model</em>' reference.
	 * @see #setTheContenedorMestroProductosViewModel(ContenedorMestroProductosViewModel)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getContenedorDetallePedidoViewModel_TheContenedorMestroProductosViewModel()
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorDetallePedidoViewModel
	 * @model opposite="ContenedorDetallePedidoViewModel" required="true"
	 * @generated
	 */
	ContenedorMestroProductosViewModel getTheContenedorMestroProductosViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel#getTheContenedorMestroProductosViewModel <em>The Contenedor Mestro Productos View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Mestro Productos View Model</em>' reference.
	 * @see #getTheContenedorMestroProductosViewModel()
	 * @generated
	 */
	void setTheContenedorMestroProductosViewModel(ContenedorMestroProductosViewModel value);

} // ContenedorDetallePedidoViewModel
