    public class Teddy extends Toy {
    String job;
    String color;
    
    public Teddy(String size, String color, String job) {
        super(size, color, job);
        this.color = color;
        this.job = job;
    } 

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getColor() {
        return color;
    }   

    public void setColor(String color) {
        this.color = color;
    }       

    @Override
    public void makenoise() {
        System.out.println("Grrr!");
  }


    @Override
    public void show() {
        System.out.println("I am a " + getColor() + " " + getType() + "who is a " + getJob() + ". Size: " + getSize() + ".");
    }

}
