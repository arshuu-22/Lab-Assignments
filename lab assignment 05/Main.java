public class Main {
    public static void main(String[] args) {
        // Create triangle objects using different construtir
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(5);
        Triangle t3 = new Triangle(4,6);
        Triangle t4 = new Triangle(3,4,5);
        Triangle t5 = new Triangle(t4);

        // Display the triangles
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4 + " is right angled?" + t4.isRightAngled());
        System.out.println(t5);

        System.out.println("Total number of triangle objects created: " + Triangle.objectcount());
    }

}    
