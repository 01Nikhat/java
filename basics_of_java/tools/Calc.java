package tools;

public class Calc {
  public int publicMarks = 7; // Public: Accessible everywhere
  private int privateMarks = 9; // Private: Accessible only within this class
  protected int protectedMarks = 10; // Protected: Accessible within the package and subclasses

  // Public method: Adds two numbers
  public int add(int n1, int n2){
    return n1 + n2;
  }

  public int sub(int n1, int n2){
    return n1 - n2;
  }

  // Public method to access privateMarks
  public int getPrivateMarks() {
    return privateMarks;
}
}
