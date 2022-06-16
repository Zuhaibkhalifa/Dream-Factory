package kodenst;

import java.util.Scanner;

public class assignemtnII {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("create the no.of branches");
	String arr[][][] = new String[scan.nextInt()][][];
	
	
	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
		System.out.println("Enter the no.of banks for " + i + " branches "+ "");
		arr[i] = new String[scan.nextInt()][];
		
		for(int j = 0 ; j <= arr[i].length-1 ; j++)
		{
			System.out.println("Enter the no.of cutomer names for "+ j + " banks" );
			arr[i][j] = new String[scan.nextInt()];
		}
	}

	System.out.println("Enter the branches and banks  of array");
	

	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
		for(int j = 0 ; j <= arr[i].length-1 ; j++)
		{
			for(int k = 0 ; k <= arr[i][j].length-1 ; k++)
			{
				System.out.println("Enter the names branches " + i + " for the bank " + j + " and customers"+k);
				arr[i][j][k]=scan.next();
			}
				
		}
	}


	System.out.println("Print the strings");

	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
		for(int j = 0 ; j <= arr[i].length-1 ; j++)
		{
			for(int k = 0 ; k <= arr[i][j].length-1 ; k++)
			{
				System.out.println(arr[i][j][k]+ " ");
			}
			System.out.println("");
				
		}
		System.out.println("");
	}

}
}
