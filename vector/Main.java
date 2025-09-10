import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> coords1 = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
        ArrayList<Double> coords2 = new ArrayList<>(Arrays.asList(4.0, 5.0, 6.0));

        vector v1 = new vector(coords1);
        vector v2 = new vector(coords2);

        vector sum = v1.add(v2);
        System.out.println("sum of v1 and v2 is: " + sum);
        vector diff = v1.subtract(v2);
        System.out.println("diff of v1 and v2 is: " + diff);
        //dot product
        System.out.println("dot product of v1 and v2 is: " + v1.dotProduct(v2));

        //cross product
        System.out.println("cross product of v1 and v2 is: " + v1.crossProduct(v2));

        //cloning
        vector clonevector = v1.clone();
        System.out.println("clone of v1 is: " + clonevector);

        //modifying original vector to show deep copy
        coords1.set(0, 10.0);
        System.out.println("After modifying coords1, v1 is: " + v1);

        //check equality
        System.out.println("v1 equals clonevector: " + v1.equals(clonevector));

        //iterating over elements of vector2
        System.out.println("iterating over elements of v2:");
        for (Double coord : v2) {
            System.out.println(coord);
        }

        //toString representation
        System.out.println("String representation of v1: " + v1.toString());
    }
    
}
