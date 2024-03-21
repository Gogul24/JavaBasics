package oops.hierarchical;

public class Son extends Father implements Mother{

	public Son(String name) {
		super(name);
	}
	 
	public void mother(String name) {
		System.out.println("Mother");
	}
	
	void son(String name) {
		System.out.println("Son");
	}
}
