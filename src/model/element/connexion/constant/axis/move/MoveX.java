package model.element.connexion.constant.axis.move;

import model.ElementVisitor;
import model.element.connexion.constant.axis.AxisMove;

import javax.media.j3d.Transform3D;
import javax.vecmath.Vector3d;

public class MoveX extends AxisMove {

    public MoveX(double distance) {
        super(distance);
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public Transform3D applyTransformation(Transform3D transform3D) {

        super.applyTransformation(transform3D);

        transform3D.setTranslation(new Vector3d(getValue(), 0, 0));

        return transform3D;
    }

    @Override
    public void accept(ElementVisitor sv) {

    }
}
