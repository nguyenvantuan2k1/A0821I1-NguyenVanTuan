package _6_inheritance.exercise.point_and_moveablepoint;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed) {
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }
    public float[] getSpeed() {
        float array[] = new float[2];
        array[0] =this.getxSpeed();
        array[1] =this.getySpeed();
        return array;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "} ";
    }
    public Point move(){
        this.setX(this.getX() +getxSpeed());
        this.setY(this.getY() + getySpeed());
        return this;
    }
}
