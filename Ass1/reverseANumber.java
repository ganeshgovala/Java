// Reverse a number
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int res = 0;
        int rem = 0;
        while(num != 0) {
            rem = num % 10;
            res = res * 10 + rem;
            num /= 10;
        }
        System.out.println("After Reversing : "+res);
    }
}

// output 1
Enter Number : 123456
After Reversing : 654321

// output 2
Enter Number : 121
After Reversing : 121
