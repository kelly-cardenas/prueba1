/**
 */
package tiendacristal.ui.contenedorcrudproductos.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosFactory;
import tiendacristal.ui.contenedorcrudproductos.ProductosViewModel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Productos View Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductosViewModelTest extends TestCase {

	/**
	 * The fixture for this Productos View Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductosViewModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductosViewModelTest.class);
	}

	/**
	 * Constructs a new Productos View Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductosViewModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Productos View Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProductosViewModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Productos View Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductosViewModel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContenedorcrudproductosFactory.eINSTANCE.createProductosViewModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProductosViewModelTest
