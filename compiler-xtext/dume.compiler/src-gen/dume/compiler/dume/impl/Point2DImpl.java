/**
 * generated by Xtext 2.17.0
 */
package dume.compiler.dume.impl;

import dume.compiler.dume.DumePackage;
import dume.compiler.dume.Point2D;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point2 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dume.compiler.dume.impl.Point2DImpl#getI <em>I</em>}</li>
 *   <li>{@link dume.compiler.dume.impl.Point2DImpl#getJ <em>J</em>}</li>
 *   <li>{@link dume.compiler.dume.impl.Point2DImpl#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Point2DImpl extends PointImpl implements Point2D
{
  /**
   * The default value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected static final int I_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected int i = I_EDEFAULT;

  /**
   * The default value of the '{@link #getJ() <em>J</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJ()
   * @generated
   * @ordered
   */
  protected static final int J_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getJ() <em>J</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJ()
   * @generated
   * @ordered
   */
  protected int j = J_EDEFAULT;

  /**
   * The default value of the '{@link #getMap() <em>Map</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMap()
   * @generated
   * @ordered
   */
  protected static final String MAP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMap() <em>Map</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMap()
   * @generated
   * @ordered
   */
  protected String map = MAP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Point2DImpl()
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
    return DumePackage.Literals.POINT2_D;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setI(int newI)
  {
    int oldI = i;
    i = newI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DumePackage.POINT2_D__I, oldI, i));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getJ()
  {
    return j;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setJ(int newJ)
  {
    int oldJ = j;
    j = newJ;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DumePackage.POINT2_D__J, oldJ, j));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMap()
  {
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMap(String newMap)
  {
    String oldMap = map;
    map = newMap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DumePackage.POINT2_D__MAP, oldMap, map));
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
      case DumePackage.POINT2_D__I:
        return getI();
      case DumePackage.POINT2_D__J:
        return getJ();
      case DumePackage.POINT2_D__MAP:
        return getMap();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DumePackage.POINT2_D__I:
        setI((Integer)newValue);
        return;
      case DumePackage.POINT2_D__J:
        setJ((Integer)newValue);
        return;
      case DumePackage.POINT2_D__MAP:
        setMap((String)newValue);
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
      case DumePackage.POINT2_D__I:
        setI(I_EDEFAULT);
        return;
      case DumePackage.POINT2_D__J:
        setJ(J_EDEFAULT);
        return;
      case DumePackage.POINT2_D__MAP:
        setMap(MAP_EDEFAULT);
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
      case DumePackage.POINT2_D__I:
        return i != I_EDEFAULT;
      case DumePackage.POINT2_D__J:
        return j != J_EDEFAULT;
      case DumePackage.POINT2_D__MAP:
        return MAP_EDEFAULT == null ? map != null : !MAP_EDEFAULT.equals(map);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (i: ");
    result.append(i);
    result.append(", j: ");
    result.append(j);
    result.append(", map: ");
    result.append(map);
    result.append(')');
    return result.toString();
  }

} //Point2DImpl