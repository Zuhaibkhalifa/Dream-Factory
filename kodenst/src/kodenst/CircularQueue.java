package kodenst;

import java.util.Scanner;

public class CircularQueue {
		private int q[] ;
		private int count =0;
		private int size ;
		private int f = 0 ;
		private int r = -1 ;
		private Scanner scan = new Scanner (System.in);

		public CircularQueue(int n) {
			q = new int[n];
			size = q.length;
		}
		
		public void insert() {
			int elem;
			if(count == size) {
				System.out.println("Queue is full");
			}
			else {
				System.out.println("Enter the element to insert");
				elem =scan.nextInt();
				r = (r+1)%size;
				q[r] = elem;
				count++;
			}
		}
		
		public void delete() {
			if(count == 0) {
				System.out.println("queue is empty");
			}
			else {
				System.out.println("deleted elem is"+q[r]);
				f = (f+1)%size;
				count--;
			}
		}
		
		public void display() {
			int f1 = f;
			if(count == 0) {
				System.out.println("queue is empty");
			}
			else {
				for (int i = 1 ; i <= count ; i++) {
					System.out.println(q[f1]+" ");
					f1 = (f1+1)%size;
				}
				System.out.println();
			}
		}
		
}
