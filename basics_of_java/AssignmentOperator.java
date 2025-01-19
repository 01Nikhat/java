class AssignmentOperator {

  public static void main(StringDemo[] args) {
    int num1 = 7;
    int num2 = 5;

    int result = num1/num2; //we will get only quotient part not remainder part
    System.out.println("result :" + result);

    int remainder = num1 % num2; //we will get here only remender part
    System.out.println("remainder : "+ remainder);
  }
}