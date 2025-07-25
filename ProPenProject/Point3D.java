public class Point3D extends Point2D {
    private double z;

    public Point3D() {
        this(0, 0, 0);
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setPosition(double x, double y, double z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    @Override
    public String getPosition() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
