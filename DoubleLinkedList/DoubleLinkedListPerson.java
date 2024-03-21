package DoubleLinkedList;

public class DoubleLinkedListPerson {

	DLLPerson head;
	DLLPerson tail;
	
	public void insert(int name) {
		DLLPerson person = new DLLPerson(name);
		if(head==null) {
			head = person;
			tail = person;
		}
		else {
			person.connectPrev=tail;
			tail.connectNext=person;
			tail=person;
		}
	}
	
	public void sorting() {
		DLLPerson current=null,index=null;
		int temp;
		
		for(current=head;current.connectNext!=null;current = current.connectNext) {
			for(index = current.connectNext;index!=null;index = index.connectNext) {
				if(current.name > index.name) {
					temp = current.name;
					current.name = index.name;
					index.name = temp;
				}
			}
		}
		
	}
		public void print() {
			DLLPerson currentPerson = head;
			while(currentPerson!=null) {
				System.out.println(currentPerson.name);
				currentPerson = currentPerson.connectNext;
			}
	}
		public void printrev() {
			DLLPerson currentPerson = tail;
			while(currentPerson!=null) {
				System.out.println(currentPerson.name);
				currentPerson = currentPerson.connectPrev;
			}
		}
}
