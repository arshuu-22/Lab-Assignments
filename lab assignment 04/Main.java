public class Main {

    public static void main(String[] args) {
        // Using the gardener class 
        Gardener gardener = new Gardener("shovel");
        gardener.plantseeds();
        gardener.trimbushes();
        gardener.show();
        System.out.println();
        // Using the Clown class
        Clown clown = new Clown("red");
        clown.performingmagictricks();
        clown.show();
        System.out.println();
        // Using the Teddy class
        Teddy teddy = new Teddy("large", "brown", "cuddly");
        teddy.makenoise();
        teddy.show();
        System.out.println();
        // Using the BankManager class
        BankManager bankManager = new BankManager("National Bank", "Downtown");
        bankManager.countmoney();
        bankManager.Aproveloan();
        bankManager.show();
        System.out.println();
        // Using the Toy class
        Toy toy = new Teddy("medium", "blue", "playful");
        toy.makenoise();
        toy.show();
        System.out.println();
        // Using Bunny class
        Bunny bunny = new Bunny("small");
        bunny.setColor("white");
        bunny.setJob("hopping around");
        bunny.makenoise();
        bunny.describe();
        System.out.println("Bunny Size: " + bunny.getSize());
        System.out.println("Bunny Color: " + bunny.getColor());
        System.out.println("Bunny Job: " + bunny.getJob());
        System.out.println("Bunny Type: " + bunny.getType());
    }   

}