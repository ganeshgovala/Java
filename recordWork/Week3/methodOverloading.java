Aim : Write a program to implement method overloading in JAVA

Description : 
  Method overloading in Java allows multiple methods with the same name but different parameters
  within the same class. It enhances readability and flexibility. Here’s a concise overview:
  Key Points:
  >> Same Method Name: Multiple methods can have the same name.
  >> Different Parameters: Methods must differ in the number or type of parameters.
  >> Return Type: Return type alone is not sufficient to differentiate overloaded methods.

Program : 
  class MyProgram {
    void mul(int a, int b) {
        System.out.println("Product of "+a+" and "+b+" : "+(a*b));
    }
    void mul(int a, int b, int c) {
        System.out.println("Product of "+a+", "+b+" and "+c+" : "+(a*b*c));
    }
    void mul(float a, float b, float c) {
        System.out.println("Product of "+a+", "+b+" and "+c+" : "+(a*b*c));
    }
    public static void main(String args[]) {
        MyProgram obj = new MyProgram();
        obj.mul(5, 4);
        obj.mul(5, 4, 2);
        obj.mul(2.0f, 4.2f, 3.8f);
    }
}

//output
Product of 5 and 4 : 20
Product of 5, 4 and 2 : 40
Product of 2.0, 4.2 and 3.8 : 31.919998
