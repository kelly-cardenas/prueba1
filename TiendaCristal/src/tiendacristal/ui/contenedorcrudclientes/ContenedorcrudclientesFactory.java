/**
 */
package tiendacristal.ui.contenedorcrudclientes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage
 * @generated
 */
public interface ContenedorcrudclientesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorcrudclientesFactory eINSTANCE = tiendacristal.ui.contenedorcrudclientes.impl.ContenedorcrudclientesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contenedor CRUD Cliente View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor CRUD Cliente View Model</em>'.
	 * @generated
	 */
	ContenedorCRUDClienteViewModel createContenedorCRUDClienteViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Detalle Cliente View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Detalle Cliente View Model</em>'.
	 * @generated
	 */
	ContenedorDetalleClienteViewModel createContenedorDetalleClienteViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Maestro Cliente View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Maestro Cliente View Model</em>'.
	 * @generated
	 */
	ContenedorMaestroClienteViewModel createContenedorMaestroClienteViewModel();

	/**
	 * Returns a new object of class '<em>Cliente View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cliente View Model</em>'.
	 * @generated
	 */
	ClienteViewModel createClienteViewModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContenedorcrudclientesPackage getContenedorcrudclientesPackage();

} //ContenedorcrudclientesFactory
