package model.element.connexion;

public abstract class Simple extends Connexion {

    @Override
    public boolean isSimple() {
        return true;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    public abstract boolean isJoint();
}
