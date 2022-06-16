package kodenst;

import java.util.Scanner;

public class ndarray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int arr[][] = new int[3][4];
	
	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
		System.out.println("college : " + i);
		
	for(int j = 0 ; j <= arr[i].length-1 ; j++)
	{
		System.out.println("no.of Students :"+ j);
		arr[i][j]=scan.nextInt();
	}
	}
	
	System.out.println("students");
	
	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
		for(int j = 0 ; j <= arr[i].length-1 ; j++)
		{
			System.out.print(arr[i][j] + " ");
		}
		System.out.println("");
	}
}
}
