package model.element.connexion.constant.axis.rotation;

import model.ElementVisitor;
import model.element.connexion.constant.axis.AxisRotation;

import javax.media.j3d.Transform3D;

public class Yawing extends AxisRotation {

    public Yawing(double value) {
        super(value);
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public Transform3D applyTransformation(Transform3D transform3D) {
        return null;
    }

    @Override
    public void accept(ElementVisitor sv) {

    }
}