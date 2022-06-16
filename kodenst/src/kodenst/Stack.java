package kodenst;

import java.util.Scanner;

public class Stack {
	private int s[];
	private int size ;
	private int top = -1;
	private Scanner scan = new Scanner(System.in);
	
	public Stack(int n) {
		
		s = new int[n];
		size=s.length;
	}
	
	public void push() {
		if(top == size-1) {
			System.out.println("Stack is full ");
		}
		else {
			System.out.println("Enter the element to push ");
			int elem = scan.nextInt();
			++top;
			s[top] = elem;
		}
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack is empty");
			System.out.println();
		}
		else {
			System.out.println("popped element is"+s[top]);
			--top;
		}
	}
	
	public void display() {
		if(top==-1) {
			System.out.println("ARRAY IS EMPTY");
			System.out.println();
		}
		else {
			for (int i = s[top]; i > 0 ; i-- ) {
				System.out.println(s[i]);
			}
		}
	}
}
