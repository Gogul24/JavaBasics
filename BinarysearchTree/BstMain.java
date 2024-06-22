package BinarysearchTree;

public class BstMain {

	public static void main(String[] args) {
		BSTlogic logic = new BSTlogic();
		
		logic.insert(21);
		logic.insert(10);
		logic.insert(14);
		logic.insert(22);
		logic.insert(30);
		logic.insert(23);
		logic.insert(19);
		logic.insert(28);
		logic.insert(20);
		logic.insert(10);
		logic.search(10);
		System.out.println();
		logic.delete(19);
		logic.search(19);
	}
}
