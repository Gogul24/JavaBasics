package tasks.ifstatement;

import java.util.Scanner;

public class Fiboseries {

	public static void main(String[] args) {
		int num,a=0,b=1,c = 0,d=0,i=0;
   		System.out.print("ENTER THE Series : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int ans =floop(num);
	}	
		
	public static  int floop(int num) {
		int a=0,b=1,c = 0,d=0,i=0;
	
		for( i=0;i<=num;i++)
		{
			System.out.println(a);
			d=d+a;
			c=a+b;
			a=b;
			b=c;		
		}
		System.out.println(d);
		return d; 
		}
	
	public static int whileloop(int num) {
		int a=0,b=1,c = 0,d=0,i=0;
		
		while(i<=num) {
			System.out.println(a);
			d=d+a;
			c=a+b;
			a=b;
			b=c;
			i++;
		}
		System.out.println(d);
		return d;
	}
	
	public static int dowhileloop(int num) {
		int a=0,b=1,c = 0,d=0,i=0;
		do {
			System.out.println(a);
			d=d+a;
			c=a+b;
			a=b;
			b=c;
			i++;
		}while(i<=num);
		
		System.out.println(d);
		return d;
	}
	}

