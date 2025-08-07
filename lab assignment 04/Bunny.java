public class Bunny {
     String size;
     String color;
     String job;  
     
        public Bunny(String size) { 
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
        public String getType() {
            return "Bunny ";
        }       

        public void makenoise() {
            System.out.println("Hop Hop!");
        }
        public void describe() {    
            System.out.println("I am a " + color + " " + getType() + "who is a " + job + ". Size: " + size + ".");
        }   

        @Override
        public String toString() {
            return "Bunny{" +
                    "size='" + size + '\'' +
                    ", color='" + color + '\'' +
                    ", job='" + job + '\'' +
                    '}';
        }

        
}

