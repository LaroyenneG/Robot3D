/**
 * generated by Xtext 2.17.0
 */
package dume.compiler.dume;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dume.compiler.dume.Point3D#getX <em>X</em>}</li>
 *   <li>{@link dume.compiler.dume.Point3D#getY <em>Y</em>}</li>
 *   <li>{@link dume.compiler.dume.Point3D#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see dume.compiler.dume.DumePackage#getPoint3D()
 * @model
 * @generated
 */
public interface Point3D extends Point
{
  /**
   * Returns the value of the '<em><b>X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' containment reference.
   * @see #setX(dume.compiler.dume.Number)
   * @see dume.compiler.dume.DumePackage#getPoint3D_X()
   * @model containment="true"
   * @generated
   */
  dume.compiler.dume.Number getX();

  /**
   * Sets the value of the '{@link dume.compiler.dume.Point3D#getX <em>X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' containment reference.
   * @see #getX()
   * @generated
   */
  void setX(dume.compiler.dume.Number value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' containment reference.
   * @see #setY(dume.compiler.dume.Number)
   * @see dume.compiler.dume.DumePackage#getPoint3D_Y()
   * @model containment="true"
   * @generated
   */
  dume.compiler.dume.Number getY();

  /**
   * Sets the value of the '{@link dume.compiler.dume.Point3D#getY <em>Y</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' containment reference.
   * @see #getY()
   * @generated
   */
  void setY(dume.compiler.dume.Number value);

  /**
   * Returns the value of the '<em><b>Z</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Z</em>' containment reference.
   * @see #setZ(dume.compiler.dume.Number)
   * @see dume.compiler.dume.DumePackage#getPoint3D_Z()
   * @model containment="true"
   * @generated
   */
  dume.compiler.dume.Number getZ();

  /**
   * Sets the value of the '{@link dume.compiler.dume.Point3D#getZ <em>Z</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Z</em>' containment reference.
   * @see #getZ()
   * @generated
   */
  void setZ(dume.compiler.dume.Number value);

} // Point3D
