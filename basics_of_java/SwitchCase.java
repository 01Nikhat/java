
import java.util.Scanner;

public class SwitchCase{
  public static void main(StringDemo[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to day of the week detector");
      System.out.print("Enter your Day in number : ");
      int day = input.nextInt();

      switch (day) {
          case 1 :
                System.out.println("Monday");
              break;
          case 2:
                System.out.println("Tuesday");
              break;
          case 3 :
                System.out.println("Wednesday");
              break;
          case 4 :
                System.out.println("Monday");
              break;
          case 5 :
                System.out.println("Monday");
              break;
          case 6 :
                System.out.println("Monday");
              break;
           case 7 :
                System.out.println("Sunday");
              break;
          
          default:
              System.out.println("Not valid number for day");
      }
  }
}