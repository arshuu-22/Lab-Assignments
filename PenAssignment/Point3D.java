public class Point3D extends Point2D {
    int x;
    int y;
    int z;

    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public int getx(){
        return x;
    }

    public int gety(){
        return y;
    }

    public int getz(){
        return z;
    }

    public void setx(double x2){
        this.x = (int) x2;
    }

    public void sety(double y2){
        this.y = (int) y2;
    }

    public void setz(int z){
        this.z = z;
    }

    public void display(){
        System.out.println("point3D :" + x + "," + y + "," + z + ")");
    }

     
}
