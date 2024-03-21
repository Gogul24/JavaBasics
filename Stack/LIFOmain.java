package Stack;

public class LIFOmain {

	public static void main(String[] args) {
		
		LastinFirstoutStack lifo = new LastinFirstoutStack();
		lifo.push(2);
		lifo.push(4);
		lifo.push(5);
		lifo.push(7);
		lifo.pop();
		lifo.pop();
		lifo.pop();
		lifo.pop();
		lifo.pop();
		lifo.print();
	}
}
