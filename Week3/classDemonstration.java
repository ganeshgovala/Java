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
