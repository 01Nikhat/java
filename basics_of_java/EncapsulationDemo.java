class Demo {
  int age;
  private String name; // We can't access the 'name' variable directly outside of the class because it is declared private.

  private int phone; // Private variables ensure data security by restricting direct access.

  // A constructor is used to initialize default values for instance variables. 
  // We pass default values here, and although we can set default values directly, it is better practice to define them in the constructor.
  // Note: In constructors, we don't write a return type.
  public Demo() {
      age = 12; 
      name = "nikhat"; // Default name initialization
  }

  // Getter method to access the private 'name' variable. 
  // This method provides controlled access to the private variable.
  public String getName() {
      return name;
  }

  // Setter method for the 'name' variable using the 'this' keyword.
  // The 'this' keyword is used to differentiate between the local variable and the instance variable.
  // It ensures that the left-side 'name' refers to the instance variable, not the local variable.
  public String setName(String name) {
      this.name = name;
      return this.name; // Returns the updated name.
  }

  // Setter method for the 'phone' variable.
  // Instead of using the same variable name, the argument is named 'obj' to avoid confusion.
  public int setPhone(int obj) {
      phone = obj; // Assigns the passed value to the private 'phone' variable.
      return phone; // Returns the updated phone number.
  }
}

/*
* Encapsulation Definition:
* Encapsulation is the process of keeping an object's data (variables) private and providing access to it only through public methods (like getters and setters).

* This approach enhances security, maintains control over the data, and makes the code easier to understand and modify.
*/

public class EncapsulationDemo {
  public static void main(String[] args) {
      Demo obj = new Demo(); // Creating an object of the 'Demo' class.
      
      System.out.println("Age :" + obj.age); // Accessing the public variable directly.
      
      // We cannot directly access the private 'name' variable, but we can access it through the getter method.
      String name = obj.getName(); 
      System.out.println("Name :" + name); // Accessing the private variable through the getter method.

      // Setting the private 'phone' variable using the setter method and printing the value.
      int number = obj.setPhone(123456789); 
      System.out.println("Phone number :" + number);

      // Setting the private 'name' variable using the setter method and printing the updated value.
      String nam = obj.setName("naaz"); 
      System.out.println("SetName is :" + nam);
  }
}
