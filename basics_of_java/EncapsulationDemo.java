

class Demo{
  int age = 25;
  private String name = "nikhat"; //we can't access the name variable directly outside of the class

  private int phone ;

  public String getName(){
    return name;
  }
//   public int setPhone(int phone){
//     phone = phone; //here if we pass arguement phone then both phone = phone will computer understand that both are local variable and here inside setPhone function there is a local variable phone to whoose i am assigning the value 123456789 not assigning the value to instance variable of phone to resolve this problen we use this keyword which define the left side phone is instance variable not local variable
//     return phone;
// }

public String setName(String name){
  this.name = name;
  return this.name;
} 
  public int setPhone(int obj){
      phone = obj;
      return phone;
  }
}
public class EncapsulationDemo {
  public static void main(String[] args) {
      Demo obj = new Demo();
      System.out.println("Age :"+obj.age);
     // System.out.println(obj.name); we can't access directly private instance variable 
     String name = obj.getName();
     System.out.println("Name :"+ name); //here we can access the private variable throught function 

    int number =  obj.setPhone(123456789); //we can set the value of private instatnce through function 

    
     System.out.println("phone number :" + number);

     String nam = obj.setName("naaz");

     System.out.println("SetName is :" + nam);


  }
}
