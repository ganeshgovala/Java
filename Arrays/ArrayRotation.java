// a Java program that rotates an array to the right by a given number of positions
import java.util.*;

class Hello {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Reading Elements
        for(int i = 0; i < n; i++) {
            System.out.print("Enter : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Before Changing");
        for(int value : arr) {
            System.out.print( value+" ");
        }
        System.out.println("");
        
        // logic
        int k = 3;
        int temp, prev;
        while(k != 0) {
            int i = 0;
            prev = arr[i];
            arr[i] = arr[n - 1];
            for(int j = i + 1; j < n; j++) {
                temp = arr[j];
                arr[j] = prev;
                prev = temp;
            }
            k--;
        }
        
        System.out.println("After Changing");
        for(int value : arr) {
            System.out.print(value +" ");
        }
    }
}
