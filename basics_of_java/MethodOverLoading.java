class Calculator {

  int num = 9; // This is an instance variable, stored in the heap memory along with the object.

  /*
   * Constructor for the Calculator class:
   * A constructor is a special method that is called automatically when an object is created.
   * It has the same name as the class and no return type (not even void).
   * The primary purpose of a constructor is to initialize the object's state or perform setup tasks.
   * If no constructor is explicitly defined, Java provides a default constructor automatically.
   */
  public Calculator() {
      System.out.println("This is a default constructor used for object initialization.");
  }

  /*
     * Method Overloading:
     * Method overloading is a feature in Java that allows multiple methods in the same class
     * to have the same name but differ in the number or types of parameters.
     * - It provides flexibility and improves code readability.
     * - The return type of the method does not matter for overloading.
     * Example: 
     * - add(int, int)
     * - add(int, int, int)
     * - add()
     * These methods all share the same name but differ in parameter lists, hence they are overloaded.
     */

  // Method to add two numbers
  public int add(int n1, int n2) {
      int result = n1 + n2;
      return result;
  }

  // Overloaded method to handle three arguments
  public void add(int n1, int n2, int n3) {
      System.out.println("The method is the same but passing different arguments.");
  }

  // Overloaded method with no arguments
  public void add() {
      System.out.println("This is a method with no arguments, not a constructor.");
  }
}

public class MethodOverLoading {
  public static void main(StringDemo[] args) {
      int n1 = 5;
      int n2 = 6;
      int n3 = 8;

      // Here obj is a reference variable that refers to an object.
      // The obj reference is stored in the stack, but the object itself is stored in the heap (e.g., at address 101).
      Calculator obj = new Calculator(); // Calls the default constructor
      int res = obj.add(n1, n2);
      System.out.println("First Object with two arguments, returning value: " + res);

      Calculator obj2 = new Calculator(); // Calls the default constructor
      obj2.add(n1, n2, n3);
      System.out.println("Second object with three arguments, with no return value.");

      Calculator obj3 = new Calculator(); // Calls the default constructor
      obj3.add();
      System.out.println("Third object with no arguments, treated as a method and not a constructor.");


    //   num is tied to a specific object of the Calculator class. Each object of the class has its own copy of the instance variable.

    obj.num = 5;  // Changes num for obj1
    System.out.println("instance variable of obj object value :"+obj.num);
    
    obj2.num = 10; // Changes num for obj2
    System.out.println("instance variable of obj2 object value :"+ obj2.num);
    
  }
}
