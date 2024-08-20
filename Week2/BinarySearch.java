// Binary Search

import java.util.*;

class BinarySearch 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Elements : ");
		int size = sc.nextInt();
		int array[] = new int[size];
		int temp;
		
		// Reading Elements
		
		System.out.println("Enter the values : ");
		for(int i = 0; i < size; i++)
		{
			array[i] = sc.nextInt();
		}
		
		// Sorting Elements
		
		for(int i = 0; i < size - 1; i++) {
			for(int j = 0; j < size - 1; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		// Implementing Searching Operation
		
		int low = 0;
		int mid;
		int high = size - 1;
		System.out.print("Enter Key to Search : ");
		int key = sc.nextInt();
		int count = 0;
		
		while(low <= high)
		{
			mid = (low + high) / 2;
			if(array[mid] == key) {
				count++;
				break;
			} else if(array[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		if(count == 1) {
			System.out.println("Element Found");
		} else {
			System.out.println("Element Not Found");
		}
	}
}
