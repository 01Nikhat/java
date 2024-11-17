public class Car {
    int noOfWheel;
    String color;
    float maxSpeed;
    float currentFuel;
    int noOfSeats;

    public void drive(){
        if(currentFuel == 0){
            System.out.println("Your Car is Oud of Fuel");
        } else if (currentFuel <= 5) {
            System.out.println("Your car is under reserved mode ");
            currentFuel--;
        }
        else{
            System.out.println("Car is Driving");
            currentFuel--;
        }


    }
    public void addFuel(float fuel){
        currentFuel += fuel;
    }
    public float getCurrentFuelLevel(){

        return currentFuel;
    }
}
