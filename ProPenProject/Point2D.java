public class Point2D {
    private double x;
    private double y;

    public Point2D() {
        this(0, 0);
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getPosition() {
        return "(" + x + ", " + y + ")";
    }

    public void setPosition(double x, double y){
        this.x = x;
        this.y = y;
        System.out.println("point2d position set to:"+ getPosition());
    }
}

