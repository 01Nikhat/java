class Hello{
  public static void main(String[] args) {
      
      int num = 9; //it takes 4 Byte which is 32 bit
      byte by = 127; //it takes 1 Byte which is 8 bit so maximum range 127
      short sh = 32767; //it takes 2 Byte which is 16 bit means (2^16-1)-1
      long l = 585l; //it takes 8 Byte which is (-2^63 to (2^63)-1) always mention in number l for there representation 

      float f = 5.8f; //it takes 4 bytes
      double d = 5.8; //it takes 8 Bytes 

      char c = 'k'; //it takes 4 bytes always mention char into single quotes in double quotes mention for string not char

      boolean b = true ; //never do 0 or 1 it's only take true or false value 

// some interesting example

char ch = 'a'; // here we can add on char 
ch++; //here it will goes to plus1 means it will goes to string literals "b"

System.out.println("ch :" + ch); //output : b

int num1 = 0b1010; //this is a boolean format
int num2 = 0x7e; //this is a hexa decimal format

int num3 = 10_0_000_00; //this feature will help to programmer to count the number of zero easily

int result  = num1 + num2;
System.out.println("num1 :"+ num1); //output: num1 :10
System.out.println("num2 :" + num2); //output: num2 :126

System.out.println("num3 :" + num3); //output: num3 :10000000

System.out.println("result :" + result); //output: result :136

  }
}