package tasks.ifstatement;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE INPUT : ");
		String s=sc.next();
		String s1=s;
		String s2="";
		
		for(int i= s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		
		System.out.println(s2);
	if(s2.equals(s1)) {
		System.out.println("ITS A PALINDROME");
	}
	else {
		System.out.println("NOT A PALINDROME");
	}
}
}