package com.kodnest.java.string.replacearray;


	class Main
	{
	public static void main(String[] args) {
	String s = "Java";
	char a[] = s.toCharArray();
	int j = calc(4);
	for(int i=0;i<j;i++)
	{
	System.out.print(a[i]);
	}
	}
	static int calc(int a)
	{
	return a+1;
	}
	}

