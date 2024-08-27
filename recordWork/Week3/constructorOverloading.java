Aim : Java program to implement constructor overloading

Description :
  Constructor overloading in Java allows a class to have multiple constructors with different parameters. 
  This provides flexibility in object creation and initialization. Here’s a concise explanation:
  Key Points:
  >> Multiple Constructors: You can define more than one constructor in a class, each with a different parameter list.
  >> Constructor Selection: The appropriate constructor is chosen based on the number and types of arguments passed during object creation.

  Syntax :
    class ClassName {
      // Fields
      // Default Constructor
      ClassName() {
          // code...
      }
      // Parameterized Constructor
      ClassName(dataType parameter) {
          // code...
      }
  }

Program :
  class MyProgram {
      MyProgram() {
          System.out.println("This is default Constructor");
      }
      MyProgram(int x, int y, int z) {
          System.out.println("This is parameterized constructor");
      }
      
      public static void main(String args[]) {
          MyProgram obj = new MyProgram();
          MyProgram obj2 = new MyProgram(6, 10, 12);
      }
  }

output : 
  This is default Constructor
  This is parameterized constructor
