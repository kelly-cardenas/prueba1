/**
 */
package tiendacristal.ui.contenedorcrudpedido;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producto Comprar View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getPrecio <em>Precio</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getContenedorMaestroPedidoViewModel <em>Contenedor Maestro Pedido View Model</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getProductoComprarViewModel()
 * @model
 * @generated
 */
public interface ProductoComprarViewModel extends EObject {
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
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getProductoComprarViewModel_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getProductoComprarViewModel_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precio</em>' attribute.
	 * @see #setPrecio(String)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getProductoComprarViewModel_Precio()
	 * @model
	 * @generated
	 */
	String getPrecio();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getPrecio <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precio</em>' attribute.
	 * @see #getPrecio()
	 * @generated
	 */
	void setPrecio(String value);

	/**
	 * Returns the value of the '<em><b>Categoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categoria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categoria</em>' attribute.
	 * @see #setCategoria(String)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getProductoComprarViewModel_Categoria()
	 * @model
	 * @generated
	 */
	String getCategoria();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getCategoria <em>Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categoria</em>' attribute.
	 * @see #getCategoria()
	 * @generated
	 */
	void setCategoria(String value);

	/**
	 * Returns the value of the '<em><b>Contenedor Maestro Pedido View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getListaProductoComprarViewModel <em>Lista Producto Comprar View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor Maestro Pedido View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor Maestro Pedido View Model</em>' container reference.
	 * @see #setContenedorMaestroPedidoViewModel(ContenedorMaestroPedidoViewModel)
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage#getProductoComprarViewModel_ContenedorMaestroPedidoViewModel()
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel#getListaProductoComprarViewModel
	 * @model opposite="listaProductoComprarViewModel"
	 * @generated
	 */
	ContenedorMaestroPedidoViewModel getContenedorMaestroPedidoViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel#getContenedorMaestroPedidoViewModel <em>Contenedor Maestro Pedido View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenedor Maestro Pedido View Model</em>' container reference.
	 * @see #getContenedorMaestroPedidoViewModel()
	 * @generated
	 */
	void setContenedorMaestroPedidoViewModel(ContenedorMaestroPedidoViewModel value);

} // ProductoComprarViewModel
