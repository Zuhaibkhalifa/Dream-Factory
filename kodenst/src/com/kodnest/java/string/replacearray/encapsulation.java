package com.kodnest.java.string.replacearray;

public class encapsulation {
private int pageno;

public void setPageno(int x) {
	if(x  >  0) {
		pageno = x;	
	}
	else {
		System.out.println("invalid address");
	}
	
}
public int getpageno() {
	return pageno;
}
}
