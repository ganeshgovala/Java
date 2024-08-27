Aim : A java program to implement Constructor

Description : 
  In Java, a constructor is a special method used to initialize objects when they are created. 
  It has the same name as the class and does not have a return type.
  Syntax : 
  className(/*arguments*/) {
    // Code...
  }
  Declaration:
  >> The constructor name must match the class name.
  >> It does not have a return type, not even void.
  
  Types of Constructors:
  >> Default Constructor: Automatically provided if no other constructors are defined. It initializes fields with default values.
  >> Parameterized Constructor: Defined with parameters to initialize fields with specific values.

Program : 
  class MyProgram {
      MyProgram() {
          System.out.println("This is a default Constructor");
      }
      public static void main(String args[]) {
          MyProgram obj = new MyProgram();
      }
  }

output : 
  This is a default Constructor
