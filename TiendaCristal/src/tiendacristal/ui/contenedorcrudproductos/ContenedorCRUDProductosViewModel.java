/**
 */
package tiendacristal.ui.contenedorcrudproductos;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ui.UI;

import tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor CRUD Productos View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getUI <em>UI</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getTheContenedorDetalleProductosViewmodel <em>The Contenedor Detalle Productos Viewmodel</em>}</li>
 *   <li>{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getTheContenedorMestroProductosViewModel <em>The Contenedor Mestro Productos View Model</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage#getContenedorCRUDProductosViewModel()
 * @model
 * @generated
 */
public interface ContenedorCRUDProductosViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.UI#getTheContenedorCRUDProductosViewModel <em>The Contenedor CRUD Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI</em>' container reference.
	 * @see #setUI(UI)
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage#getContenedorCRUDProductosViewModel_UI()
	 * @see tiendacristal.ui.UI#getTheContenedorCRUDProductosViewModel
	 * @model opposite="theContenedorCRUDProductosViewModel"
	 * @generated
	 */
	UI getUI();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getUI <em>UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UI</em>' container reference.
	 * @see #getUI()
	 * @generated
	 */
	void setUI(UI value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Detalle Productos Viewmodel</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#getContenedorCRUDProductosViewModel <em>Contenedor CRUD Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Detalle Productos Viewmodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Detalle Productos Viewmodel</em>' containment reference.
	 * @see #setTheContenedorDetalleProductosViewmodel(ContenedorDetalleProductosViewmodel)
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage#getContenedorCRUDProductosViewModel_TheContenedorDetalleProductosViewmodel()
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel#getContenedorCRUDProductosViewModel
	 * @model opposite="ContenedorCRUDProductosViewModel" containment="true" required="true"
	 * @generated
	 */
	ContenedorDetalleProductosViewmodel getTheContenedorDetalleProductosViewmodel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getTheContenedorDetalleProductosViewmodel <em>The Contenedor Detalle Productos Viewmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Detalle Productos Viewmodel</em>' containment reference.
	 * @see #getTheContenedorDetalleProductosViewmodel()
	 * @generated
	 */
	void setTheContenedorDetalleProductosViewmodel(ContenedorDetalleProductosViewmodel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Mestro Productos View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorCRUDProductosViewModel <em>Contenedor CRUD Productos View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Mestro Productos View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Mestro Productos View Model</em>' containment reference.
	 * @see #setTheContenedorMestroProductosViewModel(ContenedorMestroProductosViewModel)
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage#getContenedorCRUDProductosViewModel_TheContenedorMestroProductosViewModel()
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel#getContenedorCRUDProductosViewModel
	 * @model opposite="ContenedorCRUDProductosViewModel" containment="true" required="true"
	 * @generated
	 */
	ContenedorMestroProductosViewModel getTheContenedorMestroProductosViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getTheContenedorMestroProductosViewModel <em>The Contenedor Mestro Productos View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Mestro Productos View Model</em>' containment reference.
	 * @see #getTheContenedorMestroProductosViewModel()
	 * @generated
	 */
	void setTheContenedorMestroProductosViewModel(ContenedorMestroProductosViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tgetUI().crearProducto(this);'"
	 * @generated
	 */
	void crearProducto();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void crear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enlazar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void buscarProductoId(String nombre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tContenedorDetalleProductosViewmodel contenedorDetalleProductosViewmodel = getTheContenedorDetalleProductosViewmodel();\r\n\t\tContenedorMestroProductosViewModel contenedorMestroProductosViewModel = getTheContenedorMestroProductosViewModel();\r\n\r\n\t\tif (contenedorDetalleProductosViewmodel == null) {\r\n\r\n\t\t\tcontenedorDetalleProductosViewmodel = tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorDetalleProductosViewmodel();\r\n\r\n\t\t}\r\n\r\n\t\tif (contenedorMestroProductosViewModel == null) {\r\n\r\n\t\t\tcontenedorMestroProductosViewModel = tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorMestroProductosViewModel();\r\n\t\t}\r\n\t\t\r\n\t\tsetTheContenedorDetalleProductosViewmodel(contenedorDetalleProductosViewmodel);\r\n\t\tsetTheContenedorMestroProductosViewModel(contenedorMestroProductosViewModel);\r\n\r\n'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void agregarListaP();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\r\n\treturn\tgetUI().buscarProductoNombre(nombre);\r\n\r\n'"
	 * @generated
	 */
	ProductoComprarViewModel buscarProductoNombre(String nombre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void buscarProducto();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eliminarProducto();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void actualizarProducto();

} // ContenedorCRUDProductosViewModel
