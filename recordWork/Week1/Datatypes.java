Aim : a JAVA program to display default value of primitive data type of JAVA

description : 
  In Java, primitive data types are basic types representing single values. The eight primitive types are:
  - **byte**: 8 bits
  - **short**: 16 bits
  - **int**: 32 bits
  - **long**: 64 bits
  - **float**: 32 bits
  - **double**: 64 bits
  - **char**: 16 bits
  - **boolean**: Represents true or false

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
