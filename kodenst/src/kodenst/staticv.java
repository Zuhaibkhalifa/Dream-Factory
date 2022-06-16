package kodenst;

import java.util.Scanner;

class staticv {
	private int p ;
	private int t ; 
	static private float r ;
	private float si ; 
	
	public void takeInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principle");
		p = scan.nextInt();
		System.out.println("Enter the Time");
		t = scan.nextInt(); 
	}
	static {
		r=2.0f;
	}
	void findSI() {
		si = (p*t*r)/100;
	}
	
	void display() {
		System.out.println("SI is :"+si);
	}

}
