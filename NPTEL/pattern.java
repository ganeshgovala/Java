class HelloWorld {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < 2*n-1; i++) {
            for(int j = 0; j < 2 * n - 1; j++) {
                if(i < n - 1 && j < n-i-1 || i < n-1 && j > n-1 + i || i > (n-1) && j < i - (n-1) || i > (n-1) && j > (n*2) - i)
                {
                    System.out.print(" ");
                } 
                else if(j < n) 
                {
                    System.out.print(n - j);
                } 
                else if(j >= n) 
                {
                    System.out.print(j - (n - 2));
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }
}

output
