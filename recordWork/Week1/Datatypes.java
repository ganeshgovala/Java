Aim : a JAVA program to display default value of primitive data type of JAVA

description : 
  In Java, primitive data types are the most basic data types provided by the language. They are not objects and represent single values directly. Java has eight primitive data types:
  byte:
  Size: 8 bits
  Range: -128 to 127
  Example: byte age = 25;
  
  short:
  Size: 16 bits
  Range: -32,768 to 32,767
  Example: short year = 2024;
  
  int:
  Size: 32 bits
  Range: -2^31 to 2^31 - 1 (-2,147,483,648 to 2,147,483,647)
  Example: int population = 1000000;
  
  long:
  Size: 64 bits
  Range: -2^63 to 2^63 - 1 (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
  Example: long distance = 15000000000L;
  
  float:
  Size: 32 bits
  Range: Approximately ±3.40282347E+38F (6-7 decimal digits of precision)
  Example: float temperature = 98.6F;
  
  double:
  Size: 64 bits
  Range: Approximately ±1.79769313486231570E+308 (15-16 decimal digits of precision)
  Example: double pi = 3.14159265358979;
  
  char:
  Size: 16 bits
  Range: 0 to 65,535 (unsigned, representing Unicode characters)
  Example: char initial = 'A';
  
  boolean:
  Size: Not precisely defined (but logically represents one bit)
  Values: true or false
  Example: boolean isJavaFun = true;

Program : 
  class DefaultVal {
  
  	static byte b;
  	static boolean bool;
  	static short sh;
  	static int i;
  	static char ch;
  	static long l;
  	static float f;
  	static double d;
  	
  	public static void main(String args[]) {
  		
  		System.out.println("Default value of Byte is : "+b);
  		System.out.println("Default value of Boolean is : "+bool);
  		System.out.println("Default value of Short is : "+sh);
  		System.out.println("Default value of Int is : "+i);
  		System.out.println("Default value of Char is : "+ch);
  		System.out.println("Default value of Long is : "+l);
  		System.out.println("Default value of Float is : "+f);
  		System.out.println("Default value of Double is : "+d);
  	}
  	
  }

output : 
  Default value of Byte is : 0
  Default value of Boolean is : false
  Default value of Short is : 0
  Default value of Int is : 0
  Default value of Char is : 
  Default value of Long is : 0
  Default value of Float is : 0.0
  Default value of Double is : 0.0
