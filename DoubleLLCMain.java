package task;

public class DoubleLLCMain {

	public static void main(String[] args) {
		DoubleCLLlogic clLlogic = new DoubleCLLlogic();
		
		clLlogic.insert(10);
		clLlogic.insert(11);
		clLlogic.insert(12);
		clLlogic.insert(13);
		clLlogic.insert(14);
		clLlogic.insert(15);
		clLlogic.print();
		System.out.println("after deletion");
		clLlogic.delete(12);
		clLlogic.print();
	}

}
