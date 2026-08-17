interface Action {
    void performAction();
}
public class Vehicle {

    String vehicleName = "Toyota";
    String vehicleType = "Car";

    // Inner class
    class VehicleDetails {
        void displayDetails() {
            System.out.println("Vehicle Name: " + vehicleName);
            System.out.println("Vehicle Type: " + vehicleType);
        }
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        // Using inner class
        VehicleDetails details = v.new VehicleDetails();
        details.displayDetails();

        // Anonymous class
        Action action = new Action() {
            public void performAction() {
                System.out.println("Vehicle is moving.");
            }
        };

        action.performAction();
    }
}