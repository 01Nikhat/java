import java.util.ArrayList;

public class ForEachLoop {
  public static void main(String[] args) {
    int arr[] = new int[5];

    // Assign random values using a traditional for loop
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 10); // Assigning random values
  }

  //in foreach loop int value is not act like a index , it contain each value of array
  int index = 0;
    for(int value : arr){
      System.out.println("index " + index +": " + value);
      index++;
    }

    /* --------- second example--------------------------  */

    //If we want to add elements dynamically, use ArrayList, which allows dynamic resizing:
    ArrayList<String> names = new ArrayList<>();
    names.add("nikhat");
    names.add("sam");
    names.add("naaz");

    for(String name : names){
      System.out.println(name);
    }
    
    /* --------------Third Example -------------------------------------- */

    int array[][] = new int[3][4]; //here array[3] represent 3 row present,  array[4] represent in each row there are 4 elements present

    for(int i=0;i<3;i++){
      for(int j=0;j<4;j++){
        array[i][j] = (int)(Math.random()*10) ;

      }
    }

    //printing the value 
    for(int row[]:array){
      for (int elem : row) {
          System.out.print(elem +" ");
      }
      System.out.println("");
    }

    //output :
//     3 3 3 6
//     7 5 0 5
//     9 5 8 5

    /* ------------------fourth example --------------------------------- */

  //A jagged array in Java is an array of arrays where each sub-array can have a different length.

  //declartion of jagged array here we don't know in each subArray how many elements present 
  
  int jaggedArray[][] = new int[3][];

     // Initialize each sub-array with different lengths
     jaggedArray[0] = new int[3]; // First row has 3 columns
     jaggedArray[1] = new int[2]; // Second row has 2 columns
     jaggedArray[2] = new int[4]; // Third row has 4 columns

     for(int i=0;i<jaggedArray.length;i++){
      for(int j=0 ; j< jaggedArray[i].length;j++){
        jaggedArray[i][j] = (int)(Math.random()*10);
      }
     
     }

     //printing jagged array
     System.out.println("Jagged array :");
     for(int row[]:jaggedArray){
      for(int colmn:row){
          System.out.print(colmn+ " ");
      }
      System.out.println("");
     }
     /*
      *output :
      * 6 5 0
        2 3
        3 5 6 8
      */

  }

  
}
