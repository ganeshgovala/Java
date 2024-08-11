// Palindrome Number
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int original = num;
        int res = 0;
        int rem = 0;
        while(num != 0) {
            rem = num % 10;
            res = res * 10 + rem;
            num /= 10;
        }
        if(res == original) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

// output 1
Enter Number : 987454789
Palindrome
// output 2
Enter Number : 54631
Not a Palindrome
