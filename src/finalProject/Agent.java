package finalProject;



class Agent {
    private static int agentCounter = 1; 
    private int id;
    private String name;
    private Integer[] carSalesReferences;

    public Agent(String name) {
        this.id = agentCounter++;
        this.name = name;
        this.carSalesReferences = new Integer[0];  
    }


  
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer[] getCarSalesReferences() {
        return carSalesReferences;
    }

    public void addCarSaleReference(int carSaleReference) {
    	Integer[] newArray = new Integer[carSalesReferences.length + 1];
        System.arraycopy(carSalesReferences, 0, newArray, 0, carSalesReferences.length);
        newArray[carSalesReferences.length] = carSaleReference;
        carSalesReferences = newArray;
    }


    
    public double calculateBonus(double baseSalary, Vehicle[] soldVehicles) {
        double bonusPercentage = 0.02;  
        double totalBonus = 0;

        for (Vehicle vehicle : soldVehicles) {
            int saleReference = vehicle.getSaleReference();
            addCarSaleReference(saleReference);
            totalBonus += vehicle.getPrice() * bonusPercentage;
        }

        return totalBonus;
    }
}
