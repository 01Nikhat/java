 
 /*====================First example :- abstract class and abstract method ============================= */
 abstract class A {
  // Using final keyword means this method is fixed and cannot be overridden in subclasses.
  public final void models() {
    System.out.println("Phone Type :" + "Samsung Galaxy");
  }

  public void year(){
    System.out.println("This model launched in :" + 2005);
  }
   // Abstract method must be implemented by subclasses that extend this class.
   public abstract void features();

  public void frontCamera(){
    System.out.println("Front Camera in pixels : " + 20 );
  }
}
class B extends A{ //if we inherit abstract class A then we must implement the abstract method otherwise it will show error
  public void features(){ //overriden method
    String processor = "octa core";
    int ramInGb = 8;
    int romInGb = 256;

    System.out.println("Processor :" + processor);
    System.out.println("Ram in Gb :" + ramInGb);
    System.out.println("Rom In Gb :" + romInGb);
  }

  public void uniqueToB() {
    System.out.println("Unique method in B");
 }

  // public void models(){

  // } //we can't overriden the method of models because of final keywords just because of this we can't change the method
}


/* ============================ second example :- abstract class only ===================================== */

abstract class C {
  public void sound(){
      System.out.println("Sound quality :" + "Good");
  }

  public void DefaultApp(){
    System.out.println("Default App :" + "WhatsApp" + " | " + "Facebook" + " | " + "Settings");
}
}

  class D extends C{
  public void Frequency(){
    System.out.println("Dj frequency ");
  }
}



public class Abstract {
  public static void main(String[] args) {

    /* ========================== First Example ===========================  */
        // Case 1: B obj = new B();
        B obj1 = new B();
        obj1.features();       // Calls B's features()
        obj1.models();         // Calls A's models() (inherited by B)
        obj1.uniqueToB();      // Can access B-specific method

        // Case 2: A obj = new B();
        A obj2 = new B();
        obj2.features();       // Calls B's features() (overridden in B)
        obj2.models();         // Calls A's models() (not overridden in B)
        // obj2.uniqueToB();   // Error: Cannot access methods specific to B



/* ------------------ A obj2 = new B(); diagram ----------------------------------------  */

// +--------------------+       +---------------------------+
// | Reference (obj)    |       | Actual Object (B in Heap) |
// | Type: A            | ----> | Type: B                  |
// |--------------------|       |---------------------------|
// | - Points to an     |       | - features()             | <-- Overridden in B
// |   object of B      |       | - models()               | <-- Inherited from A
// |                    |       | - year()                 | <-- Inherited from A
// |                    |       | - uniqueToB()           | <-- Cannot access methods specific to B
// +--------------------+       +---------------------------+
// | Restriction: Cannot call `uniqueToB()`.


/* ------------------ B obj2 = new B(); diagram ----------------------------------------  */

// +------------+                 +-------------------+
// | Reference: |  obj (B)        | Object in Memory: B |
// +------------+                 +-------------------+
// | Accesses:                     | features()          |
// | - models() (inherited)        | models() (inherited)|
// | - features()                  | uniqueToB()         |
// | - uniqueToB()                 +-------------------+
// +------------+



/* ========================================= Second Example ==============================  */

     // C obj4 = new C() ;  // Error: Cannot instantiate an abstract class

     D obj3 = new D();
    obj3.DefaultApp();
    obj3.Frequency();
    obj3.sound();
  }

  
}
