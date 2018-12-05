package view;


import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Sphere;
import model.ElementVisitor;
import model.element.Element;
import model.element.connexion.constant.axis.AxisRotation;
import model.element.connexion.constant.axis.move.MoveX;
import model.element.connexion.constant.axis.move.MoveY;
import model.element.connexion.constant.axis.move.MoveZ;
import model.element.connexion.joint.Rotation;
import model.element.connexion.joint.linear.Collinear;
import model.element.connexion.joint.linear.Orthogonal;
import model.element.terminal.organ.Default;

import javax.media.j3d.*;
import javax.vecmath.Color3f;
import javax.vecmath.Vector3d;
import java.awt.*;

public class ElementVirtualization implements ElementVisitor {

    private static final Color DEFAULT_COLOR = Color.BLACK;

    private static final double R_CYLINDER_MOVE = 0.01;

    private BranchGroup branchGroup;

    public ElementVirtualization() {
        branchGroup = new BranchGroup();
        branchGroup.setCapability(BranchGroup.ALLOW_DETACH);
    }

    public BranchGroup getResult() {
        return branchGroup;
    }

    private static Node buildCylinder(float r, float h, Color color) {

        Appearance appearance = new Appearance();
        ColoringAttributes coloringAttributes = new ColoringAttributes();
        coloringAttributes.setColor(new Color3f(color));
        appearance.setColoringAttributes(coloringAttributes);

        Transform3D transform3D = new Transform3D();

        transform3D.setTranslation(new Vector3d(0.0, h / 2.0, 0.0));

        TransformGroup transformGroup = new TransformGroup(transform3D);

        Cylinder cylinder = new Cylinder(r, h);
        cylinder.setAppearance(appearance);

        transformGroup.addChild(cylinder);

        return transformGroup;
    }

    private void addToScene(Node node, Element element) {

        TransformGroup transformGroup = new TransformGroup(element.getTransform3D());

        transformGroup.addChild(node);

        branchGroup.addChild(transformGroup);
    }

    @Override
    public void virtualizationDefault(Default organ) {

        Node cylinder = buildCylinder(0.01f, 0.1f, DEFAULT_COLOR);

        addToScene(cylinder, organ);
    }


    @Override
    public void virtualizationElement(Element element) {

        Sphere sphere = new Sphere(0.05f);

        addToScene(sphere, element);
    }

    @Override
    public void virtualizationMoveY(MoveY axisMove) {

        Node cylinder = buildCylinder((float) R_CYLINDER_MOVE, (float) axisMove.getValue(), DEFAULT_COLOR);

        addToScene(cylinder, axisMove);
    }

    @Override
    public void virtualizationMoveX(MoveX axisMove) {

        Node cylinder = buildCylinder((float) R_CYLINDER_MOVE, (float) axisMove.getValue(), DEFAULT_COLOR);

        Transform3D transform3D = new Transform3D();

        transform3D.rotZ(-Math.PI / 2.0);

        TransformGroup transformGroup = new TransformGroup(transform3D);

        transformGroup.addChild(cylinder);

        addToScene(transformGroup, axisMove);
    }

    @Override
    public void virtualizationMoveZ(MoveZ axisMove) {

        Node cylinder = buildCylinder((float) R_CYLINDER_MOVE, (float) axisMove.getValue(), DEFAULT_COLOR);

        Transform3D transform3D = new Transform3D();

        transform3D.rotX(Math.PI / 2.0);

        TransformGroup transformGroup = new TransformGroup(transform3D);

        transformGroup.addChild(cylinder);

        addToScene(transformGroup, axisMove);
    }

    @Override
    public void virtualizationAxisRotation(AxisRotation axisRotation) {

        Sphere sphere = new Sphere(0.01f);

        addToScene(sphere, axisRotation);
    }

    @Override
    public void virtualizationRotation(Rotation rotation) {

        Appearance appearance = new Appearance();
        ColoringAttributes coloringAttributes = new ColoringAttributes();
        coloringAttributes.setColor(new Color3f(Color.RED));
        appearance.setColoringAttributes(coloringAttributes);

        Sphere sphere = new Sphere(0.02f);
        sphere.setAppearance(appearance);

        addToScene(sphere, rotation);
    }

    @Override
    public void virtualizationCollinear(Collinear collinear) {

        Node cylinder = buildCylinder((float) R_CYLINDER_MOVE, (float) collinear.getValue(), Color.RED);

        addToScene(cylinder, collinear);
    }

    @Override
    public void virtualizationOrthogonal(Orthogonal orthogonal) {

        Node cylinder = buildCylinder((float) R_CYLINDER_MOVE, (float) orthogonal.getValue(), Color.RED);

        addToScene(cylinder, orthogonal);
    }
}