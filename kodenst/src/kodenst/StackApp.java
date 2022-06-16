package kodenst;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Stack");
		int n = scan.nextInt();
		Stack s = new Stack(n);
		while(true) {
			System.out.println("PRESS 1 ----------> PUSH");
			System.out.println("PRESS 2 ----------> POP");
			System.out.println("PRESS 3 ----------> DISPLAY");
			System.out.println("");
			System.out.println("PRESS ANY OTHER TO EXIT");
			System.out.println("ENTER YOUR CHOICE");
			int choice = scan.nextInt();
			
		switch(choice) {
		case 1 : s.push();
		break;
		case 2 : s.pop();
		break;
		case 3 : s.display();
		break;
		
		default : System.exit(0);
		System.out.println("STOP");
		}
		}
	}

}
