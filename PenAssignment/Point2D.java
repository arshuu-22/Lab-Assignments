public class Point2D {
    int x;
    int y;
   
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getx(){
        return x;
    }

    public int gety(){
        return y;
    }
    public void setx(int x){
        this.x = x;
    }
     
    public void sety(int y){
        this.y = y;
    }

    public void display(){
        System.out.println("point2D : "+ x + "," + y + ")");
    }
}
