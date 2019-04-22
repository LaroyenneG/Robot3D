/**
 * generated by Xtext 2.17.0
 */
package dume.compiler.dume;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dume.compiler.dume.Scripts#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see dume.compiler.dume.DumePackage#getScripts()
 * @model
 * @generated
 */
public interface Scripts extends EObject
{
  /**
   * Returns the value of the '<em><b>Script</b></em>' containment reference list.
   * The list contents are of type {@link dume.compiler.dume.Script}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script</em>' containment reference list.
   * @see dume.compiler.dume.DumePackage#getScripts_Script()
   * @model containment="true"
   * @generated
   */
  EList<Script> getScript();

} // Scripts
