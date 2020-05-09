/**
 */
package tiendacristal.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.Inventario#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see tiendacristal.domain.DomainPackage#getInventario()
 * @model
 * @generated
 */
public interface Inventario extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Domain#getTheInventario <em>The Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see tiendacristal.domain.DomainPackage#getInventario_Domain()
	 * @see tiendacristal.domain.Domain#getTheInventario
	 * @model opposite="theInventario"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Inventario#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

} // Inventario
