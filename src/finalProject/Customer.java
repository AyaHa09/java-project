package finalProject;

public class Customer {
    private String name;
    private double walletBalance;
    private Vehicle bookedVehicle;

    public Customer(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
        this.bookedVehicle = null;
    }

    public boolean bookTestDrive(Vehicle vehicle) {
        if (vehicle != null && vehicle.isAvailable()&& !hasBookedVehicle()) {
            System.out.println(name + " has booked a test drive for vehicle reference: " + vehicle.getReference());
            bookedVehicle = vehicle;
            return true;
        } else {
            if (hasBookedVehicle()) {
                System.out.println(name + " has already booked a vehicle. Cannot book another one.");
            } else {
                System.out.println("Invalid vehicle reference or vehicle is already booked.");
            }
            return false;
        }
    }

    public void makePayment(Vehicle vehicle) {
        if (bookedVehicle != null) {
            double billAmount = bookedVehicle.getPrice();

            if (bookedVehicle instanceof Car) {
                Car purchasedCar = (Car) bookedVehicle;
                int saleReference = purchasedCar.getSaleReference();

                if (walletBalance >= billAmount) {
                    walletBalance -= billAmount;
                    System.out.println(name + " has purchased a car with Sale Reference: " + saleReference +
                            ". Payment of " + billAmount + " successful. Remaining wallet balance: " + walletBalance);
                } else {
                    System.out.println("Insufficient funds. Payment failed.");
                }
            } else if (bookedVehicle instanceof Motorcycle) {
                Motorcycle purchasedMotorcycle = (Motorcycle) bookedVehicle;
                int saleReference = purchasedMotorcycle.getSaleReference();

                if (walletBalance >= billAmount) {
                    walletBalance -= billAmount;
                    System.out.println(name + " has purchased a motorcycle with Sale Reference: " + saleReference +
                            ". Payment of " + billAmount + " successful. Remaining wallet balance: " + walletBalance);
                } else {
                    System.out.println("Insufficient funds. Payment failed.");
                }
            } else {
                System.out.println(name + " has made a payment for a vehicle. Payment of " + billAmount +
                        " successful. Remaining wallet balance: " + walletBalance);
            }

           
            bookedVehicle = null;
        } else {
            System.out.println(name + " has not selected any vehicle. Cannot make a payment.");
        }
    }

    private boolean hasBookedVehicle() {
        return bookedVehicle != null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public Vehicle getBookedVehicle() {
        return bookedVehicle;
    }

    public void setBookedVehicle(Vehicle bookedVehicle) {
        this.bookedVehicle = bookedVehicle;
    }

    public double getWalletBalance() {
        return walletBalance;
    }
}
