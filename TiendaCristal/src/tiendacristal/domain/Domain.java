/**
 */
package tiendacristal.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ModelFactory;

import tiendacristal.ui.UI;

import tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;

import tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel;

import tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel;

import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.Domain#getTheUIAsociado <em>The UI Asociado</em>}</li>
 *   <li>{@link tiendacristal.domain.Domain#getOwnedByModelFactory <em>Owned By Model Factory</em>}</li>
 *   <li>{@link tiendacristal.domain.Domain#getListaPedidos <em>Lista Pedidos</em>}</li>
 *   <li>{@link tiendacristal.domain.Domain#getListaCompras <em>Lista Compras</em>}</li>
 *   <li>{@link tiendacristal.domain.Domain#getTheAdministrador <em>The Administrador</em>}</li>
 *   <li>{@link tiendacristal.domain.Domain#getListaClientes <em>Lista Clientes</em>}</li>
 *   <li>{@link tiendacristal.domain.Domain#getListaProductos <em>Lista Productos</em>}</li>
 *   <li>{@link tiendacristal.domain.Domain#getListaFacturas <em>Lista Facturas</em>}</li>
 *   <li>{@link tiendacristal.domain.Domain#getTheTiendaCristal <em>The Tienda Cristal</em>}</li>
 *   <li>{@link tiendacristal.domain.Domain#getTheVendedor <em>The Vendedor</em>}</li>
 *   <li>{@link tiendacristal.domain.Domain#getTheInventario <em>The Inventario</em>}</li>
 * </ul>
 *
 * @see tiendacristal.domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>The UI Asociado</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.UI#getTheDomainAsociado <em>The Domain Asociado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI Asociado</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI Asociado</em>' reference.
	 * @see #setTheUIAsociado(UI)
	 * @see tiendacristal.domain.DomainPackage#getDomain_TheUIAsociado()
	 * @see tiendacristal.ui.UI#getTheDomainAsociado
	 * @model opposite="theDomainAsociado" required="true"
	 * @generated
	 */
	UI getTheUIAsociado();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Domain#getTheUIAsociado <em>The UI Asociado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI Asociado</em>' reference.
	 * @see #getTheUIAsociado()
	 * @generated
	 */
	void setTheUIAsociado(UI value);

	/**
	 * Returns the value of the '<em><b>Owned By Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ModelFactory#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Model Factory</em>' container reference.
	 * @see #setOwnedByModelFactory(ModelFactory)
	 * @see tiendacristal.domain.DomainPackage#getDomain_OwnedByModelFactory()
	 * @see tiendacristal.ModelFactory#getTheDomain
	 * @model opposite="theDomain"
	 * @generated
	 */
	ModelFactory getOwnedByModelFactory();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Domain#getOwnedByModelFactory <em>Owned By Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Model Factory</em>' container reference.
	 * @see #getOwnedByModelFactory()
	 * @generated
	 */
	void setOwnedByModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Lista Pedidos</b></em>' containment reference list.
	 * The list contents are of type {@link tiendacristal.domain.Pedido}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Pedido#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Pedidos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Pedidos</em>' containment reference list.
	 * @see tiendacristal.domain.DomainPackage#getDomain_ListaPedidos()
	 * @see tiendacristal.domain.Pedido#getDomain
	 * @model opposite="Domain" containment="true"
	 * @generated
	 */
	EList<Pedido> getListaPedidos();

	/**
	 * Returns the value of the '<em><b>Lista Compras</b></em>' containment reference list.
	 * The list contents are of type {@link tiendacristal.domain.Compra}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Compra#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Compras</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Compras</em>' containment reference list.
	 * @see tiendacristal.domain.DomainPackage#getDomain_ListaCompras()
	 * @see tiendacristal.domain.Compra#getDomain
	 * @model opposite="Domain" containment="true"
	 * @generated
	 */
	EList<Compra> getListaCompras();

	/**
	 * Returns the value of the '<em><b>The Administrador</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Administrador#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Administrador</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Administrador</em>' containment reference.
	 * @see #setTheAdministrador(Administrador)
	 * @see tiendacristal.domain.DomainPackage#getDomain_TheAdministrador()
	 * @see tiendacristal.domain.Administrador#getDomain
	 * @model opposite="Domain" containment="true" required="true"
	 * @generated
	 */
	Administrador getTheAdministrador();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Domain#getTheAdministrador <em>The Administrador</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Administrador</em>' containment reference.
	 * @see #getTheAdministrador()
	 * @generated
	 */
	void setTheAdministrador(Administrador value);

	/**
	 * Returns the value of the '<em><b>Lista Clientes</b></em>' containment reference list.
	 * The list contents are of type {@link tiendacristal.domain.Cliente}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Cliente#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Clientes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Clientes</em>' containment reference list.
	 * @see tiendacristal.domain.DomainPackage#getDomain_ListaClientes()
	 * @see tiendacristal.domain.Cliente#getDomain
	 * @model opposite="Domain" containment="true"
	 * @generated
	 */
	EList<Cliente> getListaClientes();

	/**
	 * Returns the value of the '<em><b>Lista Productos</b></em>' containment reference list.
	 * The list contents are of type {@link tiendacristal.domain.Producto}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Producto#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Productos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Productos</em>' containment reference list.
	 * @see tiendacristal.domain.DomainPackage#getDomain_ListaProductos()
	 * @see tiendacristal.domain.Producto#getDomain
	 * @model opposite="Domain" containment="true"
	 * @generated
	 */
	EList<Producto> getListaProductos();

	/**
	 * Returns the value of the '<em><b>Lista Facturas</b></em>' containment reference list.
	 * The list contents are of type {@link tiendacristal.domain.ReciboPago}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.ReciboPago#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Facturas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Facturas</em>' containment reference list.
	 * @see tiendacristal.domain.DomainPackage#getDomain_ListaFacturas()
	 * @see tiendacristal.domain.ReciboPago#getDomain
	 * @model opposite="Domain" containment="true"
	 * @generated
	 */
	EList<ReciboPago> getListaFacturas();

	/**
	 * Returns the value of the '<em><b>The Tienda Cristal</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.DistribuidoraCristal#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Tienda Cristal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Tienda Cristal</em>' containment reference.
	 * @see #setTheTiendaCristal(DistribuidoraCristal)
	 * @see tiendacristal.domain.DomainPackage#getDomain_TheTiendaCristal()
	 * @see tiendacristal.domain.DistribuidoraCristal#getDomain
	 * @model opposite="Domain" containment="true" required="true"
	 * @generated
	 */
	DistribuidoraCristal getTheTiendaCristal();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Domain#getTheTiendaCristal <em>The Tienda Cristal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Tienda Cristal</em>' containment reference.
	 * @see #getTheTiendaCristal()
	 * @generated
	 */
	void setTheTiendaCristal(DistribuidoraCristal value);

	/**
	 * Returns the value of the '<em><b>The Vendedor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Vendedor#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Vendedor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Vendedor</em>' containment reference.
	 * @see #setTheVendedor(Vendedor)
	 * @see tiendacristal.domain.DomainPackage#getDomain_TheVendedor()
	 * @see tiendacristal.domain.Vendedor#getDomain
	 * @model opposite="Domain" containment="true" required="true"
	 * @generated
	 */
	Vendedor getTheVendedor();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Domain#getTheVendedor <em>The Vendedor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Vendedor</em>' containment reference.
	 * @see #getTheVendedor()
	 * @generated
	 */
	void setTheVendedor(Vendedor value);

	/**
	 * Returns the value of the '<em><b>The Inventario</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Inventario#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Inventario</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Inventario</em>' containment reference.
	 * @see #setTheInventario(Inventario)
	 * @see tiendacristal.domain.DomainPackage#getDomain_TheInventario()
	 * @see tiendacristal.domain.Inventario#getDomain
	 * @model opposite="Domain" containment="true" required="true"
	 * @generated
	 */
	Inventario getTheInventario();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Domain#getTheInventario <em>The Inventario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Inventario</em>' containment reference.
	 * @see #getTheInventario()
	 * @generated
	 */
	void setTheInventario(Inventario value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\treturn this;'"
	 * @generated
	 */
	Domain implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tProducto producto = tiendacristal.domain.DomainFactory.eINSTANCE.createProducto();\r\n\r\n\t\tproducto.setNombre(formulario.getTheContenedorDetalleProductosViewmodel().getNombre());\r\n\t\tproducto.setCodigo(formulario.getTheContenedorDetalleProductosViewmodel().getCategoria());\r\n\t\tproducto.setCategoria(formulario.getTheContenedorDetalleProductosViewmodel().getCategoria());\r\n\t\tproducto.setPrecio(formulario.getTheContenedorDetalleProductosViewmodel().getPrecio());\r\n\r\n\t\tgetListaProductos().add(producto);\r\n\r\n\t\ttiendacristal.ui.contenedorcrudproductos.ProductosViewModel productosViewModel = tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosFactory.eINSTANCE\r\n\t\t\t\t.createProductosViewModel();\r\n\t\t\r\n\t\tproductosViewModel.setNombre(producto.getNombre());\r\n\t\tproductosViewModel.setPrecio(producto.getPrecio());\r\n\t\tproductosViewModel.setCategoria(producto.getCategoria());\r\n\t\tproductosViewModel.setCodigo(producto.getCodigo());\r\n\t\t\r\n\t\tformulario.getTheContenedorMestroProductosViewModel().getTheProductosViewModel().add(productosViewModel);\r\n\t\t'"
	 * @generated
	 */
	void crearProducto(ContenedorCRUDProductosViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void crearCompra(ContenedorCRUDCompraViewModel formuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\tPedido pedido = tiendacristal.domain.DomainFactory.eINSTANCE.createPedido();\r\n\r\n\t\tpedido.setIdCliente(formulario.getTheContenedorDetallePedidoViewModel().getIdCliente());\r\n\t\tpedido.setFechaPedido(formulario.getTheContenedorDetallePedidoViewModel().getFechaPedido());\r\n\t\tpedido.setCodigo(formulario.getTheContenedorDetallePedidoViewModel().getCodigo());\r\n\t\tpedido.setTheCliente(buscarClienteId(formulario.getTheContenedorDetallePedidoViewModel().getIdCliente()));\r\n\r\n\t\tfor (ProductoComprarViewModel productoComprarViewModel : formulario.getTheContenedorMaestroPedidoViewModel()\r\n\t\t\t\t.getListaProductoComprarViewModel()) {\r\n\r\n\t\t\tProducto producto = tiendacristal.domain.DomainFactory.eINSTANCE.createProducto();\r\n\r\n\t\t\tproducto.setCategoria(productoComprarViewModel.getCategoria());\r\n\t\t\tproducto.setCodigo(productoComprarViewModel.getCodigo());\r\n\t\t\tproducto.setNombre(productoComprarViewModel.getNombre());\r\n\t\t\tproducto.setPrecio(productoComprarViewModel.getPrecio());\r\n\r\n\t\t\tpedido.getListaProductos().add(producto);\r\n\r\n\t\t}\r\n\r\n'"
	 * @generated
	 */
	void crearPedido(ContenedorCRUDPedidoViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\t\t\tProducto resultado = null;\r\n\t\t\r\n\t\t\t\tfor (Producto producto : getListaProductos()) {\r\n\t\t\r\n\t\t\t\t\tif (producto.getCodigo().equals(id)) {\r\n\t\t\r\n\t\t\t\t\t\tresultado = producto;\r\n\t\t\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\r\n\t\t\t\treturn resultado;\r\n\t\t\t\t'"
	 * @generated
	 */
	Producto buscarProductoId(String id);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\r\n\t\tProductoComprarViewModel productoComprarViewModel = tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoFactory.eINSTANCE\r\n\t\t\t\t.createProductoComprarViewModel();\r\n\r\n\t\tfor (Producto producto : getListaProductos()) {\r\n\r\n\t\t\tif (producto.getNombre().equals(nombre)) {\r\n\r\n\t\t\t\tproductoComprarViewModel.setCodigo(producto.getCodigo());\r\n\r\n\t\t\t\tproductoComprarViewModel.setCategoria(producto.getCategoria());\r\n\r\n\t\t\t\tproductoComprarViewModel.setNombre(producto.getNombre());\r\n\r\n\t\t\t\tproductoComprarViewModel.setPrecio(\"\"+producto.getPrecio());\r\n\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\treturn productoComprarViewModel;'"
	 * @generated
	 */
	ProductoComprarViewModel buscarProductoNombre(String nombre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tCliente cliente = tiendacristal.domain.DomainFactory.eINSTANCE.createCliente();\r\n\r\n\t\tcliente.setCodigo(formulario.getTheContenedorDetalleClienteViewModel().getCodigo());\r\n\t\tcliente.setNombre(formulario.getTheContenedorDetalleClienteViewModel().getNombre());\r\n\t\tcliente.setTipoCliente(formulario.getTheContenedorDetalleClienteViewModel().getTipoCliente());\r\n\r\n\t\tgetListaClientes().add(cliente);\r\n\r\n\t\ttiendacristal.ui.contenedorcrudclientes.ClienteViewModel clienteViewModel = tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesFactory.eINSTANCE\r\n\t\t\t\t.createClienteViewModel();\r\n\r\n\t\tclienteViewModel.setCodigo(cliente.getCodigo());\r\n\t\tclienteViewModel.setNombre(cliente.getNombre());\r\n\t\tclienteViewModel.setTipoCliente(cliente.getTipoCliente());\r\n\r\n\t\tformulario.getTheContenedorMaestroClienteViewModel().getTheClienteViewModel().add(clienteViewModel);\r\n\r\n'"
	 * @generated
	 */
	void crearCliente(ContenedorCRUDClienteViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\tCliente cliente = buscarClienteId(formulario.getTheContenedorDetalleClienteViewModel().getCodigo());\r\n\r\n\t\tif (cliente == null)\r\n\t\t\treturn;\r\n\t\t\r\n\r\n//\t\ttiendacristal.ui.contenedorcrudclientes.ClienteViewModel clienteViewModelSeleccionado = formulario\r\n//\t\t\t\t.getTheContenedorMaestroClienteViewModel().getTheClienteViewModelSeleccionada();\r\n\r\n\t\tcliente.setNombre(formulario.getTheContenedorDetalleClienteViewModel().getNombre());\r\n\t\tcliente.setCodigo(formulario.getTheContenedorDetalleClienteViewModel().getCodigo());\r\n\t\tcliente.setTipoCliente(formulario.getTheContenedorDetalleClienteViewModel().getTipoCliente());\r\n\t\t\r\n\t\tformulario.update();\r\n\r\n//\t\tif (clienteViewModelSeleccionado != null) {\r\n//\r\n//\t\t\tSystem.out.println(\"Entra 3\");\r\n//\t\t\t\r\n//\t\t\tformulario.getTheContenedorMaestroClienteViewModel().getTheClienteViewModelSeleccionada()\r\n//\t\t\t\t\t.setNombre(cliente.getNombre());\r\n//\t\t\tformulario.getTheContenedorMaestroClienteViewModel().getTheClienteViewModelSeleccionada()\r\n//\t\t\t\t\t.setTipoCliente(cliente.getTipoCliente());\r\n//\r\n//\t\t\tSystem.out.println(\"Entra 4\");\r\n//\t\t}\r\n'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tCliente cliente = buscarClienteId(formulario.getTheContenedorDetalleClienteViewModel().getCodigo());\r\n\t\t\r\n\t\tif( cliente == null) \r\n\t\t\treturn;\r\n\t\t\r\n\t\tformulario.getTheContenedorDetalleClienteViewModel().setCodigo(cliente.getCodigo());\r\n\t\tformulario.getTheContenedorDetalleClienteViewModel().setNombre(cliente.getNombre());\r\n\t\tformulario.getTheContenedorDetalleClienteViewModel().setTipoCliente(cliente .getTipoCliente());\r\n\t\t'"
	 * @generated
	 */
	void buscarCliente(ContenedorCRUDClienteViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\tCliente resultado = null;\r\n\t\t\r\n\t\tfor (Cliente cliente : getListaClientes()) {\r\n\r\n\t\t\tif (cliente.getCodigo().equals(id)) {\r\n\r\n\t\t\t\tresultado = cliente;\r\n\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\treturn resultado;'"
	 * @generated
	 */
	Cliente buscarClienteId(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\r\n\t\tProducto producto = buscarProductoId(formulario.getTheContenedorDetalleProductosViewmodel().getCodigo());\r\n\t\t\r\n\t\tif( producto == null) \r\n\t\t\treturn;\r\n\t\t\r\n\t\tformulario.getTheContenedorDetalleProductosViewmodel().setCodigo(producto.getCodigo());\r\n\t\tformulario.getTheContenedorDetalleProductosViewmodel().setNombre(producto.getNombre());\r\n\t\tformulario.getTheContenedorDetalleProductosViewmodel().setCategoria(producto.getCategoria());\r\n\t\tformulario.getTheContenedorDetalleProductosViewmodel().setPrecio(producto.getPrecio());\r\n\t\r\n'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tProducto producto = buscarProductoId(formulario.getTheContenedorDetalleProductosViewmodel().getCodigo());\r\n\r\n\t\tif (producto == null)\r\n\t\t\treturn;\r\n\r\n\t\ttiendacristal.ui.contenedorcrudproductos.ProductosViewModel productosViewModelSeleccionado = formulario\r\n\t\t\t\t.getTheContenedorMestroProductosViewModel().getTheProductoViewModelSeleccionado();\r\n\r\n\t\tproducto.setNombre(formulario.getTheContenedorDetalleProductosViewmodel().getNombre());\r\n\t\tproducto.setCodigo(formulario.getTheContenedorDetalleProductosViewmodel().getCodigo());\r\n\t\tproducto.setCategoria(formulario.getTheContenedorDetalleProductosViewmodel().getCategoria());\r\n\t\tproducto.setPrecio(formulario.getTheContenedorDetalleProductosViewmodel().getPrecio());\r\n\r\n\t\tif (productosViewModelSeleccionado != null) {\r\n\r\n\t\t\tformulario.getTheContenedorMestroProductosViewModel().getTheProductoViewModelSeleccionado()\r\n\t\t\t\t\t.setCodigo(producto.getCodigo());\r\n\t\t\tformulario.getTheContenedorMestroProductosViewModel().getTheProductoViewModelSeleccionado()\r\n\t\t\t.setNombre(producto.getNombre());\r\n\t\t\tformulario.getTheContenedorMestroProductosViewModel().getTheProductoViewModelSeleccionado()\r\n\t\t\t.setCategoria(producto.getCategoria());\r\n\t\t\tformulario.getTheContenedorMestroProductosViewModel().getTheProductoViewModelSeleccionado()\r\n\t\t\t.setPrecio(producto.getPrecio());\r\n}\r\n'"
	 * @generated
	 */
	void actualizarProducto(ContenedorCRUDProductosViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t// Limpiamos fromulario\r\n\r\n\t\tformulario.getTheClienteViewModel().clear();\r\n\r\n\t\t// Armar el listado\r\n\t\tfor (Cliente cliente : listaClientes) {\r\n\r\n\t\t\ttiendacristal.ui.contenedorcrudclientes.ClienteViewModel clienteViewModel = ContenedorcrudclientesFactory.eINSTANCE\r\n\t\t\t\t\t.createClienteViewModel();\r\n\r\n\t\t\tclienteViewModel.setNombre(cliente.getNombre());\r\n\t\t\tclienteViewModel.setCodigo(cliente.getCodigo());\r\n\t\t\tclienteViewModel.setTipoCliente(cliente.getTipoCliente());\r\n\t\t\tformulario.getTheClienteViewModel().add(clienteViewModel);\r\n\r\n\t\t}\r\n\r\n'"
	 * @generated
	 */
	void updateContenedorListadoClientes(ContenedorMaestroClienteViewModel formulario);

} // Domain
