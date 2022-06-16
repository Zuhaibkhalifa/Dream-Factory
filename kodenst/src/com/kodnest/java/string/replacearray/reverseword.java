package com.kodnest.java.string.replacearray;

import java.util.Scanner;

public class reverseword {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String");
	String sent = scan.nextLine();
	String revarr[] = sent.split(" ");
	String revsent = "";
	for(int i = 0 ; i <= revarr.length-1 ; i++) {
		String word = revarr[i];
		String revword = "";
		for(int j =word.length()-1 ; j >= 0 ; j--) {
			revword = revword + word.charAt(j);
		}
		revsent = revsent + revword +" ";
	}
	System.out.println(revsent);
}
}
