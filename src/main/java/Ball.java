import processing.core.PApplet;

public class Ball {
    private final int DIAMETER;
    private final int SPEED;
    private int XPosition = 0;
    private final float YPosition;
    private  PApplet PARENT;

    public Ball(PApplet PARENT, int DIAMETER, float YPosition, int SPEED) {
        this.DIAMETER = DIAMETER;
        this.SPEED = SPEED;
        this.YPosition = YPosition;
        this.PARENT = PARENT;
    }

    void DrawCircle() {
        PARENT.ellipse(XPosition, YPosition,DIAMETER, DIAMETER);
        this.XPosition += this.SPEED;
    }
}
