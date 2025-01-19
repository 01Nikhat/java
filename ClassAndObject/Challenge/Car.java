public class Car {
    int noOfWheel;
    StringDemo color;
    float maxSpeed;
    float currentFuel;
    int noOfSeats;
    static {
        System.out.println("Static Block is called");
    }
    {
        System.out.println("init block is called ");
    }
    Car(StringDemo color){
        maxSpeed = 150;
        this.color = color;
        currentFuel = 2;
        noOfSeats = 5;
    }
    Car(){
        this("Red");
        currentFuel = 5;
    }
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
