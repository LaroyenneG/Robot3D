package robot.element.connexion.joint;

import com.sun.j3d.utils.universe.SimpleUniverse;

import javax.vecmath.Point3d;

public class Rotational extends Rotation {

    public Rotational(double value) {
        super(value);
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public Point3d changeFrame(Point3d frame) {
        return null;
    }

    @Override
    public void draw(SimpleUniverse universe) {

    }
}
