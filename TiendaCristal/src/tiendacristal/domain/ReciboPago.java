/**
 */
package tiendacristal.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recibo Pago</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.ReciboPago#getCodigoFactura <em>Codigo Factura</em>}</li>
 *   <li>{@link tiendacristal.domain.ReciboPago#getCostoTotalPedido <em>Costo Total Pedido</em>}</li>
 *   <li>{@link tiendacristal.domain.ReciboPago#getDomain <em>Domain</em>}</li>
 *   <li>{@link tiendacristal.domain.ReciboPago#getTheCompra <em>The Compra</em>}</li>
 * </ul>
 *
 * @see tiendacristal.domain.DomainPackage#getReciboPago()
 * @model
 * @generated
 */
public interface ReciboPago extends EObject {
	/**
	 * Returns the value of the '<em><b>Codigo Factura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Factura</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Factura</em>' attribute.
	 * @see #setCodigoFactura(String)
	 * @see tiendacristal.domain.DomainPackage#getReciboPago_CodigoFactura()
	 * @model
	 * @generated
	 */
	String getCodigoFactura();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.ReciboPago#getCodigoFactura <em>Codigo Factura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo Factura</em>' attribute.
	 * @see #getCodigoFactura()
	 * @generated
	 */
	void setCodigoFactura(String value);

	/**
	 * Returns the value of the '<em><b>Costo Total Pedido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costo Total Pedido</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costo Total Pedido</em>' attribute.
	 * @see #setCostoTotalPedido(int)
	 * @see tiendacristal.domain.DomainPackage#getReciboPago_CostoTotalPedido()
	 * @model
	 * @generated
	 */
	int getCostoTotalPedido();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.ReciboPago#getCostoTotalPedido <em>Costo Total Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Costo Total Pedido</em>' attribute.
	 * @see #getCostoTotalPedido()
	 * @generated
	 */
	void setCostoTotalPedido(int value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Domain#getListaFacturas <em>Lista Facturas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see tiendacristal.domain.DomainPackage#getReciboPago_Domain()
	 * @see tiendacristal.domain.Domain#getListaFacturas
	 * @model opposite="listaFacturas"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.ReciboPago#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>The Compra</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Compra#getTheReciboPago <em>The Recibo Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Compra</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Compra</em>' reference.
	 * @see #setTheCompra(Compra)
	 * @see tiendacristal.domain.DomainPackage#getReciboPago_TheCompra()
	 * @see tiendacristal.domain.Compra#getTheReciboPago
	 * @model opposite="theReciboPago" required="true"
	 * @generated
	 */
	Compra getTheCompra();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.ReciboPago#getTheCompra <em>The Compra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Compra</em>' reference.
	 * @see #getTheCompra()
	 * @generated
	 */
	void setTheCompra(Compra value);

} // ReciboPago
