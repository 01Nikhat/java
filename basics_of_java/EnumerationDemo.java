

enum Day{
  SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY //When we define an enum, the Java runtime automatically creates the instances for us. For example:

          /*enum Day {
            MONDAY, TUESDAY, WEDNESDAY

            Behind the scenes, Java treats this as:

            lass Day extends java.lang.Enum<Day> {
            public static final Day MONDAY = new Day();
            public static final Day TUESDAY = new Day();
            public static final Day WEDNESDAY = new Day();
            by default it's final so we can't extend the enum
              private Day() { 
                  // Private constructor
              }
            }
        } */
}


  
// Second enum
enum TODAY {
  MONDAY("Start of the workweek"),
  TUESDAY("Second day"),
  WEDNESDAY("Midweek"),
  THURSDAY("Almost there"),
  FRIDAY("Last workday"),
  SATURDAY("Weekend!"),
  SUNDAY("Relaxation day");

  private String description; // Field

  // Constructor (private by default)
  TODAY(String description) {
      this.description = description;
  } //we can't return the private method to access the private method use getter method

  // using getter method to return the private method value
  public String getDescription() {
      return description;
  }
}

public class EnumerationDemo {
  public static void main(String[] args) {

    Day today = Day.MONDAY; //valid
   // Day tomorrow = new Day(); // Invalid (compilation error)

   // Print the day
   System.out.println("Today is: " + today);

    // Switch statement with enum
      switch (today) {
        case MONDAY:
            System.out.println("It's Monday! Time to work.");
            break;
        case FRIDAY:
            System.out.println("It's Friday! Weekend is near.");
            break;
        default:
            System.out.println("It's a regular day.");
            break;
    }
    //using the second enum 
    TODAY todayWithDescription = TODAY.FRIDAY;

    System.out.println("Description of today is :" + todayWithDescription.getDescription());

  }
}
