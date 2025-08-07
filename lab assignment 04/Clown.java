public class Clown {
    String customcolor;

    public Clown(String customcolor) {
        this.customcolor = customcolor;
    }
    public String getCustomColor() {
        return customcolor;
    }
    public void setCustomColor(String customcolor) {
        this.customcolor = customcolor;
    }
    public void performingmagictricks(){
        System.out.println("Performing magic tricks with " + customcolor + " costume.");
    }

    public void show(){
        System.out.println("I am a clown with a " + customcolor + " costume, entertaining everyone with my tricks.");
    }
    
}
