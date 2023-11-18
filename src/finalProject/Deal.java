package finalProject;




public class Deal {

    public static void main(String[] args) {
        
        Supplier supplier1 = new Supplier("Supplier1", 50000.0);
       // Supplier supplier2 = new Supplier("Supplier2", 60000.0);

        
        Car car1 = new Car(supplier1, 200, 2022, 1, "Good", "Maserati", "Red");
        Car car2 = new Car(supplier1, 180, 2022, 2, "Excellent", "Bentley", "Blue");
        //Car car3 = new Car(supplier2, 220, 2022, 3, "Like New", "Rolls Royce", "Black");

        
        Motorcycle motorcycle1 = new Motorcycle(supplier1, 150, 2022, 4, "Good", "Yamaha", "Sport");
        //Motorcycle motorcycle2 = new Motorcycle(supplier2, 160, 2022, 5, "Excellent", "Ducati", "Cruiser");

        
        Customer customer1 = new Customer("Customer1", 100000.0);
        Customer customer2 = new Customer("Customer2", 150000.0);

        
        Agent agent1 = new Agent("Agent1");

        
        customer1.bookTestDrive(car1);
        customer2.bookTestDrive(car2);
        customer2.bookTestDrive(motorcycle1);

        
        customer1.makePayment(car1);
        customer2.makePayment(car2);

        
        Vehicle[] soldVehiclesArray = {car1,car2,motorcycle1};        
        double agentBonus = agent1.calculateBonus(5000.0, soldVehiclesArray);

        System.out.println("Agent1 Bonus: $" + agentBonus);
    }
}
