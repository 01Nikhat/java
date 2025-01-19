public class StringDemo {
  public static void main(String[] args) {
    // Definition of String:
    // In Java, a String is a sequence of characters that is stored as an object.
    // It is a predefined class in Java and is immutable (cannot be modified once created).
    // String objects are stored in a special memory area known as the "String pool" for optimization.

    /* ----------------------------------- code ------------------------------------------------------ */

    // Creating a String using a literal
    String greeting = "Hello, World!";

    //creating a String object on the heap
    String str = new String("nikhat"); //suppose it containing address 100

    str = str + "parvin"; //we are thinking here that in 100 adress we are updating the value but actual we are storing new value nikhat parvin string in a new address of string pool and str now pointing to this adress.
    //once it is defined "nikhat" we can't change the string data as "nikhat parvin" because string is immutable(data can't change)

    System.out.println(str); //output : nikhat parvin

    /*here we are thinking that we are creating two object and making two memory for s1 s2 in string pool , but this is not the case in string pool it will search that "Nikhat" is available or not if not available it will store the value and suppose the address is 105 but in s2 time in string pool we will find "Nikhat" string is available so it will not store the "Nikhat" value again, instead it will assign the same address to s2 also  */
    String s1 = new String("Nikhat"); //address 105
    String s2 = new String("Nikhat"); //address 105

    if (s1 == s2) {
      System.out.println("s1 and s2 address is same ");
    }

     // Outputting the final string values
     System.out.println(str); // nikhatparvin
     System.out.println(s1);  // Nikhat
     System.out.println(s2);  // Nikhat

   


//     ---------------------
// | Heap Memory        |
// ---------------------
// |   +------------+   |         -->   "nikhat" (new object, heap)
// |   |  nikhat    |   |         -->   str -> new String("nikhat")
// |   |            |   
// |   +------------+   |         
// ---------------------   
// |   +------------+   |         -->   "parvin" (new object, heap)
// |   |  nikhat    |   |         -->   str -> new String("nikhatparvin")
// |   |   parvin   |   |   
// |   +------------+   |         -->   "nikhatparvin" (new object, heap)
// ---------------------
// | String Pool        |
// ---------------------
// |   +------------+   |   --> "Nikhat" (string literal stored in the pool)
// |   | Nikhat     |   | 
// |   |            |   | --> s1 and s2 reference the same literal string "Nikhat"
// |   +------------+   |   
// ---------------------
// |   +------------+   |   
// |   |  String    |   | 
// |   |   Object   |   | 
// |   +------------+   |  
// ---------------------


 /* -------------------------------------Some Features------------------------------------------------  */

    //it is a predefined class in java so here are many feature are provided :


    // length() method returns the length of the string
    System.out.println("Length of greeting: " + greeting.length()); 
    // Output: 13 (because "Hello, World!" has 13 characters)

     // substring() method returns a part of the string from index 0 to 5 (excluding 5)
     String sub = greeting.substring(0, 5);
     System.out.println("Substring (0, 5): " + sub); 
     // Output: Hello (first 5 characters of the string)

     // Checking if the string contains a specific substring
     System.out.println("Does the greeting contain 'World'? " + greeting.contains("World"));
     // Output: true (because 'World' is part of the greeting)

      // indexOf() method returns the index of the first occurrence of a substring
      System.out.println("Index of 'World': " + greeting.indexOf("World"));
      // Output: 7 (World starts at index 7)

    


    
  }
}
