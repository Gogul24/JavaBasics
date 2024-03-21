package LinkedList2;

public class SingleLinkedListPerson {

		
		SingleLLperson head = null;
		SingleLLperson tail=null;
		public void insert(String name) {
			SingleLLperson person = new SingleLLperson(name);
			if(head==null) {
				head=person;
				tail=person;
			}
			else {
				tail.connectNext=person;
				tail=person;
			}
		}
		
		public void delnode(int pos) {
			SingleLLperson deletenode = head;

			int index = 0;
			while(deletenode !=null && index <pos) {
				deletenode = deletenode.connectNext;
				index++;
				deletenode.connectNext  = deletenode.connectNext.connectNext;
				break;
			}
		}
			
	
		public void print() {
			SingleLLperson currentperson=head;
			while(currentperson != null) {
				System.out.println(currentperson.name);
				currentperson = currentperson.connectNext;
			}
		}
}
