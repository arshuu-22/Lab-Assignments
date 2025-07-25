public class Main {
    public static void main(String[] args) {
        Pen myPen = new Pen("Black","Ballpen", null);
        myPen.setposition(5, 10, 3);
        myPen.currentposition();
        myPen.write("Hello World");
        myPen.draw("Rectangle");
        myPen.call();
    }
    
}
