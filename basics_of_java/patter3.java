package basics_of_java;

public class patter3 {
    public static  void main(StringDemo[] args){

        System.out.println("     *      ");
        System.out.println("    * *     ");
        System.out.println("   * * *    ");
        System.out.println(" * * * * *  ");
        System.out.println("* * * * * * ");

        for (int i = 0; i <6; i++) {
            for (int j = 0; j <= i; j++) {
                if(6-i == j){
                    System.out.println("*  ");

                }
                System.out.println(" ");

            }
        }

    }


}
