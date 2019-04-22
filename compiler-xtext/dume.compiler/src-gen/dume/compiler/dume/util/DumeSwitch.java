/**
 * generated by Xtext 2.17.0
 */
package dume.compiler.dume.util;

import dume.compiler.dume.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see dume.compiler.dume.DumePackage
 * @generated
 */
public class DumeSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DumePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DumeSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DumePackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DumePackage.SCRIPTS:
      {
        Scripts scripts = (Scripts)theEObject;
        T result = caseScripts(scripts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DumePackage.SCRIPT:
      {
        Script script = (Script)theEObject;
        T result = caseScript(script);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DumePackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DumePackage.POINT3_D:
      {
        Point3D point3D = (Point3D)theEObject;
        T result = casePoint3D(point3D);
        if (result == null) result = casePoint(point3D);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DumePackage.POINT2_D:
      {
        Point2D point2D = (Point2D)theEObject;
        T result = casePoint2D(point2D);
        if (result == null) result = casePoint(point2D);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DumePackage.POINT:
      {
        Point point = (Point)theEObject;
        T result = casePoint(point);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DumePackage.SHAPE:
      {
        Shape shape = (Shape)theEObject;
        T result = caseShape(shape);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DumePackage.SHAPE3_D:
      {
        Shape3D shape3D = (Shape3D)theEObject;
        T result = caseShape3D(shape3D);
        if (result == null) result = caseShape(shape3D);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DumePackage.SHAPE2_D:
      {
        Shape2D shape2D = (Shape2D)theEObject;
        T result = caseShape2D(shape2D);
        if (result == null) result = caseShape(shape2D);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DumePackage.DRAWING:
      {
        Drawing drawing = (Drawing)theEObject;
        T result = caseDrawing(drawing);
        if (result == null) result = caseInstruction(drawing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DumePackage.CLEAR:
      {
        Clear clear = (Clear)theEObject;
        T result = caseClear(clear);
        if (result == null) result = caseInstruction(clear);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DumePackage.GO:
      {
        Go go = (Go)theEObject;
        T result = caseGo(go);
        if (result == null) result = caseInstruction(go);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DumePackage.CIRCLE:
      {
        Circle circle = (Circle)theEObject;
        T result = caseCircle(circle);
        if (result == null) result = caseShape(circle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DumePackage.LOOP:
      {
        Loop loop = (Loop)theEObject;
        T result = caseLoop(loop);
        if (result == null) result = caseInstruction(loop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scripts</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scripts</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScripts(Scripts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Script</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScript(Script object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point3 D</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point3 D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint3D(Point3D object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point2 D</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point2 D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint2D(Point2D object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint(Point object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShape(Shape object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape3 D</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape3 D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShape3D(Shape3D object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape2 D</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape2 D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShape2D(Shape2D object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drawing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drawing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDrawing(Drawing object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clear</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clear</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClear(Clear object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Go</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Go</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGo(Go object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCircle(Circle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoop(Loop object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DumeSwitch
