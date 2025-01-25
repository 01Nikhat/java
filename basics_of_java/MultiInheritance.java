

public class MultiInheritance {
  public static void main(String[] args) {
      //Calc obj = new Calc(); //Calc.java is another file we are creating Calc class object here 
      

     // AdvancedCalculator obj = new AdvancedCalculator(); //single level inheritance 

     MoreAdvancedCalc obj = new MoreAdvancedCalc();
      int r1 = obj.add(5, 7); //we are calling Calc class by inheritance of AdvancedCalculator class ,method add();
      int r2 = obj.sub(8, 2); //we are calling Calc class by inharitance of AdvancedCalculator class ,method sub();
      int r3 = obj.multiply(5, 7); //we are calling AdvancedCalculator class, method multiply();
      int r4 = obj.divide(8, 2); //we are calling AdvancedCalculator class, method divide();

      double r5 = obj.power(4, 2);

      System.out.println("add :" + r1 + " | " + "sub :" + r2 + " | "+ "multiply :" + r3 + " | " + "divide : "  + r4 + " | " + "Power :" + r5); // output : add :12 | sub :6 | multiply :35 | divide : 4 | power : 16
  }
}
