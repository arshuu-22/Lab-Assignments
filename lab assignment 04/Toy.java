//base class for all cuddle toys
abstract class Toy {
String color;
String size;
String job;
 String Type;

//constructor   
public Toy(String size,  String color, String job) {
    this.size = size;
    this.color = color;
    this.job = job;
}


//Getters and Setters    
public void  setsize(String size) {
    this.size = size;
}

public String getSize() {
    return size;

}

public void setJob(String job) {
    this.job = job;
}

public String getJob() {
    return job;
}
public void setColor(String color) {
    this.color = color;
}

public String getColor() {
    return color;
}

public  String getType() {
    return "CuddleToy ";
}
public void setType(String type) {
    this.Type = type;
}



public void makenoise(){
    System.out.println("Generic toy noise!");
}

public void show() {
    System.out.println("I am a " + color + " " + getType() + "who is a " + job + " Size: " + ".");
}
}
