public class Main {
    public static void main(String[] args) {
        // Create a new ProPen object
        ProPen pen = new ProPen("Parker", "Black");

        // Simulate real-world usage
        pen.call();
        pen.setPosition(10, 15, 5);
        pen.write("Hello World!");
        pen.draw("Circle");

        // Move again
        pen.setPosition(20, 25, 0);
        pen.write("Java Programming");
        pen.draw("Square");

        // Set pen not working
        pen.setWorking(false);
        pen.write("This won't be written.");
    }
}
