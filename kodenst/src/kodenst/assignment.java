package kodenst;

import java.util.Scanner;

public class assignment {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of teams");
	float arr[][] =new float[(int) scan.nextFloat()][];
	
	for (int i = 0 ; i <= arr.length-1 ; i++)
	{
		System.out.println("Enter the hieghts of the player from team  "+ i);
		arr[i] = new float[(int) scan.nextFloat()] ;
	}
	
	System.out.println("store the values into array ");
	
	for (int i = 0 ; i <= arr.length-1 ; i++)
	{		
		for(int j = 0 ; j <=arr[i].length-1 ; j++)
		{
			System.out.println("Enter hieghts of team  " + i);
			arr[i][j] = scan.nextFloat();
		}
	}
	
	System.out.println("display the heights");
	
	for (int i = 0 ; i <= arr.length-1 ; i++)
	{
		for(int j = 0 ; j <=arr[i].length-1 ; j++)
		{
			System.out.println(arr[i][j]+ " ");
		}
		System.out.println("");
	}
		
}
}
	
	
