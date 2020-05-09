/**
 */
package tiendacristal.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrador</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.domain.Administrador#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see tiendacristal.domain.DomainPackage#getAdministrador()
 * @model
 * @generated
 */
public interface Administrador extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Domain#getTheAdministrador <em>The Administrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see tiendacristal.domain.DomainPackage#getAdministrador_Domain()
	 * @see tiendacristal.domain.Domain#getTheAdministrador
	 * @model opposite="theAdministrador"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link tiendacristal.domain.Administrador#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

} // Administrador
