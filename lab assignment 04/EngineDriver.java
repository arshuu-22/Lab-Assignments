public class EngineDriver{
 String trainmodel;
 String traincolor;
 String trainjob;   

 public EngineDriver(String trainmodel, String traincolor, String trainjob) {
     this.trainmodel = trainmodel;
     this.traincolor = traincolor;
     this.trainjob = trainjob;
 }
    public String getTrainModel() {
        return trainmodel;
    }   
    public void setTrainModel(String trainmodel) {
        this.trainmodel = trainmodel;
    }
    public String getTrainColor() {
        return traincolor;
    }   
    public void setTrainColor(String traincolor) {
        this.traincolor = traincolor;
    }   
    public String getTrainJob() {
        return trainjob;
    }   
    public void setTrainJob(String trainjob) {
        this.trainjob = trainjob;
    }
    public void checkEngine(){
        System.out.println("Checking engine of the train model: " + trainmodel + ", color: " + traincolor + ", job: " + trainjob);
    }

    public void blownwhistle(){
        System.out.println("Whistle blown for the train model: " + trainmodel + ", color: " + traincolor + ", job: " + trainjob);
    }

    public void show() {
        System.out.println("I am a " + traincolor + " train model " + trainmodel + " who is responsible for " + trainjob + ".");
    }
}