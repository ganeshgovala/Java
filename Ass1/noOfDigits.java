// No.of digits in a number
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int count = 0;
        while(num != 0) {
            count++;
            num /= 10;
        }
        System.out.println("Total Number of digits : "+count);
    }
}

// output 1 
Enter Number : 458123
Total Number of digits : 6

// output 2
Enter Number : 6841684
Total Number of digits : 7
