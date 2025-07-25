public class ProPen {
    private String brand;
    private String inkColor;
    private Point3D currentPosition;
    private boolean isWorking;

    public ProPen(String brand, String inkColor) {
        this.brand = brand;
        this.inkColor = inkColor;
        this.currentPosition = new Point3D(0, 0, 0);
        this.isWorking = true;
    }

    // Setters
    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPosition(double x, double y, double z) {
        currentPosition.setPosition(x, y, z);
        System.out.println("Pen moved to position " + getCurrentPosition());
    }

    // Getters
    public String getInkColor() {
        return inkColor;
    }

    public String getBrand() {
        return brand;
    }

    public String getCurrentPosition() {
        return currentPosition.getPosition();
    }

    // Actions
    public void call() {
        System.out.println("Calling pen: " + brand + " with " + inkColor + " ink is ready at " + getCurrentPosition());
    }

    public void write(String text) {
        if (isWorking) {
            System.out.println("Writing with " + inkColor + " ink: \"" + text + "\" at " + getCurrentPosition());
        } else {
            System.out.println("Pen is not working!");
        }
    }

    public void draw(String shape) {
        if (isWorking) {
            System.out.println("Drawing a " + shape + " at " + getCurrentPosition() + " with " + inkColor + " ink.");
        } else {
            System.out.println("Pen is not working!");
        }
    }

    public void setWorking(boolean status) {
        this.isWorking = status;
    }
}
