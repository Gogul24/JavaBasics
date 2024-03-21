package Stack;
public class LastinFirstoutStack {

		static LifoStack head=null;
		static LifoStack tail=null;
		int count =0;
		public void push(int num) {
			LifoStack numb = new LifoStack(num);
			if(head==null) {
				head = numb;
				tail=numb;
				count++;
			}
			else {
				tail.connectnext=numb;
				tail =numb;
				count++;
			}
		}
		
		public void pop() {
			LifoStack currentval = head;
			if(head == tail) {
				head=null;
				tail=null;
				count=0;
			}
			else {
			while(currentval != null) {
				if(currentval.connectnext == tail) {
					currentval.connectnext = null;
					tail = currentval;
					count--;
					break;
				}
				currentval = currentval.connectnext;	
				}
			}
		}
		
		public void print() {
			if(head != null) {
			LifoStack currentval =head;
			while(currentval !=null) {
				System.out.println(currentval.num);
				currentval = currentval.connectnext;
			}
			}
			System.out.println("*********************************");
			System.out.println("Size : "+count);
		}
}
