/**
 */
package tiendacristal.ui;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ModelFactory;

import tiendacristal.domain.Domain;

import tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;

import tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel;

import tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel;

import tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.UI#getOwnedByModelFactory <em>Owned By Model Factory</em>}</li>
 *   <li>{@link tiendacristal.ui.UI#getTheDomainAsociado <em>The Domain Asociado</em>}</li>
 *   <li>{@link tiendacristal.ui.UI#getTheContenedorCRUDProductosViewModel <em>The Contenedor CRUD Productos View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.UI#getTheContenedorCRUDClienteViewModel <em>The Contenedor CRUD Cliente View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.UI#getTheContenedorCRUDRealizarCompraViewModel <em>The Contenedor CRUD Realizar Compra View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.UI#getTheContenedorCRUDPedidoViewModel <em>The Contenedor CRUD Pedido View Model</em>}</li>
 *   <li>{@link tiendacristal.ui.UI#getTheContenedorPedidoViewPart <em>The Contenedor Pedido View Part</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.UiPackage#getUI()
 * @model
 * @generated
 */
public interface UI extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ModelFactory#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Model Factory</em>' container reference.
	 * @see #setOwnedByModelFactory(ModelFactory)
	 * @see tiendacristal.ui.UiPackage#getUI_OwnedByModelFactory()
	 * @see tiendacristal.ModelFactory#getTheUI
	 * @model opposite="theUI"
	 * @generated
	 */
	ModelFactory getOwnedByModelFactory();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.UI#getOwnedByModelFactory <em>Owned By Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Model Factory</em>' container reference.
	 * @see #getOwnedByModelFactory()
	 * @generated
	 */
	void setOwnedByModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>The Domain Asociado</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Domain#getTheUIAsociado <em>The UI Asociado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain Asociado</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain Asociado</em>' reference.
	 * @see #setTheDomainAsociado(Domain)
	 * @see tiendacristal.ui.UiPackage#getUI_TheDomainAsociado()
	 * @see tiendacristal.domain.Domain#getTheUIAsociado
	 * @model opposite="theUIAsociado" required="true"
	 * @generated
	 */
	Domain getTheDomainAsociado();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.UI#getTheDomainAsociado <em>The Domain Asociado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain Asociado</em>' reference.
	 * @see #getTheDomainAsociado()
	 * @generated
	 */
	void setTheDomainAsociado(Domain value);

	/**
	 * Returns the value of the '<em><b>The Contenedor CRUD Productos View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor CRUD Productos View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor CRUD Productos View Model</em>' containment reference.
	 * @see #setTheContenedorCRUDProductosViewModel(ContenedorCRUDProductosViewModel)
	 * @see tiendacristal.ui.UiPackage#getUI_TheContenedorCRUDProductosViewModel()
	 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel#getUI
	 * @model opposite="UI" containment="true" required="true"
	 * @generated
	 */
	ContenedorCRUDProductosViewModel getTheContenedorCRUDProductosViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.UI#getTheContenedorCRUDProductosViewModel <em>The Contenedor CRUD Productos View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor CRUD Productos View Model</em>' containment reference.
	 * @see #getTheContenedorCRUDProductosViewModel()
	 * @generated
	 */
	void setTheContenedorCRUDProductosViewModel(ContenedorCRUDProductosViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor CRUD Cliente View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor CRUD Cliente View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor CRUD Cliente View Model</em>' containment reference.
	 * @see #setTheContenedorCRUDClienteViewModel(ContenedorCRUDClienteViewModel)
	 * @see tiendacristal.ui.UiPackage#getUI_TheContenedorCRUDClienteViewModel()
	 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel#getUI
	 * @model opposite="UI" containment="true" required="true"
	 * @generated
	 */
	ContenedorCRUDClienteViewModel getTheContenedorCRUDClienteViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.UI#getTheContenedorCRUDClienteViewModel <em>The Contenedor CRUD Cliente View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor CRUD Cliente View Model</em>' containment reference.
	 * @see #getTheContenedorCRUDClienteViewModel()
	 * @generated
	 */
	void setTheContenedorCRUDClienteViewModel(ContenedorCRUDClienteViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor CRUD Realizar Compra View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor CRUD Realizar Compra View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor CRUD Realizar Compra View Model</em>' containment reference.
	 * @see #setTheContenedorCRUDRealizarCompraViewModel(ContenedorCRUDCompraViewModel)
	 * @see tiendacristal.ui.UiPackage#getUI_TheContenedorCRUDRealizarCompraViewModel()
	 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel#getUI
	 * @model opposite="UI" containment="true" required="true"
	 * @generated
	 */
	ContenedorCRUDCompraViewModel getTheContenedorCRUDRealizarCompraViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.UI#getTheContenedorCRUDRealizarCompraViewModel <em>The Contenedor CRUD Realizar Compra View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor CRUD Realizar Compra View Model</em>' containment reference.
	 * @see #getTheContenedorCRUDRealizarCompraViewModel()
	 * @generated
	 */
	void setTheContenedorCRUDRealizarCompraViewModel(ContenedorCRUDCompraViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor CRUD Pedido View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor CRUD Pedido View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor CRUD Pedido View Model</em>' containment reference.
	 * @see #setTheContenedorCRUDPedidoViewModel(ContenedorCRUDPedidoViewModel)
	 * @see tiendacristal.ui.UiPackage#getUI_TheContenedorCRUDPedidoViewModel()
	 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel#getUI
	 * @model opposite="UI" containment="true" required="true"
	 * @generated
	 */
	ContenedorCRUDPedidoViewModel getTheContenedorCRUDPedidoViewModel();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.UI#getTheContenedorCRUDPedidoViewModel <em>The Contenedor CRUD Pedido View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor CRUD Pedido View Model</em>' containment reference.
	 * @see #getTheContenedorCRUDPedidoViewModel()
	 * @generated
	 */
	void setTheContenedorCRUDPedidoViewModel(ContenedorCRUDPedidoViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Pedido View Part</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Pedido View Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Pedido View Part</em>' reference.
	 * @see #setTheContenedorPedidoViewPart(ContenedorPedidoViewPart)
	 * @see tiendacristal.ui.UiPackage#getUI_TheContenedorPedidoViewPart()
	 * @see tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart#getUI
	 * @model opposite="UI" required="true"
	 * @generated
	 */
	ContenedorPedidoViewPart getTheContenedorPedidoViewPart();

	/**
	 * Sets the value of the '{@link tiendacristal.ui.UI#getTheContenedorPedidoViewPart <em>The Contenedor Pedido View Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Pedido View Part</em>' reference.
	 * @see #getTheContenedorPedidoViewPart()
	 * @generated
	 */
	void setTheContenedorPedidoViewPart(ContenedorPedidoViewPart value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tContenedorCRUDProductosViewModel contenedorCRUDProductosViewModel = getTheContenedorCRUDProductosViewModel();\r\n\t\tContenedorCRUDClienteViewModel contenedorCRUDClienteViewModel = getTheContenedorCRUDClienteViewModel();\r\n\t\tContenedorCRUDCompraViewModel contenedorCRUDRealizarCompraViewModel = getTheContenedorCRUDRealizarCompraViewModel();\r\n\t\tContenedorCRUDPedidoViewModel contenedorCRUDPedidoViewModel = getTheContenedorCRUDPedidoViewModel();\r\n\r\n\t\tif (contenedorCRUDClienteViewModel == null) {\r\n\r\n\t\t\tcontenedorCRUDClienteViewModel = tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorCRUDClienteViewModel();\r\n\r\n\t\t}\r\n\r\n\t\tsetTheContenedorCRUDClienteViewModel(contenedorCRUDClienteViewModel);\r\n\r\n\t\tcontenedorCRUDClienteViewModel.implementarModelo();\r\n\r\n\t\tif (contenedorCRUDProductosViewModel == null) {\r\n\r\n\t\t\tcontenedorCRUDProductosViewModel = tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorCRUDProductosViewModel();\r\n\r\n\t\t}\r\n\r\n\t\tsetTheContenedorCRUDProductosViewModel(contenedorCRUDProductosViewModel);\r\n\r\n\t\tcontenedorCRUDProductosViewModel.implementarModelo();\r\n\r\n\t\tif (contenedorCRUDRealizarCompraViewModel == null) {\r\n\r\n\t\t\tcontenedorCRUDRealizarCompraViewModel = tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorCRUDCompraViewModel();\r\n\r\n\t\t}\r\n\r\n\t\tsetTheContenedorCRUDRealizarCompraViewModel(contenedorCRUDRealizarCompraViewModel);\r\n\r\n\t\tcontenedorCRUDRealizarCompraViewModel.implementarModelo();\r\n\r\n\t\tif (contenedorCRUDPedidoViewModel == null) {\r\n\r\n\t\t\tcontenedorCRUDPedidoViewModel = tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorCRUDPedidoViewModel();\r\n\r\n\t\t}\r\n\t\t\r\n\t\tsetTheContenedorCRUDPedidoViewModel(contenedorCRUDPedidoViewModel);\r\n\t\t\r\n\t\tcontenedorCRUDPedidoViewModel.implementarModelo();\r\n\r\n\t\treturn this;'"
	 * @generated
	 */
	UI implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\tgetTheDomainAsociado().crearProducto(formulario);'"
	 * @generated
	 */
	void crearProducto(ContenedorCRUDProductosViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\tgetTheDomainAsociado().crearCompra(formulario);'"
	 * @generated
	 */
	void crearCompra(ContenedorCRUDCompraViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\tgetTheDomainAsociado().crearPedido(formulario);\r\n\t'"
	 * @generated
	 */
	void crearPedido(ContenedorCRUDPedidoViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void buscarProductoId(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void agregarListaP(ContenedorCRUDProductosViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\r\n\treturn\tgetTheDomainAsociado().buscarProductoNombre(nombre);\r\n\t\r\n'"
	 * @generated
	 */
	ProductoComprarViewModel buscarProductoNombre(String nombre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\r\n\t\tgetTheDomainAsociado().crearCliente(formulario);\r\n\t\r\n'"
	 * @generated
	 */
	void crearCliente(ContenedorCRUDClienteViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\tgetTheDomainAsociado().actualizarCliente(formulario);\r\n\t\t\r\n'"
	 * @generated
	 */
	void actualizarCliente(ContenedorCRUDClienteViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eliminarCliente(ContenedorCRUDClienteViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\tgetTheDomainAsociado().buscarCliente(formulario);\r\n\t\t\r\n'"
	 * @generated
	 */
	void buscarCliente(ContenedorCRUDClienteViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void buscarProducto(ContenedorCRUDProductosViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eliminarProducto(ContenedorCRUDProductosViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void actualizarProducto(ContenedorCRUDProductosViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\t\t\r\n\t\t\t\tgetTheDomainAsociado().updateContenedorListadoClientes(formulario);\r\n\t\t\t\t\r\n\t\t\r\n'"
	 * @generated
	 */
	void updateContenedorListadoClientes(ContenedorMaestroClienteViewModel formulario);

} // UI
