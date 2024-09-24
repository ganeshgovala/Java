import java.util.*;

class Child extends Parent {
    void ChildMethod() {
        System.out.println("This is Child class");
    }
    public static void main(String[] args) {
        Child ch = new Child();
        ch.GrandParentMethod();
        ch.ParentMethod();
        ch.ChildMethod();
    } 
}

class Parent extends GrandParent {
    void ParentMethod() {
        System.out.println("This is Parent Class");
    }
}

class GrandParent {
    void GrandParentMethod() {
        System.out.println("This is GrandParent Class");
    }
}

output : 
This is a GrandParent Class
This is a Parent Class
This is a Child class
