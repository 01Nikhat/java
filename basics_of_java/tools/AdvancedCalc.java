package tools;

public class AdvancedCalc extends Calc {
  public int multiply(int n1, int n2){
      return n1 * n2 * protectedMarks; // Demonstrates access to protected members
  }
  public int divide(int n1, int n2){
    return n1 / n2;
  }
  public int add(int n1, int n2){ //method overriding
    return n1 + n2 + 1;
  }
}
