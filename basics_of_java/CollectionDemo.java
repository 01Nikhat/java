
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* ======================  1. ArrayList (Dynamic Array) ======================= */ 


public class CollectionDemo {
  public static void main(String[] args) {

      // 1. ArrayList (Dynamic Array) 

      Collection<Integer> nums = new ArrayList<Integer>(); //making dynamic array 

      nums.add(5);
      nums.add(7);
      nums.add(1);
      nums.add(8);

      for(int n : nums){
        System.out.println(n);
      }

      // to get feature of index and many others we can use List instead of collection

      List<String> list = new ArrayList<String>();
        list.add("nikhat");
        list.add("naaz");
        list.add("naureen");
        list.add("naheed");

        System.out.println(list); //we can directly print the list 

        System.out.println(list.indexOf("naureen"));// getting the index of naureen

        System.out.println(list.get(1)); //getting the string at index 1

        /* ====================== Set ========================= */

       // A Set does not allow duplicate elements and does not guarantee insertion order(elements are in same order).

       Set<String> set = new HashSet<String>();
       set.add("Apple");
       set.add("Mango");
       set.add("Apple"); // Duplicate ignored
       System.out.println(set); // Output: [Apple, Mango] (Order may vary)
        

    }
}

//  Collection (Interface)
    //   ├── List (Interface)
    //   │    ├── ArrayList (Class)
    //   │    ├── LinkedList (Class)
    //   │    ├── Vector (Class)
    //   │
    //   ├── Set (Interface)
    //   │    ├── HashSet (Class)
    //   │    ├── LinkedHashSet (Class)
    //   │    ├── TreeSet (Class)
    //   │
    //   ├── Queue (Interface)
    //       ├── PriorityQueue (Class)
    //       ├── ArrayDeque (Class)
    
    // Map (Interface)  [Not part of Collection Interface]
    //   ├── HashMap (Class)
    //   ├── LinkedHashMap (Class)
    //   ├── TreeMap (Class)
    //   ├── Hashtable (Class)
  
 
