
// A class named Calculator is defined
class Calculator {

  // A public method named `add` that takes two integers as input and returns an integer
  public int add(int num1, int num2) {
      // Printing "Addition :" to the console
      System.out.print("Addition :");

      // Performing the addition of num1 and num2, storing the result in a variable
      int result = num1 + num2;

      // Printing the addition result to the console
      System.out.println(result);

      // Returning 0 (though the result of the addition is calculated, it is not returned)
      return 0; 
  }
}

// A public class named Object 
public class Object {
  // The main method, the entry point of the program
  public static void main(String[] args) {
      // Declaring and initializing two integer variables
      int num1 = 5;
      int num2 = 7;

      // Creating an instance (object) of the Calculator class
      //
      Calculator calc = new Calculator();

      // Calling the add method of the Calculator object and passing num1 and num2 as arguments
      calc.add(num1, num2);
  }
}

//A class is a blueprint for creating objects. It defines the structure (fields/attributes) and behavior (methods) that the objects of that class will have.