import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();
        System.out.println(palindrome(0, str.length() - 1, str));
    }
    public static boolean palindrome(int start, int end, String str) {
        if(start >= end) {
            return true;
        }
        if(str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return palindrome(start + 1, end - 1, str);
    }
}
