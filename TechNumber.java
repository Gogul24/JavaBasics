package task;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int ans = (int) Math.pow(((n%100+n/100)),2);
		if(n==ans) {
			System.out.println("Its a tech number");
		}else {
			System.out.println("not a tech number");
		}	
	}
}