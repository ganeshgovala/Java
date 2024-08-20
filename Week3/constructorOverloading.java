class MyProgram {
    
    int x;
    int y;
    int z;
    MyProgram(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    MyProgram(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static void main(String args[]) {
        MyProgram obj = new MyProgram(5, 4);
        System.out.println(obj.y);
        MyProgram obj2 = new MyProgram(6, 10, 12);
        System.out.println(obj2.z);
    }
}
