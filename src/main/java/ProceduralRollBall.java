import processing.core.PApplet;

public class ProceduralRollBall extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 15;
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    public static void main(String[] args)
    {
        PApplet.main("ProceduralRollBall", args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        PaintBlack();
        DrawCircle();
    }

    private void DrawCircle() {
        ellipse(a, (float) (HEIGHT * 0.2),DIAMETER, DIAMETER);
        a++;
        ellipse(b,(float) (HEIGHT * 0.4),DIAMETER, DIAMETER);
        b+=2;
        ellipse(c,(float) (HEIGHT * 0.6),DIAMETER, DIAMETER);
        c+=3;
        ellipse(d,(float) (HEIGHT * 0.8),DIAMETER, DIAMETER);
        d+=4;
    }

    private void PaintBlack() {
        background(0);
    }
}