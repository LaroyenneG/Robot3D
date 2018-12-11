package model.dume.components;

import model.dume.DumE;
import model.element.connexion.Composite;
import model.element.connexion.Simple;
import model.element.connexion.constant.axis.distance.Distance;
import model.element.connexion.joint.rotation.Rotational;

public class Girder extends Composite {

    private static final Rotational Q2 = new Rotational(0.0, -Math.PI / 6.0, Math.PI / 4.0);
    private static final Distance D3 = new Distance(4.5 * DumE.MULTIPLIER);

    public Girder() {
        super((Simple) Q2.clone(), D3);
    }
}
