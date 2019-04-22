/**
 * generated by Xtext 2.17.0
 */
package dume.compiler.dume;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dume.compiler.dume.DumeFactory
 * @model kind="package"
 * @generated
 */
public interface DumePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dume";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.compiler.dume/Dume";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dume";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DumePackage eINSTANCE = dume.compiler.dume.impl.DumePackageImpl.init();

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.ScriptsImpl <em>Scripts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.ScriptsImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getScripts()
   * @generated
   */
  int SCRIPTS = 0;

  /**
   * The feature id for the '<em><b>Script</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPTS__SCRIPT = 0;

  /**
   * The number of structural features of the '<em>Scripts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.ScriptImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__NAME = 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__INSTRUCTIONS = 1;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.InstructionImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 2;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.PointImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getPoint()
   * @generated
   */
  int POINT = 5;

  /**
   * The number of structural features of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.Point3DImpl <em>Point3 D</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.Point3DImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getPoint3D()
   * @generated
   */
  int POINT3_D = 3;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT3_D__X = POINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT3_D__Y = POINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT3_D__Z = POINT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Point3 D</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT3_D_FEATURE_COUNT = POINT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.Point2DImpl <em>Point2 D</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.Point2DImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getPoint2D()
   * @generated
   */
  int POINT2_D = 4;

  /**
   * The feature id for the '<em><b>I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT2_D__I = POINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>J</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT2_D__J = POINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Map</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT2_D__MAP = POINT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Point2 D</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT2_D_FEATURE_COUNT = POINT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.ShapeImpl <em>Shape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.ShapeImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getShape()
   * @generated
   */
  int SHAPE = 6;

  /**
   * The number of structural features of the '<em>Shape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.Shape3DImpl <em>Shape3 D</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.Shape3DImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getShape3D()
   * @generated
   */
  int SHAPE3_D = 7;

  /**
   * The feature id for the '<em><b>Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE3_D__POINTS = SHAPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Shape3 D</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE3_D_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.Shape2DImpl <em>Shape2 D</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.Shape2DImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getShape2D()
   * @generated
   */
  int SHAPE2_D = 8;

  /**
   * The feature id for the '<em><b>Map</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE2_D__MAP = SHAPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE2_D__POINTS = SHAPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Shape2 D</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE2_D_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.DrawingImpl <em>Drawing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.DrawingImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getDrawing()
   * @generated
   */
  int DRAWING = 9;

  /**
   * The feature id for the '<em><b>Shapes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWING__SHAPES = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Drawing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWING_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.ClearImpl <em>Clear</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.ClearImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getClear()
   * @generated
   */
  int CLEAR = 10;

  /**
   * The number of structural features of the '<em>Clear</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.GoImpl <em>Go</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.GoImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getGo()
   * @generated
   */
  int GO = 11;

  /**
   * The feature id for the '<em><b>Point</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO__POINT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Go</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.CircleImpl <em>Circle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.CircleImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getCircle()
   * @generated
   */
  int CIRCLE = 12;

  /**
   * The feature id for the '<em><b>Point</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CIRCLE__POINT = SHAPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CIRCLE__RADIUS = SHAPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Map</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CIRCLE__MAP = SHAPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Circle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CIRCLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dume.compiler.dume.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dume.compiler.dume.impl.LoopImpl
   * @see dume.compiler.dume.impl.DumePackageImpl#getLoop()
   * @generated
   */
  int LOOP = 13;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__N = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Scripts <em>Scripts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scripts</em>'.
   * @see dume.compiler.dume.Scripts
   * @generated
   */
  EClass getScripts();

  /**
   * Returns the meta object for the containment reference list '{@link dume.compiler.dume.Scripts#getScript <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Script</em>'.
   * @see dume.compiler.dume.Scripts#getScript()
   * @see #getScripts()
   * @generated
   */
  EReference getScripts_Script();

  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see dume.compiler.dume.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the attribute '{@link dume.compiler.dume.Script#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dume.compiler.dume.Script#getName()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dume.compiler.dume.Script#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see dume.compiler.dume.Script#getInstructions()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Instructions();

  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see dume.compiler.dume.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Point3D <em>Point3 D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point3 D</em>'.
   * @see dume.compiler.dume.Point3D
   * @generated
   */
  EClass getPoint3D();

  /**
   * Returns the meta object for the attribute '{@link dume.compiler.dume.Point3D#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see dume.compiler.dume.Point3D#getX()
   * @see #getPoint3D()
   * @generated
   */
  EAttribute getPoint3D_X();

  /**
   * Returns the meta object for the attribute '{@link dume.compiler.dume.Point3D#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see dume.compiler.dume.Point3D#getY()
   * @see #getPoint3D()
   * @generated
   */
  EAttribute getPoint3D_Y();

  /**
   * Returns the meta object for the attribute '{@link dume.compiler.dume.Point3D#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Z</em>'.
   * @see dume.compiler.dume.Point3D#getZ()
   * @see #getPoint3D()
   * @generated
   */
  EAttribute getPoint3D_Z();

  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Point2D <em>Point2 D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point2 D</em>'.
   * @see dume.compiler.dume.Point2D
   * @generated
   */
  EClass getPoint2D();

  /**
   * Returns the meta object for the attribute '{@link dume.compiler.dume.Point2D#getI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>I</em>'.
   * @see dume.compiler.dume.Point2D#getI()
   * @see #getPoint2D()
   * @generated
   */
  EAttribute getPoint2D_I();

  /**
   * Returns the meta object for the attribute '{@link dume.compiler.dume.Point2D#getJ <em>J</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>J</em>'.
   * @see dume.compiler.dume.Point2D#getJ()
   * @see #getPoint2D()
   * @generated
   */
  EAttribute getPoint2D_J();

  /**
   * Returns the meta object for the attribute '{@link dume.compiler.dume.Point2D#getMap <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Map</em>'.
   * @see dume.compiler.dume.Point2D#getMap()
   * @see #getPoint2D()
   * @generated
   */
  EAttribute getPoint2D_Map();

  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see dume.compiler.dume.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Shape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape</em>'.
   * @see dume.compiler.dume.Shape
   * @generated
   */
  EClass getShape();

  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Shape3D <em>Shape3 D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape3 D</em>'.
   * @see dume.compiler.dume.Shape3D
   * @generated
   */
  EClass getShape3D();

  /**
   * Returns the meta object for the containment reference list '{@link dume.compiler.dume.Shape3D#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Points</em>'.
   * @see dume.compiler.dume.Shape3D#getPoints()
   * @see #getShape3D()
   * @generated
   */
  EReference getShape3D_Points();

  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Shape2D <em>Shape2 D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape2 D</em>'.
   * @see dume.compiler.dume.Shape2D
   * @generated
   */
  EClass getShape2D();

  /**
   * Returns the meta object for the attribute '{@link dume.compiler.dume.Shape2D#getMap <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Map</em>'.
   * @see dume.compiler.dume.Shape2D#getMap()
   * @see #getShape2D()
   * @generated
   */
  EAttribute getShape2D_Map();

  /**
   * Returns the meta object for the containment reference list '{@link dume.compiler.dume.Shape2D#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Points</em>'.
   * @see dume.compiler.dume.Shape2D#getPoints()
   * @see #getShape2D()
   * @generated
   */
  EReference getShape2D_Points();

  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Drawing <em>Drawing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drawing</em>'.
   * @see dume.compiler.dume.Drawing
   * @generated
   */
  EClass getDrawing();

  /**
   * Returns the meta object for the containment reference list '{@link dume.compiler.dume.Drawing#getShapes <em>Shapes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shapes</em>'.
   * @see dume.compiler.dume.Drawing#getShapes()
   * @see #getDrawing()
   * @generated
   */
  EReference getDrawing_Shapes();

  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Clear <em>Clear</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clear</em>'.
   * @see dume.compiler.dume.Clear
   * @generated
   */
  EClass getClear();

  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Go <em>Go</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Go</em>'.
   * @see dume.compiler.dume.Go
   * @generated
   */
  EClass getGo();

  /**
   * Returns the meta object for the containment reference '{@link dume.compiler.dume.Go#getPoint <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Point</em>'.
   * @see dume.compiler.dume.Go#getPoint()
   * @see #getGo()
   * @generated
   */
  EReference getGo_Point();

  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Circle <em>Circle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Circle</em>'.
   * @see dume.compiler.dume.Circle
   * @generated
   */
  EClass getCircle();

  /**
   * Returns the meta object for the containment reference '{@link dume.compiler.dume.Circle#getPoint <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Point</em>'.
   * @see dume.compiler.dume.Circle#getPoint()
   * @see #getCircle()
   * @generated
   */
  EReference getCircle_Point();

  /**
   * Returns the meta object for the attribute '{@link dume.compiler.dume.Circle#getRadius <em>Radius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Radius</em>'.
   * @see dume.compiler.dume.Circle#getRadius()
   * @see #getCircle()
   * @generated
   */
  EAttribute getCircle_Radius();

  /**
   * Returns the meta object for the attribute '{@link dume.compiler.dume.Circle#getMap <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Map</em>'.
   * @see dume.compiler.dume.Circle#getMap()
   * @see #getCircle()
   * @generated
   */
  EAttribute getCircle_Map();

  /**
   * Returns the meta object for class '{@link dume.compiler.dume.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop</em>'.
   * @see dume.compiler.dume.Loop
   * @generated
   */
  EClass getLoop();

  /**
   * Returns the meta object for the attribute '{@link dume.compiler.dume.Loop#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see dume.compiler.dume.Loop#getN()
   * @see #getLoop()
   * @generated
   */
  EAttribute getLoop_N();

  /**
   * Returns the meta object for the containment reference list '{@link dume.compiler.dume.Loop#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see dume.compiler.dume.Loop#getInstructions()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Instructions();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DumeFactory getDumeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.ScriptsImpl <em>Scripts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.ScriptsImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getScripts()
     * @generated
     */
    EClass SCRIPTS = eINSTANCE.getScripts();

    /**
     * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPTS__SCRIPT = eINSTANCE.getScripts_Script();

    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.ScriptImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__NAME = eINSTANCE.getScript_Name();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__INSTRUCTIONS = eINSTANCE.getScript_Instructions();

    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.InstructionImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.Point3DImpl <em>Point3 D</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.Point3DImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getPoint3D()
     * @generated
     */
    EClass POINT3_D = eINSTANCE.getPoint3D();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT3_D__X = eINSTANCE.getPoint3D_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT3_D__Y = eINSTANCE.getPoint3D_Y();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT3_D__Z = eINSTANCE.getPoint3D_Z();

    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.Point2DImpl <em>Point2 D</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.Point2DImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getPoint2D()
     * @generated
     */
    EClass POINT2_D = eINSTANCE.getPoint2D();

    /**
     * The meta object literal for the '<em><b>I</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT2_D__I = eINSTANCE.getPoint2D_I();

    /**
     * The meta object literal for the '<em><b>J</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT2_D__J = eINSTANCE.getPoint2D_J();

    /**
     * The meta object literal for the '<em><b>Map</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT2_D__MAP = eINSTANCE.getPoint2D_Map();

    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.PointImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getPoint()
     * @generated
     */
    EClass POINT = eINSTANCE.getPoint();

    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.ShapeImpl <em>Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.ShapeImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getShape()
     * @generated
     */
    EClass SHAPE = eINSTANCE.getShape();

    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.Shape3DImpl <em>Shape3 D</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.Shape3DImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getShape3D()
     * @generated
     */
    EClass SHAPE3_D = eINSTANCE.getShape3D();

    /**
     * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE3_D__POINTS = eINSTANCE.getShape3D_Points();

    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.Shape2DImpl <em>Shape2 D</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.Shape2DImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getShape2D()
     * @generated
     */
    EClass SHAPE2_D = eINSTANCE.getShape2D();

    /**
     * The meta object literal for the '<em><b>Map</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE2_D__MAP = eINSTANCE.getShape2D_Map();

    /**
     * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE2_D__POINTS = eINSTANCE.getShape2D_Points();

    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.DrawingImpl <em>Drawing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.DrawingImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getDrawing()
     * @generated
     */
    EClass DRAWING = eINSTANCE.getDrawing();

    /**
     * The meta object literal for the '<em><b>Shapes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DRAWING__SHAPES = eINSTANCE.getDrawing_Shapes();

    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.ClearImpl <em>Clear</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.ClearImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getClear()
     * @generated
     */
    EClass CLEAR = eINSTANCE.getClear();

    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.GoImpl <em>Go</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.GoImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getGo()
     * @generated
     */
    EClass GO = eINSTANCE.getGo();

    /**
     * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GO__POINT = eINSTANCE.getGo_Point();

    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.CircleImpl <em>Circle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.CircleImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getCircle()
     * @generated
     */
    EClass CIRCLE = eINSTANCE.getCircle();

    /**
     * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CIRCLE__POINT = eINSTANCE.getCircle_Point();

    /**
     * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

    /**
     * The meta object literal for the '<em><b>Map</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CIRCLE__MAP = eINSTANCE.getCircle_Map();

    /**
     * The meta object literal for the '{@link dume.compiler.dume.impl.LoopImpl <em>Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dume.compiler.dume.impl.LoopImpl
     * @see dume.compiler.dume.impl.DumePackageImpl#getLoop()
     * @generated
     */
    EClass LOOP = eINSTANCE.getLoop();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOP__N = eINSTANCE.getLoop_N();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__INSTRUCTIONS = eINSTANCE.getLoop_Instructions();

  }

} //DumePackage
