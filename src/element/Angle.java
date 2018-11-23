package element;

public class Angle extends Constant {

    private double angle;

    public Angle(double angle) {

        this.angle = angle % (Math.PI * 2.0);
    }
}
