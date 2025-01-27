
class Parents {

  int noOfSon = 4;
  int noOfDaughter = 1;

  public void daughter(){
      System.out.println("Good Habit of explanations ");
  }

  static class Son{
    public void similarity(){
      System.out.println("HardWorking person ");
    }
  }
}
public class ClassInsideClass {
  public static void main(String[] args) {
      Parents obj = new Parents();
      obj.daughter();
      System.out.println("Number of daughter :" + obj.noOfDaughter);
      System.out.println("Number of Son :" + obj.noOfSon);

     // obj.similarity();  we can't call parents inside class method 

     Parents.Son obj1 = new Parents.Son(); //it will work only inside class is static 

  }
}
