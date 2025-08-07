public class Gardener {
    String Tools;
     
    public Gardener(String Tools) {
        this.Tools = Tools;
    }
    public String getTools() {
        return Tools;
    }   

    public void setTools(String Tools) {    
        this.Tools = Tools;
    }
    public void plantseeds(){
        System.out.println("Planting seeds with " + Tools + ".");
    }
    public void trimbushes(){
        System.out.println("Trimming bushes with " + Tools + ".");
    }

    public void show() {
        System.out.println("I am a gardener using " + Tools + " to take care of the garden.");
    }
    
}
