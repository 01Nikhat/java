class Mobile{

  String brand;
  int price;
  String name;
   
  public void show(){
    System.out.println(brand+ " " + price + " " + name );
  }

}
public class StaticKeyWord {
  public static void main(String[] args) {
      Mobile obj = new Mobile();
      obj.brand = "Apple";
      obj.price = 67000;
      obj.name = "SmartPhone";

      Mobile obj2 = new Mobile();
      obj2.brand = "Samsung";
      obj2.price = 45000;
      obj2.name = "SmartPhone ";

      obj.show();
      obj2.show();

  }
}
