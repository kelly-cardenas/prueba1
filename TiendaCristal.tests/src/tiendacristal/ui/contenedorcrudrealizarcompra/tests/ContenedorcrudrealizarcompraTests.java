/**
 */
package tiendacristal.ui.contenedorcrudrealizarcompra.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>contenedorcrudrealizarcompra</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorcrudrealizarcompraTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ContenedorcrudrealizarcompraTests("contenedorcrudrealizarcompra Tests");
		suite.addTestSuite(ContenedorCRUDCompraViewModelTest.class);
		suite.addTestSuite(ContenedorDetalleCompraViewModelTest.class);
		suite.addTestSuite(ContenedorMaestroCompraViewModelTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudrealizarcompraTests(String name) {
		super(name);
	}

} //ContenedorcrudrealizarcompraTests
