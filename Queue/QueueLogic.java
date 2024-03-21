package Queue;

import java.util.Queue;

public class QueueLogic {
	QueueNode head =null;
	QueueNode tail = null;
	int count =0;
	
	public void enqueue(int value) {
		QueueNode current = new QueueNode(value);
		if(head == null) {
			head=current;
			tail=current;
			count++;
		}
		else {
			tail.next = current;
			tail = current;
			count++;
		}
	}
	
	public void dequeue() {
		if(head != null) {
			head = head.next;
			count--;
		}
	}
	
	public void print() {
		QueueNode current = head;
		if(head != null) {
			while(current != null) {
				System.out.println(current.value);
				current= current.next;
			}
		}
		System.out.println("Size :"+count);
	}
}
