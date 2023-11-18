package finalProject;

	class Motorcycle extends Vehicle {
	    private String brand;
	    private String attribute;

	    public Motorcycle(Supplier supplier, double maxSpeed, int model, int reference, String state, String brand, String attribute) {
	        super(supplier, maxSpeed, model, reference, state, false);
	        this.brand = brand;
	    }
	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public String getAttribute() {
	        return attribute;
	    }

	    public void setAttribute(String attribute) {
	        this.attribute = attribute;
	    }

	    
	}



