package task;

public class DoubleCLLlogic {

	DoubleLLNode head=null,tail = null;
	
	public void insert(int num) {
		DoubleLLNode value = new DoubleLLNode(num);
		
		if(head==null) {
			value.next=value;
			head=value;
			tail=value;
		}
		else {
			value.prev = tail;
			value.next=head;
			tail.next=value;
			tail=value;
		}
	}
	
	public void delete(int num) {
		 if (head == null)
	            return;
		 
	        DoubleLLNode currNode = head;
	        DoubleLLNode prevNode = null;
	        if (currNode.num == num && currNode.next == head) {
	            head = null;
	            return;
	        }
	        do {
	            prevNode = currNode;
	            currNode = currNode.next;
	            if (currNode.num == num) {
	                prevNode.next = currNode.next;
	                break;
	            }
	        } while (currNode != head);
	        
	        if (currNode == head)
	           return;
	}
	
	public void print() {
		DoubleLLNode currentValue=head;
		if(currentValue!=null) {	
			do {
				System.out.println(currentValue.num);
				currentValue = currentValue.next;
			}while(currentValue != head && head !=null && currentValue !=null );
			}
			else {
				System.out.println("List Empty");
			}
	}
	
}
