/**
 */
package tiendacristal.domain.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tiendacristal.domain.DomainFactory;
import tiendacristal.domain.Vendedor;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vendedor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VendedorTest extends TestCase {

	/**
	 * The fixture for this Vendedor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vendedor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VendedorTest.class);
	}

	/**
	 * Constructs a new Vendedor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendedorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Vendedor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Vendedor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Vendedor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vendedor getFixture() {
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
		setFixture(DomainFactory.eINSTANCE.createVendedor());
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

} //VendedorTest
