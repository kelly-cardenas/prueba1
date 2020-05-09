/**
 */
package tiendacristal.domain.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tiendacristal.domain.Administrador;
import tiendacristal.domain.DomainFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Administrador</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdministradorTest extends TestCase {

	/**
	 * The fixture for this Administrador test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Administrador fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdministradorTest.class);
	}

	/**
	 * Constructs a new Administrador test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministradorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Administrador test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Administrador fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Administrador test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Administrador getFixture() {
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
		setFixture(DomainFactory.eINSTANCE.createAdministrador());
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

} //AdministradorTest
