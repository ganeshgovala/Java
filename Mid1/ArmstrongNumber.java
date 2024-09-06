import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int original = num;
        int res = 0;
        int rem = 0;
        int digits = Integer.toString(num).length();
        while(num != 0) {
            rem = num % 10;
            res += Math.pow(rem, digits);
            num /= 10;
        }
        if(res == original) {
            System.out.println("Arm Strong Number");
        } else {
            System.out.println("Not an Arm Strong Number");
        }
    }
}
