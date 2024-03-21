package LinkedList2;

public class SLLPersonmain {

	public static void main(String[] args) {
		
		SingleLinkedListPerson sllperson = new SingleLinkedListPerson();
		sllperson.insert("Gokul");
		sllperson.insert("Ahm");
		sllperson.insert("Hm");
		sllperson.insert("secretary");
		sllperson.insert("chairman");
		sllperson.print();
		System.out.println("********************************");
		sllperson.delnode(3);
		sllperson.print();
		
	}
}
