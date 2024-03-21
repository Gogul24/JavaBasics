package oops.inheritance;

public class Son extends Father {
	int age =22;
	public Son(String name) {
		super(name);
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}

}
