package com.kodnest.java.string.replacearray;

 class findGCD {
	 int findG(int n,int m) {
		int rem;
		while ( n != 0) {
			rem = m % n ;
			m = n ;
			n = rem; 
		}
		int gcd = m;
		return gcd; 

}

 }

	
