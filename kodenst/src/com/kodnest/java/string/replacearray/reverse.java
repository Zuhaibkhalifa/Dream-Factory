package com.kodnest.java.string.replacearray;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String Str = scan.nextLine();
		char arr1[] =Str.toCharArray();
		char arr2[] = new char[arr1.length];
		
		for(int i = 0 ; i <= arr1.length-1; i++) {
			if(arr1[i] ==' ') {
				arr2[i]=arr1[i];
			}
		}
		
		int j = arr2.length-1;
		
		for(int i  =0 ; i <= arr1.length-1 ; i++) {
			if(arr1[i]!=' ') {
				if(arr2[i]==' ') {
					j--;
				}
				arr2[j]=arr1[i];
				j--;
			}
		}
		Str = new String(arr2);
		System.out.println(Str);
	}

}
