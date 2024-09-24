import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter number : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter Element to search : ");
        int key = sc.nextInt();
        int low = 0, mid = 0;
        int high = size - 1;
        while(low <= high) {
            mid = (low + high) / 2;
            if(arr[mid] == key) {
                System.out.print("Element Found");
                break;
            } else if(arr[mid] > key) {
                high = mid - 1;
            } else if(arr[mid] < key) {
                low = mid + 1;
            }
        }
    }
}
