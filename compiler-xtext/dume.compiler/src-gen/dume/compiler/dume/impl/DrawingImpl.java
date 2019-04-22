/**
 * generated by Xtext 2.17.0
 */
package dume.compiler.dume.impl;

import dume.compiler.dume.Drawing;
import dume.compiler.dume.DumePackage;
import dume.compiler.dume.Shape;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drawing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dume.compiler.dume.impl.DrawingImpl#getShapes <em>Shapes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DrawingImpl extends InstructionImpl implements Drawing
{
  /**
   * The cached value of the '{@link #getShapes() <em>Shapes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShapes()
   * @generated
   * @ordered
   */
  protected EList<Shape> shapes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DrawingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DumePackage.Literals.DRAWING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Shape> getShapes()
  {
    if (shapes == null)
    {
      shapes = new EObjectContainmentEList<Shape>(Shape.class, this, DumePackage.DRAWING__SHAPES);
    }
    return shapes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DumePackage.DRAWING__SHAPES:
        return ((InternalEList<?>)getShapes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DumePackage.DRAWING__SHAPES:
        return getShapes();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DumePackage.DRAWING__SHAPES:
        getShapes().clear();
        getShapes().addAll((Collection<? extends Shape>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DumePackage.DRAWING__SHAPES:
        getShapes().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DumePackage.DRAWING__SHAPES:
        return shapes != null && !shapes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DrawingImpl
