/**
 * generated by Xtext 2.17.0
 */
package dume.compiler.dume;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drawing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dume.compiler.dume.Drawing#getShapes <em>Shapes</em>}</li>
 * </ul>
 *
 * @see dume.compiler.dume.DumePackage#getDrawing()
 * @model
 * @generated
 */
public interface Drawing extends Instruction
{
  /**
   * Returns the value of the '<em><b>Shapes</b></em>' containment reference list.
   * The list contents are of type {@link dume.compiler.dume.Shape}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shapes</em>' containment reference list.
   * @see dume.compiler.dume.DumePackage#getDrawing_Shapes()
   * @model containment="true"
   * @generated
   */
  EList<Shape> getShapes();

} // Drawing
