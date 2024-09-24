import java.util.*;

abstract class Main extends FindArea {
    static void square(int length) {
        System.out.println("Area of Square is : "+(length * length));
    }
    static void circle(int radius) {
        System.out.println("Area of Circle is : " + (3.14 * radius * radius));
    }
    static void rectangle(int length, int breadth) {
        System.out.println("Area of Rectangle is : "+(length * breadth));
    }
    public static void main(String[] args) {
        square(5);
        circle(5);
        rectangle(5,5);
    }
}

abstract class FindArea {
    abstract void square();
    abstract void circle();
    abstract void rectangle();
}

output : 
Area of Square is : 25
Area of Circle is : 78.5
Area of Rectangle is : 25
