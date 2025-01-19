package basics_of_java;

public class maximumAndMinimum {
    public static  void main(String[] args){
        int[] numArray = ArrayUtility.inputArray();
        int max = FindMaximum(numArray);
        int min = FindMinimum(numArray);
        System.out.println("The maximum number of The array is :" + max);
        System.out.println("THe minimum number of the array is :" + min);
    }
    public static int FindMaximum(int[] numArray){
        int max = 0;
        int i = 0;
        while(i < numArray.length){
            if(max < numArray[i]){
                max = numArray[i];

            }
            i++;

        }
        return max;
    }
    public static int FindMinimum(int[] numArray){
        int min = 1346576868;
        int i=0;
        while(i< numArray.length){
            if (min > numArray[i]){
                min = numArray[i];

            }
            i++;

        }
        return min;
    }
}
