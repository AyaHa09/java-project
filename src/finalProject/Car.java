package finalProject;

class Car extends Vehicle {
    private String brand;
    private String color;

    public Car(Supplier supplier, double maxSpeed, int model, int reference, String state, String brand, String color) {
        super(supplier, maxSpeed, model, reference, state, false);
        this.brand = brand;
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
