package kodenst;

import java.util.Scanner;

public class Queue {
	private int f = 0 ;
	private int r = -1 ;
	private int size ;
	private int q[] ;
	private Scanner scan = new Scanner(System.in);
	
	public Queue(int n ) {
		q = new int[n];
		size = q.length;
	}
	
	public void insert() {
		if(r == size-1) {
			System.out.println("QUEUE is full");
		}
		else {
			System.out.println("Enter the element to insert");
			int elem = scan.nextInt();
			++r;
			q[r] = elem;
		}
	}
	public void delete() {
		if(r == -1 || f > r) {
			System.out.println("QUEUE is Empty");
		}
		else {
			System.out.println("The deleted item is "+q[f]);
			f++;
		}
	}
	
	public void display() {
		if (r == -1 || f > r) {
			System.out.println("QUEUE is empty");
		}
		else {
			for(int i = f ; i <= r ; i++) {
				System.out.println(q[i]);
			}
			System.out.println();
		}
	}

}
