/**
 */
package tiendacristal;

import org.eclipse.emf.ecore.EObject;

import tiendacristal.domain.Domain;

import tiendacristal.ui.UI;

import tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ModelFactory#getTheUI <em>The UI</em>}</li>
 *   <li>{@link tiendacristal.ModelFactory#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @see tiendacristal.TiendacristalPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>The UI</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.ui.UI#getOwnedByModelFactory <em>Owned By Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' containment reference.
	 * @see #setTheUI(UI)
	 * @see tiendacristal.TiendacristalPackage#getModelFactory_TheUI()
	 * @see tiendacristal.ui.UI#getOwnedByModelFactory
	 * @model opposite="ownedByModelFactory" containment="true" required="true"
	 * @generated
	 */
	UI getTheUI();

	/**
	 * Sets the value of the '{@link tiendacristal.ModelFactory#getTheUI <em>The UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI</em>' containment reference.
	 * @see #getTheUI()
	 * @generated
	 */
	void setTheUI(UI value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tiendacristal.domain.Domain#getOwnedByModelFactory <em>Owned By Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' containment reference.
	 * @see #setTheDomain(Domain)
	 * @see tiendacristal.TiendacristalPackage#getModelFactory_TheDomain()
	 * @see tiendacristal.domain.Domain#getOwnedByModelFactory
	 * @model opposite="ownedByModelFactory" containment="true" required="true"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link tiendacristal.ModelFactory#getTheDomain <em>The Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' containment reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\t\tDomain domain = getTheDomain();\r\n\t\t\t\tUI ui = getTheUI();\r\n\t\t\r\n\t\t\t\tif (domain == null) {\r\n\t\t\r\n\t\t\t\t\tdomain = tiendacristal.domain.DomainFactory.eINSTANCE.createDomain();\r\n\t\t\r\n\t\t\t\t}\r\n\t\t\r\n\t\t\t\tif (ui == null) {\r\n\t\t\r\n\t\t\t\t\tui = tiendacristal.ui.UiFactory.eINSTANCE.createUI();\r\n\t\t\t\t}\r\n\t\t\r\n\t\t\t\tsetTheDomain(domain);\r\n\t\t\t\tsetTheUI(ui);\r\n\t\t\r\n\t\t\t\tui.setTheDomainAsociado(domain);\r\n\t\t\t\tdomain.setTheUIAsociado(ui);\r\n\t\t\r\n\t\t\t\tdomain.implementarModelo();\r\n\t\t\r\n\t\t\t\tui.implementarModelo();\r\n\t\t\r\n\t\t\t\treturn this;\r\n\t\t'"
	 * @generated
	 */
	ModelFactory implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tModelFactory modelFactory = this;\r\n\r\n\t\t// EXISTEN 2 FORMAS DE GUARDAR EL RECURSO\r\n\t\t// 1. SE GUARDA EN LA INSTACIA DE ECLIPSE DONDE SE VE LA PRODUCCION.\r\n\r\n\t\torg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI\r\n\t\t\t\t.createURI(\"platform:/resource/Test/Persistencia/model.tiendaCristal\");\r\n\r\n\t\t// 2. SE INDICA LA RUTA POR MEDIO DEL DIRECTORIO DE ARCHIVOS DE WIMDOWS\r\n\t\t// org.eclipse.emf.common.util.URI uri =\r\n\t\t// org.eclipse.emf.common.util.URI.createURI(\r\n\t\t// \"file:/E:/varios/td/whoownme/whoownme/whoownme.model/resource/model.whoownme\");\r\n\r\n\t\torg.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n\r\n\t\torg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n\t\tresource.getContents().add(modelFactory);\r\n\r\n\t\ttry {\r\n\r\n\t\t\tresource.save(java.util.Collections.EMPTY_MAP);\r\n\r\n\t\t} catch (java.io.IOException e) {\r\n\r\n\t\t\t// TO-DO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\r\n\t\treturn;'"
	 * @generated
	 */
	void guardar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tModelFactory modelFactory = null;\r\n\r\n\t\tTiendacristalPackage whoownmePackage = TiendacristalPackage.eINSTANCE;\r\n\t\torg.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n\r\n\t\t// EXISTEN 3 FORMAS DE CARGAR EL RECURSO\r\n\t\t// 1. CON LA SIGUIENTE RUTA (platform:/resource) SE CARGAR EL RECURSO CUANDO SE\r\n\t\t// HACE UNA NUEVA INSTANCIA DE ECLIPSE, EN DONDE SE CREA UN PROYECTO(test)\r\n\t\t// QUE CONTIENE LAS PRODUCCIONES, DONDE SE ESPECIFICA QUE RECURSO CARGAR\r\n\r\n\t\torg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI\r\n\t\t\t\t.createURI(\"platform:/resource/Test/Persistencia/model.tiendaCristal\");\r\n\r\n\t\t// 2.CON LA SIGUIENTE RUTA (platform:/plugin/) SE CARGAR EL RECURSO DE ALGUNOS\r\n\t\t// DE LOS PLUGINS(whoownme.model) EN LOS QUE SE ESTA TRABJANDO EN EL WORKSPACE\r\n\t\t// org.eclipse.emf.common.util.URI uri =\r\n\t\t// org.eclipse.emf.common.util.URI.createURI(\"platform:/plugin/whoownme.model/resource/model.whoownme\");\r\n\t\t// 3. CON LA SIGUIENTE RUTA (file:\\\\E:\\\\) SE CARGA EL RECURSO INDICANDO UNA RUTA\r\n\t\t// DESDE EL DIRECTORIO DE ARCHIVOS DE WIMDOWS\r\n\t\t// org.eclipse.emf.common.util.URI uri =\r\n\t\t// org.eclipse.emf.common.util.URI.createURI(\"file:\\\\E:\\\\varios\\\\td\\\\whoownme\\\\whoownme\\\\whoownme.model\\\\resource\\\\model.whoownme\");\r\n\r\n\t\torg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n\r\n\t\ttry {\r\n\r\n\t\t\tresource.load(null);\r\n\t\t\tmodelFactory = (ModelFactory) resource.getContents().get(0);\r\n\t\t\tSystem.out.println(\"loaded: \" + modelFactory);\r\n\r\n\t\t}\r\n\r\n\t\tcatch (java.io.IOException e) {\r\n\r\n\t\t\tSystem.out.println(\"failed to read \" + uri);\r\n\t\t\tSystem.out.println(e);\r\n\r\n\t\t}\r\n\r\n\t\treturn modelFactory;'"
	 * @generated
	 */
	ModelFactory cargar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ContenedorCRUDClienteViewModel obtenerContenedorCRUDCliente();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	UI obtenerUI();

} // ModelFactory
