package model;

import model.element.connexion.constant.axis.AxisMove;
import model.element.terminal.organ.Default;

public interface ElementVisitor {

    void virtualizedDefault(Default organ);

    void virtualizedMove(AxisMove axisMove);
}
