Aim : 

Program : 
  import java.util.*;
  class BubbleSort
  {
  	public static void main(String args[])
  	{
  		Scanner sc = new Scanner(System.in);
  		System.out.print("Enter the Number of Elements : ");
  		int size = sc.nextInt();
  		int array[] = new int[size];
  		int temp;
  		
  		System.out.println("Enter the values : ");
  		for(int i = 0; i < size; i++)
  		{
  			array[i] = sc.nextInt();
  		}
  		
  		System.out.print("Before Sorting : ");
  		for(int i = 0; i < size; i++)
  		{
  			System.out.print(array[i] + " ");
  		}
  		
  		for(int i = 0; i < size - 1; i++) {
  			for(int j = 0; j < size - 1; j++) {
  				if(array[j] > array[j+1]) {
  					temp = array[j];
  					array[j] = array[j+1];
  					array[j+1] = temp;
  				}
  			}
  		}
  		
  		System.out.print("\nAfter Sorting : ");
  		for(int i = 0; i < size; i++)
  		{
  			System.out.print(array[i] + " ");
  		}
  	}
  }
