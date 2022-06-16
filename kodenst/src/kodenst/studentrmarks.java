package kodenst;

import java.util.Scanner;

public class studentrmarks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[4];
		
		for(int i = 0 ; i<=arr.length-1 ; i++) 
		{
			System.out.println("enter the salary of  employee :" + i);
			arr[i]=scan.nextInt();
			
		}
		
		System.out.println("salary of employee are ");
		
		for(int i = 0 ; i <= arr.length-1 ; i++) {
			System.out.print(arr[i] + " ");
		}
		
			
	}
}
