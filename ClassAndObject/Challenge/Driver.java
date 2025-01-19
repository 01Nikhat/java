public class Driver {
    public static void main(String[] args) {
        System.out.println("Driver is ready");

        // Create an instance of the Car class
        Car myCar = new Car();

        // Set initial values
        myCar.currentFuel = 5; // Example initial fuel

        // Add fuel to the car
        myCar.addFuel(7);

        // Get the current fuel level and print it
        System.out.println("Current fuel level: " + myCar.getCurrentFuelLevel());

        //driving
        myCar.drive();

        // Get the current fuel level and print it
        System.out.println("Current fuel level: " + myCar.getCurrentFuelLevel());

    }
}
