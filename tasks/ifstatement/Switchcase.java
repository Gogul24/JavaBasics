package tasks.ifstatement;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		switch(a%2) {
		
		case 1:
			System.out.println(" ENTERED INT IS AN ODD");
			break;
			
		case 0:
			System.out.println("ENTERED INT IS EVEN");
			break;
				}
		
	}

}
