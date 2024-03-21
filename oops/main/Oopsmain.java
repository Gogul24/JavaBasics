package oops.main;

import oops.inheritance.Father;
import oops.inheritance.Son;

public class Oopsmain {

	public static void main(String[] args) {
		Son son = new Son("hello");
		Father father = new Father("gokul");
		System.out.println(father.getName());
		System.out.println(son.getAge());
		System.out.println(son.getName());
		
	}

}
