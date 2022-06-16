package kodenst;

import java.util.Scanner;

public class QueueApp {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Queue");
		int n = scan.nextInt();
		Queue q = new Queue(n);
		while(true) {
			System.out.println("PRESS 1 ----------> insert");
			System.out.println("PRESS 2 ----------> delete");
			System.out.println("PRESS 3 ----------> display");
			System.out.println("");
			System.out.println("PRESS ANY OTHER TO EXIT");
			System.out.println("ENTER YOUR CHOICE");
			int choice = scan.nextInt();
			
		switch(choice) {
		case 1 : q.insert();
		break;
		case 2 : q.delete();;
		break;
		case 3 : q.display();
		break;
		
		default : System.exit(0);
		System.out.println("STOP");
		}
		
	}
}
}
