package Arraylist;

import java.util.ArrayList;

public class ArrayOddEvenMain {

	public static void main(String[] args) {
		ArrayList<Integer>arrx=new ArrayList<Integer>();
		arrx.add(2);
		arrx.add(11);
		arrx.add(6);
		arrx.add(3);
		arrx.add(21);
		arrx.add(9);
		arrx.add(12);
		arrx.add(18);
		arrx.add(7);
		
		ArrayOddEvn a1 = new ArrayOddEvn();
		;
		System.out.println("****************************");
		a1.printodd(a1.Odd(arrx, true));
System.out.println();
		System.out.println("****************************");
		a1.printodd(a1.Odd(arrx, false));
	}

}
