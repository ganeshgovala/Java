import java.util.*;

class Child extends Parent {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.method();
    } 
}

class Parent {
    void method() {
        System.out.print("This is a Parent class");
    }
}

output : 
This is a Parent class
