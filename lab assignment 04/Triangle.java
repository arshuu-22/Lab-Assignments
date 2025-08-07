public class Triangle {
    private double sideA,sideB,sideC;
    
    private static int objectcounter = 0;

    //Default constructor with all sides equal to 1.0
    public  Triangle() {
        this(1.0,1.0,1.0);
        objectcounter++;
    }
    
    // one paramaterize constructor with all sides equal to side
     public Triangle(double side){
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
        objectcounter++;
    }

    //Two paramaterize constructor with sideA and sideB equal but sideC different
    public Triangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideB;
        objectcounter++;
    }    

    //Three parameterize constructors with all sides different
    public Triangle(double sideA, double sideB, double sideC){
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
    
    //Getters

    public double getsideA(){
        return sideA;
    }

    public double getsideB(){
        return sideB;
    }

    public double getsideC(){
        return sideC;
    }

    //Setters
    public void setsideA(double a){
        this.sideA = a;
    }

    public void setsideB(double b){
        this.sideB = b;
    }

    public void setsideC(double c){
        this.sideC = c;
    }
    

    //methods to calculate perimeter of triangle
    public double perimeter(){
        return sideA + sideB + sideC;
    }

    //method to check if triangle is right angled
    public boolean isRightAngled(){
         double a =sideA , b=sideB , c=sideC;
        
        return Math.abs(a * a + b * b - c * c) < 0.0001 ||
               Math.abs(a * a + c * c - b * b) < 0.0001 ||
               Math.abs(b * b + c * c - a * a) < 0.0001;            
    }

    //toString method to display triangle details
    @Override
    public String toString(){
        return "Triangle[sideA=" + sideA + ", sideB =  " + sideB + ", sideC = " + sideC + ", perimeter = " + perimeter() + "]";
    }
    
        //static method for number of  create objects
    public static int objectcount(){
        return objectcounter;
    }

}