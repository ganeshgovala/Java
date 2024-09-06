import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int result = recursive(n, 0);
        if(n == result) {
            System.out.println("Its an Palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
    public static int recursive(int n, int res) {
        if(n == 0) {
            return res;
        } else {
            res = res * 10;
            res += n % 10;
            return recursive(n/10, res);
        }
    }
}
