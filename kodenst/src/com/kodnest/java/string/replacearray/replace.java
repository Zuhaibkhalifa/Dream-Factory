package com.kodnest.java.string.replacearray;

import java.util.Scanner;

public class replace {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the string");
		String Str= scan.nextLine();
		char arr1[]=Str.toCharArray();
		char arr2[]=new char[arr1.length];
		int j = arr2.length-1;
		for(int i = 0; i <= arr1.length-1 ; i++) {
			arr2[j] = arr1[i];
			j--;
		}
		Str =new String(arr2);
		System.out.println(Str);

	}

}
