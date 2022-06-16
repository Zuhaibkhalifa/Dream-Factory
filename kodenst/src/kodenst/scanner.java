package kodenst;

import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in) ;
//				System.out.println("enter a number");
//				float a = scan.nextFloat();
//				System.out.println("entered number is :"+a);
		
		for(int i = 1 ; i <= 5 ; i++) 
		{
			for(int j = 1 ; j <= i ; j++)
			{
				System.out.print("_");
				
			}
			for(int k = 1 ; k <= i ; k++)
			{
				System.out.print("$");	
			}
			System.out.println("");
		}
		
	}
	
}
