import java.util.ArrayList;
import java.util.Iterator;
 class vector implements Iterable<Double>, Cloneable {
    private ArrayList<Double> coordinates;
    private int dimension;

    // Default constructor
    public vector() {
        this.coordinates = new ArrayList<>();
        this.dimension = 0;
     }

    // Parameterized constructor
    public vector(ArrayList <Double> coordinates) {
        this.coordinates = new ArrayList<>(coordinates);  // Deep copy
        this.dimension = coordinates.size();
    }

    // Getters and Setters

    public Double get(int i) {
        return coordinates.get(i);
    }

    public void set(int i, Double coord) {
        coordinates.set(i, coord);
    }
    public int lenght() {
        return coordinates.size();
    }

    //for addition of verctors
    public vector add(vector other) {
        if (this.dimension != other.dimension) {
            throw new IllegalArgumentException("Vectors must be of the same dimension for addition.");
        }
        vector result = new vector();

    //for loop to add cooosponding elements
        for (int i = 0; i < this.dimension; i++) {
            result.coordinates.add(this.get(i) + other.get(i));
        }
        return result;
    }

    //for subtraction of vectors
    public vector subtract(vector other) {
        if (this.dimension != other.dimension) {
            throw new IllegalArgumentException("Vectors must be of the same dimension for subtraction.");
        }
        vector result = new vector();
        for (int i = 0; i < this.dimension; i++) {
            result.coordinates.add(this.get(i) - other.get(i));
        }
        return result;
    }

    //for cross product of vectors
    public vector crossProduct(vector other) {
        if (this.dimension != 3 || other.dimension != 3) {
            throw new IllegalArgumentException("Cross product is only defined for 3-dimensional vectors.");
        }
        if (this.dimension != other.dimension) {
            throw new IllegalArgumentException("Vectors must be of the same dimension for cross product.");
        }
        vector result = new vector();
        result.coordinates.add(this.get(1) * other.get(2) - this.get(2) * other.get(1)); // i component
        result.coordinates.add(this.get(2) * other.get(0) - this.get(0) * other.get(2)); // j component
        result.coordinates.add(this.get(0) * other.get(1) - this.get(1) * other.get(0)); // k component
        return result;
    }

    //for dot product of vectors
    public Double dotProduct(vector other) {    
        if (this.dimension != other.dimension) {
            throw new IllegalArgumentException("Vectors must be of the same dimension for dot product.");
        }
        Double result = 0.0;
        for (int i = 0; i < this.dimension; i++) {
            result += this.get(i) * other.get(i);
        }
        return result;
    }

    // for cloning the vector
    public vector clone() {
        return new vector(new ArrayList<>(this.coordinates)); // Deep copy
    }

    //for iterating through the vector
    public Iterator<Double> iterator() {
        return coordinates.iterator();
    }

    //for string representation of the vector
    public String toString() {
        return coordinates.toString();
 }
    
 //for equality check
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof vector)) return false;
    vector other = (vector) obj;
    return this.coordinates.equals(other.coordinates);
}

    

    

}

    

    

