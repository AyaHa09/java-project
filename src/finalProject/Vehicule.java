package finalProject;
class Vehicle {
	 private Supplier supplier;
	    private double maxSpeed;
	    private int model;
	    private int reference;
	    private String state;
	    private boolean used;
	    private boolean isAvailable;
	    private static int saleCounter = 1;
	    private int saleReference;

	    public Vehicle(Supplier supplier, double maxSpeed, int model, int reference, String state, boolean used) {
	        this.supplier = supplier;
	        this.maxSpeed = maxSpeed;
	        this.model = model;
	        this.reference = reference;
	        this.state = state;
	        this.used = used;
	        this.isAvailable = true; 
	        this.saleReference = saleCounter++;
	    }
    public int getSaleReference() {
        return saleReference;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public double getPrice() {
        if (used) {
            return calculateUsedVehiclePrice();
        } else {
            return calculateNewVehiclePrice();
        }
    }


    private double calculateUsedVehiclePrice() {
        return 200000.0;
    }

    private double calculateNewVehiclePrice() {
        return supplier.getPrice() / 100 * 120;
    }
    
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        this.model = model;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

   

    
}


