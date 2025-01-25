
class A{
  public A(){
    super(); //implicitly defined 
    System.out.println("Constructor A");
  }
  public A(int obj){
    super(); //implicitly defined 
    System.out.println("Constructor A with parameter");
  }
}
class B extends A{
  public B(){
    super(); //implicitly defined 
    System.out.println("Constructor B");
  }
  public B(int obj){
    
    //super(); //implicitly defined 
    this();
    System.out.println("Constructor B with parameter");
  }
}
public class SuperMethod {
  public static void main(String[] args) {
      B obj = new B(); //whenever we will create a new object B() then it will call default cunstructor A() and implicity there is a a call super() method so it will goes to class A() because of inheritence and here call the default constructor A().
      //output is Constructor A Constructor B
      
      //now if we want to call constructor parameter of B

     // B obj2 = new B(5); 
      //output : Constructor A
     //          Constructor B with parameter

     //now want to call both function B, in this case in constructor with parameter  we have to call this() method which call the class B again

     B obj3 = new B(8);

     
     

  }
}
