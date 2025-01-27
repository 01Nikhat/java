class Money{

  int defaultMoney = 10000;
  static int  bill = 5000;

  public static void childsMoney(){
    System.out.println("Parents No need to take permision for money to childs ");
    //System.out.println(defaultMoney); //Gives error , static method cannot access instance class because they are not tied to any specific object. it can only access by static variable.

    System.out.println("Bill :" + bill); //can access static variable
  }
  public void ParentsMoney(){
    System.out.println("Only Allowence for good use ");
  }
}

public class StaticKeyWordUse {
  public static void main(String[] args) {
     // Calling static method directly using the class name
      Money.childsMoney(); // No need to create an object


      // Money.ParentsMoney(); Give error for regular method we have to make an object of the class

       // Calling non-static method, we need to create an object first
      Money obj = new Money();
      obj.ParentsMoney(); //now it will work 

      /* Definition :- Static indicate that something is belong to class itself rather than to individual of the object s of the class
       * when we declare static method then we don't need to create an object of the class to call it. we can call it  directly using the class Name
       * 
       */

       /* =================== Some important reason of static in public static void main ==================== */

     //  Entry Point for the Java Program:

  /*  The main method is the starting point for any Java program.
   * Java programs are executed by the Java Virtual Machine (JVM). When you run a Java program, the JVM needs to know where to begin executing the program. The main method is the designated entry point for this.
   
  * Since the JVM doesn't create an instance (object) of the class to start executing the program, the main     method has to be static so that it can be called without needing to create an instance of the class.

   * Why static?:

    *Static means that the method belongs to the class itself, not to a specific object. The main method needs to be static so the JVM can call it directly from the class (without needing an object).


    *When the program starts, the JVM calls the main method directly using the class name, like ClassName.main(args). If main were not static, the JVM would need to create an instance of the class before it could call main, which would complicate the execution process. */
  }
}
