package com.kodnest.java.string.replacearray;

import java.util.Scanner;

public class assignmentt {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the String");
	String str = scan.nextLine();
	String strarr[] = str.split(" ");
	String revsent = "";
	for(int i = 0 ; i <= strarr.length-1 ; i++) {
		String revword = strarr[i];
		revsent = revsent + revword + "$" ;
		}
	System.out.println(revsent);
}
}
