//Single level Inheritance
public class AdvancedCalculator extends Calc { //here we are inhariting the Calc class
  public int multiply(int a, int b) {
    return a * b;
}

public int divide(int a, int b) {
    if (b == 0) {
        System.out.println("Division by zero is not allowed");
        return 0;
    }
    return a / b;
}
}
