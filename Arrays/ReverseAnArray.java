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
        
        System.out.println("Before Reversing");
        for(int value : arr) {
            System.out.print( value+" ");
        }
        System.out.println("");
        
        // logic
        int i = 0;
        int len = arr.length - 1;
        int temp;
        while(i <= len) {
            temp = arr[i];
            arr[i] = arr[len];
            arr[len] = temp;
            i++;
            len--;
        }
        
        System.out.println("After Reversing");
        for(int value : arr) {
            System.out.print(value +" ");
        }
    }
}
