package kodenst;

import java.util.Scanner;

public class search {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of box");
	int n = scan.nextInt();
	int arr[] = new int[n];
	
	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
		System.out.println("Enter the box elements");
		arr[i]= scan.nextInt();
	}
	
		System.out.println("Enter the search element in the box");
		int key = scan.nextInt();

	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
		if(key==arr[i])
		{
			System.out.println("you found me at  "+i);
			System.exit(0);
			
		}
	}
	System.out.println("Better luck next time");
	
}
}
