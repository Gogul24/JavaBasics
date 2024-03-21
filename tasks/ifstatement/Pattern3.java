package tasks.ifstatement;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		//DIAMOND PATTERN
	int s=5;
	if(s%2!=0) {
		int x=(s/2);
		int y=(s/2);
		boolean isRev = true;
		
		for(int i=0;i<s;i++) {
			for(int j=0;j<s;j++) {
				if(x==j||y==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			if(x==0) {
				isRev = false;
			}
			if(isRev) {
				x--;
				y++;
			}
			else {
				x++;
				y--;
			}
			System.out.println("");
		}
	}
	else {
		System.out.println("enter odd num");
	}
}

}