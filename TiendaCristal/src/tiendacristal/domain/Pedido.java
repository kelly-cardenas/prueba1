/**
 */
package tiendacristal.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pedido</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.Pedido#getIdCliente <em>Id Cliente</em>}</li>
 *   <li>{@link tiendacristal.domain.Pedido#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.domain.Pedido#getFechaPedido <em>Fecha Pedido</em>}</li>
 *   <li>{@link tiendacristal.domain.Pedido#getDomain <em>Domain</em>}</li>
 *   <li>{@link tiendacristal.domain.Pedido#getTheCompra <em>The Compra</em>}</li>
 *   <li>{@link tiendacristal.domain.Pedido#getTheCliente <em>The Cliente</em>}</li>
 *   <li>{@link tiendacristal.domain.Pedido#getListaProductos <em>Lista Productos</em>}</li>
 *   <li>{@link tiendacristal.domain.Pedido#getTheVendedor <em>The Vendedor</em>}</li>
 * </ul>
 *
 * @see tiendacristal.domain.DomainPackage#getPedido()
 * @model
 * @generated
 */
public interface Pedido extends EObject {
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
	 * @see tiendacristal.domain.DomainPackage#getPedido_IdCliente()
	 * @model
	 * @generated
	 */
	String getIdCliente();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Pedido#getIdCliente <em>Id Cliente</em>}' attribute.
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
	 * @see tiendacristal.domain.DomainPackage#getPedido_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Pedido#getCodigo <em>Codigo</em>}' attribute.
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
	 * @see tiendacristal.domain.DomainPackage#getPedido_FechaPedido()
	 * @model
	 * @generated
	 */
	String getFechaPedido();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Pedido#getFechaPedido <em>Fecha Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Pedido</em>' attribute.
	 * @see #getFechaPedido()
	 * @generated
	 */
	void setFechaPedido(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Domain#getListaPedidos <em>Lista Pedidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see tiendacristal.domain.DomainPackage#getPedido_Domain()
	 * @see tiendacristal.domain.Domain#getListaPedidos
	 * @model opposite="listaPedidos"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Pedido#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>The Compra</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Compra#getThePedido <em>The Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Compra</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Compra</em>' reference.
	 * @see #setTheCompra(Compra)
	 * @see tiendacristal.domain.DomainPackage#getPedido_TheCompra()
	 * @see tiendacristal.domain.Compra#getThePedido
	 * @model opposite="thePedido" required="true"
	 * @generated
	 */
	Compra getTheCompra();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Pedido#getTheCompra <em>The Compra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Compra</em>' reference.
	 * @see #getTheCompra()
	 * @generated
	 */
	void setTheCompra(Compra value);

	/**
	 * Returns the value of the '<em><b>The Cliente</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Cliente#getListaPedidos <em>Lista Pedidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Cliente</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Cliente</em>' reference.
	 * @see #setTheCliente(Cliente)
	 * @see tiendacristal.domain.DomainPackage#getPedido_TheCliente()
	 * @see tiendacristal.domain.Cliente#getListaPedidos
	 * @model opposite="listaPedidos" required="true"
	 * @generated
	 */
	Cliente getTheCliente();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Pedido#getTheCliente <em>The Cliente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Cliente</em>' reference.
	 * @see #getTheCliente()
	 * @generated
	 */
	void setTheCliente(Cliente value);

	/**
	 * Returns the value of the '<em><b>Lista Productos</b></em>' reference list.
	 * The list contents are of type {@link tiendacristal.domain.Producto}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Producto#getThePedido <em>The Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Productos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Productos</em>' reference list.
	 * @see tiendacristal.domain.DomainPackage#getPedido_ListaProductos()
	 * @see tiendacristal.domain.Producto#getThePedido
	 * @model opposite="thePedido"
	 * @generated
	 */
	EList<Producto> getListaProductos();

	/**
	 * Returns the value of the '<em><b>The Vendedor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Vendedor#getListaPedidos <em>Lista Pedidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Vendedor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Vendedor</em>' reference.
	 * @see #setTheVendedor(Vendedor)
	 * @see tiendacristal.domain.DomainPackage#getPedido_TheVendedor()
	 * @see tiendacristal.domain.Vendedor#getListaPedidos
	 * @model opposite="listaPedidos" required="true"
	 * @generated
	 */
	Vendedor getTheVendedor();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Pedido#getTheVendedor <em>The Vendedor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Vendedor</em>' reference.
	 * @see #getTheVendedor()
	 * @generated
	 */
	void setTheVendedor(Vendedor value);

} // Pedido
