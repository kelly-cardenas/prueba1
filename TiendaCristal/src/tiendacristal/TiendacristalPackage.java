/**
 */
package tiendacristal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tiendacristal.TiendacristalFactory
 * @model kind="package"
 * @generated
 */
public interface TiendacristalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tiendacristal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tiendacristal.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tiendacristal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TiendacristalPackage eINSTANCE = tiendacristal.impl.TiendacristalPackageImpl.init();

	/**
	 * The meta object id for the '{@link tiendacristal.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.impl.ModelFactoryImpl
	 * @see tiendacristal.impl.TiendacristalPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__THE_UI = 0;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__THE_DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY___IMPLEMENTAR_MODELO = 0;

	/**
	 * The operation id for the '<em>Guardar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY___GUARDAR = 1;

	/**
	 * The operation id for the '<em>Cargar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY___CARGAR = 2;

	/**
	 * The operation id for the '<em>Obtener Contenedor CRUD Cliente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY___OBTENER_CONTENEDOR_CRUD_CLIENTE = 3;

	/**
	 * The operation id for the '<em>Obtener UI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY___OBTENER_UI = 4;

	/**
	 * The number of operations of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_OPERATION_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link tiendacristal.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see tiendacristal.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ModelFactory#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The UI</em>'.
	 * @see tiendacristal.ModelFactory#getTheUI()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_TheUI();

	/**
	 * Returns the meta object for the containment reference '{@link tiendacristal.ModelFactory#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Domain</em>'.
	 * @see tiendacristal.ModelFactory#getTheDomain()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_TheDomain();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ModelFactory#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.ModelFactory#implementarModelo()
	 * @generated
	 */
	EOperation getModelFactory__ImplementarModelo();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ModelFactory#guardar() <em>Guardar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Guardar</em>' operation.
	 * @see tiendacristal.ModelFactory#guardar()
	 * @generated
	 */
	EOperation getModelFactory__Guardar();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ModelFactory#cargar() <em>Cargar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cargar</em>' operation.
	 * @see tiendacristal.ModelFactory#cargar()
	 * @generated
	 */
	EOperation getModelFactory__Cargar();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ModelFactory#obtenerContenedorCRUDCliente() <em>Obtener Contenedor CRUD Cliente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Obtener Contenedor CRUD Cliente</em>' operation.
	 * @see tiendacristal.ModelFactory#obtenerContenedorCRUDCliente()
	 * @generated
	 */
	EOperation getModelFactory__ObtenerContenedorCRUDCliente();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ModelFactory#obtenerUI() <em>Obtener UI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Obtener UI</em>' operation.
	 * @see tiendacristal.ModelFactory#obtenerUI()
	 * @generated
	 */
	EOperation getModelFactory__ObtenerUI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TiendacristalFactory getTiendacristalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tiendacristal.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.impl.ModelFactoryImpl
		 * @see tiendacristal.impl.TiendacristalPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>The UI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__THE_UI = eINSTANCE.getModelFactory_TheUI();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__THE_DOMAIN = eINSTANCE.getModelFactory_TheDomain();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_FACTORY___IMPLEMENTAR_MODELO = eINSTANCE.getModelFactory__ImplementarModelo();

		/**
		 * The meta object literal for the '<em><b>Guardar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_FACTORY___GUARDAR = eINSTANCE.getModelFactory__Guardar();

		/**
		 * The meta object literal for the '<em><b>Cargar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_FACTORY___CARGAR = eINSTANCE.getModelFactory__Cargar();

		/**
		 * The meta object literal for the '<em><b>Obtener Contenedor CRUD Cliente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_FACTORY___OBTENER_CONTENEDOR_CRUD_CLIENTE = eINSTANCE.getModelFactory__ObtenerContenedorCRUDCliente();

		/**
		 * The meta object literal for the '<em><b>Obtener UI</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_FACTORY___OBTENER_UI = eINSTANCE.getModelFactory__ObtenerUI();

	}

} //TiendacristalPackage
