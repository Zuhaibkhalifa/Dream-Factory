package kodenst;

import java.util.Scanner;

public class jaggedarray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int arr[][]=new int[4][];
	arr[0]=new int[2];
	arr[1]=new int[4];
	arr[2]=new int[2];
	arr[3]=new int[4];
	
	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
		for(int j = 0 ; j <= arr[i].length-1 ; j++)
		{
			System.out.println("enter th number of college" + i + "and students "+j);
			arr[i][j] = scan.nextInt();
		}
	}
	
	System.out.println("the marks are");
	
	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
		for(int j = 0 ; j <= arr[i].length-1 ; j++)
		{ 
		System.out.print(arr[i][j]);
	}
		System.out.println();
	}
}
}
