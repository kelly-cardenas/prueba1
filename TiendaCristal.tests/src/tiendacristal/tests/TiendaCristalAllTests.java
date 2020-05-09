/**
 */
package tiendacristal.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import tiendacristal.domain.tests.DomainTests;

import tiendacristal.ui.contenedorcrudclientes.tests.ContenedorcrudclientesTests;

import tiendacristal.ui.contenedorcrudpedido.tests.ContenedorcrudpedidoTests;

import tiendacristal.ui.contenedorcrudproductos.tests.ContenedorcrudproductosTests;

import tiendacristal.ui.contenedorcrudrealizarcompra.tests.ContenedorcrudrealizarcompraTests;

import tiendacristal.ui.contenedorpedidoviewpart.tests.ContenedorpedidoviewpartTests;

import tiendacristal.ui.tests.UiTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>TiendaCristal</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class TiendaCristalAllTests extends TestSuite {

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
		TestSuite suite = new TiendaCristalAllTests("TiendaCristal Tests");
		suite.addTest(TiendacristalTests.suite());
		suite.addTest(UiTests.suite());
		suite.addTest(ContenedorcrudproductosTests.suite());
		suite.addTest(ContenedorcrudclientesTests.suite());
		suite.addTest(ContenedorcrudrealizarcompraTests.suite());
		suite.addTest(ContenedorcrudpedidoTests.suite());
		suite.addTest(ContenedorpedidoviewpartTests.suite());
		suite.addTest(DomainTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiendaCristalAllTests(String name) {
		super(name);
	}

} //TiendaCristalAllTests
