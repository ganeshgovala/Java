import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        int rem;
        while(n != 0) {
            rem = n % 10;
            res += fact(rem);
            n = n / 10;
        }
        System.out.println(res);
    }
    
    public static int fact(int n) {
        if(n == 1 || n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
