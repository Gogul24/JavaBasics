package Arraylist;

import java.util.ArrayList;

public class ArrayListPersonObject {
	
		public static void main(String[] args) {
			ArrayList<Person> alPerson = new ArrayList<Person>();
			
			Person p1 = new Person("Gokul", "Male", 22);
			Person p2 = new Person("Ganesh", "Male", 23);
			Person p3 = new Person("Gopal", "Male", 24);
			
			
			alPerson.add(p1);
			alPerson.add(p2);
			alPerson.add(p3);
			alPerson.add(new Person("Ranjana","female",45));
			
			
			for(int i=0;i<alPerson.size();i++) {
				Person person = alPerson.get(i);
				System.out.println("***********************");
				System.out.println("name :"+person.getName());
				System.out.println("age :"+person.getAge());
				System.out.println("gender :"+person.getGender());
			}
			
		}
}
