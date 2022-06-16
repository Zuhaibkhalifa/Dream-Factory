package com.kodnest.java.string.replacearray;

import java.util.Scanner;

public class substringmain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array elements");
		String str = scan.nextLine();
		System.out.println("enter the substring");
		int index = scan.nextInt();
		substring sub = new substring() ; 
		String str1 = sub.substringg(str,index);
		System.out.println(str1);
		
		
		
		
		System.out.println("Enter the 2 array elements");
		scan.nextLine();
		String str11 = scan.nextLine();
		System.out.println("enter the substring");
		int startindex = scan.nextInt();
		int endindex = scan.nextInt();
		String stri2 = sub.substringg(str11, startindex, endindex);
		System.out.println(stri2);
	}

}
