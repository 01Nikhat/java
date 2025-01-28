
abstract class A {
   abstract  public void show();
      
}

public class AnonymousClass {
  public static void main(String[] args) {

     // Creating an anonymous class and overriding the abstract method
      A obj = new A () // obj points to this anonymous subclass
      { //here no class name is mentioned this parathecies represent a anonymous class
        public void show(){ //inside anonymous class we extending the show method
          System.out.println("This is an anonymous class calling ");
        }
      };

      // Calling the method of the anonymous class
      obj.show(); //output of the anonymous class calling


/* ===================================   Rough diagram  =========================================*/
//       Abstract Class A (Blueprint)
//               ↑
//               |
        // Anonymous Class (Subclass of A)
        //       ↑
        //       |
        // obj (Reference Variable)

  }
}
