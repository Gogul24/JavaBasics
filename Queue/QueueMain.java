package Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		QueueLogic q1= new QueueLogic();
		q1.enqueue(2);
		q1.enqueue(9);
		q1.enqueue(3);
		q1.enqueue(5);
		q1.print();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.print();

	}

}
