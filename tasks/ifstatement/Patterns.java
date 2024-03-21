package tasks.ifstatement;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		
		System.out.print("Enter string : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 ="";
	/*	
		for(int a=s1.length()-1;a>=0;a--) {
			s2=s2+s1.charAt(a);
		}
		*/
		
		// Diagonal pattern
		
		for(int i= 0;i<s1.length();i++) {
			for(int j=0;j<s1.length();j++) {
				if(i==j) {
					System.out.print(s1.charAt(i));
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

}
