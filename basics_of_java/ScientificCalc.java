import tools.AdvancedCalc; // Importing the AdvancedCalc class from the tools package

public class ScientificCalc {
    public static void main(String[] args) {
        AdvancedCalc obj = new AdvancedCalc();

        int r1 = obj.add(4, 8); // Calling the overridden add() method
        int r2 = obj.sub(8, 2); // Calling the sub() method from the Calc class
        int r3 = obj.multiply(3, 5); // Calling the multiply() method from AdvancedCalc
        int r4 = obj.divide(8, 2); // Calling the divide() method from AdvancedCalc

        // Printing the results
        System.out.println("add: " + r1);
        System.out.println("sub: " + r2);
        System.out.println("multiply: " + r3);
        System.out.println("divide: " + r4);


//         Project Structure:

      // basics_of_java/
        // ├── tools/
        // │   ├── Calc.java           // Base class with add() and sub() methods
        // │   ├── AdvancedCalc.java   // Extends Calc and add()(override method) multiply() and divide()
        // │
        // ├── ScientificCalc.java     // Uses AdvancedCalc (imports it)
    }


}
