class MyProgram {
    
    int x;
    int y;
    MyProgram(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public static void main(String args[]) {
        MyProgram obj = new MyProgram(5, 4);
        System.out.println(obj.y);
        MyProgram obj2 = new MyProgram(6, 10);
        System.out.println(obj2.y);
    }
}
