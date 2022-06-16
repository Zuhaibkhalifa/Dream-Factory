package kodenst;

import java.util.Scanner;

public class jaggedarraythree 
{
public static void main(String[] args) 
{
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the number of colleges");
	int arr[][][] = new int[scan.nextInt()][][];
	
	
	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
			System.out.println("Enter the number of classes for "+ i +" college");
			arr[i]  = new int[scan.nextInt()][];
			
			for(int j = 0 ; j <= arr[i].length-1 ; j++ )
			{
					System.out.println("Enter the no.of Students for "+  j +" classes");
					arr[i][j]= new int[scan.nextInt()];
			}
	}
	
	System.out.println("storing the number");
	
	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
		for(int j = 0 ; j <= arr[i].length-1 ; j++)
		{
			for(int k = 0 ; k <= arr[i][j].length-1 ; k++ )
			{
				System.out.println("Enter the marks of student for  "+ i +" colleges "+ j +" classes");
				arr[i][j][k]= scan.nextInt();
			}
		}
	}
	
	System.out.println("print the array ");
	
	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
		for(int j = 0 ; j <= arr[i].length-1 ; j++)
		{
			for(int k = 0 ; k <= arr[i][j].length-1 ; k++ )
			{
			System.out.print(arr[i][j][k]+"");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
}