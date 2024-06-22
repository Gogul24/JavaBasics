package task;

public class FibSeries {
	
	public static void fib(int  num) {
		int a=0,b=1;
		int d = 0,temp=0;
		for(int i=1;i<=num;i++) {
			d = d+b;
			temp = a+b;
			a=b;
			b=temp;
			System.out.print(a+",");
		}
		System.out.println("\n"+"total : "+d);	
	}
	public static void main(String[] args) {
		int num = 5;
		fib(num);
	}
}
