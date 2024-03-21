package tasks.ifstatement;

import java.util.Scanner;

public class Ifstatements {

	public static void main(String[] args) {
		System.out.print("ENTER AN POSITIVE INTEGER  : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(!(a%2==0)) {
			System.out.println("ITS AN ODD NUMBER");
		}
		else {
			System.out.println("IS AN EVEN NUMBER");
		} 
		
		
	}

}
