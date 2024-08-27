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
