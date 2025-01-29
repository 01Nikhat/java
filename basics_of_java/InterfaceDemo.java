/*
 * 1. Interfaces Define Behavior, Not Implementation
 * A class is a blueprint for creating objects, containing both data (fields/variables) and methods .
 
* An interface is purely a contract that defines behavior but does not provide implementation (except default/static methods in Java 8+).
 */

 interface Animal {
    //here we can obly defined abstract public method we can;t make concrete method
   void makeSound();//Bydefault all method are abstract public ,
   // here it is abstract public void makeSound();

   int age = 23; //bydefault varibale final and static , here static final int age = 23;
   
 }

 class Dogs implements Animal{ //in interface we take impliments like abstract class we extends

   public void makeSound(){
      System.out.println("bhow bhow...");
   }
 }

 /* 
  * 2. Multiple Inheritance Support
* Java does not support multiple inheritance for classes to avoid ambiguity.
* However, multiple interfaces can be implemented by a single class, allowing a class to inherit behavior from multiple sources.
  */

  interface Birds{
    void makeSoundOfBird();
  }

  class SoundAnalysing implements Animal,Birds{
    
    public void makeSoundOfBird(){
      System.out.println("chirp chirp...");
    }

    public void makeSound(){
      System.out.println("Meaw Meaw....");
    }
  }


public class InterfaceDemo {
  public static void main(String[] args) {

    //Animal obj = new Animal; // ❌ ERROR: Cannot instantiate interface

    //in interface we can't make an object for interface 
    Animal obj = new Dogs();
    obj.makeSound();
    System.out.println(obj.age);

    SoundAnalysing obj2 = new SoundAnalysing();
    obj2.makeSound();
    obj2.makeSoundOfBird();

      
  }
}
