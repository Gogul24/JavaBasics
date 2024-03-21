package polymorphism;

public class Polymain {
	
	public static void main(String[] args) {
		Arith arith=new Arith(33,66);
		Arith arith1=new Arith("GOKUL");
		
		System.out.println(arith.add());
		System.out.println(arith.add(100,100));
	}
}
