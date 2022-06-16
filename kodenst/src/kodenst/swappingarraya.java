package kodenst;

import java.util.Scanner;

public class swappingarraya {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the array size");
	int arr[] =new int[ scan.nextInt()];
	for(int i = 0 ; i <= arr.length-1 ; i++)
	{
		System.out.println("enter the elements into array ");
		arr[i]=scan.nextInt();
	}
	
	
	
	int arr1[] = new int[arr.length];
	int j = arr1.length-1;
	for (int i = 0 ; i<= arr.length-1 ; i++)
	{
		arr1[j]=arr[i];
		j--;
	}

	for (int i = 0 ; i<= arr.length-1 ; i++)
	{ 
		System.out.print(arr[i]+" ");
	}
	System.out.println("");
	for (int i = 0 ; i<= arr.length-1 ; i++)
	{
		System.out.print(arr1[i]+" ");
	}
	System.out.println("");
	
	}

}
