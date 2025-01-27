class Parents {
  
  int noOfSon = 4;  // Instance variable, each object of Parents will have its own copy
  int noOfDaughter = 1;  // Instance variable
  
  public void daughter() {
      // Instance method, can be called after creating an object of Parents
      System.out.println("Good Habit of explanations ");
  }

  static class Son {
    // Static inner class, can be instantiated without creating a Parents object
    public void similarity() {
      // Method of static class Son
      System.out.println("HardWorking person ");
    }
  }
}

public class ClassInsideClass {
  public static void main(String[] args) {
    // Creating an object of Parents
    Parents obj = new Parents();
    
    // Calling instance method of Parents class
    obj.daughter();
    
    // Accessing instance variables of Parents class
    System.out.println("Number of daughter :" + obj.noOfDaughter);
    System.out.println("Number of Son :" + obj.noOfSon);

    // You cannot call the method or access variables of the Parents class directly from the static Son class 
    // obj.similarity(); // This will give error because similarity() is inside Son, not a method of Parents class

    // Creating an instance of static inner class Son
    // Since Son is static, we can create it without creating an object of Parents class
    Parents.Son obj1 = new Parents.Son(); 
    
    // Calling the similarity() method from Son class instance
    obj1.similarity();  // This works because Son is static and does not require a Parents object
    
    // You cannot create an instance of the outer class (Parents) without first creating an object
    // of the enclosing class. This is why `new Parents().similarity()` will not work.
  }
}
