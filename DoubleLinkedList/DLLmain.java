package DoubleLinkedList;

public class DLLmain {

	public static void main(String[] args) {
		
		DoubleLinkedListPerson dll = new DoubleLinkedListPerson();
		dll.insert(6);
		dll.insert(4);
		dll.insert(9);
		dll.insert(7);
		dll.print();
		System.out.println("*******************");
		dll.printrev();
		System.out.println("*******************");
		dll.sorting();
		dll.print();
		
	}

}
