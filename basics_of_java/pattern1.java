package basics_of_java;

public class pattern1 {
    public static  void main(StringDemo[] args){
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * *");
       for (int i = 1; i <=6; i++){
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println(" ");
       }

    }
}
