package polymorphism;

public class Arith {
	
	int a=0,b=0;
	String name;
	//constructor overloading
	public Arith(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public Arith(String name) {
		this.name=name;
		
	}
	//method overloading
	
	public int add(int a,int b) {
		return a+b;
	}

	public int add() {
		// TODO Auto-generated method stub
		return this.a+this.b;
	}
}
