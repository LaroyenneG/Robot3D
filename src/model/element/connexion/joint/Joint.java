package model.element.connexion.joint;

import model.element.connexion.SimpleConnexion;

public abstract class Joint extends SimpleConnexion {

    private double value;

    public Joint(double value) {
        this.value = clearValue(value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = clearValue(value);
    }

    public double clearValue(double v) {
        return v;
    }

    @Override
    public boolean isJoint() {
        return true;
    }
}