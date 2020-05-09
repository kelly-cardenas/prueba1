/**
 */
package tiendacristal.domain.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tiendacristal.domain.Compra;
import tiendacristal.domain.DomainFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Compra</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompraTest extends TestCase {

	/**
	 * The fixture for this Compra test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Compra fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompraTest.class);
	}

	/**
	 * Constructs a new Compra test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompraTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Compra test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Compra fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Compra test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Compra getFixture() {
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
		setFixture(DomainFactory.eINSTANCE.createCompra());
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

} //CompraTest
