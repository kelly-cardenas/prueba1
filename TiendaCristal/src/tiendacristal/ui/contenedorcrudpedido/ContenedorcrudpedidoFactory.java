/**
 */
package tiendacristal.ui.contenedorcrudpedido;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage
 * @generated
 */
public interface ContenedorcrudpedidoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorcrudpedidoFactory eINSTANCE = tiendacristal.ui.contenedorcrudpedido.impl.ContenedorcrudpedidoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contenedor CRUD Pedido View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor CRUD Pedido View Model</em>'.
	 * @generated
	 */
	ContenedorCRUDPedidoViewModel createContenedorCRUDPedidoViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Detalle Pedido View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Detalle Pedido View Model</em>'.
	 * @generated
	 */
	ContenedorDetallePedidoViewModel createContenedorDetallePedidoViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Maestro Pedido View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Maestro Pedido View Model</em>'.
	 * @generated
	 */
	ContenedorMaestroPedidoViewModel createContenedorMaestroPedidoViewModel();

	/**
	 * Returns a new object of class '<em>Producto Comprar View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Producto Comprar View Model</em>'.
	 * @generated
	 */
	ProductoComprarViewModel createProductoComprarViewModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContenedorcrudpedidoPackage getContenedorcrudpedidoPackage();

} //ContenedorcrudpedidoFactory
