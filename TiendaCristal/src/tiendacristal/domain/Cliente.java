/**
 */
package tiendacristal.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.Cliente#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tiendacristal.domain.Cliente#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.domain.Cliente#getTipoCliente <em>Tipo Cliente</em>}</li>
 *   <li>{@link tiendacristal.domain.Cliente#getDomain <em>Domain</em>}</li>
 *   <li>{@link tiendacristal.domain.Cliente#getListaPedidos <em>Lista Pedidos</em>}</li>
 * </ul>
 *
 * @see tiendacristal.domain.DomainPackage#getCliente()
 * @model
 * @generated
 */
public interface Cliente extends EObject {
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
	 * @see tiendacristal.domain.DomainPackage#getCliente_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Cliente#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

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
	 * @see tiendacristal.domain.DomainPackage#getCliente_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Cliente#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Cliente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Cliente</em>' attribute.
	 * @see #setTipoCliente(String)
	 * @see tiendacristal.domain.DomainPackage#getCliente_TipoCliente()
	 * @model
	 * @generated
	 */
	String getTipoCliente();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Cliente#getTipoCliente <em>Tipo Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Cliente</em>' attribute.
	 * @see #getTipoCliente()
	 * @generated
	 */
	void setTipoCliente(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Domain#getListaClientes <em>Lista Clientes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see tiendacristal.domain.DomainPackage#getCliente_Domain()
	 * @see tiendacristal.domain.Domain#getListaClientes
	 * @model opposite="listaClientes"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Cliente#getDomain <em>Domain</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Pedido#getTheCliente <em>The Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Pedidos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Pedidos</em>' reference list.
	 * @see tiendacristal.domain.DomainPackage#getCliente_ListaPedidos()
	 * @see tiendacristal.domain.Pedido#getTheCliente
	 * @model opposite="theCliente"
	 * @generated
	 */
	EList<Pedido> getListaPedidos();

} // Cliente
