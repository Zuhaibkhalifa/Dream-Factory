package kodenst;

import java.util.Scanner;

public class Arrayapp {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n = scan.nextInt();
	Array a = new Array(n);
	 
	while(true) {
		
		System.out.println("Press 1 for insert");
		System.out.println("Press 2 for delete");
		System.out.println("Press 3 for display");
		System.out.println("Any button to exit");
		System.out.println("Enter the choice ");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1 : a.insert();
				break;
		case 2 : a.delete();
				break;
		case 3 : a.display();
				break;
		
		default : System.exit(0);
		}
	}
	}

}
