package task;

import java.util.Scanner;

public class AutomorphicNumber {
	
	static boolean isAutomorphic(int n) {
		int sqr = n*n;
		String num =String.valueOf(n);
		String square = String.valueOf(sqr);
		return square.endsWith(num);
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(isAutomorphic(n)) {
			System.out.println("it is an automorphic number");
		}
		else {
			System.out.println("its is not an automorphic number");
		}
	}
}
