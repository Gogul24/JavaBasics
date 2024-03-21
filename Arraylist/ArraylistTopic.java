package Arraylist;

import java.util.ArrayList;

public class ArraylistTopic {

	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(12);
		al.add(34);
		al.add(19);
		al.add(29);
		print(al);
		System.out.println("_______________________________________");
		al.add(1,45);
		print(al);
		System.out.println("_______________________________________");
		al.remove(3);
		print(al);
		System.out.println("_______________________________________");
		al.clear();
		al.add(11);
		al.add(12);
		al.add(13);
		print(al);
		System.out.println("IS empty check : "+al.isEmpty());
		System.out.println("Array list size : "+al.size());
		System.out.println("Find index : "+al.indexOf(12));
		System.out.println("If contains : "+al.contains(12));
	}
	
	public static void print(ArrayList<Integer>al) {
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}
