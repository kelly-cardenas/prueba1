/**
 */
package tiendacristal.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vendedor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.Vendedor#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tiendacristal.domain.Vendedor#getDomain <em>Domain</em>}</li>
 *   <li>{@link tiendacristal.domain.Vendedor#getListaPedidos <em>Lista Pedidos</em>}</li>
 * </ul>
 *
 * @see tiendacristal.domain.DomainPackage#getVendedor()
 * @model
 * @generated
 */
public interface Vendedor extends EObject {
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
	 * @see tiendacristal.domain.DomainPackage#getVendedor_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Vendedor#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Domain#getTheVendedor <em>The Vendedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see tiendacristal.domain.DomainPackage#getVendedor_Domain()
	 * @see tiendacristal.domain.Domain#getTheVendedor
	 * @model opposite="theVendedor"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Vendedor#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Lista Pedidos</b></em>' reference list.
	 * The list contents are of type {@link tiendacristal.domain.Pedido}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Pedido#getTheVendedor <em>The Vendedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Pedidos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Pedidos</em>' reference list.
	 * @see tiendacristal.domain.DomainPackage#getVendedor_ListaPedidos()
	 * @see tiendacristal.domain.Pedido#getTheVendedor
	 * @model opposite="theVendedor"
	 * @generated
	 */
	EList<Pedido> getListaPedidos();

} // Vendedor
