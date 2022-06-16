package com.kodnest.java.string.replacearray;

import java.util.Scanner;

public class EmplyeeApp {
public static void main(String[] args) {
	Emplyee s1  = new Emplyee();
	Emplyee s2  = new Emplyee();
	Emplyee s3  = new Emplyee();
	Emplyee s4  = new Emplyee();
	
	s1.setEmpName("zuhaiB");
	s1.setEmpAge(23);
	s1.setEmpId(3988);
	
	s2.setEmpName("muqeet");
	s2.setEmpAge(22);
	s2.setEmpId(211);
	
	s3.setEmpName("Afrid");
	s3.setEmpAge(22);
	s3.setEmpId(2113);
	
	s4.setEmpName("huzi");
	s4.setEmpAge(22);
	s4.setEmpId(21315);
	
	Emplyee arr[] = new Emplyee[4];
	
	arr[0]=s1;
	arr[1]=s2;
	arr[2]=s3;
	arr[3]=s4;
	
	for (int i = 0 ; i <= arr.length-1 ; i++) {
		System.out.print(arr[i].getEmpName() + " " + arr[i].getEmpAge() + " " + arr[i].getEmpId() + " | ");
	}

 }
}
