public class Pen{
    String type;
    String color;
    String brand;
    private Point3D position;

    public Pen(String color, String type, String brand){
        this.color = color;
        this.brand = brand;
        this.type = type;
        this.position =new Point3D(0, 0, 0);
    }

    public void write(String text){
        System.out.println("writing \"" + text + "\" in " + color + "color with" + brand + "pen.");
    }

    public void draw(String shape){
    System.out.println("Drawing a"+ shape +"at position:("+ position.getx() + "," +position.gety() + ","+ position.getz()+ ")" );
    }

    public void setposition(int x, double y, int z){
        position.setx(x);
        position.sety(y);
        position.setz(z);
        System.out.println("pen position set to: (" + x + ","+ y + ","+ z + ")" );
    }

    public void currentposition(){
        System.out.println("Current position: (" + position.getx() +","+position.gety() +","+position.getz() + ")");
    }

    public void call(){
        System.out.println("Calling the pen function for disgnostics...");
            currentposition();
            write("simple text");
            draw("circle");
    }
}