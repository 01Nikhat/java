package basics_of_java;

public class Array {
    public static void main (String[] args){
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = Average(numArray);
        System.out.println("Sum of the Number is :" + sum);
        System.out.println("Average of the Number is :" + avg);

    }

    public static long sum (int[] numArray){
        long sum = 0;
        int i=0;
        while(i<numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;

    }
    public static  int Average (int[] numArray){
        long sum = sum(numArray);
        int avg = (int)(sum/numArray.length);
        return avg;
    }

}
