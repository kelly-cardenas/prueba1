/**
 */
package tiendacristal.ui.contenedorcrudrealizarcompra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Maestro Compra View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel#getContenedorCRUDCompraViewModel <em>Contenedor CRUD Compra View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel#getListaCompraViewModel <em>Lista Compra View Model</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage#getContenedorMaestroCompraViewModel()
 * @model
 * @generated
 */
public interface ContenedorMaestroCompraViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Contenedor CRUD Compra View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getTheContenedorMaestroCompraViewModel <em>The Contenedor Maestro Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor CRUD Compra View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor CRUD Compra View Model</em>' container reference.
	 * @see #setContenedorCRUDCompraViewModel(ContenedorCRUDCompraViewModel)
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage#getContenedorMaestroCompraViewModel_ContenedorCRUDCompraViewModel()
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getTheContenedorMaestroCompraViewModel
	 * @model opposite="theContenedorMaestroCompraViewModel"
	 * @generated
	 */
	ContenedorCRUDCompraViewModel getContenedorCRUDCompraViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel#getContenedorCRUDCompraViewModel <em>Contenedor CRUD Compra View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenedor CRUD Compra View Model</em>' container reference.
	 * @see #getContenedorCRUDCompraViewModel()
	 * @generated
	 */
	void setContenedorCRUDCompraViewModel(ContenedorCRUDCompraViewModel value);

	/**
	 * Returns the value of the '<em><b>Lista Compra View Model</b></em>' containment reference list.
	 * The list contents are of type {@link tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getContenedorMaestroCompraViewModel <em>Contenedor Maestro Compra View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Compra View Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Compra View Model</em>' containment reference list.
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage#getContenedorMaestroCompraViewModel_ListaCompraViewModel()
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel#getContenedorMaestroCompraViewModel
	 * @model opposite="ContenedorMaestroCompraViewModel" containment="true"
	 * @generated
	 */
	EList<CompraViewModel> getListaCompraViewModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void create();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void implementarModelo();

} // ContenedorMaestroCompraViewModel
