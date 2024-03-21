package CircularDoubleLinkedList;

public class DoubleLinkedListCircular {
	
		DCLLperson head=null;
		DCLLperson tail=null;
		
		public void insert(String name) {
			DCLLperson person = new DCLLperson(name);
			
			if(head==null) {
				person.connectNext=person;
				head= person;
				tail = person;
			}
			else {
				person.connectprev = tail;
				person.connectNext=head;
				tail.connectNext=person;
				tail=person;
			}
		}
		public void print() {
			DCLLperson currentPerson = tail;
			if(currentPerson!=null) {	
			do {
				System.out.println(currentPerson.name);
				currentPerson = currentPerson.connectprev;
			}while(currentPerson != tail && tail !=null && currentPerson !=null );
			}
			else {
				System.out.println("List Empty");
			}
		}
		
}
