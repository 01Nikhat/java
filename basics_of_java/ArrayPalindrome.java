package basics_of_java;

public class ArrayPalindrome {
    public static void main(String[] args){
        int [] numArray = ArrayUtility.inputArray();
        boolean palindrome = Palindrome(numArray);
        if (palindrome){
            System.out.println("Your Array Is Palindrome");
        } else{
            System.out.println("Your Array Is not Palindrome");
        }

    }

    public static boolean Palindrome (int[] numArray){
        int i=0;
        int n = numArray.length;
        while(i < (n/2)){
            if(numArray[i] != numArray[n-i-1]){
                return false;
            }
            i++;

        }
        return true;
    }
}
