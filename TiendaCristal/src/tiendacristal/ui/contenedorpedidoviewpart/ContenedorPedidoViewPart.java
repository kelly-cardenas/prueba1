/**
 */
package tiendacristal.ui.contenedorpedidoviewpart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.ui.UI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Pedido View Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart#getUI <em>UI</em>}</li>
 * </ul>
 *
 * @see tiendacristal.ui.contenedorpedidoviewpart.ContenedorpedidoviewpartPackage#getContenedorPedidoViewPart()
 * @model
 * @generated
 */
public interface ContenedorPedidoViewPart extends EObject {
	/**
	 * Returns the value of the '<em><b>UI</b></em>' reference list.
	 * The list contents are of type {@link tiendacristal.ui.UI}.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.UI#getTheContenedorPedidoViewPart <em>The Contenedor Pedido View Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI</em>' reference list.
	 * @see tiendacristal.ui.contenedorpedidoviewpart.ContenedorpedidoviewpartPackage#getContenedorPedidoViewPart_UI()
	 * @see tiendacristal.ui.UI#getTheContenedorPedidoViewPart
	 * @model opposite="theContenedorPedidoViewPart"
	 * @generated
	 */
	EList<UI> getUI();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void crear();

} // ContenedorPedidoViewPart
