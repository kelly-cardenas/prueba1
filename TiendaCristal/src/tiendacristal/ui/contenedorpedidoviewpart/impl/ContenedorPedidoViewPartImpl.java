/**
 */
package tiendacristal.ui.contenedorpedidoviewpart.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tiendacristal.ui.UI;
import tiendacristal.ui.UiPackage;

import tiendacristal.ui.contenedorpedidoviewpart.ContenedorPedidoViewPart;
import tiendacristal.ui.contenedorpedidoviewpart.ContenedorpedidoviewpartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Pedido View Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tiendacristal.ui.contenedorpedidoviewpart.impl.ContenedorPedidoViewPartImpl#getUI <em>UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorPedidoViewPartImpl extends MinimalEObjectImpl.Container implements ContenedorPedidoViewPart {
	/**
	 * The cached value of the '{@link #getUI() <em>UI</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUI()
	 * @generated
	 * @ordered
	 */
	protected EList<UI> ui;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorPedidoViewPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorpedidoviewpartPackage.Literals.CONTENEDOR_PEDIDO_VIEW_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UI> getUI() {
		if (ui == null) {
			ui = new EObjectWithInverseResolvingEList<UI>(UI.class, this, ContenedorpedidoviewpartPackage.CONTENEDOR_PEDIDO_VIEW_PART__UI, UiPackage.UI__THE_CONTENEDOR_PEDIDO_VIEW_PART);
		}
		return ui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void crear() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorpedidoviewpartPackage.CONTENEDOR_PEDIDO_VIEW_PART__UI:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUI()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorpedidoviewpartPackage.CONTENEDOR_PEDIDO_VIEW_PART__UI:
				return ((InternalEList<?>)getUI()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContenedorpedidoviewpartPackage.CONTENEDOR_PEDIDO_VIEW_PART__UI:
				return getUI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContenedorpedidoviewpartPackage.CONTENEDOR_PEDIDO_VIEW_PART__UI:
				getUI().clear();
				getUI().addAll((Collection<? extends UI>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContenedorpedidoviewpartPackage.CONTENEDOR_PEDIDO_VIEW_PART__UI:
				getUI().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContenedorpedidoviewpartPackage.CONTENEDOR_PEDIDO_VIEW_PART__UI:
				return ui != null && !ui.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ContenedorpedidoviewpartPackage.CONTENEDOR_PEDIDO_VIEW_PART___IMPLEMENTAR_MODELO:
				implementarModelo();
				return null;
			case ContenedorpedidoviewpartPackage.CONTENEDOR_PEDIDO_VIEW_PART___CREAR:
				crear();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContenedorPedidoViewPartImpl
