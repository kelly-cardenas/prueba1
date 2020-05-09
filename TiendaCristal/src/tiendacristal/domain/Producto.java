/**
 */
package tiendacristal.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.Producto#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.domain.Producto#getPrecio <em>Precio</em>}</li>
 *   <li>{@link tiendacristal.domain.Producto#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link tiendacristal.domain.Producto#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tiendacristal.domain.Producto#getDomain <em>Domain</em>}</li>
 *   <li>{@link tiendacristal.domain.Producto#getThePedido <em>The Pedido</em>}</li>
 * </ul>
 *
 * @see tiendacristal.domain.DomainPackage#getProducto()
 * @model
 * @generated
 */
public interface Producto extends EObject {
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
	 * @see tiendacristal.domain.DomainPackage#getProducto_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Producto#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

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
	 * @see tiendacristal.domain.DomainPackage#getProducto_Precio()
	 * @model
	 * @generated
	 */
	String getPrecio();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Producto#getPrecio <em>Precio</em>}' attribute.
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
	 * @see tiendacristal.domain.DomainPackage#getProducto_Categoria()
	 * @model
	 * @generated
	 */
	String getCategoria();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Producto#getCategoria <em>Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categoria</em>' attribute.
	 * @see #getCategoria()
	 * @generated
	 */
	void setCategoria(String value);

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
	 * @see tiendacristal.domain.DomainPackage#getProducto_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Producto#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Domain#getListaProductos <em>Lista Productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see tiendacristal.domain.DomainPackage#getProducto_Domain()
	 * @see tiendacristal.domain.Domain#getListaProductos
	 * @model opposite="listaProductos"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Producto#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>The Pedido</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Pedido#getListaProductos <em>Lista Productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Pedido</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Pedido</em>' reference.
	 * @see #setThePedido(Pedido)
	 * @see tiendacristal.domain.DomainPackage#getProducto_ThePedido()
	 * @see tiendacristal.domain.Pedido#getListaProductos
	 * @model opposite="listaProductos" required="true"
	 * @generated
	 */
	Pedido getThePedido();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Producto#getThePedido <em>The Pedido</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Pedido</em>' reference.
	 * @see #getThePedido()
	 * @generated
	 */
	void setThePedido(Pedido value);

} // Producto
