/**
 */
package tiendacristal.ui.contenedorcrudrealizarcompra;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage
 * @generated
 */
public interface ContenedorcrudrealizarcompraFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorcrudrealizarcompraFactory eINSTANCE = tiendacristal.ui.contenedorcrudrealizarcompra.impl.ContenedorcrudrealizarcompraFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contenedor CRUD Compra View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor CRUD Compra View Model</em>'.
	 * @generated
	 */
	ContenedorCRUDCompraViewModel createContenedorCRUDCompraViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Detalle Compra View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Detalle Compra View Model</em>'.
	 * @generated
	 */
	ContenedorDetalleCompraViewModel createContenedorDetalleCompraViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Maestro Compra View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Maestro Compra View Model</em>'.
	 * @generated
	 */
	ContenedorMaestroCompraViewModel createContenedorMaestroCompraViewModel();

	/**
	 * Returns a new object of class '<em>Compra View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compra View Model</em>'.
	 * @generated
	 */
	CompraViewModel createCompraViewModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContenedorcrudrealizarcompraPackage getContenedorcrudrealizarcompraPackage();

} //ContenedorcrudrealizarcompraFactory
