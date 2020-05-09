/**
 */
package tiendacristal.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.Compra#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.domain.Compra#getIdCliente <em>Id Cliente</em>}</li>
 *   <li>{@link tiendacristal.domain.Compra#getCodigoP <em>Codigo P</em>}</li>
 *   <li>{@link tiendacristal.domain.Compra#getFecha <em>Fecha</em>}</li>
 *   <li>{@link tiendacristal.domain.Compra#getTotal <em>Total</em>}</li>
 *   <li>{@link tiendacristal.domain.Compra#getDomain <em>Domain</em>}</li>
 *   <li>{@link tiendacristal.domain.Compra#getTheReciboPago <em>The Recibo Pago</em>}</li>
 *   <li>{@link tiendacristal.domain.Compra#getThePedido <em>The Pedido</em>}</li>
 * </ul>
 *
 * @see tiendacristal.domain.DomainPackage#getCompra()
 * @model
 * @generated
 */
public interface Compra extends EObject {
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
	 * @see tiendacristal.domain.DomainPackage#getCompra_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Compra#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

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
	 * @see tiendacristal.domain.DomainPackage#getCompra_IdCliente()
	 * @model
	 * @generated
	 */
	String getIdCliente();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Compra#getIdCliente <em>Id Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Cliente</em>' attribute.
	 * @see #getIdCliente()
	 * @generated
	 */
	void setIdCliente(String value);

	/**
	 * Returns the value of the '<em><b>Codigo P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo P</em>' attribute.
	 * @see #setCodigoP(String)
	 * @see tiendacristal.domain.DomainPackage#getCompra_CodigoP()
	 * @model
	 * @generated
	 */
	String getCodigoP();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Compra#getCodigoP <em>Codigo P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo P</em>' attribute.
	 * @see #getCodigoP()
	 * @generated
	 */
	void setCodigoP(String value);

	/**
	 * Returns the value of the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha</em>' attribute.
	 * @see #setFecha(String)
	 * @see tiendacristal.domain.DomainPackage#getCompra_Fecha()
	 * @model
	 * @generated
	 */
	String getFecha();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Compra#getFecha <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha</em>' attribute.
	 * @see #getFecha()
	 * @generated
	 */
	void setFecha(String value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(int)
	 * @see tiendacristal.domain.DomainPackage#getCompra_Total()
	 * @model
	 * @generated
	 */
	int getTotal();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Compra#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(int value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Domain#getListaCompras <em>Lista Compras</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see tiendacristal.domain.DomainPackage#getCompra_Domain()
	 * @see tiendacristal.domain.Domain#getListaCompras
	 * @model opposite="listaCompras"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Compra#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>The Recibo Pago</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.ReciboPago#getTheCompra <em>The Compra</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Recibo Pago</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Recibo Pago</em>' reference.
	 * @see #setTheReciboPago(ReciboPago)
	 * @see tiendacristal.domain.DomainPackage#getCompra_TheReciboPago()
	 * @see tiendacristal.domain.ReciboPago#getTheCompra
	 * @model opposite="theCompra" required="true"
	 * @generated
	 */
	ReciboPago getTheReciboPago();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Compra#getTheReciboPago <em>The Recibo Pago</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Recibo Pago</em>' reference.
	 * @see #getTheReciboPago()
	 * @generated
	 */
	void setTheReciboPago(ReciboPago value);

	/**
	 * Returns the value of the '<em><b>The Pedido</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Pedido#getTheCompra <em>The Compra</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Pedido</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Pedido</em>' reference.
	 * @see #setThePedido(Pedido)
	 * @see tiendacristal.domain.DomainPackage#getCompra_ThePedido()
	 * @see tiendacristal.domain.Pedido#getTheCompra
	 * @model opposite="theCompra" required="true"
	 * @generated
	 */
	Pedido getThePedido();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Compra#getThePedido <em>The Pedido</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Pedido</em>' reference.
	 * @see #getThePedido()
	 * @generated
	 */
	void setThePedido(Pedido value);

} // Compra
