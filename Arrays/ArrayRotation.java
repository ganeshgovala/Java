// a Java program that rotates an array to the right by a given number of positions
import java.util.*;

class Hello {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 5;
        rotateArray(arr, k);
        for(int value : arr) {
            System.out.print(value + " ");
        }
    }
    
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
    
    public static void reverse(int[] arr, int start, int end) {
        int temp;
        while(start < end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}
