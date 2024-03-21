package tasks.ifstatement;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int fac=1,num;
		
   		System.out.print("ENTER THE INT : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
	/*	for(int i=1;i<=num;i++)
		{
			fac *= i;
		}
		System.out.println("THE FACTORIAL OF  "+num +" IS "+fac); */
		
		int i=1;
		while(i<=num) {
			fac*=i;
			i++;
		}
		System.out.println(fac);
		
	}

}
