package kodenst;

import java.util.Scanner;

public class binarysearch {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter the array size");
	int n = scan.nextInt();
	int arr[] = new int[n];
	
	System.out.println("enter the elements into array ");
	
	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
		System.out.println("enter an element");
		arr[i] = scan.nextInt();
	}
	
	System.out.println("enter the element to be searched");
	int key = scan.nextInt();
	
	
	int low = 0;
	int high = arr.length-1;
	int mid;
	
	
while(low <= high)
{
	mid = (low+high)/2;
	if(key==arr[mid])
	{
		System.out.println("Found the key ");
		System.exit(0);
	}
	else if(key>arr[mid])
	{
		low = mid+1;
		high = high;
	}
	else 
	{
		high = mid-1;
		low = low;
	}
	
}
	System.out.println("not found");
}
}
