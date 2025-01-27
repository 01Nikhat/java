// Grandparent class

// Inheritance is a mechanism in object-oriented programming where one class (called the child class or subclass) can inherit properties and methods from another class (called the parent class or superclass).


class Animal {
  void eat() {
      System.out.println("This animal eats food.");
  }
}

// Parent class
class Mammal extends Animal {
  void walk() {
      System.out.println("This mammal walks.");
  }
}

// Child class
class Dog extends Mammal {
  void bark() {
      System.out.println("The dog barks.");
  }
}

public class InheritenceDemo {
  public static void main(String[] args) {
      Dog myDog = new Dog();
      myDog.eat();  // Inherited from Animal
      myDog.walk(); // Inherited from Mammal
      myDog.bark(); // Defined in Dog
  }
}
