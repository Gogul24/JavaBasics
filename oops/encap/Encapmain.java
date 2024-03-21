package oops.encap;

public class Encapmain {

	public static void main(String[] args) {
		Person person = new Person("Gokul", "B");
		
		person.setFirstName("GOKUL");
		person.setLastName("B");
		
		String name=person.getFirstName()+" "+person.getLastName();
		System.out.println(name);
	}

}
