/**
 */
package tiendacristal.domain.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tiendacristal.domain.DomainFactory;
import tiendacristal.domain.ReciboPago;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Recibo Pago</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReciboPagoTest extends TestCase {

	/**
	 * The fixture for this Recibo Pago test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReciboPago fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReciboPagoTest.class);
	}

	/**
	 * Constructs a new Recibo Pago test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReciboPagoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Recibo Pago test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReciboPago fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Recibo Pago test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReciboPago getFixture() {
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
		setFixture(DomainFactory.eINSTANCE.createReciboPago());
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

} //ReciboPagoTest
