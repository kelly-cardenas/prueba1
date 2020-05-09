/**
 */
package tiendacristal.domain.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tiendacristal.domain.DistribuidoraCristal;
import tiendacristal.domain.DomainFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Distribuidora Cristal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DistribuidoraCristalTest extends TestCase {

	/**
	 * The fixture for this Distribuidora Cristal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistribuidoraCristal fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DistribuidoraCristalTest.class);
	}

	/**
	 * Constructs a new Distribuidora Cristal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistribuidoraCristalTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Distribuidora Cristal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DistribuidoraCristal fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Distribuidora Cristal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistribuidoraCristal getFixture() {
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
		setFixture(DomainFactory.eINSTANCE.createDistribuidoraCristal());
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

} //DistribuidoraCristalTest
