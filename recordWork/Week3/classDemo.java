Aim : Write a JAVA program to implement class mechanism. Create a class,
      methods and invoke them inside main method.

Description : 
  A class in Java is a blueprint for creating objects. It defines fields (attributes) to
  store data and methods to manipulate that data. Classes encapsulate related functionality 
  and provide a way to instantiate and manage objects with defined behaviors.
  syntax : public class ClassName {
              // variables
              //constructor
              //methods
          }

Program : 
class MyProgram {
    void add(int a, int b) {
        System.out.println("Sum of "+a+" and "+b+" : "+(a+b));
    }
    void mul(int a, int b) {
        System.out.println("Product of "+a+" and "+b+" : "+(a*b));
    }
    public static void main(String args[]) {
        MyProgram obj = new MyProgram();
        obj.add(5, 4);
        obj.mul(5, 4);
    }
}

// output 
  Sum of 5 and 4 : 9
  Product of 5 and 4 : 20
