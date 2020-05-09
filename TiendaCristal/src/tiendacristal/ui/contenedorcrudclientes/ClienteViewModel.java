/**
 */
package tiendacristal.ui.contenedorcrudclientes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getTipoCliente <em>Tipo Cliente</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getOwnedBy <em>Owned By</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getClienteViewModel()
 * @model
 * @generated
 */
public interface ClienteViewModel extends EObject {
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
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getClienteViewModel_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getNombre <em>Nombre</em>}' attribute.
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
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getClienteViewModel_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getCodigo <em>Codigo</em>}' attribute.
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
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getClienteViewModel_TipoCliente()
	 * @model
	 * @generated
	 */
	String getTipoCliente();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getTipoCliente <em>Tipo Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Cliente</em>' attribute.
	 * @see #getTipoCliente()
	 * @generated
	 */
	void setTipoCliente(String value);

	/**
	 * Returns the value of the '<em><b>Owned By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getTheClienteViewModel <em>The Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By</em>' container reference.
	 * @see #setOwnedBy(ContenedorMaestroClienteViewModel)
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getClienteViewModel_OwnedBy()
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel#getTheClienteViewModel
	 * @model opposite="theClienteViewModel"
	 * @generated
	 */
	ContenedorMaestroClienteViewModel getOwnedBy();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudclientes.ClienteViewModel#getOwnedBy <em>Owned By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By</em>' container reference.
	 * @see #getOwnedBy()
	 * @generated
	 */
	void setOwnedBy(ContenedorMaestroClienteViewModel value);

} // ClienteViewModel
