/**
 */
package tiendacristal.ui.contenedorpedidoviewpart;

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
 * @see tiendacristal.ui.contenedorpedidoviewpart.ContenedorpedidoviewpartFactory
 * @model kind="package"
 * @generated
 */
public interface ContenedorpedidoviewpartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenedorpedidoviewpart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tiendacristal/ui/contenedorpedidoviewpart.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tiendacristal.ui.contenedorpedidoviewpart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorpedidoviewpartPackage eINSTANCE = tiendacristal.ui.contenedorpedidoviewpart.impl.ContenedorpedidoviewpartPackageImpl.init();

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorpedidoviewpart.impl.ContenedorPedidoViewPartImpl <em>Contenedor Pedido View Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorpedidoviewpart.impl.ContenedorPedidoViewPartImpl
	 * @see tiendacristal.ui.contenedorpedidoviewpart.impl.ContenedorpedidoviewpartPackageImpl#getContenedorPedidoViewPart()
	 * @generated
	 */
	int CONTENEDOR_PEDIDO_VIEW_PART = 0;

	/**
	 * The feature id for the '<em><b>UI</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_PEDIDO_VIEW_PART__UI = 0;

	/**
	 * The number of structural features of the '<em>Contenedor Pedido View Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_PEDIDO_VIEW_PART_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Implementar Modelo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_PEDIDO_VIEW_PART___IMPLEMENTAR_MODELO = 0;

	/**
	 * The operation id for the '<em>Crear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_PEDIDO_VIEW_PART___CREAR = 1;

	/**
	 * The number of operations of the '<em>Contenedor Pedido View Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_PEDIDO_VIEW_PART_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link tiendacristal.ui.contenedorpedidoviewpart.impl.PedidoViewModelImpl <em>Pedido View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tiendacristal.ui.contenedorpedidoviewpart.impl.PedidoViewModelImpl
	 * @see tiendacristal.ui.contenedorpedidoviewpart.impl.ContenedorpedidoviewpartPackageImpl#getPedidoViewModel()
	 * @generated
	 */
	int PEDIDO_VIEW_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Pedido View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO_VIEW_MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Pedido View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO_VIEW_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart <em>Contenedor Pedido View Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Pedido View Part</em>'.
	 * @see tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart
	 * @generated
	 */
	EClass getContenedorPedidoViewPart();

	/**
	 * Returns the meta object for the reference list '{@link tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>UI</em>'.
	 * @see tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart#getUI()
	 * @see #getContenedorPedidoViewPart()
	 * @generated
	 */
	EReference getContenedorPedidoViewPart_UI();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart#implementarModelo() <em>Implementar Modelo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implementar Modelo</em>' operation.
	 * @see tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart#implementarModelo()
	 * @generated
	 */
	EOperation getContenedorPedidoViewPart__ImplementarModelo();

	/**
	 * Returns the meta object for the '{@link tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart#crear() <em>Crear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear</em>' operation.
	 * @see tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart#crear()
	 * @generated
	 */
	EOperation getContenedorPedidoViewPart__Crear();

	/**
	 * Returns the meta object for class '{@link tiendacristal.ui.contenedorpedidoviewpart.PedidoViewModel <em>Pedido View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedido View Model</em>'.
	 * @see tiendacristal.ui.contenedorpedidoviewpart.PedidoViewModel
	 * @generated
	 */
	EClass getPedidoViewModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenedorpedidoviewpartFactory getContenedorpedidoviewpartFactory();

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
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorpedidoviewpart.impl.ContenedorPedidoViewPartImpl <em>Contenedor Pedido View Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorpedidoviewpart.impl.ContenedorPedidoViewPartImpl
		 * @see tiendacristal.ui.contenedorpedidoviewpart.impl.ContenedorpedidoviewpartPackageImpl#getContenedorPedidoViewPart()
		 * @generated
		 */
		EClass CONTENEDOR_PEDIDO_VIEW_PART = eINSTANCE.getContenedorPedidoViewPart();

		/**
		 * The meta object literal for the '<em><b>UI</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_PEDIDO_VIEW_PART__UI = eINSTANCE.getContenedorPedidoViewPart_UI();

		/**
		 * The meta object literal for the '<em><b>Implementar Modelo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_PEDIDO_VIEW_PART___IMPLEMENTAR_MODELO = eINSTANCE.getContenedorPedidoViewPart__ImplementarModelo();

		/**
		 * The meta object literal for the '<em><b>Crear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR_PEDIDO_VIEW_PART___CREAR = eINSTANCE.getContenedorPedidoViewPart__Crear();

		/**
		 * The meta object literal for the '{@link tiendacristal.ui.contenedorpedidoviewpart.impl.PedidoViewModelImpl <em>Pedido View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tiendacristal.ui.contenedorpedidoviewpart.impl.PedidoViewModelImpl
		 * @see tiendacristal.ui.contenedorpedidoviewpart.impl.ContenedorpedidoviewpartPackageImpl#getPedidoViewModel()
		 * @generated
		 */
		EClass PEDIDO_VIEW_MODEL = eINSTANCE.getPedidoViewModel();

	}

} //ContenedorpedidoviewpartPackage
