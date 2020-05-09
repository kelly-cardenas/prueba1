/**
 */
package tiendacristal.domain.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tiendacristal.domain.Cliente;
import tiendacristal.domain.DomainFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClienteTest extends TestCase {

	/**
	 * The fixture for this Cliente test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cliente fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClienteTest.class);
	}

	/**
	 * Constructs a new Cliente test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cliente test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Cliente fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cliente test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cliente getFixture() {
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
		setFixture(DomainFactory.eINSTANCE.createCliente());
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

} //ClienteTest
