/**
 */
package tiendacristal.ui.contenedorcrudproductos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage
 * @generated
 */
public interface ContenedorcrudproductosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorcrudproductosFactory eINSTANCE = tiendacristal.ui.contenedorcrudproductos.impl.ContenedorcrudproductosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contenedor CRUD Productos View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor CRUD Productos View Model</em>'.
	 * @generated
	 */
	ContenedorCRUDProductosViewModel createContenedorCRUDProductosViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Detalle Productos Viewmodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Detalle Productos Viewmodel</em>'.
	 * @generated
	 */
	ContenedorDetalleProductosViewmodel createContenedorDetalleProductosViewmodel();

	/**
	 * Returns a new object of class '<em>Contenedor Mestro Productos View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Mestro Productos View Model</em>'.
	 * @generated
	 */
	ContenedorMestroProductosViewModel createContenedorMestroProductosViewModel();

	/**
	 * Returns a new object of class '<em>Productos View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Productos View Model</em>'.
	 * @generated
	 */
	ProductosViewModel createProductosViewModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContenedorcrudproductosPackage getContenedorcrudproductosPackage();

} //ContenedorcrudproductosFactory
