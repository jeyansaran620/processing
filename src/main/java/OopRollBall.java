import processing.core.PApplet;

public class OopRollBall extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 15;
    public static final int NoOfBalls = 4;
    public Ball[] balls;

    public static void main(String[] args)
    {
        PApplet.main("OopRollBall", args);

    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);

        createBalls();
    }

    private void createBalls() {
        balls = new Ball[NoOfBalls];

        for(int i=0;i<NoOfBalls;i++)
        {
            balls[i] = new Ball(this,DIAMETER,(float)(HEIGHT* (i+1) * 0.2),i+1);
        }
    }

    @Override
    public void draw() {
        PaintBlack();

        for(Ball ball : balls)
        {
            ball.DrawCircle();
        }

    }

    private void PaintBlack() {
        background(0);
    }
}