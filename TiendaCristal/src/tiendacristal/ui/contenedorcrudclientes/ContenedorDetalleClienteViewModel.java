/**
 */
package tiendacristal.ui.contenedorcrudclientes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Detalle Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getTipoCliente <em>Tipo Cliente</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getContenedorCRUDClienteViewModel <em>Contenedor CRUD Cliente View Model</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorDetalleClienteViewModel()
 * @model
 * @generated
 */
public interface ContenedorDetalleClienteViewModel extends EObject {
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
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorDetalleClienteViewModel_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getNombre <em>Nombre</em>}' attribute.
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
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorDetalleClienteViewModel_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getCodigo <em>Codigo</em>}' attribute.
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
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorDetalleClienteViewModel_TipoCliente()
	 * @model
	 * @generated
	 */
	String getTipoCliente();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getTipoCliente <em>Tipo Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Cliente</em>' attribute.
	 * @see #getTipoCliente()
	 * @generated
	 */
	void setTipoCliente(String value);

	/**
	 * Returns the value of the '<em><b>Contenedor CRUD Cliente View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getTheContenedorDetalleClienteViewModel <em>The Contenedor Detalle Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor CRUD Cliente View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor CRUD Cliente View Model</em>' container reference.
	 * @see #setContenedorCRUDClienteViewModel(ContenedorCRUDClienteViewModel)
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage#getContenedorDetalleClienteViewModel_ContenedorCRUDClienteViewModel()
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getTheContenedorDetalleClienteViewModel
	 * @model opposite="theContenedorDetalleClienteViewModel"
	 * @generated
	 */
	ContenedorCRUDClienteViewModel getContenedorCRUDClienteViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel#getContenedorCRUDClienteViewModel <em>Contenedor CRUD Cliente View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenedor CRUD Cliente View Model</em>' container reference.
	 * @see #getContenedorCRUDClienteViewModel()
	 * @generated
	 */
	void setContenedorCRUDClienteViewModel(ContenedorCRUDClienteViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void crear();

} // ContenedorDetalleClienteViewModel
