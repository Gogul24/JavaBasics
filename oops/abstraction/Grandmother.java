package oops.abstraction;

public abstract class Grandmother {
	
	String name;
	void setName(String name) {
		this.name=name;
	}
	String getName(){
		return name;
	}
	abstract String getAge(String dob);
}
