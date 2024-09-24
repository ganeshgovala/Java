import java.util.*;

class Main extends Parent {
    void display() {
        super.display();
        System.out.println("This is a child class method");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
    }
}

class Parent {
    void display() {
        System.out.println("This is parent class method");
    }
}

output : 
This is parent class method
This is a child class method
