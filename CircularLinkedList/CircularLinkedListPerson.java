package CircularLinkedList;

public class CircularLinkedListPerson {
	
	CllPerson head=null;
	CllPerson tail=null;
	
	public void insert(String name) {
		CllPerson person = new CllPerson(name);
		
		if(head==null) {
			person.connectNext=person;
			head=person;
			tail=person;
		}
		else {
			person.connectNext = head;
			tail.connectNext = person;
			tail=person;
		}
	}
		public void print() {
		CllPerson cll = head;
		if(cll !=null) {
		 do {
			System.out.println(cll.name);
			cll=cll.connectNext;
		  }while(cll != head );
		}
		else {
			System.out.println("list is empty");
		}
	}
}
