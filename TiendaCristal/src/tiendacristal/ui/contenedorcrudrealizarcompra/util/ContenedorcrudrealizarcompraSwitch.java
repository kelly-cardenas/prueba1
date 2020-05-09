/**
 */
package tiendacristal.ui.contenedorcrudrealizarcompra.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tiendacristal.ui.contenedorcrudrealizarcompra.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage
 * @generated
 */
public class ContenedorcrudrealizarcompraSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorcrudrealizarcompraPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudrealizarcompraSwitch() {
		if (modelPackage == null) {
			modelPackage = ContenedorcrudrealizarcompraPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_CRUD_COMPRA_VIEW_MODEL: {
				ContenedorCRUDCompraViewModel contenedorCRUDCompraViewModel = (ContenedorCRUDCompraViewModel)theEObject;
				T result = caseContenedorCRUDCompraViewModel(contenedorCRUDCompraViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_DETALLE_COMPRA_VIEW_MODEL: {
				ContenedorDetalleCompraViewModel contenedorDetalleCompraViewModel = (ContenedorDetalleCompraViewModel)theEObject;
				T result = caseContenedorDetalleCompraViewModel(contenedorDetalleCompraViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcrudrealizarcompraPackage.CONTENEDOR_MAESTRO_COMPRA_VIEW_MODEL: {
				ContenedorMaestroCompraViewModel contenedorMaestroCompraViewModel = (ContenedorMaestroCompraViewModel)theEObject;
				T result = caseContenedorMaestroCompraViewModel(contenedorMaestroCompraViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcrudrealizarcompraPackage.COMPRA_VIEW_MODEL: {
				CompraViewModel compraViewModel = (CompraViewModel)theEObject;
				T result = caseCompraViewModel(compraViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor CRUD Compra View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor CRUD Compra View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorCRUDCompraViewModel(ContenedorCRUDCompraViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Detalle Compra View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Detalle Compra View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorDetalleCompraViewModel(ContenedorDetalleCompraViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Maestro Compra View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Maestro Compra View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorMaestroCompraViewModel(ContenedorMaestroCompraViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compra View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compra View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompraViewModel(CompraViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ContenedorcrudrealizarcompraSwitch
