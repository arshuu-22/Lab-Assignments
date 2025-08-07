// Triangle.java
public class Triangle {
     double sideA;
     double sideB;
     double sideC;
    private static int objectcounter = 0;

    //Default cobstructor
    public Triangle() {
        this.sideA = 1;
        this.sideB = 1;
        this.sideC = 1;
        objectcounter++;
    }

    //Constructor with one parameter and all side equal
    public Triangle(double side) {
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
        objectcounter++;
    }

    //Constructor with two parameters with sideA and sideB are equal but sideC is different
    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideB;
        objectcounter++;
    }

    //Constructor with three parameters with all sides different
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        objectcounter++;
    }

    //Copy constructor
    public Triangle(Triangle t4) {
        this.sideA = t4.sideA;
        this.sideB = t4.sideB;
        this.sideC = t4.sideC;
        objectcounter++;
    }
    
    //Getters for the sides
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }

    //Setters for the sides
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public void setSideC(double sideC) {    
        this.sideC = sideC;
    }
    //Method to cslculate the perimeter
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    //Method to check if the triangle is right angled
    public boolean isRightAngled() {
        double a = sideA * sideA;
        double b = sideB * sideB;
        double c = sideC * sideC;
        return (a + b == c) || (a + c == b) || (b + c == a);
    }
    //toString method to display the triangle
    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", perimeter=" + perimeter() +
                '}';
    }

    //Static method to get the count of triangle objects created
    public static int objectcount() {
        return objectcounter;   
    }
}
    
