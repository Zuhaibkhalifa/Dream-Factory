package kodenst;

import java.util.Scanner;

public class swappingarray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of array");
			int arr[] = new int[scan.nextInt()];
			
			for(int i = 0 ; i <= arr.length-1 ; i++)
			{
				System.out.println("ente the elements into the array");
				arr[i]=scan.nextInt();
			}
			
			System.out.println("Enter the 2 element to swap ");
			int ind1 = scan.nextInt();
			int ind2 = scan.nextInt();
			System.out.println("array elements before swapping");
			for(int i = 0 ; i <= arr.length-1 ; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("");
			
			
			int help ;
			help =arr[ind1];
			arr[ind1] = arr[ind2];
			arr[ind2] = help;
			
			System.out.println("array after swapping");
			for(int i =0 ; i <= arr.length-1 ; i++)
			{
				System.out.print(arr[i]+" ");
			}
}
}

