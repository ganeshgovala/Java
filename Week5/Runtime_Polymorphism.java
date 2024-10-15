class Child extends Parent {
    public static void run() {
        System.out.println("This is Child class");
    }
    public static void main(String[] args) {
        run();
    }
}

class Parent {
    public static void run() {
        System.out.println("This is Parent class");
    }
}
