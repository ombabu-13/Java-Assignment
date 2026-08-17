class Vehicle {
    String vehicleNumber = "MH12AB1234";
    String vehicleType = "Car";

    void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class CarInsurance extends Vehicle {
    double premium = 12000;

    void displayInsurance() {
        super.displayVehicle(); // Access parent vehicle information
        System.out.println("Insurance Premium: $" + premium);
    }
}

public class VehicleInsurance {
    public static void main(String[] args) {
        CarInsurance c = new CarInsurance();
        c.displayInsurance();
    }
}