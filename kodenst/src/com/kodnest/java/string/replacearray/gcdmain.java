package com.kodnest.java.string.replacearray;

import java.util.Scanner;

public class gcdmain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a =scan.nextInt();
		int b=scan.nextInt();
		findGCD eu = new findGCD();
		int res = eu.findG(a, b);
		System.out.println("GCD of " + a + " and "+ b + " are "+ res);
	}

}
